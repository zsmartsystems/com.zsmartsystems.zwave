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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_THERMOSTAT_MODE</b> version <b>3</b>.
 * <p>
 * Command Class Thermostat Mode
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x40.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassThermostatModeV3 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassThermostatModeV3.class);

    /**
     * Integer command class key for COMMAND_CLASS_THERMOSTAT_MODE
     */
    public final static int COMMAND_CLASS_KEY = 0x40;

    /**
     * Thermostat Mode Set Command Constant
     */
    public final static int THERMOSTAT_MODE_SET = 0x01;
    /**
     * Thermostat Mode Get Command Constant
     */
    public final static int THERMOSTAT_MODE_GET = 0x02;
    /**
     * Thermostat Mode Report Command Constant
     */
    public final static int THERMOSTAT_MODE_REPORT = 0x03;
    /**
     * Thermostat Mode Supported Get Command Constant
     */
    public final static int THERMOSTAT_MODE_SUPPORTED_GET = 0x04;
    /**
     * Thermostat Mode Supported Report Command Constant
     */
    public final static int THERMOSTAT_MODE_SUPPORTED_REPORT = 0x05;

    /**
     * Map holding constants for ThermostatModeSupportedReportBitMask
     */
    private static Map<Integer, String> constantThermostatModeSupportedReportBitMask = new HashMap<Integer, String>();

    /**
     * Map holding constants for ThermostatModeSetMode
     */
    private static Map<Integer, String> constantThermostatModeSetMode = new HashMap<Integer, String>();

    /**
     * Map holding constants for ThermostatModeReportMode
     */
    private static Map<Integer, String> constantThermostatModeReportMode = new HashMap<Integer, String>();

    static {
        // Constants for ThermostatModeSupportedReportBitMask
        constantThermostatModeSupportedReportBitMask.put(0x00, "OFF");
        constantThermostatModeSupportedReportBitMask.put(0x01, "HEAT");
        constantThermostatModeSupportedReportBitMask.put(0x02, "COOL");
        constantThermostatModeSupportedReportBitMask.put(0x03, "AUTO");
        constantThermostatModeSupportedReportBitMask.put(0x04, "AUXILIARY_EMERGENCY_HEAT");
        constantThermostatModeSupportedReportBitMask.put(0x05, "RESUME");
        constantThermostatModeSupportedReportBitMask.put(0x06, "FAN_ONLY");
        constantThermostatModeSupportedReportBitMask.put(0x07, "FURNACE");
        constantThermostatModeSupportedReportBitMask.put(0x08, "DRY_AIR");
        constantThermostatModeSupportedReportBitMask.put(0x09, "MOIST_AIR");
        constantThermostatModeSupportedReportBitMask.put(0x0A, "AUTO_CHANGEOVER");
        constantThermostatModeSupportedReportBitMask.put(0x0B, "ENERGY_SAVE_HEAT");
        constantThermostatModeSupportedReportBitMask.put(0x0C, "ENERGY_SAVE_COOL");
        constantThermostatModeSupportedReportBitMask.put(0x0D, "AWAY");
        constantThermostatModeSupportedReportBitMask.put(0x1F, "MANUFACTURER_SPECIFC");
        constantThermostatModeSupportedReportBitMask.put(0x0F, "FULL_POWER");

        // Constants for ThermostatModeSetMode
        constantThermostatModeSetMode.put(0x00, "OFF");
        constantThermostatModeSetMode.put(0x01, "HEAT");
        constantThermostatModeSetMode.put(0x02, "COOL");
        constantThermostatModeSetMode.put(0x03, "AUTO");
        constantThermostatModeSetMode.put(0x04, "AUXILIARY_HEAT");
        constantThermostatModeSetMode.put(0x05, "RESUME");
        constantThermostatModeSetMode.put(0x06, "FAN_ONLY");
        constantThermostatModeSetMode.put(0x07, "FURNACE");
        constantThermostatModeSetMode.put(0x08, "DRY_AIR");
        constantThermostatModeSetMode.put(0x09, "MOIST_AIR");
        constantThermostatModeSetMode.put(0x0A, "AUTO_CHANGEOVER");
        constantThermostatModeSetMode.put(0x0B, "ENERGY_SAVE_HEAT");
        constantThermostatModeSetMode.put(0x0C, "ENERGY_SAVE_COOL");
        constantThermostatModeSetMode.put(0x0D, "AWAY");
        constantThermostatModeSetMode.put(0x0E, "FULL_POWER");
        constantThermostatModeSetMode.put(0x0F, "MANUFACTURER_SPECIFC");

        // Constants for ThermostatModeReportMode
        constantThermostatModeReportMode.put(0x00, "OFF");
        constantThermostatModeReportMode.put(0x01, "HEAT");
        constantThermostatModeReportMode.put(0x02, "COOL");
        constantThermostatModeReportMode.put(0x03, "AUTO");
        constantThermostatModeReportMode.put(0x04, "AUXILIARY_HEAT");
        constantThermostatModeReportMode.put(0x05, "RESUME");
        constantThermostatModeReportMode.put(0x06, "FAN_ONLY");
        constantThermostatModeReportMode.put(0x07, "FURNACE");
        constantThermostatModeReportMode.put(0x08, "DRY_AIR");
        constantThermostatModeReportMode.put(0x09, "MOIST_AIR");
        constantThermostatModeReportMode.put(0x0A, "AUTO_CHANGEOVER");
        constantThermostatModeReportMode.put(0x0B, "ENERGY_SAVE_HEAT");
        constantThermostatModeReportMode.put(0x0C, "ENERGY_SAVE_COOL");
        constantThermostatModeReportMode.put(0x0D, "AWAY");
        constantThermostatModeReportMode.put(0x0E, "FULL_POWER");
        constantThermostatModeReportMode.put(0x0F, "MANUFACTURER_SPECIFC");
    }

    /**
     * Creates a new message with the THERMOSTAT_MODE_SET command.
     * <p>
     * Thermostat Mode Set
     *
     * @param mode {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>OFF
     *            <li>HEAT
     *            <li>COOL
     *            <li>AUTO
     *            <li>AUXILIARY_HEAT
     *            <li>RESUME
     *            <li>FAN_ONLY
     *            <li>FURNACE
     *            <li>DRY_AIR
     *            <li>MOIST_AIR
     *            <li>AUTO_CHANGEOVER
     *            <li>ENERGY_SAVE_HEAT
     *            <li>ENERGY_SAVE_COOL
     *            <li>AWAY
     *            <li>FULL_POWER
     *            <li>MANUFACTURER_SPECIFC
     *            </ul>
     * @param noOfManufacturerDataFields {@link Integer}
     * @param manufacturerData {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatModeSet(String mode, Integer noOfManufacturerDataFields, byte[] manufacturerData) {
        logger.debug("Creating command message THERMOSTAT_MODE_SET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_MODE_SET);

        // Process 'Level'
        int valLevel = 0;
        int varMode = Integer.MAX_VALUE;
        for (Integer entry : constantThermostatModeSetMode.keySet()) {
            if (constantThermostatModeSetMode.get(entry).equals(mode)) {
                varMode = entry;
                break;
            }
        }
        if (varMode == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Unknown constant value '" + mode + "' for mode");
        }
        valLevel |= varMode & 0x1F;
        valLevel |= ((noOfManufacturerDataFields << 5) & 0xE0);
        outputData.write(valLevel);

        // Process 'Manufacturer Data'
        if (manufacturerData != null) {
            try {
                outputData.write(manufacturerData);
            } catch (IOException e) {
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_MODE_SET command.
     * <p>
     * Thermostat Mode Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>MODE {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>OFF
     * <li>HEAT
     * <li>COOL
     * <li>AUTO
     * <li>AUXILIARY_HEAT
     * <li>RESUME
     * <li>FAN_ONLY
     * <li>FURNACE
     * <li>DRY_AIR
     * <li>MOIST_AIR
     * <li>AUTO_CHANGEOVER
     * <li>ENERGY_SAVE_HEAT
     * <li>ENERGY_SAVE_COOL
     * <li>AWAY
     * <li>FULL_POWER
     * <li>MANUFACTURER_SPECIFC
     * </ul>
     * <li>NO_OF_MANUFACTURER_DATA_FIELDS {@link Integer}
     * <li>MANUFACTURER_DATA {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatModeSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Level'
        response.put("MODE", constantThermostatModeSetMode.get(payload[msgOffset] & 0x1F));
        response.put("NO_OF_MANUFACTURER_DATA_FIELDS", Integer.valueOf(payload[msgOffset] & 0xE0 >> 5));
        msgOffset += 1;

        // Process 'Manufacturer Data'
        response.put("MANUFACTURER_DATA", Integer.valueOf(payload[msgOffset]));
        msgOffset += payload[msgOffset - 1];

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_MODE_GET command.
     * <p>
     * Thermostat Mode Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatModeGet() {
        logger.debug("Creating command message THERMOSTAT_MODE_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_MODE_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_MODE_GET command.
     * <p>
     * Thermostat Mode Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatModeGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_MODE_REPORT command.
     * <p>
     * Thermostat Mode Report
     *
     * @param mode {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>OFF
     *            <li>HEAT
     *            <li>COOL
     *            <li>AUTO
     *            <li>AUXILIARY_HEAT
     *            <li>RESUME
     *            <li>FAN_ONLY
     *            <li>FURNACE
     *            <li>DRY_AIR
     *            <li>MOIST_AIR
     *            <li>AUTO_CHANGEOVER
     *            <li>ENERGY_SAVE_HEAT
     *            <li>ENERGY_SAVE_COOL
     *            <li>AWAY
     *            <li>FULL_POWER
     *            <li>MANUFACTURER_SPECIFC
     *            </ul>
     * @param noOfManufacturerDataFields {@link Integer}
     * @param manufacturerData {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatModeReport(String mode, Integer noOfManufacturerDataFields,
            byte[] manufacturerData) {
        logger.debug("Creating command message THERMOSTAT_MODE_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_MODE_REPORT);

        // Process 'Level'
        int valLevel = 0;
        int varMode = Integer.MAX_VALUE;
        for (Integer entry : constantThermostatModeReportMode.keySet()) {
            if (constantThermostatModeReportMode.get(entry).equals(mode)) {
                varMode = entry;
                break;
            }
        }
        if (varMode == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Unknown constant value '" + mode + "' for mode");
        }
        valLevel |= varMode & 0x1F;
        valLevel |= ((noOfManufacturerDataFields << 5) & 0xE0);
        outputData.write(valLevel);

        // Process 'Manufacturer Data'
        if (manufacturerData != null) {
            try {
                outputData.write(manufacturerData);
            } catch (IOException e) {
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_MODE_REPORT command.
     * <p>
     * Thermostat Mode Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>MODE {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>OFF
     * <li>HEAT
     * <li>COOL
     * <li>AUTO
     * <li>AUXILIARY_HEAT
     * <li>RESUME
     * <li>FAN_ONLY
     * <li>FURNACE
     * <li>DRY_AIR
     * <li>MOIST_AIR
     * <li>AUTO_CHANGEOVER
     * <li>ENERGY_SAVE_HEAT
     * <li>ENERGY_SAVE_COOL
     * <li>AWAY
     * <li>FULL_POWER
     * <li>MANUFACTURER_SPECIFC
     * </ul>
     * <li>NO_OF_MANUFACTURER_DATA_FIELDS {@link Integer}
     * <li>MANUFACTURER_DATA {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatModeReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Level'
        response.put("MODE", constantThermostatModeReportMode.get(payload[msgOffset] & 0x1F));
        response.put("NO_OF_MANUFACTURER_DATA_FIELDS", Integer.valueOf(payload[msgOffset] & 0xE0 >> 5));
        msgOffset += 1;

        // Process 'Manufacturer Data'
        response.put("MANUFACTURER_DATA", Integer.valueOf(payload[msgOffset]));
        msgOffset += payload[msgOffset - 1];

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_MODE_SUPPORTED_GET command.
     * <p>
     * Thermostat Mode Supported Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatModeSupportedGet() {
        logger.debug("Creating command message THERMOSTAT_MODE_SUPPORTED_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_MODE_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_MODE_SUPPORTED_GET command.
     * <p>
     * Thermostat Mode Supported Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatModeSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_MODE_SUPPORTED_REPORT command.
     * <p>
     * Thermostat Mode Supported Report
     *
     * @param bitMask {@link List<String>}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>OFF
     *            <li>HEAT
     *            <li>COOL
     *            <li>AUTO
     *            <li>AUXILIARY_EMERGENCY_HEAT
     *            <li>RESUME
     *            <li>FAN_ONLY
     *            <li>FURNACE
     *            <li>DRY_AIR
     *            <li>MOIST_AIR
     *            <li>AUTO_CHANGEOVER
     *            <li>ENERGY_SAVE_HEAT
     *            <li>ENERGY_SAVE_COOL
     *            <li>AWAY
     *            <li>MANUFACTURER_SPECIFC
     *            <li>FULL_POWER
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatModeSupportedReport(List<String> bitMask) {
        logger.debug("Creating command message THERMOSTAT_MODE_SUPPORTED_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_MODE_SUPPORTED_REPORT);

        // Process 'Bit Mask'
        int valBitMask = 0;
        for (String value : bitMask) {
            boolean foundBitMask = false;
            for (Integer entry : constantThermostatModeSupportedReportBitMask.keySet()) {
                if (constantThermostatModeSupportedReportBitMask.get(entry).equals(value)) {
                    foundBitMask = true;
                    valBitMask += entry;
                    break;
                }
            }
            if (!foundBitMask) {
                throw new IllegalArgumentException("Unknown constant value '" + bitMask + "' for bitMask");
            }
        }
        outputData.write(valBitMask);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_MODE_SUPPORTED_REPORT command.
     * <p>
     * Thermostat Mode Supported Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>BIT_MASK {@link List}<{@link String}>
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>OFF
     * <li>HEAT
     * <li>COOL
     * <li>AUTO
     * <li>AUXILIARY_EMERGENCY_HEAT
     * <li>RESUME
     * <li>FAN_ONLY
     * <li>FURNACE
     * <li>DRY_AIR
     * <li>MOIST_AIR
     * <li>AUTO_CHANGEOVER
     * <li>ENERGY_SAVE_HEAT
     * <li>ENERGY_SAVE_COOL
     * <li>AWAY
     * <li>MANUFACTURER_SPECIFC
     * <li>FULL_POWER
     * </ul>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatModeSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Bit Mask'
        List<String> responseBitMask = new ArrayList<String>();
        for (int cntBitMask = 0; cntBitMask < (payload.length - 2) * 8; cntBitMask++) {
            if ((payload[2 + (cntBitMask / 8)] & (1 << cntBitMask % 8)) == 0) {
                continue;
            }
            responseBitMask.add(constantThermostatModeSupportedReportBitMask.get(cntBitMask));
        }
        response.put("BIT_MASK", responseBitMask);

        // Return the map of processed response data;
        return response;
    }
}
