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
import com.zsmartsystems.zwave.commandclass.impl.CommandClassLockV1;

/**
 * Class to implement loopback tests for command class <b>COMMAND_CLASS_LOCK</b> version <b>1</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassLockV1LoopbackTest {
    /**
     * Performs an in/out test of the LOCK_SET command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param lockState {@link String}
     */
    public static void testLockSetLoopback(String lockState) {
        byte[] testPayload = CommandClassLockV1.getLockSet(lockState);

        Map<String, Object> response = CommandClassLockV1.handleLockSet(testPayload);
        assertEquals(lockState, (String) response.get("LOCK_STATE"));
    }

    /**
     * Performs an in/out test of the LOCK_REPORT command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param lockState {@link String}
     */
    public static void testLockReportLoopback(String lockState) {
        byte[] testPayload = CommandClassLockV1.getLockReport(lockState);

        Map<String, Object> response = CommandClassLockV1.handleLockReport(testPayload);
        assertEquals(lockState, (String) response.get("LOCK_STATE"));
    }

}
