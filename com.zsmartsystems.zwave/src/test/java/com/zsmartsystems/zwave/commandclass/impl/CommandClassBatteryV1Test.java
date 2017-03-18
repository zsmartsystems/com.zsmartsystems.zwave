package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Test cases for {@link CommandClassBatteryV1Test}.
 *
 * @author Chris Jackson
 */
public class CommandClassBatteryV1Test {
    @Test
    public void getBatteryGet() {
        byte[] expectedResponse = { -128, 2 };
        assertTrue(Arrays.equals(CommandClassBatteryV1.getBatteryGet(), expectedResponse));
    }
}
