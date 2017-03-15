package com.zsmartsystems.zwave;

import java.util.Arrays;

/**
 * The {@link ZWaveCommandClassPayload} implements an encapsulated command class payload.
 *
 * @author Chris Jackson - Initial implementation
 *
 */
public class ZWaveCommandClassPayload {
    protected final byte[] payload;

    public ZWaveCommandClassPayload(final byte[] payload) {
        this.payload = payload;
    }

    public ZWaveCommandClassPayload(final ZWaveCommandClassPayload initialPayload, final int start) {
        payload = Arrays.copyOfRange(initialPayload.getPayloadBuffer(), start, initialPayload.getPayloadLength());
    }

    public ZWaveCommandClassPayload(final ZWaveCommandClassPayload initialPayload, final int start, final int end) {
        payload = Arrays.copyOfRange(initialPayload.getPayloadBuffer(), start, end);
    }

    public int getCommandClassId() {
        return payload[0] & 0xFF;
    }

    public int getCommandClassCommand() {
        if (payload.length >= 2) {
            return payload[1] & 0xFF;
        }
        return -1;
    }

    public int getPayloadByte(int offset) {
        return payload[offset] & 0xFF;
    }

    public int getPayloadLength() {
        return payload.length;
    }

    public byte[] getPayloadBuffer() {
        return payload;
    }

    public byte[] getPayloadBuffer(int start, int end) {
        return Arrays.copyOfRange(payload, start, end);
    }
}
