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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_RATE_TBL_MONITOR</b> version <b>1</b>.
 * <p>
 * Command Class Rate Tbl Monitor
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x49.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassRateTblMonitorV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassRateTblMonitorV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_RATE_TBL_MONITOR
     */
    public final static int COMMAND_CLASS_KEY = 0x49;

    /**
     * Rate Tbl Supported Get Command Constant
     */
    public final static int RATE_TBL_SUPPORTED_GET = 0x01;
    /**
     * Rate Tbl Supported Report Command Constant
     */
    public final static int RATE_TBL_SUPPORTED_REPORT = 0x02;
    /**
     * Rate Tbl Get Command Constant
     */
    public final static int RATE_TBL_GET = 0x03;
    /**
     * Rate Tbl Report Command Constant
     */
    public final static int RATE_TBL_REPORT = 0x04;
    /**
     * Rate Tbl Active Rate Get Command Constant
     */
    public final static int RATE_TBL_ACTIVE_RATE_GET = 0x05;
    /**
     * Rate Tbl Active Rate Report Command Constant
     */
    public final static int RATE_TBL_ACTIVE_RATE_REPORT = 0x06;
    /**
     * Rate Tbl Current Data Get Command Constant
     */
    public final static int RATE_TBL_CURRENT_DATA_GET = 0x07;
    /**
     * Rate Tbl Current Data Report Command Constant
     */
    public final static int RATE_TBL_CURRENT_DATA_REPORT = 0x08;
    /**
     * Rate Tbl Historical Data Get Command Constant
     */
    public final static int RATE_TBL_HISTORICAL_DATA_GET = 0x09;
    /**
     * Rate Tbl Historical Data Report Command Constant
     */
    public final static int RATE_TBL_HISTORICAL_DATA_REPORT = 0x0A;


    /**
     * Map holding constants for RateTblReportProperties1
     */
    private static Map<Integer, String> constantRateTblReportProperties1 = new HashMap<Integer, String>();
    static {

        // Constants for RateTblReportProperties1
    }

    /**
     * Creates a new message with the RATE_TBL_SUPPORTED_GET command.
     * <p>
     * Rate Tbl Supported Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRateTblSupportedGet() {
        logger.debug("Creating command message RATE_TBL_SUPPORTED_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RATE_TBL_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RATE_TBL_SUPPORTED_GET command.
     * <p>
     * Rate Tbl Supported Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleRateTblSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the RATE_TBL_SUPPORTED_REPORT command.
     * <p>
     * Rate Tbl Supported Report
     *
     * @param ratesSupported {@link Integer}
     * @param parameterSetSupportedBitMask {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRateTblSupportedReport(Integer ratesSupported, Integer parameterSetSupportedBitMask) {
        logger.debug("Creating command message RATE_TBL_SUPPORTED_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RATE_TBL_SUPPORTED_REPORT);

        // Process 'Rates Supported'
        outputData.write(ratesSupported);

        // Process 'Parameter Set Supported Bit Mask'
        outputData.write((parameterSetSupportedBitMask >> 8) & 0xff);
        outputData.write(parameterSetSupportedBitMask & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RATE_TBL_SUPPORTED_REPORT command.
     * <p>
     * Rate Tbl Supported Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>RATES_SUPPORTED {@link Integer}
     * <li>PARAMETER_SET_SUPPORTED_BIT_MASK {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleRateTblSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Rates Supported'
        response.put("RATES_SUPPORTED", Integer.valueOf(payload[2]));

        // Process 'Parameter Set Supported Bit Mask'
        response.put("PARAMETER_SET_SUPPORTED_BIT_MASK", Integer.valueOf(((payload[3] & 0xff) << 8) + (payload[4] & 0xff)));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the RATE_TBL_GET command.
     * <p>
     * Rate Tbl Get
     *
     * @param rateParameterSetId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRateTblGet(Integer rateParameterSetId) {
        logger.debug("Creating command message RATE_TBL_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RATE_TBL_GET);

        // Process 'Rate Parameter Set ID'
        outputData.write(rateParameterSetId);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RATE_TBL_GET command.
     * <p>
     * Rate Tbl Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>RATE_PARAMETER_SET_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleRateTblGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Rate Parameter Set ID'
        response.put("RATE_PARAMETER_SET_ID", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the RATE_TBL_REPORT command.
     * <p>
     * Rate Tbl Report
     *
     * @param rateParameterSetId {@link Integer}
     * @param rateType {@link Integer}
     * @param rateCharacter {@link byte[]}
     * @param startHourLocalTime {@link Integer}
     * @param startMinuteLocalTime {@link Integer}
     * @param durationMinute {@link Integer}
     * @param consumptionScale {@link Integer}
     * @param consumptionPrecision {@link Integer}
     * @param minConsumptionValue {@link Long}
     * @param maxConsumptionValue {@link Long}
     * @param maxDemandScale {@link Integer}
     * @param maxDemandPrecision {@link Integer}
     * @param maxDemandValue {@link Long}
     * @param dcpRateId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRateTblReport(Integer rateParameterSetId, Integer rateType, byte[] rateCharacter,
            Integer startHourLocalTime, Integer startMinuteLocalTime, Integer durationMinute, Integer consumptionScale,
            Integer consumptionPrecision, Long minConsumptionValue, Long maxConsumptionValue, Integer maxDemandScale,
            Integer maxDemandPrecision, Long maxDemandValue, Integer dcpRateId) {
        logger.debug("Creating command message RATE_TBL_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RATE_TBL_REPORT);

        // Process 'Rate Parameter Set ID'
        outputData.write(rateParameterSetId);

        // Process 'Properties1'
        // Number of Rate Char is used by 'Rate Character'
        int numberOfRateChar = rateCharacter.length;
        int valProperties1 = 0;
        valProperties1 |= numberOfRateChar & 0x1F;
        valProperties1 |= ((rateType << 5) & 0x60);
        outputData.write(valProperties1);

        // Process 'Rate Character'
        if (rateCharacter != null) {
            try {
                outputData.write(rateCharacter);
            } catch (IOException e) {
            }
        }

        // Process 'Start Hour Local Time'
        outputData.write(startHourLocalTime);

        // Process 'Start Minute Local Time'
        outputData.write(startMinuteLocalTime);

        // Process 'Duration Minute'
        outputData.write((durationMinute >> 8) & 0xff);
        outputData.write(durationMinute & 0xff);

        // Process 'Properties2'
        int valProperties2 = 0;
        valProperties2 |= consumptionScale & 0x1F;
        valProperties2 |= ((consumptionPrecision << 5) & 0xE0);
        outputData.write(valProperties2);

        // Process 'Min Consumption Value'
        outputData.write((byte) ((minConsumptionValue >> 24) & 0xff));
        outputData.write((byte) ((minConsumptionValue >> 16) & 0xff));
        outputData.write((byte) ((minConsumptionValue >> 8) & 0xff));
        outputData.write((byte) (minConsumptionValue & 0xff));

        // Process 'Max Consumption Value'
        outputData.write((byte) ((maxConsumptionValue >> 24) & 0xff));
        outputData.write((byte) ((maxConsumptionValue >> 16) & 0xff));
        outputData.write((byte) ((maxConsumptionValue >> 8) & 0xff));
        outputData.write((byte) (maxConsumptionValue & 0xff));

        // Process 'Properties3'
        int valProperties3 = 0;
        valProperties3 |= maxDemandScale & 0x1F;
        valProperties3 |= ((maxDemandPrecision << 5) & 0xE0);
        outputData.write(valProperties3);

        // Process 'Max Demand Value'
        outputData.write((byte) ((maxDemandValue >> 24) & 0xff));
        outputData.write((byte) ((maxDemandValue >> 16) & 0xff));
        outputData.write((byte) ((maxDemandValue >> 8) & 0xff));
        outputData.write((byte) (maxDemandValue & 0xff));

        // Process 'DCP Rate ID'
        outputData.write(dcpRateId);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RATE_TBL_REPORT command.
     * <p>
     * Rate Tbl Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>RATE_PARAMETER_SET_ID {@link Integer}
     * <li>RATE_TYPE {@link Integer}
     * <li>RATE_CHARACTER {@link byte[]}
     * <li>START_HOUR_LOCAL_TIME {@link Integer}
     * <li>START_MINUTE_LOCAL_TIME {@link Integer}
     * <li>DURATION_MINUTE {@link Integer}
     * <li>CONSUMPTION_SCALE {@link Integer}
     * <li>CONSUMPTION_PRECISION {@link Integer}
     * <li>MIN_CONSUMPTION_VALUE {@link Long}
     * <li>MAX_CONSUMPTION_VALUE {@link Long}
     * <li>MAX_DEMAND_SCALE {@link Integer}
     * <li>MAX_DEMAND_PRECISION {@link Integer}
     * <li>MAX_DEMAND_VALUE {@link Long}
     * <li>DCP_RATE_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleRateTblReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Rate Parameter Set ID'
        response.put("RATE_PARAMETER_SET_ID", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties1'
        // Number of Rate Char is used by 'Rate Character'
        int varNumberOfRateChar = payload[msgOffset] & 0x1F;
        response.put("RATE_TYPE", Integer.valueOf(payload[msgOffset] & 0x60 >> 5));
        msgOffset += 1;

        // Process 'Rate Character'
        ByteArrayOutputStream valRateCharacter = new ByteArrayOutputStream();
        for (int cntRateCharacter = 0; cntRateCharacter < varNumberOfRateChar; cntRateCharacter++) {
            valRateCharacter.write(payload[msgOffset + cntRateCharacter]);
        }
        response.put("RATE_CHARACTER", valRateCharacter.toByteArray());
        msgOffset += varNumberOfRateChar;

        // Process 'Start Hour Local Time'
        response.put("START_HOUR_LOCAL_TIME", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Start Minute Local Time'
        response.put("START_MINUTE_LOCAL_TIME", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Duration Minute'
        response.put("DURATION_MINUTE", Integer.valueOf(((payload[msgOffset] & 0xff) << 8) + (payload[msgOffset + 1] & 0xff)));
        msgOffset += 2;

        // Process 'Properties2'
        response.put("CONSUMPTION_SCALE", Integer.valueOf(payload[msgOffset] & 0x1F));
        response.put("CONSUMPTION_PRECISION", Integer.valueOf(payload[msgOffset] & 0xE0 >> 5));
        msgOffset += 1;

        // Process 'Min Consumption Value'
        response.put("MIN_CONSUMPTION_VALUE", Long.valueOf((payload[msgOffset] << 24) + (payload[msgOffset + 1] << 16) + (payload[msgOffset + 2] << 8) + payload[msgOffset + 3]));
        msgOffset += 4;

        // Process 'Max Consumption Value'
        response.put("MAX_CONSUMPTION_VALUE", Long.valueOf((payload[msgOffset] << 24) + (payload[msgOffset + 1] << 16) + (payload[msgOffset + 2] << 8) + payload[msgOffset + 3]));
        msgOffset += 4;

        // Process 'Properties3'
        response.put("MAX_DEMAND_SCALE", Integer.valueOf(payload[msgOffset] & 0x1F));
        response.put("MAX_DEMAND_PRECISION", Integer.valueOf(payload[msgOffset] & 0xE0 >> 5));
        msgOffset += 1;

        // Process 'Max Demand Value'
        response.put("MAX_DEMAND_VALUE", Long.valueOf((payload[msgOffset] << 24) + (payload[msgOffset + 1] << 16) + (payload[msgOffset + 2] << 8) + payload[msgOffset + 3]));
        msgOffset += 4;

        // Process 'DCP Rate ID'
        response.put("DCP_RATE_ID", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the RATE_TBL_ACTIVE_RATE_GET command.
     * <p>
     * Rate Tbl Active Rate Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRateTblActiveRateGet() {
        logger.debug("Creating command message RATE_TBL_ACTIVE_RATE_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RATE_TBL_ACTIVE_RATE_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RATE_TBL_ACTIVE_RATE_GET command.
     * <p>
     * Rate Tbl Active Rate Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleRateTblActiveRateGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the RATE_TBL_ACTIVE_RATE_REPORT command.
     * <p>
     * Rate Tbl Active Rate Report
     *
     * @param rateParameterSetId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRateTblActiveRateReport(Integer rateParameterSetId) {
        logger.debug("Creating command message RATE_TBL_ACTIVE_RATE_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RATE_TBL_ACTIVE_RATE_REPORT);

        // Process 'Rate Parameter Set ID'
        outputData.write(rateParameterSetId);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RATE_TBL_ACTIVE_RATE_REPORT command.
     * <p>
     * Rate Tbl Active Rate Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>RATE_PARAMETER_SET_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleRateTblActiveRateReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Rate Parameter Set ID'
        response.put("RATE_PARAMETER_SET_ID", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the RATE_TBL_CURRENT_DATA_GET command.
     * <p>
     * Rate Tbl Current Data Get
     *
     * @param rateParameterSetId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRateTblCurrentDataGet(Integer rateParameterSetId) {
        logger.debug("Creating command message RATE_TBL_CURRENT_DATA_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RATE_TBL_CURRENT_DATA_GET);

        // Process 'Rate Parameter Set ID'
        outputData.write(rateParameterSetId);

        // Process 'Dataset Requested'

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RATE_TBL_CURRENT_DATA_GET command.
     * <p>
     * Rate Tbl Current Data Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>RATE_PARAMETER_SET_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleRateTblCurrentDataGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Rate Parameter Set ID'
        response.put("RATE_PARAMETER_SET_ID", Integer.valueOf(payload[2]));

        // Process 'Dataset Requested'

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the RATE_TBL_CURRENT_DATA_REPORT command.
     * <p>
     * Rate Tbl Current Data Report
     *
     * @param reportsToFollow {@link Integer}
     * @param rateParameterSetId {@link Integer}
     * @param year {@link Integer}
     * @param month {@link Integer}
     * @param day {@link Integer}
     * @param hourLocalTime {@link Integer}
     * @param minuteLocalTime {@link Integer}
     * @param secondLocalTime {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRateTblCurrentDataReport(Integer reportsToFollow, Integer rateParameterSetId, Integer year,
            Integer month, Integer day, Integer hourLocalTime, Integer minuteLocalTime, Integer secondLocalTime) {
        logger.debug("Creating command message RATE_TBL_CURRENT_DATA_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RATE_TBL_CURRENT_DATA_REPORT);

        // Process 'Reports to Follow'
        outputData.write(reportsToFollow);

        // Process 'Rate Parameter Set ID'
        outputData.write(rateParameterSetId);

        // Process 'Dataset'

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

        // Process 'vg'

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RATE_TBL_CURRENT_DATA_REPORT command.
     * <p>
     * Rate Tbl Current Data Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>REPORTS_TO_FOLLOW {@link Integer}
     * <li>RATE_PARAMETER_SET_ID {@link Integer}
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
    public static Map<String, Object> handleRateTblCurrentDataReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Reports to Follow'
        response.put("REPORTS_TO_FOLLOW", Integer.valueOf(payload[2]));

        // Process 'Rate Parameter Set ID'
        response.put("RATE_PARAMETER_SET_ID", Integer.valueOf(payload[3]));

        // Process 'Dataset'

        // Process 'Year'
        response.put("YEAR", Integer.valueOf(((payload[7] & 0xff) << 8) + (payload[8] & 0xff)));

        // Process 'Month'
        response.put("MONTH", Integer.valueOf(payload[9]));

        // Process 'Day'
        response.put("DAY", Integer.valueOf(payload[10]));

        // Process 'Hour Local Time'
        response.put("HOUR_LOCAL_TIME", Integer.valueOf(payload[11]));

        // Process 'Minute Local Time'
        response.put("MINUTE_LOCAL_TIME", Integer.valueOf(payload[12]));

        // Process 'Second Local Time'
        response.put("SECOND_LOCAL_TIME", Integer.valueOf(payload[13]));

        // Process 'vg'

        // Create a list to hold the group vg
        List<Map<String, Object>> variantList = new ArrayList<Map<String, Object>>();

        int offset = 14;
        while (offset < payload.length) {
            // Create a map to hold the members of this variant
            Map<String, Object> variant = new HashMap<String, Object>();

            // Process 'Properties1'
            variant.put("CURRENT_SCALE", Integer.valueOf(payload[14] & 0x1F));
            variant.put("CURRENT_PRECISION", Integer.valueOf(payload[14] & 0xE0 >> 5));

            // Process 'Current Value'
            variant.put("CURRENT_VALUE", Long.valueOf((payload[15] << 24) + (payload[16] << 16) + (payload[17] << 8) + payload[18]));

            // Add to the list
            variantList.add(variant);

            // Add the length of this variant
            offset += (payload[offset + 0] & 0xFF) >> 0;
        }

        // Add the variant list to the response
        response.put("VG", variantList);

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the RATE_TBL_HISTORICAL_DATA_GET command.
     * <p>
     * Rate Tbl Historical Data Get
     *
     * @param maximumReports {@link Integer}
     * @param rateParameterSetId {@link Integer}
     * @param startYear {@link Integer}
     * @param startMonth {@link Integer}
     * @param startDay {@link Integer}
     * @param startHourLocalTime {@link Integer}
     * @param startMinuteLocalTime {@link Integer}
     * @param startSecondLocalTime {@link Integer}
     * @param stopYear {@link Integer}
     * @param stopMonth {@link Integer}
     * @param stopDay {@link Integer}
     * @param stopHourLocalTime {@link Integer}
     * @param stopMinuteLocalTime {@link Integer}
     * @param stopSecondLocalTime {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRateTblHistoricalDataGet(Integer maximumReports, Integer rateParameterSetId,
            Integer startYear, Integer startMonth, Integer startDay, Integer startHourLocalTime,
            Integer startMinuteLocalTime, Integer startSecondLocalTime, Integer stopYear, Integer stopMonth,
            Integer stopDay, Integer stopHourLocalTime, Integer stopMinuteLocalTime, Integer stopSecondLocalTime) {
        logger.debug("Creating command message RATE_TBL_HISTORICAL_DATA_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RATE_TBL_HISTORICAL_DATA_GET);

        // Process 'Maximum Reports'
        outputData.write(maximumReports);

        // Process 'Rate Parameter Set ID'
        outputData.write(rateParameterSetId);

        // Process 'Dataset Requested'

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

        // Process 'Stop Year'
        outputData.write((stopYear >> 8) & 0xff);
        outputData.write(stopYear & 0xff);

        // Process 'Stop Month'
        outputData.write(stopMonth);

        // Process 'Stop Day'
        outputData.write(stopDay);

        // Process 'Stop Hour Local Time'
        outputData.write(stopHourLocalTime);

        // Process 'Stop Minute Local Time'
        outputData.write(stopMinuteLocalTime);

        // Process 'Stop Second Local Time'
        outputData.write(stopSecondLocalTime);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RATE_TBL_HISTORICAL_DATA_GET command.
     * <p>
     * Rate Tbl Historical Data Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>MAXIMUM_REPORTS {@link Integer}
     * <li>RATE_PARAMETER_SET_ID {@link Integer}
     * <li>START_YEAR {@link Integer}
     * <li>START_MONTH {@link Integer}
     * <li>START_DAY {@link Integer}
     * <li>START_HOUR_LOCAL_TIME {@link Integer}
     * <li>START_MINUTE_LOCAL_TIME {@link Integer}
     * <li>START_SECOND_LOCAL_TIME {@link Integer}
     * <li>STOP_YEAR {@link Integer}
     * <li>STOP_MONTH {@link Integer}
     * <li>STOP_DAY {@link Integer}
     * <li>STOP_HOUR_LOCAL_TIME {@link Integer}
     * <li>STOP_MINUTE_LOCAL_TIME {@link Integer}
     * <li>STOP_SECOND_LOCAL_TIME {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleRateTblHistoricalDataGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Maximum Reports'
        response.put("MAXIMUM_REPORTS", Integer.valueOf(payload[2]));

        // Process 'Rate Parameter Set ID'
        response.put("RATE_PARAMETER_SET_ID", Integer.valueOf(payload[3]));

        // Process 'Dataset Requested'

        // Process 'Start Year'
        response.put("START_YEAR", Integer.valueOf(((payload[7] & 0xff) << 8) + (payload[8] & 0xff)));

        // Process 'Start Month'
        response.put("START_MONTH", Integer.valueOf(payload[9]));

        // Process 'Start Day'
        response.put("START_DAY", Integer.valueOf(payload[10]));

        // Process 'Start Hour Local Time'
        response.put("START_HOUR_LOCAL_TIME", Integer.valueOf(payload[11]));

        // Process 'Start Minute Local Time'
        response.put("START_MINUTE_LOCAL_TIME", Integer.valueOf(payload[12]));

        // Process 'Start Second Local Time'
        response.put("START_SECOND_LOCAL_TIME", Integer.valueOf(payload[13]));

        // Process 'Stop Year'
        response.put("STOP_YEAR", Integer.valueOf(((payload[14] & 0xff) << 8) + (payload[15] & 0xff)));

        // Process 'Stop Month'
        response.put("STOP_MONTH", Integer.valueOf(payload[16]));

        // Process 'Stop Day'
        response.put("STOP_DAY", Integer.valueOf(payload[17]));

        // Process 'Stop Hour Local Time'
        response.put("STOP_HOUR_LOCAL_TIME", Integer.valueOf(payload[18]));

        // Process 'Stop Minute Local Time'
        response.put("STOP_MINUTE_LOCAL_TIME", Integer.valueOf(payload[19]));

        // Process 'Stop Second Local Time'
        response.put("STOP_SECOND_LOCAL_TIME", Integer.valueOf(payload[20]));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the RATE_TBL_HISTORICAL_DATA_REPORT command.
     * <p>
     * Rate Tbl Historical Data Report
     *
     * @param reportsToFollow {@link Integer}
     * @param rateParameterSetId {@link Integer}
     * @param year {@link Integer}
     * @param month {@link Integer}
     * @param day {@link Integer}
     * @param hourLocalTime {@link Integer}
     * @param minuteLocalTime {@link Integer}
     * @param secondLocalTime {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getRateTblHistoricalDataReport(Integer reportsToFollow, Integer rateParameterSetId,
            Integer year, Integer month, Integer day, Integer hourLocalTime, Integer minuteLocalTime,
            Integer secondLocalTime) {
        logger.debug("Creating command message RATE_TBL_HISTORICAL_DATA_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(RATE_TBL_HISTORICAL_DATA_REPORT);

        // Process 'Reports to Follow'
        outputData.write(reportsToFollow);

        // Process 'Rate Parameter Set ID'
        outputData.write(rateParameterSetId);

        // Process 'Dataset'

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

        // Process 'vg'

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the RATE_TBL_HISTORICAL_DATA_REPORT command.
     * <p>
     * Rate Tbl Historical Data Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>REPORTS_TO_FOLLOW {@link Integer}
     * <li>RATE_PARAMETER_SET_ID {@link Integer}
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
    public static Map<String, Object> handleRateTblHistoricalDataReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Reports to Follow'
        response.put("REPORTS_TO_FOLLOW", Integer.valueOf(payload[2]));

        // Process 'Rate Parameter Set ID'
        response.put("RATE_PARAMETER_SET_ID", Integer.valueOf(payload[3]));

        // Process 'Dataset'

        // Process 'Year'
        response.put("YEAR", Integer.valueOf(((payload[7] & 0xff) << 8) + (payload[8] & 0xff)));

        // Process 'Month'
        response.put("MONTH", Integer.valueOf(payload[9]));

        // Process 'Day'
        response.put("DAY", Integer.valueOf(payload[10]));

        // Process 'Hour Local Time'
        response.put("HOUR_LOCAL_TIME", Integer.valueOf(payload[11]));

        // Process 'Minute Local Time'
        response.put("MINUTE_LOCAL_TIME", Integer.valueOf(payload[12]));

        // Process 'Second Local Time'
        response.put("SECOND_LOCAL_TIME", Integer.valueOf(payload[13]));

        // Process 'vg'

        // Create a list to hold the group vg
        List<Map<String, Object>> variantList = new ArrayList<Map<String, Object>>();

        int offset = 14;
        while (offset < payload.length) {
            // Create a map to hold the members of this variant
            Map<String, Object> variant = new HashMap<String, Object>();

            // Process 'Properties1'
            variant.put("HISTORICAL_SCALE", Integer.valueOf(payload[14] & 0x1F));
            variant.put("HISTORICAL_PRECISION", Integer.valueOf(payload[14] & 0xE0 >> 5));

            // Process 'Historical Value'
            variant.put("HISTORICAL_VALUE", Long.valueOf((payload[15] << 24) + (payload[16] << 16) + (payload[17] << 8) + payload[18]));

            // Add to the list
            variantList.add(variant);

            // Add the length of this variant
            offset += (payload[offset + 0] & 0xFF) >> 0;
        }

        // Add the variant list to the response
        response.put("VG", variantList);

        // Return the map of processed response data;
        return response;
    }

}
