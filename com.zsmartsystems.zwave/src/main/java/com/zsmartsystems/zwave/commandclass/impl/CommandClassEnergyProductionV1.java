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
import java.lang.IllegalArgumentException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_ENERGY_PRODUCTION</b> version <b>1</b>.<br>
 *
 * Command Class Energy Production<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassEnergyProductionV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassEnergyProductionV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_ENERGY_PRODUCTION
     */
    public final static int COMMAND_CLASS_KEY = 0x90;

    /**
     * Energy Production Get Command Constant
     */
    public final static int ENERGY_PRODUCTION_GET = 0x02;
    /**
     * Energy Production Report Command Constant
     */
    public final static int ENERGY_PRODUCTION_REPORT = 0x03;

    /**
     * Creates a new message with the ENERGY_PRODUCTION_GET command.<br>
     *
     * Energy Production Get<br>
     *
     *
     * @param parameterNumber {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getEnergyProductionGet(String parameterNumber) {
        logger.debug("Creating command message ENERGY_PRODUCTION_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ENERGY_PRODUCTION_GET);

        // Process 'Parameter Number'
        switch (parameterNumber) {
            case "INSTANT_ENERGY_PRODUCTION":
                outputData.write(0x00);
                break;
            case "TOTAL_ENERGY_PRODUCTION":
                outputData.write(0x01);
                break;
            case "ENERGY_PRODUCTION_TODAY":
                outputData.write(0x02);
                break;
            case "TOTAL_PRODUCTION_TIME":
                outputData.write(0x03);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for parameterNumber: " + parameterNumber);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ENERGY_PRODUCTION_GET command<br>
     *
     * Energy Production Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleEnergyProductionGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Parameter Number'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("PARAMETER_NUMBER", "INSTANT_ENERGY_PRODUCTION");
                break;
            case (byte) 0x01:
                response.put("PARAMETER_NUMBER", "TOTAL_ENERGY_PRODUCTION");
                break;
            case (byte) 0x02:
                response.put("PARAMETER_NUMBER", "ENERGY_PRODUCTION_TODAY");
                break;
            case (byte) 0x03:
                response.put("PARAMETER_NUMBER", "TOTAL_PRODUCTION_TIME");
                break;
            default:
                logger.debug("Unknown value {} for constant 'PARAMETER_NUMBER'", String.format("%02X", payload[2]));
                response.put("PARAMETER_NUMBER", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ENERGY_PRODUCTION_REPORT command.<br>
     *
     * Energy Production Report<br>
     *
     *
     * @param parameterNumber {@link String}
     * @param size {@link Integer}
     * @param scale {@link Integer}
     * @param precision {@link Integer}
     * @param value {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getEnergyProductionReport(String parameterNumber, Integer size, Integer scale,
            Integer precision, byte[] value) {
        logger.debug("Creating command message ENERGY_PRODUCTION_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ENERGY_PRODUCTION_REPORT);

        // Process 'Parameter Number'
        switch (parameterNumber) {
            case "INSTANT_ENERGY_PRODUCTION":
                outputData.write(0x00);
                break;
            case "TOTAL_ENERGY_PRODUCTION":
                outputData.write(0x01);
                break;
            case "ENERGY_PRODUCTION_TODAY":
                outputData.write(0x02);
                break;
            case "TOTAL_PRODUCTION_TIME":
                outputData.write(0x03);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for parameterNumber: " + parameterNumber);
        }

        // Process 'Level'
        int valLevel = 0;
        valLevel |= size & 0x07;
        valLevel |= ((scale << 3) & 0x18);
        valLevel |= ((precision << 5) & 0xE0);
        outputData.write(valLevel);

        // Process 'Value'
        try {
            outputData.write(value);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ENERGY_PRODUCTION_REPORT command<br>
     *
     * Energy Production Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link String}
     * <li>SIZE {@link Integer}
     * <li>SCALE {@link Integer}
     * <li>PRECISION {@link Integer}
     * <li>VALUE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleEnergyProductionReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Parameter Number'
        switch ((int) payload[msgOffset]) {
            case (byte) 0x00:
                response.put("PARAMETER_NUMBER", "INSTANT_ENERGY_PRODUCTION");
                break;
            case (byte) 0x01:
                response.put("PARAMETER_NUMBER", "TOTAL_ENERGY_PRODUCTION");
                break;
            case (byte) 0x02:
                response.put("PARAMETER_NUMBER", "ENERGY_PRODUCTION_TODAY");
                break;
            case (byte) 0x03:
                response.put("PARAMETER_NUMBER", "TOTAL_PRODUCTION_TIME");
                break;
            default:
                logger.debug("Unknown value {} for constant 'PARAMETER_NUMBER'", String.format("%02X", payload[msgOffset]));
                response.put("PARAMETER_NUMBER", "UNKNOWN_" + String.format("%02X", payload[msgOffset]));
                break;
        }
        msgOffset += 1;

        // Process 'Level'
        response.put("SIZE", Integer.valueOf(payload[msgOffset] & 0x07));
        response.put("SCALE", Integer.valueOf((payload[msgOffset] & 0x18 >> 3)));
        response.put("PRECISION", Integer.valueOf((payload[msgOffset] & 0xE0 >> 5)));
        msgOffset += 1;

        // Process 'Value'
        int valValue = 0;
        int lenValue = payload[msgOffset - 1] & 0x07;
        for (int cntValue = 0; cntValue < lenValue; cntValue++) {
            valValue = (valValue << 8) + payload[msgOffset + cntValue];
        }
        response.put("VALUE", valValue);
        msgOffset += lenValue;

        // Return the map of processed response data;
        return response;
    }

}
