package com.zsmartsystems.zwave.transaction;

import com.zsmartsystems.zwave.ZWaveCommandClassPayload;
import com.zsmartsystems.zwave.commandclass.ZWaveCommandClassEnum;

/**
 *
 * @author Chris Jackson - Initial Contribution
 *
 */
public class ZWaveCommandClassTransactionPayload extends ZWaveCommandClassPayload {
    private final int nodeId;
    private final ZWaveCommandClassEnum expectedResponseCommandClass;
    private final Integer expectedResponseCommandClassCommand;
    private TransactionPriority priority;
    private int maxAttempts = 0;

    private boolean requiresSecurity = false;
    private boolean requiresResponse = true;

    /**
     *
     * @param nodeId
     * @param payload
     * @param priority
     * @param expectedResponseCommandClass
     * @param expectedResponseCommandClassCommand
     */
    public ZWaveCommandClassTransactionPayload(int nodeId, byte[] payload, TransactionPriority priority,
            ZWaveCommandClassEnum expectedResponseCommandClass, Integer expectedResponseCommandClassCommand) {
        super(payload);
        this.nodeId = nodeId;
        this.priority = priority;
        this.expectedResponseCommandClass = expectedResponseCommandClass;
        this.expectedResponseCommandClassCommand = expectedResponseCommandClassCommand;
    }

    public int getNodeId() {
        return nodeId;
    }

    public ZWaveCommandClassEnum getExpectedResponseCommandClass() {
        // logger.debug("At getExpectedResponseCommandClass {}", expectedResponseCommandClass);
        if (expectedResponseCommandClass != null) {
            return expectedResponseCommandClass;
        }
        return expectedResponseCommandClass;
    }

    public Integer getExpectedResponseCommandClassCommand() {
        return expectedResponseCommandClassCommand;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void setPriority(TransactionPriority priority) {
        this.priority = priority;
    }

    public TransactionPriority getPriority() {
        return priority;
    }

    public int getDestinationNode() {
        return nodeId;
    }

    public int getTimeout() {
        return 5000;
    }

    public boolean requiresData() {
        return false;
    }

    public void setRequiresSecurity() {
        requiresSecurity = true;
    }

    public boolean getRequiresSecurity() {
        return requiresSecurity;
    }

    public void setRequiresResponse(boolean requiresResponse) {
        this.requiresResponse = requiresResponse;
    }

    public boolean getRequiresResponse() {
        return requiresResponse;
    }
}
