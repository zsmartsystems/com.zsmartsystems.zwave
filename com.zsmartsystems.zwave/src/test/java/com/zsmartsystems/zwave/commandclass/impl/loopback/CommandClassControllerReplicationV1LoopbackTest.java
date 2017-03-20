/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl.loopback;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import com.zsmartsystems.zwave.commandclass.impl.CommandClassControllerReplicationV1;

/**
 * Class to implement loopback tests for command class <b>COMMAND_CLASS_CONTROLLER_REPLICATION</b> version <b>1</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassControllerReplicationV1LoopbackTest {
    /**
     * Performs an in/out test of the CTRL_REPLICATION_TRANSFER_GROUP command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param sequenceNumber {@link Integer}
     * @param groupId {@link Integer}
     * @param nodeId {@link Integer}
     */
    public static void testCtrlReplicationTransferGroupLoopback(Integer sequenceNumber, Integer groupId, Integer nodeId) {
        byte[] testPayload = CommandClassControllerReplicationV1.getCtrlReplicationTransferGroup(sequenceNumber, groupId,
                nodeId);

        Map<String, Object> response = CommandClassControllerReplicationV1.handleCtrlReplicationTransferGroup(testPayload);
        assertEquals(sequenceNumber, (Integer) response.get("SEQUENCE_NUMBER"));
        assertEquals(groupId, (Integer) response.get("GROUP_ID"));
        assertEquals(nodeId, (Integer) response.get("NODE_ID"));
    }

    /**
     * Performs an in/out test of the CTRL_REPLICATION_TRANSFER_GROUP_NAME command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param sequenceNumber {@link Integer}
     * @param groupId {@link Integer}
     * @param groupName {@link byte[]}
     */
    public static void testCtrlReplicationTransferGroupNameLoopback(Integer sequenceNumber, Integer groupId,
            byte[] groupName) {
        byte[] testPayload = CommandClassControllerReplicationV1.getCtrlReplicationTransferGroupName(sequenceNumber,
                groupId, groupName);

        Map<String, Object> response = CommandClassControllerReplicationV1.handleCtrlReplicationTransferGroupName(testPayload);
        assertEquals(sequenceNumber, (Integer) response.get("SEQUENCE_NUMBER"));
        assertEquals(groupId, (Integer) response.get("GROUP_ID"));
        assertEquals(groupName, (byte[]) response.get("GROUP_NAME"));
    }

    /**
     * Performs an in/out test of the CTRL_REPLICATION_TRANSFER_SCENE command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param sequenceNumber {@link Integer}
     * @param sceneId {@link Integer}
     * @param nodeId {@link Integer}
     * @param level {@link Integer}
     */
    public static void testCtrlReplicationTransferSceneLoopback(Integer sequenceNumber, Integer sceneId, Integer nodeId,
            Integer level) {
        byte[] testPayload = CommandClassControllerReplicationV1.getCtrlReplicationTransferScene(sequenceNumber, sceneId,
                nodeId, level);

        Map<String, Object> response = CommandClassControllerReplicationV1.handleCtrlReplicationTransferScene(testPayload);
        assertEquals(sequenceNumber, (Integer) response.get("SEQUENCE_NUMBER"));
        assertEquals(sceneId, (Integer) response.get("SCENE_ID"));
        assertEquals(nodeId, (Integer) response.get("NODE_ID"));
        assertEquals(level, (Integer) response.get("LEVEL"));
    }

    /**
     * Performs an in/out test of the CTRL_REPLICATION_TRANSFER_SCENE_NAME command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param sequenceNumber {@link Integer}
     * @param sceneId {@link Integer}
     * @param sceneName {@link byte[]}
     */
    public static void testCtrlReplicationTransferSceneNameLoopback(Integer sequenceNumber, Integer sceneId,
            byte[] sceneName) {
        byte[] testPayload = CommandClassControllerReplicationV1.getCtrlReplicationTransferSceneName(sequenceNumber,
                sceneId, sceneName);

        Map<String, Object> response = CommandClassControllerReplicationV1.handleCtrlReplicationTransferSceneName(testPayload);
        assertEquals(sequenceNumber, (Integer) response.get("SEQUENCE_NUMBER"));
        assertEquals(sceneId, (Integer) response.get("SCENE_ID"));
        assertEquals(sceneName, (byte[]) response.get("SCENE_NAME"));
    }

}