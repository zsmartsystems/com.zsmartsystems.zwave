package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 
 * @author Chris Jackson
 *
 */
public class CommandClassNetworkManagementInclusionV1Test {

    @Test
    public void getNodeAdd() {
        byte[] expectedResponse = { 52, 1, 99, 0, 1, (byte) 0xA0 };
        List<String> txOptions = new ArrayList<String>();
        txOptions.add("EXPLORE");
        txOptions.add("HIGH_POWER");
        assertTrue(Arrays.equals(CommandClassNetworkManagementInclusionV1.getNodeAdd(99, "NODE_ADD_ANY", txOptions),
                expectedResponse));
    }

    @Test
    public void getNodeRemove() {
        byte[] expectedResponse = { 52, 3, 99, 0, 1 };
        assertTrue(Arrays.equals(CommandClassNetworkManagementInclusionV1.getNodeRemove(99, "NODE_REMOVE_ANY"),
                expectedResponse));
    }

    @Test
    public void getFailedNodeRemove() {
        byte[] expectedResponse = { 52, 7, 99, 23 };
        assertTrue(
                Arrays.equals(CommandClassNetworkManagementInclusionV1.getFailedNodeRemove(99, 23), expectedResponse));
    }

    @Test
    public void getNodeNeighborUpdateRequest() {
        byte[] expectedResponse = { 52, 11, 99, 23 };
        assertTrue(Arrays.equals(CommandClassNetworkManagementInclusionV1.getNodeNeighborUpdateRequest(99, 23),
                expectedResponse));
    }

    @Test
    public void getReturnRouteAssign() {
        byte[] expectedResponse = { 52, 13, 99, 23, 44 };
        assertTrue(Arrays.equals(CommandClassNetworkManagementInclusionV1.getReturnRouteAssign(99, 23, 44),
                expectedResponse));
    }

    @Test
    public void getReturnRouteAssignComplete() {
        byte[] expectedResponse = { 52, 14, 99, 0 };
        assertTrue(Arrays.equals(
                CommandClassNetworkManagementInclusionV1.getReturnRouteAssignComplete(99, "TRANSMIT_COMPLETE_OK"),
                expectedResponse));
    }

    @Test
    public void getReturnRouteDeleteComplete() {
        byte[] expectedResponse = { 52, 16, 99, 0 };
        assertTrue(Arrays.equals(
                CommandClassNetworkManagementInclusionV1.getReturnRouteDeleteComplete(99, "TRANSMIT_COMPLETE_OK"),
                expectedResponse));
    }
}
