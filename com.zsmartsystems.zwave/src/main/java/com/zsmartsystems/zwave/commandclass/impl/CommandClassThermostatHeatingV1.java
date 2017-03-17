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
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_THERMOSTAT_HEATING</b> version <b>1</b>.<br>
 *
 * Command Class Thermostat Heating<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassThermostatHeatingV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassThermostatHeatingV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_THERMOSTAT_HEATING
     */
    public final static int COMMAND_CLASS_KEY = 0x38;

    /**
     * Thermostat Heating Mode Set Command Constant
     */
    public final static int THERMOSTAT_HEATING_MODE_SET = 0x01;
    /**
     * Thermostat Heating Mode Get Command Constant
     */
    public final static int THERMOSTAT_HEATING_MODE_GET = 0x02;
    /**
     * Thermostat Heating Mode Report Command Constant
     */
    public final static int THERMOSTAT_HEATING_MODE_REPORT = 0x03;
    /**
     * Thermostat Heating Setpoint Set Command Constant
     */
    public final static int THERMOSTAT_HEATING_SETPOINT_SET = 0x04;
    /**
     * Thermostat Heating Setpoint Get Command Constant
     */
    public final static int THERMOSTAT_HEATING_SETPOINT_GET = 0x05;
    /**
     * Thermostat Heating Setpoint Report Command Constant
     */
    public final static int THERMOSTAT_HEATING_SETPOINT_REPORT = 0x06;
    /**
     * Thermostat Heating Relay Status Get Command Constant
     */
    public final static int THERMOSTAT_HEATING_RELAY_STATUS_GET = 0x09;
    /**
     * Thermostat Heating Relay Status Report Command Constant
     */
    public final static int THERMOSTAT_HEATING_RELAY_STATUS_REPORT = 0x0A;
    /**
     * Thermostat Heating Status Set Command Constant
     */
    public final static int THERMOSTAT_HEATING_STATUS_SET = 0x0B;
    /**
     * Thermostat Heating Status Get Command Constant
     */
    public final static int THERMOSTAT_HEATING_STATUS_GET = 0x0C;
    /**
     * Thermostat Heating Heating Status Report Command Constant
     */
    public final static int THERMOSTAT_HEATING_STATUS_REPORT = 0x0D;
    /**
     * Thermostat Heating Timed Off Set Command Constant
     */
    public final static int THERMOSTAT_HEATING_TIMED_OFF_SET = 0x11;

    /**
     * Creates a new message with the THERMOSTAT_HEATING_MODE_SET command.<br>
     *
     * Thermostat Heating Mode Set<br>
     *
     *
     * @param mode {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingModeSet(String mode) {
        logger.debug("Creating command message THERMOSTAT_HEATING_MODE_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_MODE_SET);

        // Process 'Mode'
        switch (mode) {
            case "OFF":
                outputData.write(0x00);
                break;
            case "OFF_TIMED":
                outputData.write(0x01);
                break;
            case "OFF_3_HOURS":
                outputData.write(0x02);
                break;
            case "ANTI_FREEZE":
                outputData.write(0x03);
                break;
            case "MANUAL":
                outputData.write(0x04);
                break;
            case "TEMPORARY_MANUAL":
                outputData.write(0x05);
                break;
            case "AUTOMATIC":
                outputData.write(0x06);
                break;
            case "MANUAL_TIMED":
                outputData.write(0x07);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for mode: " + mode);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_MODE_SET command<br>
     *
     * Thermostat Heating Mode Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>MODE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingModeSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Mode'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("MODE", "OFF");
                break;
            case (byte) 0x01:
                response.put("MODE", "OFF_TIMED");
                break;
            case (byte) 0x02:
                response.put("MODE", "OFF_3_HOURS");
                break;
            case (byte) 0x03:
                response.put("MODE", "ANTI_FREEZE");
                break;
            case (byte) 0x04:
                response.put("MODE", "MANUAL");
                break;
            case (byte) 0x05:
                response.put("MODE", "TEMPORARY_MANUAL");
                break;
            case (byte) 0x06:
                response.put("MODE", "AUTOMATIC");
                break;
            case (byte) 0x07:
                response.put("MODE", "MANUAL_TIMED");
                break;
            default:
                logger.debug("Unknown value {} for constant 'MODE'", String.format("%02X", payload[2]));
                response.put("MODE", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_HEATING_MODE_GET command.<br>
     *
     * Thermostat Heating Mode Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingModeGet() {
        logger.debug("Creating command message THERMOSTAT_HEATING_MODE_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_MODE_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_MODE_GET command<br>
     *
     * Thermostat Heating Mode Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingModeGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_HEATING_MODE_REPORT command.<br>
     *
     * Thermostat Heating Mode Report<br>
     *
     *
     * @param mode {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingModeReport(String mode) {
        logger.debug("Creating command message THERMOSTAT_HEATING_MODE_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_MODE_REPORT);

        // Process 'Mode'
        switch (mode) {
            case "OFF":
                outputData.write(0x00);
                break;
            case "OFF_TIMED":
                outputData.write(0x01);
                break;
            case "OFF_3_HOURS":
                outputData.write(0x02);
                break;
            case "ANTI_FREEZE":
                outputData.write(0x03);
                break;
            case "MANUAL":
                outputData.write(0x04);
                break;
            case "TEMPORARY_MANUAL":
                outputData.write(0x05);
                break;
            case "AUTOMATIC":
                outputData.write(0x06);
                break;
            case "MANUAL_TIMED":
                outputData.write(0x07);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for mode: " + mode);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_MODE_REPORT command<br>
     *
     * Thermostat Heating Mode Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>MODE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingModeReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Mode'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("MODE", "OFF");
                break;
            case (byte) 0x01:
                response.put("MODE", "OFF_TIMED");
                break;
            case (byte) 0x02:
                response.put("MODE", "OFF_3_HOURS");
                break;
            case (byte) 0x03:
                response.put("MODE", "ANTI_FREEZE");
                break;
            case (byte) 0x04:
                response.put("MODE", "MANUAL");
                break;
            case (byte) 0x05:
                response.put("MODE", "TEMPORARY_MANUAL");
                break;
            case (byte) 0x06:
                response.put("MODE", "AUTOMATIC");
                break;
            case (byte) 0x07:
                response.put("MODE", "MANUAL_TIMED");
                break;
            default:
                logger.debug("Unknown value {} for constant 'MODE'", String.format("%02X", payload[2]));
                response.put("MODE", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_HEATING_SETPOINT_SET command.<br>
     *
     * Thermostat Heating Setpoint Set<br>
     *
     *
     * @param setpointNr {@link Integer}
     * @param size {@link Integer}
     * @param scale {@link Integer}
     * @param precision {@link Integer}
     * @param value {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingSetpointSet(Integer setpointNr, Integer size, Integer scale,
            Integer precision, byte[] value) {
        logger.debug("Creating command message THERMOSTAT_HEATING_SETPOINT_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_SETPOINT_SET);

        // Process 'Setpoint Nr'
        outputData.write(setpointNr);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= size & 0x07;
        valProperties1 |= ((scale << 3) & 0x18);
        valProperties1 |= ((precision << 5) & 0xE0);
        outputData.write(valProperties1);

        // Process 'Value'
        try {
            outputData.write(value);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_SETPOINT_SET command<br>
     *
     * Thermostat Heating Setpoint Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SETPOINT_NR {@link Integer}
     * <li>SIZE {@link Integer}
     * <li>SCALE {@link Integer}
     * <li>PRECISION {@link Integer}
     * <li>VALUE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingSetpointSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Setpoint Nr'
        response.put("SETPOINT_NR", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties1'
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
     * Creates a new message with the THERMOSTAT_HEATING_SETPOINT_GET command.<br>
     *
     * Thermostat Heating Setpoint Get<br>
     *
     *
     * @param setpointNr {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingSetpointGet(Integer setpointNr) {
        logger.debug("Creating command message THERMOSTAT_HEATING_SETPOINT_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_SETPOINT_GET);

        // Process 'Setpoint Nr'
        outputData.write(setpointNr);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_SETPOINT_GET command<br>
     *
     * Thermostat Heating Setpoint Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SETPOINT_NR {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingSetpointGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Setpoint Nr'
        response.put("SETPOINT_NR", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_HEATING_SETPOINT_REPORT command.<br>
     *
     * Thermostat Heating Setpoint Report<br>
     *
     *
     * @param setpointNr {@link Integer}
     * @param size {@link Integer}
     * @param scale {@link Integer}
     * @param precision {@link Integer}
     * @param value {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingSetpointReport(Integer setpointNr, Integer size, Integer scale,
            Integer precision, byte[] value) {
        logger.debug("Creating command message THERMOSTAT_HEATING_SETPOINT_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_SETPOINT_REPORT);

        // Process 'Setpoint Nr'
        outputData.write(setpointNr);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= size & 0x07;
        valProperties1 |= ((scale << 3) & 0x18);
        valProperties1 |= ((precision << 5) & 0xE0);
        outputData.write(valProperties1);

        // Process 'Value'
        try {
            outputData.write(value);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_SETPOINT_REPORT command<br>
     *
     * Thermostat Heating Setpoint Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SETPOINT_NR {@link Integer}
     * <li>SIZE {@link Integer}
     * <li>SCALE {@link Integer}
     * <li>PRECISION {@link Integer}
     * <li>VALUE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingSetpointReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Setpoint Nr'
        response.put("SETPOINT_NR", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties1'
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
     * Creates a new message with the THERMOSTAT_HEATING_RELAY_STATUS_GET command.<br>
     *
     * Thermostat Heating Relay Status Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingRelayStatusGet() {
        logger.debug("Creating command message THERMOSTAT_HEATING_RELAY_STATUS_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_RELAY_STATUS_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_RELAY_STATUS_GET command<br>
     *
     * Thermostat Heating Relay Status Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingRelayStatusGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_HEATING_RELAY_STATUS_REPORT command.<br>
     *
     * Thermostat Heating Relay Status Report<br>
     *
     *
     * @param relayStatus {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingRelayStatusReport(String relayStatus) {
        logger.debug("Creating command message THERMOSTAT_HEATING_RELAY_STATUS_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_RELAY_STATUS_REPORT);

        // Process 'Relay Status'
        switch (relayStatus) {
            case "OFF":
                outputData.write(0x00);
                break;
            case "ON":
                outputData.write(0x01);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for relayStatus: " + relayStatus);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_RELAY_STATUS_REPORT command<br>
     *
     * Thermostat Heating Relay Status Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>RELAY_STATUS {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingRelayStatusReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Relay Status'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("RELAY_STATUS", "OFF");
                break;
            case (byte) 0x01:
                response.put("RELAY_STATUS", "ON");
                break;
            default:
                logger.debug("Unknown value {} for constant 'RELAY_STATUS'", String.format("%02X", payload[2]));
                response.put("RELAY_STATUS", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_HEATING_STATUS_SET command.<br>
     *
     * Thermostat Heating Status Set<br>
     *
     *
     * @param status {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingStatusSet(String status) {
        logger.debug("Creating command message THERMOSTAT_HEATING_STATUS_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_STATUS_SET);

        // Process 'Status'
        switch (status) {
            case "HEATING":
                outputData.write(0x00);
                break;
            case "COOLING":
                outputData.write(0x01);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for status: " + status);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_STATUS_SET command<br>
     *
     * Thermostat Heating Status Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>STATUS {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingStatusSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Status'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("STATUS", "HEATING");
                break;
            case (byte) 0x01:
                response.put("STATUS", "COOLING");
                break;
            default:
                logger.debug("Unknown value {} for constant 'STATUS'", String.format("%02X", payload[2]));
                response.put("STATUS", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_HEATING_STATUS_GET command.<br>
     *
     * Thermostat Heating Status Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingStatusGet() {
        logger.debug("Creating command message THERMOSTAT_HEATING_STATUS_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_STATUS_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_STATUS_GET command<br>
     *
     * Thermostat Heating Status Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingStatusGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_HEATING_STATUS_REPORT command.<br>
     *
     * Thermostat Heating Heating Status Report<br>
     *
     *
     * @param status {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingStatusReport(String status) {
        logger.debug("Creating command message THERMOSTAT_HEATING_STATUS_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_STATUS_REPORT);

        // Process 'Status'
        switch (status) {
            case "HEATING":
                outputData.write(0x00);
                break;
            case "COOLING":
                outputData.write(0x01);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for status: " + status);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_STATUS_REPORT command<br>
     *
     * Thermostat Heating Heating Status Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>STATUS {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingStatusReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Status'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("STATUS", "HEATING");
                break;
            case (byte) 0x01:
                response.put("STATUS", "COOLING");
                break;
            default:
                logger.debug("Unknown value {} for constant 'STATUS'", String.format("%02X", payload[2]));
                response.put("STATUS", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the THERMOSTAT_HEATING_TIMED_OFF_SET command.<br>
     *
     * Thermostat Heating Timed Off Set<br>
     *
     *
     * @param minutes {@link Integer}
     * @param hours {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatHeatingTimedOffSet(Integer minutes, Integer hours) {
        logger.debug("Creating command message THERMOSTAT_HEATING_TIMED_OFF_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_HEATING_TIMED_OFF_SET);

        // Process 'Minutes'
        outputData.write(minutes);

        // Process 'Hours'
        outputData.write(hours);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_HEATING_TIMED_OFF_SET command<br>
     *
     * Thermostat Heating Timed Off Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>MINUTES {@link Integer}
     * <li>HOURS {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatHeatingTimedOffSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Minutes'
        response.put("MINUTES", Integer.valueOf(payload[2]));

        // Process 'Hours'
        response.put("HOURS", Integer.valueOf(payload[3]));

        // Return the map of processed response data;
        return response;
    }

}
