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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_ZIP_6LOWPAN</b> version <b>1</b>.<br>
 *
 * Command Class Z/IP 6lowpan<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassZip6lowpanV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassZip6lowpanV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_ZIP_6LOWPAN
     */
    public final static int COMMAND_CLASS_KEY = 0x4F;

    /**
     * Lowpan First Fragment Command Constant
     */
    public final static int LOWPAN_FIRST_FRAGMENT = 0xC0;
    /**
     * Lowpan Subsequent Fragment Command Constant
     */
    public final static int LOWPAN_SUBSEQUENT_FRAGMENT = 0xE0;

    /**
     * Creates a new message with the LOWPAN_FIRST_FRAGMENT command.<br>
     *
     * Lowpan First Fragment<br>
     *
     *
     * @param datagramSize1 {@link Integer}
     * @param datagramSize2 {@link Integer}
     * @param datagramTag {@link Integer}
     * @param payload {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getLowpanFirstFragment(Integer datagramSize1, Integer datagramSize2, Integer datagramTag,
            byte[] payload) {
        logger.debug("Creating command message LOWPAN_FIRST_FRAGMENT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(LOWPAN_FIRST_FRAGMENT);

        // Process 'Properties1'
        outputData.write(datagramSize1 & 0x07);

        // Process 'Datagram Size 2'
        outputData.write(datagramSize2);

        // Process 'Datagram Tag'
        outputData.write(datagramTag);

        // Process 'Payload'
        try {
            outputData.write(payload);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the LOWPAN_FIRST_FRAGMENT command<br>
     *
     * Lowpan First Fragment<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>DATAGRAM_SIZE_1 {@link Integer}
     * <li>DATAGRAM_SIZE_2 {@link Integer}
     * <li>DATAGRAM_TAG {@link Integer}
     * <li>PAYLOAD {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleLowpanFirstFragment(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Properties1'
        response.put("DATAGRAM_SIZE_1", Integer.valueOf(payload[msgOffset] & 0x07));
        msgOffset += 1;

        // Process 'Datagram Size 2'
        response.put("DATAGRAM_SIZE_2", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Datagram Tag'
        response.put("DATAGRAM_TAG", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Payload'
        ByteArrayOutputStream valPayload = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valPayload.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("PAYLOAD", valPayload);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the LOWPAN_SUBSEQUENT_FRAGMENT command.<br>
     *
     * Lowpan Subsequent Fragment<br>
     *
     *
     * @param datagramSize1 {@link Integer}
     * @param datagramSize2 {@link Integer}
     * @param datagramTag {@link Integer}
     * @param datagramOffset {@link Integer}
     * @param payload {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getLowpanSubsequentFragment(Integer datagramSize1, Integer datagramSize2, Integer datagramTag,
            Integer datagramOffset, byte[] payload) {
        logger.debug("Creating command message LOWPAN_SUBSEQUENT_FRAGMENT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(LOWPAN_SUBSEQUENT_FRAGMENT);

        // Process 'Properties1'
        outputData.write(datagramSize1 & 0x07);

        // Process 'Datagram Size 2'
        outputData.write(datagramSize2);

        // Process 'Datagram Tag'
        outputData.write(datagramTag);

        // Process 'Datagram Offset'
        outputData.write(datagramOffset);

        // Process 'Payload'
        try {
            outputData.write(payload);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the LOWPAN_SUBSEQUENT_FRAGMENT command<br>
     *
     * Lowpan Subsequent Fragment<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>DATAGRAM_SIZE_1 {@link Integer}
     * <li>DATAGRAM_SIZE_2 {@link Integer}
     * <li>DATAGRAM_TAG {@link Integer}
     * <li>DATAGRAM_OFFSET {@link Integer}
     * <li>PAYLOAD {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleLowpanSubsequentFragment(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Properties1'
        response.put("DATAGRAM_SIZE_1", Integer.valueOf(payload[msgOffset] & 0x07));
        msgOffset += 1;

        // Process 'Datagram Size 2'
        response.put("DATAGRAM_SIZE_2", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Datagram Tag'
        response.put("DATAGRAM_TAG", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Datagram Offset'
        response.put("DATAGRAM_OFFSET", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Payload'
        ByteArrayOutputStream valPayload = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valPayload.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("PAYLOAD", valPayload);

        // Return the map of processed response data;
        return response;
    }

}
