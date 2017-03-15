package com.zsmartsystems.zwave.transaction;

/**
 * 
 * @author Chris Jackson
 *
 */
public class ZWaveSecureTransaction extends ZWaveTransaction {
    private ZWaveTransaction linkedTransaction;

    public ZWaveSecureTransaction(ZWaveTransaction transaction, ZWaveCommandClassTransactionPayload payload) {
        super(payload);

        linkedTransaction = transaction;
    }

    public void setLinkedTransaction(ZWaveTransaction transaction) {
        linkedTransaction = transaction;
    }

    public ZWaveTransaction getLinkedTransaction() {
        return linkedTransaction;
    }
}
