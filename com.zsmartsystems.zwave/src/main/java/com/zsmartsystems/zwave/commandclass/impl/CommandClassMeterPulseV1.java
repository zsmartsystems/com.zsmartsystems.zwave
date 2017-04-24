/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_METER_PULSE</b> version <b>1</b>.
 * <p>
 * Command Class Meter Pulse
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x35.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassMeterPulseV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassMeterPulseV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_METER_PULSE
     */
    public final static int COMMAND_CLASS_KEY = 0x35;

    /**
     * Meter Pulse Get Command Constant
     */
    public final static int METER_PULSE_GET = 0x04;
    /**
     * Meter Pulse Report Command Constant
     */
    public final static int METER_PULSE_REPORT = 0x05;


    /**
     * Creates a new message with the METER_PULSE_GET command.
     * <p>
     * Meter Pulse Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getMeterPulseGet() {
        logger.debug("Creating command message METER_PULSE_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(METER_PULSE_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the METER_PULSE_GET command.
     * <p>
     * Meter Pulse Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleMeterPulseGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the METER_PULSE_REPORT command.
     * <p>
     * Meter Pulse Report
     *
     * @param pulseCount {@link Long}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getMeterPulseReport(Long pulseCount) {
        logger.debug("Creating command message METER_PULSE_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(METER_PULSE_REPORT);

        // Process 'Pulse Count'
        outputData.write((byte) ((pulseCount >> 24) & 0xff));
        outputData.write((byte) ((pulseCount >> 16) & 0xff));
        outputData.write((byte) ((pulseCount >> 8) & 0xff));
        outputData.write((byte) (pulseCount & 0xff));

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the METER_PULSE_REPORT command.
     * <p>
     * Meter Pulse Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PULSE_COUNT {@link Long}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleMeterPulseReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Pulse Count'
        response.put("PULSE_COUNT", Long.valueOf((payload[2] << 24) + (payload[3] << 16) + (payload[4] << 8) + payload[5]));

        // Return the map of processed response data;
        return response;
    }

}
