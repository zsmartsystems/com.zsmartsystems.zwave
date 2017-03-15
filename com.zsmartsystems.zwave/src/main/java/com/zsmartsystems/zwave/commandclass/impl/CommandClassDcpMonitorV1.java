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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_DCP_MONITOR</b> version <b>1</b>.<br>
 *
 * Command Class Dcp Monitor<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassDcpMonitorV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassDcpMonitorV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_DCP_MONITOR
     */
    public final static int COMMAND_CLASS_KEY = 0x3B;

    /**
     * Dcp List Get Command Constant
     */
    public final static int DCP_LIST_GET = 0x01;
    /**
     * Dcp List Report Command Constant
     */
    public final static int DCP_LIST_REPORT = 0x02;
    /**
     * Dcp Event Status Get Command Constant
     */
    public final static int DCP_EVENT_STATUS_GET = 0x03;
    /**
     * Dcp Event Status Report Command Constant
     */
    public final static int DCP_EVENT_STATUS_REPORT = 0x04;

    /**
     * Creates a new message with the DCP_LIST_GET command.<br>
     *
     * Dcp List Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getDcpListGet() {
        logger.debug("Creating command message DCP_LIST_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(DCP_LIST_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the DCP_LIST_GET command<br>
     *
     * Dcp List Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleDcpListGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the DCP_LIST_REPORT command.<br>
     *
     * Dcp List Report<br>
     *
     *
     * @param reportsToFollow {@link Integer}
     * @param year {@link Integer}
     * @param month {@link Integer}
     * @param day {@link Integer}
     * @param hourLocalTime {@link Integer}
     * @param minuteLocalTime {@link Integer}
     * @param secondLocalTime {@link Integer}
     * @param dcpId {@link Integer}
     * @param numberOfDc {@link Integer}
     * @param startYear {@link Integer}
     * @param startMonth {@link Integer}
     * @param startDay {@link Integer}
     * @param startHourLocalTime {@link Integer}
     * @param startMinuteLocalTime {@link Integer}
     * @param startSecondLocalTime {@link Integer}
     * @param durationHourTime {@link Integer}
     * @param durationMinuteTime {@link Integer}
     * @param durationSecondTime {@link Integer}
     * @param eventPriority {@link Integer}
     * @param loadShedding {@link Integer}
     * @param startAssociationGroup {@link Integer}
     * @param stopAssociationGroup {@link Integer}
     * @param randomizationInterval {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getDcpListReport(Integer reportsToFollow, Integer year, Integer month, Integer day,
            Integer hourLocalTime, Integer minuteLocalTime, Integer secondLocalTime, Integer dcpId, Integer numberOfDc,
            Integer startYear, Integer startMonth, Integer startDay, Integer startHourLocalTime,
            Integer startMinuteLocalTime, Integer startSecondLocalTime, Integer durationHourTime,
            Integer durationMinuteTime, Integer durationSecondTime, Integer eventPriority, Integer loadShedding,
            Integer startAssociationGroup, Integer stopAssociationGroup, Integer randomizationInterval) {
        logger.debug("Creating command message DCP_LIST_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(DCP_LIST_REPORT);

        // Process 'Reports to Follow'
        outputData.write(reportsToFollow);

        // Process 'Year'
        outputData.write((year >> 8) & 0xff);
        outputData.write(year & 0xff);

        // Process 'Month'
        outputData.write(month);

        // Process 'Day'
        outputData.write(day);

        // Process 'Hour Local Time'
        outputData.write(hourLocalTime);

        // Process 'Minute Local Time'
        outputData.write(minuteLocalTime);

        // Process 'Second Local Time'
        outputData.write(secondLocalTime);

        // Process 'DCP ID'
        outputData.write(dcpId);

        // Process 'Properties1'
        outputData.write(numberOfDc & 0x03);

        // Process 'vg1'

        // Process 'Start Year'
        outputData.write((startYear >> 8) & 0xff);
        outputData.write(startYear & 0xff);

        // Process 'Start Month'
        outputData.write(startMonth);

        // Process 'Start Day'
        outputData.write(startDay);

        // Process 'Start Hour Local Time'
        outputData.write(startHourLocalTime);

        // Process 'Start Minute Local Time'
        outputData.write(startMinuteLocalTime);

        // Process 'Start Second Local Time'
        outputData.write(startSecondLocalTime);

        // Process 'Duration Hour Time'
        outputData.write(durationHourTime);

        // Process 'Duration Minute Time'
        outputData.write(durationMinuteTime);

        // Process 'Duration Second Time'
        outputData.write(durationSecondTime);

        // Process 'Event Priority'
        outputData.write(eventPriority);

        // Process 'Load shedding'
        outputData.write(loadShedding);

        // Process 'Start Association Group'
        outputData.write(startAssociationGroup);

        // Process 'Stop Association Group'
        outputData.write(stopAssociationGroup);

        // Process 'Randomization interval'
        outputData.write(randomizationInterval);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the DCP_LIST_REPORT command<br>
     *
     * Dcp List Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>REPORTS_TO_FOLLOW {@link Integer}
     * <li>YEAR {@link Integer}
     * <li>MONTH {@link Integer}
     * <li>DAY {@link Integer}
     * <li>HOUR_LOCAL_TIME {@link Integer}
     * <li>MINUTE_LOCAL_TIME {@link Integer}
     * <li>SECOND_LOCAL_TIME {@link Integer}
     * <li>DCP_ID {@link Integer}
     * <li>NUMBER_OF_DC {@link Integer}
     * <li>START_YEAR {@link Integer}
     * <li>START_MONTH {@link Integer}
     * <li>START_DAY {@link Integer}
     * <li>START_HOUR_LOCAL_TIME {@link Integer}
     * <li>START_MINUTE_LOCAL_TIME {@link Integer}
     * <li>START_SECOND_LOCAL_TIME {@link Integer}
     * <li>DURATION_HOUR_TIME {@link Integer}
     * <li>DURATION_MINUTE_TIME {@link Integer}
     * <li>DURATION_SECOND_TIME {@link Integer}
     * <li>EVENT_PRIORITY {@link Integer}
     * <li>LOAD_SHEDDING {@link Integer}
     * <li>START_ASSOCIATION_GROUP {@link Integer}
     * <li>STOP_ASSOCIATION_GROUP {@link Integer}
     * <li>RANDOMIZATION_INTERVAL {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleDcpListReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Reports to Follow'
        response.put("REPORTS_TO_FOLLOW", Integer.valueOf(payload[2]));

        // Process 'Year'
        response.put("YEAR", Integer.valueOf(payload[3] << 8 + payload[4]));

        // Process 'Month'
        response.put("MONTH", Integer.valueOf(payload[5]));

        // Process 'Day'
        response.put("DAY", Integer.valueOf(payload[6]));

        // Process 'Hour Local Time'
        response.put("HOUR_LOCAL_TIME", Integer.valueOf(payload[7]));

        // Process 'Minute Local Time'
        response.put("MINUTE_LOCAL_TIME", Integer.valueOf(payload[8]));

        // Process 'Second Local Time'
        response.put("SECOND_LOCAL_TIME", Integer.valueOf(payload[9]));

        // Process 'DCP ID'
        response.put("DCP_ID", Integer.valueOf(payload[10]));

        // Process 'Properties1'
        response.put("NUMBER_OF_DC", Integer.valueOf(payload[11] & 0x03));

        // Process 'vg1'

        // Create a list to hold the group vg1
        List<Map<String, Object>> variantList = new ArrayList<Map<String, Object>>();

        int offset = 12;
        while (offset < payload.length) {
            // Create a map to hold the members of this variant
            Map<String, Object> variant = new HashMap<String, Object>();

            // Process 'Generic Device Class'
            variant.put("GENERIC_DEVICE_CLASS", Integer.valueOf(payload[12]));

            // Process 'Specific Device Class'
            variant.put("SPECIFIC_DEVICE_CLASS", Integer.valueOf(payload[13]));

            // Add to the list
            variantList.add(variant);

            // Add the length of this variant
            offset += (payload[offset + 0] & 0xFF) >> 0;
        }

        // Add the variant list to the response
        response.put("VG1", variantList);

        // Process 'Start Year'
        response.put("START_YEAR", Integer.valueOf(payload[14] << 8 + payload[15]));

        // Process 'Start Month'
        response.put("START_MONTH", Integer.valueOf(payload[16]));

        // Process 'Start Day'
        response.put("START_DAY", Integer.valueOf(payload[17]));

        // Process 'Start Hour Local Time'
        response.put("START_HOUR_LOCAL_TIME", Integer.valueOf(payload[18]));

        // Process 'Start Minute Local Time'
        response.put("START_MINUTE_LOCAL_TIME", Integer.valueOf(payload[19]));

        // Process 'Start Second Local Time'
        response.put("START_SECOND_LOCAL_TIME", Integer.valueOf(payload[20]));

        // Process 'Duration Hour Time'
        response.put("DURATION_HOUR_TIME", Integer.valueOf(payload[21]));

        // Process 'Duration Minute Time'
        response.put("DURATION_MINUTE_TIME", Integer.valueOf(payload[22]));

        // Process 'Duration Second Time'
        response.put("DURATION_SECOND_TIME", Integer.valueOf(payload[23]));

        // Process 'Event Priority'
        response.put("EVENT_PRIORITY", Integer.valueOf(payload[24]));

        // Process 'Load shedding'
        response.put("LOAD_SHEDDING", Integer.valueOf(payload[25]));

        // Process 'Start Association Group'
        response.put("START_ASSOCIATION_GROUP", Integer.valueOf(payload[26]));

        // Process 'Stop Association Group'
        response.put("STOP_ASSOCIATION_GROUP", Integer.valueOf(payload[27]));

        // Process 'Randomization interval'
        response.put("RANDOMIZATION_INTERVAL", Integer.valueOf(payload[28]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the DCP_EVENT_STATUS_GET command.<br>
     *
     * Dcp Event Status Get<br>
     *
     *
     * @param year {@link Integer}
     * @param month {@link Integer}
     * @param day {@link Integer}
     * @param hourLocalTime {@link Integer}
     * @param minuteLocalTime {@link Integer}
     * @param secondLocalTime {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getDcpEventStatusGet(Integer year, Integer month, Integer day, Integer hourLocalTime,
            Integer minuteLocalTime, Integer secondLocalTime) {
        logger.debug("Creating command message DCP_EVENT_STATUS_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(DCP_EVENT_STATUS_GET);

        // Process 'Year'
        outputData.write((year >> 8) & 0xff);
        outputData.write(year & 0xff);

        // Process 'Month'
        outputData.write(month);

        // Process 'Day'
        outputData.write(day);

        // Process 'Hour Local Time'
        outputData.write(hourLocalTime);

        // Process 'Minute Local Time'
        outputData.write(minuteLocalTime);

        // Process 'Second Local Time'
        outputData.write(secondLocalTime);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the DCP_EVENT_STATUS_GET command<br>
     *
     * Dcp Event Status Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>YEAR {@link Integer}
     * <li>MONTH {@link Integer}
     * <li>DAY {@link Integer}
     * <li>HOUR_LOCAL_TIME {@link Integer}
     * <li>MINUTE_LOCAL_TIME {@link Integer}
     * <li>SECOND_LOCAL_TIME {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleDcpEventStatusGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Year'
        response.put("YEAR", Integer.valueOf(payload[2] << 8 + payload[3]));

        // Process 'Month'
        response.put("MONTH", Integer.valueOf(payload[4]));

        // Process 'Day'
        response.put("DAY", Integer.valueOf(payload[5]));

        // Process 'Hour Local Time'
        response.put("HOUR_LOCAL_TIME", Integer.valueOf(payload[6]));

        // Process 'Minute Local Time'
        response.put("MINUTE_LOCAL_TIME", Integer.valueOf(payload[7]));

        // Process 'Second Local Time'
        response.put("SECOND_LOCAL_TIME", Integer.valueOf(payload[8]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the DCP_EVENT_STATUS_REPORT command.<br>
     *
     * Dcp Event Status Report<br>
     *
     *
     * @param year {@link Integer}
     * @param month {@link Integer}
     * @param day {@link Integer}
     * @param hourLocalTime {@link Integer}
     * @param minuteLocalTime {@link Integer}
     * @param secondLocalTime {@link Integer}
     * @param eventStatus {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getDcpEventStatusReport(Integer year, Integer month, Integer day, Integer hourLocalTime,
            Integer minuteLocalTime, Integer secondLocalTime, Integer eventStatus) {
        logger.debug("Creating command message DCP_EVENT_STATUS_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(DCP_EVENT_STATUS_REPORT);

        // Process 'Year'
        outputData.write((year >> 8) & 0xff);
        outputData.write(year & 0xff);

        // Process 'Month'
        outputData.write(month);

        // Process 'Day'
        outputData.write(day);

        // Process 'Hour Local Time'
        outputData.write(hourLocalTime);

        // Process 'Minute Local Time'
        outputData.write(minuteLocalTime);

        // Process 'Second Local Time'
        outputData.write(secondLocalTime);

        // Process 'Event status'
        outputData.write(eventStatus);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the DCP_EVENT_STATUS_REPORT command<br>
     *
     * Dcp Event Status Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>YEAR {@link Integer}
     * <li>MONTH {@link Integer}
     * <li>DAY {@link Integer}
     * <li>HOUR_LOCAL_TIME {@link Integer}
     * <li>MINUTE_LOCAL_TIME {@link Integer}
     * <li>SECOND_LOCAL_TIME {@link Integer}
     * <li>EVENT_STATUS {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleDcpEventStatusReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Year'
        response.put("YEAR", Integer.valueOf(payload[2] << 8 + payload[3]));

        // Process 'Month'
        response.put("MONTH", Integer.valueOf(payload[4]));

        // Process 'Day'
        response.put("DAY", Integer.valueOf(payload[5]));

        // Process 'Hour Local Time'
        response.put("HOUR_LOCAL_TIME", Integer.valueOf(payload[6]));

        // Process 'Minute Local Time'
        response.put("MINUTE_LOCAL_TIME", Integer.valueOf(payload[7]));

        // Process 'Second Local Time'
        response.put("SECOND_LOCAL_TIME", Integer.valueOf(payload[8]));

        // Process 'Event status'
        switch ((int) payload[9]) {
            case 0x00:
                response.put("EVENT_STATUS", "RESERVED");
                break;
            case 0x01:
                response.put("EVENT_STATUS", "EVENT_STARTED");
                break;
            case 0x02:
                response.put("EVENT_STATUS", "EVENT_COMPLETED");
                break;
            case 0x03:
                response.put("EVENT_STATUS", "EVENT_REJECTED");
                break;
            case 0x04:
                response.put("EVENT_STATUS", "EVENT_NOT_APPLICABLE");
                break;
            default:
                logger.debug("");
                break;
        }

        // Return the map of processed response data;
        return response;
    }

}
