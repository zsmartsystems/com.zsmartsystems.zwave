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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_ASSOCIATION_COMMAND_CONFIGURATION</b> version <b>1</b>.<br>
 *
 * Command Class Association Command Configuration<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassAssociationCommandConfigurationV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassAssociationCommandConfigurationV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_ASSOCIATION_COMMAND_CONFIGURATION
     */
    public final static int COMMAND_CLASS_KEY = 0x9B;

    /**
     * Command Records Supported Get Command Constant
     */
    public final static int COMMAND_RECORDS_SUPPORTED_GET = 0x01;
    /**
     * Command Records Supported Report Command Constant
     */
    public final static int COMMAND_RECORDS_SUPPORTED_REPORT = 0x02;
    /**
     * Command Configuration Set Command Constant
     */
    public final static int COMMAND_CONFIGURATION_SET = 0x03;
    /**
     * Command Configuration Get Command Constant
     */
    public final static int COMMAND_CONFIGURATION_GET = 0x04;
    /**
     * Command Configuration Report Command Constant
     */
    public final static int COMMAND_CONFIGURATION_REPORT = 0x05;

    /**
     * Creates a new message with the COMMAND_RECORDS_SUPPORTED_GET command.<br>
     *
     * Command Records Supported Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getCommandRecordsSupportedGet() {
        logger.debug("Creating command message COMMAND_RECORDS_SUPPORTED_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(COMMAND_RECORDS_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the COMMAND_RECORDS_SUPPORTED_GET command<br>
     *
     * Command Records Supported Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleCommandRecordsSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the COMMAND_RECORDS_SUPPORTED_REPORT command.<br>
     *
     * Command Records Supported Report<br>
     *
     *
     * @param confCmd {@link Boolean}
     * @param vC {@link Boolean}
     * @param maxCommandLength {@link Integer}
     * @param freeCommandRecords {@link Integer}
     * @param maxCommandRecords {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getCommandRecordsSupportedReport(Boolean confCmd, Boolean vC, Integer maxCommandLength,
            Integer freeCommandRecords, Integer maxCommandRecords) {
        logger.debug("Creating command message COMMAND_RECORDS_SUPPORTED_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(COMMAND_RECORDS_SUPPORTED_REPORT);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= confCmd ? 0x01 : 0;
        valProperties1 |= vC ? 0x02 : 0;
        valProperties1 |= ((maxCommandLength << 2) & 0xFC);
        outputData.write(valProperties1);

        // Process 'Free Command records'
        outputData.write((freeCommandRecords >> 8) & 0xff);
        outputData.write(freeCommandRecords & 0xff);

        // Process 'Max Command records'
        outputData.write((maxCommandRecords >> 8) & 0xff);
        outputData.write(maxCommandRecords & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the COMMAND_RECORDS_SUPPORTED_REPORT command<br>
     *
     * Command Records Supported Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>CONF_CMD {@link Boolean}
     * <li>V_C {@link Boolean}
     * <li>MAX_COMMAND_LENGTH {@link Integer}
     * <li>FREE_COMMAND_RECORDS {@link Integer}
     * <li>MAX_COMMAND_RECORDS {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleCommandRecordsSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Properties1'
        response.put("CONF_CMD", Boolean.valueOf((payload[2] & 0x01) != 0));
        response.put("V_C", Boolean.valueOf((payload[2] & 0x02) != 0));
        response.put("MAX_COMMAND_LENGTH", Integer.valueOf((payload[2] & 0xFC >> 2)));

        // Process 'Free Command records'
        response.put("FREE_COMMAND_RECORDS", Integer.valueOf(payload[3] << 8 + payload[4]));

        // Process 'Max Command records'
        response.put("MAX_COMMAND_RECORDS", Integer.valueOf(payload[5] << 8 + payload[6]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the COMMAND_CONFIGURATION_SET command.<br>
     *
     * Command Configuration Set<br>
     *
     *
     * @param groupingIdentifier {@link Integer}
     * @param nodeId {@link Integer}
     * @param commandLength {@link Integer}
     * @param commandClassIdentifier {@link Integer}
     * @param commandIdentifier {@link Integer}
     * @param commandByte {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getCommandConfigurationSet(Integer groupingIdentifier, Integer nodeId, Integer commandLength,
            Integer commandClassIdentifier, Integer commandIdentifier, byte[] commandByte) {
        logger.debug("Creating command message COMMAND_CONFIGURATION_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(COMMAND_CONFIGURATION_SET);

        // Process 'Grouping identifier'
        outputData.write(groupingIdentifier);

        // Process 'Node ID'
        // Check the node number boundary
        if (nodeId < 1 || nodeId > 232) {
            logger.debug("Node number is out of bounds {}", nodeId);
            return null;
        }
        outputData.write(nodeId);

        // Process 'Command length'
        outputData.write(commandLength);

        // Process 'Command Class identifier'
        outputData.write(commandClassIdentifier);

        // Process 'Command identifier'
        outputData.write(commandIdentifier);

        // Process 'Command byte'
        try {
            outputData.write(commandByte);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the COMMAND_CONFIGURATION_SET command<br>
     *
     * Command Configuration Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>GROUPING_IDENTIFIER {@link Integer}
     * <li>NODE_ID {@link Integer}
     * <li>COMMAND_LENGTH {@link Integer}
     * <li>COMMAND_CLASS_IDENTIFIER {@link Integer}
     * <li>COMMAND_IDENTIFIER {@link Integer}
     * <li>COMMAND_BYTE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleCommandConfigurationSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Grouping identifier'
        response.put("GROUPING_IDENTIFIER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Node ID'
        response.put("NODE_ID", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Command length'
        response.put("COMMAND_LENGTH", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Command Class identifier'
        response.put("COMMAND_CLASS_IDENTIFIER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Command identifier'
        response.put("COMMAND_IDENTIFIER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Command byte'
        ByteArrayOutputStream valCommandByte = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valCommandByte.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("COMMAND_BYTE", valCommandByte);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the COMMAND_CONFIGURATION_GET command.<br>
     *
     * Command Configuration Get<br>
     *
     *
     * @param groupingIdentifier {@link Integer}
     * @param nodeId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getCommandConfigurationGet(Integer groupingIdentifier, Integer nodeId) {
        logger.debug("Creating command message COMMAND_CONFIGURATION_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(COMMAND_CONFIGURATION_GET);

        // Process 'Grouping identifier'
        outputData.write(groupingIdentifier);

        // Process 'Node ID'
        // Check the node number boundary
        if (nodeId < 1 || nodeId > 232) {
            logger.debug("Node number is out of bounds {}", nodeId);
            return null;
        }
        outputData.write(nodeId);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the COMMAND_CONFIGURATION_GET command<br>
     *
     * Command Configuration Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>GROUPING_IDENTIFIER {@link Integer}
     * <li>NODE_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleCommandConfigurationGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Grouping identifier'
        response.put("GROUPING_IDENTIFIER", Integer.valueOf(payload[2]));

        // Process 'Node ID'
        response.put("NODE_ID", Integer.valueOf(payload[3]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the COMMAND_CONFIGURATION_REPORT command.<br>
     *
     * Command Configuration Report<br>
     *
     *
     * @param groupingIdentifier {@link Integer}
     * @param nodeId {@link Integer}
     * @param reportsToFollow {@link Integer}
     * @param commandLength {@link Integer}
     * @param commandClassIdentifier {@link Integer}
     * @param commandIdentifier {@link Integer}
     * @param commandByte {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getCommandConfigurationReport(Integer groupingIdentifier, Integer nodeId,
            Integer reportsToFollow, Integer commandLength, Integer commandClassIdentifier, Integer commandIdentifier,
            byte[] commandByte) {
        logger.debug("Creating command message COMMAND_CONFIGURATION_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(COMMAND_CONFIGURATION_REPORT);

        // Process 'Grouping identifier'
        outputData.write(groupingIdentifier);

        // Process 'Node ID'
        // Check the node number boundary
        if (nodeId < 1 || nodeId > 232) {
            logger.debug("Node number is out of bounds {}", nodeId);
            return null;
        }
        outputData.write(nodeId);

        // Process 'Properties1'
        outputData.write(reportsToFollow & 0x0F);

        // Process 'Command length'
        outputData.write(commandLength);

        // Process 'Command Class identifier'
        outputData.write(commandClassIdentifier);

        // Process 'Command identifier'
        outputData.write(commandIdentifier);

        // Process 'Command byte'
        try {
            outputData.write(commandByte);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the COMMAND_CONFIGURATION_REPORT command<br>
     *
     * Command Configuration Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>GROUPING_IDENTIFIER {@link Integer}
     * <li>NODE_ID {@link Integer}
     * <li>REPORTS_TO_FOLLOW {@link Integer}
     * <li>COMMAND_LENGTH {@link Integer}
     * <li>COMMAND_CLASS_IDENTIFIER {@link Integer}
     * <li>COMMAND_IDENTIFIER {@link Integer}
     * <li>COMMAND_BYTE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleCommandConfigurationReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Grouping identifier'
        response.put("GROUPING_IDENTIFIER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Node ID'
        response.put("NODE_ID", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Properties1'
        response.put("REPORTS_TO_FOLLOW", Integer.valueOf(payload[msgOffset] & 0x0F));
        msgOffset += 1;

        // Process 'Command length'
        response.put("COMMAND_LENGTH", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Command Class identifier'
        response.put("COMMAND_CLASS_IDENTIFIER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Command identifier'
        response.put("COMMAND_IDENTIFIER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Command byte'
        ByteArrayOutputStream valCommandByte = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valCommandByte.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("COMMAND_BYTE", valCommandByte);

        // Return the map of processed response data;
        return response;
    }

}
