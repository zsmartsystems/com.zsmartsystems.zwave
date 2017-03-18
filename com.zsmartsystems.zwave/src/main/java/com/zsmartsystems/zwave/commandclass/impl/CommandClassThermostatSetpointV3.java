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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_THERMOSTAT_SETPOINT</b> version <b>3</b>.<br>
 * <p>
 * Command Class Thermostat Setpoint<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassThermostatSetpointV3 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassThermostatSetpointV3.class);

    /**
     * Integer command class key for COMMAND_CLASS_THERMOSTAT_SETPOINT
     */
    public final static int COMMAND_CLASS_KEY = 0x43;

    /**
     * Thermostat Setpoint Set Command Constant
     */
    public final static int THERMOSTAT_SETPOINT_SET = 0x01;
    /**
     * Thermostat Setpoint Get Command Constant
     */
    public final static int THERMOSTAT_SETPOINT_GET = 0x02;
    /**
     * Thermostat Setpoint Report Command Constant
     */
    public final static int THERMOSTAT_SETPOINT_REPORT = 0x03;
    /**
     * Thermostat Setpoint Supported Get Command Constant
     */
    public final static int THERMOSTAT_SETPOINT_SUPPORTED_GET = 0x04;
    /**
     * Thermostat Setpoint Supported Report Command Constant
     */
    public final static int THERMOSTAT_SETPOINT_SUPPORTED_REPORT = 0x05;
    /**
     * Thermostat Setpoint Capabilities Get Command Constant
     */
    public final static int THERMOSTAT_SETPOINT_CAPABILITIES_GET = 0x09;
    /**
     * Thermostat Setpoint Capabilities Report Command Constant
     */
    public final static int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT = 0x0A;

    /**
     * Creates a new message with the THERMOSTAT_SETPOINT_SET command.<br>
     * <p>
     * Thermostat Setpoint Set<br>
     *
     * @param setpointType {@link String}
     * @param size {@link Integer}
     * @param scale {@link Integer}
     * @param precision {@link Integer}
     * @param value {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatSetpointSet(String setpointType, Integer size, Integer scale, Integer precision,
            byte[] value) {
        logger.debug("Creating command message THERMOSTAT_SETPOINT_SET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_SETPOINT_SET);

        // Process 'Level'
        int valsetpointType;
        switch (setpointType) {
            case "NOT_SUPPORTED":
                valsetpointType = 0;
                break;
            case "HEATING_1":
                valsetpointType = 1;
                break;
            case "COOLING_1":
                valsetpointType = 2;
                break;
            case "NOT_SUPPORTED1":
                valsetpointType = 3;
                break;
            case "NOT_SUPPORTED2":
                valsetpointType = 4;
                break;
            case "NOT_SUPPORTED3":
                valsetpointType = 5;
                break;
            case "NOT_SUPPORTED4":
                valsetpointType = 6;
                break;
            case "FURNACE":
                valsetpointType = 7;
                break;
            case "DRY_AIR":
                valsetpointType = 8;
                break;
            case "MOIST_AIR":
                valsetpointType = 9;
                break;
            case "AUTO_CHANGEOVER":
                valsetpointType = 10;
                break;
            case "ENERGY_SAVE_HEATING":
                valsetpointType = 11;
                break;
            case "ENERGY_SAVE_COOLING":
                valsetpointType = 12;
                break;
            case "AWAY_HEATING":
                valsetpointType = 13;
                break;
            case "AWAY_COOLING":
                valsetpointType = 14;
                break;
            case "FULL_POWER":
                valsetpointType = 15;
                break;
            default:
                throw new IllegalArgumentException("Unknown enum value for setpointType: " + setpointType);
        }
        outputData.write(valsetpointType & 0x0F);

        // Process 'Level2'
        int valLevel2 = 0;
        valLevel2 |= size & 0x07;
        valLevel2 |= ((scale << 3) & 0x18);
        valLevel2 |= ((precision << 5) & 0xE0);
        outputData.write(valLevel2);

        // Process 'Value'
        try {
            outputData.write(value);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_SETPOINT_SET command<br>
     * <p>
     * Thermostat Setpoint Set<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SETPOINT_TYPE {@link String}
     * <li>SIZE {@link Integer}
     * <li>SCALE {@link Integer}
     * <li>PRECISION {@link Integer}
     * <li>VALUE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatSetpointSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Level'
        switch ((int) payload[msgOffset] & 0x0F) {
            case 0x00:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED");
                break;
            case 0x01:
                response.put("SETPOINT_TYPE", "HEATING_1");
                break;
            case 0x02:
                response.put("SETPOINT_TYPE", "COOLING_1");
                break;
            case 0x03:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED1");
                break;
            case 0x04:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED2");
                break;
            case 0x05:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED3");
                break;
            case 0x06:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED4");
                break;
            case 0x07:
                response.put("SETPOINT_TYPE", "FURNACE");
                break;
            case 0x08:
                response.put("SETPOINT_TYPE", "DRY_AIR");
                break;
            case 0x09:
                response.put("SETPOINT_TYPE", "MOIST_AIR");
                break;
            case 0x0A:
                response.put("SETPOINT_TYPE", "AUTO_CHANGEOVER");
                break;
            case 0x0B:
                response.put("SETPOINT_TYPE", "ENERGY_SAVE_HEATING");
                break;
            case 0x0C:
                response.put("SETPOINT_TYPE", "ENERGY_SAVE_COOLING");
                break;
            case 0x0D:
                response.put("SETPOINT_TYPE", "AWAY_HEATING");
                break;
            case 0x0E:
                response.put("SETPOINT_TYPE", "AWAY_COOLING");
                break;
            case 0x0F:
                response.put("SETPOINT_TYPE", "FULL_POWER");
                break;
            default:
                logger.debug("Unknown enum value {} for SETPOINT_TYPE", String.format("0x%02X", msgOffset));
        }
        msgOffset += 1;

        // Process 'Level2'
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

    /**
     * Creates a new message with the THERMOSTAT_SETPOINT_GET command.<br>
     * <p>
     * Thermostat Setpoint Get<br>
     *
     * @param setpointType {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatSetpointGet(String setpointType) {
        logger.debug("Creating command message THERMOSTAT_SETPOINT_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_SETPOINT_GET);

        // Process 'Level'
        int valsetpointType;
        switch (setpointType) {
            case "NOT_SUPPORTED":
                valsetpointType = 0;
                break;
            case "HEATING_1":
                valsetpointType = 1;
                break;
            case "COOLING_1":
                valsetpointType = 2;
                break;
            case "NOT_SUPPORTED1":
                valsetpointType = 3;
                break;
            case "NOT_SUPPORTED2":
                valsetpointType = 4;
                break;
            case "NOT_SUPPORTED3":
                valsetpointType = 5;
                break;
            case "NOT_SUPPORTED4":
                valsetpointType = 6;
                break;
            case "FURNACE":
                valsetpointType = 7;
                break;
            case "DRY_AIR":
                valsetpointType = 8;
                break;
            case "MOIST_AIR":
                valsetpointType = 9;
                break;
            case "AUTO_CHANGEOVER":
                valsetpointType = 10;
                break;
            case "ENERGY_SAVE_HEATING":
                valsetpointType = 11;
                break;
            case "ENERGY_SAVE_COOLING":
                valsetpointType = 12;
                break;
            case "AWAY_HEATING":
                valsetpointType = 13;
                break;
            case "AWAY_COOLING":
                valsetpointType = 14;
                break;
            case "FULL_POWER":
                valsetpointType = 15;
                break;
            default:
                throw new IllegalArgumentException("Unknown enum value for setpointType: " + setpointType);
        }
        outputData.write(valsetpointType & 0x0F);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_SETPOINT_GET command<br>
     * <p>
     * Thermostat Setpoint Get<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SETPOINT_TYPE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatSetpointGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Level'
        switch ((int) payload[2] & 0x0F) {
            case 0x00:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED");
                break;
            case 0x01:
                response.put("SETPOINT_TYPE", "HEATING_1");
                break;
            case 0x02:
                response.put("SETPOINT_TYPE", "COOLING_1");
                break;
            case 0x03:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED1");
                break;
            case 0x04:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED2");
                break;
            case 0x05:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED3");
                break;
            case 0x06:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED4");
                break;
            case 0x07:
                response.put("SETPOINT_TYPE", "FURNACE");
                break;
            case 0x08:
                response.put("SETPOINT_TYPE", "DRY_AIR");
                break;
            case 0x09:
                response.put("SETPOINT_TYPE", "MOIST_AIR");
                break;
            case 0x0A:
                response.put("SETPOINT_TYPE", "AUTO_CHANGEOVER");
                break;
            case 0x0B:
                response.put("SETPOINT_TYPE", "ENERGY_SAVE_HEATING");
                break;
            case 0x0C:
                response.put("SETPOINT_TYPE", "ENERGY_SAVE_COOLING");
                break;
            case 0x0D:
                response.put("SETPOINT_TYPE", "AWAY_HEATING");
                break;
            case 0x0E:
                response.put("SETPOINT_TYPE", "AWAY_COOLING");
                break;
            case 0x0F:
                response.put("SETPOINT_TYPE", "FULL_POWER");
                break;
            default:
                logger.debug("Unknown enum value {} for SETPOINT_TYPE", String.format("0x%02X", 2));
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_SETPOINT_REPORT command.<br>
     * <p>
     * Thermostat Setpoint Report<br>
     *
     * @param setpointType {@link String}
     * @param size {@link Integer}
     * @param scale {@link Integer}
     * @param precision {@link Integer}
     * @param value {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatSetpointReport(String setpointType, Integer size, Integer scale, Integer precision,
            byte[] value) {
        logger.debug("Creating command message THERMOSTAT_SETPOINT_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_SETPOINT_REPORT);

        // Process 'Level'
        int valsetpointType;
        switch (setpointType) {
            case "NOT_SUPPORTED":
                valsetpointType = 0;
                break;
            case "HEATING_1":
                valsetpointType = 1;
                break;
            case "COOLING_1":
                valsetpointType = 2;
                break;
            case "NOT_SUPPORTED1":
                valsetpointType = 3;
                break;
            case "NOT_SUPPORTED2":
                valsetpointType = 4;
                break;
            case "NOT_SUPPORTED3":
                valsetpointType = 5;
                break;
            case "NOT_SUPPORTED4":
                valsetpointType = 6;
                break;
            case "FURNACE":
                valsetpointType = 7;
                break;
            case "DRY_AIR":
                valsetpointType = 8;
                break;
            case "MOIST_AIR":
                valsetpointType = 9;
                break;
            case "AUTO_CHANGEOVER":
                valsetpointType = 10;
                break;
            case "ENERGY_SAVE_HEATING":
                valsetpointType = 11;
                break;
            case "ENERGY_SAVE_COOLING":
                valsetpointType = 12;
                break;
            case "AWAY_HEATING":
                valsetpointType = 13;
                break;
            case "AWAY_COOLING":
                valsetpointType = 14;
                break;
            case "FULL_POWER":
                valsetpointType = 15;
                break;
            default:
                throw new IllegalArgumentException("Unknown enum value for setpointType: " + setpointType);
        }
        outputData.write(valsetpointType & 0x0F);

        // Process 'Level2'
        int valLevel2 = 0;
        valLevel2 |= size & 0x07;
        valLevel2 |= ((scale << 3) & 0x18);
        valLevel2 |= ((precision << 5) & 0xE0);
        outputData.write(valLevel2);

        // Process 'Value'
        try {
            outputData.write(value);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_SETPOINT_REPORT command<br>
     * <p>
     * Thermostat Setpoint Report<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SETPOINT_TYPE {@link String}
     * <li>SIZE {@link Integer}
     * <li>SCALE {@link Integer}
     * <li>PRECISION {@link Integer}
     * <li>VALUE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatSetpointReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Level'
        switch ((int) payload[msgOffset] & 0x0F) {
            case 0x00:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED");
                break;
            case 0x01:
                response.put("SETPOINT_TYPE", "HEATING_1");
                break;
            case 0x02:
                response.put("SETPOINT_TYPE", "COOLING_1");
                break;
            case 0x03:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED1");
                break;
            case 0x04:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED2");
                break;
            case 0x05:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED3");
                break;
            case 0x06:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED4");
                break;
            case 0x07:
                response.put("SETPOINT_TYPE", "FURNACE");
                break;
            case 0x08:
                response.put("SETPOINT_TYPE", "DRY_AIR");
                break;
            case 0x09:
                response.put("SETPOINT_TYPE", "MOIST_AIR");
                break;
            case 0x0A:
                response.put("SETPOINT_TYPE", "AUTO_CHANGEOVER");
                break;
            case 0x0B:
                response.put("SETPOINT_TYPE", "ENERGY_SAVE_HEATING");
                break;
            case 0x0C:
                response.put("SETPOINT_TYPE", "ENERGY_SAVE_COOLING");
                break;
            case 0x0D:
                response.put("SETPOINT_TYPE", "AWAY_HEATING");
                break;
            case 0x0E:
                response.put("SETPOINT_TYPE", "AWAY_COOLING");
                break;
            case 0x0F:
                response.put("SETPOINT_TYPE", "FULL_POWER");
                break;
            default:
                logger.debug("Unknown enum value {} for SETPOINT_TYPE", String.format("0x%02X", msgOffset));
        }
        msgOffset += 1;

        // Process 'Level2'
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

    /**
     * Creates a new message with the THERMOSTAT_SETPOINT_SUPPORTED_GET command.<br>
     * <p>
     * Thermostat Setpoint Supported Get<br>
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatSetpointSupportedGet() {
        logger.debug("Creating command message THERMOSTAT_SETPOINT_SUPPORTED_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_SETPOINT_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_SETPOINT_SUPPORTED_GET command<br>
     * <p>
     * Thermostat Setpoint Supported Get<br>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatSetpointSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_SETPOINT_SUPPORTED_REPORT command.<br>
     * <p>
     * Thermostat Setpoint Supported Report<br>
     *
     * @param bitMask {@link List<String>}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatSetpointSupportedReport(List<String> bitMask) {
        logger.debug("Creating command message THERMOSTAT_SETPOINT_SUPPORTED_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_SETPOINT_SUPPORTED_REPORT);

        // Process 'Bit Mask'
        int valBitMask = 0;
        valBitMask |= (bitMask.contains("NONE") ? 0x01 : 0);
        valBitMask |= (bitMask.contains("HEATING") ? 0x02 : 0);
        valBitMask |= (bitMask.contains("COOLING") ? 0x04 : 0);
        valBitMask |= (bitMask.contains("FURNACE") ? 0x80 : 0);
        outputData.write(valBitMask);
        valBitMask = 0;
        valBitMask |= (bitMask.contains("DRY_AIR") ? 0x01 : 0);
        valBitMask |= (bitMask.contains("MOIST_AIR") ? 0x02 : 0);
        valBitMask |= (bitMask.contains("AUTO_CHANGEOVER") ? 0x04 : 0);
        valBitMask |= (bitMask.contains("ENERGY_SAVE_HEATING") ? 0x08 : 0);
        valBitMask |= (bitMask.contains("ENERGY_SAVE_COOLING") ? 0x10 : 0);
        valBitMask |= (bitMask.contains("AWAY_HEATING") ? 0x20 : 0);
        valBitMask |= (bitMask.contains("AWAY_COOLING") ? 0x40 : 0);
        valBitMask |= (bitMask.contains("FULL_POWER") ? 0x80 : 0);
        outputData.write(valBitMask);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_SETPOINT_SUPPORTED_REPORT command<br>
     * <p>
     * Thermostat Setpoint Supported Report<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>BIT_MASK {@link List}<{@link String}>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatSetpointSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Bit Mask'
        List<String> responseBitMask = new ArrayList<String>();
        int cntBitMask = 0;
        while (cntBitMask < payload.length - 2) {
            if ((payload[2 + (cntBitMask / 8)] & cntBitMask % 8) == 0) {
                continue;
            }
            switch (cntBitMask) {
                case 0x00:
                    responseBitMask.add("NONE");
                    break;
                case 0x01:
                    responseBitMask.add("HEATING");
                    break;
                case 0x02:
                    responseBitMask.add("COOLING");
                    break;
                case 0x07:
                    responseBitMask.add("FURNACE");
                    break;
                case 0x08:
                    responseBitMask.add("DRY_AIR");
                    break;
                case 0x09:
                    responseBitMask.add("MOIST_AIR");
                    break;
                case 0x0A:
                    responseBitMask.add("AUTO_CHANGEOVER");
                    break;
                case 0x0B:
                    responseBitMask.add("ENERGY_SAVE_HEATING");
                    break;
                case 0x0C:
                    responseBitMask.add("ENERGY_SAVE_COOLING");
                    break;
                case 0x0D:
                    responseBitMask.add("AWAY_HEATING");
                    break;
                case 0x0E:
                    responseBitMask.add("AWAY_COOLING");
                    break;
                case 0x0F:
                    responseBitMask.add("FULL_POWER");
                    break;
                default:
                    responseBitMask.add("BITMASK_" + cntBitMask);
                    break;
            }
        }
        response.put("BIT_MASK", responseBitMask);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_SETPOINT_CAPABILITIES_GET command.<br>
     * <p>
     * Thermostat Setpoint Capabilities Get<br>
     *
     * @param setpointType {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatSetpointCapabilitiesGet(String setpointType) {
        logger.debug("Creating command message THERMOSTAT_SETPOINT_CAPABILITIES_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_SETPOINT_CAPABILITIES_GET);

        // Process 'Properties1'
        int valsetpointType;
        switch (setpointType) {
            case "NOT_SUPPORTED":
                valsetpointType = 0;
                break;
            case "HEATING_1":
                valsetpointType = 1;
                break;
            case "COOLING_1":
                valsetpointType = 2;
                break;
            case "NOT_SUPPORTED1":
                valsetpointType = 3;
                break;
            case "NOT_SUPPORTED2":
                valsetpointType = 4;
                break;
            case "NOT_SUPPORTED3":
                valsetpointType = 5;
                break;
            case "NOT_SUPPORTED4":
                valsetpointType = 6;
                break;
            case "FURNACE":
                valsetpointType = 7;
                break;
            case "DRY_AIR":
                valsetpointType = 8;
                break;
            case "MOIST_AIR":
                valsetpointType = 9;
                break;
            case "AUTO_CHANGEOVER":
                valsetpointType = 10;
                break;
            case "ENERGY_SAVE_HEATING":
                valsetpointType = 11;
                break;
            case "ENERGY_SAVE_COOLING":
                valsetpointType = 12;
                break;
            case "AWAY_HEATING":
                valsetpointType = 13;
                break;
            case "AWAY_COOLING":
                valsetpointType = 14;
                break;
            case "FULL_POWER":
                valsetpointType = 15;
                break;
            default:
                throw new IllegalArgumentException("Unknown enum value for setpointType: " + setpointType);
        }
        outputData.write(valsetpointType & 0x0F);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_SETPOINT_CAPABILITIES_GET command<br>
     * <p>
     * Thermostat Setpoint Capabilities Get<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SETPOINT_TYPE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatSetpointCapabilitiesGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Properties1'
        switch ((int) payload[2] & 0x0F) {
            case 0x00:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED");
                break;
            case 0x01:
                response.put("SETPOINT_TYPE", "HEATING_1");
                break;
            case 0x02:
                response.put("SETPOINT_TYPE", "COOLING_1");
                break;
            case 0x03:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED1");
                break;
            case 0x04:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED2");
                break;
            case 0x05:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED3");
                break;
            case 0x06:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED4");
                break;
            case 0x07:
                response.put("SETPOINT_TYPE", "FURNACE");
                break;
            case 0x08:
                response.put("SETPOINT_TYPE", "DRY_AIR");
                break;
            case 0x09:
                response.put("SETPOINT_TYPE", "MOIST_AIR");
                break;
            case 0x0A:
                response.put("SETPOINT_TYPE", "AUTO_CHANGEOVER");
                break;
            case 0x0B:
                response.put("SETPOINT_TYPE", "ENERGY_SAVE_HEATING");
                break;
            case 0x0C:
                response.put("SETPOINT_TYPE", "ENERGY_SAVE_COOLING");
                break;
            case 0x0D:
                response.put("SETPOINT_TYPE", "AWAY_HEATING");
                break;
            case 0x0E:
                response.put("SETPOINT_TYPE", "AWAY_COOLING");
                break;
            case 0x0F:
                response.put("SETPOINT_TYPE", "FULL_POWER");
                break;
            default:
                logger.debug("Unknown enum value {} for SETPOINT_TYPE", String.format("0x%02X", 2));
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_SETPOINT_CAPABILITIES_REPORT command.<br>
     * <p>
     * Thermostat Setpoint Capabilities Report<br>
     *
     * @param setpointType {@link String}
     * @param size1 {@link Integer}
     * @param scale1 {@link Integer}
     * @param precision1 {@link Integer}
     * @param minValue {@link byte[]}
     * @param size2 {@link Integer}
     * @param scale2 {@link Integer}
     * @param precision2 {@link Integer}
     * @param maxvalue {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatSetpointCapabilitiesReport(String setpointType, Integer size1, Integer scale1,
            Integer precision1, byte[] minValue, Integer size2, Integer scale2, Integer precision2, byte[] maxvalue) {
        logger.debug("Creating command message THERMOSTAT_SETPOINT_CAPABILITIES_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_SETPOINT_CAPABILITIES_REPORT);

        // Process 'Properties1'
        int valsetpointType;
        switch (setpointType) {
            case "NOT_SUPPORTED":
                valsetpointType = 0;
                break;
            case "HEATING_1":
                valsetpointType = 1;
                break;
            case "COOLING_1":
                valsetpointType = 2;
                break;
            case "NOT_SUPPORTED1":
                valsetpointType = 3;
                break;
            case "NOT_SUPPORTED2":
                valsetpointType = 4;
                break;
            case "NOT_SUPPORTED3":
                valsetpointType = 5;
                break;
            case "NOT_SUPPORTED4":
                valsetpointType = 6;
                break;
            case "FURNACE":
                valsetpointType = 7;
                break;
            case "DRY_AIR":
                valsetpointType = 8;
                break;
            case "MOIST_AIR":
                valsetpointType = 9;
                break;
            case "AUTO_CHANGEOVER":
                valsetpointType = 10;
                break;
            case "ENERGY_SAVE_HEATING":
                valsetpointType = 11;
                break;
            case "ENERGY_SAVE_COOLING":
                valsetpointType = 12;
                break;
            case "AWAY_HEATING":
                valsetpointType = 13;
                break;
            case "AWAY_COOLING":
                valsetpointType = 14;
                break;
            case "FULL_POWER":
                valsetpointType = 15;
                break;
            default:
                throw new IllegalArgumentException("Unknown enum value for setpointType: " + setpointType);
        }
        outputData.write(valsetpointType & 0x0F);

        // Process 'Properties2'
        int valProperties2 = 0;
        valProperties2 |= size1 & 0x07;
        valProperties2 |= ((scale1 << 3) & 0x18);
        valProperties2 |= ((precision1 << 5) & 0xE0);
        outputData.write(valProperties2);

        // Process 'Min Value'
        try {
            outputData.write(minValue);
        } catch (IOException e) {
        }

        // Process 'Properties3'
        int valProperties3 = 0;
        valProperties3 |= size2 & 0x07;
        valProperties3 |= ((scale2 << 3) & 0x18);
        valProperties3 |= ((precision2 << 5) & 0xE0);
        outputData.write(valProperties3);

        // Process 'MaxValue'
        try {
            outputData.write(maxvalue);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_SETPOINT_CAPABILITIES_REPORT command<br>
     * <p>
     * Thermostat Setpoint Capabilities Report<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SETPOINT_TYPE {@link String}
     * <li>SIZE1 {@link Integer}
     * <li>SCALE1 {@link Integer}
     * <li>PRECISION1 {@link Integer}
     * <li>MIN_VALUE {@link byte[]}
     * <li>SIZE2 {@link Integer}
     * <li>SCALE2 {@link Integer}
     * <li>PRECISION2 {@link Integer}
     * <li>MAXVALUE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatSetpointCapabilitiesReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Properties1'
        switch ((int) payload[msgOffset] & 0x0F) {
            case 0x00:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED");
                break;
            case 0x01:
                response.put("SETPOINT_TYPE", "HEATING_1");
                break;
            case 0x02:
                response.put("SETPOINT_TYPE", "COOLING_1");
                break;
            case 0x03:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED1");
                break;
            case 0x04:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED2");
                break;
            case 0x05:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED3");
                break;
            case 0x06:
                response.put("SETPOINT_TYPE", "NOT_SUPPORTED4");
                break;
            case 0x07:
                response.put("SETPOINT_TYPE", "FURNACE");
                break;
            case 0x08:
                response.put("SETPOINT_TYPE", "DRY_AIR");
                break;
            case 0x09:
                response.put("SETPOINT_TYPE", "MOIST_AIR");
                break;
            case 0x0A:
                response.put("SETPOINT_TYPE", "AUTO_CHANGEOVER");
                break;
            case 0x0B:
                response.put("SETPOINT_TYPE", "ENERGY_SAVE_HEATING");
                break;
            case 0x0C:
                response.put("SETPOINT_TYPE", "ENERGY_SAVE_COOLING");
                break;
            case 0x0D:
                response.put("SETPOINT_TYPE", "AWAY_HEATING");
                break;
            case 0x0E:
                response.put("SETPOINT_TYPE", "AWAY_COOLING");
                break;
            case 0x0F:
                response.put("SETPOINT_TYPE", "FULL_POWER");
                break;
            default:
                logger.debug("Unknown enum value {} for SETPOINT_TYPE", String.format("0x%02X", msgOffset));
        }
        msgOffset += 1;

        // Process 'Properties2'
        response.put("SIZE1", Integer.valueOf(payload[msgOffset] & 0x07));
        response.put("SCALE1", Integer.valueOf((payload[msgOffset] & 0x18 >> 3)));
        response.put("PRECISION1", Integer.valueOf((payload[msgOffset] & 0xE0 >> 5)));
        msgOffset += 1;

        // Process 'Min Value'
        int valMinValue = 0;
        int lenMinValue = payload[msgOffset - 1] & 0x07;
        for (int cntMinValue = 0; cntMinValue < lenMinValue; cntMinValue++) {
            valMinValue = (valMinValue << 8) + payload[msgOffset + cntMinValue];
        }
        response.put("MIN_VALUE", valMinValue);
        msgOffset += lenMinValue;

        // Process 'Properties3'
        response.put("SIZE2", Integer.valueOf(payload[msgOffset] & 0x07));
        response.put("SCALE2", Integer.valueOf((payload[msgOffset] & 0x18 >> 3)));
        response.put("PRECISION2", Integer.valueOf((payload[msgOffset] & 0xE0 >> 5)));
        msgOffset += 1;

        // Process 'MaxValue'
        int valMaxvalue = 0;
        int lenMaxvalue = payload[msgOffset - 1] & 0x07;
        for (int cntMaxvalue = 0; cntMaxvalue < lenMaxvalue; cntMaxvalue++) {
            valMaxvalue = (valMaxvalue << 8) + payload[msgOffset + cntMaxvalue];
        }
        response.put("MAXVALUE", valMaxvalue);
        msgOffset += lenMaxvalue;

        // Return the map of processed response data;
        return response;
    }

}
