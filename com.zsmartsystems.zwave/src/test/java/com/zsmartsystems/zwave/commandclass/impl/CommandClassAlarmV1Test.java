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
public class CommandClassAlarmV1Test {

    @Test
    public void getEventSupportedGet() {
        byte[] expectedResponse = { 113, 4, 6 };
        assertTrue(Arrays.equals(CommandClassAlarmV1.getAlarmGet(6), expectedResponse));
    }

    @Test
    public void handleNotificationReport() {
        Map<String, Map<String, Object>> tests = new HashMap<String, Map<String, Object>>();
        Map<String, Object> test = new HashMap<String, Object>();

        test.clear();
        test.put("input", new byte[] { 0x71, 0x05, 0x00, 0x00 });
        test.put("ALARM_TYPE", 0);
        test.put("ALARM_LEVEL", 0);
        tests.put("GENERAL == 0", test);

        for (String testName : tests.keySet()) {
            System.out.println("Running report test for " + this.getClass().getSimpleName() + ": " + testName);

            Map<String, Object> testData = tests.get(testName);
            Map<String, Object> report = CommandClassAlarmV1.handleAlarmReport((byte[]) testData.get("input"));

            for (String data : testData.keySet()) {
                if (data.equals("input")) {
                    continue;
                }
                assertEquals(testData.get(data), report.get(data));
            }
        }
    }

}
