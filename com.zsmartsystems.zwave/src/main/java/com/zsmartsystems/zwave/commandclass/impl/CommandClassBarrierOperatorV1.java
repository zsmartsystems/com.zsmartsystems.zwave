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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_BARRIER_OPERATOR</b> version <b>1</b>.
 * <p>
 * Command Class Barrier Operator
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x66.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassBarrierOperatorV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassBarrierOperatorV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_BARRIER_OPERATOR
     */
    public final static int COMMAND_CLASS_KEY = 0x66;

    /**
     * Barrier Operator Set Command Constant
     */
    public final static int BARRIER_OPERATOR_SET = 0x01;
    /**
     * Barrier Operator Get Command Constant
     */
    public final static int BARRIER_OPERATOR_GET = 0x02;
    /**
     * Barrier Operator Report Command Constant
     */
    public final static int BARRIER_OPERATOR_REPORT = 0x03;
    /**
     * Barrier Operator Signal Supported Get Command Constant
     */
    public final static int BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET = 0x04;
    /**
     * Barrier Operator Signal Supported Report Command Constant
     */
    public final static int BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT = 0x05;
    /**
     * Barrier Operator Signal Set Command Constant
     */
    public final static int BARRIER_OPERATOR_SIGNAL_SET = 0x06;
    /**
     * Barrier Operator Signal Get Command Constant
     */
    public final static int BARRIER_OPERATOR_SIGNAL_GET = 0x07;
    /**
     * Barrier Operator Signal Report Command Constant
     */
    public final static int BARRIER_OPERATOR_SIGNAL_REPORT = 0x08;


    /**
     * Map holding constants for BarrierOperatorSignalSetSubsystemState
     */
    private static Map<Integer, String> constantBarrierOperatorSignalSetSubsystemState = new HashMap<Integer, String>();

    /**
     * Map holding constants for BarrierOperatorSetTargetValue
     */
    private static Map<Integer, String> constantBarrierOperatorSetTargetValue = new HashMap<Integer, String>();

    /**
     * Map holding constants for BarrierOperatorSignalReportSubsystemType
     */
    private static Map<Integer, String> constantBarrierOperatorSignalReportSubsystemType = new HashMap<Integer, String>();

    /**
     * Map holding constants for BarrierOperatorSignalGetSubsystemType
     */
    private static Map<Integer, String> constantBarrierOperatorSignalGetSubsystemType = new HashMap<Integer, String>();

    /**
     * Map holding constants for BarrierOperatorSignalReportSubsystemState
     */
    private static Map<Integer, String> constantBarrierOperatorSignalReportSubsystemState = new HashMap<Integer, String>();

    /**
     * Map holding constants for BarrierOperatorReportState
     */
    private static Map<Integer, String> constantBarrierOperatorReportState = new HashMap<Integer, String>();

    /**
     * Map holding constants for BarrierOperatorSignalSupportedReportBitMask
     */
    private static Map<Integer, String> constantBarrierOperatorSignalSupportedReportBitMask = new HashMap<Integer, String>();

    /**
     * Map holding constants for BarrierOperatorSignalSetSubsystemType
     */
    private static Map<Integer, String> constantBarrierOperatorSignalSetSubsystemType = new HashMap<Integer, String>();
    static {

        // Constants for BarrierOperatorSignalSetSubsystemState
        constantBarrierOperatorSignalSetSubsystemState.put(0x00, "OFF");
        constantBarrierOperatorSignalSetSubsystemState.put(0xFF, "ON");

        // Constants for BarrierOperatorSetTargetValue
        constantBarrierOperatorSetTargetValue.put(0x00, "CLOSE");
        constantBarrierOperatorSetTargetValue.put(0xFF, "OPEN");

        // Constants for BarrierOperatorSignalReportSubsystemType
        constantBarrierOperatorSignalReportSubsystemType.put(0x00, "NOT_SUPPORTED");
        constantBarrierOperatorSignalReportSubsystemType.put(0x01, "AUDIBLE_NOTIFICATION");
        constantBarrierOperatorSignalReportSubsystemType.put(0x02, "VISUAL_NOTIFICATION");

        // Constants for BarrierOperatorSignalGetSubsystemType
        constantBarrierOperatorSignalGetSubsystemType.put(0x00, "NOT_SUPPORTED");
        constantBarrierOperatorSignalGetSubsystemType.put(0x01, "AUDIBLE_NOTIFICATION");
        constantBarrierOperatorSignalGetSubsystemType.put(0x02, "VISUAL_NOTIFICATION");

        // Constants for BarrierOperatorSignalReportSubsystemState
        constantBarrierOperatorSignalReportSubsystemState.put(0x00, "OFF");
        constantBarrierOperatorSignalReportSubsystemState.put(0xFF, "ON");

        // Constants for BarrierOperatorReportState
        constantBarrierOperatorReportState.put(0xFE, "OPENING");
        constantBarrierOperatorReportState.put(0x00, "CLOSED");
        constantBarrierOperatorReportState.put(0xFF, "OPEN");
        constantBarrierOperatorReportState.put(0xFC, "CLOSING");
        constantBarrierOperatorReportState.put(0xFD, "STOPPED");

        // Constants for BarrierOperatorSignalSupportedReportBitMask
        constantBarrierOperatorSignalSupportedReportBitMask.put(0x00, "NOT_SUPPORTED");
        constantBarrierOperatorSignalSupportedReportBitMask.put(0x01, "AUDIBLE_NOTIFICATION");
        constantBarrierOperatorSignalSupportedReportBitMask.put(0x02, "VISUAL_NOTIFICATION");

        // Constants for BarrierOperatorSignalSetSubsystemType
        constantBarrierOperatorSignalSetSubsystemType.put(0x00, "NOT_SUPPORTED");
        constantBarrierOperatorSignalSetSubsystemType.put(0x01, "AUDIBLE_NOTIFICATION");
        constantBarrierOperatorSignalSetSubsystemType.put(0x02, "VISUAL_NOTIFICATION");
    }

    /**
     * Creates a new message with the BARRIER_OPERATOR_SET command.
     * <p>
     * Barrier Operator Set
     *
     * @param targetValue {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>CLOSE
     *            <li>OPEN
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBarrierOperatorSet(String targetValue) {
        logger.debug("Creating command message BARRIER_OPERATOR_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BARRIER_OPERATOR_SET);

        // Process 'Target Value'
        boolean foundTargetValue = false;
        for (Integer entry : constantBarrierOperatorSetTargetValue.keySet()) {
            if (constantBarrierOperatorSetTargetValue.get(entry).equals(targetValue)) {
                outputData.write(entry);
                foundTargetValue = true;
                break;
            }
        }
        if (!foundTargetValue) {
            throw new IllegalArgumentException("Unknown constant value '" + targetValue + "' for targetValue");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BARRIER_OPERATOR_SET command.
     * <p>
     * Barrier Operator Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>TARGET_VALUE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBarrierOperatorSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Target Value'
        response.put("TARGET_VALUE", constantBarrierOperatorSetTargetValue.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the BARRIER_OPERATOR_GET command.
     * <p>
     * Barrier Operator Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBarrierOperatorGet() {
        logger.debug("Creating command message BARRIER_OPERATOR_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BARRIER_OPERATOR_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BARRIER_OPERATOR_GET command.
     * <p>
     * Barrier Operator Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBarrierOperatorGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the BARRIER_OPERATOR_REPORT command.
     * <p>
     * Barrier Operator Report
     *
     * @param state {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>OPENING
     *            <li>CLOSED
     *            <li>OPEN
     *            <li>CLOSING
     *            <li>STOPPED
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBarrierOperatorReport(String state) {
        logger.debug("Creating command message BARRIER_OPERATOR_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BARRIER_OPERATOR_REPORT);

        // Process 'State'
        boolean foundState = false;
        for (Integer entry : constantBarrierOperatorReportState.keySet()) {
            if (constantBarrierOperatorReportState.get(entry).equals(state)) {
                outputData.write(entry);
                foundState = true;
                break;
            }
        }
        if (!foundState) {
            throw new IllegalArgumentException("Unknown constant value '" + state + "' for state");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BARRIER_OPERATOR_REPORT command.
     * <p>
     * Barrier Operator Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>STATE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBarrierOperatorReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'State'
        response.put("STATE", constantBarrierOperatorReportState.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET command.
     * <p>
     * Barrier Operator Signal Supported Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBarrierOperatorSignalSupportedGet() {
        logger.debug("Creating command message BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET command.
     * <p>
     * Barrier Operator Signal Supported Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBarrierOperatorSignalSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT command.
     * <p>
     * Barrier Operator Signal Supported Report
     *
     * @param bitMask {@link List<String>}
     *            Can be one of the following -:
     *            <ul>
     *            <li>NOT_SUPPORTED
     *            <li>AUDIBLE_NOTIFICATION
     *            <li>VISUAL_NOTIFICATION
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBarrierOperatorSignalSupportedReport(List<String> bitMask) {
        logger.debug("Creating command message BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT);

        // Process 'Bit Mask'
        int valBitMask = 0;
        for (String value : bitMask) {
            boolean foundBitMask = false;
            for (Integer entry : constantBarrierOperatorSignalSupportedReportBitMask.keySet()) {
                if (constantBarrierOperatorSignalSupportedReportBitMask.get(entry).equals(value)) {
                    foundBitMask = true;
                    valBitMask += entry;
                    break;
                }
            }
            if (!foundBitMask) {
                throw new IllegalArgumentException("Unknown constant value '" + bitMask + "' for bitMask");
            }
        }
        outputData.write(valBitMask);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT command.
     * <p>
     * Barrier Operator Signal Supported Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>BIT_MASK {@link List}<{@link String}>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBarrierOperatorSignalSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Bit Mask'
        List<String> responseBitMask = new ArrayList<String>();
        for (int cntBitMask = 0; cntBitMask < (payload.length - 2) * 8; cntBitMask++) {
            if ((payload[2 + (cntBitMask / 8)] & (1 << cntBitMask % 8)) == 0) {
                continue;
            }
            responseBitMask.add(constantBarrierOperatorSignalSupportedReportBitMask.get(cntBitMask));
        }
        response.put("BIT_MASK", responseBitMask);

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the BARRIER_OPERATOR_SIGNAL_SET command.
     * <p>
     * Barrier Operator Signal Set
     *
     * @param subsystemType {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>NOT_SUPPORTED
     *            <li>AUDIBLE_NOTIFICATION
     *            <li>VISUAL_NOTIFICATION
     *            </ul>
     * @param subsystemState {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>OFF
     *            <li>ON
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBarrierOperatorSignalSet(String subsystemType, String subsystemState) {
        logger.debug("Creating command message BARRIER_OPERATOR_SIGNAL_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BARRIER_OPERATOR_SIGNAL_SET);

        // Process 'Subsystem Type'
        boolean foundSubsystemType = false;
        for (Integer entry : constantBarrierOperatorSignalSetSubsystemType.keySet()) {
            if (constantBarrierOperatorSignalSetSubsystemType.get(entry).equals(subsystemType)) {
                outputData.write(entry);
                foundSubsystemType = true;
                break;
            }
        }
        if (!foundSubsystemType) {
            throw new IllegalArgumentException("Unknown constant value '" + subsystemType + "' for subsystemType");
        }

        // Process 'Subsystem State'
        boolean foundSubsystemState = false;
        for (Integer entry : constantBarrierOperatorSignalSetSubsystemState.keySet()) {
            if (constantBarrierOperatorSignalSetSubsystemState.get(entry).equals(subsystemState)) {
                outputData.write(entry);
                foundSubsystemState = true;
                break;
            }
        }
        if (!foundSubsystemState) {
            throw new IllegalArgumentException("Unknown constant value '" + subsystemState + "' for subsystemState");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BARRIER_OPERATOR_SIGNAL_SET command.
     * <p>
     * Barrier Operator Signal Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>SUBSYSTEM_TYPE {@link String}
     * <li>SUBSYSTEM_STATE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBarrierOperatorSignalSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Subsystem Type'
        response.put("SUBSYSTEM_TYPE", constantBarrierOperatorSignalSetSubsystemType.get(payload[2] & 0xff));

        // Process 'Subsystem State'
        response.put("SUBSYSTEM_STATE", constantBarrierOperatorSignalSetSubsystemState.get(payload[3] & 0xff));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the BARRIER_OPERATOR_SIGNAL_GET command.
     * <p>
     * Barrier Operator Signal Get
     *
     * @param subsystemType {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>NOT_SUPPORTED
     *            <li>AUDIBLE_NOTIFICATION
     *            <li>VISUAL_NOTIFICATION
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBarrierOperatorSignalGet(String subsystemType) {
        logger.debug("Creating command message BARRIER_OPERATOR_SIGNAL_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BARRIER_OPERATOR_SIGNAL_GET);

        // Process 'Subsystem Type'
        boolean foundSubsystemType = false;
        for (Integer entry : constantBarrierOperatorSignalGetSubsystemType.keySet()) {
            if (constantBarrierOperatorSignalGetSubsystemType.get(entry).equals(subsystemType)) {
                outputData.write(entry);
                foundSubsystemType = true;
                break;
            }
        }
        if (!foundSubsystemType) {
            throw new IllegalArgumentException("Unknown constant value '" + subsystemType + "' for subsystemType");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BARRIER_OPERATOR_SIGNAL_GET command.
     * <p>
     * Barrier Operator Signal Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>SUBSYSTEM_TYPE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBarrierOperatorSignalGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Subsystem Type'
        response.put("SUBSYSTEM_TYPE", constantBarrierOperatorSignalGetSubsystemType.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the BARRIER_OPERATOR_SIGNAL_REPORT command.
     * <p>
     * Barrier Operator Signal Report
     *
     * @param subsystemType {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>NOT_SUPPORTED
     *            <li>AUDIBLE_NOTIFICATION
     *            <li>VISUAL_NOTIFICATION
     *            </ul>
     * @param subsystemState {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>OFF
     *            <li>ON
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBarrierOperatorSignalReport(String subsystemType, String subsystemState) {
        logger.debug("Creating command message BARRIER_OPERATOR_SIGNAL_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BARRIER_OPERATOR_SIGNAL_REPORT);

        // Process 'Subsystem Type'
        boolean foundSubsystemType = false;
        for (Integer entry : constantBarrierOperatorSignalReportSubsystemType.keySet()) {
            if (constantBarrierOperatorSignalReportSubsystemType.get(entry).equals(subsystemType)) {
                outputData.write(entry);
                foundSubsystemType = true;
                break;
            }
        }
        if (!foundSubsystemType) {
            throw new IllegalArgumentException("Unknown constant value '" + subsystemType + "' for subsystemType");
        }

        // Process 'Subsystem State'
        boolean foundSubsystemState = false;
        for (Integer entry : constantBarrierOperatorSignalReportSubsystemState.keySet()) {
            if (constantBarrierOperatorSignalReportSubsystemState.get(entry).equals(subsystemState)) {
                outputData.write(entry);
                foundSubsystemState = true;
                break;
            }
        }
        if (!foundSubsystemState) {
            throw new IllegalArgumentException("Unknown constant value '" + subsystemState + "' for subsystemState");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BARRIER_OPERATOR_SIGNAL_REPORT command.
     * <p>
     * Barrier Operator Signal Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>SUBSYSTEM_TYPE {@link String}
     * <li>SUBSYSTEM_STATE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBarrierOperatorSignalReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Subsystem Type'
        response.put("SUBSYSTEM_TYPE", constantBarrierOperatorSignalReportSubsystemType.get(payload[2] & 0xff));

        // Process 'Subsystem State'
        response.put("SUBSYSTEM_STATE", constantBarrierOperatorSignalReportSubsystemState.get(payload[3] & 0xff));

        // Return the map of processed response data;
        return response;
    }

}
