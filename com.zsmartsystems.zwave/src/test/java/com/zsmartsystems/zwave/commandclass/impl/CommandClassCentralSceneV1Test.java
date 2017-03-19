/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.zsmartsystems.zwave.commandclass.ZWaveCommandClassTest;

/**
 * Test cases for {@link CommandClassCentralSceneV1}.
 *
 * @author Chris Jackson
 */
public class CommandClassCentralSceneV1Test extends ZWaveCommandClassTest {

    @Test
    public void getCentralSceneSupportedGet() {
        byte[] expectedResponse = { 91, 1 };
        assertTrue(Arrays.equals(CommandClassCentralSceneV1.getCentralSceneSupportedGet(), expectedResponse));
    }

    @Test
    public void handleSensorMultilevelReport() {
        Map<String, Map<String, Object>> tests = new HashMap<String, Map<String, Object>>();
        Map<String, Object> test = new HashMap<String, Object>();

        test.clear();
        test.put("input", new byte[] { 0x5B, 0x03, 0x03, 0x03, 0x01 });
        test.put("KEY_ATTRIBUTES", 3);
        test.put("SCENE_NUMBER", 1);
        test.put("SEQUENCE_NUMBER", 3);
        tests.put("SCENE == 1, KEY = 3", test);

        test.clear();
        test.put("input", new byte[] { 0x5B, 0x03, 0x05, 0x05, 0x01 });
        test.put("KEY_ATTRIBUTES", 5);
        test.put("SCENE_NUMBER", 1);
        test.put("SEQUENCE_NUMBER", 5);
        tests.put("SCENE == 1, KEY = 5", test);

        for (String testName : tests.keySet()) {
            System.out.println("Running report test for " + this.getClass().getSimpleName() + ": " + testName);

            Map<String, Object> testData = tests.get(testName);
            Map<String, Object> report = CommandClassCentralSceneV1
                    .handleCentralSceneNotification((byte[]) testData.get("input"));

            for (String data : testData.keySet()) {
                if (data.equals("input")) {
                    continue;
                }
                assertEquals(testData.get(data), report.get(data));
            }
        }
    }

}
