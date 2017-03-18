package com.zsmartsystems.zwave.commandclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zsmartsystems.zwave.ZWaveCommandClassPayload;
import com.zsmartsystems.zwave.ZWaveEndpoint;

/**
 * Base implementation of a ZWave command class.
 * <p>
 * The base class implements common methods associated with message handling to simplify the implementation of each
 * command class.
 * 
 * @author Chris Jackson
 *
 */
public abstract class ZWaveCommandClass {
    private static final Logger logger = LoggerFactory.getLogger(ZWaveCommandClass.class);

    protected ZWaveCommandClassEnum commandClass;

    /**
     * The parent endpoint
     */
    private ZWaveEndpoint endpoint;

    private Map<Integer, ZWaveResponseHandlerMethod> commands;

    private int version = 0;
    private int instances = 0;

    private class ZWaveResponseHandlerMethod {
        private int id;
        private String name;
        private Method method;

        ZWaveResponseHandlerMethod(int id, String name, Method method) {
            this.id = id;
            this.name = name;
            this.method = method;
        }
    };

    protected ZWaveCommandClass(ZWaveEndpoint endpoint, ZWaveCommandClassEnum commandClass) {
        // Create the map of response command handlers
        commands = new HashMap<Integer, ZWaveResponseHandlerMethod>();
        Method[] methods = getClass().getMethods();
        for (Method method : methods) {
            ZWaveResponseHandler handler = method.getAnnotation(ZWaveResponseHandler.class);
            if (handler != null) {
                ZWaveResponseHandlerMethod handlerMethod = new ZWaveResponseHandlerMethod(handler.id(), handler.name(),
                        method);
                commands.put(handler.id(), handlerMethod);
            }
        }

        this.endpoint = endpoint;
        this.commandClass = commandClass;

        logger.debug("NODE {}: Command class {}, endpoint {} created", endpoint.getNodeId(), commandClass.toString(),
                endpoint == null ? 0 : endpoint.getEndpointId());
    }

    /**
     * Gets the parent {@link ZWaveEndpoint} in which this class is implemented
     * 
     * @return the {@link ZWaveEndpoint} implementing this class
     */
    public ZWaveEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Returns the version of the command class.
     *
     * @return node
     */
    public int getVersion() {
        return version;
    }

    /**
     * Returns the command class enum that this class implements
     * 
     * @return {@link ZWaveCommandClassEnum}
     */
    public ZWaveCommandClassEnum getCommandClass() {
        return commandClass;
    };

    /**
     * Set options for this command class.
     * Options are provided from the device configuration database
     *
     * @param options class
     * @return true if options set ok
     */
    public boolean setOptions(Map<String, String> options) {
        return false;
    }

    /**
     * Returns the number of instances of this command class
     * in case the node supports the MULTI_INSTANCE command class (Version 1).
     *
     * @return the number of instances
     */
    public int getInstances() {
        return instances;
    }

    /**
     * Returns the number of instances of this command class
     * in case the node supports the MULTI_INSTANCE command class (Version 1).
     *
     * @param instances. The number of instances.
     */
    public void setInstances(int instances) {
        this.instances = instances;
    }

    /**
     * Handles an incoming application command request.
     *
     * @param serialMessage the incoming message to process.
     * @param offset the offset position from which to start message processing.
     * @param endpoint the endpoint or instance number this message is meant for.
     */
    public void handleApplicationCommandRequest(ZWaveCommandClassPayload payload) {

        if (commands == null) {
            logger.debug("NODE {}: Received {} V{} but class has no handlers.", endpoint.getNodeId(), commandClass,
                    getVersion());
        }

        ZWaveResponseHandlerMethod commandMethod = commands.get(payload.getCommandClassCommand());
        if (commandMethod == null) {
            // Check if there's a default handler
            commandMethod = commands.get(0);
            if (commandMethod == null) {
                logger.debug("NODE {}: Received {} V{} unknown command {}", endpoint.getNodeId(), commandClass,
                        getVersion(), payload.getCommandClassCommand());
                return;
            }
        }

        logger.debug("NODE {}: Received {} V{} {}", endpoint.getNodeId(), commandClass, getVersion(),
                commands.get(payload.getCommandClassCommand()).name);

        Object[] parms = { payload, endpoint };
        try {
            commands.get(payload.getCommandClassCommand()).method.invoke(this, parms);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * Converts a byte array to a hexadecimal string representation
     *
     * @param bb the byte array to convert
     * @return string the string representation
     */
    protected String bb2hex(byte[] bb) {
        if (bb == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < bb.length; i++) {
            result.append(String.format("%02X ", bb[i]));
        }
        return result.toString();
    }

    /**
     * Gets an instance of the right command class.
     * <p>
     * Returns null if the command class is not found.
     *
     * @param classId the code to instantiate
     * @param endpoint the {@link ZWaveEndpoint} this Command class belongs to
     * @return the ZWaveCommandClass instance that was instantiated, null otherwise
     */
    public static ZWaveCommandClass getInstance(int commandClassId, ZWaveEndpoint endpoint) {
        ZWaveCommandClassEnum commandClass = ZWaveCommandClassEnum.getCommandClass(commandClassId);
        if (commandClass == null) {
            logger.debug("NODE {}: Unknown command class ", endpoint.getNodeId(),
                    String.format("%02X", commandClassId));
            return null;
        }

        return getInstance(commandClass, endpoint);
    }

    /**
     * Gets an instance of the right command class.
     * <p>
     * Returns null if the command class is not found.
     *
     * @param commandClass the {@link ZWaveCommandClassEnum} to instantiate
     * @param endpoint the {@link ZWaveEndpoint} this Command class belongs to
     * @return the ZWaveCommandClass instance that was instantiated, null otherwise
     */
    public static ZWaveCommandClass getInstance(ZWaveCommandClassEnum commandClass, ZWaveEndpoint endpoint) {
        try {
            // ZWaveCommandClassEnum commandClass = ZWaveCommandClassEnum.getCommandClass(classId);
            // if (commandClass == null) {
            // logger.debug(String.format("NODE %d: Unknown command class 0x%02x", node.getNodeId(), classId));
            // return null;
            // }
            Class<? extends ZWaveCommandClass> commandClassClass = commandClass.getCommandClassClass();

            if (commandClassClass == null) {
                logger.debug("NODE {}: Unsupported command class {}", endpoint.getNodeId(), commandClass.toString(),
                        commandClass);
                return null;
            }
            logger.debug("NODE {}: Creating new instance of command class {}", endpoint.getNodeId(),
                    commandClass.toString());

            Constructor<? extends ZWaveCommandClass> constructor = commandClassClass
                    .getConstructor(ZWaveEndpoint.class);
            return constructor.newInstance(new Object[] { endpoint });
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            logger.debug("NODE {}: Error instantiating command class {}", endpoint.getNodeId(), commandClass);
            e.printStackTrace();
            return null;
        }
    }

}
