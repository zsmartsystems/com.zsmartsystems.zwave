/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl.loopback;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.List;
import com.zsmartsystems.zwave.commandclass.impl.CommandClassWindowCoveringV1;

/**
 * Class to implement loopback tests for command class <b>COMMAND_CLASS_WINDOW_COVERING</b> version <b>1</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassWindowCoveringV1LoopbackTest {
    /**
     * Performs an in/out test of the WINDOW_COVERING_SUPPORTED_REPORT command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param parameterMask {@link List<Integer>}
     */
    public static void testWindowCoveringSupportedReportLoopback(List<Integer> parameterMask) {
        byte[] testPayload = CommandClassWindowCoveringV1.getWindowCoveringSupportedReport(parameterMask);

        Map<String, Object> response = CommandClassWindowCoveringV1.handleWindowCoveringSupportedReport(testPayload);
        assertEquals(parameterMask, (List<Integer>) response.get("PARAMETER_MASK"));
    }

    /**
     * Performs an in/out test of the WINDOW_COVERING_GET command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param parameterId {@link String}
     */
    public static void testWindowCoveringGetLoopback(String parameterId) {
        byte[] testPayload = CommandClassWindowCoveringV1.getWindowCoveringGet(parameterId);

        Map<String, Object> response = CommandClassWindowCoveringV1.handleWindowCoveringGet(testPayload);
        assertEquals(parameterId, (String) response.get("PARAMETER_ID"));
    }

    /**
     * Performs an in/out test of the WINDOW_COVERING_REPORT command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param parameterId {@link String}
     * @param currentValue {@link Integer}
     * @param targetValue {@link Integer}
     * @param duration {@link Integer}
     */
    public static void testWindowCoveringReportLoopback(String parameterId, Integer currentValue, Integer targetValue,
            Integer duration) {
        byte[] testPayload = CommandClassWindowCoveringV1.getWindowCoveringReport(parameterId, currentValue, targetValue,
                duration);

        Map<String, Object> response = CommandClassWindowCoveringV1.handleWindowCoveringReport(testPayload);
        assertEquals(parameterId, (String) response.get("PARAMETER_ID"));
        assertEquals(currentValue, (Integer) response.get("CURRENT_VALUE"));
        assertEquals(targetValue, (Integer) response.get("TARGET_VALUE"));
        assertEquals(duration, (Integer) response.get("DURATION"));
    }

    /**
     * Performs an in/out test of the WINDOW_COVERING_SET command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param parameterCount {@link Integer}
     * @param duration {@link Integer}
     */
    public static void testWindowCoveringSetLoopback(Integer parameterCount, Integer duration) {
        byte[] testPayload = CommandClassWindowCoveringV1.getWindowCoveringSet(parameterCount, duration);

        Map<String, Object> response = CommandClassWindowCoveringV1.handleWindowCoveringSet(testPayload);
        assertEquals(parameterCount, (Integer) response.get("PARAMETER_COUNT"));
        assertEquals(duration, (Integer) response.get("DURATION"));
    }

    /**
     * Performs an in/out test of the WINDOW_COVERING_START_LEVEL_CHANGE command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param res1 {@link Integer}
     * @param upDown {@link Boolean}
     * @param res2 {@link Boolean}
     * @param parameterId {@link String}
     * @param duration {@link Integer}
     */
    public static void testWindowCoveringStartLevelChangeLoopback(Integer res1, Boolean upDown, Boolean res2,
            String parameterId, Integer duration) {
        byte[] testPayload = CommandClassWindowCoveringV1.getWindowCoveringStartLevelChange(res1, upDown, res2,
                parameterId, duration);

        Map<String, Object> response = CommandClassWindowCoveringV1.handleWindowCoveringStartLevelChange(testPayload);
        assertEquals(res1, (Integer) response.get("RES1"));
        assertEquals(upDown, (Boolean) response.get("UP_DOWN"));
        assertEquals(res2, (Boolean) response.get("RES2"));
        assertEquals(parameterId, (String) response.get("PARAMETER_ID"));
        assertEquals(duration, (Integer) response.get("DURATION"));
    }

    /**
     * Performs an in/out test of the WINDOW_COVERING_STOP_LEVEL_CHANGE command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param parameterId {@link String}
     */
    public static void testWindowCoveringStopLevelChangeLoopback(String parameterId) {
        byte[] testPayload = CommandClassWindowCoveringV1.getWindowCoveringStopLevelChange(parameterId);

        Map<String, Object> response = CommandClassWindowCoveringV1.handleWindowCoveringStopLevelChange(testPayload);
        assertEquals(parameterId, (String) response.get("PARAMETER_ID"));
    }

}
