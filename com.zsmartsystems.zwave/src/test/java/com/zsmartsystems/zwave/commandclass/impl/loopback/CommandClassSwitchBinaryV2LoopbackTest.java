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
import com.zsmartsystems.zwave.commandclass.impl.CommandClassSwitchBinaryV2;

/**
 * Class to implement loopback tests for command class <b>COMMAND_CLASS_SWITCH_BINARY</b> version <b>2</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassSwitchBinaryV2LoopbackTest {
    /**
     * Performs an in/out test of the SWITCH_BINARY_SET command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param targetValue {@link String}
     * @param duration {@link String}
     */
    public static void testSwitchBinarySetLoopback(String targetValue, String duration) {
        byte[] testPayload = CommandClassSwitchBinaryV2.getSwitchBinarySet(targetValue, duration);

        Map<String, Object> response = CommandClassSwitchBinaryV2.handleSwitchBinarySet(testPayload);
        assertEquals(targetValue, (String) response.get("TARGET_VALUE"));
        assertEquals(duration, (String) response.get("DURATION"));
    }

    /**
     * Performs an in/out test of the SWITCH_BINARY_REPORT command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param currentValue {@link String}
     * @param targetValue {@link String}
     * @param duration {@link String}
     */
    public static void testSwitchBinaryReportLoopback(String currentValue, String targetValue, String duration) {
        byte[] testPayload = CommandClassSwitchBinaryV2.getSwitchBinaryReport(currentValue, targetValue, duration);

        Map<String, Object> response = CommandClassSwitchBinaryV2.handleSwitchBinaryReport(testPayload);
        assertEquals(currentValue, (String) response.get("CURRENT_VALUE"));
        assertEquals(targetValue, (String) response.get("TARGET_VALUE"));
        assertEquals(duration, (String) response.get("DURATION"));
    }

}
