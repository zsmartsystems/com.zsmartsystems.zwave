package com.zsmartsystems.zwave;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zsmartsystems.zwave.transaction.ZWaveCommandClassTransactionPayload;
import com.zsmartsystems.zwave.transaction.ZWaveTransactionManager;
import com.zsmartsystems.zwave.transaction.ZWaveTransactionResponse;

public class ZWaveNetwork {
    private static final Logger logger = LoggerFactory.getLogger(ZWaveNetwork.class);

    /**
     * If true defines that we are the master controller in the network. In this case the framework
     * will automatically configure some device configuration to provide reports.
     */
    private boolean masterController;

    /**
     * Defines the generic network security key
     */
    private int[] networkSecurityKey;

    /**
     * 
     */
    private ZWaveTransactionManager transactionManager;

    /**
     * 
     */
    private final Map<Integer, ZWaveNode> zwaveNodes = new HashMap<Integer, ZWaveNode>();

    /**
     * Get a {@link ZWaveNode} given the node ID. Returns null if the node can not be found.
     * 
     * @param nodeId the ZWave node
     * @return the {@link ZWaveNode} or null if the node can not be found.
     */
    public ZWaveNode getNode(int nodeId) {
        return null;
    }

    /**
     * Queues a message for sending on the send queue.
     * This does not wait for a response.
     *
     * @param transaction
     *            the {@link ZWaveMessagePayloadTransaction} message to enqueue.
     */
    public void enqueue(ZWaveCommandClassTransactionPayload transaction) {
        // Sanity check!
        if (transaction == null) {
            logger.debug("Attempt to queue null message");
            return;
        }

        // Since this method doesn't wait for a response, we tell the transaction handler not to wait for DATA
        if (transaction instanceof ZWaveCommandClassTransactionPayload) {
            transaction.setRequiresResponse(false);
        }

        // transactionManager.queueTransactionForSend(transaction);
    }

    /**
     * Queues a message for sending on the nonce send queue.
     * This does not wait for a response.
     *
     * @param transaction
     *            the {@link ZWaveMessagePayloadTransaction} message to enqueue.
     */
    public void enqueueNonce(ZWaveCommandClassTransactionPayload transaction) {
        // Sanity check!
        if (transaction == null) {
            logger.debug("Attempt to queue null message");
            return;
        }

        transactionManager.queueNonceReportForSend(transaction);
    }

    /**
     * Queues a message for sending and returns the response once received.
     *
     * @param transaction
     *            the {@link ZWaveMessagePayloadTransaction} message to enqueue.
     */
    public ZWaveTransactionResponse sendTransaction(ZWaveCommandClassTransactionPayload transaction) {
        return transactionManager.sendTransaction(transaction);
    }

    /**
     * Returns the size of the send queue for a specific node.
     */
    public int getSendQueueLength(int nodeId) {
        return transactionManager.getSendQueueLength(nodeId);
    }

}
