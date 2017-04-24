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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_MULTI_INSTANCE</b> version <b>1</b>.
 * <p>
 * Command Class Multi Instance
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x60.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassMultiInstanceV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassMultiInstanceV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_MULTI_INSTANCE
     */
    public final static int COMMAND_CLASS_KEY = 0x60;

    /**
     * Multi Instance Get Command Constant
     */
    public final static int MULTI_INSTANCE_GET = 0x04;
    /**
     * Multi Instance Report Command Constant
     */
    public final static int MULTI_INSTANCE_REPORT = 0x05;
    /**
     * Multi Instance Cmd Encap Command Constant
     */
    public final static int MULTI_INSTANCE_CMD_ENCAP = 0x06;


    /**
     * Creates a new message with the MULTI_INSTANCE_GET command.
     * <p>
     * Multi Instance Get
     *
     * @param commandClass {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getMultiInstanceGet(Integer commandClass) {
        logger.debug("Creating command message MULTI_INSTANCE_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(MULTI_INSTANCE_GET);

        // Process 'Command Class'
        outputData.write(commandClass);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the MULTI_INSTANCE_GET command.
     * <p>
     * Multi Instance Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>COMMAND_CLASS {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleMultiInstanceGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Command Class'
        response.put("COMMAND_CLASS", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the MULTI_INSTANCE_REPORT command.
     * <p>
     * Multi Instance Report
     *
     * @param commandClass {@link Integer}
     * @param instances {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getMultiInstanceReport(Integer commandClass, Integer instances) {
        logger.debug("Creating command message MULTI_INSTANCE_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(MULTI_INSTANCE_REPORT);

        // Process 'Command Class'
        outputData.write(commandClass);

        // Process 'Instances'
        outputData.write(instances);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the MULTI_INSTANCE_REPORT command.
     * <p>
     * Multi Instance Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>COMMAND_CLASS {@link Integer}
     * <li>INSTANCES {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleMultiInstanceReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Command Class'
        response.put("COMMAND_CLASS", Integer.valueOf(payload[2]));

        // Process 'Instances'
        response.put("INSTANCES", Integer.valueOf(payload[3]));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the MULTI_INSTANCE_CMD_ENCAP command.
     * <p>
     * Multi Instance Cmd Encap
     *
     * @param instance {@link Integer}
     * @param commandClass {@link Integer}
     * @param command {@link Integer}
     * @param parameter {@link int[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getMultiInstanceCmdEncap(Integer instance, Integer commandClass, Integer command,
            int[] parameter) {
        logger.debug("Creating command message MULTI_INSTANCE_CMD_ENCAP version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(MULTI_INSTANCE_CMD_ENCAP);

        // Process 'Instance'
        outputData.write(instance);

        // Process 'Command Class'
        outputData.write(commandClass);

        // Process 'Command'
        outputData.write(command);

        // Process 'Parameter'
        for (int cntParameter = 0; cntParameter < parameter.length; cntParameter++) {
            outputData.write(parameter[cntParameter]);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the MULTI_INSTANCE_CMD_ENCAP command.
     * <p>
     * Multi Instance Cmd Encap
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>INSTANCE {@link Integer}
     * <li>COMMAND_CLASS {@link Integer}
     * <li>COMMAND {@link Integer}
     * <li>PARAMETER {@link int[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleMultiInstanceCmdEncap(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Instance'
        response.put("INSTANCE", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Command Class'
        response.put("COMMAND_CLASS", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Command'
        response.put("COMMAND", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Parameter'
        int lenParameter = payload.length - msgOffset;
        int[] valParameter = new int[lenParameter];
        for (int cntParameter = 0; cntParameter < lenParameter; cntParameter++) {
            valParameter[cntParameter] = payload[cntParameter + msgOffset];
        }
        response.put("PARAMETER", valParameter);

        // Return the map of processed response data;
        return response;
    }

}
