package com.zsmartsystems.zwave;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zsmartsystems.zwave.commandclass.ZWaveCommandClassEnum;
import com.zsmartsystems.zwave.commandclass.ZWaveSecurityCommandClass;

public class ZWaveNode {
    private static final Logger logger = LoggerFactory.getLogger(ZWaveNode.class);

    /**
     * The {@link ZWaveNetwork} that's the parent of this node
     */
    private final ZWaveNetwork network;

    /**
     * The ZWave node id - a value between 1 and 232
     */
    private final int nodeId;

    /**
     * Indicates if the device is a listening device. If this is true, then the device is always listening.
     */
    private boolean listening;

    /**
     * Indicates if the device is a frequently listening device. If this is true, then the device is often listening.
     */
    private boolean frequentlyListening;

    /**
     * Indicates if the device supports routing
     */
    private boolean routing;

    /**
     * Provides the maximum supported bitrate
     */
    @SuppressWarnings("unused")
    private int maxBaudRate;

    /**
     * Provides the manufacturer ID for this device. This contains the manufacturer reference, the device type and
     * device ID.
     */
    ZWaveManufacturerId manufacturerId;

    /**
     * Provides the list of command classes reported in the NIF (Node Information Frame)
     */
    private List<ZWaveCommandClassEnum> nodeInformationFrame = null;

    /**
     * Endpoints supported by this node
     */
    private final Map<Integer, ZWaveEndpoint> endpoints = new HashMap<Integer, ZWaveEndpoint>();

    /**
     * Neighbours of this node
     */
    private List<Integer> nodeNeighbors = new ArrayList<Integer>();

    /**
     * Stores the device serial number. This is only provided by new ZWave+ devices
     */
    private String deviceSerialId;

    /*
     * Stores the list of association groups
     */
    private final Map<Integer, ZWaveAssociationGroup> associationGroups = new HashMap<Integer, ZWaveAssociationGroup>();

    /**
     * A timer used for the device wakeup management
     */
    private Timer timer = null;

    /**
     * The wakeup timer task
     */
    private TimerTask timerTask = null;

    /**
     * Flag recalls if the device is currently awake or asleep
     */
    private boolean awake = false;

    /**
     * The period to wait before telling a sleeping node to sleep again
     */
    private int sleepDelay = 1000;

    /**
     * Constructor
     * 
     * @param network
     * @param nodeId
     */
    public ZWaveNode(ZWaveNetwork network, int nodeId) {
        this.network = network;
        this.nodeId = nodeId;
    }

    /**
     * Get the node ID
     * 
     * @return
     */
    public int getNodeId() {
        return nodeId;
    }

    /**
     * Adds an endpoint to the node
     * 
     * @param endpointNumber
     * @return
     */
    public ZWaveEndpoint addEndpoint(int endpointNumber) {
        if (endpoints.containsKey(endpointNumber)) {
            logger.debug("NODE {}: Endpoint {} already exists", nodeId, endpointNumber);
            return endpoints.get(endpointNumber);
        }
        ZWaveEndpoint endpoint = new ZWaveEndpoint(this, endpointNumber, null);
        endpoints.put(endpointNumber, endpoint);

        logger.debug("NODE {}: Endpoint {} added", nodeId, endpointNumber);

        return endpoint;
    }

    /**
     * Get an endpoint. If the requested endpoint is not supported then null is returned.
     * 
     * @param endpointId
     * @return
     */
    public ZWaveEndpoint getEndpoint(int endpointId) {
        return endpoints.get(endpointId);
    }

    /**
     * Gets whether the node is listening.
     *
     * @return boolean indicating whether the node is listening or not.
     */
    public boolean isListening() {
        return listening;
    }

    /**
     * Sets whether the node is listening.
     *
     * @param listening
     */
    public void setListening(boolean listening) {
        this.listening = listening;
    }

    /**
     * Gets whether the node is frequently listening.
     * Frequently listening is responding to a beam signal. Apart from
     * increased latency, nothing else is noticeable from the serial api
     * side.
     *
     * @return boolean indicating whether the node is frequently
     *         listening or not.
     */
    public boolean isFrequentlyListening() {
        return frequentlyListening;
    }

    /**
     * Sets whether the node is frequently listening.
     * Frequently listening is responding to a beam signal. Apart from
     * increased latency, nothing else is noticeable from the serial api
     * side.
     *
     * @param frequentlyListening indicating whether the node is frequently
     *            listening or not.
     */
    public void setFrequentlyListening(boolean frequentlyListening) {
        this.frequentlyListening = frequentlyListening;
    }

    /**
     * Gets whether the node is routing messages.
     *
     * @return the routing
     */
    public boolean isRouting() {
        return routing;
    }

    /**
     * Sets whether the node is routing messages.
     *
     * @param routing the routing to set
     */
    public void setRouting(boolean routing) {
        this.routing = routing;
    }

    /**
     * Sets the serial number for this device
     */
    public void setSerialNumber(String deviceSerialId) {
        this.deviceSerialId = deviceSerialId;
    }

    /**
     * Gets the serial number for the device
     * 
     * @return
     */
    public String getSerialNumber() {
        return deviceSerialId;
    }

    /**
     * Return a list with the nodes neighbors
     *
     * @return list of node IDs
     */
    public List<Integer> getNeighbors() {
        return nodeNeighbors;
    }

    /**
     * Clear the neighbor list
     */
    public void clearNeighbors() {
        nodeNeighbors.clear();
    }

    /**
     * Updates a nodes routing information
     * Generation of routes uses associations
     *
     * @param nodeId
     */
    public Set<Integer> getRoutingList() {
        logger.debug("NODE {}: Generate return routes list", nodeId);

        // Create a list of nodes this device is configured to talk to
        Set<Integer> routedNodes = new HashSet<Integer>();

        // Only update routes if this is a routing node
        if (isRouting() == false) {
            logger.debug("NODE {}: Node is not a routing node. No routes can be set.", nodeId);
            return Collections.emptySet();
        }

        // Get the number of association groups reported by this node
        int groups = associationGroups.size();
        if (groups != 0) {
            // Loop through each association group and add the node ID to the list
            for (int group = 1; group <= groups; group++) {
                if (associationGroups.get(group) == null) {
                    continue;
                }
                for (ZWaveAssociation associationNode : associationGroups.get(group).getAssociations()) {
                    routedNodes.add(associationNode.getNode());
                }
            }
        }

        // Add the wakeup destination node to the list for battery devices
        // ZWaveWakeUpCommandClass wakeupCmdClass = (ZWaveWakeUpCommandClass) getCommandClass(
        // ZWaveCommandClassEnum.COMMAND_CLASS_WAKE_UP);
        // if (wakeupCmdClass != null) {
        // Integer wakeupNodeId = wakeupCmdClass.getTargetNodeId();
        // routedNodes.add(wakeupNodeId);
        // }

        // Are there any nodes to which we need to set routes?
        if (routedNodes.size() == 0) {
            logger.debug("NODE {}: No return routes required.", nodeId);
            return Collections.emptySet();
        }

        return routedNodes;
    }

    /**
     * Add a node ID to the neighbor list
     *
     * @param nodeId the node to add
     */
    public void addNeighbor(Integer nodeId) {
        nodeNeighbors.add(nodeId);
    }

    /**
     * Sets the list of command classes reported in the NIF
     * 
     * @param nifClasses
     */
    public void setNifClasses(List<ZWaveCommandClassEnum> nifClasses) {
        synchronized (nodeInformationFrame) {
            nodeInformationFrame.clear();
            nodeInformationFrame.addAll(nifClasses);
        }
    }

    /**
     * Checks if the specified class should be securely encrypted for transmission
     * 
     * @param endpoint
     * @param payload
     * @return
     */
    public boolean doesMessageRequireSecurityEncapsulation(int endpoint, ZWaveCommandClassPayload payload) {
        // Does this node support security at all?
        if (endpoints.get(0).getCommandClass(ZWaveCommandClassEnum.COMMAND_CLASS_SECURITY) == null) {
            logger.debug("NODE {}: SECURITY not supported", nodeId);
            return false;
        }

        final ZWaveCommandClassEnum commandClass = ZWaveCommandClassEnum.getCommandClass(payload.getCommandClassId());

        if (ZWaveCommandClassEnum.COMMAND_CLASS_SECURITY == commandClass) {
            logger.debug("NODE {}: SECURITY check internal", nodeId);
            // CommandClass.SECURITY is a special case because only some commands get encrypted
            return ZWaveSecurityCommandClass.doesCommandRequireSecurityEncapsulation(payload.getCommandClassCommand());
        }

        // PING should not be encrypted
        if (commandClass == ZWaveCommandClassEnum.COMMAND_CLASS_NO_OPERATION) {
            logger.debug("NODE {}: SECURITY doesn't encrypt PING", nodeId);
            return false;
        }

        // Does this endpoint support this class secure
        if (endpoints.get(endpoint).supportsSecureCommandClass(commandClass)) {
            logger.debug("NODE {}: SECURITY required on {}", nodeId, commandClass);
            return true;
        }

        logger.debug("NODE {}: SECURITY NOT required on {}", nodeId, commandClass);
        return false;
    }

    /**
     * Sets the device as awake if the device is normally not listening.
     *
     * @param awake boolean true if the device is currently awake
     */
    public void setAwake(boolean awake) {
        // Don't do anything if this node is listening
        if (listening == true || frequentlyListening == true) {
            logger.debug("NODE {}: Node is listening - ignore wakeup", getNodeId());
            return;
        }

        // Create the timer if this is our first call
        if (timer == null) {
            logger.debug("NODE {}: Creating wakeup timer", getNodeId());
            timer = new Timer();
        }

        // We're awake
        this.awake = awake;

        // Start the timer
        if (awake == true) {
            logger.debug("NODE {}: Is awake with {} messages in the queue", getNodeId(),
                    network.getSendQueueLength(getNodeId()));

            setSleepTimer();

            // Notify application
            // ZWaveEvent event = new ZWaveNodeStatusEvent(getNodeId(), ZWaveNodeState.AWAKE);
            // network.notifyEventListeners(event);
        } else {
            resetSleepTimer();
        }
    }

    /**
     * Checks if the device is able to receive messages
     * If this device is always listening, then it will always return true, otherwise it will return true if the device
     * is awake.
     *
     * @return true if the node can receive a message
     */
    public boolean isAwake() {
        logger.debug("NODE {}: listening == {}, frequentlyListening == {}, awake == {}", getNodeId(), listening,
                frequentlyListening, awake);
        return (listening == true || frequentlyListening == true || awake == true);
    }

    /**
     * The following timer implements a re-triggerable timer. The timer is triggered when there are no more messages to
     * be sent in the wake-up queue. When the timer times out it will send the 'Go To Sleep' message to the node.
     * The timer just provides some time for anything further to be sent as a result of any processing.
     */
    private class WakeupTimerTask extends TimerTask {
        // Two cycles through the loop are required to send a device to sleep
        private boolean triggered;
        // private ZWaveWakeUpCommandClass wakeUpCommandClass;

        WakeupTimerTask() {
            logger.debug("NODE {}: Creating WakeupTimerTask", getNodeId());
            // wakeUpCommandClass = (ZWaveWakeUpCommandClass) getEndpoint(0)
            // .getCommandClass(ZWaveCommandClassEnum.COMMAND_CLASS_WAKE_UP);
            // if (wakeUpCommandClass == null) {
            // logger.debug("NODE {}: COMMAND_CLASS_WAKE_UP not found", getNodeId());
            // awake = true;
            // }

            logger.debug("NODE {}: Creating WakeupTimerTask", getNodeId());
            triggered = false;
        }

        @Override
        public void run() {
            if (isAwake() == false) {
                logger.debug("NODE {}: WakeupTimerTask Already asleep", getNodeId());
                return;
            }

            logger.debug("NODE {}: WakeupTimerTask {} Messages waiting", getNodeId(),
                    network.getSendQueueLength(getNodeId()));
            if (network.getSendQueueLength(getNodeId()) != 0) {
                triggered = false;
                return;
            }

            if (triggered == false) {
                logger.debug("NODE {}: WakeupTimerTask First iteration", getNodeId());
                triggered = true;
                return;
            }

            // Tell the device to go back to sleep.
            logger.debug("NODE {}: No more messages, go back to sleep", getNodeId());
            // ZWaveTransactionResponse response = sendTransaction(wakeUpCommandClass.getNoMoreInformationMessage(), 0);

            // When this transaction completes, assume we're asleep
            setAwake(false);

            // logger.debug("NODE {}: Went to sleep {}", getNodeId(), response.getState());

            // Stop the timer
            resetSleepTimer();
        }
    }

    private synchronized void setSleepTimer() {
        // Stop any existing timer
        resetSleepTimer();

        // Create the timer task
        timerTask = new WakeupTimerTask();

        // Start the timer
        timer.schedule(timerTask, sleepDelay / 2, sleepDelay / 2);
    }

    private synchronized void resetSleepTimer() {
        // Stop any existing timer
        if (timerTask != null) {
            timerTask.cancel();
        }
        timerTask = null;
    }

    public List<ZWaveCommandClassPayload> processCommand(ZWaveCommandClassPayload zWaveCommandClassPayload) {
        // TODO Auto-generated method stub
        return null;
    }

}
