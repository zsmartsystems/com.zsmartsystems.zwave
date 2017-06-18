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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_ZENSOR_NET</b> version <b>1</b>.
 * <p>
 * Command Class Zensor Net
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x02.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassZensorNetV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassZensorNetV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_ZENSOR_NET
     */
    public final static int COMMAND_CLASS_KEY = 0x02;

    /**
     * Bind Request Command Constant
     */
    public final static int BIND_REQUEST = 0x01;
    /**
     * Bind Accept Command Constant
     */
    public final static int BIND_ACCEPT = 0x02;
    /**
     * Bind Complete Command Constant
     */
    public final static int BIND_COMPLETE = 0x03;


    /**
     * Creates a new message with the BIND_REQUEST command.
     * <p>
     * Bind Request
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBindRequest() {
        logger.debug("Creating command message BIND_REQUEST version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BIND_REQUEST);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BIND_REQUEST command.
     * <p>
     * Bind Request
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBindRequest(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the BIND_ACCEPT command.
     * <p>
     * Bind Accept
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBindAccept() {
        logger.debug("Creating command message BIND_ACCEPT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BIND_ACCEPT);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BIND_ACCEPT command.
     * <p>
     * Bind Accept
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBindAccept(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the BIND_COMPLETE command.
     * <p>
     * Bind Complete
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getBindComplete() {
        logger.debug("Creating command message BIND_COMPLETE version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(BIND_COMPLETE);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the BIND_COMPLETE command.
     * <p>
     * Bind Complete
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleBindComplete(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }
}
