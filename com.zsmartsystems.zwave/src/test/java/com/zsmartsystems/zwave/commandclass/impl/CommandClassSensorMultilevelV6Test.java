package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Test cases for {@link CommandClassSensorMultilevelV5}.
 *
 * @author Chris Jackson
 */
public class CommandClassSensorMultilevelV6Test {
    @Test
    public void getSensorMultilevelGet_Direction() {
        byte[] expectedResponse = { 49, 4, 7, 0 };
        assertTrue(
                Arrays.equals(CommandClassSensorMultilevelV6.getSensorMultilevelGet("DIRECTION", 0), expectedResponse));
    }
}
