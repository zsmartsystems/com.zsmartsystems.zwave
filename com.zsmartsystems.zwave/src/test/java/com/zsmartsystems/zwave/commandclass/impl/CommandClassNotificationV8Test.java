package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Test cases for {@link CommandClassSensorMultilevelV5}.
 *
 * @author Chris Jackson
 */
public class CommandClassNotificationV8Test {

    @Test
    public void getEventSupportedGet() {
        byte[] expectedResponse = { 113, 1, 1 };
        assertTrue(Arrays.equals(CommandClassNotificationV8.getEventSupportedGet("SMOKE"), expectedResponse));
    }

    @Test
    public void getNotificationSupportedGet() {
        byte[] expectedResponse = { 113, 7 };
        assertTrue(Arrays.equals(CommandClassNotificationV8.getNotificationSupportedGet(), expectedResponse));
    }

    @Ignore
    @Test
    public void handleEventSupportedReport() {
        byte[] payload = { 0x71, 0x08, 0x01, (byte) 0x80 };
        Map<String, Object> report = CommandClassNotificationV8.handleEventSupportedReport(payload);

        assertEquals("SMOKE", report.get("NOTIFICATION_TYPE"));
    }

    private static Map<String, Map<String, Object>> tests = new HashMap<String, Map<String, Object>>();
    static {
        Map<String, Object> test = new HashMap<String, Object>();

        test.clear();
        test.put("input", new byte[] { 0x71, 0x05, 0x00, 0x00, 0x00, (byte) 0xFF, 0x08, 0x01, 0x00, 0x00 });
        test.put("NOTIFICATION_TYPE", "POWER_MANAGEMENT");
        test.put("EVENT", 1);
        test.put("NOTIFICATION_STATUS", "ON");
        tests.put("POWER_MANAGEMENT Event 1 == FF", test);
    }

    @Test
    public void handleNotificationReport() {
        for (String test : tests.keySet()) {
            System.out.println("Running report test for " + this.getClass().getSimpleName() + ": " + test);

            Map<String, Object> testData = tests.get(test);
            Map<String, Object> report = CommandClassNotificationV8
                    .handleNotificationReport((byte[]) testData.get("input"));

            for (String data : testData.keySet()) {
                if (data.equals("input")) {
                    continue;
                }
                assertEquals(testData.get(data), report.get(data));
            }
        }
    }

}
