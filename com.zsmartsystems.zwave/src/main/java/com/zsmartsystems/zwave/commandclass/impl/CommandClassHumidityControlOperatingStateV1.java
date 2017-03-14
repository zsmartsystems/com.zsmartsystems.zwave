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
import java.lang.IllegalArgumentException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_HUMIDITY_CONTROL_OPERATING_STATE</b> version <b>1</b>.<br>
 *
 * Command Class Humidity Control Operating State<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassHumidityControlOperatingStateV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassHumidityControlOperatingStateV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_HUMIDITY_CONTROL_OPERATING_STATE
     */
    public final static int COMMAND_CLASS_KEY = 0x6E;

    /**
     * Humidity Control Operating State Get Command Constant
     */
    public final static int HUMIDITY_CONTROL_OPERATING_STATE_GET = 0x01;
    /**
     * Humidity Control Operating State Report Command Constant
     */
    public final static int HUMIDITY_CONTROL_OPERATING_STATE_REPORT = 0x02;

    /**
     * Creates a new message with the HUMIDITY_CONTROL_OPERATING_STATE_GET command.<br>
     *
     * Humidity Control Operating State Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getHumidityControlOperatingStateGet() {
        logger.debug("Creating command message HUMIDITY_CONTROL_OPERATING_STATE_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(HUMIDITY_CONTROL_OPERATING_STATE_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the HUMIDITY_CONTROL_OPERATING_STATE_GET command<br>
     *
     * Humidity Control Operating State Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleHumidityControlOperatingStateGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the HUMIDITY_CONTROL_OPERATING_STATE_REPORT command.<br>
     *
     * Humidity Control Operating State Report<br>
     *
     *
     * @param operatingState {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getHumidityControlOperatingStateReport(String operatingState) {
        logger.debug("Creating command message HUMIDITY_CONTROL_OPERATING_STATE_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(HUMIDITY_CONTROL_OPERATING_STATE_REPORT);

        // Process 'Properties1'
        int valoperatingState;
        switch (operatingState) {
            case "IDLE":
                valoperatingState = 0;
                break;
            case "HUMIDIFYING":
                valoperatingState = 1;
                break;
            case "DEHUMIDIFYING":
                valoperatingState = 2;
                break;
            default:
                throw new IllegalArgumentException("Unknown enum value for operatingState: " + operatingState);
        }
        outputData.write(valoperatingState & 0x0F);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the HUMIDITY_CONTROL_OPERATING_STATE_REPORT command<br>
     *
     * Humidity Control Operating State Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>OPERATING_STATE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleHumidityControlOperatingStateReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Properties1'
        switch ((int) payload[2] & 0x0F) {
            case 0x00:
                response.put("OPERATING_STATE", "IDLE");
                break;
            case 0x01:
                response.put("OPERATING_STATE", "HUMIDIFYING");
                break;
            case 0x02:
                response.put("OPERATING_STATE", "DEHUMIDIFYING");
                break;
            default:
                logger.debug("Unknown enum value {} for OPERATING_STATE", String.format("0x%02X", 2));
        }

        // Return the map of processed response data;
        return response;
    }

}
