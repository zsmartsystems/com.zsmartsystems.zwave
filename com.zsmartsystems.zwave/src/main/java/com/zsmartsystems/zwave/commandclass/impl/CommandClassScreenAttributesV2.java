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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_SCREEN_ATTRIBUTES</b> version <b>2</b>.<br>
 *
 * Command Class Screen Attributes<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassScreenAttributesV2 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassScreenAttributesV2.class);

    /**
     * Integer command class key for COMMAND_CLASS_SCREEN_ATTRIBUTES
     */
    public final static int COMMAND_CLASS_KEY = 0x93;

    /**
     * Screen Attributes Get Command Constant
     */
    public final static int SCREEN_ATTRIBUTES_GET = 0x01;
    /**
     * Screen Attributes Report Command Constant
     */
    public final static int SCREEN_ATTRIBUTES_REPORT = 0x03;

    /**
     * Creates a new message with the SCREEN_ATTRIBUTES_GET command.<br>
     *
     * Screen Attributes Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getScreenAttributesGet() {
        logger.debug("Creating command message SCREEN_ATTRIBUTES_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SCREEN_ATTRIBUTES_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SCREEN_ATTRIBUTES_GET command<br>
     *
     * Screen Attributes Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleScreenAttributesGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the SCREEN_ATTRIBUTES_REPORT command.<br>
     *
     * Screen Attributes Report<br>
     *
     *
     * @param numberOfLines {@link Integer}
     * @param escapeSequence {@link Boolean}
     * @param numberOfCharactersPerLine {@link Integer}
     * @param sizeOfLineBuffer {@link Integer}
     * @param numericalPresentationOfACharacter {@link Integer}
     * @param screenTimeout {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getScreenAttributesReport(Integer numberOfLines, Boolean escapeSequence,
            Integer numberOfCharactersPerLine, Integer sizeOfLineBuffer, Integer numericalPresentationOfACharacter,
            Integer screenTimeout) {
        logger.debug("Creating command message SCREEN_ATTRIBUTES_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(SCREEN_ATTRIBUTES_REPORT);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= numberOfLines & 0x1F;
        valProperties1 |= escapeSequence ? 0x20 : 0;
        outputData.write(valProperties1);

        // Process 'Number of Characters per Line'
        outputData.write(numberOfCharactersPerLine);

        // Process 'Size of Line Buffer'
        outputData.write(sizeOfLineBuffer);

        // Process 'Numerical Presentation of a Character'
        outputData.write(numericalPresentationOfACharacter);

        // Process 'Screen Timeout'
        outputData.write(screenTimeout);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the SCREEN_ATTRIBUTES_REPORT command<br>
     *
     * Screen Attributes Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>NUMBER_OF_LINES {@link Integer}
     * <li>ESCAPE_SEQUENCE {@link Boolean}
     * <li>NUMBER_OF_CHARACTERS_PER_LINE {@link Integer}
     * <li>SIZE_OF_LINE_BUFFER {@link Integer}
     * <li>NUMERICAL_PRESENTATION_OF_A_CHARACTER {@link Integer}
     * <li>SCREEN_TIMEOUT {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleScreenAttributesReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Properties1'
        response.put("NUMBER_OF_LINES", new Integer(payload[2] & 0x1F));
        response.put("ESCAPE_SEQUENCE", new Boolean((payload[2] & 0x20) != 0));

        // Process 'Number of Characters per Line'
        response.put("NUMBER_OF_CHARACTERS_PER_LINE", new Integer(payload[3]));

        // Process 'Size of Line Buffer'
        response.put("SIZE_OF_LINE_BUFFER", new Integer(payload[4]));

        // Process 'Numerical Presentation of a Character'
        response.put("NUMERICAL_PRESENTATION_OF_A_CHARACTER", new Integer(payload[5]));

        // Process 'Screen Timeout'
        response.put("SCREEN_TIMEOUT", new Integer(payload[6]));

        // Return the map of processed response data;
        return response;
    }

}
