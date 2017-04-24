/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.zsmartsystems.zwave.commandclass.ZWaveCommandClassTest;

/**
 * Test cases for {@link CommandClassUserCodeV1}.
 *
 * @author Chris Jackson
 */
public class CommandClassUserCodeV1Test extends ZWaveCommandClassTest {

    @Test
    public void getUserCodeGet() {
        byte[] expectedResponse = { 0x63, 0x02, 0x03 };
        assertTrue(Arrays.equals(CommandClassUserCodeV1.getUserCodeGet(3), expectedResponse));
    }

    @Test
    public void getUsersNumberGet() {
        byte[] expectedResponse = { 0x63, 0x04 };
        assertTrue(Arrays.equals(CommandClassUserCodeV1.getUsersNumberGet(), expectedResponse));
    }

    @Test
    public void getUsersNumberSet() {
        byte[] expectedResponse = { 0x63, 0x01, 0x03, 0x01, 0x31, 0x32, 0x33, 0x34 };
        assertTrue(Arrays.equals(
                CommandClassUserCodeV1.getUserCodeSet(3, "OCCUPIED", new byte[] { 0x31, 0x32, 0x33, 0x34 }),
                expectedResponse));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getUsersNumberSetLong() {
        CommandClassUserCodeV1.getUserCodeSet(3, "OCCUPIED",
                new byte[] { 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3a });
    }

    @Test
    public void handleUserCodeReport() {
        Map<String, Map<String, Object>> tests = new HashMap<String, Map<String, Object>>();
        Map<String, Object> test = new HashMap<String, Object>();

        test.clear();
        test.put("input",
                new byte[] { 0x63, 0x03, 0x01, 0x01, 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39 });
        test.put("USER_IDENTIFIER", 1);
        test.put("USER_ID_STATUS", "OCCUPIED");
        test.put("USER_CODE", new byte[] { 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39 });
        tests.put("USER_CODE == OCCUPIED (0,1,2,3,4,5,6,7,8,9)", test);

        test.clear();
        test.put("input", new byte[] { 0x63, 0x03, 0x01, 0x01, 0x30, 0x31, 0x32, 0x33 });
        test.put("USER_IDENTIFIER", 1);
        test.put("USER_ID_STATUS", "OCCUPIED");
        test.put("USER_CODE", new byte[] { 0x30, 0x31, 0x32, 0x33 });
        tests.put("USER_CODE == OCCUPIED (0,1,2,3)", test);

        test.clear();
        test.put("input", new byte[] { 0x63, 0x03, 0x01, 0x00, 0x30, 0x31, 0x32, 0x33 });
        test.put("USER_IDENTIFIER", 1);
        test.put("USER_ID_STATUS", "AVAILABLE");
        test.put("USER_CODE", new byte[] { 0x30, 0x31, 0x32, 0x33 });
        tests.put("USER_CODE == AVAILABLE (0,1,2,3)", test);

        for (String testName : tests.keySet()) {
            System.out.println("Running report test for " + this.getClass().getSimpleName() + ": " + testName);

            Map<String, Object> testData = tests.get(testName);
            Map<String, Object> report = CommandClassUserCodeV1.handleUserCodeReport((byte[]) testData.get("input"));

            checkResponse(testData, report);
        }
    }

}
