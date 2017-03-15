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
import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_FIRMWARE_UPDATE_MD</b> version <b>5</b>.<br>
 *
 * Command Class Firmware Update Md<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassFirmwareUpdateMdV5 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassFirmwareUpdateMdV5.class);

    /**
     * Integer command class key for COMMAND_CLASS_FIRMWARE_UPDATE_MD
     */
    public final static int COMMAND_CLASS_KEY = 0x7A;

    /**
     * Firmware Md Get Command Constant
     */
    public final static int FIRMWARE_MD_GET = 0x01;
    /**
     * Firmware Md Report Command Constant
     */
    public final static int FIRMWARE_MD_REPORT = 0x02;
    /**
     * Firmware Update Md Request Get Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_REQUEST_GET = 0x03;
    /**
     * Firmware Update Md Request Report Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_REQUEST_REPORT = 0x04;
    /**
     * Firmware Update Md Get Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_GET = 0x05;
    /**
     * Firmware Update Md Report Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_REPORT = 0x06;
    /**
     * Firmware Update Md Status Report Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_STATUS_REPORT = 0x07;
    /**
     * Firmware Update Activation Set Command Command Constant
     */
    public final static int FIRMWARE_UPDATE_ACTIVATION_SET = 0x08;
    /**
     * Firmware Update Activation Status Report Command Constant
     */
    public final static int FIRMWARE_UPDATE_ACTIVATION_STATUS_REPORT = 0x09;
    /**
     * Firmware Update MD Prepare Get Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_PREPARE_GET = 0x0A;
    /**
     * Firmware Update MD Prepare Report Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_PREPARE_REPORT = 0x0B;

    /**
     * Creates a new message with the FIRMWARE_MD_GET command.<br>
     *
     * Firmware Md Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareMdGet() {
        logger.debug("Creating command message FIRMWARE_MD_GET version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_MD_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_MD_GET command<br>
     *
     * Firmware Md Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareMdGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the FIRMWARE_MD_REPORT command.<br>
     *
     * Firmware Md Report<br>
     *
     *
     * @param manufacturerId {@link Integer}
     * @param firmware0Id {@link Integer}
     * @param firmware0Checksum {@link Integer}
     * @param firmwareUpgradable {@link Integer}
     * @param numberOfFirmwareTargets {@link Integer}
     * @param maxFragmentSize {@link Integer}
     * @param hardwareVersion {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareMdReport(Integer manufacturerId, Integer firmware0Id, Integer firmware0Checksum,
            Integer firmwareUpgradable, Integer numberOfFirmwareTargets, Integer maxFragmentSize,
            Integer hardwareVersion) {
        logger.debug("Creating command message FIRMWARE_MD_REPORT version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_MD_REPORT);

        // Process 'Manufacturer ID'
        outputData.write((manufacturerId >> 8) & 0xff);
        outputData.write(manufacturerId & 0xff);

        // Process 'Firmware 0 ID'
        outputData.write((firmware0Id >> 8) & 0xff);
        outputData.write(firmware0Id & 0xff);

        // Process 'Firmware 0 Checksum'
        outputData.write((firmware0Checksum >> 8) & 0xff);
        outputData.write(firmware0Checksum & 0xff);

        // Process 'Firmware Upgradable'
        outputData.write(firmwareUpgradable);

        // Process 'Number of Firmware Targets'
        outputData.write(numberOfFirmwareTargets);

        // Process 'Max Fragment Size '
        outputData.write((maxFragmentSize >> 8) & 0xff);
        outputData.write(maxFragmentSize & 0xff);

        // Process 'vg1'

        // Process 'Hardware Version'
        outputData.write(hardwareVersion);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_MD_REPORT command<br>
     *
     * Firmware Md Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>MANUFACTURER_ID {@link Integer}
     * <li>FIRMWARE_0_ID {@link Integer}
     * <li>FIRMWARE_0_CHECKSUM {@link Integer}
     * <li>FIRMWARE_UPGRADABLE {@link Integer}
     * <li>NUMBER_OF_FIRMWARE_TARGETS {@link Integer}
     * <li>MAX_FRAGMENT_SIZE {@link Integer}
     * <li>HARDWARE_VERSION {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareMdReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Manufacturer ID'
        response.put("MANUFACTURER_ID", Integer.valueOf(payload[2] << 8 + payload[3]));

        // Process 'Firmware 0 ID'
        response.put("FIRMWARE_0_ID", Integer.valueOf(payload[4] << 8 + payload[5]));

        // Process 'Firmware 0 Checksum'
        response.put("FIRMWARE_0_CHECKSUM", Integer.valueOf(payload[6] << 8 + payload[7]));

        // Process 'Firmware Upgradable'
        response.put("FIRMWARE_UPGRADABLE", Integer.valueOf(payload[8]));

        // Process 'Number of Firmware Targets'
        response.put("NUMBER_OF_FIRMWARE_TARGETS", Integer.valueOf(payload[9]));

        // Process 'Max Fragment Size '
        response.put("MAX_FRAGMENT_SIZE", Integer.valueOf(payload[10] << 8 + payload[11]));

        // Process 'vg1'

        // Create a list to hold the group vg1
        List<Map<String, Object>> variantList = new ArrayList<Map<String, Object>>();

        int offset = 12;
        while (offset < payload.length) {
            // Create a map to hold the members of this variant
            Map<String, Object> variant = new HashMap<String, Object>();

            // Process 'Firmware ID'
            variant.put("FIRMWARE_ID", Integer.valueOf(payload[12] << 8 + payload[13]));

            // Add to the list
            variantList.add(variant);

            // Add the length of this variant
            offset += (payload[offset + 4] & 0xFF) >> 0;
        }

        // Add the variant list to the response
        response.put("VG1", variantList);

        // Process 'Hardware Version'
        response.put("HARDWARE_VERSION", Integer.valueOf(payload[14]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_REQUEST_GET command.<br>
     *
     * Firmware Update Md Request Get<br>
     *
     *
     * @param manufacturerId {@link Integer}
     * @param firmwareId {@link Integer}
     * @param checksum {@link Integer}
     * @param firmwareTarget {@link Integer}
     * @param fragmentSize {@link Integer}
     * @param activation {@link Boolean}
     * @param hardwareVersion {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdRequestGet(Integer manufacturerId, Integer firmwareId, Integer checksum,
            Integer firmwareTarget, Integer fragmentSize, Boolean activation, Integer hardwareVersion) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_REQUEST_GET version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_REQUEST_GET);

        // Process 'Manufacturer ID'
        outputData.write((manufacturerId >> 8) & 0xff);
        outputData.write(manufacturerId & 0xff);

        // Process 'Firmware ID'
        outputData.write((firmwareId >> 8) & 0xff);
        outputData.write(firmwareId & 0xff);

        // Process 'Checksum'
        outputData.write((checksum >> 8) & 0xff);
        outputData.write(checksum & 0xff);

        // Process 'Firmware Target'
        outputData.write(firmwareTarget);

        // Process 'Fragment Size'
        outputData.write((fragmentSize >> 8) & 0xff);
        outputData.write(fragmentSize & 0xff);

        // Process 'Properties1'
        outputData.write(activation ? 0x01 : 0);

        // Process 'Hardware Version'
        outputData.write(hardwareVersion);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_REQUEST_GET command<br>
     *
     * Firmware Update Md Request Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>MANUFACTURER_ID {@link Integer}
     * <li>FIRMWARE_ID {@link Integer}
     * <li>CHECKSUM {@link Integer}
     * <li>FIRMWARE_TARGET {@link Integer}
     * <li>FRAGMENT_SIZE {@link Integer}
     * <li>ACTIVATION {@link Boolean}
     * <li>HARDWARE_VERSION {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdRequestGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Manufacturer ID'
        response.put("MANUFACTURER_ID", Integer.valueOf(payload[2] << 8 + payload[3]));

        // Process 'Firmware ID'
        response.put("FIRMWARE_ID", Integer.valueOf(payload[4] << 8 + payload[5]));

        // Process 'Checksum'
        response.put("CHECKSUM", Integer.valueOf(payload[6] << 8 + payload[7]));

        // Process 'Firmware Target'
        response.put("FIRMWARE_TARGET", Integer.valueOf(payload[8]));

        // Process 'Fragment Size'
        response.put("FRAGMENT_SIZE", Integer.valueOf(payload[9] << 8 + payload[10]));

        // Process 'Properties1'
        response.put("ACTIVATION", Boolean.valueOf((payload[11] & 0x01) != 0));

        // Process 'Hardware Version'
        response.put("HARDWARE_VERSION", Integer.valueOf(payload[12]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_REQUEST_REPORT command.<br>
     *
     * Firmware Update Md Request Report<br>
     *
     *
     * @param status {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdRequestReport(String status) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_REQUEST_REPORT version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_REQUEST_REPORT);

        // Process 'Status'
        switch (status) {
            case "INVALID_COMBINATION":
                outputData.write(0x00);
                break;
            case "REQUIRES_AUTHENTICATION":
                outputData.write(0x01);
                break;
            case "INVALID_FRAGMENT_SIZE":
                outputData.write(0x02);
                break;
            case "NOT_UPGRADABLE":
                outputData.write(0x03);
                break;
            case "INVALID_HARDWARE_VERSION":
                outputData.write(0x04);
                break;
            case "VALID_COMBINATION":
                outputData.write(0xFF);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for status: " + status);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_REQUEST_REPORT command<br>
     *
     * Firmware Update Md Request Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>STATUS {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdRequestReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Status'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("STATUS", "INVALID_COMBINATION");
                break;
            case (byte) 0x01:
                response.put("STATUS", "REQUIRES_AUTHENTICATION");
                break;
            case (byte) 0x02:
                response.put("STATUS", "INVALID_FRAGMENT_SIZE");
                break;
            case (byte) 0x03:
                response.put("STATUS", "NOT_UPGRADABLE");
                break;
            case (byte) 0x04:
                response.put("STATUS", "INVALID_HARDWARE_VERSION");
                break;
            case (byte) 0xFF:
                response.put("STATUS", "VALID_COMBINATION");
                break;
            default:
                logger.debug("Unknown value {} for constant 'STATUS'", String.format("%02X", payload[2]));
                response.put("STATUS", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_GET command.<br>
     *
     * Firmware Update Md Get<br>
     *
     *
     * @param numberOfReports {@link Integer}
     * @param reportNumber1 {@link Integer}
     * @param zero {@link Boolean}
     * @param reportNumber2 {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdGet(Integer numberOfReports, Integer reportNumber1, Boolean zero,
            Integer reportNumber2) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_GET version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_GET);

        // Process 'Number of Reports'
        outputData.write(numberOfReports);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= reportNumber1 & 0x7F;
        valProperties1 |= zero ? 0x80 : 0;
        outputData.write(valProperties1);

        // Process 'Report number 2'
        outputData.write(reportNumber2);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_GET command<br>
     *
     * Firmware Update Md Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>NUMBER_OF_REPORTS {@link Integer}
     * <li>REPORT_NUMBER_1 {@link Integer}
     * <li>ZERO {@link Boolean}
     * <li>REPORT_NUMBER_2 {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Number of Reports'
        response.put("NUMBER_OF_REPORTS", Integer.valueOf(payload[2]));

        // Process 'Properties1'
        response.put("REPORT_NUMBER_1", Integer.valueOf(payload[3] & 0x7F));
        response.put("ZERO", Boolean.valueOf((payload[3] & 0x80) != 0));

        // Process 'Report number 2'
        response.put("REPORT_NUMBER_2", Integer.valueOf(payload[4]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_REPORT command.<br>
     *
     * Firmware Update Md Report<br>
     *
     *
     * @param reportNumber1 {@link Integer}
     * @param last {@link Boolean}
     * @param reportNumber2 {@link Integer}
     * @param data {@link byte[]}
     * @param checksum {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdReport(Integer reportNumber1, Boolean last, Integer reportNumber2,
            byte[] data, Integer checksum) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_REPORT version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_REPORT);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= reportNumber1 & 0x7F;
        valProperties1 |= last ? 0x80 : 0;
        outputData.write(valProperties1);

        // Process 'Report number 2'
        outputData.write(reportNumber2);

        // Process 'Data'
        try {
            outputData.write(data);
        } catch (IOException e) {
        }

        // Process 'Checksum'
        outputData.write((checksum >> 8) & 0xff);
        outputData.write(checksum & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_REPORT command<br>
     *
     * Firmware Update Md Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>REPORT_NUMBER_1 {@link Integer}
     * <li>LAST {@link Boolean}
     * <li>REPORT_NUMBER_2 {@link Integer}
     * <li>DATA {@link byte[]}
     * <li>CHECKSUM {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Properties1'
        response.put("REPORT_NUMBER_1", Integer.valueOf(payload[msgOffset] & 0x7F));
        response.put("LAST", Boolean.valueOf((payload[msgOffset] & 0x80) != 0));
        msgOffset += 1;

        // Process 'Report number 2'
        response.put("REPORT_NUMBER_2", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Data'
        ByteArrayOutputStream valData = new ByteArrayOutputStream();
        while (msgOffset < payload.length - 2) {
            valData.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("DATA", valData);

        // Process 'Checksum'
        response.put("CHECKSUM", Integer.valueOf(payload[msgOffset] << 8 + payload[msgOffset + 12]));
        msgOffset += 2;

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_STATUS_REPORT command.<br>
     *
     * Firmware Update Md Status Report<br>
     *
     *
     * @param status {@link String}
     * @param waittime {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdStatusReport(String status, Integer waittime) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_STATUS_REPORT version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_STATUS_REPORT);

        // Process 'Status'
        switch (status) {
            case "UNABLE_TO_RECEIVE_WITHOUT_CHECKSUM_ERROR":
                outputData.write(0x00);
                break;
            case "UNABLE_TO_RECEIVE":
                outputData.write(0x01);
                break;
            case "DOES_NOT_MATCH_THE_MANUFACTURER_ID":
                outputData.write(0x02);
                break;
            case "DOES_NOT_MATCH_THE_FIRMWARE_ID":
                outputData.write(0x03);
                break;
            case "DOES_NOT_MATCH_THE_FIRMWARE_TARGET":
                outputData.write(0x04);
                break;
            case "INVALID_FILE_HEADER_INFORMATION":
                outputData.write(0x05);
                break;
            case "INVALID_FILE_HEADER_FORMAT":
                outputData.write(0x06);
                break;
            case "INSUFFICIENT_MEMORY":
                outputData.write(0x07);
                break;
            case "DOES_NOT_MATCH_THE_HARDWARE_VERSION":
                outputData.write(0x08);
                break;
            case "SUCCESSFULLY,_WAITING_FOR_ACTIVATION":
                outputData.write(0xFD);
                break;
            case "SUCCESSFULLY_STORED":
                outputData.write(0xFE);
                break;
            case "SUCCESSFULLY":
                outputData.write(0xFF);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for status: " + status);
        }

        // Process 'WaitTime'
        outputData.write((waittime >> 8) & 0xff);
        outputData.write(waittime & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_STATUS_REPORT command<br>
     *
     * Firmware Update Md Status Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>STATUS {@link String}
     * <li>WAITTIME {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdStatusReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Status'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("STATUS", "UNABLE_TO_RECEIVE_WITHOUT_CHECKSUM_ERROR");
                break;
            case (byte) 0x01:
                response.put("STATUS", "UNABLE_TO_RECEIVE");
                break;
            case (byte) 0x02:
                response.put("STATUS", "DOES_NOT_MATCH_THE_MANUFACTURER_ID");
                break;
            case (byte) 0x03:
                response.put("STATUS", "DOES_NOT_MATCH_THE_FIRMWARE_ID");
                break;
            case (byte) 0x04:
                response.put("STATUS", "DOES_NOT_MATCH_THE_FIRMWARE_TARGET");
                break;
            case (byte) 0x05:
                response.put("STATUS", "INVALID_FILE_HEADER_INFORMATION");
                break;
            case (byte) 0x06:
                response.put("STATUS", "INVALID_FILE_HEADER_FORMAT");
                break;
            case (byte) 0x07:
                response.put("STATUS", "INSUFFICIENT_MEMORY");
                break;
            case (byte) 0x08:
                response.put("STATUS", "DOES_NOT_MATCH_THE_HARDWARE_VERSION");
                break;
            case (byte) 0xFD:
                response.put("STATUS", "SUCCESSFULLY,_WAITING_FOR_ACTIVATION");
                break;
            case (byte) 0xFE:
                response.put("STATUS", "SUCCESSFULLY_STORED");
                break;
            case (byte) 0xFF:
                response.put("STATUS", "SUCCESSFULLY");
                break;
            default:
                logger.debug("Unknown value {} for constant 'STATUS'", String.format("%02X", payload[2]));
                response.put("STATUS", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Process 'WaitTime'
        response.put("WAITTIME", Integer.valueOf(payload[3] << 8 + payload[4]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the FIRMWARE_UPDATE_ACTIVATION_SET command.<br>
     *
     * Firmware Update Activation Set Command<br>
     *
     *
     * @param manufacturerId {@link Integer}
     * @param firmwareId {@link Integer}
     * @param checksum {@link Integer}
     * @param firmwareTarget {@link Integer}
     * @param hardwareVersion {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateActivationSet(Integer manufacturerId, Integer firmwareId, Integer checksum,
            Integer firmwareTarget, Integer hardwareVersion) {
        logger.debug("Creating command message FIRMWARE_UPDATE_ACTIVATION_SET version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_ACTIVATION_SET);

        // Process 'Manufacturer ID'
        outputData.write((manufacturerId >> 8) & 0xff);
        outputData.write(manufacturerId & 0xff);

        // Process 'Firmware ID'
        outputData.write((firmwareId >> 8) & 0xff);
        outputData.write(firmwareId & 0xff);

        // Process 'Checksum'
        outputData.write((checksum >> 8) & 0xff);
        outputData.write(checksum & 0xff);

        // Process 'Firmware Target'
        outputData.write(firmwareTarget);

        // Process 'Hardware Version'
        outputData.write(hardwareVersion);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_ACTIVATION_SET command<br>
     *
     * Firmware Update Activation Set Command<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>MANUFACTURER_ID {@link Integer}
     * <li>FIRMWARE_ID {@link Integer}
     * <li>CHECKSUM {@link Integer}
     * <li>FIRMWARE_TARGET {@link Integer}
     * <li>HARDWARE_VERSION {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateActivationSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Manufacturer ID'
        response.put("MANUFACTURER_ID", Integer.valueOf(payload[2] << 8 + payload[3]));

        // Process 'Firmware ID'
        response.put("FIRMWARE_ID", Integer.valueOf(payload[4] << 8 + payload[5]));

        // Process 'Checksum'
        response.put("CHECKSUM", Integer.valueOf(payload[6] << 8 + payload[7]));

        // Process 'Firmware Target'
        response.put("FIRMWARE_TARGET", Integer.valueOf(payload[8]));

        // Process 'Hardware Version'
        response.put("HARDWARE_VERSION", Integer.valueOf(payload[9]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the FIRMWARE_UPDATE_ACTIVATION_STATUS_REPORT command.<br>
     *
     * Firmware Update Activation Status Report<br>
     *
     *
     * @param manufacturerId {@link Integer}
     * @param firmwareId {@link Integer}
     * @param checksum {@link Integer}
     * @param firmwareTarget {@link Integer}
     * @param firmwareUpdateStatus {@link String}
     * @param hardwareVersion {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateActivationStatusReport(Integer manufacturerId, Integer firmwareId,
            Integer checksum, Integer firmwareTarget, String firmwareUpdateStatus, Integer hardwareVersion) {
        logger.debug("Creating command message FIRMWARE_UPDATE_ACTIVATION_STATUS_REPORT version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_ACTIVATION_STATUS_REPORT);

        // Process 'Manufacturer ID'
        outputData.write((manufacturerId >> 8) & 0xff);
        outputData.write(manufacturerId & 0xff);

        // Process 'Firmware ID'
        outputData.write(firmwareId);

        // Process 'Checksum'
        outputData.write((checksum >> 8) & 0xff);
        outputData.write(checksum & 0xff);

        // Process 'Firmware Target'
        outputData.write(firmwareTarget);

        // Process 'Firmware Update Status'
        switch (firmwareUpdateStatus) {
            case "INVALID_COMBINATION":
                outputData.write(0x00);
                break;
            case "ERROR_ACTIVATING_THE_FIRMWARE":
                outputData.write(0x01);
                break;
            case "FIRMWARE_UPDATE_COMPLETED_SUCCESSFULLY":
                outputData.write(0xFF);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for firmwareUpdateStatus: " + firmwareUpdateStatus);
        }

        // Process 'Hardware Version'
        outputData.write(hardwareVersion);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_ACTIVATION_STATUS_REPORT command<br>
     *
     * Firmware Update Activation Status Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>MANUFACTURER_ID {@link Integer}
     * <li>FIRMWARE_ID {@link Integer}
     * <li>CHECKSUM {@link Integer}
     * <li>FIRMWARE_TARGET {@link Integer}
     * <li>FIRMWARE_UPDATE_STATUS {@link String}
     * <li>HARDWARE_VERSION {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateActivationStatusReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Manufacturer ID'
        response.put("MANUFACTURER_ID", Integer.valueOf(payload[2] << 8 + payload[3]));

        // Process 'Firmware ID'
        response.put("FIRMWARE_ID", Integer.valueOf(payload[4]));

        // Process 'Checksum'
        response.put("CHECKSUM", Integer.valueOf(payload[5] << 8 + payload[6]));

        // Process 'Firmware Target'
        response.put("FIRMWARE_TARGET", Integer.valueOf(payload[7]));

        // Process 'Firmware Update Status'
        switch ((int) payload[8]) {
            case (byte) 0x00:
                response.put("FIRMWARE_UPDATE_STATUS", "INVALID_COMBINATION");
                break;
            case (byte) 0x01:
                response.put("FIRMWARE_UPDATE_STATUS", "ERROR_ACTIVATING_THE_FIRMWARE");
                break;
            case (byte) 0xFF:
                response.put("FIRMWARE_UPDATE_STATUS", "FIRMWARE_UPDATE_COMPLETED_SUCCESSFULLY");
                break;
            default:
                logger.debug("Unknown value {} for constant 'FIRMWARE_UPDATE_STATUS'", String.format("%02X", payload[8]));
                response.put("FIRMWARE_UPDATE_STATUS", "UNKNOWN_" + String.format("%02X", payload[8]));
                break;
        }

        // Process 'Hardware Version'
        response.put("HARDWARE_VERSION", Integer.valueOf(payload[9]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_PREPARE_GET command.<br>
     *
     * Firmware Update MD Prepare Get<br>
     *
     *
     * @param manufacturerId {@link Integer}
     * @param firmwareId {@link Integer}
     * @param firmwareTarget {@link Integer}
     * @param fragmentSize {@link Integer}
     * @param hardwareVersion {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdPrepareGet(Integer manufacturerId, Integer firmwareId,
            Integer firmwareTarget, Integer fragmentSize, Integer hardwareVersion) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_PREPARE_GET version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_PREPARE_GET);

        // Process 'Manufacturer ID'
        outputData.write((manufacturerId >> 8) & 0xff);
        outputData.write(manufacturerId & 0xff);

        // Process 'Firmware ID'
        outputData.write((firmwareId >> 8) & 0xff);
        outputData.write(firmwareId & 0xff);

        // Process 'Firmware Target'
        outputData.write(firmwareTarget);

        // Process 'Fragment Size'
        outputData.write((fragmentSize >> 8) & 0xff);
        outputData.write(fragmentSize & 0xff);

        // Process 'Hardware Version'
        outputData.write(hardwareVersion);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_PREPARE_GET command<br>
     *
     * Firmware Update MD Prepare Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>MANUFACTURER_ID {@link Integer}
     * <li>FIRMWARE_ID {@link Integer}
     * <li>FIRMWARE_TARGET {@link Integer}
     * <li>FRAGMENT_SIZE {@link Integer}
     * <li>HARDWARE_VERSION {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdPrepareGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Manufacturer ID'
        response.put("MANUFACTURER_ID", Integer.valueOf(payload[2] << 8 + payload[3]));

        // Process 'Firmware ID'
        response.put("FIRMWARE_ID", Integer.valueOf(payload[4] << 8 + payload[5]));

        // Process 'Firmware Target'
        response.put("FIRMWARE_TARGET", Integer.valueOf(payload[6]));

        // Process 'Fragment Size'
        response.put("FRAGMENT_SIZE", Integer.valueOf(payload[7] << 8 + payload[8]));

        // Process 'Hardware Version'
        response.put("HARDWARE_VERSION", Integer.valueOf(payload[9]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_PREPARE_REPORT command.<br>
     *
     * Firmware Update MD Prepare Report<br>
     *
     *
     * @param status {@link String}
     * @param firmwareChecksum {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdPrepareReport(String status, Integer firmwareChecksum) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_PREPARE_REPORT version 5");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_PREPARE_REPORT);

        // Process 'Status'
        switch (status) {
            case "INVALID_COMBINATION":
                outputData.write(0x00);
                break;
            case "REQUIRES_AUTHENTICATION":
                outputData.write(0x01);
                break;
            case "INVALID_FRAGMENT_SIZE":
                outputData.write(0x02);
                break;
            case "NOT_UPGRADABLE":
                outputData.write(0x03);
                break;
            case "INVALID_HARDWARE_VERSION":
                outputData.write(0x04);
                break;
            case "VALID_COMBINATION":
                outputData.write(0xFF);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for status: " + status);
        }

        // Process 'Firmware Checksum'
        outputData.write((firmwareChecksum >> 8) & 0xff);
        outputData.write(firmwareChecksum & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_PREPARE_REPORT command<br>
     *
     * Firmware Update MD Prepare Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>STATUS {@link String}
     * <li>FIRMWARE_CHECKSUM {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdPrepareReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Status'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("STATUS", "INVALID_COMBINATION");
                break;
            case (byte) 0x01:
                response.put("STATUS", "REQUIRES_AUTHENTICATION");
                break;
            case (byte) 0x02:
                response.put("STATUS", "INVALID_FRAGMENT_SIZE");
                break;
            case (byte) 0x03:
                response.put("STATUS", "NOT_UPGRADABLE");
                break;
            case (byte) 0x04:
                response.put("STATUS", "INVALID_HARDWARE_VERSION");
                break;
            case (byte) 0xFF:
                response.put("STATUS", "VALID_COMBINATION");
                break;
            default:
                logger.debug("Unknown value {} for constant 'STATUS'", String.format("%02X", payload[2]));
                response.put("STATUS", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Process 'Firmware Checksum'
        response.put("FIRMWARE_CHECKSUM", Integer.valueOf(payload[3] << 8 + payload[4]));

        // Return the map of processed response data;
        return response;
    }

}
