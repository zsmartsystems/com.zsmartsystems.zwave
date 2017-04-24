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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_GEOGRAPHIC_LOCATION</b> version <b>1</b>.
 * <p>
 * Command Class Geographic Location
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x8C.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassGeographicLocationV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassGeographicLocationV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_GEOGRAPHIC_LOCATION
     */
    public final static int COMMAND_CLASS_KEY = 0x8C;

    /**
     * Geographic Location Set Command Constant
     */
    public final static int GEOGRAPHIC_LOCATION_SET = 0x01;
    /**
     * Geographic Location Get Command Constant
     */
    public final static int GEOGRAPHIC_LOCATION_GET = 0x02;
    /**
     * Geographic Location Report Command Constant
     */
    public final static int GEOGRAPHIC_LOCATION_REPORT = 0x03;


    /**
     * Map holding constants for GeographicLocationReportLevel2
     */
    private static Map<Integer, String> constantGeographicLocationReportLevel2 = new HashMap<Integer, String>();

    /**
     * Map holding constants for GeographicLocationSetLevel
     */
    private static Map<Integer, String> constantGeographicLocationSetLevel = new HashMap<Integer, String>();

    /**
     * Map holding constants for GeographicLocationSetLevel2
     */
    private static Map<Integer, String> constantGeographicLocationSetLevel2 = new HashMap<Integer, String>();

    /**
     * Map holding constants for GeographicLocationReportLevel
     */
    private static Map<Integer, String> constantGeographicLocationReportLevel = new HashMap<Integer, String>();
    static {

        // Constants for GeographicLocationReportLevel2
        constantGeographicLocationReportLevel2.put(0x80, "LAT_SIGN");

        // Constants for GeographicLocationSetLevel
        constantGeographicLocationSetLevel.put(0x80, "LONG_SIGN");

        // Constants for GeographicLocationSetLevel2
        constantGeographicLocationSetLevel2.put(0x80, "LAT_SIGN");

        // Constants for GeographicLocationReportLevel
        constantGeographicLocationReportLevel.put(0x80, "LONG_SIGN");
    }

    /**
     * Creates a new message with the GEOGRAPHIC_LOCATION_SET command.
     * <p>
     * Geographic Location Set
     *
     * @param longitudeDegrees {@link Integer}
     * @param longitudeMinutes {@link Integer}
     * @param longSign {@link Boolean}
     * @param latitudeDegrees {@link Integer}
     * @param latitudeMinutes {@link Integer}
     * @param latSign {@link Boolean}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getGeographicLocationSet(Integer longitudeDegrees, Integer longitudeMinutes, Boolean longSign,
            Integer latitudeDegrees, Integer latitudeMinutes, Boolean latSign) {
        logger.debug("Creating command message GEOGRAPHIC_LOCATION_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(GEOGRAPHIC_LOCATION_SET);

        // Process 'Longitude Degrees'
        outputData.write(longitudeDegrees);

        // Process 'Level'
        int valLevel = 0;
        valLevel |= longitudeMinutes & 0x7F;
        valLevel |= longSign ? 0x80 : 0;
        outputData.write(valLevel);

        // Process 'Latitude Degrees'
        outputData.write(latitudeDegrees);

        // Process 'Level2'
        int valLevel2 = 0;
        valLevel2 |= latitudeMinutes & 0x7F;
        valLevel2 |= latSign ? 0x80 : 0;
        outputData.write(valLevel2);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the GEOGRAPHIC_LOCATION_SET command.
     * <p>
     * Geographic Location Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>LONGITUDE_DEGREES {@link Integer}
     * <li>LONGITUDE_MINUTES {@link Integer}
     * <li>LONG_SIGN {@link Boolean}
     * <li>LATITUDE_DEGREES {@link Integer}
     * <li>LATITUDE_MINUTES {@link Integer}
     * <li>LAT_SIGN {@link Boolean}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleGeographicLocationSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Longitude Degrees'
        response.put("LONGITUDE_DEGREES", Integer.valueOf(payload[2]));

        // Process 'Level'
        response.put("LONGITUDE_MINUTES", Integer.valueOf(payload[3] & 0x7F));
        response.put("LONG_SIGN", Boolean.valueOf((payload[3] & 0x80) != 0));

        // Process 'Latitude Degrees'
        response.put("LATITUDE_DEGREES", Integer.valueOf(payload[4]));

        // Process 'Level2'
        response.put("LATITUDE_MINUTES", Integer.valueOf(payload[5] & 0x7F));
        response.put("LAT_SIGN", Boolean.valueOf((payload[5] & 0x80) != 0));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the GEOGRAPHIC_LOCATION_GET command.
     * <p>
     * Geographic Location Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getGeographicLocationGet() {
        logger.debug("Creating command message GEOGRAPHIC_LOCATION_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(GEOGRAPHIC_LOCATION_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the GEOGRAPHIC_LOCATION_GET command.
     * <p>
     * Geographic Location Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleGeographicLocationGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the GEOGRAPHIC_LOCATION_REPORT command.
     * <p>
     * Geographic Location Report
     *
     * @param longitudeDegrees {@link Integer}
     * @param longitudeMinutes {@link Integer}
     * @param longSign {@link Boolean}
     * @param latitudeDegrees {@link Integer}
     * @param latitudeMinutes {@link Integer}
     * @param latSign {@link Boolean}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getGeographicLocationReport(Integer longitudeDegrees, Integer longitudeMinutes,
            Boolean longSign, Integer latitudeDegrees, Integer latitudeMinutes, Boolean latSign) {
        logger.debug("Creating command message GEOGRAPHIC_LOCATION_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(GEOGRAPHIC_LOCATION_REPORT);

        // Process 'Longitude Degrees'
        outputData.write(longitudeDegrees);

        // Process 'Level'
        int valLevel = 0;
        valLevel |= longitudeMinutes & 0x7F;
        valLevel |= longSign ? 0x80 : 0;
        outputData.write(valLevel);

        // Process 'Latitude Degrees'
        outputData.write(latitudeDegrees);

        // Process 'Level2'
        int valLevel2 = 0;
        valLevel2 |= latitudeMinutes & 0x7F;
        valLevel2 |= latSign ? 0x80 : 0;
        outputData.write(valLevel2);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the GEOGRAPHIC_LOCATION_REPORT command.
     * <p>
     * Geographic Location Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>LONGITUDE_DEGREES {@link Integer}
     * <li>LONGITUDE_MINUTES {@link Integer}
     * <li>LONG_SIGN {@link Boolean}
     * <li>LATITUDE_DEGREES {@link Integer}
     * <li>LATITUDE_MINUTES {@link Integer}
     * <li>LAT_SIGN {@link Boolean}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleGeographicLocationReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Longitude Degrees'
        response.put("LONGITUDE_DEGREES", Integer.valueOf(payload[2]));

        // Process 'Level'
        response.put("LONGITUDE_MINUTES", Integer.valueOf(payload[3] & 0x7F));
        response.put("LONG_SIGN", Boolean.valueOf((payload[3] & 0x80) != 0));

        // Process 'Latitude Degrees'
        response.put("LATITUDE_DEGREES", Integer.valueOf(payload[4]));

        // Process 'Level2'
        response.put("LATITUDE_MINUTES", Integer.valueOf(payload[5] & 0x7F));
        response.put("LAT_SIGN", Boolean.valueOf((payload[5] & 0x80) != 0));

        // Return the map of processed response data;
        return response;
    }

}
