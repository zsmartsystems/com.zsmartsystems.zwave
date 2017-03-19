/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.zsmartsystems.zwave.commandclass.ZWaveCommandClassTest;

/**
 * Test cases for {@link CommandClassIndicatorV1Test}.
 *
 * @author Chris Jackson
 */
public class CommandClassIndicatorV1Test extends ZWaveCommandClassTest {

    @Test
    public void getIndicatorSet() {
        byte[] expectedResponse = { -121, 1, 34 };
        assertTrue(Arrays.equals(CommandClassIndicatorV1.getIndicatorSet(34), expectedResponse));
    }

    @Test
    public void getIndicatorGet() {
        byte[] expectedResponse = { -121, 2 };
        assertTrue(Arrays.equals(CommandClassIndicatorV1.getIndicatorGet(), expectedResponse));
    }
}
