package com.zsmartsystems.zwave;

/**
 * Definition of a ZWave event listener.
 * <p>
 * Event listeners are notified when an incoming ZWave message is received.
 * 
 * @author Chris Jackson
 *
 */
public interface ZWaveEventListener {
    /**
     * Event handler method for incoming Z-Wave events.
     *
     * @param event the incoming Z-Wave event.
     */
    void ZWaveIncomingEvent();
}
