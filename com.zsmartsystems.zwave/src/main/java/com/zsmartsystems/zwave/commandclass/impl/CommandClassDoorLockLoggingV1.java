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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_DOOR_LOCK_LOGGING</b> version <b>1</b>.<br>
 *
 * Command Class Door Lock Logging<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassDoorLockLoggingV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassDoorLockLoggingV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_DOOR_LOCK_LOGGING
     */
    public final static int COMMAND_CLASS_KEY = 0x4C;

    /**
     * Door Lock Logging Records Supported Get Command Constant
     */
    public final static int DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET = 0x01;
    /**
     * Door Lock Logging Records Supported Report Command Constant
     */
    public final static int DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT = 0x02;
    /**
     * Record Get Command Constant
     */
    public final static int RECORD_GET = 0x03;
    /**
     * Record Report Command Constant
     */
    public final static int RECORD_REPORT = 0x04;

    /**
     * Creates a new message with the DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET command.<br>
     *
     * Door Lock Logging Records Supported Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getDoorLockLoggingRecordsSupportedGet() {
        logger.debug("Creating command message DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET command<br>
     *
     * Door Lock Logging Records Supported Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleDoorLockLoggingRecordsSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT command.<br>
     *
     * Door Lock Logging Records Supported Report<br>
     *
     *
     * @param maxRecordsStored {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getDoorLockLoggingRecordsSupportedReport(Integer maxRecordsStored) {
        logger.debug("Creating command message DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT);

        // Process 'Max records stored'
        outputData.write(maxRecordsStored);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT command<br>
     *
     * Door Lock Logging Records Supported Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>MAX_RECORDS_STORED {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleDoorLockLoggingRecordsSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Max records stored'
        response.put("MAX_RECORDS_STORED", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the RECORD_GET command.<br>
     *
     * Record Get<br>
     *
     *
     * @param recordNumber {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRecordGet(Integer recordNumber) {
        logger.debug("Creating command message RECORD_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RECORD_GET);

        // Process 'Record number'
        outputData.write(recordNumber);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RECORD_GET command<br>
     *
     * Record Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>RECORD_NUMBER {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleRecordGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Record number'
        response.put("RECORD_NUMBER", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the RECORD_REPORT command.<br>
     *
     * Record Report<br>
     *
     *
     * @param recordNumber {@link Integer}
     * @param year {@link Integer}
     * @param month {@link Integer}
     * @param day {@link Integer}
     * @param hourLocalTime {@link Integer}
     * @param recordStatus {@link Integer}
     * @param minuteLocalTime {@link Integer}
     * @param secondLocalTime {@link Integer}
     * @param eventType {@link Integer}
     * @param userIdentifier {@link Integer}
     * @param userCodeLength {@link Integer}
     * @param userCode {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRecordReport(Integer recordNumber, Integer year, Integer month, Integer day,
            Integer hourLocalTime, Integer recordStatus, Integer minuteLocalTime, Integer secondLocalTime,
            Integer eventType, Integer userIdentifier, Integer userCodeLength, byte[] userCode) {
        logger.debug("Creating command message RECORD_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RECORD_REPORT);

        // Process 'Record number'
        outputData.write(recordNumber);

        // Process 'Year'
        outputData.write((year >> 8) & 0xff);
        outputData.write(year & 0xff);

        // Process 'Month'
        outputData.write(month);

        // Process 'Day'
        outputData.write(day);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= hourLocalTime & 0x1F;
        valProperties1 |= ((recordStatus << 5) & 0xE0);
        outputData.write(valProperties1);

        // Process 'Minute Local Time'
        outputData.write(minuteLocalTime);

        // Process 'Second Local Time'
        outputData.write(secondLocalTime);

        // Process 'Event Type'
        outputData.write(eventType);

        // Process 'User Identifier'
        outputData.write(userIdentifier);

        // Process 'User Code Length'
        outputData.write(userCodeLength);

        // Process 'USER_CODE'
        try {
            outputData.write(userCode);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RECORD_REPORT command<br>
     *
     * Record Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>RECORD_NUMBER {@link Integer}
     * <li>YEAR {@link Integer}
     * <li>MONTH {@link Integer}
     * <li>DAY {@link Integer}
     * <li>HOUR_LOCAL_TIME {@link Integer}
     * <li>RECORD_STATUS {@link Integer}
     * <li>MINUTE_LOCAL_TIME {@link Integer}
     * <li>SECOND_LOCAL_TIME {@link Integer}
     * <li>EVENT_TYPE {@link Integer}
     * <li>USER_IDENTIFIER {@link Integer}
     * <li>USER_CODE_LENGTH {@link Integer}
     * <li>USER_CODE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleRecordReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Record number'
        response.put("RECORD_NUMBER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Year'
        response.put("YEAR", Integer.valueOf(payload[msgOffset] << 8 + payload[msgOffset + 12]));
        msgOffset += 2;

        // Process 'Month'
        response.put("MONTH", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Day'
        response.put("DAY", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties1'
        response.put("HOUR_LOCAL_TIME", Integer.valueOf(payload[msgOffset] & 0x1F));
        response.put("RECORD_STATUS", Integer.valueOf((payload[msgOffset] & 0xE0 >> 5)));
        msgOffset += 1;

        // Process 'Minute Local Time'
        response.put("MINUTE_LOCAL_TIME", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Second Local Time'
        response.put("SECOND_LOCAL_TIME", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Event Type'
        response.put("EVENT_TYPE", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'User Identifier'
        response.put("USER_IDENTIFIER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'User Code Length'
        response.put("USER_CODE_LENGTH", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'USER_CODE'
        ByteArrayOutputStream valUserCode = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valUserCode.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("USER_CODE", valUserCode);

        // Return the map of processed response data;
        return response;
    }

}
