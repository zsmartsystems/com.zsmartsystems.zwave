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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_SENSOR_MULTILEVEL</b> version <b>4</b>.<br>
 *
 * Command Class Sensor Multilevel<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassSensorMultilevelV4 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassSensorMultilevelV4.class);

    /**
     * Integer command class key for COMMAND_CLASS_SENSOR_MULTILEVEL
     */
    public final static int COMMAND_CLASS_KEY = 0x31;

    /**
     * Sensor Multilevel Get Command Constant
     */
    public final static int SENSOR_MULTILEVEL_GET = 0x04;
    /**
     * Sensor Multilevel Report Command Constant
     */
    public final static int SENSOR_MULTILEVEL_REPORT = 0x05;

    /**
     * Creates a new message with the SENSOR_MULTILEVEL_GET command.<br>
     *
     * Sensor Multilevel Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSensorMultilevelGet() {
        logger.debug("Creating command message SENSOR_MULTILEVEL_GET version 4");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SENSOR_MULTILEVEL_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SENSOR_MULTILEVEL_GET command<br>
     *
     * Sensor Multilevel Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSensorMultilevelGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SENSOR_MULTILEVEL_REPORT command.<br>
     *
     * Sensor Multilevel Report<br>
     *
     *
     * @param sensorType {@link String}
     * @param size {@link Integer}
     * @param scale {@link Integer}
     * @param precision {@link Integer}
     * @param sensorValue {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSensorMultilevelReport(String sensorType, Integer size, Integer scale, Integer precision,
            byte[] sensorValue) {
        logger.debug("Creating command message SENSOR_MULTILEVEL_REPORT version 4");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SENSOR_MULTILEVEL_REPORT);

        // Process 'Sensor Type'
        switch (sensorType) {
            case "TEMPERATURE":
                outputData.write(0x01);
                break;
            case "GENERAL_PURPOSE_VALUE":
                outputData.write(0x02);
                break;
            case "LUMINANCE":
                outputData.write(0x03);
                break;
            case "POWER":
                outputData.write(0x04);
                break;
            case "RELATIVE_HUMIDITY":
                outputData.write(0x05);
                break;
            case "VELOCITY":
                outputData.write(0x06);
                break;
            case "DIRECTION":
                outputData.write(0x07);
                break;
            case "ATMOSPHERIC_PRESSURE":
                outputData.write(0x08);
                break;
            case "BAROMETRIC_PRESSURE":
                outputData.write(0x09);
                break;
            case "SOLAR_RADIATION":
                outputData.write(0x0A);
                break;
            case "DEW_POINT":
                outputData.write(0x0B);
                break;
            case "RAIN_RATE":
                outputData.write(0x0C);
                break;
            case "TIDE_LEVEL":
                outputData.write(0x0D);
                break;
            case "WEIGHT":
                outputData.write(0x0E);
                break;
            case "VOLTAGE":
                outputData.write(0x0F);
                break;
            case "CURRENT":
                outputData.write(0x10);
                break;
            case "CO2_LEVEL":
                outputData.write(0x11);
                break;
            case "AIR_FLOW":
                outputData.write(0x12);
                break;
            case "TANK_CAPACITY":
                outputData.write(0x13);
                break;
            case "DISTANCE":
                outputData.write(0x14);
                break;
            case "ANGLE_POSITION":
                outputData.write(0x15);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for sensorType: " + sensorType);
        }

        // Process 'Level'
        int valLevel = 0;
        valLevel |= size & 0x07;
        valLevel |= ((scale << 3) & 0x18);
        valLevel |= ((precision << 5) & 0xE0);
        outputData.write(valLevel);

        // Process 'Sensor Value'
        try {
            outputData.write(sensorValue);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SENSOR_MULTILEVEL_REPORT command<br>
     *
     * Sensor Multilevel Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SENSOR_TYPE {@link String}
     * <li>SIZE {@link Integer}
     * <li>SCALE {@link Integer}
     * <li>PRECISION {@link Integer}
     * <li>SENSOR_VALUE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSensorMultilevelReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Sensor Type'
        switch ((int) payload[msgOffset]) {
            case (byte) 0x01:
                response.put("SENSOR_TYPE", "TEMPERATURE");
                break;
            case (byte) 0x02:
                response.put("SENSOR_TYPE", "GENERAL_PURPOSE_VALUE");
                break;
            case (byte) 0x03:
                response.put("SENSOR_TYPE", "LUMINANCE");
                break;
            case (byte) 0x04:
                response.put("SENSOR_TYPE", "POWER");
                break;
            case (byte) 0x05:
                response.put("SENSOR_TYPE", "RELATIVE_HUMIDITY");
                break;
            case (byte) 0x06:
                response.put("SENSOR_TYPE", "VELOCITY");
                break;
            case (byte) 0x07:
                response.put("SENSOR_TYPE", "DIRECTION");
                break;
            case (byte) 0x08:
                response.put("SENSOR_TYPE", "ATMOSPHERIC_PRESSURE");
                break;
            case (byte) 0x09:
                response.put("SENSOR_TYPE", "BAROMETRIC_PRESSURE");
                break;
            case (byte) 0x0A:
                response.put("SENSOR_TYPE", "SOLAR_RADIATION");
                break;
            case (byte) 0x0B:
                response.put("SENSOR_TYPE", "DEW_POINT");
                break;
            case (byte) 0x0C:
                response.put("SENSOR_TYPE", "RAIN_RATE");
                break;
            case (byte) 0x0D:
                response.put("SENSOR_TYPE", "TIDE_LEVEL");
                break;
            case (byte) 0x0E:
                response.put("SENSOR_TYPE", "WEIGHT");
                break;
            case (byte) 0x0F:
                response.put("SENSOR_TYPE", "VOLTAGE");
                break;
            case (byte) 0x10:
                response.put("SENSOR_TYPE", "CURRENT");
                break;
            case (byte) 0x11:
                response.put("SENSOR_TYPE", "CO2_LEVEL");
                break;
            case (byte) 0x12:
                response.put("SENSOR_TYPE", "AIR_FLOW");
                break;
            case (byte) 0x13:
                response.put("SENSOR_TYPE", "TANK_CAPACITY");
                break;
            case (byte) 0x14:
                response.put("SENSOR_TYPE", "DISTANCE");
                break;
            case (byte) 0x15:
                response.put("SENSOR_TYPE", "ANGLE_POSITION");
                break;
            default:
                logger.debug("Unknown value {} for constant 'SENSOR_TYPE'", String.format("%02X", payload[msgOffset]));
                response.put("SENSOR_TYPE", "UNKNOWN_" + String.format("%02X", payload[msgOffset]));
                break;
        }
        msgOffset += 1;

        // Process 'Level'
        response.put("SIZE", Integer.valueOf(payload[msgOffset] & 0x07));
        response.put("SCALE", Integer.valueOf((payload[msgOffset] & 0x18 >> 3)));
        response.put("PRECISION", Integer.valueOf((payload[msgOffset] & 0xE0 >> 5)));
        msgOffset += 1;

        // Process 'Sensor Value'
        int valSensorValue = 0;
        int lenSensorValue = payload[msgOffset - 1] & 0x07;
        for (int cntSensorValue = 0; cntSensorValue < lenSensorValue; cntSensorValue++) {
            valSensorValue = (valSensorValue << 8) + payload[msgOffset + cntSensorValue];
        }
        response.put("SENSOR_VALUE", valSensorValue);
        msgOffset += lenSensorValue;

        // Return the map of processed response data;
        return response;
    }

}
