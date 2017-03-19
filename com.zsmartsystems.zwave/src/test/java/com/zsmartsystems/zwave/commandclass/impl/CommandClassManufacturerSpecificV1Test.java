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
 * Test cases for {@link CommandClassManufacturerSpecificV1}.
 *
 * @author Chris Jackson
 */
public class CommandClassManufacturerSpecificV1Test extends ZWaveCommandClassTest {

    @Test
    public void getManufacturerSpecificGet() {
        byte[] expectedResponse = { 114, 4 };
        assertTrue(Arrays.equals(CommandClassManufacturerSpecificV1.getManufacturerSpecificGet(), expectedResponse));
    }

    @Test
    public void getManufacturerSpecificReport() {
        byte[] payload = CommandClassManufacturerSpecificV1.getManufacturerSpecificReport(0x123, 0x456, 0x789);

        Map<String, Object> report = CommandClassManufacturerSpecificV1.handleManufacturerSpecificReport(payload);
        assertEquals(0x123, report.get("MANUFACTURER_ID"));
        assertEquals(0x456, report.get("PRODUCT_TYPE_ID"));
        assertEquals(0x789, report.get("PRODUCT_ID"));
    }

    @Test
    public void handleManufacturerSpecificReport() {
        Map<String, Map<String, Object>> tests = new HashMap<String, Map<String, Object>>();
        Map<String, Object> test = new HashMap<String, Object>();

        test.clear();
        test.put("input", new byte[] { 0x72, 0x05, 0x01, 0x0F, 0x02, 0x00, 0x01, 0x04 });
        test.put("MANUFACTURER_ID", 0x010f);
        test.put("PRODUCT_TYPE_ID", 0x0200);
        test.put("PRODUCT_ID", 0x104);
        tests.put("SCENE == 1, KEY = 3", test);

        for (String testName : tests.keySet()) {
            System.out.println("Running report test for " + this.getClass().getSimpleName() + ": " + testName);

            Map<String, Object> testData = tests.get(testName);
            Map<String, Object> report = CommandClassManufacturerSpecificV1
                    .handleManufacturerSpecificReport((byte[]) testData.get("input"));

            for (String data : testData.keySet()) {
                if (data.equals("input")) {
                    continue;
                }
                assertEquals(testData.get(data), report.get(data));
            }
        }
    }
}
