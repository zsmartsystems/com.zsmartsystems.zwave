package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * @author Chris Jackson
 *
 */
public class CommandClassNetworkManagementInstallationMaintenanceV1Test {

    @Test
    public void getLastWorkingRouteGet() {
        byte[] expectedResponse = { 0x67, 2, 99 };
        assertTrue(Arrays.equals(CommandClassNetworkManagementInstallationMaintenanceV1.getLastWorkingRouteGet(99),
                expectedResponse));
    }

}
