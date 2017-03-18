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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_ALARM</b> version <b>1</b>.<br>
 * <p>
 * Command Class Alarm<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassAlarmV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassAlarmV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_ALARM
     */
    public final static int COMMAND_CLASS_KEY = 0x71;

    /**
     * Alarm Get Command Constant
     */
    public final static int ALARM_GET = 0x04;
    /**
     * Alarm Report Command Constant
     */
    public final static int ALARM_REPORT = 0x05;

    /**
     * Creates a new message with the ALARM_GET command.<br>
     * <p>
     * Alarm Get<br>
     *
     * @param alarmType {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getAlarmGet(Integer alarmType) {
        logger.debug("Creating command message ALARM_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ALARM_GET);

        // Process 'Alarm Type'
        outputData.write(alarmType);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ALARM_GET command<br>
     * <p>
     * Alarm Get<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>ALARM_TYPE {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleAlarmGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Alarm Type'
        response.put("ALARM_TYPE", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ALARM_REPORT command.<br>
     * <p>
     * Alarm Report<br>
     *
     * @param alarmType {@link Integer}
     * @param alarmLevel {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getAlarmReport(Integer alarmType, Integer alarmLevel) {
        logger.debug("Creating command message ALARM_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ALARM_REPORT);

        // Process 'Alarm Type'
        outputData.write(alarmType);

        // Process 'Alarm Level'
        outputData.write(alarmLevel);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ALARM_REPORT command<br>
     * <p>
     * Alarm Report<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>ALARM_TYPE {@link Integer}
     * <li>ALARM_LEVEL {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleAlarmReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Alarm Type'
        response.put("ALARM_TYPE", Integer.valueOf(payload[2]));

        // Process 'Alarm Level'
        response.put("ALARM_LEVEL", Integer.valueOf(payload[3]));

        // Return the map of processed response data;
        return response;
    }

}
