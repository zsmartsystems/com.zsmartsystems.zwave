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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_INDICATOR</b> version <b>1</b>.
 * <p>
 * Command Class Indicator
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x87.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassIndicatorV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassIndicatorV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_INDICATOR
     */
    public final static int COMMAND_CLASS_KEY = 0x87;

    /**
     * Indicator Set Command Constant
     */
    public final static int INDICATOR_SET = 0x01;
    /**
     * Indicator Get Command Constant
     */
    public final static int INDICATOR_GET = 0x02;
    /**
     * Indicator Report Command Constant
     */
    public final static int INDICATOR_REPORT = 0x03;

    /**
     * Map holding constants for IndicatorReportValue
     */
    private static Map<Integer, String> constantIndicatorReportValue = new HashMap<Integer, String>();

    /**
     * Map holding constants for IndicatorSetValue
     */
    private static Map<Integer, String> constantIndicatorSetValue = new HashMap<Integer, String>();

    static {
        // Constants for IndicatorReportValue
        constantIndicatorReportValue.put(0x00, "OFF_DISABLE");
        constantIndicatorReportValue.put(0xFF, "ON_ENABLE");

        // Constants for IndicatorSetValue
        constantIndicatorSetValue.put(0x00, "OFF_DISABLE");
        constantIndicatorSetValue.put(0xFF, "ON_ENABLE");
    }

    /**
     * Creates a new message with the INDICATOR_SET command.
     * <p>
     * Indicator Set
     *
     * @param value {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>OFF_DISABLE
     *            <li>ON_ENABLE
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getIndicatorSet(String value) {
        logger.debug("Creating command message INDICATOR_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(INDICATOR_SET);

        // Process 'Value'
        boolean foundValue = false;
        for (Integer entry : constantIndicatorSetValue.keySet()) {
            if (constantIndicatorSetValue.get(entry).equals(value)) {
                outputData.write(entry);
                foundValue = true;
                break;
            }
        }
        if (!foundValue) {
            throw new IllegalArgumentException("Unknown constant value '" + value + "' for value");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the INDICATOR_SET command.
     * <p>
     * Indicator Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>VALUE {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>OFF_DISABLE
     * <li>ON_ENABLE
     * </ul>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleIndicatorSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Value'
        response.put("VALUE", constantIndicatorSetValue.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the INDICATOR_GET command.
     * <p>
     * Indicator Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getIndicatorGet() {
        logger.debug("Creating command message INDICATOR_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(INDICATOR_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the INDICATOR_GET command.
     * <p>
     * Indicator Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleIndicatorGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the INDICATOR_REPORT command.
     * <p>
     * Indicator Report
     *
     * @param value {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>OFF_DISABLE
     *            <li>ON_ENABLE
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getIndicatorReport(String value) {
        logger.debug("Creating command message INDICATOR_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(INDICATOR_REPORT);

        // Process 'Value'
        boolean foundValue = false;
        for (Integer entry : constantIndicatorReportValue.keySet()) {
            if (constantIndicatorReportValue.get(entry).equals(value)) {
                outputData.write(entry);
                foundValue = true;
                break;
            }
        }
        if (!foundValue) {
            throw new IllegalArgumentException("Unknown constant value '" + value + "' for value");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the INDICATOR_REPORT command.
     * <p>
     * Indicator Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>VALUE {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>OFF_DISABLE
     * <li>ON_ENABLE
     * </ul>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleIndicatorReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Value'
        response.put("VALUE", constantIndicatorReportValue.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }
}
