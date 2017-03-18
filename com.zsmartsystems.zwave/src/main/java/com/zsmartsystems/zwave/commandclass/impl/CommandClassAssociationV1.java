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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_ASSOCIATION</b> version <b>1</b>.<br>
 * <p>
 * Command Class Association<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassAssociationV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassAssociationV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_ASSOCIATION
     */
    public final static int COMMAND_CLASS_KEY = 0x85;

    /**
     * Association Set Command Constant
     */
    public final static int ASSOCIATION_SET = 0x01;
    /**
     * Association Get Command Constant
     */
    public final static int ASSOCIATION_GET = 0x02;
    /**
     * Association Report Command Constant
     */
    public final static int ASSOCIATION_REPORT = 0x03;
    /**
     * Association Remove Command Constant
     */
    public final static int ASSOCIATION_REMOVE = 0x04;
    /**
     * Association Groupings Get Command Constant
     */
    public final static int ASSOCIATION_GROUPINGS_GET = 0x05;
    /**
     * Association Groupings Report Command Constant
     */
    public final static int ASSOCIATION_GROUPINGS_REPORT = 0x06;

    /**
     * Creates a new message with the ASSOCIATION_SET command.<br>
     * <p>
     * Association Set<br>
     *
     * @param groupingIdentifier {@link Integer}
     * @param nodeId {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getAssociationSet(Integer groupingIdentifier, byte[] nodeId) {
        logger.debug("Creating command message ASSOCIATION_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ASSOCIATION_SET);

        // Process 'Grouping Identifier'
        outputData.write(groupingIdentifier);

        // Process 'Node ID'
        try {
            outputData.write(nodeId);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ASSOCIATION_SET command<br>
     * <p>
     * Association Set<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>GROUPING_IDENTIFIER {@link Integer}
     * <li>NODE_ID {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleAssociationSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Grouping Identifier'
        response.put("GROUPING_IDENTIFIER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Node ID'
        ByteArrayOutputStream valNodeId = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valNodeId.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("NODE_ID", valNodeId);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ASSOCIATION_GET command.<br>
     * <p>
     * Association Get<br>
     *
     * @param groupingIdentifier {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getAssociationGet(Integer groupingIdentifier) {
        logger.debug("Creating command message ASSOCIATION_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ASSOCIATION_GET);

        // Process 'Grouping Identifier'
        outputData.write(groupingIdentifier);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ASSOCIATION_GET command<br>
     * <p>
     * Association Get<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>GROUPING_IDENTIFIER {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleAssociationGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Grouping Identifier'
        response.put("GROUPING_IDENTIFIER", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ASSOCIATION_REPORT command.<br>
     * <p>
     * Association Report<br>
     *
     * @param groupingIdentifier {@link Integer}
     * @param maxNodesSupported {@link Integer}
     * @param reportsToFollow {@link Integer}
     * @param nodeid {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getAssociationReport(Integer groupingIdentifier, Integer maxNodesSupported,
            Integer reportsToFollow, byte[] nodeid) {
        logger.debug("Creating command message ASSOCIATION_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ASSOCIATION_REPORT);

        // Process 'Grouping Identifier'
        outputData.write(groupingIdentifier);

        // Process 'Max Nodes Supported'
        outputData.write(maxNodesSupported);

        // Process 'Reports to Follow'
        outputData.write(reportsToFollow);

        // Process 'NodeID'
        try {
            outputData.write(nodeid);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ASSOCIATION_REPORT command<br>
     * <p>
     * Association Report<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>GROUPING_IDENTIFIER {@link Integer}
     * <li>MAX_NODES_SUPPORTED {@link Integer}
     * <li>REPORTS_TO_FOLLOW {@link Integer}
     * <li>NODEID {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleAssociationReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Grouping Identifier'
        response.put("GROUPING_IDENTIFIER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Max Nodes Supported'
        response.put("MAX_NODES_SUPPORTED", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Reports to Follow'
        response.put("REPORTS_TO_FOLLOW", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'NodeID'
        ByteArrayOutputStream valNodeid = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valNodeid.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("NODEID", valNodeid);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ASSOCIATION_REMOVE command.<br>
     * <p>
     * Association Remove<br>
     *
     * @param groupingIdentifier {@link Integer}
     * @param nodeId {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getAssociationRemove(Integer groupingIdentifier, byte[] nodeId) {
        logger.debug("Creating command message ASSOCIATION_REMOVE version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ASSOCIATION_REMOVE);

        // Process 'Grouping Identifier'
        outputData.write(groupingIdentifier);

        // Process 'Node ID'
        try {
            outputData.write(nodeId);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ASSOCIATION_REMOVE command<br>
     * <p>
     * Association Remove<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>GROUPING_IDENTIFIER {@link Integer}
     * <li>NODE_ID {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleAssociationRemove(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Grouping Identifier'
        response.put("GROUPING_IDENTIFIER", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Node ID'
        ByteArrayOutputStream valNodeId = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valNodeId.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("NODE_ID", valNodeId);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ASSOCIATION_GROUPINGS_GET command.<br>
     * <p>
     * Association Groupings Get<br>
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getAssociationGroupingsGet() {
        logger.debug("Creating command message ASSOCIATION_GROUPINGS_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ASSOCIATION_GROUPINGS_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ASSOCIATION_GROUPINGS_GET command<br>
     * <p>
     * Association Groupings Get<br>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleAssociationGroupingsGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ASSOCIATION_GROUPINGS_REPORT command.<br>
     * <p>
     * Association Groupings Report<br>
     *
     * @param supportedGroupings {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getAssociationGroupingsReport(Integer supportedGroupings) {
        logger.debug("Creating command message ASSOCIATION_GROUPINGS_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ASSOCIATION_GROUPINGS_REPORT);

        // Process 'Supported Groupings'
        outputData.write(supportedGroupings);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ASSOCIATION_GROUPINGS_REPORT command<br>
     * <p>
     * Association Groupings Report<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SUPPORTED_GROUPINGS {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleAssociationGroupingsReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Supported Groupings'
        response.put("SUPPORTED_GROUPINGS", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

}
