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
import com.zsmartsystems.zwave.commandclass.impl.CommandClassHrvStatusV1;

/**
 * Class to implement loopback tests for command class <b>COMMAND_CLASS_HRV_STATUS</b> version <b>1</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassHrvStatusV1LoopbackTest {
    /**
     * Performs an in/out test of the HRV_STATUS_GET command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param statusParameter {@link String}
     */
    public static void testHrvStatusGetLoopback(String statusParameter) {
        byte[] testPayload = CommandClassHrvStatusV1.getHrvStatusGet(statusParameter);

        Map<String, Object> response = CommandClassHrvStatusV1.handleHrvStatusGet(testPayload);
        assertEquals(statusParameter, (String) response.get("STATUS_PARAMETER"));
    }

    /**
     * Performs an in/out test of the HRV_STATUS_REPORT command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param statusParameter {@link String}
     * @param size {@link Integer}
     * @param scale {@link Integer}
     * @param precision {@link Integer}
     * @param value {@link byte[]}
     */
    public static void testHrvStatusReportLoopback(String statusParameter, Integer size, Integer scale,
            Integer precision, byte[] value) {
        byte[] testPayload = CommandClassHrvStatusV1.getHrvStatusReport(statusParameter, size, scale, precision, value);

        Map<String, Object> response = CommandClassHrvStatusV1.handleHrvStatusReport(testPayload);
        assertEquals(statusParameter, (String) response.get("STATUS_PARAMETER"));
        assertEquals(size, (Integer) response.get("SIZE"));
        assertEquals(scale, (Integer) response.get("SCALE"));
        assertEquals(precision, (Integer) response.get("PRECISION"));
        assertEquals(value, (byte[]) response.get("VALUE"));
    }

    /**
     * Performs an in/out test of the HRV_STATUS_SUPPORTED_REPORT command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param bitMask {@link List<String>}
     */
    public static void testHrvStatusSupportedReportLoopback(List<String> bitMask) {
        byte[] testPayload = CommandClassHrvStatusV1.getHrvStatusSupportedReport(bitMask);

        Map<String, Object> response = CommandClassHrvStatusV1.handleHrvStatusSupportedReport(testPayload);
        assertEquals(bitMask, (List<String>) response.get("BIT_MASK"));
    }

}