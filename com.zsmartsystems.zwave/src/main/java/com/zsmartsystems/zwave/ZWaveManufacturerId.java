package com.zsmartsystems.zwave;

/**
 * Provides the ZWave Manufacturer ID for a device. This is a pair of 16 bit values providing a device type and device
 * ID.
 * 
 * @author Chris Jackson
 *
 */
public class ZWaveManufacturerId {
    private final int manufacturerId;
    private final int deviceType;
    private final int deviceId;

    ZWaveManufacturerId(int manufacturerId, int deviceId, int deviceType) {
        this.manufacturerId = manufacturerId;
        this.deviceId = deviceId;
        this.deviceType = deviceType;
    }

    /**
     * Gets the 16 bit manufacturer ID
     * 
     * @return the device id
     */
    public int getManufacturerId() {
        return manufacturerId;
    }

    /**
     * Gets the 16 bit device ID
     * 
     * @return the device id
     */
    public int getDeviceId() {
        return deviceId;
    }

    /**
     * Gets the 16 bit device type
     * 
     * @return the device type
     */
    public int getDeviceType() {
        return deviceType;
    }

    @Override
    public String toString() {
        return "ZWaveManufacturerId [deviceId=" + deviceId + ", deviceType=" + deviceType + "]";
    }

}
