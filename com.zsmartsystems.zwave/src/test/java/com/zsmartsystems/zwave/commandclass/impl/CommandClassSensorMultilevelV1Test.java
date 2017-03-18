package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Test cases for {@link CommandClassSensorMultilevelV1Test}.
 *
 * @author Chris Jackson
 */
public class CommandClassSensorMultilevelV1Test {

    @Test
    public void getSensorMultilevelGet() {
        byte[] expectedResponse = { 49, 4 };
        assertTrue(Arrays.equals(CommandClassSensorMultilevelV1.getSensorMultilevelGet(), expectedResponse));
    }
}
