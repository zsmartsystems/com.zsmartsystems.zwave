package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Test cases for {@link CommandClassMeterV1}.
 *
 * @author Chris Jackson
 */
public class CommandClassMeterV1Test {

    @Test
    public void getMeterSupportedGet() {
        byte[] expectedResponse = { 50, 1 };
        assertTrue(Arrays.equals(CommandClassMeterV1.getMeterGet(), expectedResponse));
    }

    private static Map<String, Map<String, Object>> tests = new HashMap<String, Map<String, Object>>();
    static {
        Map<String, Object> test = new HashMap<String, Object>();

        test.clear();
        test.put("input", new byte[] { 0x32, 0x02, 0x01, 0x34, 0x00, 0x00, 0x01, (byte) 0xB7 });
        test.put("METER_TYPE", "ELECTRIC_METER");
        test.put("METER_VALUE", 183);
        tests.put("ELECTRIC_METER ...", test);
    }

    @Test
    public void handleMeterReport() {
        for (String test : tests.keySet()) {
            System.out.println("Running report test for " + this.getClass().getSimpleName() + ": " + test);

            Map<String, Object> testData = tests.get(test);
            Map<String, Object> report = CommandClassMeterV1.handleMeterReport((byte[]) testData.get("input"));

            for (String data : testData.keySet()) {
                if (data.equals("input")) {
                    continue;
                }
                assertEquals(testData.get(data), report.get(data));
            }
        }
    }

}
