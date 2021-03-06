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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_SWITCH_BINARY</b> version <b>2</b>.
 * <p>
 * Command Class Switch Binary
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x25.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassSwitchBinaryV2 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassSwitchBinaryV2.class);

    /**
     * Integer command class key for COMMAND_CLASS_SWITCH_BINARY
     */
    public final static int COMMAND_CLASS_KEY = 0x25;

    /**
     * Switch Binary Set Command Constant
     */
    public final static int SWITCH_BINARY_SET = 0x01;
    /**
     * Switch Binary Get Command Constant
     */
    public final static int SWITCH_BINARY_GET = 0x02;
    /**
     * Switch Binary Report Command Constant
     */
    public final static int SWITCH_BINARY_REPORT = 0x03;

    /**
     * Map holding constants for SwitchBinaryReportDuration
     */
    private static Map<Integer, String> constantSwitchBinaryReportDuration = new HashMap<Integer, String>();

    /**
     * Map holding constants for SwitchBinarySetDuration
     */
    private static Map<Integer, String> constantSwitchBinarySetDuration = new HashMap<Integer, String>();

    /**
     * Map holding constants for SwitchBinaryReportTargetValue
     */
    private static Map<Integer, String> constantSwitchBinaryReportTargetValue = new HashMap<Integer, String>();

    /**
     * Map holding constants for SwitchBinarySetTargetValue
     */
    private static Map<Integer, String> constantSwitchBinarySetTargetValue = new HashMap<Integer, String>();

    /**
     * Map holding constants for SwitchBinaryReportCurrentValue
     */
    private static Map<Integer, String> constantSwitchBinaryReportCurrentValue = new HashMap<Integer, String>();

    static {
        // Constants for SwitchBinaryReportDuration
        constantSwitchBinaryReportDuration.put(0xFE, "UNKNOWN_DURATION");
        constantSwitchBinaryReportDuration.put(0x00, "ALREADY_AT_THE_TARGET_VALUE");

        // Constants for SwitchBinarySetDuration
        constantSwitchBinarySetDuration.put(0x00, "INSTANTLY");
        constantSwitchBinarySetDuration.put(0xFF, "DEFAULT");

        // Constants for SwitchBinaryReportTargetValue
        constantSwitchBinaryReportTargetValue.put(0x00, "OFF_DISABLE");
        constantSwitchBinaryReportTargetValue.put(0xFF, "ON_ENABLE");

        // Constants for SwitchBinarySetTargetValue
        constantSwitchBinarySetTargetValue.put(0x00, "OFF_DISABLE");
        constantSwitchBinarySetTargetValue.put(0xFF, "ON_ENABLE");

        // Constants for SwitchBinaryReportCurrentValue
        constantSwitchBinaryReportCurrentValue.put(0x00, "OFF_DISABLE");
        constantSwitchBinaryReportCurrentValue.put(0xFF, "ON_ENABLE");
    }

    /**
     * Creates a new message with the SWITCH_BINARY_SET command.
     * <p>
     * Switch Binary Set
     *
     * @param targetValue {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>OFF_DISABLE
     *            <li>ON_ENABLE
     *            </ul>
     * @param duration {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>INSTANTLY
     *            <li>DEFAULT
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchBinarySet(String targetValue, String duration) {
        logger.debug("Creating command message SWITCH_BINARY_SET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_BINARY_SET);

        // Process 'Target Value'
        boolean foundTargetValue = false;
        for (Integer entry : constantSwitchBinarySetTargetValue.keySet()) {
            if (constantSwitchBinarySetTargetValue.get(entry).equals(targetValue)) {
                outputData.write(entry);
                foundTargetValue = true;
                break;
            }
        }
        if (!foundTargetValue) {
            throw new IllegalArgumentException("Unknown constant value '" + targetValue + "' for targetValue");
        }

        // Process 'Duration'
        boolean foundDuration = false;
        for (Integer entry : constantSwitchBinarySetDuration.keySet()) {
            if (constantSwitchBinarySetDuration.get(entry).equals(duration)) {
                outputData.write(entry);
                foundDuration = true;
                break;
            }
        }
        if (!foundDuration) {
            throw new IllegalArgumentException("Unknown constant value '" + duration + "' for duration");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_BINARY_SET command.
     * <p>
     * Switch Binary Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>TARGET_VALUE {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>OFF_DISABLE
     * <li>ON_ENABLE
     * </ul>
     * <li>DURATION {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>INSTANTLY
     * <li>DEFAULT
     * </ul>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchBinarySet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Target Value'
        response.put("TARGET_VALUE", constantSwitchBinarySetTargetValue.get(payload[2] & 0xff));

        // Process 'Duration'
        response.put("DURATION", constantSwitchBinarySetDuration.get(payload[3] & 0xff));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_BINARY_GET command.
     * <p>
     * Switch Binary Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchBinaryGet() {
        logger.debug("Creating command message SWITCH_BINARY_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_BINARY_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_BINARY_GET command.
     * <p>
     * Switch Binary Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchBinaryGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_BINARY_REPORT command.
     * <p>
     * Switch Binary Report
     *
     * @param currentValue {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>OFF_DISABLE
     *            <li>ON_ENABLE
     *            </ul>
     * @param targetValue {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>OFF_DISABLE
     *            <li>ON_ENABLE
     *            </ul>
     * @param duration {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>UNKNOWN_DURATION
     *            <li>ALREADY_AT_THE_TARGET_VALUE
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchBinaryReport(String currentValue, String targetValue, String duration) {
        logger.debug("Creating command message SWITCH_BINARY_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_BINARY_REPORT);

        // Process 'Current Value'
        boolean foundCurrentValue = false;
        for (Integer entry : constantSwitchBinaryReportCurrentValue.keySet()) {
            if (constantSwitchBinaryReportCurrentValue.get(entry).equals(currentValue)) {
                outputData.write(entry);
                foundCurrentValue = true;
                break;
            }
        }
        if (!foundCurrentValue) {
            throw new IllegalArgumentException("Unknown constant value '" + currentValue + "' for currentValue");
        }

        // Process 'Target Value'
        boolean foundTargetValue = false;
        for (Integer entry : constantSwitchBinaryReportTargetValue.keySet()) {
            if (constantSwitchBinaryReportTargetValue.get(entry).equals(targetValue)) {
                outputData.write(entry);
                foundTargetValue = true;
                break;
            }
        }
        if (!foundTargetValue) {
            throw new IllegalArgumentException("Unknown constant value '" + targetValue + "' for targetValue");
        }

        // Process 'Duration'
        boolean foundDuration = false;
        for (Integer entry : constantSwitchBinaryReportDuration.keySet()) {
            if (constantSwitchBinaryReportDuration.get(entry).equals(duration)) {
                outputData.write(entry);
                foundDuration = true;
                break;
            }
        }
        if (!foundDuration) {
            throw new IllegalArgumentException("Unknown constant value '" + duration + "' for duration");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_BINARY_REPORT command.
     * <p>
     * Switch Binary Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>CURRENT_VALUE {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>OFF_DISABLE
     * <li>ON_ENABLE
     * </ul>
     * <li>TARGET_VALUE {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>OFF_DISABLE
     * <li>ON_ENABLE
     * </ul>
     * <li>DURATION {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>UNKNOWN_DURATION
     * <li>ALREADY_AT_THE_TARGET_VALUE
     * </ul>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchBinaryReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Current Value'
        response.put("CURRENT_VALUE", constantSwitchBinaryReportCurrentValue.get(payload[2] & 0xff));

        // Process 'Target Value'
        response.put("TARGET_VALUE", constantSwitchBinaryReportTargetValue.get(payload[3] & 0xff));

        // Process 'Duration'
        response.put("DURATION", constantSwitchBinaryReportDuration.get(payload[4] & 0xff));

        // Return the map of processed response data;
        return response;
    }
}
