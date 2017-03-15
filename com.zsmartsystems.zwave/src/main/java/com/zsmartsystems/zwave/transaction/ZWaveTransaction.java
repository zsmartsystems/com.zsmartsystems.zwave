package com.zsmartsystems.zwave.transaction;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zsmartsystems.zwave.ZWaveCommandClassPayload;
import com.zsmartsystems.zwave.commandclass.ZWaveCommandClassEnum;

/**
 * This class handles transaction tracking for ZWave.
 *
 * @author Chris Jackson - Initial Contribution
 *
 */
public class ZWaveTransaction {
    private static final Logger logger = LoggerFactory.getLogger(ZWaveTransaction.class);

    private final static AtomicLong sequence = new AtomicLong();
    private final long transactionId = sequence.getAndIncrement();
    private boolean waitForResponse = true;

    private int DEFAULT_TIMEOUT = 5000;

    private ZWaveCommandClassTransactionPayload payload;

    /**
     * Transaction state tracking is handled by working through the different stages of
     * a transaction and handling the transaction stages and completion checking.
     *
     * Transaction states are as follows -:
     * UNINITIALIZED: The transaction has not yet started.
     * SENT: The message has been sent, but no acknowledgements are received.
     * RECEIVED_ACK_CONTROLLER: An ACK has been received from the controller.
     * RECEIVED_ACK_NODE: An ACK has been received from the node. This indicates that the node has received the message.
     * RECEIVED_DATA: The final data has been received.
     * CANCELLED: The transaction is cancelled due to a response error
     *
     * A transaction requires at least the first ACK from the controller. For transactions requiring additional
     * responses, once the ACK from the controller is received, additional transactions may be started if desired.
     *
     */
    public enum TransactionState {
        UNINTIALIZED,
        WAIT_RESPONSE,
        WAIT_REQUEST,
        WAIT_DATA,
        DONE,
        ABORTED,
        CANCELLED
    }

    private TransactionPriority priority;
    private long dataTimeout;

    private TransactionState transactionStateCancelled = TransactionState.UNINTIALIZED;
    private TransactionState transactionStateTracker = TransactionState.UNINTIALIZED;

    private int attemptsRemaining = 3;

    private boolean requiresSecurity = false;
    private boolean requiresResponse = true;

    private long startTime;
    private Date timeout;

    public ZWaveTransaction(final ZWaveCommandClassTransactionPayload payload) {
        this.priority = payload.getPriority();
        this.dataTimeout = payload.getTimeout();
        if (this.dataTimeout < 250) {
            this.dataTimeout = DEFAULT_TIMEOUT;
        }
        this.attemptsRemaining = payload.getMaxAttempts();
        if (this.attemptsRemaining == 0) {
            this.attemptsRemaining = 3;
        }
        if (payload instanceof ZWaveCommandClassTransactionPayload) {
            this.requiresSecurity = payload.getRequiresSecurity();
            this.requiresResponse = payload.getRequiresResponse();
        }
        this.payload = payload;
    }

    public void setPayload(ZWaveCommandClassTransactionPayload payload) {
        this.payload = payload;
    }

    public void resetTransaction() {
        logger.debug("Transaction RESET with {} retries remaining.", attemptsRemaining);
        transactionStateTracker = TransactionState.UNINTIALIZED;
    }

    public void transactionStart() {
        startTime = System.currentTimeMillis();

        // logger.debug("transactionStart type {} ", payload.getSerialMessageClass());

        // We must have just sent the message
        // if (payload.getSerialMessageClass().requiresResponse()) {
        // transactionStateTracker = TransactionState.WAIT_RESPONSE;
        // return;
        // }
        // if (payload.getSerialMessageClass().requiresRequest()) {
        // transactionStateTracker = TransactionState.WAIT_REQUEST;
        // return;
        // }

        // If we get here, we don't require any response, so we're done!
        transactionStateTracker = TransactionState.DONE;
    }

    public byte[] getPayloadBuffer() {
        return payload.getPayloadBuffer();
    }

    public int getNodeId() {
        return payload.getDestinationNode();
    }

    public int getQueueId() {
        // if (payload.getSerialMessageClass() == SerialMessageClass.SendData) {
        // return 255;
        // }
        return payload.getDestinationNode();
    }

    public ZWaveCommandClassEnum getExpectedCommandClass() {
        // logger.debug("Transaction type is {}", payload.getClass().getSimpleName());
        if (payload instanceof ZWaveCommandClassTransactionPayload) {
            // logger.debug("Transaction expected response is {}",
            // ((ZWaveCommandClassTransactionPayload) payload).getExpectedResponseCommandClass());
            return payload.getExpectedResponseCommandClass();
        }
        return null;
    }

    public Integer getExpectedCommandClassCommand() {
        if (payload instanceof ZWaveCommandClassTransactionPayload) {
            return payload.getExpectedResponseCommandClassCommand();
        }
        return null;
    }

    public TransactionState getTransactionState() {
        return transactionStateTracker;
    }

    public TransactionState getTransactionCancelledState() {
        return transactionStateCancelled;
    }

    public void setPriority(TransactionPriority priority) {
        this.priority = priority;
    }

    public TransactionPriority getPriority() {
        return priority;
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - startTime;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTransactionCanceled() {
        logger.debug("Transaction {} CANCELLED", transactionId);
        transactionStateCancelled = transactionStateTracker;
        transactionStateTracker = TransactionState.CANCELLED;
    }

    public void setTransactionAborted() {
        logger.debug("Transaction {} ABORTED", transactionId);
        transactionStateTracker = TransactionState.ABORTED;
    }

    public void setTransactionComplete() {
        // If we're waiting for data, then don't complete the transaction
        // if (payload.getExpectedResponseSerialMessageClass() != null) {
        // return;
        // }

        logger.debug("Transaction {} COMPLETED", transactionId);
        transactionStateTracker = TransactionState.DONE;
    }

    public void setAttemptsRemaining(int attemptsRemaining) {
        this.attemptsRemaining = attemptsRemaining;
    }

    public int getAttemptsRemaining() {
        return attemptsRemaining;
    }

    public int decrementAttemptsRemaining() {
        return --attemptsRemaining;
    }

    public boolean requiresDataBeforeNextRelease() {
        return payload.requiresData();
    }

    public long getDataTimeout() {
        return dataTimeout;
    }

    public boolean transactionAdvance(ZWaveCommandClassPayload incomingMessage) {
        logger.debug("TransactionAdvance ST: {}", transactionStateTracker);
        // logger.debug("TransactionAdvance TX: {}", serialMessageDebug);
        // logger.debug("TransactionAdvance WT: {}", payload.getExpectedResponseSerialMessageClass());
        logger.debug("TransactionAdvance RX: {}", incomingMessage);

        TransactionState stateTrackerStart = transactionStateTracker;
        switch (transactionStateTracker) {
            case UNINTIALIZED:
                break;

            case WAIT_DATA:
                // if (incomingMessage.getMessageClass() != payload.getExpectedResponseSerialMessageClass()
                // || incomingMessage.getMessageType() != SerialMessageType.Request) {
                // break;
                // }

                // Check if the nodeId is correct
                // if (incomingMessage.getMessageType() == SerialMessageType.Request && payload.getDestinationNode() !=
                // 255
                // && payload.getDestinationNode() != incomingMessage.getMessageNode()) {
                // break;
                // }

                // We've received the data we wanted - we're done
                transactionStateTracker = TransactionState.DONE;
                break;

            case ABORTED:
                break;

            case CANCELLED:
                // Transaction has been aborted - just return this to the application
                break;

            case DONE:
                break;

            default:
                logger.error("Unhandled transaction state {}", transactionStateTracker);
                break;
        }
        logger.debug("TransactionAdvance TO: {}", transactionStateTracker);
        return transactionStateTracker != stateTrackerStart;
    }

    public boolean getRequiresSecurity() {
        return requiresSecurity;
    }

    public boolean getRequiresResponse() {
        return requiresResponse;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setWaitForResponse(boolean waitForResponse) {
        this.waitForResponse = false;
    }

    public boolean getWaitForResponse() {
        return waitForResponse;
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == null) {
            return false;
        }

        ZWaveTransaction other = (ZWaveTransaction) arg0;

        if (arg0.getClass() != this.getClass()) {
            return false;
        }

        // if (getExpectedReplyClass() != other.getExpectedReplyClass()) {
        // return false;
        // }

        if (getNodeId() != other.getNodeId()) {
            logger.debug(">>>>> transaction node Id is different");
            return false;
        }

        // if (payload.getSerialMessageClass() != other.getSerialMessageClass()) {
        // return false;
        // }

        if (Arrays.equals(payload.getPayloadBuffer(), other.getPayloadBuffer())) {
            logger.debug(">>>>> transaction payload is the same [{}] == [{}]", payload.getPayloadBuffer(),
                    other.getPayloadBuffer());
            return true;
        } else {
            logger.debug(">>>>> transaction payload is NOT the same");
        }

        return false;
    }

    @Override
    public String toString() {
        return "TID:" + transactionId + " [" + transactionStateTracker + "]";
    }
}
