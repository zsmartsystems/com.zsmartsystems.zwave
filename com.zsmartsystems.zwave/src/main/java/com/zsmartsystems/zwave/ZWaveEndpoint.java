package com.zsmartsystems.zwave;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.zsmartsystems.zwave.commandclass.ZWaveCommandClass;
import com.zsmartsystems.zwave.commandclass.ZWaveCommandClassEnum;

/**
 * The {@link ZWaveEndpoint} class provides the main functionality for a node. An endpoint implements the functionality
 * required to communicate with a node - endpoint 0 is defined as the root endpoint, and a node may have multiple
 * endpoints.
 * 
 * @author Chris Jackson
 *
 */
public class ZWaveEndpoint {
    /**
     * The parent node for this endpoint
     */
    private final ZWaveNode node;

    /**
     * Defines the device class for this endpoint.
     */
    private final ZWaveDeviceClass deviceClass;

    /**
     * Defines the endpoint ID.
     */
    private final int endpointId;

    private final Set<ZWaveCommandClassEnum> secureCommandClasses = new HashSet<ZWaveCommandClassEnum>();
    private final Map<ZWaveCommandClassEnum, ZWaveCommandClass> supportedCommandClasses = new HashMap<ZWaveCommandClassEnum, ZWaveCommandClass>();

    ZWaveEndpoint(ZWaveNode node, int endpointId, ZWaveDeviceClass deviceClass) {
        this.node = node;
        this.endpointId = endpointId;
        this.deviceClass = deviceClass;
    }

    /**
     * Gets a commandClass object this endpoint implements. Returns null if this endpoint does not support this command
     * class.
     *
     * @param commandClass
     *            The command class to get.
     * @return the command class.
     */
    public ZWaveCommandClass getCommandClass(ZWaveCommandClassEnum commandClass) {
        return supportedCommandClasses.get(commandClass);
    }

    /**
     * Adds a command class to the list of supported command classes by this endpoint. Does nothing if command class is
     * already added.
     *
     * @param commandClass the command class instance to add.
     */
    public void addCommandClass(ZWaveCommandClass commandClass) {
        ZWaveCommandClassEnum key = commandClass.getCommandClass();

        if (!supportedCommandClasses.containsKey(key)) {
            supportedCommandClasses.put(key, commandClass);
        }
    }

    /**
     * Adds a secure command class to the list of supported command classes by this endpoint. Does nothing if command
     * class is already added.
     *
     * @param commandClass the command class instance to add.
     */
    public void addSecureCommandClass(ZWaveCommandClassEnum commandClass) {
        secureCommandClasses.add(commandClass);
    }

    /**
     * Checks if a commandClass is supported by this endpoint.
     *
     * @param commandClass
     *            The command class to test.
     * @return true if the command class is supported.
     */
    public boolean supportsCommandClass(ZWaveCommandClassEnum commandClass) {
        return supportedCommandClasses.containsKey(commandClass);
    }

    /**
     * Checks if a commandClass is supported in secure mode by this endpoint.
     *
     * @param commandClass
     *            The command class to test.
     * @return true if the command class is supported in secure mode.
     */
    public boolean supportsSecureCommandClass(ZWaveCommandClassEnum commandClass) {
        return secureCommandClasses.contains(commandClass);
    }

    /**
     * Removes a command class from the node.
     * This is used to remove classes that a node may report it supports
     * but it doesn't respond to.
     *
     * @param commandClass The command class key
     */
    public void removeCommandClass(ZWaveCommandClassEnum commandClass) {
        supportedCommandClasses.remove(commandClass);
    }

    /**
     * Returns the device class for this endpoint.
     *
     * @return the deviceClass
     */
    public ZWaveDeviceClass getDeviceClass() {
        return deviceClass;
    }

    public ZWaveNode getNode() {
        return node;
    }

    public int getNodeId() {
        return node.getNodeId();
    }

    public int getEndpointId() {
        return endpointId;
    }
}
