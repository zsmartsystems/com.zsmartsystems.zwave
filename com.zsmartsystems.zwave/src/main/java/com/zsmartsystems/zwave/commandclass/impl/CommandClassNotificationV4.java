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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_NOTIFICATION</b> version <b>4</b>.<br>
 *
 * Command Class Notification<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassNotificationV4 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassNotificationV4.class);

    /**
     * Integer command class key for COMMAND_CLASS_NOTIFICATION
     */
    public final static int COMMAND_CLASS_KEY = 0x71;

    /**
     * Event Supported Get Command Constant
     */
    public final static int EVENT_SUPPORTED_GET = 0x01;
    /**
     * Event Supported Report Command Constant
     */
    public final static int EVENT_SUPPORTED_REPORT = 0x02;
    /**
     * Notification Get Command Constant
     */
    public final static int NOTIFICATION_GET = 0x04;
    /**
     * Notification Report Command Constant
     */
    public final static int NOTIFICATION_REPORT = 0x05;
    /**
     * Notification Set Command Constant
     */
    public final static int NOTIFICATION_SET = 0x06;
    /**
     * Notification Supported Get Command Constant
     */
    public final static int NOTIFICATION_SUPPORTED_GET = 0x07;
    /**
     * Notification Supported Report Command Constant
     */
    public final static int NOTIFICATION_SUPPORTED_REPORT = 0x08;

    /**
     * Creates a new message with the EVENT_SUPPORTED_GET command.<br>
     *
     * Event Supported Get<br>
     *
     *
     * @param notificationType {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getEventSupportedGet(String notificationType) {
        logger.debug("Creating command message EVENT_SUPPORTED_GET version 4");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(EVENT_SUPPORTED_GET);

        // Process 'Notification Type'
        switch (notificationType) {
            case "SMOKE":
                outputData.write(0x01);
                break;
            case "CO":
                outputData.write(0x02);
                break;
            case "CO2":
                outputData.write(0x03);
                break;
            case "HEAT":
                outputData.write(0x04);
                break;
            case "WATER":
                outputData.write(0x05);
                break;
            case "ACCESS_CONTROL":
                outputData.write(0x06);
                break;
            case "HOME_SECURITY":
                outputData.write(0x07);
                break;
            case "POWER_MANAGEMENT":
                outputData.write(0x08);
                break;
            case "SYSTEM":
                outputData.write(0x09);
                break;
            case "EMERGENCY":
                outputData.write(0x0A);
                break;
            case "CLOCK":
                outputData.write(0x0B);
                break;
            case "APPLIANCE":
                outputData.write(0x0C);
                break;
            case "HOME_HEALTH":
                outputData.write(0x0D);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for notificationType: " + notificationType);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the EVENT_SUPPORTED_GET command<br>
     *
     * Event Supported Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>NOTIFICATION_TYPE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleEventSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Notification Type'
        switch ((int) payload[2]) {
            case (byte) 0x01:
                response.put("NOTIFICATION_TYPE", "SMOKE");
                break;
            case (byte) 0x02:
                response.put("NOTIFICATION_TYPE", "CO");
                break;
            case (byte) 0x03:
                response.put("NOTIFICATION_TYPE", "CO2");
                break;
            case (byte) 0x04:
                response.put("NOTIFICATION_TYPE", "HEAT");
                break;
            case (byte) 0x05:
                response.put("NOTIFICATION_TYPE", "WATER");
                break;
            case (byte) 0x06:
                response.put("NOTIFICATION_TYPE", "ACCESS_CONTROL");
                break;
            case (byte) 0x07:
                response.put("NOTIFICATION_TYPE", "HOME_SECURITY");
                break;
            case (byte) 0x08:
                response.put("NOTIFICATION_TYPE", "POWER_MANAGEMENT");
                break;
            case (byte) 0x09:
                response.put("NOTIFICATION_TYPE", "SYSTEM");
                break;
            case (byte) 0x0A:
                response.put("NOTIFICATION_TYPE", "EMERGENCY");
                break;
            case (byte) 0x0B:
                response.put("NOTIFICATION_TYPE", "CLOCK");
                break;
            case (byte) 0x0C:
                response.put("NOTIFICATION_TYPE", "APPLIANCE");
                break;
            case (byte) 0x0D:
                response.put("NOTIFICATION_TYPE", "HOME_HEALTH");
                break;
            default:
                logger.debug("Unknown value {} for constant 'NOTIFICATION_TYPE'", String.format("%02X", payload[2]));
                response.put("NOTIFICATION_TYPE", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the EVENT_SUPPORTED_REPORT command.<br>
     *
     * Event Supported Report<br>
     *
     *
     * @param notificationType {@link String}
     * @param bitMask {@link List<Integer>}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getEventSupportedReport(String notificationType, List<Integer> bitMask) {
        logger.debug("Creating command message EVENT_SUPPORTED_REPORT version 4");

        Collections.sort(bitMask);
        int lenBitMask = (bitMask.get(bitMask.size() - 1) / 8) + 1;

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(EVENT_SUPPORTED_REPORT);

        // Process 'Notification Type'
        switch (notificationType) {
            case "SMOKE":
                outputData.write(0x01);
                break;
            case "CO":
                outputData.write(0x02);
                break;
            case "CO2":
                outputData.write(0x03);
                break;
            case "HEAT":
                outputData.write(0x04);
                break;
            case "WATER":
                outputData.write(0x05);
                break;
            case "ACCESS_CONTROL":
                outputData.write(0x06);
                break;
            case "HOME_SECURITY":
                outputData.write(0x07);
                break;
            case "POWER_MANAGEMENT":
                outputData.write(0x08);
                break;
            case "SYSTEM":
                outputData.write(0x09);
                break;
            case "EMERGENCY":
                outputData.write(0x0A);
                break;
            case "CLOCK":
                outputData.write(0x0B);
                break;
            case "APPLIANCE":
                outputData.write(0x0C);
                break;
            case "HOME_HEALTH":
                outputData.write(0x0D);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for notificationType: " + notificationType);
        }

        // Process 'Properties1'
        outputData.write(lenBitMask);

        // Process 'Bit Mask'
        int valBitMask = 0;
        for (int cntBitMask = 1 ; cntBitMask < lenBitMask * 8 ; cntBitMask++) {
            valBitMask |= bitMask.contains(valBitMask) ? (1 << cntBitMask % 8) : 0;
            if (cntBitMask % 8 == 0) {
                outputData.write(valBitMask);
                valBitMask = 0;
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the EVENT_SUPPORTED_REPORT command<br>
     *
     * Event Supported Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>NOTIFICATION_TYPE {@link String}
     * <li>BIT_MASK {@link List}<{@link Integer}>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleEventSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Notification Type'
        switch ((int) payload[2]) {
            case (byte) 0x01:
                response.put("NOTIFICATION_TYPE", "SMOKE");
                break;
            case (byte) 0x02:
                response.put("NOTIFICATION_TYPE", "CO");
                break;
            case (byte) 0x03:
                response.put("NOTIFICATION_TYPE", "CO2");
                break;
            case (byte) 0x04:
                response.put("NOTIFICATION_TYPE", "HEAT");
                break;
            case (byte) 0x05:
                response.put("NOTIFICATION_TYPE", "WATER");
                break;
            case (byte) 0x06:
                response.put("NOTIFICATION_TYPE", "ACCESS_CONTROL");
                break;
            case (byte) 0x07:
                response.put("NOTIFICATION_TYPE", "HOME_SECURITY");
                break;
            case (byte) 0x08:
                response.put("NOTIFICATION_TYPE", "POWER_MANAGEMENT");
                break;
            case (byte) 0x09:
                response.put("NOTIFICATION_TYPE", "SYSTEM");
                break;
            case (byte) 0x0A:
                response.put("NOTIFICATION_TYPE", "EMERGENCY");
                break;
            case (byte) 0x0B:
                response.put("NOTIFICATION_TYPE", "CLOCK");
                break;
            case (byte) 0x0C:
                response.put("NOTIFICATION_TYPE", "APPLIANCE");
                break;
            case (byte) 0x0D:
                response.put("NOTIFICATION_TYPE", "HOME_HEALTH");
                break;
            default:
                logger.debug("Unknown value {} for constant 'NOTIFICATION_TYPE'", String.format("%02X", payload[2]));
                response.put("NOTIFICATION_TYPE", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Process 'Properties1'

        // Process 'Bit Mask'
        List<Integer> responseBitMask = new ArrayList<Integer>();
        int lenBitMask = (payload[-1] & 0x1F) * 8;
        for (int cntBitMask = 0; cntBitMask < lenBitMask; cntBitMask++) {
            if ((payload[4 + (cntBitMask / 8)] & cntBitMask % 8) == 0) {
                continue;
            }
            responseBitMask.add(cntBitMask);
        }
        response.put("BIT_MASK", responseBitMask);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the NOTIFICATION_GET command.<br>
     *
     * Notification Get<br>
     *
     *
     * @param v1AlarmType {@link Integer}
     * @param notificationType {@link String}
     * @param event {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNotificationGet(Integer v1AlarmType, String notificationType, Integer event) {
        logger.debug("Creating command message NOTIFICATION_GET version 4");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NOTIFICATION_GET);

        // Process 'V1 Alarm Type'
        outputData.write(v1AlarmType);

        // Process 'Notification Type'
        switch (notificationType) {
            case "SMOKE":
                outputData.write(0x01);
                break;
            case "CO":
                outputData.write(0x02);
                break;
            case "CO2":
                outputData.write(0x03);
                break;
            case "HEAT":
                outputData.write(0x04);
                break;
            case "WATER":
                outputData.write(0x05);
                break;
            case "ACCESS_CONTROL":
                outputData.write(0x06);
                break;
            case "HOME_SECURITY":
                outputData.write(0x07);
                break;
            case "POWER_MANAGEMENT":
                outputData.write(0x08);
                break;
            case "SYSTEM":
                outputData.write(0x09);
                break;
            case "EMERGENCY":
                outputData.write(0x0A);
                break;
            case "CLOCK":
                outputData.write(0x0B);
                break;
            case "APPLIANCE":
                outputData.write(0x0C);
                break;
            case "HOME_HEALTH":
                outputData.write(0x0D);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for notificationType: " + notificationType);
        }

        // Process 'Event'
        outputData.write(event);

        return outputData.toByteArray();
    }

    /**
     * Creates a new message with the NOTIFICATION_REPORT command.<br>
     *
     * Notification Report<br>
     *
     *
     * @param v1AlarmType {@link Integer}
     * @param v1AlarmLevel {@link Integer}
     * @param notificationStatus {@link String}
     * @param notificationType {@link String}
     * @param event {@link Integer}
     * @param eventParametersLength {@link Integer}
     * @param sequence {@link Boolean}
     * @param eventParameter {@link byte[]}
     * @param sequenceNumber {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNotificationReport(Integer v1AlarmType, Integer v1AlarmLevel, String notificationStatus,
            String notificationType, Integer event, Integer eventParametersLength, Boolean sequence,
            byte[] eventParameter, Integer sequenceNumber) {
        logger.debug("Creating command message NOTIFICATION_REPORT version 4");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NOTIFICATION_REPORT);

        // Process 'V1 Alarm Type'
        outputData.write(v1AlarmType);

        // Process 'V1 Alarm Level'
        outputData.write(v1AlarmLevel);

        // Process 'Reserved'
        // Process 'Notification Status'
        switch (notificationStatus) {
            case "OFF":
                outputData.write(0x00);
                break;
            case "NO_PENDING_NOTIFICATIONS":
                outputData.write(0xFE);
                break;
            case "ON":
                outputData.write(0xFF);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for notificationStatus: " + notificationStatus);
        }

        // Process 'Notification Type'
        switch (notificationType) {
            case "SMOKE":
                outputData.write(0x01);
                break;
            case "CO":
                outputData.write(0x02);
                break;
            case "CO2":
                outputData.write(0x03);
                break;
            case "HEAT":
                outputData.write(0x04);
                break;
            case "WATER":
                outputData.write(0x05);
                break;
            case "ACCESS_CONTROL":
                outputData.write(0x06);
                break;
            case "HOME_SECURITY":
                outputData.write(0x07);
                break;
            case "POWER_MANAGEMENT":
                outputData.write(0x08);
                break;
            case "SYSTEM":
                outputData.write(0x09);
                break;
            case "EMERGENCY":
                outputData.write(0x0A);
                break;
            case "CLOCK":
                outputData.write(0x0B);
                break;
            case "APPLIANCE":
                outputData.write(0x0C);
                break;
            case "HOME_HEALTH":
                outputData.write(0x0D);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for notificationType: " + notificationType);
        }

        // Process 'Event'
        outputData.write(event);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= eventParametersLength & 0x1F;
        valProperties1 |= sequence ? 0x80 : 0;
        outputData.write(valProperties1);

        // Process 'Event Parameter'
        try {
            outputData.write(eventParameter);
        } catch (IOException e) {
        }

        // Process 'Sequence Number'
        outputData.write(sequenceNumber);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NOTIFICATION_REPORT command<br>
     *
     * Notification Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>V1_ALARM_TYPE {@link Integer}
     * <li>V1_ALARM_LEVEL {@link Integer}
     * <li>NOTIFICATION_STATUS {@link String}
     * <li>NOTIFICATION_TYPE {@link String}
     * <li>EVENT {@link Integer}
     * <li>EVENT_PARAMETERS_LENGTH {@link Integer}
     * <li>SEQUENCE {@link Boolean}
     * <li>EVENT_PARAMETER {@link byte[]}
     * <li>SEQUENCE_NUMBER {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleNotificationReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'V1 Alarm Type'
        response.put("V1_ALARM_TYPE", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'V1 Alarm Level'
        response.put("V1_ALARM_LEVEL", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        msgOffset += 1;

        // Process 'Notification Status'
        switch ((int) payload[msgOffset]) {
            case (byte) 0x00:
                response.put("NOTIFICATION_STATUS", "OFF");
                break;
            case (byte) 0xFE:
                response.put("NOTIFICATION_STATUS", "NO_PENDING_NOTIFICATIONS");
                break;
            case (byte) 0xFF:
                response.put("NOTIFICATION_STATUS", "ON");
                break;
            default:
                logger.debug("Unknown value {} for constant 'NOTIFICATION_STATUS'", String.format("%02X", payload[msgOffset]));
                response.put("NOTIFICATION_STATUS", "UNKNOWN_" + String.format("%02X", payload[msgOffset]));
                break;
        }
        msgOffset += 1;

        // Process 'Notification Type'
        switch ((int) payload[msgOffset]) {
            case (byte) 0x01:
                response.put("NOTIFICATION_TYPE", "SMOKE");
                break;
            case (byte) 0x02:
                response.put("NOTIFICATION_TYPE", "CO");
                break;
            case (byte) 0x03:
                response.put("NOTIFICATION_TYPE", "CO2");
                break;
            case (byte) 0x04:
                response.put("NOTIFICATION_TYPE", "HEAT");
                break;
            case (byte) 0x05:
                response.put("NOTIFICATION_TYPE", "WATER");
                break;
            case (byte) 0x06:
                response.put("NOTIFICATION_TYPE", "ACCESS_CONTROL");
                break;
            case (byte) 0x07:
                response.put("NOTIFICATION_TYPE", "HOME_SECURITY");
                break;
            case (byte) 0x08:
                response.put("NOTIFICATION_TYPE", "POWER_MANAGEMENT");
                break;
            case (byte) 0x09:
                response.put("NOTIFICATION_TYPE", "SYSTEM");
                break;
            case (byte) 0x0A:
                response.put("NOTIFICATION_TYPE", "EMERGENCY");
                break;
            case (byte) 0x0B:
                response.put("NOTIFICATION_TYPE", "CLOCK");
                break;
            case (byte) 0x0C:
                response.put("NOTIFICATION_TYPE", "APPLIANCE");
                break;
            case (byte) 0x0D:
                response.put("NOTIFICATION_TYPE", "HOME_HEALTH");
                break;
            default:
                logger.debug("Unknown value {} for constant 'NOTIFICATION_TYPE'", String.format("%02X", payload[msgOffset]));
                response.put("NOTIFICATION_TYPE", "UNKNOWN_" + String.format("%02X", payload[msgOffset]));
                break;
        }
        msgOffset += 1;

        // Process 'Event'
        response.put("EVENT", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties1'
        response.put("EVENT_PARAMETERS_LENGTH", Integer.valueOf(payload[msgOffset] & 0x1F));
        response.put("SEQUENCE", Boolean.valueOf((payload[msgOffset] & 0x80) != 0));
        msgOffset += 1;

        // Process 'Event Parameter'
        int valEventParameter = 0;
        int lenEventParameter = payload[msgOffset - 1] & 0x1F;
        for (int cntEventParameter = 0; cntEventParameter < lenEventParameter; cntEventParameter++) {
            valEventParameter = (valEventParameter << 8) + payload[msgOffset + cntEventParameter];
        }
        response.put("EVENT_PARAMETER", valEventParameter);
        msgOffset += lenEventParameter;

        // Process 'Sequence Number'
        response.put("SEQUENCE_NUMBER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the NOTIFICATION_SET command.<br>
     *
     * Notification Set<br>
     *
     *
     * @param notificationType {@link String}
     * @param notificationStatus {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNotificationSet(String notificationType, String notificationStatus) {
        logger.debug("Creating command message NOTIFICATION_SET version 4");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NOTIFICATION_SET);

        // Process 'Notification Type'
        switch (notificationType) {
            case "SMOKE":
                outputData.write(0x01);
                break;
            case "CO":
                outputData.write(0x02);
                break;
            case "CO2":
                outputData.write(0x03);
                break;
            case "HEAT":
                outputData.write(0x04);
                break;
            case "WATER":
                outputData.write(0x05);
                break;
            case "ACCESS_CONTROL":
                outputData.write(0x06);
                break;
            case "HOME_SECURITY":
                outputData.write(0x07);
                break;
            case "POWER_MANAGEMENT":
                outputData.write(0x08);
                break;
            case "SYSTEM":
                outputData.write(0x09);
                break;
            case "EMERGENCY":
                outputData.write(0x0A);
                break;
            case "CLOCK":
                outputData.write(0x0B);
                break;
            case "APPLIANCE":
                outputData.write(0x0C);
                break;
            case "HOME_HEALTH":
                outputData.write(0x0D);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for notificationType: " + notificationType);
        }

        // Process 'Notification Status'
        switch (notificationStatus) {
            case "OFF":
                outputData.write(0x00);
                break;
            case "NO_PENDING_NOTIFICATIONS":
                outputData.write(0xFE);
                break;
            case "ON":
                outputData.write(0xFF);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for notificationStatus: " + notificationStatus);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NOTIFICATION_SET command<br>
     *
     * Notification Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>NOTIFICATION_TYPE {@link String}
     * <li>NOTIFICATION_STATUS {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleNotificationSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Notification Type'
        switch ((int) payload[2]) {
            case (byte) 0x01:
                response.put("NOTIFICATION_TYPE", "SMOKE");
                break;
            case (byte) 0x02:
                response.put("NOTIFICATION_TYPE", "CO");
                break;
            case (byte) 0x03:
                response.put("NOTIFICATION_TYPE", "CO2");
                break;
            case (byte) 0x04:
                response.put("NOTIFICATION_TYPE", "HEAT");
                break;
            case (byte) 0x05:
                response.put("NOTIFICATION_TYPE", "WATER");
                break;
            case (byte) 0x06:
                response.put("NOTIFICATION_TYPE", "ACCESS_CONTROL");
                break;
            case (byte) 0x07:
                response.put("NOTIFICATION_TYPE", "HOME_SECURITY");
                break;
            case (byte) 0x08:
                response.put("NOTIFICATION_TYPE", "POWER_MANAGEMENT");
                break;
            case (byte) 0x09:
                response.put("NOTIFICATION_TYPE", "SYSTEM");
                break;
            case (byte) 0x0A:
                response.put("NOTIFICATION_TYPE", "EMERGENCY");
                break;
            case (byte) 0x0B:
                response.put("NOTIFICATION_TYPE", "CLOCK");
                break;
            case (byte) 0x0C:
                response.put("NOTIFICATION_TYPE", "APPLIANCE");
                break;
            case (byte) 0x0D:
                response.put("NOTIFICATION_TYPE", "HOME_HEALTH");
                break;
            default:
                logger.debug("Unknown value {} for constant 'NOTIFICATION_TYPE'", String.format("%02X", payload[2]));
                response.put("NOTIFICATION_TYPE", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Process 'Notification Status'
        switch ((int) payload[3]) {
            case (byte) 0x00:
                response.put("NOTIFICATION_STATUS", "OFF");
                break;
            case (byte) 0xFE:
                response.put("NOTIFICATION_STATUS", "NO_PENDING_NOTIFICATIONS");
                break;
            case (byte) 0xFF:
                response.put("NOTIFICATION_STATUS", "ON");
                break;
            default:
                logger.debug("Unknown value {} for constant 'NOTIFICATION_STATUS'", String.format("%02X", payload[3]));
                response.put("NOTIFICATION_STATUS", "UNKNOWN_" + String.format("%02X", payload[3]));
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the NOTIFICATION_SUPPORTED_GET command.<br>
     *
     * Notification Supported Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNotificationSupportedGet() {
        logger.debug("Creating command message NOTIFICATION_SUPPORTED_GET version 4");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NOTIFICATION_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NOTIFICATION_SUPPORTED_GET command<br>
     *
     * Notification Supported Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleNotificationSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the NOTIFICATION_SUPPORTED_REPORT command.<br>
     *
     * Notification Supported Report<br>
     *
     *
     * @param v1Alarm {@link Boolean}
     * @param bitMask {@link List<String>}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNotificationSupportedReport(Boolean v1Alarm, List<String> bitMask) {
        logger.debug("Creating command message NOTIFICATION_SUPPORTED_REPORT version 4");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NOTIFICATION_SUPPORTED_REPORT);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= 4;
        valProperties1 |= v1Alarm ? 0x80 : 0;
        outputData.write(valProperties1);

        // Process 'Bit Mask'
        int valBitMask = 0;
        valBitMask |= (bitMask.contains("SMOKE") ? 0x02 : 0);
        valBitMask |= (bitMask.contains("CO") ? 0x04 : 0);
        valBitMask |= (bitMask.contains("CO2") ? 0x08 : 0);
        valBitMask |= (bitMask.contains("HEAT") ? 0x10 : 0);
        valBitMask |= (bitMask.contains("WATER") ? 0x20 : 0);
        valBitMask |= (bitMask.contains("ACCESS_CONTROL") ? 0x40 : 0);
        valBitMask |= (bitMask.contains("HOME_SECURITY") ? 0x80 : 0);
        outputData.write(valBitMask);
        valBitMask = 0;
        valBitMask |= (bitMask.contains("POWER_MANAGEMENT") ? 0x01 : 0);
        valBitMask |= (bitMask.contains("SYSTEM") ? 0x02 : 0);
        valBitMask |= (bitMask.contains("EMERGENCY") ? 0x04 : 0);
        valBitMask |= (bitMask.contains("CLOCK") ? 0x08 : 0);
        valBitMask |= (bitMask.contains("APPLIANCE") ? 0x10 : 0);
        valBitMask |= (bitMask.contains("HOME_HEALTH") ? 0x20 : 0);
        outputData.write(valBitMask);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NOTIFICATION_SUPPORTED_REPORT command<br>
     *
     * Notification Supported Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>V1_ALARM {@link Boolean}
     * <li>BIT_MASK {@link List}<{@link String}>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleNotificationSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Properties1'
        response.put("V1_ALARM", Boolean.valueOf((payload[2] & 0x80) != 0));

        // Process 'Bit Mask'
        List<String> responseBitMask = new ArrayList<String>();
        int lenBitMask = (payload[0] & 0x1F) * 8;
        for (int cntBitMask = 0; cntBitMask < lenBitMask; cntBitMask++) {
            if ((payload[3 + (cntBitMask / 8)] & cntBitMask % 8) == 0) {
                continue;
            }
            switch (cntBitMask) {
                case 0x01:
                    responseBitMask.add("SMOKE");
                    break;
                case 0x02:
                    responseBitMask.add("CO");
                    break;
                case 0x03:
                    responseBitMask.add("CO2");
                    break;
                case 0x04:
                    responseBitMask.add("HEAT");
                    break;
                case 0x05:
                    responseBitMask.add("WATER");
                    break;
                case 0x06:
                    responseBitMask.add("ACCESS_CONTROL");
                    break;
                case 0x07:
                    responseBitMask.add("HOME_SECURITY");
                    break;
                case 0x08:
                    responseBitMask.add("POWER_MANAGEMENT");
                    break;
                case 0x09:
                    responseBitMask.add("SYSTEM");
                    break;
                case 0x0A:
                    responseBitMask.add("EMERGENCY");
                    break;
                case 0x0B:
                    responseBitMask.add("CLOCK");
                    break;
                case 0x0C:
                    responseBitMask.add("APPLIANCE");
                    break;
                case 0x0D:
                    responseBitMask.add("HOME_HEALTH");
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

}
