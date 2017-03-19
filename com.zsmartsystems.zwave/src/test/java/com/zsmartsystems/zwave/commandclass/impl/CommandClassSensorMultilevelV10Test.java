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
public class CommandClassSensorMultilevelV10Test {
    @Test
    public void getSensorMultilevelGet_DIRECTION() {
        byte[] expectedResponse = { 49, 4, 7, 0 };
        assertTrue(Arrays.equals(CommandClassSensorMultilevelV10.getSensorMultilevelGet("DIRECTION", 0),
                expectedResponse));
    }

    @Test
    public void getSensorMultilevelGet_ACCELERATION_Z() {
        byte[] expectedResponse = { 49, 4, 54, 0 };
        assertTrue(Arrays.equals(CommandClassSensorMultilevelV10.getSensorMultilevelGet("ACCELERATION_Z_AXIS", 0),
                expectedResponse));
    }

    @Test
    public void handleSensorMultilevelReport() {
        Map<String, Map<String, Object>> tests = new HashMap<String, Map<String, Object>>();
        Map<String, Object> test = new HashMap<String, Object>();

        test.clear();
        test.put("input", new byte[] { 0x31, 0x05, 0x36, 0x21, 0x5E });
        test.put("SENSOR_TYPE", "ACCELERATION_Z_AXIS");
        test.put("SIZE", 1);
        test.put("SCALE", 1);
        test.put("PRECISION", 1);
        test.put("SENSOR_VALUE", 94);
        tests.put("ACCELERATION_Z_AXIS == 9.4", test);

        test.clear();
        test.put("input", new byte[] { 0x31, 0x05, 0x35, 0x21, (byte) 0xE0 });
        test.put("SENSOR_TYPE", "ACCELERATION_Y_AXIS");
        test.put("SIZE", 1);
        test.put("SCALE", 1);
        test.put("PRECISION", 1);
        test.put("SENSOR_VALUE", -32);
        tests.put("ACCELERATION_Z_AXIS == -3.2", test);

        for (String testName : tests.keySet()) {
            System.out.println("Running report test for " + this.getClass().getSimpleName() + ": " + testName);

            Map<String, Object> testData = tests.get(testName);
            Map<String, Object> report = CommandClassSensorMultilevelV10
                    .handleSensorMultilevelReport((byte[]) testData.get("input"));

            for (String data : testData.keySet()) {
                if (data.equals("input")) {
                    continue;
                }
                assertEquals(testData.get(data), report.get(data));
            }
        }
    }

}
