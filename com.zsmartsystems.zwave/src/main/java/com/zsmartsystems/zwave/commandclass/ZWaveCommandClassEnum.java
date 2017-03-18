package com.zsmartsystems.zwave.commandclass;

import java.util.HashMap;
import java.util.Map;

/**
 * Command class enumeration - Lists all command classes and provides a link to the implementation.
 *
 * @author Chris Jackson
 */
public enum ZWaveCommandClassEnum {
    COMMAND_CLASS_NO_OPERATION(0x00, null),
    COMMAND_CLASS_BASIC(0x20, null),
    COMMAND_CLASS_CONTROLLER_REPLICATION(0x21, null),
    COMMAND_CLASS_APPLICATION_STATUS(0x22, null),
    COMMAND_CLASS_ZIP(0x23, null),
    COMMAND_CLASS_SECURITY_PANEL_MODE(0x24, null),
    COMMAND_CLASS_SWITCH_BINARY(0x25, null),
    COMMAND_CLASS_SWITCH_MULTILEVEL(0x26, null),
    COMMAND_CLASS_SWITCH_ALL(0x27, null),
    COMMAND_CLASS_SWITCH_TOGGLE_BINARY(0x28, null),
    COMMAND_CLASS_SWITCH_TOGGLE_MULTILEVEL(0x29, null),
    COMMAND_CLASS_CHIMNEY_FAN(0x2A, null),
    COMMAND_CLASS_SCENE_ACTIVATION(0x2B, null),
    COMMAND_CLASS_SCENE_ACTUATOR_CONF(0x2C, null),
    COMMAND_CLASS_SCENE_CONTROLLER_CONF(0x2D, null),
    COMMAND_CLASS_SECURITY_PANEL_ZONE(0x2E, null),
    COMMAND_CLASS_SECURITY_PANEL_ZONE_SENSOR(0x2F, null),
    COMMAND_CLASS_SENSOR_BINARY(0x30, null),
    COMMAND_CLASS_SENSOR_MULTILEVEL(0x31, null),
    COMMAND_CLASS_METER(0x32, null),
    COMMAND_CLASS_SWITCH_COLOR(0x33, null),
    COMMAND_CLASS_NETWORK_MANAGEMENT_INCLUSION(0x34, null),
    COMMAND_CLASS_METER_PULSE(0x35, null),
    COMMAND_CLASS_BASIC_TARIFF_INFO(0x36, null),
    COMMAND_CLASS_HRV_STATUS(0x37, null),
    COMMAND_CLASS_HRV_CONTROL(0x39, null),
    COMMAND_CLASS_DCP_CONFIG(0x3A, null),
    COMMAND_CLASS_DCP_MONITOR(0x3B, null),
    COMMAND_CLASS_METER_TBL_CONFIG(0x3C, null),
    COMMAND_CLASS_METER_TBL_MONITOR(0x3D, null),
    COMMAND_CLASS_METER_TBL_PUSH(0x3E, null),
    COMMAND_CLASS_THERMOSTAT_HEATING(0x38, null),
    COMMAND_CLASS_PREPAYMENT(0x3F, null),
    COMMAND_CLASS_THERMOSTAT_MODE(0x40, null),
    COMMAND_CLASS_PREPAYMENT_ENCAPSULATION(0x41, null),
    COMMAND_CLASS_THERMOSTAT_OPERATING_STATE(0x42, null),
    COMMAND_CLASS_THERMOSTAT_SETPOINT(0x43, null),
    COMMAND_CLASS_THERMOSTAT_FAN_MODE(0x44, null),
    COMMAND_CLASS_THERMOSTAT_FAN_STATE(0x45, null),
    COMMAND_CLASS_CLIMATE_CONTROL_SCHEDULE(0x46, null),
    COMMAND_CLASS_THERMOSTAT_SETBACK(0x47, null),
    COMMAND_CLASS_RATE_TBL_CONFIG(0x48, null),
    COMMAND_CLASS_RATE_TBL_MONITOR(0x49, null),
    COMMAND_CLASS_TARIFF_CONFIG(0x4A, null),
    COMMAND_CLASS_TARIFF_TBL_MONITOR(0x4B, null),
    COMMAND_CLASS_DOOR_LOCK_LOGGING(0x4C, null),
    COMMAND_CLASS_NETWORK_MANAGEMENT_BASIC(0x4D, null),
    COMMAND_CLASS_SCHEDULE_ENTRY_LOCK(0x4E, null),
    COMMAND_CLASS_ZIP_6LOWPAN(0x4F, null),
    COMMAND_CLASS_BASIC_WINDOW_COVERING(0x50, null),
    COMMAND_CLASS_MTP_WINDOW_COVERING(0x51, null),
    COMMAND_CLASS_NETWORK_MANAGEMENT_PROXY(0x52, null),
    COMMAND_CLASS_SCHEDULE(0x53, null),
    COMMAND_CLASS_NETWORK_MANAGEMENT_PRIMARY(0x54, null),
    COMMAND_CLASS_TRANSPORT_SERVICE(0x55, null),
    COMMAND_CLASS_CRC_16_ENCAP(0x56, null),
    COMMAND_CLASS_APPLICATION_CAPABILITY(0x57, null),
    COMMAND_CLASS_ZIP_ND(0x58, null),
    COMMAND_CLASS_ASSOCIATION_GRP_INFO(0x59, null),
    COMMAND_CLASS_DEVICE_RESET_LOCALLY(0x5A, null),
    COMMAND_CLASS_CENTRAL_SCENE(0x5B, null),
    COMMAND_CLASS_IP_ASSOCIATION(0x5C, null),
    COMMAND_CLASS_ANTITHEFT(0x5D, null),
    COMMAND_CLASS_ZWAVEPLUS_INFO(0x5E, null),
    COMMAND_CLASS_ZIP_GATEWAY(0x5F, null),
    COMMAND_CLASS_MULTI_CHANNEL(0x60, null),
    COMMAND_CLASS_ZIP_PORTAL(0x61, null),
    COMMAND_CLASS_DOOR_LOCK(0x62, null),
    COMMAND_CLASS_USER_CODE(0x63, null),
    COMMAND_CLASS_HUMIDITY_CONTROL_SETPOINT(0x64, null),
    COMMAND_CLASS_DMX(0x65, null),
    COMMAND_CLASS_BARRIER_OPERATOR(0x66, null),
    COMMAND_CLASS_NETWORK_MANAGEMENT_INSTALLATION_MAINTENANCE(0x67, null),
    COMMAND_CLASS_ZIP_NAMING(0x68, null),
    COMMAND_CLASS_MAILBOX(0x69, null),
    COMMAND_CLASS_WINDOW_COVERING(0x6A, null),
    COMMAND_CLASS_IRRIGATION(0x6B, null),
    COMMAND_CLASS_SUPERVISION(0x6C, null),
    COMMAND_CLASS_HUMIDITY_CONTROL_MODE(0x6D, null),
    COMMAND_CLASS_HUMIDITY_CONTROL_OPERATING_STATE(0x6E, null),
    COMMAND_CLASS_ENTRY_CONTROL(0x6F, null),
    COMMAND_CLASS_CONFIGURATION(0x70, null),
    COMMAND_CLASS_ALARM(0x71, null),
    COMMAND_CLASS_MANUFACTURER_SPECIFIC(0x72, null),
    COMMAND_CLASS_POWERLEVEL(0x73, null),
    COMMAND_CLASS_INCLUSION_CONTROLLER(0x74, null),
    COMMAND_CLASS_PROTECTION(0x75, null),
    COMMAND_CLASS_LOCK(0x76, null),
    COMMAND_CLASS_NODE_NAMING(0x77, null),
    COMMAND_CLASS_FIRMWARE_UPDATE_MD(0x7A, null),
    COMMAND_CLASS_GROUPING_NAME(0x7B, null),
    COMMAND_CLASS_REMOTE_ASSOCIATION_ACTIVATE(0x7C, null),
    COMMAND_CLASS_REMOTE_ASSOCIATION(0x7D, null),
    COMMAND_CLASS_BATTERY(0x80, null),
    COMMAND_CLASS_CLOCK(0x81, null),
    COMMAND_CLASS_HAIL(0x82, null),
    COMMAND_CLASS_WAKE_UP(0x84, null),
    COMMAND_CLASS_ASSOCIATION(0x85, null),
    COMMAND_CLASS_VERSION(0x86, null),
    COMMAND_CLASS_INDICATOR(0x87, null),
    COMMAND_CLASS_PROPRIETARY(0x88, null),
    COMMAND_CLASS_LANGUAGE(0x89, null),
    COMMAND_CLASS_TIME(0x8A, null),
    COMMAND_CLASS_TIME_PARAMETERS(0x8B, null),
    COMMAND_CLASS_GEOGRAPHIC_LOCATION(0x8C, null),
    COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION(0x8E, null),
    COMMAND_CLASS_MULTI_CMD(0x8F, null),
    COMMAND_CLASS_ENERGY_PRODUCTION(0x90, null),
    // Note that MANUFACTURER_PROPRIETARY shouldn't be instantiated directly
    // The getInstance method will catch this and translate to the correct
    // class for the device.
    COMMAND_CLASS_MANUFACTURER_PROPRIETARY(0x91, null),
    COMMAND_CLASS_SCREEN_MD(0x92, null),
    COMMAND_CLASS_SCREEN_ATTRIBUTES(0x93, null),
    COMMAND_CLASS_SIMPLE_AV_CONTROL(0x94, null),
    COMMAND_CLASS_AV_CONTENT_DIRECTORY_MD(0x95, null),
    COMMAND_CLASS_AV_RENDERER_STATUS(0x96, null),
    COMMAND_CLASS_AV_CONTENT_SEARCH_MD(0x97, null),
    COMMAND_CLASS_SECURITY(0x98, null),
    COMMAND_CLASS_AV_TAGGING_MD(0x99, null),
    COMMAND_CLASS_IP_CONFIGURATION(0x9A, null),
    COMMAND_CLASS_ASSOCIATION_COMMAND_CONFIGURATION(0x9B, null),
    COMMAND_CLASS_SENSOR_ALARM(0x9C, null),
    COMMAND_CLASS_SILENCE_ALARM(0x9D, null),
    COMMAND_CLASS_SENSOR_CONFIGURATION(0x9E, null),
    COMMAND_CLASS_SECURITY_2(0x9F, null),
    COMMAND_CLASS_MARK(0xEF, null),
    COMMAND_CLASS_NON_INTEROPERABLE(0xF0, null);

    // MANUFACTURER_PROPRIETARY class definitions are defined by the manufacturer and device id

    /**
     * A mapping between the integer code and its corresponding
     * Command class to facilitate lookup by code.
     */
    private static Map<Integer, ZWaveCommandClassEnum> codeToCommandClassMapping;

    /**
     * A mapping between the string label and its corresponding
     * Command class to facilitate lookup by label.
     */
    private static Map<String, ZWaveCommandClassEnum> labelToCommandClassMapping;

    private int key;
    private Class<? extends ZWaveCommandClass> commandClassClass;

    private ZWaveCommandClassEnum(int key, Class<? extends ZWaveCommandClass> commandClassClass) {
        this.key = key;
        this.commandClassClass = commandClassClass;
    }

    private static void initMapping() {
        codeToCommandClassMapping = new HashMap<Integer, ZWaveCommandClassEnum>();
        labelToCommandClassMapping = new HashMap<String, ZWaveCommandClassEnum>();
        for (ZWaveCommandClassEnum s : values()) {
            codeToCommandClassMapping.put(s.key, s);
            labelToCommandClassMapping.put(s.name(), s);
        }
    }

    /**
     * Lookup function based on the command class code.
     * Returns null if there is no command class with code i
     *
     * @param id the code to lookup
     * @return enumeration value of the command class or null if command class is not known
     */
    public static ZWaveCommandClassEnum getCommandClass(int id) {
        if (codeToCommandClassMapping == null) {
            initMapping();
        }

        return codeToCommandClassMapping.get(id);
    }

    /**
     * Lookup function based on the command class label.
     * Returns null if there is no command class with that label.
     *
     * @param label the label to lookup
     * @return enumeration value of the command class.
     */
    public static ZWaveCommandClassEnum getCommandClass(String label) {
        if (labelToCommandClassMapping == null) {
            initMapping();
        }

        return labelToCommandClassMapping.get(label.toUpperCase());
    }

    /**
     * @return the key - ie the ZWave Command class reference ID
     */
    public int getKey() {
        return key;
    }

    /**
     * @return the command class Class
     */
    public Class<? extends ZWaveCommandClass> getCommandClassClass() {
        return commandClassClass;
    }

}
