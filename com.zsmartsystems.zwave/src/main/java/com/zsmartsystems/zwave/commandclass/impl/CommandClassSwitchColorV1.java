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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_SWITCH_COLOR</b> version <b>1</b>.<br>
 *
 * Command Class Switch Color<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassSwitchColorV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassSwitchColorV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_SWITCH_COLOR
     */
    public final static int COMMAND_CLASS_KEY = 0x33;

    /**
     * Color Switch Supported Get Command Constant
     */
    public final static int SWITCH_COLOR_SUPPORTED_GET = 0x01;
    /**
     * Color Switch Supported Report Command Constant
     */
    public final static int SWITCH_COLOR_SUPPORTED_REPORT = 0x02;
    /**
     * Color Switch Get Command Constant
     */
    public final static int SWITCH_COLOR_GET = 0x03;
    /**
     * Color Switch Report Command Constant
     */
    public final static int SWITCH_COLOR_REPORT = 0x04;
    /**
     * Color Switch Set Command Constant
     */
    public final static int SWITCH_COLOR_SET = 0x05;
    /**
     * Color Switch Start Level Change Command Constant
     */
    public final static int SWITCH_COLOR_START_LEVEL_CHANGE = 0x06;
    /**
     * Color Switch Stop Level Change Command Constant
     */
    public final static int SWITCH_COLOR_STOP_LEVEL_CHANGE = 0x07;

    /**
     * Creates a new message with the SWITCH_COLOR_SUPPORTED_GET command.<br>
     *
     * Color Switch Supported Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchColorSupportedGet() {
        logger.debug("Creating command message SWITCH_COLOR_SUPPORTED_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_COLOR_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_COLOR_SUPPORTED_GET command<br>
     *
     * Color Switch Supported Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchColorSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_COLOR_SUPPORTED_REPORT command.<br>
     *
     * Color Switch Supported Report<br>
     *
     *
     * @param colorComponentMask {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchColorSupportedReport(Integer colorComponentMask) {
        logger.debug("Creating command message SWITCH_COLOR_SUPPORTED_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_COLOR_SUPPORTED_REPORT);

        // Process 'Color Component mask'
        outputData.write((colorComponentMask >> 8) & 0xff);
        outputData.write(colorComponentMask & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_COLOR_SUPPORTED_REPORT command<br>
     *
     * Color Switch Supported Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>COLOR_COMPONENT_MASK {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchColorSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Color Component mask'
        response.put("COLOR_COMPONENT_MASK", Integer.valueOf(payload[2] << 8 + payload[3]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_COLOR_GET command.<br>
     *
     * Color Switch Get<br>
     *
     *
     * @param colorComponentId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchColorGet(Integer colorComponentId) {
        logger.debug("Creating command message SWITCH_COLOR_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_COLOR_GET);

        // Process 'Color Component ID'
        outputData.write(colorComponentId);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_COLOR_GET command<br>
     *
     * Color Switch Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>COLOR_COMPONENT_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchColorGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Color Component ID'
        response.put("COLOR_COMPONENT_ID", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_COLOR_REPORT command.<br>
     *
     * Color Switch Report<br>
     *
     *
     * @param colorComponentId {@link Integer}
     * @param value {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchColorReport(Integer colorComponentId, Integer value) {
        logger.debug("Creating command message SWITCH_COLOR_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_COLOR_REPORT);

        // Process 'Color Component ID'
        outputData.write(colorComponentId);

        // Process 'Value'
        outputData.write(value);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_COLOR_REPORT command<br>
     *
     * Color Switch Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>COLOR_COMPONENT_ID {@link Integer}
     * <li>VALUE {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchColorReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Color Component ID'
        response.put("COLOR_COMPONENT_ID", Integer.valueOf(payload[2]));

        // Process 'Value'
        response.put("VALUE", Integer.valueOf(payload[3]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_COLOR_SET command.<br>
     *
     * Color Switch Set<br>
     *
     *
     * @param colorComponentCount {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchColorSet(Integer colorComponentCount) {
        logger.debug("Creating command message SWITCH_COLOR_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_COLOR_SET);

        // Process 'Properties1'
        outputData.write(colorComponentCount & 0x1F);

        // Process 'vg1'

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_COLOR_SET command<br>
     *
     * Color Switch Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>COLOR_COMPONENT_COUNT {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchColorSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Properties1'
        response.put("COLOR_COMPONENT_COUNT", Integer.valueOf(payload[2] & 0x1F));

        // Process 'vg1'

        // Create a list to hold the group vg1
        List<Map<String, Object>> variantList = new ArrayList<Map<String, Object>>();

        int offset = 3;
        while (offset < payload.length) {
            // Create a map to hold the members of this variant
            Map<String, Object> variant = new HashMap<String, Object>();

            // Process 'Color Component ID'
            variant.put("COLOR_COMPONENT_ID", Integer.valueOf(payload[3]));

            // Process 'Value'
            variant.put("VALUE", Integer.valueOf(payload[4]));

            // Add to the list
            variantList.add(variant);

            // Add the length of this variant
            offset += (payload[offset + 0] & 0x1F) >> 0;
        }

        // Add the variant list to the response
        response.put("VG1", variantList);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_COLOR_START_LEVEL_CHANGE command.<br>
     *
     * Color Switch Start Level Change<br>
     *
     *
     * @param res1 {@link Integer}
     * @param ignoreStartState {@link Boolean}
     * @param upDown {@link Boolean}
     * @param res2 {@link Boolean}
     * @param colorComponentId {@link Integer}
     * @param startLevel {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchColorStartLevelChange(Integer res1, Boolean ignoreStartState, Boolean upDown,
            Boolean res2, Integer colorComponentId, Integer startLevel) {
        logger.debug("Creating command message SWITCH_COLOR_START_LEVEL_CHANGE version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_COLOR_START_LEVEL_CHANGE);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= res1 & 0x1F;
        valProperties1 |= ignoreStartState ? 0x20 : 0;
        valProperties1 |= upDown ? 0x40 : 0;
        valProperties1 |= res2 ? 0x80 : 0;
        outputData.write(valProperties1);

        // Process 'Color Component ID'
        outputData.write(colorComponentId);

        // Process 'Start Level'
        outputData.write(startLevel);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_COLOR_START_LEVEL_CHANGE command<br>
     *
     * Color Switch Start Level Change<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>RES1 {@link Integer}
     * <li>IGNORE_START_STATE {@link Boolean}
     * <li>UP_DOWN {@link Boolean}
     * <li>RES2 {@link Boolean}
     * <li>COLOR_COMPONENT_ID {@link Integer}
     * <li>START_LEVEL {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchColorStartLevelChange(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Properties1'
        response.put("RES1", Integer.valueOf(payload[2] & 0x1F));
        response.put("IGNORE_START_STATE", Boolean.valueOf((payload[2] & 0x20) != 0));
        response.put("UP_DOWN", Boolean.valueOf((payload[2] & 0x40) != 0));
        response.put("RES2", Boolean.valueOf((payload[2] & 0x80) != 0));

        // Process 'Color Component ID'
        response.put("COLOR_COMPONENT_ID", Integer.valueOf(payload[3]));

        // Process 'Start Level'
        response.put("START_LEVEL", Integer.valueOf(payload[4]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_COLOR_STOP_LEVEL_CHANGE command.<br>
     *
     * Color Switch Stop Level Change<br>
     *
     *
     * @param colorComponentId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchColorStopLevelChange(Integer colorComponentId) {
        logger.debug("Creating command message SWITCH_COLOR_STOP_LEVEL_CHANGE version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_COLOR_STOP_LEVEL_CHANGE);

        // Process 'Color Component ID'
        outputData.write(colorComponentId);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_COLOR_STOP_LEVEL_CHANGE command<br>
     *
     * Color Switch Stop Level Change<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>COLOR_COMPONENT_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchColorStopLevelChange(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Color Component ID'
        response.put("COLOR_COMPONENT_ID", Integer.valueOf(payload[2]));

        // Return the map of processed response data;
        return response;
    }

}
