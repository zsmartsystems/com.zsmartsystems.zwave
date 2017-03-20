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
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.zsmartsystems.zwave.commandclass.ZWaveCommandClassTest;

/**
 * Test cases for {@link CommandClassSensorBinaryV2}.
 *
 * @author Chris Jackson
 */
public class CommandClassSensorBinaryV2Test extends ZWaveCommandClassTest {

    @Test
    public void getSensorBinaryGet() {
        byte[] expectedResponse = { 48, 2, 10 };
        assertTrue(Arrays.equals(CommandClassSensorBinaryV2.getSensorBinaryGet("DOOR_WINDOW"), expectedResponse));
    }

    @Test
    public void getSensorBinarySupportedGetSensor() {
        byte[] expectedResponse = { 48, 1 };
        assertTrue(Arrays.equals(CommandClassSensorBinaryV2.getSensorBinarySupportedGetSensor(), expectedResponse));
    }

    @Test
    public void handleSensorBinarySupportedSensorReport() {
        Map<String, Object> report = CommandClassSensorBinaryV2
                .handleSensorBinarySupportedSensorReport(new byte[] { 0x30, 0x04, 0x00, 0x15, });

        assertEquals(3, ((List<String>) report.get("BIT_MASK")).size());
        assertTrue(((List<String>) report.get("BIT_MASK")).contains("DOOR_WINDOW"));
        assertTrue(((List<String>) report.get("BIT_MASK")).contains("TAMPER"));
        assertTrue(((List<String>) report.get("BIT_MASK")).contains("MOTION"));
    }

}
