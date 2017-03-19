package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Test cases for {@link CommandClassMeterV4Test}.
 *
 * @author Chris Jackson
 */
public class CommandClassMeterV4Test {

    @Test
    public void getMeterSupportedGet() {
        byte[] expectedResponse = { 50, 3 };
        assertTrue(Arrays.equals(CommandClassMeterV2.getMeterSupportedGet(), expectedResponse));
    }

    @Test
    public void getMeterReset() {
        byte[] expectedResponse = { 50, 5 };
        assertTrue(Arrays.equals(CommandClassMeterV2.getMeterReset(), expectedResponse));
    }

    @Test
    public void handleMeterReport() {
        Map<String, Map<String, Object>> tests = new HashMap<String, Map<String, Object>>();
        Map<String, Object> test = new HashMap<String, Object>();

        test.clear();
        test.put("input", new byte[] { 0x32, 0x02, 0x21, 0x34, 0x00, 0x00, 0x01, (byte) 0xB7, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00 });
        test.put("METER_TYPE", 1);
        test.put("METER_VALUE", 183);
        tests.put("ELECTRIC_METER ...", test);

        for (String testName : tests.keySet()) {
            System.out.println("Running report test for " + this.getClass().getSimpleName() + ": " + testName);

            Map<String, Object> testData = tests.get(testName);
            Map<String, Object> report = CommandClassMeterV2.handleMeterReport((byte[]) testData.get("input"));

            for (String data : testData.keySet()) {
                if (data.equals("input")) {
                    continue;
                }
                assertEquals(testData.get(data), report.get(data));
            }
        }
    }

}
