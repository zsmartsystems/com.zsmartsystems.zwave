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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_PROTECTION</b> version <b>2</b>.
 * <p>
 * Command Class Protection
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x75.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassProtectionV2 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassProtectionV2.class);

    /**
     * Integer command class key for COMMAND_CLASS_PROTECTION
     */
    public final static int COMMAND_CLASS_KEY = 0x75;

    /**
     * Protection Set Command Constant
     */
    public final static int PROTECTION_SET = 0x01;
    /**
     * Protection Get Command Constant
     */
    public final static int PROTECTION_GET = 0x02;
    /**
     * Protection Report Command Constant
     */
    public final static int PROTECTION_REPORT = 0x03;
    /**
     * Protection Supported Get Command Constant
     */
    public final static int PROTECTION_SUPPORTED_GET = 0x04;
    /**
     * Protection Supported Report Command Constant
     */
    public final static int PROTECTION_SUPPORTED_REPORT = 0x05;
    /**
     * Protection Ec Set Command Constant
     */
    public final static int PROTECTION_EC_SET = 0x06;
    /**
     * Protection Ec Get Command Constant
     */
    public final static int PROTECTION_EC_GET = 0x07;
    /**
     * Protection Ec Report Command Constant
     */
    public final static int PROTECTION_EC_REPORT = 0x08;
    /**
     * Protection Timeout Set Command Constant
     */
    public final static int PROTECTION_TIMEOUT_SET = 0x09;
    /**
     * Protection Timeout Get Command Constant
     */
    public final static int PROTECTION_TIMEOUT_GET = 0x0A;
    /**
     * Protection Timeout Report Command Constant
     */
    public final static int PROTECTION_TIMEOUT_REPORT = 0x0B;

    /**
     * Map holding constants for ProtectionTimeoutSetTimeout
     */
    private static Map<Integer, String> constantProtectionTimeoutSetTimeout = new HashMap<Integer, String>();

    /**
     * Map holding constants for ProtectionTimeoutReportTimeout
     */
    private static Map<Integer, String> constantProtectionTimeoutReportTimeout = new HashMap<Integer, String>();

    /**
     * Map holding constants for ProtectionSupportedReportLevel
     */
    private static Map<Integer, String> constantProtectionSupportedReportLevel = new HashMap<Integer, String>();

    static {
        // Constants for ProtectionTimeoutSetTimeout
        constantProtectionTimeoutSetTimeout.put(0x00, "NO_TIMER_IS_SET");
        constantProtectionTimeoutSetTimeout.put(0xFF, "NO_TIMEOUT");

        // Constants for ProtectionTimeoutReportTimeout
        constantProtectionTimeoutReportTimeout.put(0x00, "NO_TIMER_IS_SET");
        constantProtectionTimeoutReportTimeout.put(0xFF, "NO_TIMEOUT_IS_SET");

        // Constants for ProtectionSupportedReportLevel
        constantProtectionSupportedReportLevel.put(0x01, "TIMEOUT");
        constantProtectionSupportedReportLevel.put(0x02, "EXCLUSIVE_CONTROL");
    }

    /**
     * Creates a new message with the PROTECTION_SET command.
     * <p>
     * Protection Set
     *
     * @param localProtectionState {@link Integer}
     * @param rfProtectionState {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionSet(Integer localProtectionState, Integer rfProtectionState) {
        logger.debug("Creating command message PROTECTION_SET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_SET);

        // Process 'Level'
        outputData.write(localProtectionState & 0x0F);

        // Process 'Level2'
        outputData.write(rfProtectionState & 0x0F);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_SET command.
     * <p>
     * Protection Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>LOCAL_PROTECTION_STATE {@link Integer}
     * <li>RF_PROTECTION_STATE {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Level'
        response.put("LOCAL_PROTECTION_STATE", Integer.valueOf(payload[2] & 0x0F));

        // Process 'Level2'
        response.put("RF_PROTECTION_STATE", Integer.valueOf(payload[3] & 0x0F));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the PROTECTION_GET command.
     * <p>
     * Protection Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionGet() {
        logger.debug("Creating command message PROTECTION_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_GET command.
     * <p>
     * Protection Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the PROTECTION_REPORT command.
     * <p>
     * Protection Report
     *
     * @param localProtectionState {@link Integer}
     * @param rfProtectionState {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionReport(Integer localProtectionState, Integer rfProtectionState) {
        logger.debug("Creating command message PROTECTION_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_REPORT);

        // Process 'Level'
        outputData.write(localProtectionState & 0x0F);

        // Process 'Level2'
        outputData.write(rfProtectionState & 0x0F);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_REPORT command.
     * <p>
     * Protection Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>LOCAL_PROTECTION_STATE {@link Integer}
     * <li>RF_PROTECTION_STATE {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Level'
        response.put("LOCAL_PROTECTION_STATE", Integer.valueOf(payload[2] & 0x0F));

        // Process 'Level2'
        response.put("RF_PROTECTION_STATE", Integer.valueOf(payload[3] & 0x0F));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the PROTECTION_SUPPORTED_GET command.
     * <p>
     * Protection Supported Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionSupportedGet() {
        logger.debug("Creating command message PROTECTION_SUPPORTED_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_SUPPORTED_GET command.
     * <p>
     * Protection Supported Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the PROTECTION_SUPPORTED_REPORT command.
     * <p>
     * Protection Supported Report
     *
     * @param timeout {@link Boolean}
     * @param exclusiveControl {@link Boolean}
     * @param localProtectionState {@link Integer}
     * @param rfProtectionState {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionSupportedReport(Boolean timeout, Boolean exclusiveControl,
            Integer localProtectionState, Integer rfProtectionState) {
        logger.debug("Creating command message PROTECTION_SUPPORTED_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_SUPPORTED_REPORT);

        // Process 'Level'
        int valLevel = 0;
        valLevel |= timeout ? 0x01 : 0;
        valLevel |= exclusiveControl ? 0x02 : 0;
        outputData.write(valLevel);

        // Process 'Local Protection State'
        outputData.write((localProtectionState >> 8) & 0xff);
        outputData.write(localProtectionState & 0xff);

        // Process 'RF Protection State'
        outputData.write((rfProtectionState >> 8) & 0xff);
        outputData.write(rfProtectionState & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_SUPPORTED_REPORT command.
     * <p>
     * Protection Supported Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>TIMEOUT {@link Boolean}
     * <li>EXCLUSIVE_CONTROL {@link Boolean}
     * <li>LOCAL_PROTECTION_STATE {@link Integer}
     * <li>RF_PROTECTION_STATE {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Level'
        response.put("TIMEOUT", Boolean.valueOf((payload[2] & 0x01) != 0));
        response.put("EXCLUSIVE_CONTROL", Boolean.valueOf((payload[2] & 0x02) != 0));

        // Process 'Local Protection State'
        response.put("LOCAL_PROTECTION_STATE", Integer.valueOf(((payload[3] & 0xff) << 8) + (payload[4] & 0xff)));

        // Process 'RF Protection State'
        response.put("RF_PROTECTION_STATE", Integer.valueOf(((payload[5] & 0xff) << 8) + (payload[6] & 0xff)));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the PROTECTION_EC_SET command.
     * <p>
     * Protection Ec Set
     *
     * @param nodeId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionEcSet(Integer nodeId) {
        logger.debug("Creating command message PROTECTION_EC_SET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_EC_SET);

        // Process 'Node ID'
        // Check the node number boundary
        if (nodeId < 1 || nodeId > 232) {
            logger.debug("Node number is out of bounds {}", nodeId);
            return null;
        }
        outputData.write(nodeId);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_EC_SET command.
     * <p>
     * Protection Ec Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>NODE_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionEcSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Node ID'
        response.put("NODE_ID", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the PROTECTION_EC_GET command.
     * <p>
     * Protection Ec Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionEcGet() {
        logger.debug("Creating command message PROTECTION_EC_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_EC_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_EC_GET command.
     * <p>
     * Protection Ec Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionEcGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the PROTECTION_EC_REPORT command.
     * <p>
     * Protection Ec Report
     *
     * @param nodeId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionEcReport(Integer nodeId) {
        logger.debug("Creating command message PROTECTION_EC_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_EC_REPORT);

        // Process 'Node ID'
        // Check the node number boundary
        if (nodeId < 1 || nodeId > 232) {
            logger.debug("Node number is out of bounds {}", nodeId);
            return null;
        }
        outputData.write(nodeId);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_EC_REPORT command.
     * <p>
     * Protection Ec Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>NODE_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionEcReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Node ID'
        response.put("NODE_ID", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the PROTECTION_TIMEOUT_SET command.
     * <p>
     * Protection Timeout Set
     *
     * @param timeout {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>NO_TIMER_IS_SET
     *            <li>NO_TIMEOUT
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionTimeoutSet(String timeout) {
        logger.debug("Creating command message PROTECTION_TIMEOUT_SET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_TIMEOUT_SET);

        // Process 'Timeout'
        boolean foundTimeout = false;
        for (Integer entry : constantProtectionTimeoutSetTimeout.keySet()) {
            if (constantProtectionTimeoutSetTimeout.get(entry).equals(timeout)) {
                outputData.write(entry);
                foundTimeout = true;
                break;
            }
        }
        if (!foundTimeout) {
            throw new IllegalArgumentException("Unknown constant value '" + timeout + "' for timeout");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_TIMEOUT_SET command.
     * <p>
     * Protection Timeout Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>TIMEOUT {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>NO_TIMER_IS_SET
     * <li>NO_TIMEOUT
     * </ul>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionTimeoutSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Timeout'
        response.put("TIMEOUT", constantProtectionTimeoutSetTimeout.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the PROTECTION_TIMEOUT_GET command.
     * <p>
     * Protection Timeout Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionTimeoutGet() {
        logger.debug("Creating command message PROTECTION_TIMEOUT_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_TIMEOUT_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_TIMEOUT_GET command.
     * <p>
     * Protection Timeout Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionTimeoutGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the PROTECTION_TIMEOUT_REPORT command.
     * <p>
     * Protection Timeout Report
     *
     * @param timeout {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>NO_TIMER_IS_SET
     *            <li>NO_TIMEOUT_IS_SET
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getProtectionTimeoutReport(String timeout) {
        logger.debug("Creating command message PROTECTION_TIMEOUT_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(PROTECTION_TIMEOUT_REPORT);

        // Process 'Timeout'
        boolean foundTimeout = false;
        for (Integer entry : constantProtectionTimeoutReportTimeout.keySet()) {
            if (constantProtectionTimeoutReportTimeout.get(entry).equals(timeout)) {
                outputData.write(entry);
                foundTimeout = true;
                break;
            }
        }
        if (!foundTimeout) {
            throw new IllegalArgumentException("Unknown constant value '" + timeout + "' for timeout");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the PROTECTION_TIMEOUT_REPORT command.
     * <p>
     * Protection Timeout Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>TIMEOUT {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>NO_TIMER_IS_SET
     * <li>NO_TIMEOUT_IS_SET
     * </ul>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleProtectionTimeoutReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Timeout'
        response.put("TIMEOUT", constantProtectionTimeoutReportTimeout.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }
}
