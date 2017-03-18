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
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_ZIP_NAMING</b> version <b>1</b>.<br>
 * <p>
 * Command Class Z/IP Naming and Location<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassZipNamingV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassZipNamingV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_ZIP_NAMING
     */
    public final static int COMMAND_CLASS_KEY = 0x68;

    /**
     * Z/IP Name Set Command Constant
     */
    public final static int ZIP_NAMING_NAME_SET = 0x01;
    /**
     * Z/IP Name Get Command Constant
     */
    public final static int ZIP_NAMING_NAME_GET = 0x02;
    /**
     * Z/IP Name Report Command Constant
     */
    public final static int ZIP_NAMING_NAME_REPORT = 0x03;
    /**
     * Z/IP Location Set Command Constant
     */
    public final static int ZIP_NAMING_LOCATION_SET = 0x04;
    /**
     * Z/IP Location Get Command Constant
     */
    public final static int ZIP_NAMING_LOCATION_GET = 0x05;
    /**
     * Z/IP Location Report Command Constant
     */
    public final static int ZIP_NAMING_LOCATION_REPORT = 0x06;

    /**
     * Creates a new message with the ZIP_NAMING_NAME_SET command.<br>
     * <p>
     * Z/IP Name Set<br>
     *
     * @param name {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZipNamingNameSet(byte[] name) {
        logger.debug("Creating command message ZIP_NAMING_NAME_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZIP_NAMING_NAME_SET);

        // Process 'Name'
        try {
            outputData.write(name);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZIP_NAMING_NAME_SET command<br>
     * <p>
     * Z/IP Name Set<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>NAME {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZipNamingNameSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Name'
        ByteArrayOutputStream valName = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valName.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("NAME", valName);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ZIP_NAMING_NAME_GET command.<br>
     * <p>
     * Z/IP Name Get<br>
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZipNamingNameGet() {
        logger.debug("Creating command message ZIP_NAMING_NAME_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZIP_NAMING_NAME_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZIP_NAMING_NAME_GET command<br>
     * <p>
     * Z/IP Name Get<br>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZipNamingNameGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ZIP_NAMING_NAME_REPORT command.<br>
     * <p>
     * Z/IP Name Report<br>
     *
     * @param name {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZipNamingNameReport(byte[] name) {
        logger.debug("Creating command message ZIP_NAMING_NAME_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZIP_NAMING_NAME_REPORT);

        // Process 'Name'
        try {
            outputData.write(name);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZIP_NAMING_NAME_REPORT command<br>
     * <p>
     * Z/IP Name Report<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>NAME {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZipNamingNameReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Name'
        ByteArrayOutputStream valName = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valName.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("NAME", valName);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ZIP_NAMING_LOCATION_SET command.<br>
     * <p>
     * Z/IP Location Set<br>
     *
     * @param location {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZipNamingLocationSet(byte[] location) {
        logger.debug("Creating command message ZIP_NAMING_LOCATION_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZIP_NAMING_LOCATION_SET);

        // Process 'Location'
        try {
            outputData.write(location);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZIP_NAMING_LOCATION_SET command<br>
     * <p>
     * Z/IP Location Set<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>LOCATION {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZipNamingLocationSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Location'
        ByteArrayOutputStream valLocation = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valLocation.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("LOCATION", valLocation);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ZIP_NAMING_LOCATION_GET command.<br>
     * <p>
     * Z/IP Location Get<br>
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZipNamingLocationGet() {
        logger.debug("Creating command message ZIP_NAMING_LOCATION_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZIP_NAMING_LOCATION_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZIP_NAMING_LOCATION_GET command<br>
     * <p>
     * Z/IP Location Get<br>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZipNamingLocationGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ZIP_NAMING_LOCATION_REPORT command.<br>
     * <p>
     * Z/IP Location Report<br>
     *
     * @param location {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZipNamingLocationReport(byte[] location) {
        logger.debug("Creating command message ZIP_NAMING_LOCATION_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZIP_NAMING_LOCATION_REPORT);

        // Process 'Location'
        try {
            outputData.write(location);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZIP_NAMING_LOCATION_REPORT command<br>
     * <p>
     * Z/IP Location Report<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>LOCATION {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZipNamingLocationReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Location'
        ByteArrayOutputStream valLocation = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valLocation.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("LOCATION", valLocation);

        // Return the map of processed response data;
        return response;
    }

}
