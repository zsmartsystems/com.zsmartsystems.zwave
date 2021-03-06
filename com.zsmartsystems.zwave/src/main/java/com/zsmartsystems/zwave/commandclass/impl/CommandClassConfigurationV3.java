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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_CONFIGURATION</b> version <b>3</b>.
 * <p>
 * Command Class Configuration
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x70.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassConfigurationV3 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassConfigurationV3.class);

    /**
     * Integer command class key for COMMAND_CLASS_CONFIGURATION
     */
    public final static int COMMAND_CLASS_KEY = 0x70;

    /**
     * Configuration Set Command Constant
     */
    public final static int CONFIGURATION_SET = 0x04;
    /**
     * Configuration Get Command Constant
     */
    public final static int CONFIGURATION_GET = 0x05;
    /**
     * Configuration Report Command Constant
     */
    public final static int CONFIGURATION_REPORT = 0x06;
    /**
     * Configuration Bulk Set Command Constant
     */
    public final static int CONFIGURATION_BULK_SET = 0x07;
    /**
     * Configuration Bulk Get Command Constant
     */
    public final static int CONFIGURATION_BULK_GET = 0x08;
    /**
     * Configuration Bulk Report Command Constant
     */
    public final static int CONFIGURATION_BULK_REPORT = 0x09;
    /**
     * Configuration Name Get Command Constant
     */
    public final static int CONFIGURATION_NAME_GET = 0x0A;
    /**
     * Configuration Name Report Command Constant
     */
    public final static int CONFIGURATION_NAME_REPORT = 0x0B;
    /**
     * Configuration Info Get Command Constant
     */
    public final static int CONFIGURATION_INFO_GET = 0x0C;
    /**
     * Configuration Info Report Command Constant
     */
    public final static int CONFIGURATION_INFO_REPORT = 0x0D;
    /**
     * Configuration Properties Get Command Constant
     */
    public final static int CONFIGURATION_PROPERTIES_GET = 0x0E;
    /**
     * Configuration Properties Report Command Constant
     */
    public final static int CONFIGURATION_PROPERTIES_REPORT = 0x0F;

    /**
     * Map holding constants for ConfigurationBulkSetProperties1
     */
    private static Map<Integer, String> constantConfigurationBulkSetProperties1 = new HashMap<Integer, String>();

    /**
     * Map holding constants for ConfigurationPropertiesReportFormat
     */
    private static Map<Integer, String> constantConfigurationPropertiesReportFormat = new HashMap<Integer, String>();

    /**
     * Map holding constants for ConfigurationBulkReportProperties1
     */
    private static Map<Integer, String> constantConfigurationBulkReportProperties1 = new HashMap<Integer, String>();

    /**
     * Map holding constants for ConfigurationSetLevel
     */
    private static Map<Integer, String> constantConfigurationSetLevel = new HashMap<Integer, String>();

    static {
        // Constants for ConfigurationBulkSetProperties1
        constantConfigurationBulkSetProperties1.put(0x40, "HANDSHAKE");
        constantConfigurationBulkSetProperties1.put(0x80, "DEFAULT");

        // Constants for ConfigurationPropertiesReportFormat
        constantConfigurationPropertiesReportFormat.put(0x00, "SIGNED_INTEGER");
        constantConfigurationPropertiesReportFormat.put(0x01, "UNSIGNED_INTEGER");
        constantConfigurationPropertiesReportFormat.put(0x02, "ENUMERATED");
        constantConfigurationPropertiesReportFormat.put(0x03, "BIT_FIELD");

        // Constants for ConfigurationBulkReportProperties1
        constantConfigurationBulkReportProperties1.put(0x40, "HANDSHAKE");
        constantConfigurationBulkReportProperties1.put(0x80, "DEFAULT");

        // Constants for ConfigurationSetLevel
        constantConfigurationSetLevel.put(0x80, "DEFAULT");
    }

    /**
     * Creates a new message with the CONFIGURATION_SET command.
     * <p>
     * Configuration Set
     *
     * @param parameterNumber {@link Integer}
     * @param defaultValue {@link Boolean}
     * @param configurationValue {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationSet(Integer parameterNumber, Boolean defaultValue, byte[] configurationValue) {
        logger.debug("Creating command message CONFIGURATION_SET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_SET);

        // Process 'Parameter Number'
        outputData.write(parameterNumber);

        // Process 'Level'
        // Size is used by 'Configuration Value'
        int size = configurationValue.length;
        int valLevel = 0;
        valLevel |= size & 0x07;
        valLevel |= defaultValue ? 0x80 : 0;
        outputData.write(valLevel);

        // Process 'Configuration Value'
        if (configurationValue != null) {
            try {
                outputData.write(configurationValue);
            } catch (IOException e) {
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_SET command.
     * <p>
     * Configuration Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link Integer}
     * <li>DEFAULT {@link Boolean}
     * <li>CONFIGURATION_VALUE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Parameter Number'
        response.put("PARAMETER_NUMBER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Level'
        // Size is used by 'Configuration Value'
        int varSize = payload[msgOffset] & 0x07;
        response.put("DEFAULT", Boolean.valueOf((payload[msgOffset] & 0x80) != 0));
        msgOffset += 1;

        // Process 'Configuration Value'
        ByteArrayOutputStream valConfigurationValue = new ByteArrayOutputStream();
        for (int cntConfigurationValue = 0; cntConfigurationValue < varSize; cntConfigurationValue++) {
            valConfigurationValue.write(payload[msgOffset + cntConfigurationValue]);
        }
        response.put("CONFIGURATION_VALUE", valConfigurationValue.toByteArray());
        msgOffset += varSize;

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the CONFIGURATION_GET command.
     * <p>
     * Configuration Get
     *
     * @param parameterNumber {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationGet(Integer parameterNumber) {
        logger.debug("Creating command message CONFIGURATION_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_GET);

        // Process 'Parameter Number'
        outputData.write(parameterNumber);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_GET command.
     * <p>
     * Configuration Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Parameter Number'
        response.put("PARAMETER_NUMBER", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the CONFIGURATION_REPORT command.
     * <p>
     * Configuration Report
     *
     * @param parameterNumber {@link Integer}
     * @param configurationValue {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationReport(Integer parameterNumber, byte[] configurationValue) {
        logger.debug("Creating command message CONFIGURATION_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_REPORT);

        // Process 'Parameter Number'
        outputData.write(parameterNumber);

        // Process 'Level'
        // Size is used by 'Configuration Value'
        int size = configurationValue.length;
        outputData.write(size & 0x07);

        // Process 'Configuration Value'
        if (configurationValue != null) {
            try {
                outputData.write(configurationValue);
            } catch (IOException e) {
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_REPORT command.
     * <p>
     * Configuration Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link Integer}
     * <li>CONFIGURATION_VALUE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Parameter Number'
        response.put("PARAMETER_NUMBER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Level'
        // Size is used by 'Configuration Value'
        int varSize = payload[msgOffset] & 0x07;
        msgOffset += 1;

        // Process 'Configuration Value'
        ByteArrayOutputStream valConfigurationValue = new ByteArrayOutputStream();
        for (int cntConfigurationValue = 0; cntConfigurationValue < varSize; cntConfigurationValue++) {
            valConfigurationValue.write(payload[msgOffset + cntConfigurationValue]);
        }
        response.put("CONFIGURATION_VALUE", valConfigurationValue.toByteArray());
        msgOffset += varSize;

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the CONFIGURATION_BULK_SET command.
     * <p>
     * Configuration Bulk Set
     *
     * @param parameterOffset {@link Integer}
     * @param numberOfParameters {@link Integer}
     * @param size {@link Integer}
     * @param handshake {@link Boolean}
     * @param defaultValue {@link Boolean}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationBulkSet(Integer parameterOffset, Integer numberOfParameters, Integer size,
            Boolean handshake, Boolean defaultValue) {
        logger.debug("Creating command message CONFIGURATION_BULK_SET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_BULK_SET);

        // Process 'Parameter Offset'
        outputData.write((parameterOffset >> 8) & 0xff);
        outputData.write(parameterOffset & 0xff);

        // Process 'Number of Parameters'
        outputData.write(numberOfParameters);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= size & 0x07;
        valProperties1 |= handshake ? 0x40 : 0;
        valProperties1 |= defaultValue ? 0x80 : 0;
        outputData.write(valProperties1);

        // Process 'vg'

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_BULK_SET command.
     * <p>
     * Configuration Bulk Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_OFFSET {@link Integer}
     * <li>NUMBER_OF_PARAMETERS {@link Integer}
     * <li>SIZE {@link Integer}
     * <li>HANDSHAKE {@link Boolean}
     * <li>DEFAULT {@link Boolean}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationBulkSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Parameter Offset'
        response.put("PARAMETER_OFFSET", Integer.valueOf(((payload[msgOffset] & 0xff) << 8) + (payload[msgOffset + 1] & 0xff)));
        msgOffset += 2;

        // Process 'Number of Parameters'
        response.put("NUMBER_OF_PARAMETERS", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties1'
        response.put("SIZE", Integer.valueOf(payload[msgOffset] & 0x07));
        response.put("HANDSHAKE", Boolean.valueOf((payload[msgOffset] & 0x40) != 0));
        response.put("DEFAULT", Boolean.valueOf((payload[msgOffset] & 0x80) != 0));
        msgOffset += 1;

        // Process 'vg'

        // Create a list to hold the group vg
        List<Map<String, Object>> variantList = new ArrayList<Map<String, Object>>();

        int offset = msgOffset;
        while (offset < payload.length) {
            // Create a map to hold the members of this variant
            Map<String, Object> variant = new HashMap<String, Object>();

            // Process 'Parameter'
            ByteArrayOutputStream valParameter = new ByteArrayOutputStream();
            int lenParameter = payload[0] & 0x07;
            for (int cntParameter = 0; cntParameter < lenParameter; cntParameter++) {
                valParameter.write(payload[msgOffset + cntParameter]);
            }
            variant.put("PARAMETER", valParameter.toByteArray());
            msgOffset += lenParameter;

            // Add to the list
            variantList.add(variant);

            // Add the length of this variant
            offset += (payload[offset + 1] & 0xFF) >> 0;
        }

        // Add the variant list to the response
        response.put("VG", variantList);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the CONFIGURATION_BULK_GET command.
     * <p>
     * Configuration Bulk Get
     *
     * @param parameterOffset {@link Integer}
     * @param numberOfParameters {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationBulkGet(Integer parameterOffset, Integer numberOfParameters) {
        logger.debug("Creating command message CONFIGURATION_BULK_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_BULK_GET);

        // Process 'Parameter Offset'
        outputData.write((parameterOffset >> 8) & 0xff);
        outputData.write(parameterOffset & 0xff);

        // Process 'Number of Parameters'
        outputData.write(numberOfParameters);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_BULK_GET command.
     * <p>
     * Configuration Bulk Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_OFFSET {@link Integer}
     * <li>NUMBER_OF_PARAMETERS {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationBulkGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Parameter Offset'
        response.put("PARAMETER_OFFSET", Integer.valueOf(((payload[2] & 0xff) << 8) + (payload[3] & 0xff)));

        // Process 'Number of Parameters'
        response.put("NUMBER_OF_PARAMETERS", Integer.valueOf(payload[4]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the CONFIGURATION_BULK_REPORT command.
     * <p>
     * Configuration Bulk Report
     *
     * @param parameterOffset {@link Integer}
     * @param numberOfParameters {@link Integer}
     * @param reportsToFollow {@link Integer}
     * @param size {@link Integer}
     * @param handshake {@link Boolean}
     * @param defaultValue {@link Boolean}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationBulkReport(Integer parameterOffset, Integer numberOfParameters,
            Integer reportsToFollow, Integer size, Boolean handshake, Boolean defaultValue) {
        logger.debug("Creating command message CONFIGURATION_BULK_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_BULK_REPORT);

        // Process 'Parameter Offset'
        outputData.write((parameterOffset >> 8) & 0xff);
        outputData.write(parameterOffset & 0xff);

        // Process 'Number of Parameters'
        outputData.write(numberOfParameters);

        // Process 'Reports to follow'
        outputData.write(reportsToFollow);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= size & 0x07;
        valProperties1 |= handshake ? 0x40 : 0;
        valProperties1 |= defaultValue ? 0x80 : 0;
        outputData.write(valProperties1);

        // Process 'vg'

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_BULK_REPORT command.
     * <p>
     * Configuration Bulk Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_OFFSET {@link Integer}
     * <li>NUMBER_OF_PARAMETERS {@link Integer}
     * <li>REPORTS_TO_FOLLOW {@link Integer}
     * <li>SIZE {@link Integer}
     * <li>HANDSHAKE {@link Boolean}
     * <li>DEFAULT {@link Boolean}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationBulkReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Parameter Offset'
        response.put("PARAMETER_OFFSET", Integer.valueOf(((payload[msgOffset] & 0xff) << 8) + (payload[msgOffset + 1] & 0xff)));
        msgOffset += 2;

        // Process 'Number of Parameters'
        response.put("NUMBER_OF_PARAMETERS", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Reports to follow'
        response.put("REPORTS_TO_FOLLOW", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties1'
        response.put("SIZE", Integer.valueOf(payload[msgOffset] & 0x07));
        response.put("HANDSHAKE", Boolean.valueOf((payload[msgOffset] & 0x40) != 0));
        response.put("DEFAULT", Boolean.valueOf((payload[msgOffset] & 0x80) != 0));
        msgOffset += 1;

        // Process 'vg'

        // Create a list to hold the group vg
        List<Map<String, Object>> variantList = new ArrayList<Map<String, Object>>();

        int offset = msgOffset;
        while (offset < payload.length) {
            // Create a map to hold the members of this variant
            Map<String, Object> variant = new HashMap<String, Object>();

            // Process 'Parameter'
            ByteArrayOutputStream valParameter = new ByteArrayOutputStream();
            int lenParameter = payload[0] & 0x07;
            for (int cntParameter = 0; cntParameter < lenParameter; cntParameter++) {
                valParameter.write(payload[msgOffset + cntParameter]);
            }
            variant.put("PARAMETER", valParameter.toByteArray());
            msgOffset += lenParameter;

            // Add to the list
            variantList.add(variant);

            // Add the length of this variant
            offset += (payload[offset + 1] & 0xFF) >> 0;
        }

        // Add the variant list to the response
        response.put("VG", variantList);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the CONFIGURATION_NAME_GET command.
     * <p>
     * Configuration Name Get
     *
     * @param parameterNumber {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationNameGet(Integer parameterNumber) {
        logger.debug("Creating command message CONFIGURATION_NAME_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_NAME_GET);

        // Process 'Parameter Number'
        outputData.write((parameterNumber >> 8) & 0xff);
        outputData.write(parameterNumber & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_NAME_GET command.
     * <p>
     * Configuration Name Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationNameGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Parameter Number'
        response.put("PARAMETER_NUMBER", Integer.valueOf(((payload[2] & 0xff) << 8) + (payload[3] & 0xff)));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the CONFIGURATION_NAME_REPORT command.
     * <p>
     * Configuration Name Report
     *
     * @param parameterNumber {@link Integer}
     * @param reportsToFollow {@link Integer}
     * @param name {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationNameReport(Integer parameterNumber, Integer reportsToFollow, byte[] name) {
        logger.debug("Creating command message CONFIGURATION_NAME_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_NAME_REPORT);

        // Process 'Parameter Number'
        outputData.write((parameterNumber >> 8) & 0xff);
        outputData.write(parameterNumber & 0xff);

        // Process 'Reports to follow'
        outputData.write(reportsToFollow);

        // Process 'Name'
        if (name != null) {
            try {
                outputData.write(name);
            } catch (IOException e) {
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_NAME_REPORT command.
     * <p>
     * Configuration Name Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link Integer}
     * <li>REPORTS_TO_FOLLOW {@link Integer}
     * <li>NAME {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationNameReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Parameter Number'
        response.put("PARAMETER_NUMBER", Integer.valueOf(((payload[msgOffset] & 0xff) << 8) + (payload[msgOffset + 1] & 0xff)));
        msgOffset += 2;

        // Process 'Reports to follow'
        response.put("REPORTS_TO_FOLLOW", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

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
     * Creates a new message with the CONFIGURATION_INFO_GET command.
     * <p>
     * Configuration Info Get
     *
     * @param parameterNumber {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationInfoGet(Integer parameterNumber) {
        logger.debug("Creating command message CONFIGURATION_INFO_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_INFO_GET);

        // Process 'Parameter Number'
        outputData.write((parameterNumber >> 8) & 0xff);
        outputData.write(parameterNumber & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_INFO_GET command.
     * <p>
     * Configuration Info Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationInfoGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Parameter Number'
        response.put("PARAMETER_NUMBER", Integer.valueOf(((payload[2] & 0xff) << 8) + (payload[3] & 0xff)));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the CONFIGURATION_INFO_REPORT command.
     * <p>
     * Configuration Info Report
     *
     * @param parameterNumber {@link Integer}
     * @param reportsToFollow {@link Integer}
     * @param info {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationInfoReport(Integer parameterNumber, Integer reportsToFollow, byte[] info) {
        logger.debug("Creating command message CONFIGURATION_INFO_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_INFO_REPORT);

        // Process 'Parameter Number'
        outputData.write((parameterNumber >> 8) & 0xff);
        outputData.write(parameterNumber & 0xff);

        // Process 'Reports to follow'
        outputData.write(reportsToFollow);

        // Process 'Info'
        if (info != null) {
            try {
                outputData.write(info);
            } catch (IOException e) {
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_INFO_REPORT command.
     * <p>
     * Configuration Info Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link Integer}
     * <li>REPORTS_TO_FOLLOW {@link Integer}
     * <li>INFO {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationInfoReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Parameter Number'
        response.put("PARAMETER_NUMBER", Integer.valueOf(((payload[msgOffset] & 0xff) << 8) + (payload[msgOffset + 1] & 0xff)));
        msgOffset += 2;

        // Process 'Reports to follow'
        response.put("REPORTS_TO_FOLLOW", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Info'
        ByteArrayOutputStream valInfo = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valInfo.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("INFO", valInfo);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the CONFIGURATION_PROPERTIES_GET command.
     * <p>
     * Configuration Properties Get
     *
     * @param parameterNumber {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationPropertiesGet(Integer parameterNumber) {
        logger.debug("Creating command message CONFIGURATION_PROPERTIES_GET version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_PROPERTIES_GET);

        // Process 'Parameter Number'
        outputData.write((parameterNumber >> 8) & 0xff);
        outputData.write(parameterNumber & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_PROPERTIES_GET command.
     * <p>
     * Configuration Properties Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationPropertiesGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Parameter Number'
        response.put("PARAMETER_NUMBER", Integer.valueOf(((payload[2] & 0xff) << 8) + (payload[3] & 0xff)));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the CONFIGURATION_PROPERTIES_REPORT command.
     * <p>
     * Configuration Properties Report
     *
     * @param parameterNumber {@link Integer}
     * @param format {@link String}
     *            Can be one of the following -:
     *            <p>
     *            <ul>
     *            <li>SIGNED_INTEGER
     *            <li>UNSIGNED_INTEGER
     *            <li>ENUMERATED
     *            <li>BIT_FIELD
     *            </ul>
     * @param minValue {@link byte[]}
     * @param maxValue {@link byte[]}
     * @param defaultValue {@link byte[]}
     * @param nextParameterNumber {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getConfigurationPropertiesReport(Integer parameterNumber, String format, byte[] minValue,
            byte[] maxValue, byte[] defaultValue, Integer nextParameterNumber) {
        logger.debug("Creating command message CONFIGURATION_PROPERTIES_REPORT version 3");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(CONFIGURATION_PROPERTIES_REPORT);

        // Process 'Parameter Number'
        outputData.write((parameterNumber >> 8) & 0xff);
        outputData.write(parameterNumber & 0xff);

        // Process 'Properties1'
        // Size is used by 'Min Value' and 'Max Value' and 'Default Value'
        int size = minValue.length;
        int valProperties1 = 0;
        valProperties1 |= size & 0x07;
        int varFormat = Integer.MAX_VALUE;
        for (Integer entry : constantConfigurationPropertiesReportFormat.keySet()) {
            if (constantConfigurationPropertiesReportFormat.get(entry).equals(format)) {
                varFormat = entry;
                break;
            }
        }
        if (varFormat == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Unknown constant value '" + format + "' for format");
        }
        valProperties1 |= varFormat << 3 & 0x38;
        outputData.write(valProperties1);

        // Process 'Min Value'
        if (minValue != null) {
            try {
                outputData.write(minValue);
            } catch (IOException e) {
            }
        }

        // Process 'Max Value'
        if (maxValue != null) {
            try {
                outputData.write(maxValue);
            } catch (IOException e) {
            }
        }

        // Process 'Default Value'
        if (defaultValue != null) {
            try {
                outputData.write(defaultValue);
            } catch (IOException e) {
            }
        }

        // Process 'Next Parameter Number'
        outputData.write((nextParameterNumber >> 8) & 0xff);
        outputData.write(nextParameterNumber & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the CONFIGURATION_PROPERTIES_REPORT command.
     * <p>
     * Configuration Properties Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>PARAMETER_NUMBER {@link Integer}
     * <li>FORMAT {@link String}
     * Can be one of the following -:
     * <p>
     * <ul>
     * <li>SIGNED_INTEGER
     * <li>UNSIGNED_INTEGER
     * <li>ENUMERATED
     * <li>BIT_FIELD
     * </ul>
     * <li>MIN_VALUE {@link byte[]}
     * <li>MAX_VALUE {@link byte[]}
     * <li>DEFAULT_VALUE {@link byte[]}
     * <li>NEXT_PARAMETER_NUMBER {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleConfigurationPropertiesReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Parameter Number'
        response.put("PARAMETER_NUMBER", Integer.valueOf(((payload[msgOffset] & 0xff) << 8) + (payload[msgOffset + 1] & 0xff)));
        msgOffset += 2;

        // Process 'Properties1'
        // Size is used by 'Min Value' and 'Max Value' and 'Default Value'
        int varSize = payload[msgOffset] & 0x07;
        response.put("FORMAT", constantConfigurationPropertiesReportFormat.get((payload[msgOffset] & 0x38) >> 3));
        msgOffset += 1;

        // Process 'Min Value'
        ByteArrayOutputStream valMinValue = new ByteArrayOutputStream();
        for (int cntMinValue = 0; cntMinValue < varSize; cntMinValue++) {
            valMinValue.write(payload[msgOffset + cntMinValue]);
        }
        response.put("MIN_VALUE", valMinValue.toByteArray());
        msgOffset += varSize;

        // Process 'Max Value'
        ByteArrayOutputStream valMaxValue = new ByteArrayOutputStream();
        for (int cntMaxValue = 0; cntMaxValue < varSize; cntMaxValue++) {
            valMaxValue.write(payload[msgOffset + cntMaxValue]);
        }
        response.put("MAX_VALUE", valMaxValue.toByteArray());
        msgOffset += varSize;

        // Process 'Default Value'
        ByteArrayOutputStream valDefaultValue = new ByteArrayOutputStream();
        for (int cntDefaultValue = 0; cntDefaultValue < varSize; cntDefaultValue++) {
            valDefaultValue.write(payload[msgOffset + cntDefaultValue]);
        }
        response.put("DEFAULT_VALUE", valDefaultValue.toByteArray());
        msgOffset += varSize;

        // Process 'Next Parameter Number'
        response.put("NEXT_PARAMETER_NUMBER", Integer.valueOf(((payload[msgOffset] & 0xff) << 8) + (payload[msgOffset + 1] & 0xff)));
        msgOffset += 2;

        // Return the map of processed response data;
        return response;
    }
}
