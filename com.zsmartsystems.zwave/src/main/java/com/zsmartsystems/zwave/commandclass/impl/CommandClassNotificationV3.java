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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_NOTIFICATION</b> version <b>3</b>.
 * <p>
 * Command Class Notification
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x71.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassNotificationV3 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassNotificationV3.class);

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
     * Map holding constants for NotificationReportNotificationType
     */
    private static Map<Integer, String> constantNotificationReportNotificationType = new HashMap<Integer, String>();

    /**
     * Map holding constants for NotificationReportNotificationStatus
     */
    private static Map<Integer, String> constantNotificationReportNotificationStatus = new HashMap<Integer, String>();

    /**
     * Map holding constants for NotificationGetNotificationType
     */
    private static Map<Integer, String> constantNotificationGetNotificationType = new HashMap<Integer, String>();

    /**
     * Map holding constants for NotificationSupportedReportBitMask
     */
    private static Map<Integer, String> constantNotificationSupportedReportBitMask = new HashMap<Integer, String>();

    /**
     * Map holding constants for NotificationSetNotificationStatus
     */
    private static Map<Integer, String> constantNotificationSetNotificationStatus = new HashMap<Integer, String>();

    /**
     * Map holding constants for NotificationSupportedReportProperties1
     */
    private static Map<Integer, String> constantNotificationSupportedReportProperties1 = new HashMap<Integer, String>();

    /**
     * Map holding constants for NotificationReportProperties1
     */
    private static Map<Integer, String> constantNotificationReportProperties1 = new HashMap<Integer, String>();

    /**
     * Map holding constants for EventSupportedGetNotificationType
     */
    private static Map<Integer, String> constantEventSupportedGetNotificationType = new HashMap<Integer, String>();

    /**
     * Map holding constants for NotificationSetNotificationType
     */
    private static Map<Integer, String> constantNotificationSetNotificationType = new HashMap<Integer, String>();

    /**
     * Map holding constants for EventSupportedReportNotificationType
     */
    private static Map<Integer, String> constantEventSupportedReportNotificationType = new HashMap<Integer, String>();
    static {

        // Constants for NotificationReportNotificationType
        constantNotificationReportNotificationType.put(0x01, "SMOKE");
        constantNotificationReportNotificationType.put(0x02, "CO");
        constantNotificationReportNotificationType.put(0x03, "CO2");
        constantNotificationReportNotificationType.put(0x04, "HEAT");
        constantNotificationReportNotificationType.put(0x05, "WATER");
        constantNotificationReportNotificationType.put(0x06, "ACCESS_CONTROL");
        constantNotificationReportNotificationType.put(0x07, "BURGLAR");
        constantNotificationReportNotificationType.put(0x08, "POWER_MANAGEMENT");
        constantNotificationReportNotificationType.put(0x09, "SYSTEM");
        constantNotificationReportNotificationType.put(0x0A, "EMERGENCY");
        constantNotificationReportNotificationType.put(0x0B, "CLOCK");

        // Constants for NotificationReportNotificationStatus
        constantNotificationReportNotificationStatus.put(0x00, "OFF");
        constantNotificationReportNotificationStatus.put(0xFF, "ON");

        // Constants for NotificationGetNotificationType
        constantNotificationGetNotificationType.put(0x01, "SMOKE");
        constantNotificationGetNotificationType.put(0x02, "CO");
        constantNotificationGetNotificationType.put(0x03, "CO2");
        constantNotificationGetNotificationType.put(0x04, "HEAT");
        constantNotificationGetNotificationType.put(0x05, "WATER");
        constantNotificationGetNotificationType.put(0x06, "ACCESS_CONTROL");
        constantNotificationGetNotificationType.put(0x07, "BURGLAR");
        constantNotificationGetNotificationType.put(0x08, "POWER_MANAGEMENT");
        constantNotificationGetNotificationType.put(0x09, "SYSTEM");
        constantNotificationGetNotificationType.put(0x0A, "EMERGENCY");
        constantNotificationGetNotificationType.put(0x0B, "CLOCK");

        // Constants for NotificationSupportedReportBitMask
        constantNotificationSupportedReportBitMask.put(0x01, "SMOKE");
        constantNotificationSupportedReportBitMask.put(0x02, "CO");
        constantNotificationSupportedReportBitMask.put(0x03, "CO2");
        constantNotificationSupportedReportBitMask.put(0x04, "HEAT");
        constantNotificationSupportedReportBitMask.put(0x05, "WATER");
        constantNotificationSupportedReportBitMask.put(0x06, "ACCESS_CONTROL");
        constantNotificationSupportedReportBitMask.put(0x07, "BURGLAR");
        constantNotificationSupportedReportBitMask.put(0x08, "POWER_MANAGEMENT");
        constantNotificationSupportedReportBitMask.put(0x09, "SYSTEM");
        constantNotificationSupportedReportBitMask.put(0x0A, "EMERGENCY");
        constantNotificationSupportedReportBitMask.put(0x0B, "CLOCK");

        // Constants for NotificationSetNotificationStatus
        constantNotificationSetNotificationStatus.put(0x00, "OFF");
        constantNotificationSetNotificationStatus.put(0xFF, "ON");

        // Constants for NotificationSupportedReportProperties1
        constantNotificationSupportedReportProperties1.put(0x80, "V1_ALARM");

        // Constants for NotificationReportProperties1
        constantNotificationReportProperties1.put(0x80, "SEQUENCE");

        // Constants for EventSupportedGetNotificationType
        constantEventSupportedGetNotificationType.put(0x01, "SMOKE");
        constantEventSupportedGetNotificationType.put(0x02, "CO");
        constantEventSupportedGetNotificationType.put(0x03, "CO2");
        constantEventSupportedGetNotificationType.put(0x04, "HEAT");
        constantEventSupportedGetNotificationType.put(0x05, "WATER");
        constantEventSupportedGetNotificationType.put(0x06, "ACCESS_CONTROL");
        constantEventSupportedGetNotificationType.put(0x07, "BURGLAR");
        constantEventSupportedGetNotificationType.put(0x08, "POWER_MANAGEMENT");
        constantEventSupportedGetNotificationType.put(0x09, "SYSTEM");
        constantEventSupportedGetNotificationType.put(0x0A, "EMERGENCY");
        constantEventSupportedGetNotificationType.put(0x0B, "CLOCK");

        // Constants for NotificationSetNotificationType
        constantNotificationSetNotificationType.put(0x01, "SMOKE");
        constantNotificationSetNotificationType.put(0x02, "CO");
        constantNotificationSetNotificationType.put(0x03, "CO2");
        constantNotificationSetNotificationType.put(0x04, "HEAT");
        constantNotificationSetNotificationType.put(0x05, "WATER");
        constantNotificationSetNotificationType.put(0x06, "ACCESS_CONTROL");
        constantNotificationSetNotificationType.put(0x07, "BURGLAR");
        constantNotificationSetNotificationType.put(0x08, "POWER_MANAGEMENT");
        constantNotificationSetNotificationType.put(0x09, "SYSTEM");
        constantNotificationSetNotificationType.put(0x0A, "EMERGENCY");
        constantNotificationSetNotificationType.put(0x0B, "CLOCK");

        // Constants for EventSupportedReportNotificationType
        constantEventSupportedReportNotificationType.put(0x01, "SMOKE");
        constantEventSupportedReportNotificationType.put(0x02, "CO");
        constantEventSupportedReportNotificationType.put(0x03, "CO2");
        constantEventSupportedReportNotificationType.put(0x04, "HEAT");
        constantEventSupportedReportNotificationType.put(0x05, "WATER");
        constantEventSupportedReportNotificationType.put(0x06, "ACCESS_CONTROL");
        constantEventSupportedReportNotificationType.put(0x07, "BURGLAR");
        constantEventSupportedReportNotificationType.put(0x08, "POWER_MANAGEMENT");
        constantEventSupportedReportNotificationType.put(0x09, "SYSTEM");
        constantEventSupportedReportNotificationType.put(0x0A, "EMERGENCY");
        constantEventSupportedReportNotificationType.put(0x0B, "CLOCK");
    }

    /**
     * Creates a new message with the EVENT_SUPPORTED_GET command.
     * <p>
     * Event Supported Get
     *
     * @param notificationType {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>SMOKE
     *            <li>CO
     *            <li>CO2
     *            <li>HEAT
     *            <li>WATER
     *            <li>ACCESS_CONTROL
     *            <li>BURGLAR
     *            <li>POWER_MANAGEMENT
     *            <li>SYSTEM
     *            <li>EMERGENCY
     *            <li>CLOCK
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getEventSupportedGet(String notificationType) {
        logger.debug("Creating command message EVENT_SUPPORTED_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(EVENT_SUPPORTED_GET);

        // Process 'Notification Type'
        boolean foundNotificationType = false;
        for (Integer entry : constantEventSupportedGetNotificationType.keySet()) {
            if (constantEventSupportedGetNotificationType.get(entry).equals(notificationType)) {
                outputData.write(entry);
                foundNotificationType = true;
                break;
            }
        }
        if (!foundNotificationType) {
            throw new IllegalArgumentException("Unknown constant value '" + notificationType + "' for notificationType");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the EVENT_SUPPORTED_GET command.
     * <p>
     * Event Supported Get
     * <p>
     * The output data {@link Map} has the following properties -:
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
        response.put("NOTIFICATION_TYPE", constantEventSupportedGetNotificationType.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the EVENT_SUPPORTED_REPORT command.
     * <p>
     * Event Supported Report
     *
     * @param notificationType {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>SMOKE
     *            <li>CO
     *            <li>CO2
     *            <li>HEAT
     *            <li>WATER
     *            <li>ACCESS_CONTROL
     *            <li>BURGLAR
     *            <li>POWER_MANAGEMENT
     *            <li>SYSTEM
     *            <li>EMERGENCY
     *            <li>CLOCK
     *            </ul>
     * @param bitMask {@link List<Integer>}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getEventSupportedReport(String notificationType, List<Integer> bitMask) {
        logger.debug("Creating command message EVENT_SUPPORTED_REPORT version 3");

        Collections.sort(bitMask);
        int lenBitMask = (bitMask.get(bitMask.size() - 1) / 8) + 1;

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(EVENT_SUPPORTED_REPORT);

        // Process 'Notification Type'
        boolean foundNotificationType = false;
        for (Integer entry : constantEventSupportedReportNotificationType.keySet()) {
            if (constantEventSupportedReportNotificationType.get(entry).equals(notificationType)) {
                outputData.write(entry);
                foundNotificationType = true;
                break;
            }
        }
        if (!foundNotificationType) {
            throw new IllegalArgumentException("Unknown constant value '" + notificationType + "' for notificationType");
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
     * Processes a received frame with the EVENT_SUPPORTED_REPORT command.
     * <p>
     * Event Supported Report
     * <p>
     * The output data {@link Map} has the following properties -:
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
        response.put("NOTIFICATION_TYPE", constantEventSupportedReportNotificationType.get(payload[2] & 0xff));

        // Process 'Properties1'
        response.put("NUMBER_OF_BIT_MASKS", Integer.valueOf(payload[3] & 0x1F));

        // Process 'Bit Mask'
        List<Integer> responseBitMask = new ArrayList<Integer>();
        int lenBitMask = (payload[3] & 0x1F) * 8;
        for (int cntBitMask = 0; cntBitMask < lenBitMask; cntBitMask++) {
            if ((payload[4 + (cntBitMask / 8)] & (1 << cntBitMask % 8)) == 0) {
                continue;
            }
            responseBitMask.add(cntBitMask);
        }
        response.put("BIT_MASK", responseBitMask);

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the NOTIFICATION_GET command.
     * <p>
     * Notification Get
     *
     * @param v1AlarmType {@link Integer}
     * @param notificationType {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>SMOKE
     *            <li>CO
     *            <li>CO2
     *            <li>HEAT
     *            <li>WATER
     *            <li>ACCESS_CONTROL
     *            <li>BURGLAR
     *            <li>POWER_MANAGEMENT
     *            <li>SYSTEM
     *            <li>EMERGENCY
     *            <li>CLOCK
     *            </ul>
     * @param event {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNotificationGet(Integer v1AlarmType, String notificationType, Integer event) {
        logger.debug("Creating command message NOTIFICATION_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NOTIFICATION_GET);

        // Process 'V1 Alarm Type'
        outputData.write(v1AlarmType);

        // Process 'Notification Type'
        boolean foundNotificationType = false;
        for (Integer entry : constantNotificationGetNotificationType.keySet()) {
            if (constantNotificationGetNotificationType.get(entry).equals(notificationType)) {
                outputData.write(entry);
                foundNotificationType = true;
                break;
            }
        }
        if (!foundNotificationType) {
            throw new IllegalArgumentException("Unknown constant value '" + notificationType + "' for notificationType");
        }

        // Process 'Event'
        outputData.write(event);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NOTIFICATION_GET command.
     * <p>
     * Notification Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>V1_ALARM_TYPE {@link Integer}
     * <li>NOTIFICATION_TYPE {@link String}
     * <li>EVENT {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleNotificationGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'V1 Alarm Type'
        response.put("V1_ALARM_TYPE", Integer.valueOf(payload[2]));

        // Process 'Notification Type'
        response.put("NOTIFICATION_TYPE", constantNotificationGetNotificationType.get(payload[3] & 0xff));

        // Process 'Event'
        response.put("EVENT", Integer.valueOf(payload[4]));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the NOTIFICATION_REPORT command.
     * <p>
     * Notification Report
     *
     * @param v1AlarmType {@link Integer}
     * @param v1AlarmLevel {@link Integer}
     * @param notificationStatus {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>OFF
     *            <li>ON
     *            </ul>
     * @param notificationType {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>SMOKE
     *            <li>CO
     *            <li>CO2
     *            <li>HEAT
     *            <li>WATER
     *            <li>ACCESS_CONTROL
     *            <li>BURGLAR
     *            <li>POWER_MANAGEMENT
     *            <li>SYSTEM
     *            <li>EMERGENCY
     *            <li>CLOCK
     *            </ul>
     * @param event {@link Integer}
     * @param sequence {@link Boolean}
     * @param eventParameter {@link byte[]}
     * @param sequenceNumber {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNotificationReport(Integer v1AlarmType, Integer v1AlarmLevel, String notificationStatus,
            String notificationType, Integer event, Boolean sequence, byte[] eventParameter, Integer sequenceNumber) {
        logger.debug("Creating command message NOTIFICATION_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NOTIFICATION_REPORT);

        // Process 'V1 Alarm Type'
        outputData.write(v1AlarmType);

        // Process 'V1 Alarm Level'
        outputData.write(v1AlarmLevel);

        // Process 'Reserved'
        outputData.write(0);

        // Process 'Notification Status'
        boolean foundNotificationStatus = false;
        for (Integer entry : constantNotificationReportNotificationStatus.keySet()) {
            if (constantNotificationReportNotificationStatus.get(entry).equals(notificationStatus)) {
                outputData.write(entry);
                foundNotificationStatus = true;
                break;
            }
        }
        if (!foundNotificationStatus) {
            throw new IllegalArgumentException("Unknown constant value '" + notificationStatus + "' for notificationStatus");
        }

        // Process 'Notification Type'
        boolean foundNotificationType = false;
        for (Integer entry : constantNotificationReportNotificationType.keySet()) {
            if (constantNotificationReportNotificationType.get(entry).equals(notificationType)) {
                outputData.write(entry);
                foundNotificationType = true;
                break;
            }
        }
        if (!foundNotificationType) {
            throw new IllegalArgumentException("Unknown constant value '" + notificationType + "' for notificationType");
        }

        // Process 'Event'
        outputData.write(event);

        // Process 'Properties1'
        // Event Parameters Length is used by 'Event Parameter'
        int eventParametersLength = eventParameter.length;
        int valProperties1 = 0;
        valProperties1 |= eventParametersLength & 0x1F;
        valProperties1 |= sequence ? 0x80 : 0;
        outputData.write(valProperties1);

        // Process 'Event Parameter'
        if (eventParameter != null) {
            try {
                outputData.write(eventParameter);
            } catch (IOException e) {
            }
        }

        // Process 'Sequence Number'
        outputData.write(sequenceNumber);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NOTIFICATION_REPORT command.
     * <p>
     * Notification Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>V1_ALARM_TYPE {@link Integer}
     * <li>V1_ALARM_LEVEL {@link Integer}
     * <li>NOTIFICATION_STATUS {@link String}
     * <li>NOTIFICATION_TYPE {@link String}
     * <li>EVENT {@link Integer}
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
        response.put("NOTIFICATION_STATUS", constantNotificationReportNotificationStatus.get(payload[msgOffset] & 0xff));
        msgOffset += 1;

        // Process 'Notification Type'
        response.put("NOTIFICATION_TYPE", constantNotificationReportNotificationType.get(payload[msgOffset] & 0xff));
        msgOffset += 1;

        // Process 'Event'
        response.put("EVENT", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties1'
        // Event Parameters Length is used by 'Event Parameter'
        int varEventParametersLength = payload[msgOffset] & 0x1F;
        response.put("SEQUENCE", Boolean.valueOf((payload[msgOffset] & 0x80) != 0));
        msgOffset += 1;

        // Process 'Event Parameter'
        ByteArrayOutputStream valEventParameter = new ByteArrayOutputStream();
        for (int cntEventParameter = 0; cntEventParameter < varEventParametersLength; cntEventParameter++) {
            valEventParameter.write(payload[msgOffset + cntEventParameter]);
        }
        response.put("EVENT_PARAMETER", valEventParameter.toByteArray());
        msgOffset += varEventParametersLength;

        // Process 'Sequence Number'
        response.put("SEQUENCE_NUMBER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the NOTIFICATION_SET command.
     * <p>
     * Notification Set
     *
     * @param notificationType {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>SMOKE
     *            <li>CO
     *            <li>CO2
     *            <li>HEAT
     *            <li>WATER
     *            <li>ACCESS_CONTROL
     *            <li>BURGLAR
     *            <li>POWER_MANAGEMENT
     *            <li>SYSTEM
     *            <li>EMERGENCY
     *            <li>CLOCK
     *            </ul>
     * @param notificationStatus {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>OFF
     *            <li>ON
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNotificationSet(String notificationType, String notificationStatus) {
        logger.debug("Creating command message NOTIFICATION_SET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NOTIFICATION_SET);

        // Process 'Notification Type'
        boolean foundNotificationType = false;
        for (Integer entry : constantNotificationSetNotificationType.keySet()) {
            if (constantNotificationSetNotificationType.get(entry).equals(notificationType)) {
                outputData.write(entry);
                foundNotificationType = true;
                break;
            }
        }
        if (!foundNotificationType) {
            throw new IllegalArgumentException("Unknown constant value '" + notificationType + "' for notificationType");
        }

        // Process 'Notification Status'
        boolean foundNotificationStatus = false;
        for (Integer entry : constantNotificationSetNotificationStatus.keySet()) {
            if (constantNotificationSetNotificationStatus.get(entry).equals(notificationStatus)) {
                outputData.write(entry);
                foundNotificationStatus = true;
                break;
            }
        }
        if (!foundNotificationStatus) {
            throw new IllegalArgumentException("Unknown constant value '" + notificationStatus + "' for notificationStatus");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NOTIFICATION_SET command.
     * <p>
     * Notification Set
     * <p>
     * The output data {@link Map} has the following properties -:
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
        response.put("NOTIFICATION_TYPE", constantNotificationSetNotificationType.get(payload[2] & 0xff));

        // Process 'Notification Status'
        response.put("NOTIFICATION_STATUS", constantNotificationSetNotificationStatus.get(payload[3] & 0xff));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the NOTIFICATION_SUPPORTED_GET command.
     * <p>
     * Notification Supported Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNotificationSupportedGet() {
        logger.debug("Creating command message NOTIFICATION_SUPPORTED_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NOTIFICATION_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NOTIFICATION_SUPPORTED_GET command.
     * <p>
     * Notification Supported Get
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
     * Creates a new message with the NOTIFICATION_SUPPORTED_REPORT command.
     * <p>
     * Notification Supported Report
     *
     * @param v1Alarm {@link Boolean}
     * @param bitMask {@link List<String>}
     *            Can be one of the following -:
     *            <ul>
     *            <li>SMOKE
     *            <li>CO
     *            <li>CO2
     *            <li>HEAT
     *            <li>WATER
     *            <li>ACCESS_CONTROL
     *            <li>BURGLAR
     *            <li>POWER_MANAGEMENT
     *            <li>SYSTEM
     *            <li>EMERGENCY
     *            <li>CLOCK
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNotificationSupportedReport(Boolean v1Alarm, List<String> bitMask) {
        logger.debug("Creating command message NOTIFICATION_SUPPORTED_REPORT version 3");

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
        for (String value : bitMask) {
            boolean foundBitMask = false;
            for (Integer entry : constantNotificationSupportedReportBitMask.keySet()) {
                if (constantNotificationSupportedReportBitMask.get(entry).equals(value)) {
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
     * Processes a received frame with the NOTIFICATION_SUPPORTED_REPORT command.
     * <p>
     * Notification Supported Report
     * <p>
     * The output data {@link Map} has the following properties -:
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
        response.put("NUMBER_OF_BIT_MASKS", Integer.valueOf(payload[2] & 0x1F));
        response.put("V1_ALARM", Boolean.valueOf((payload[2] & 0x80) != 0));

        // Process 'Bit Mask'
        List<String> responseBitMask = new ArrayList<String>();
        int lenBitMask = (payload[2] & 0x1F) * 8;
        for (int cntBitMask = 0; cntBitMask < lenBitMask; cntBitMask++) {
            if ((payload[3 + (cntBitMask / 8)] & (1 << cntBitMask % 8)) == 0) {
                continue;
            }
            responseBitMask.add(constantNotificationSupportedReportBitMask.get(cntBitMask));
        }
        response.put("BIT_MASK", responseBitMask);

        // Return the map of processed response data;
        return response;
    }

}
