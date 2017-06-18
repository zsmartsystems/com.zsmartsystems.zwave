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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_BATTERY</b> version <b>1</b>.
 * <p>
 * Command Class Battery
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x80.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassBatteryV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassBatteryV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_BATTERY
     */
    public final static int COMMAND_CLASS_KEY = 0x80;

    /**
     * Battery Get Command Constant
     */
    public final static int BATTERY_GET = 0x02;
    /**
     * Battery Report Command Constant
     */
    public final static int BATTERY_REPORT = 0x03;

    /**
     * Map holding constants for BatteryReportBatteryLevel
     */
    private static Map<Integer, String> constantBatteryReportBatteryLevel = new HashMap<Integer, String>();

    static {
        // Constants for BatteryReportBatteryLevel
        constantBatteryReportBatteryLevel.put(0xFF, "BATTERY_LOW_WARNING");
    }

    /**
     * Creates a new message with the BATTERY_GET command.
     * <p>
     * Battery Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBatteryGet() {
        logger.debug("Creating command message BATTERY_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BATTERY_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BATTERY_GET command.
     * <p>
     * Battery Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBatteryGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the BATTERY_REPORT command.
     * <p>
     * Battery Report
     *
     * @param batteryLevel {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>BATTERY_LOW_WARNING
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBatteryReport(String batteryLevel) {
        logger.debug("Creating command message BATTERY_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BATTERY_REPORT);

        // Process 'Battery Level'
        boolean foundBatteryLevel = false;
        for (Integer entry : constantBatteryReportBatteryLevel.keySet()) {
            if (constantBatteryReportBatteryLevel.get(entry).equals(batteryLevel)) {
                outputData.write(entry);
                foundBatteryLevel = true;
                break;
            }
        }
        if (!foundBatteryLevel) {
            throw new IllegalArgumentException("Unknown constant value '" + batteryLevel + "' for batteryLevel");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BATTERY_REPORT command.
     * <p>
     * Battery Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>BATTERY_LEVEL {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>BATTERY_LOW_WARNING
     * </ul>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBatteryReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Battery Level'
        response.put("BATTERY_LEVEL", constantBatteryReportBatteryLevel.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }
}
