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
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_SWITCH_MULTILEVEL</b> version <b>2</b>.<br>
 *
 * Command Class Switch Multilevel<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassSwitchMultilevelV2 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassSwitchMultilevelV2.class);

    /**
     * Integer command class key for COMMAND_CLASS_SWITCH_MULTILEVEL
     */
    public final static int COMMAND_CLASS_KEY = 0x26;

    /**
     * Switch Multilevel Set Command Constant
     */
    public final static int SWITCH_MULTILEVEL_SET = 0x01;
    /**
     * Switch Multilevel Get Command Constant
     */
    public final static int SWITCH_MULTILEVEL_GET = 0x02;
    /**
     * Switch Multilevel Report Command Constant
     */
    public final static int SWITCH_MULTILEVEL_REPORT = 0x03;
    /**
     * Switch Multilevel Start Level Change Command Constant
     */
    public final static int SWITCH_MULTILEVEL_START_LEVEL_CHANGE = 0x04;
    /**
     * Switch Multilevel Stop Level Change Command Constant
     */
    public final static int SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE = 0x05;

    /**
     * Creates a new message with the SWITCH_MULTILEVEL_SET command.<br>
     *
     * Switch Multilevel Set<br>
     *
     *
     * @param value {@link Integer}
     * @param dimmingDuration {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchMultilevelSet(Integer value, Integer dimmingDuration) {
        logger.debug("Creating command message SWITCH_MULTILEVEL_SET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_MULTILEVEL_SET);

        // Process 'Value'
        outputData.write(value);

        // Process 'Dimming Duration'
        outputData.write(dimmingDuration);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_MULTILEVEL_SET command<br>
     *
     * Switch Multilevel Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>VALUE {@link Integer}
     * <li>DIMMING_DURATION {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchMultilevelSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Value'
        switch ((int) payload[2]) {
            case 0x00:
                response.put("VALUE", "OFF_DISABLE");
                break;
            case 0xFF:
                response.put("VALUE", "ON_ENABLE");
                break;
            default:
                logger.debug("");
                break;
        }

        // Process 'Dimming Duration'
        switch ((int) payload[3]) {
            case 0x00:
                response.put("DIMMING_DURATION", "INSTANTLY");
                break;
            case 0xFF:
                response.put("DIMMING_DURATION", "FACTORY_DEFAULT");
                break;
            default:
                logger.debug("");
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_MULTILEVEL_GET command.<br>
     *
     * Switch Multilevel Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchMultilevelGet() {
        logger.debug("Creating command message SWITCH_MULTILEVEL_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_MULTILEVEL_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_MULTILEVEL_GET command<br>
     *
     * Switch Multilevel Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchMultilevelGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_MULTILEVEL_REPORT command.<br>
     *
     * Switch Multilevel Report<br>
     *
     *
     * @param value {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchMultilevelReport(Integer value) {
        logger.debug("Creating command message SWITCH_MULTILEVEL_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_MULTILEVEL_REPORT);

        // Process 'Value'
        outputData.write(value);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_MULTILEVEL_REPORT command<br>
     *
     * Switch Multilevel Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>VALUE {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchMultilevelReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Value'
        switch ((int) payload[2]) {
            case 0x00:
                response.put("VALUE", "OFF_DISABLE");
                break;
            case 0xFF:
                response.put("VALUE", "ON_ENABLE");
                break;
            default:
                logger.debug("");
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_MULTILEVEL_START_LEVEL_CHANGE command.<br>
     *
     * Switch Multilevel Start Level Change<br>
     *
     *
     * @param ignoreStartLevel {@link Boolean}
     * @param upDown {@link Boolean}
     * @param startLevel {@link Integer}
     * @param dimmingDuration {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchMultilevelStartLevelChange(Boolean ignoreStartLevel, Boolean upDown,
            Integer startLevel, Integer dimmingDuration) {
        logger.debug("Creating command message SWITCH_MULTILEVEL_START_LEVEL_CHANGE version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_MULTILEVEL_START_LEVEL_CHANGE);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= ignoreStartLevel ? 0x20 : 0;
        valProperties1 |= upDown ? 0x40 : 0;
        outputData.write(valProperties1);

        // Process 'Start Level'
        outputData.write(startLevel);

        // Process 'Dimming Duration'
        outputData.write(dimmingDuration);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_MULTILEVEL_START_LEVEL_CHANGE command<br>
     *
     * Switch Multilevel Start Level Change<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>IGNORE_START_LEVEL {@link Boolean}
     * <li>UP_DOWN {@link Boolean}
     * <li>START_LEVEL {@link Integer}
     * <li>DIMMING_DURATION {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchMultilevelStartLevelChange(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Properties1'
        response.put("IGNORE_START_LEVEL", Boolean.valueOf((payload[2] & 0x20) != 0));
        response.put("UP_DOWN", Boolean.valueOf((payload[2] & 0x40) != 0));

        // Process 'Start Level'
        response.put("START_LEVEL", Integer.valueOf(payload[3]));

        // Process 'Dimming Duration'
        response.put("DIMMING_DURATION", Integer.valueOf(payload[4]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE command.<br>
     *
     * Switch Multilevel Stop Level Change<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getSwitchMultilevelStopLevelChange() {
        logger.debug("Creating command message SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE command<br>
     *
     * Switch Multilevel Stop Level Change<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleSwitchMultilevelStopLevelChange(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

}
