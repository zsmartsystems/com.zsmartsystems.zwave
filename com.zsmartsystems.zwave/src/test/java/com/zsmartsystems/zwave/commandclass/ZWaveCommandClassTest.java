/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.mockito.ArgumentCaptor;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.zsmartsystems.zwave.ZWaveAssociationGroup;
import com.zsmartsystems.zwave.ZWaveCommandClassPayload;
import com.zsmartsystems.zwave.ZWaveDeviceClass;
import com.zsmartsystems.zwave.ZWaveDeviceClass.Basic;
import com.zsmartsystems.zwave.ZWaveDeviceClass.Generic;
import com.zsmartsystems.zwave.ZWaveDeviceClass.Specific;
import com.zsmartsystems.zwave.ZWaveEndpoint;
import com.zsmartsystems.zwave.ZWaveEvent;
import com.zsmartsystems.zwave.ZWaveNetwork;
import com.zsmartsystems.zwave.ZWaveNode;

/**
 * This class provides methods to allow test for standard command classes to be run simply.
 * It provides the mocked framework to allow command classes to be processed and receives the notification events.
 * Command classes pass in the packet data, and receive the command classes notification event(s) in return which should
 * then be checked for the correct output.
 *
 * @author Chris Jackson
 *
 */
public class ZWaveCommandClassTest {
    protected ArgumentCaptor<ZWaveEvent> argument;
    protected ZWaveNetwork mockedController;
    protected ZWaveNode mockedNode;
    protected ZWaveEndpoint mockedEndpoint;
    protected ArgumentCaptor<ZWaveCommandClass> commandClsCaptor;
    protected Map<Integer, ZWaveAssociationGroup> associationList;

    /**
     * Helper class to create everything we need to test a command class message from a byte array containing a serial
     * message.
     * <p>
     * We pass in the data, and the expected command class. This method creates the class, checks it's the right one,
     * processes the message and gets the response events.
     * <p>
     * It expects at least one response event.
     *
     * @param packetData byte array containing the full Z-Wave frame
     * @param version commandclass version
     * @return List of ZWaveEvent(s)
     */
    protected List<ZWaveEvent> processCommandClassSerialMessage(byte[] packetData, int version) {
        byte[] payload = Arrays.copyOfRange(packetData, 6, packetData.length - 1);
        return processCommandClassMessage(payload, version);
    }

    /**
     * Helper class to create everything we need to test a command class message.
     * <p>
     * We pass in the data, and the expected command class. This method creates the class, checks it's the right one,
     * processes the message and gets the response events.
     * <p>
     * It expects at least one response event.
     *
     * @param packetData byte array containing the payload data segment
     * @param version commandclass version
     * @return List of ZWaveEvent(s)
     */
    protected List<ZWaveEvent> processCommandClassMessage(byte[] packetData, int version) {
        try {
            ZWaveCommandClassPayload payload = new ZWaveCommandClassPayload(packetData);

            // Mock the controller so we can get any events
            mockedController = Mockito.mock(ZWaveNetwork.class);
            argument = ArgumentCaptor.forClass(ZWaveEvent.class);
            Mockito.doNothing().when(mockedController).notifyEventListeners(argument.capture());
            mockedNode = new ZWaveNode(mockedController, 0);
            ZWaveEndpoint mockedEndpoint0 = Mockito.mock(ZWaveEndpoint.class);
            ZWaveEndpoint mockedEndpoint1 = Mockito.mock(ZWaveEndpoint.class);
            ZWaveEndpoint mockedEndpoint2 = Mockito.mock(ZWaveEndpoint.class);
            ZWaveEndpoint mockedEndpoint3 = Mockito.mock(ZWaveEndpoint.class);

            // associationList = new HashMap<Integer, ZWaveAssociationGroup>();
            // for (int c = 1; c <= 10; c++) {
            // mockedNode.setAssociationGroup(new ZWaveAssociationGroup(c));
            // }

            Field endpointsField = ZWaveNode.class.getDeclaredField("endpoints");
            endpointsField.setAccessible(true);
            Map<Integer, ZWaveEndpoint> endpoints = (Map<Integer, ZWaveEndpoint>) endpointsField.get(mockedNode);
            endpoints.put(0, mockedEndpoint0);
            endpoints.put(1, mockedEndpoint1);
            endpoints.put(2, mockedEndpoint2);
            endpoints.put(3, mockedEndpoint3);

            Mockito.when(mockedEndpoint0.getEndpointId()).thenReturn(0);
            Mockito.when(mockedEndpoint1.getEndpointId()).thenReturn(1);
            Mockito.when(mockedEndpoint2.getEndpointId()).thenReturn(2);
            Mockito.when(mockedEndpoint3.getEndpointId()).thenReturn(3);

            // Mockito.when(mockedNode.getAssociationGroup(Matchers.any(Integer.class)))
            // .thenAnswer(new Answer<ZWaveAssociationGroup>() {
            // @Override
            // public ZWaveAssociationGroup answer(InvocationOnMock invocation) {
            // return associationList.get(invocation.getArguments()[0]);
            // }
            // });

            commandClsCaptor = ArgumentCaptor.forClass(ZWaveCommandClass.class);
            Mockito.doNothing().when(mockedEndpoint0).addCommandClass(commandClsCaptor.capture());
            Mockito.doNothing().when(mockedEndpoint1).addCommandClass(commandClsCaptor.capture());
            Mockito.doNothing().when(mockedEndpoint2).addCommandClass(commandClsCaptor.capture());
            Mockito.doNothing().when(mockedEndpoint3).addCommandClass(commandClsCaptor.capture());

            // Get the command class and process the response
            final ZWaveCommandClass cls = ZWaveCommandClass.getInstance(payload.getCommandClassId(), mockedEndpoint);
            assertNotNull(cls);
            // cls.setVersion(version);

            Mockito.when(mockedEndpoint0.getCommandClass(Matchers.any(ZWaveCommandClassEnum.class)))
                    .thenAnswer(new Answer<ZWaveCommandClass>() {
                        @Override
                        public ZWaveCommandClass answer(InvocationOnMock invocation) {
                            if (((ZWaveCommandClassEnum) invocation.getArguments()[0]).getKey() == cls.getCommandClass()
                                    .getKey()) {
                                return cls;
                            }
                            return ZWaveCommandClass.getInstance(
                                    ((ZWaveCommandClassEnum) invocation.getArguments()[0]).getKey(), mockedEndpoint);
                        }
                    });
            Mockito.when(mockedEndpoint1.getCommandClass(Matchers.any(ZWaveCommandClassEnum.class)))
                    .thenAnswer(new Answer<ZWaveCommandClass>() {
                        @Override
                        public ZWaveCommandClass answer(InvocationOnMock invocation) {
                            if (((ZWaveCommandClassEnum) invocation.getArguments()[0]).getKey() == cls.getCommandClass()
                                    .getKey()) {
                                return cls;
                            }
                            return ZWaveCommandClass.getInstance(
                                    ((ZWaveCommandClassEnum) invocation.getArguments()[0]).getKey(), mockedEndpoint);
                        }
                    });
            Mockito.when(mockedEndpoint2.getCommandClass(Matchers.any(ZWaveCommandClassEnum.class)))
                    .thenAnswer(new Answer<ZWaveCommandClass>() {
                        @Override
                        public ZWaveCommandClass answer(InvocationOnMock invocation) {
                            if (((ZWaveCommandClassEnum) invocation.getArguments()[0]).getKey() == cls.getCommandClass()
                                    .getKey()) {
                                return cls;
                            }
                            return ZWaveCommandClass.getInstance(
                                    ((ZWaveCommandClassEnum) invocation.getArguments()[0]).getKey(), mockedEndpoint);
                        }
                    });
            Mockito.when(mockedEndpoint3.getCommandClass(Matchers.any(ZWaveCommandClassEnum.class)))
                    .thenAnswer(new Answer<ZWaveCommandClass>() {
                        @Override
                        public ZWaveCommandClass answer(InvocationOnMock invocation) {
                            if (((ZWaveCommandClassEnum) invocation.getArguments()[0]).getKey() == cls.getCommandClass()
                                    .getKey()) {
                                return cls;
                            }
                            return ZWaveCommandClass.getInstance(
                                    ((ZWaveCommandClassEnum) invocation.getArguments()[0]).getKey(), mockedEndpoint);
                        }
                    });

            mockedNode.processCommand(payload);
        } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
            fail("Out of bounds exception processing data");
        }

        // Return all the notifications....
        return argument.getAllValues();
    }

    /**
     * Helper class to create everything we need to test a command class message.
     *
     * We pass in the data, and the expected command class. This method creates the class, checks it's the right one,
     * processes the message and gets the response events.
     *
     * It expects at least one response event.
     *
     * @param packetData byte array containing the full Z-Wave frame
     * @return List of ZWaveEvent(s)
     */
    protected List<ZWaveEvent> processCommandClassMessage(byte[] packetData) {
        return processCommandClassMessage(packetData, 1);
    }

    ZWaveCommandClass getCommandClass(ZWaveCommandClassEnum cls) {
        ZWaveDeviceClass deviceClass = new ZWaveDeviceClass(Basic.BASIC_TYPE_UNKNOWN, Generic.GENERIC_TYPE_NOT_USED,
                Specific.SPECIFIC_TYPE_NOT_USED);

        // Mock the controller so we can get any events
        mockedController = Mockito.mock(ZWaveNetwork.class);
        mockedNode = Mockito.mock(ZWaveNode.class);
        mockedEndpoint = Mockito.mock(ZWaveEndpoint.class);
        Mockito.when(mockedNode.getNodeId()).thenReturn(99);
        Mockito.when(mockedNode.getEndpoint(Matchers.anyInt())).thenReturn(mockedEndpoint);
        ZWaveDeviceClass endpointDeviceClass = new ZWaveDeviceClass(Basic.BASIC_TYPE_UNKNOWN,
                Generic.GENERIC_TYPE_NOT_USED, Specific.SPECIFIC_TYPE_NOT_USED);
        Mockito.when(mockedEndpoint.getDeviceClass()).thenReturn(endpointDeviceClass);

        commandClsCaptor = ArgumentCaptor.forClass(ZWaveCommandClass.class);
        Mockito.doNothing().when(mockedEndpoint).addCommandClass(commandClsCaptor.capture());

        // Get the command class and process the response
        ZWaveCommandClass cmdCls = ZWaveCommandClass.getInstance(cls.getKey(), mockedEndpoint);
        assertNotNull(cls);

        return cmdCls;
    }
}
