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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_NETWORK_MANAGEMENT_BASIC</b> version <b>1</b>.<br>
 *
 * Command Class Network Management Basic<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassNetworkManagementBasicV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassNetworkManagementBasicV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_NETWORK_MANAGEMENT_BASIC
     */
    public final static int COMMAND_CLASS_KEY = 0x4D;

    /**
     * Learn Mode Set Command Constant
     */
    public final static int LEARN_MODE_SET = 0x01;
    /**
     * Learn Mode Set Status Command Constant
     */
    public final static int LEARN_MODE_SET_STATUS = 0x02;
    /**
     * Network Update Request Command Constant
     */
    public final static int NETWORK_UPDATE_REQUEST = 0x03;
    /**
     * Network Update Request Status Command Constant
     */
    public final static int NETWORK_UPDATE_REQUEST_STATUS = 0x04;
    /**
     * Node Information Send Command Constant
     */
    public final static int NODE_INFORMATION_SEND = 0x05;
    /**
     * Default Set Command Constant
     */
    public final static int DEFAULT_SET = 0x06;
    /**
     * Default Set Complete Command Constant
     */
    public final static int DEFAULT_SET_COMPLETE = 0x07;

    /**
     * Creates a new message with the LEARN_MODE_SET command.<br>
     *
     * Learn Mode Set<br>
     *
     *
     * @param seqNo {@link Integer}
     * @param mode {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getLearnModeSet(Integer seqNo, Integer mode) {
        logger.debug("Creating command message LEARN_MODE_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(LEARN_MODE_SET);

        // Process 'Seq. No'
        outputData.write(seqNo);

        // Process 'Reserved'
        // Process 'Mode'
        outputData.write(mode);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the LEARN_MODE_SET command<br>
     *
     * Learn Mode Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SEQ_NO {@link Integer}
     * <li>MODE {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleLearnModeSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Seq. No'
        response.put("SEQ_NO", new Integer(payload[2]));

        // Process 'Mode'
        switch ((int) payload[4]) {
            case 0x01:
                response.put("MODE", "LEARN_MODE_SET_CLASSIC");
                break;
            case 0x02:
                response.put("MODE", "LEARN_MODE_SET_NWI");
                break;
            case 0x00:
                response.put("MODE", "LEARN_MODE_SET_DISABLE");
                break;
            default:
                logger.debug("");
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the LEARN_MODE_SET_STATUS command.<br>
     *
     * Learn Mode Set Status<br>
     *
     *
     * @param seqNo {@link Integer}
     * @param status {@link Integer}
     * @param newNodeId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getLearnModeSetStatus(Integer seqNo, Integer status, Integer newNodeId) {
        logger.debug("Creating command message LEARN_MODE_SET_STATUS version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(LEARN_MODE_SET_STATUS);

        // Process 'Seq. No'
        outputData.write(seqNo);

        // Process 'Status'
        outputData.write(status);

        // Process 'Reserved'
        // Process 'New Node ID'
        // Check the node number boundary
        if (newNodeId < 1 || newNodeId > 232) {
            logger.debug("Node number is out of bounds {}", newNodeId);
            return null;
        }
        outputData.write(newNodeId);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the LEARN_MODE_SET_STATUS command<br>
     *
     * Learn Mode Set Status<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SEQ_NO {@link Integer}
     * <li>STATUS {@link Integer}
     * <li>NEW_NODE_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleLearnModeSetStatus(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Seq. No'
        response.put("SEQ_NO", new Integer(payload[2]));

        // Process 'Status'
        switch ((int) payload[3]) {
            case 0x06:
                response.put("STATUS", "LEARN_MODE_DONE");
                break;
            case 0x01:
                response.put("STATUS", "LEARN_MODE_FAILED_TIMEOUT");
                break;
            case 0x07:
                response.put("STATUS", "LEARN_MODE_FAILED");
                break;
            case 0x09:
                response.put("STATUS", "LEARN_MODE_SECURITY_FAILED");
                break;
            default:
                logger.debug("");
                break;
        }

        // Process 'New Node ID'
        response.put("NEW_NODE_ID", new Integer(payload[5]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the NETWORK_UPDATE_REQUEST command.<br>
     *
     * Network Update Request<br>
     *
     *
     * @param seqNo {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNetworkUpdateRequest(Integer seqNo) {
        logger.debug("Creating command message NETWORK_UPDATE_REQUEST version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NETWORK_UPDATE_REQUEST);

        // Process 'Seq. No'
        outputData.write(seqNo);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NETWORK_UPDATE_REQUEST command<br>
     *
     * Network Update Request<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SEQ_NO {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleNetworkUpdateRequest(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Seq. No'
        response.put("SEQ_NO", new Integer(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the NETWORK_UPDATE_REQUEST_STATUS command.<br>
     *
     * Network Update Request Status<br>
     *
     *
     * @param seqNo {@link Integer}
     * @param status {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNetworkUpdateRequestStatus(Integer seqNo, Integer status) {
        logger.debug("Creating command message NETWORK_UPDATE_REQUEST_STATUS version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NETWORK_UPDATE_REQUEST_STATUS);

        // Process 'Seq. No'
        outputData.write(seqNo);

        // Process 'Status'
        outputData.write(status);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NETWORK_UPDATE_REQUEST_STATUS command<br>
     *
     * Network Update Request Status<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SEQ_NO {@link Integer}
     * <li>STATUS {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleNetworkUpdateRequestStatus(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Seq. No'
        response.put("SEQ_NO", new Integer(payload[2]));

        // Process 'Status'
        switch ((int) payload[3]) {
            case 0x00:
                response.put("STATUS", "SUC_UPDATE_DONE");
                break;
            case 0x01:
                response.put("STATUS", "SUC_UPDATE_ABORT");
                break;
            case 0x02:
                response.put("STATUS", "SUC_UPDATE_WAIT");
                break;
            case 0x03:
                response.put("STATUS", "SUC_UPDATE_DISABLED");
                break;
            case 0x04:
                response.put("STATUS", "SUC_UPDATE_OVERFLOW");
                break;
            default:
                logger.debug("");
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the NODE_INFORMATION_SEND command.<br>
     *
     * Node Information Send<br>
     *
     *
     * @param seqNo {@link Integer}
     * @param destinationNodeId {@link Integer}
     * @param txOptions {@link List<String>}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getNodeInformationSend(Integer seqNo, Integer destinationNodeId, List<String> txOptions) {
        logger.debug("Creating command message NODE_INFORMATION_SEND version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(NODE_INFORMATION_SEND);

        // Process 'Seq. No'
        outputData.write(seqNo);

        // Process 'Reserved'
        // Process 'Destination Node ID'
        // Check the node number boundary
        if (destinationNodeId < 1 || destinationNodeId > 232) {
            logger.debug("Node number is out of bounds {}", destinationNodeId);
            return null;
        }
        outputData.write(destinationNodeId);

        // Process 'tx Options'
        int valTxOptions = 0;
        valTxOptions |= (txOptions.contains("ACK") ? 0x02 : 0);
        valTxOptions |= (txOptions.contains("LOW_POWER") ? 0x04 : 0);
        valTxOptions |= (txOptions.contains("AUTO_ROUTE") ? 0x10 : 0);
        outputData.write(valTxOptions);
        valTxOptions = 0;
        valTxOptions |= (txOptions.contains("NO_ROUTE") ? 0x01 : 0);
        outputData.write(valTxOptions);
        valTxOptions = 0;
        valTxOptions |= (txOptions.contains("EXPLORE") ? 0x01 : 0);
        outputData.write(valTxOptions);
        valTxOptions = 0;
        valTxOptions |= (txOptions.contains("NO_RETRANSMISSION") ? 0x01 : 0);
        outputData.write(valTxOptions);
        valTxOptions = 0;
        valTxOptions |= (txOptions.contains("HIGH_POWER") ? 0x01 : 0);
        outputData.write(valTxOptions);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the NODE_INFORMATION_SEND command<br>
     *
     * Node Information Send<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SEQ_NO {@link Integer}
     * <li>DESTINATION_NODE_ID {@link Integer}
     * <li>TX_OPTIONS {@link List}<{@link String}>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleNodeInformationSend(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Seq. No'
        response.put("SEQ_NO", new Integer(payload[2]));

        // Process 'Destination Node ID'
        response.put("DESTINATION_NODE_ID", new Integer(payload[4]));

        // Process 'tx Options'
        List<String> responseTxOptions = new ArrayList<String>();
        int lenTxOptions = 1;
        for (int cntTxOptions = 0; cntTxOptions < lenTxOptions; cntTxOptions++) {
            if ((payload[5 + (cntTxOptions / 8)] & cntTxOptions % 8) == 0) {
                continue;
            }
            switch (cntTxOptions) {
                case 0x01:
                    responseTxOptions.add("ACK");
                    break;
                case 0x02:
                    responseTxOptions.add("LOW_POWER");
                    break;
                case 0x04:
                    responseTxOptions.add("AUTO_ROUTE");
                    break;
                case 0x10:
                    responseTxOptions.add("NO_ROUTE");
                    break;
                case 0x20:
                    responseTxOptions.add("EXPLORE");
                    break;
                case 0x40:
                    responseTxOptions.add("NO_RETRANSMISSION");
                    break;
                case 0x80:
                    responseTxOptions.add("HIGH_POWER");
                    break;
                default:
                    responseTxOptions.add("BITMASK_" + cntTxOptions);
                    break;
            }
        }
        response.put("TX_OPTIONS", responseTxOptions);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the DEFAULT_SET command.<br>
     *
     * Default Set<br>
     *
     *
     * @param seqNo {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getDefaultSet(Integer seqNo) {
        logger.debug("Creating command message DEFAULT_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(DEFAULT_SET);

        // Process 'Seq. No'
        outputData.write(seqNo);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the DEFAULT_SET command<br>
     *
     * Default Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SEQ_NO {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleDefaultSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Seq. No'
        response.put("SEQ_NO", new Integer(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the DEFAULT_SET_COMPLETE command.<br>
     *
     * Default Set Complete<br>
     *
     *
     * @param seqNo {@link Integer}
     * @param status {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getDefaultSetComplete(Integer seqNo, Integer status) {
        logger.debug("Creating command message DEFAULT_SET_COMPLETE version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(DEFAULT_SET_COMPLETE);

        // Process 'Seq. No'
        outputData.write(seqNo);

        // Process 'Status'
        outputData.write(status);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the DEFAULT_SET_COMPLETE command<br>
     *
     * Default Set Complete<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>SEQ_NO {@link Integer}
     * <li>STATUS {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleDefaultSetComplete(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Seq. No'
        response.put("SEQ_NO", new Integer(payload[2]));

        // Process 'Status'
        switch ((int) payload[3]) {
            case 0x06:
                response.put("STATUS", "DEFAULT_SET_DONE");
                break;
            case 0x07:
                response.put("STATUS", "DEFAULT_SET_BUSY");
                break;
            default:
                logger.debug("");
                break;
        }

        // Return the map of processed response data;
        return response;
    }

}
