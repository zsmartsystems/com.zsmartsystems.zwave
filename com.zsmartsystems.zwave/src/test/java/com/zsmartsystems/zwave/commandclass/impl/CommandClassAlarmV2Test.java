package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Test cases for {@link CommandClassSensorMultilevelV5}.
 *
 * @author Chris Jackson
 */
public class CommandClassAlarmV2Test {

    @Test
    public void getAlarmGet() {
        byte[] expectedResponse = { 113, 4, 6 };
        assertTrue(Arrays.equals(CommandClassAlarmV1.getAlarmGet(6), expectedResponse));
    }

    private static Map<String, Map<String, Object>> tests = new HashMap<String, Map<String, Object>>();
    static {
        Map<String, Object> test = new HashMap<String, Object>();

        test.clear();
        test.put("input", new byte[] { 0x71, 0x05, 0x00, 0x00, 0x00, (byte) 0xFF, 0x04, 0x00, 0x00 });
        test.put("ALARM_TYPE", 0);
        test.put("ALARM_LEVEL", 0);
        test.put("ZWAVE_ALARM_TYPE", "HEAT");
        test.put("ZWAVE_ALARM_STATUS", "ON");
        tests.put("GENERAL == 0", test);
    }

    @Test
    public void handleAlarmReport() {
        for (String test : tests.keySet()) {
            System.out.println("Running report test for " + this.getClass().getSimpleName() + ": " + test);

            Map<String, Object> testData = tests.get(test);
            Map<String, Object> report = CommandClassAlarmV2.handleAlarmReport((byte[]) testData.get("input"));

            for (String data : testData.keySet()) {
                if (data.equals("input")) {
                    continue;
                }
                assertEquals(testData.get(data), report.get(data));
            }
        }
    }

}
