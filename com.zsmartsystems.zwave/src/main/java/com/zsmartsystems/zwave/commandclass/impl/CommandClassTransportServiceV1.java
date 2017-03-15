/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_TRANSPORT_SERVICE</b> version <b>1</b>.<br>
 *
 * Command Class Transport Service<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassTransportServiceV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassTransportServiceV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_TRANSPORT_SERVICE
     */
    public final static int COMMAND_CLASS_KEY = 0x55;

    /**
     * First Fragment Command Constant
     */
    public final static int COMMAND_FIRST_FRAGMENT = 0xC0;
    /**
     * Subsequent Fragment Command Constant
     */
    public final static int COMMAND_SUBSEQUENT_FRAGMENT = 0xE0;

    /**
     * Creates a new message with the COMMAND_FIRST_FRAGMENT command.<br>
     *
     * First Fragment<br>
     *
     *
     * @param datagramSize1 {@link Integer}
     * @param datagramSize2 {@link Integer}
     * @param sequenceNo {@link Integer}
     * @param payload {@link byte[]}
     * @param checksum {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getCommandFirstFragment(Integer datagramSize1, Integer datagramSize2, Integer sequenceNo,
            byte[] payload, Integer checksum) {
        logger.debug("Creating command message COMMAND_FIRST_FRAGMENT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(COMMAND_FIRST_FRAGMENT);

        // Process 'Properties1'
        outputData.write(datagramSize1 & 0x07);

        // Process 'datagram_size_2'
        outputData.write(datagramSize2);

        // Process 'Properties2'
        outputData.write(sequenceNo & 0x0F);

        // Process 'Payload'
        try {
            outputData.write(payload);
        } catch (IOException e) {
        }

        // Process 'Checksum'
        outputData.write((checksum >> 8) & 0xff);
        outputData.write(checksum & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the COMMAND_FIRST_FRAGMENT command<br>
     *
     * First Fragment<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>DATAGRAM_SIZE_1 {@link Integer}
     * <li>DATAGRAM_SIZE_2 {@link Integer}
     * <li>SEQUENCE_NO {@link Integer}
     * <li>PAYLOAD {@link byte[]}
     * <li>CHECKSUM {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleCommandFirstFragment(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Properties1'
        response.put("DATAGRAM_SIZE_1", Integer.valueOf(payload[msgOffset] & 0x07));
        msgOffset += 1;

        // Process 'datagram_size_2'
        response.put("DATAGRAM_SIZE_2", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties2'
        response.put("SEQUENCE_NO", Integer.valueOf(payload[msgOffset] & 0x0F));
        msgOffset += 1;

        // Process 'Payload'
        ByteArrayOutputStream valPayload = new ByteArrayOutputStream();
        while (msgOffset < payload.length - 2) {
            valPayload.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("PAYLOAD", valPayload);

        // Process 'Checksum'
        response.put("CHECKSUM", Integer.valueOf(payload[msgOffset] << 8 + payload[msgOffset + 12]));
        msgOffset += 2;

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the COMMAND_SUBSEQUENT_FRAGMENT command.<br>
     *
     * Subsequent Fragment<br>
     *
     *
     * @param datagramSize1 {@link Integer}
     * @param datagramSize2 {@link Integer}
     * @param datagramOffset1 {@link Integer}
     * @param sequenceNo {@link Integer}
     * @param datagramOffset2 {@link Integer}
     * @param payload {@link byte[]}
     * @param checksum {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getCommandSubsequentFragment(Integer datagramSize1, Integer datagramSize2,
            Integer datagramOffset1, Integer sequenceNo, Integer datagramOffset2, byte[] payload, Integer checksum) {
        logger.debug("Creating command message COMMAND_SUBSEQUENT_FRAGMENT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(COMMAND_SUBSEQUENT_FRAGMENT);

        // Process 'Properties1'
        outputData.write(datagramSize1 & 0x07);

        // Process 'datagram_size_2'
        outputData.write(datagramSize2);

        // Process 'Properties2'
        int valProperties2 = 0;
        valProperties2 |= datagramOffset1 & 0x07;
        valProperties2 |= ((sequenceNo << 3) & 0x78);
        outputData.write(valProperties2);

        // Process 'datagram_offset_2'
        outputData.write(datagramOffset2);

        // Process 'Payload'
        try {
            outputData.write(payload);
        } catch (IOException e) {
        }

        // Process 'Checksum'
        outputData.write((checksum >> 8) & 0xff);
        outputData.write(checksum & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the COMMAND_SUBSEQUENT_FRAGMENT command<br>
     *
     * Subsequent Fragment<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>DATAGRAM_SIZE_1 {@link Integer}
     * <li>DATAGRAM_SIZE_2 {@link Integer}
     * <li>DATAGRAM_OFFSET_1 {@link Integer}
     * <li>SEQUENCE_NO {@link Integer}
     * <li>DATAGRAM_OFFSET_2 {@link Integer}
     * <li>PAYLOAD {@link byte[]}
     * <li>CHECKSUM {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleCommandSubsequentFragment(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Properties1'
        response.put("DATAGRAM_SIZE_1", Integer.valueOf(payload[msgOffset] & 0x07));
        msgOffset += 1;

        // Process 'datagram_size_2'
        response.put("DATAGRAM_SIZE_2", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties2'
        response.put("DATAGRAM_OFFSET_1", Integer.valueOf(payload[msgOffset] & 0x07));
        response.put("SEQUENCE_NO", Integer.valueOf((payload[msgOffset] & 0x78 >> 3)));
        msgOffset += 1;

        // Process 'datagram_offset_2'
        response.put("DATAGRAM_OFFSET_2", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Payload'
        ByteArrayOutputStream valPayload = new ByteArrayOutputStream();
        while (msgOffset < payload.length - 2) {
            valPayload.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("PAYLOAD", valPayload);

        // Process 'Checksum'
        response.put("CHECKSUM", Integer.valueOf(payload[msgOffset] << 8 + payload[msgOffset + 12]));
        msgOffset += 2;

        // Return the map of processed response data;
        return response;
    }

}
