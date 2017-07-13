# Z-Wave Consolidated Command Class Report

This file provides a summary of the Z-Wave command class version, summarising the commands, parameters
and constants. The applicable versions of the command class for command/parameter/constant is provided. 

The report consolidates versions based on parameter names. This may not be 100% correct, and does not
mean that the same parameter in different command class versions is exactly the same. It may have a
different size or mask for example.  If you find error, please report them.

| Command Class | Command | Parameter | Constant| Version |
|---------------|---------|-----------|---------|---------|
| [00] COMMAND_CLASS_NO_OPERATION |  |  |  | 1 |
| [01] ZWAVE_CMD_CLASS |  |  |  | 1 |
|  | [00] ZWAVE_CMD_NOP |  |  | 1 |
|  | [01] NODE_INFO |  |  | 1 |
|  |  | Protocol Version |  | 1 |
|  |  |  | [01] Z_WAVE_VERSION_2_0 | 1 |
|  |  |  | [02] Z_WAVE_VERSION_ZDK_5_0X_ZDK_4_2X | 1 |
|  |  |  | [03] Z_WAVE_VERSION_ZDK_4_5X_AND_ZDK_6_0X | 1 |
|  |  | Max baud rate |  | 1 |
|  |  |  | [01] 9_6_KBPS | 1 |
|  |  |  | [02] 40_KBPS | 1 |
|  |  | Routing |  | 1 |
|  |  | Listening |  | 1 |
|  |  | Security |  | 1 |
|  |  | Controller |  | 1 |
|  |  | Specific Device |  | 1 |
|  |  | Routing Slave |  | 1 |
|  |  | Beam capability |  | 1 |
|  |  | Sensor 250ms |  | 1 |
|  |  | Sensor 1000ms |  | 1 |
|  |  | Optional Functionality |  | 1 |
|  |  | Speed Extension |  | 1 |
|  |  |  | [01] 100_KBPS | 1 |
|  |  |  | [02] 200_KBPS | 1 |
|  |  | Basic Device Class |  | 1 |
|  |  |  | [01] BASIC_TYPE_CONTROLLER | 1 |
|  |  |  | [02] BASIC_TYPE_STATIC_CONTROLLER | 1 |
|  |  |  | [03] BASIC_TYPE_SLAVE | 1 |
|  |  |  | [04] BASIC_TYPE_ROUTING_SLAVE | 1 |
|  |  | Generic Device Class |  | 1 |
|  |  |  | [01] GENERIC_TYPE_GENERIC_CONTROLLER | 1 |
|  |  |  | [02] GENERIC_TYPE_STATIC_CONTROLLER | 1 |
|  |  |  | [03] GENERIC_TYPE_AV_CONTROL_POINT | 1 |
|  |  |  | [04] GENERIC_TYPE_DISPLAY | 1 |
|  |  |  | [05] GENERIC_TYPE_NETWORK_EXTENDER | 1 |
|  |  |  | [06] GENERIC_TYPE_APPLIANCE | 1 |
|  |  |  | [07] GENERIC_TYPE_SENSOR_NOTIFICATION | 1 |
|  |  |  | [08] GENERIC_TYPE_THERMOSTAT | 1 |
|  |  |  | [09] GENERIC_TYPE_WINDOW_COVERING | 1 |
|  |  |  | [0F] GENERIC_TYPE_REPEATER_SLAVE | 1 |
|  |  |  | [10] GENERIC_TYPE_SWITCH_BINARY | 1 |
|  |  |  | [11] GENERIC_TYPE_SWITCH_MULTILEVEL | 1 |
|  |  |  | [12] GENERIC_TYPE_SWITCH_REMOTE | 1 |
|  |  |  | [13] GENERIC_TYPE_SWITCH_TOGGLE | 1 |
|  |  |  | [15] GENERIC_TYPE_ZIP_NODE | 1 |
|  |  |  | [16] GENERIC_TYPE_VENTILATION | 1 |
|  |  |  | [17] GENERIC_TYPE_SECURITY_PANEL | 1 |
|  |  |  | [18] GENERIC_TYPE_WALL_CONTROLLER | 1 |
|  |  |  | [20] GENERIC_TYPE_SENSOR_BINARY | 1 |
|  |  |  | [21] GENERIC_TYPE_SENSOR_MULTILEVEL | 1 |
|  |  |  | [30] GENERIC_TYPE_METER_PULSE | 1 |
|  |  |  | [31] GENERIC_TYPE_METER | 1 |
|  |  |  | [40] GENERIC_TYPE_ENTRY_CONTROL | 1 |
|  |  |  | [50] GENERIC_TYPE_SEMI_INTEROPERABLE | 1 |
|  |  |  | [A1] GENERIC_TYPE_SENSOR_ALARM | 1 |
|  |  |  | [FF] GENERIC_TYPE_NON_INTEROPERABLE | 1 |
|  |  | Specific Device Class |  | 1 |
|  |  |  | [0000] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [0200] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [0201] SPECIFIC_TYPE_PORTABLE_REMOTE_CONTROLLER | 1 |
|  |  |  | [0202] SPECIFIC_TYPE_PORTABLE_SCENE_CONTROLLER | 1 |
|  |  |  | [0203] SPECIFIC_TYPE_PORTABLE_INSTALLER_TOOL | 1 |
|  |  |  | [0204] SPECIFIC_TYPE_REMOTE_CONTROL_AV | 1 |
|  |  |  | [0206] SPECIFIC_TYPE_REMOTE_CONTROL_SIMPLE | 1 |
|  |  |  | [0300] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [0301] SPECIFIC_TYPE_PC_CONTROLLER | 1 |
|  |  |  | [0302] SPECIFIC_TYPE_SCENE_CONTROLLER | 1 |
|  |  |  | [0303] SPECIFIC_TYPE_STATIC_INSTALLER_TOOL | 1 |
|  |  |  | [0304] SPECIFIC_TYPE_SET_TOP_BOX | 1 |
|  |  |  | [0305] SPECIFIC_TYPE_SUB_SYSTEM_CONTROLLER | 1 |
|  |  |  | [0306] SPECIFIC_TYPE_TV | 1 |
|  |  |  | [0307] SPECIFIC_TYPE_GATEWAY | 1 |
|  |  |  | [0400] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [0404] SPECIFIC_TYPE_SATELLITE_RECEIVER | 1 |
|  |  |  | [0411] SPECIFIC_TYPE_SATELLITE_RECEIVER_V2 | 1 |
|  |  |  | [0412] SPECIFIC_TYPE_DOORBELL | 1 |
|  |  |  | [0500] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [0501] SPECIFIC_TYPE_SIMPLE_DISPLAY | 1 |
|  |  |  | [0600] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [0601] SPECIFIC_TYPE_SECURE_EXTENDER | 1 |
|  |  |  | [0700] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [0701] SPECIFIC_TYPE_GENERAL_APPLIANCE | 1 |
|  |  |  | [0702] SPECIFIC_TYPE_KITCHEN_APPLIANCE | 1 |
|  |  |  | [0703] SPECIFIC_TYPE_LAUNDRY_APPLIANCE | 1 |
|  |  |  | [0800] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [0801] SPECIFIC_TYPE_NOTIFICATION_SENSOR | 1 |
|  |  |  | [0900] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [0901] SPECIFIC_TYPE_THERMOSTAT_HEATING | 1 |
|  |  |  | [0902] SPECIFIC_TYPE_THERMOSTAT_GENERAL | 1 |
|  |  |  | [0903] SPECIFIC_TYPE_SETBACK_SCHEDULE_THERMOSTAT | 1 |
|  |  |  | [0904] SPECIFIC_TYPE_SETPOINT_THERMOSTAT | 1 |
|  |  |  | [0905] SPECIFIC_TYPE_SETBACK_THERMOSTAT | 1 |
|  |  |  | [0906] SPECIFIC_TYPE_THERMOSTAT_GENERAL_V2 | 1 |
|  |  |  | [0A00] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [0A01] SPECIFIC_TYPE_SIMPLE_WINDOW_COVERING | 1 |
|  |  |  | [1000] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [1001] SPECIFIC_TYPE_REPEATER_SLAVE | 1 |
|  |  |  | [1002] SPECIFIC_TYPE_VIRTUAL_NODE | 1 |
|  |  |  | [1100] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [1101] SPECIFIC_TYPE_POWER_SWITCH_BINARY | 1 |
|  |  |  | [1102] SPECIFIC_TYPE_COLOR_TUNABLE_BINARY | 1 |
|  |  |  | [1103] SPECIFIC_TYPE_SCENE_SWITCH_BINARY | 1 |
|  |  |  | [1104] SPECIFIC_TYPE_POWER_STRIP | 1 |
|  |  |  | [1105] SPECIFIC_TYPE_SIREN | 1 |
|  |  |  | [1106] SPECIFIC_TYPE_VALVE_OPEN_CLOSE | 1 |
|  |  |  | [1107] SPECIFIC_TYPE_IRRIGATION_CONTROLLER | 1 |
|  |  |  | [1200] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [1201] SPECIFIC_TYPE_POWER_SWITCH_MULTILEVEL | 1 |
|  |  |  | [1202] SPECIFIC_TYPE_COLOR_TUNABLE_MULTILEVEL | 1 |
|  |  |  | [1203] SPECIFIC_TYPE_MOTOR_MULTIPOSITION | 1 |
|  |  |  | [1204] SPECIFIC_TYPE_SCENE_SWITCH_MULTILEVEL | 1 |
|  |  |  | [1205] SPECIFIC_TYPE_CLASS_A_MOTOR_CONTROL | 1 |
|  |  |  | [1206] SPECIFIC_TYPE_CLASS_B_MOTOR_CONTROL | 1 |
|  |  |  | [1207] SPECIFIC_TYPE_CLASS_C_MOTOR_CONTROL | 1 |
|  |  |  | [1208] SPECIFIC_TYPE_FAN_SWITCH | 1 |
|  |  |  | [1300] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [1301] SPECIFIC_TYPE_SWITCH_REMOTE_BINARY | 1 |
|  |  |  | [1302] SPECIFIC_TYPE_SWITCH_REMOTE_MULTILEVEL | 1 |
|  |  |  | [1303] SPECIFIC_TYPE_SWITCH_REMOTE_TOGGLE_BINARY | 1 |
|  |  |  | [1304] SPECIFIC_TYPE_SWITCH_REMOTE_TOGGLE_MULTILEVEL | 1 |
|  |  |  | [1400] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [1401] SPECIFIC_TYPE_SWITCH_TOGGLE_BINARY | 1 |
|  |  |  | [1402] SPECIFIC_TYPE_SWITCH_TOGGLE_MULTILEVEL | 1 |
|  |  |  | [1600] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [1601] SPECIFIC_TYPE_ZIP_TUN_NODE | 1 |
|  |  |  | [1602] SPECIFIC_TYPE_ZIP_ADV_NODE | 1 |
|  |  |  | [1700] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [1701] SPECIFIC_TYPE_RESIDENTIAL_HRV | 1 |
|  |  |  | [1800] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [1801] SPECIFIC_TYPE_ZONED_SECURITY_PANEL | 1 |
|  |  |  | [1900] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [1901] SPECIFIC_TYPE_BASIC_WALL_CONTROLLER | 1 |
|  |  |  | [2100] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [2101] SPECIFIC_TYPE_ROUTING_SENSOR_BINARY | 1 |
|  |  |  | [2200] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [2201] SPECIFIC_TYPE_ROUTING_SENSOR_MULTILEVEL | 1 |
|  |  |  | [2202] SPECIFIC_TYPE_CHIMNEY_FAN | 1 |
|  |  |  | [3100] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [3200] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [3201] SPECIFIC_TYPE_SIMPLE_METER | 1 |
|  |  |  | [3202] SPECIFIC_TYPE_ADV_ENERGY_CONTROL | 1 |
|  |  |  | [3203] SPECIFIC_TYPE_WHOLE_HOME_METER_SIMPLE | 1 |
|  |  |  | [4100] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [4101] SPECIFIC_TYPE_DOOR_LOCK | 1 |
|  |  |  | [4102] SPECIFIC_TYPE_ADVANCED_DOOR_LOCK | 1 |
|  |  |  | [4103] SPECIFIC_TYPE_SECURE_KEYPAD_DOOR_LOCK | 1 |
|  |  |  | [4104] SPECIFIC_TYPE_SECURE_KEYPAD_DOOR_LOCK_DEADBOLT | 1 |
|  |  |  | [4105] SPECIFIC_TYPE_SECURE_DOOR | 1 |
|  |  |  | [4106] SPECIFIC_TYPE_SECURE_GATE | 1 |
|  |  |  | [4107] SPECIFIC_TYPE_SECURE_BARRIER_ADDON | 1 |
|  |  |  | [4108] SPECIFIC_TYPE_SECURE_BARRIER_OPEN_ONLY | 1 |
|  |  |  | [4109] SPECIFIC_TYPE_SECURE_BARRIER_CLOSE_ONLY | 1 |
|  |  |  | [410A] SPECIFIC_TYPE_SECURE_LOCKBOX | 1 |
|  |  |  | [410B] SPECIFIC_TYPE_SECURE_KEYPAD | 1 |
|  |  |  | [5100] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [5101] SPECIFIC_TYPE_ENERGY_PRODUCTION | 1 |
|  |  |  | [A200] SPECIFIC_TYPE_NOT_USED | 1 |
|  |  |  | [A201] SPECIFIC_TYPE_BASIC_ROUTING_ALARM_SENSOR | 1 |
|  |  |  | [A202] SPECIFIC_TYPE_ROUTING_ALARM_SENSOR | 1 |
|  |  |  | [A203] SPECIFIC_TYPE_BASIC_ZENSOR_NET_ALARM_SENSOR | 1 |
|  |  |  | [A204] SPECIFIC_TYPE_ZENSOR_NET_ALARM_SENSOR | 1 |
|  |  |  | [A205] SPECIFIC_TYPE_ADV_ZENSOR_NET_ALARM_SENSOR | 1 |
|  |  |  | [A206] SPECIFIC_TYPE_BASIC_ROUTING_SMOKE_SENSOR | 1 |
|  |  |  | [A207] SPECIFIC_TYPE_ROUTING_SMOKE_SENSOR | 1 |
|  |  |  | [A208] SPECIFIC_TYPE_BASIC_ZENSOR_NET_SMOKE_SENSOR | 1 |
|  |  |  | [A209] SPECIFIC_TYPE_ZENSOR_NET_SMOKE_SENSOR | 1 |
|  |  |  | [A20A] SPECIFIC_TYPE_ADV_ZENSOR_NET_SMOKE_SENSOR | 1 |
|  |  |  | [A20B] SPECIFIC_TYPE_ALARM_SENSOR | 1 |
|  |  | Command Classes |  | 1 |
|  |  |  | [00] COMMAND_CLASS_NO_OPERATION | 1 |
|  |  |  | [01] ZWAVE_CMD_CLASS | 1 |
|  |  |  | [02] COMMAND_CLASS_ZENSOR_NET | 1 |
|  |  |  | [20] COMMAND_CLASS_BASIC | 1 |
|  |  |  | [21] COMMAND_CLASS_CONTROLLER_REPLICATION | 1 |
|  |  |  | [22] COMMAND_CLASS_APPLICATION_STATUS | 1 |
|  |  |  | [23] COMMAND_CLASS_ZIP | 1 |
|  |  |  | [24] COMMAND_CLASS_SECURITY_PANEL_MODE | 1 |
|  |  |  | [25] COMMAND_CLASS_SWITCH_BINARY | 1 |
|  |  |  | [26] COMMAND_CLASS_SWITCH_MULTILEVEL | 1 |
|  |  |  | [27] COMMAND_CLASS_SWITCH_ALL | 1 |
|  |  |  | [28] COMMAND_CLASS_SWITCH_TOGGLE_BINARY | 1 |
|  |  |  | [29] COMMAND_CLASS_SWITCH_TOGGLE_MULTILEVEL | 1 |
|  |  |  | [2A] COMMAND_CLASS_CHIMNEY_FAN | 1 |
|  |  |  | [2B] COMMAND_CLASS_SCENE_ACTIVATION | 1 |
|  |  |  | [2C] COMMAND_CLASS_SCENE_ACTUATOR_CONF | 1 |
|  |  |  | [2D] COMMAND_CLASS_SCENE_CONTROLLER_CONF | 1 |
|  |  |  | [2E] COMMAND_CLASS_SECURITY_PANEL_ZONE | 1 |
|  |  |  | [2F] COMMAND_CLASS_SECURITY_PANEL_ZONE_SENSOR | 1 |
|  |  |  | [30] COMMAND_CLASS_SENSOR_BINARY | 1 |
|  |  |  | [31] COMMAND_CLASS_SENSOR_MULTILEVEL | 1 |
|  |  |  | [32] COMMAND_CLASS_METER | 1 |
|  |  |  | [33] COMMAND_CLASS_SWITCH_COLOR | 1 |
|  |  |  | [34] COMMAND_CLASS_NETWORK_MANAGEMENT_INCLUSION | 1 |
|  |  |  | [35] COMMAND_CLASS_METER_PULSE | 1 |
|  |  |  | [36] COMMAND_CLASS_BASIC_TARIFF_INFO | 1 |
|  |  |  | [37] COMMAND_CLASS_HRV_STATUS | 1 |
|  |  |  | [38] COMMAND_CLASS_THERMOSTAT_HEATING | 1 |
|  |  |  | [39] COMMAND_CLASS_HRV_CONTROL | 1 |
|  |  |  | [3A] COMMAND_CLASS_DCP_CONFIG | 1 |
|  |  |  | [3B] COMMAND_CLASS_DCP_MONITOR | 1 |
|  |  |  | [3C] COMMAND_CLASS_METER_TBL_CONFIG | 1 |
|  |  |  | [3D] COMMAND_CLASS_METER_TBL_MONITOR | 1 |
|  |  |  | [3E] COMMAND_CLASS_METER_TBL_PUSH | 1 |
|  |  |  | [3F] COMMAND_CLASS_PREPAYMENT | 1 |
|  |  |  | [40] COMMAND_CLASS_THERMOSTAT_MODE | 1 |
|  |  |  | [41] COMMAND_CLASS_PREPAYMENT_ENCAPSULATION | 1 |
|  |  |  | [42] COMMAND_CLASS_THERMOSTAT_OPERATING_STATE | 1 |
|  |  |  | [43] COMMAND_CLASS_THERMOSTAT_SETPOINT | 1 |
|  |  |  | [44] COMMAND_CLASS_THERMOSTAT_FAN_MODE | 1 |
|  |  |  | [45] COMMAND_CLASS_THERMOSTAT_FAN_STATE | 1 |
|  |  |  | [46] COMMAND_CLASS_CLIMATE_CONTROL_SCHEDULE | 1 |
|  |  |  | [47] COMMAND_CLASS_THERMOSTAT_SETBACK | 1 |
|  |  |  | [48] COMMAND_CLASS_RATE_TBL_CONFIG | 1 |
|  |  |  | [49] COMMAND_CLASS_RATE_TBL_MONITOR | 1 |
|  |  |  | [4A] COMMAND_CLASS_TARIFF_CONFIG | 1 |
|  |  |  | [4B] COMMAND_CLASS_TARIFF_TBL_MONITOR | 1 |
|  |  |  | [4C] COMMAND_CLASS_DOOR_LOCK_LOGGING | 1 |
|  |  |  | [4D] COMMAND_CLASS_NETWORK_MANAGEMENT_BASIC | 1 |
|  |  |  | [4E] COMMAND_CLASS_SCHEDULE_ENTRY_LOCK | 1 |
|  |  |  | [4F] COMMAND_CLASS_ZIP_6LOWPAN | 1 |
|  |  |  | [50] COMMAND_CLASS_BASIC_WINDOW_COVERING | 1 |
|  |  |  | [51] COMMAND_CLASS_MTP_WINDOW_COVERING | 1 |
|  |  |  | [52] COMMAND_CLASS_NETWORK_MANAGEMENT_PROXY | 1 |
|  |  |  | [53] COMMAND_CLASS_SCHEDULE | 1 |
|  |  |  | [54] COMMAND_CLASS_NETWORK_MANAGEMENT_PRIMARY | 1 |
|  |  |  | [55] COMMAND_CLASS_TRANSPORT_SERVICE | 1 |
|  |  |  | [56] COMMAND_CLASS_CRC_16_ENCAP | 1 |
|  |  |  | [57] COMMAND_CLASS_APPLICATION_CAPABILITY | 1 |
|  |  |  | [58] COMMAND_CLASS_ZIP_ND | 1 |
|  |  |  | [59] COMMAND_CLASS_ASSOCIATION_GRP_INFO | 1 |
|  |  |  | [5A] COMMAND_CLASS_DEVICE_RESET_LOCALLY | 1 |
|  |  |  | [5B] COMMAND_CLASS_CENTRAL_SCENE | 1 |
|  |  |  | [5C] COMMAND_CLASS_IP_ASSOCIATION | 1 |
|  |  |  | [5D] COMMAND_CLASS_ANTITHEFT | 1 |
|  |  |  | [5E] COMMAND_CLASS_ZWAVEPLUS_INFO | 1 |
|  |  |  | [5F] COMMAND_CLASS_ZIP_GATEWAY | 1 |
|  |  |  | [60] COMMAND_CLASS_MULTI_CHANNEL | 1 |
|  |  |  | [61] COMMAND_CLASS_ZIP_PORTAL | 1 |
|  |  |  | [62] COMMAND_CLASS_DOOR_LOCK | 1 |
|  |  |  | [63] COMMAND_CLASS_USER_CODE | 1 |
|  |  |  | [64] COMMAND_CLASS_HUMIDITY_CONTROL_SETPOINT | 1 |
|  |  |  | [65] COMMAND_CLASS_DMX | 1 |
|  |  |  | [66] COMMAND_CLASS_BARRIER_OPERATOR | 1 |
|  |  |  | [67] COMMAND_CLASS_NETWORK_MANAGEMENT_INSTALLATION_MAINTENANCE | 1 |
|  |  |  | [68] COMMAND_CLASS_ZIP_NAMING | 1 |
|  |  |  | [69] COMMAND_CLASS_MAILBOX | 1 |
|  |  |  | [6A] COMMAND_CLASS_WINDOW_COVERING | 1 |
|  |  |  | [6B] COMMAND_CLASS_IRRIGATION | 1 |
|  |  |  | [6C] COMMAND_CLASS_SUPERVISION | 1 |
|  |  |  | [6D] COMMAND_CLASS_HUMIDITY_CONTROL_MODE | 1 |
|  |  |  | [6E] COMMAND_CLASS_HUMIDITY_CONTROL_OPERATING_STATE | 1 |
|  |  |  | [6F] COMMAND_CLASS_ENTRY_CONTROL | 1 |
|  |  |  | [70] COMMAND_CLASS_CONFIGURATION | 1 |
|  |  |  | [71] COMMAND_CLASS_ALARM | 1 |
|  |  |  | [72] COMMAND_CLASS_MANUFACTURER_SPECIFIC | 1 |
|  |  |  | [73] COMMAND_CLASS_POWERLEVEL | 1 |
|  |  |  | [74] COMMAND_CLASS_INCLUSION_CONTROLLER | 1 |
|  |  |  | [75] COMMAND_CLASS_PROTECTION | 1 |
|  |  |  | [76] COMMAND_CLASS_LOCK | 1 |
|  |  |  | [77] COMMAND_CLASS_NODE_NAMING | 1 |
|  |  |  | [7A] COMMAND_CLASS_FIRMWARE_UPDATE_MD | 1 |
|  |  |  | [7B] COMMAND_CLASS_GROUPING_NAME | 1 |
|  |  |  | [7C] COMMAND_CLASS_REMOTE_ASSOCIATION_ACTIVATE | 1 |
|  |  |  | [7D] COMMAND_CLASS_REMOTE_ASSOCIATION | 1 |
|  |  |  | [80] COMMAND_CLASS_BATTERY | 1 |
|  |  |  | [81] COMMAND_CLASS_CLOCK | 1 |
|  |  |  | [82] COMMAND_CLASS_HAIL | 1 |
|  |  |  | [84] COMMAND_CLASS_WAKE_UP | 1 |
|  |  |  | [85] COMMAND_CLASS_ASSOCIATION | 1 |
|  |  |  | [86] COMMAND_CLASS_VERSION | 1 |
|  |  |  | [87] COMMAND_CLASS_INDICATOR | 1 |
|  |  |  | [88] COMMAND_CLASS_PROPRIETARY | 1 |
|  |  |  | [89] COMMAND_CLASS_LANGUAGE | 1 |
|  |  |  | [8A] COMMAND_CLASS_TIME | 1 |
|  |  |  | [8B] COMMAND_CLASS_TIME_PARAMETERS | 1 |
|  |  |  | [8C] COMMAND_CLASS_GEOGRAPHIC_LOCATION | 1 |
|  |  |  | [8E] COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION | 1 |
|  |  |  | [8F] COMMAND_CLASS_MULTI_CMD | 1 |
|  |  |  | [90] COMMAND_CLASS_ENERGY_PRODUCTION | 1 |
|  |  |  | [91] COMMAND_CLASS_MANUFACTURER_PROPRIETARY | 1 |
|  |  |  | [92] COMMAND_CLASS_SCREEN_MD | 1 |
|  |  |  | [93] COMMAND_CLASS_SCREEN_ATTRIBUTES | 1 |
|  |  |  | [94] COMMAND_CLASS_SIMPLE_AV_CONTROL | 1 |
|  |  |  | [95] COMMAND_CLASS_AV_CONTENT_DIRECTORY_MD | 1 |
|  |  |  | [96] COMMAND_CLASS_AV_RENDERER_STATUS | 1 |
|  |  |  | [97] COMMAND_CLASS_AV_CONTENT_SEARCH_MD | 1 |
|  |  |  | [98] COMMAND_CLASS_SECURITY | 1 |
|  |  |  | [99] COMMAND_CLASS_AV_TAGGING_MD | 1 |
|  |  |  | [9A] COMMAND_CLASS_IP_CONFIGURATION | 1 |
|  |  |  | [9B] COMMAND_CLASS_ASSOCIATION_COMMAND_CONFIGURATION | 1 |
|  |  |  | [9C] COMMAND_CLASS_SENSOR_ALARM | 1 |
|  |  |  | [9D] COMMAND_CLASS_SILENCE_ALARM | 1 |
|  |  |  | [9E] COMMAND_CLASS_SENSOR_CONFIGURATION | 1 |
|  |  |  | [9F] COMMAND_CLASS_SECURITY_2 | 1 |
|  |  |  | [EF] COMMAND_CLASS_MARK | 1 |
|  |  |  | [F0] COMMAND_CLASS_NON_INTEROPERABLE | 1 |
|  | [02] REQUEST_NODE_INFO |  |  | 1 |
|  | [03] ASSIGN_ID |  |  | 1 |
|  | [04] FIND_NODES_IN_RANGE |  |  | 1 |
|  | [05] GET_NODES_IN_RANGE |  |  | 1 |
|  | [06] NODE_RANGE_INFO |  |  | 1 |
|  | [07] COMMAND_COMPLETE |  |  | 1 |
|  | [08] TRANSFER_PRESENTATION |  |  | 1 |
|  | [09] TRANSFER_NODE_INFO |  |  | 1 |
|  | [0A] TRANSFER_RANGE_INFO |  |  | 1 |
|  | [0B] TRANSFER_END |  |  | 1 |
|  | [0C] ASSIGN_RETURN_ROUTE |  |  | 1 |
|  | [0D] NEW_NODE_REGISTERED |  |  | 1 |
|  | [0E] NEW_RANGE_REGISTERED |  |  | 1 |
|  | [0F] TRANSFER_NEW_PRIMARY_COMPLETE |  |  | 1 |
|  | [10] CMD_AUTOMATIC_CONTROLLER_UPDATE_START |  |  | 1 |
|  | [11] CMD_SUC_NODE_ID |  |  | 1 |
|  | [12] CMD_SET_SUC |  |  | 1 |
|  | [13] CMD_SET_SUC_ACK |  |  | 1 |
|  | [14] CMD_ASSIGN_SUC_RETURN_ROUTE |  |  | 1 |
|  | [15] CMD_STATIC_ROUTE_REQUEST |  |  | 1 |
|  | [16] LOST |  |  | 1 |
|  | [17] ACCEPT_LOST |  |  | 1 |
|  | [18] CMD_NOP_POWER |  |  | 1 |
|  | [19] ZWAVE_CMD_RESERVE_NODE_IDS |  |  | 1 |
|  | [1A] CMD_RESERVED_IDS |  |  | 1 |
|  | [1F] CMD_NODES_EXIST |  |  | 1 |
|  | [20] CMD_NODES_EXIST_REPLY |  |  | 1 |
|  | [22] CMD_SET_NWI_MODE |  |  | 1 |
|  | [23] EXCLUDE_REQUEST |  |  | 1 |
|  | [24] ASSIGN_RETURN_ROUTE_PRIORITY |  |  | 1 |
|  | [25] ASSIGN_SUC_RETURN_ROUTE_PRIORITY |  |  | 1 |
| [02] COMMAND_CLASS_ZENSOR_NET |  |  |  | 1 |
|  | [01] BIND_REQUEST |  |  | 1 |
|  | [02] BIND_ACCEPT |  |  | 1 |
|  | [03] BIND_COMPLETE |  |  | 1 |
| [20] COMMAND_CLASS_BASIC |  |  |  | 2 |
|  | [01] BASIC_SET |  |  | 1-2 |
|  |  | Value |  | 1-2 |
|  | [02] BASIC_GET |  |  | 1-2 |
|  | [03] BASIC_REPORT |  |  | 1-2 |
|  |  | Value |  | 1-2 |
|  |  | Target Value |  | 2 |
|  |  | Duration |  | 2 |
| [21] COMMAND_CLASS_CONTROLLER_REPLICATION |  |  |  | 1 |
|  | [31] CTRL_REPLICATION_TRANSFER_GROUP |  |  | 1 |
|  |  | Sequence Number |  | 1 |
|  |  | Group ID |  | 1 |
|  |  | Node ID |  | 1 |
|  | [32] CTRL_REPLICATION_TRANSFER_GROUP_NAME |  |  | 1 |
|  |  | Sequence Number |  | 1 |
|  |  | Group ID |  | 1 |
|  |  | Group Name |  | 1 |
|  | [33] CTRL_REPLICATION_TRANSFER_SCENE |  |  | 1 |
|  |  | Sequence Number |  | 1 |
|  |  | Scene ID |  | 1 |
|  |  | Node ID |  | 1 |
|  |  | Level |  | 1 |
|  | [34] CTRL_REPLICATION_TRANSFER_SCENE_NAME |  |  | 1 |
|  |  | Sequence Number |  | 1 |
|  |  | Scene ID |  | 1 |
|  |  | Scene Name |  | 1 |
| [22] COMMAND_CLASS_APPLICATION_STATUS |  |  |  | 1 |
|  | [01] APPLICATION_BUSY |  |  | 1 |
|  |  | Status |  | 1 |
|  |  |  | [00] TRY_AGAIN_LATER | 1 |
|  |  |  | [01] TRY_AGAIN_IN_WAIT_TIME_SECONDS | 1 |
|  |  |  | [02] REQUEST_QUEUED_EXECUTED_LATER | 1 |
|  |  | Wait Time |  | 1 |
|  | [02] APPLICATION_REJECTED_REQUEST |  |  | 1 |
|  |  | Status |  | 1 |
| [23] COMMAND_CLASS_ZIP |  |  |  | 3 |
|  | [02] COMMAND_ZIP_PACKET |  |  | 1-3 |
|  |  | NAck - Option Error |  | 1-3 |
|  |  | NAck - Queue Full |  | 1-3 |
|  |  | NAck - Waiting |  | 1-3 |
|  |  | NAck Response |  | 1-3 |
|  |  | Ack Response |  | 1-3 |
|  |  | Ack Request |  | 1-3 |
|  |  | Secure Origin |  | 2-3 |
|  |  | More Information |  | 1-3 |
|  |  | Z-Wave Cmd Included |  | 1-3 |
|  |  | Header ext. included |  | 1-3 |
|  |  | Seq No |  | 1-3 |
|  |  | Source End Point |  | 1-3 |
|  |  | Destination End Point |  | 1-3 |
|  |  | Bit Address |  | 1-3 |
|  |  | Header Length |  | 2-3 |
|  |  | Header extension |  | 1-3 |
|  |  | Z-Wave command |  | 1-3 |
| [24] COMMAND_CLASS_SECURITY_PANEL_MODE |  |  |  | 1 |
|  | [01] SECURITY_PANEL_MODE_SUPPORTED_GET |  |  | 1 |
|  | [02] SECURITY_PANEL_MODE_SUPPORTED_REPORT |  |  | 1 |
|  |  | Supported Mode Bit Mask |  | 1 |
|  | [03] SECURITY_PANEL_MODE_GET |  |  | 1 |
|  | [04] SECURITY_PANEL_MODE_REPORT |  |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [01] ARM_HOME | 1 |
|  |  |  | [02] ARM_AWAY_NO_DELAY | 1 |
|  |  |  | [03] ARM_AWAY_DELAYED | 1 |
|  |  |  | [04] DISARM | 1 |
|  |  |  | [05] ALARM_TRIGGER | 1 |
|  | [05] SECURITY_PANEL_MODE_SET |  |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [01] ARM_HOME | 1 |
|  |  |  | [02] ARM_AWAY_NO_DELAY | 1 |
|  |  |  | [03] ARM_AWAY_DELAYED | 1 |
|  |  |  | [04] DISARM | 1 |
|  |  |  | [05] ALARM_TRIGGER | 1 |
| [25] COMMAND_CLASS_SWITCH_BINARY |  |  |  | 2 |
|  | [01] SWITCH_BINARY_SET |  |  | 1-2 |
|  |  | Target Value |  | 1-2 |
|  |  |  | [00] OFF_DISABLE | 1-2 |
|  |  |  | [FF] ON_ENABLE | 1-2 |
|  |  | Duration |  | 2 |
|  |  |  | [00] INSTANTLY | 2 |
|  |  |  | [FF] DEFAULT | 2 |
|  | [02] SWITCH_BINARY_GET |  |  | 1-2 |
|  | [03] SWITCH_BINARY_REPORT |  |  | 1-2 |
|  |  | Current Value |  | 1-2 |
|  |  |  | [00] OFF_DISABLE | 1-2 |
|  |  |  | [FF] ON_ENABLE | 1-2 |
|  |  | Target Value |  | 2 |
|  |  |  | [00] OFF_DISABLE | 2 |
|  |  |  | [FF] ON_ENABLE | 2 |
|  |  | Duration |  | 2 |
|  |  |  | [00] ALREADY_AT_THE_TARGET_VALUE | 2 |
|  |  |  | [FE] UNKNOWN_DURATION | 2 |
| [26] COMMAND_CLASS_SWITCH_MULTILEVEL |  |  |  | 4 |
|  | [01] SWITCH_MULTILEVEL_SET |  |  | 1-4 |
|  |  | Value |  | 1-4 |
|  |  |  | [00] OFF_DISABLE | 1-4 |
|  |  |  | [FF] ON_ENABLE | 1-4 |
|  |  | Dimming Duration |  | 2-4 |
|  |  |  | [00] INSTANTLY | 2-4 |
|  |  |  | [FF] FACTORY_DEFAULT | 2-4 |
|  | [02] SWITCH_MULTILEVEL_GET |  |  | 1-4 |
|  | [03] SWITCH_MULTILEVEL_REPORT |  |  | 1-4 |
|  |  | Value |  | 1-3 |
|  |  |  | [00] OFF_DISABLE | 1-3 |
|  |  |  | [FF] ON_ENABLE | 1-3 |
|  |  | Current Value |  | 4 |
|  |  |  | [00] OFF_DISABLE | 4 |
|  |  |  | [FF] ON_ENABLE | 4 |
|  |  | Target Value |  | 4 |
|  |  | Duration |  | 4 |
|  |  |  | [00] ALREADY_AT_THE_TARGET_VALUE | 4 |
|  |  |  | [FE] UNKNOWN_DURATION | 4 |
|  | [04] SWITCH_MULTILEVEL_START_LEVEL_CHANGE |  |  | 1-4 |
|  |  | Inc Dec |  | 3-4 |
|  |  |  | [00] INCREMENT | 3-4 |
|  |  |  | [01] DECREMENT | 3-4 |
|  |  |  | [03] NONE | 3-4 |
|  |  | Ignore Start Level |  | 1-4 |
|  |  | Up / Down Flag |  | 1-2 |
|  |  | Up Down |  | 3-4 |
|  |  |  | [00] UP | 3-4 |
|  |  |  | [01] DOWN | 3-4 |
|  |  |  | [03] NONE | 3-4 |
|  |  | Start Level |  | 1-4 |
|  |  | Dimming Duration |  | 2-4 |
|  |  | Step Size |  | 3-4 |
|  | [05] SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE |  |  | 1-4 |
|  | [06] SWITCH_MULTILEVEL_SUPPORTED_GET |  |  | 3-4 |
|  | [07] SWITCH_MULTILEVEL_SUPPORTED_REPORT |  |  | 3-4 |
|  |  | Primary Switch Type |  | 3-4 |
|  |  | Secondary Switch Type |  | 3-4 |
| [27] COMMAND_CLASS_SWITCH_ALL |  |  |  | 1 |
|  | [01] SWITCH_ALL_SET |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] EXCLUDED_FROM_THE_ALL_ON_ALL_OFF_FUNCTIONALITY | 1 |
|  |  |  | [01] EXCLUDED_FROM_THE_ALL_ON_FUNCTIONALITY_BUT_NOT_ALL_OFF | 1 |
|  |  |  | [02] EXCLUDED_FROM_THE_ALL_OFF_FUNCTIONALITY_BUT_NOT_ALL_ON | 1 |
|  |  |  | [FF] INCLUDED_IN_THE_ALL_ON_ALL_OFF_FUNCTIONALITY | 1 |
|  | [02] SWITCH_ALL_GET |  |  | 1 |
|  | [03] SWITCH_ALL_REPORT |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] EXCLUDED_FROM_THE_ALL_ON_ALL_OFF_FUNCTIONALITY | 1 |
|  |  |  | [01] EXCLUDED_FROM_THE_ALL_ON_FUNCTIONALITY_BUT_NOT_ALL_OFF | 1 |
|  |  |  | [02] EXCLUDED_FROM_THE_ALL_OFF_FUNCTIONALITY_BUT_NOT_ALL_ON | 1 |
|  |  |  | [FF] INCLUDED_IN_THE_ALL_ON_ALL_OFF_FUNCTIONALITY | 1 |
|  | [04] SWITCH_ALL_ON |  |  | 1 |
|  | [05] SWITCH_ALL_OFF |  |  | 1 |
| [28] COMMAND_CLASS_SWITCH_TOGGLE_BINARY |  |  |  | 1 |
|  | [01] SWITCH_TOGGLE_BINARY_SET |  |  | 1 |
|  | [02] SWITCH_TOGGLE_BINARY_GET |  |  | 1 |
|  | [03] SWITCH_TOGGLE_BINARY_REPORT |  |  | 1 |
|  |  | Value |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
| [29] COMMAND_CLASS_SWITCH_TOGGLE_MULTILEVEL |  |  |  | 1 |
|  | [01] SWITCH_TOGGLE_MULTILEVEL_SET |  |  | 1 |
|  | [02] SWITCH_TOGGLE_MULTILEVEL_GET |  |  | 1 |
|  | [03] SWITCH_TOGGLE_MULTILEVEL_REPORT |  |  | 1 |
|  |  | Value |  | 1 |
|  |  |  | [00] OFF_DISABLE | 1 |
|  |  |  | [FF] ON_ENABLE | 1 |
|  | [04] SWITCH_TOGGLE_MULTILEVEL_START_LEVEL_CHANGE |  |  | 1 |
|  |  | Ignore Start Level |  | 1 |
|  |  | Roll Over |  | 1 |
|  |  | Start Level |  | 1 |
|  | [05] SWITCH_TOGGLE_MULTILEVEL_STOP_LEVEL_CHANGE |  |  | 1 |
| [2A] COMMAND_CLASS_CHIMNEY_FAN |  |  |  | 1 |
|  | [01] CHIMNEY_FAN_STATE_SET |  |  | 1 |
|  |  | State |  | 1 |
|  |  |  | [01] NEXT_STATE | 1 |
|  | [02] CHIMNEY_FAN_STATE_GET |  |  | 1 |
|  | [03] CHIMNEY_FAN_STATE_REPORT |  |  | 1 |
|  |  | State |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] BOOST | 1 |
|  |  |  | [02] EXHAUST | 1 |
|  |  |  | [03] RELOAD | 1 |
|  |  |  | [04] VENTING | 1 |
|  |  |  | [05] STOP | 1 |
|  |  |  | [06] VENTING_EX | 1 |
|  |  |  | [07] SERVICE | 1 |
|  |  |  | [08] SENSOR_FAILURE | 1 |
|  |  |  | [09] CHIMNEY_FIRE | 1 |
|  |  |  | [0A] EXTERNAL_ALARM | 1 |
|  | [04] CHIMNEY_FAN_SPEED_SET |  |  | 1 |
|  |  | Speed |  | 1 |
|  |  |  | [65] SPEED_DOWN | 1 |
|  |  |  | [C8] SPEED_UP | 1 |
|  | [05] CHIMNEY_FAN_SPEED_GET |  |  | 1 |
|  | [06] CHIMNEY_FAN_SPEED_REPORT |  |  | 1 |
|  |  | Speed |  | 1 |
|  | [07] CHIMNEY_FAN_START_TEMP_SET |  |  | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [08] CHIMNEY_FAN_START_TEMP_GET |  |  | 1 |
|  | [09] CHIMNEY_FAN_START_TEMP_REPORT |  |  | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [0A] CHIMNEY_FAN_STOP_TEMP_SET |  |  | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [0B] CHIMNEY_FAN_STOP_TEMP_GET |  |  | 1 |
|  | [0C] CHIMNEY_FAN_STOP_TEMP_REPORT |  |  | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [0D] CHIMNEY_FAN_ALARM_TEMP_SET |  |  | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [0E] CHIMNEY_FAN_ALARM_TEMP_GET |  |  | 1 |
|  | [0F] CHIMNEY_FAN_ALARM_TEMP_REPORT |  |  | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [10] CHIMNEY_FAN_BOOST_TIME_SET |  |  | 1 |
|  |  | Time |  | 1 |
|  | [11] CHIMNEY_FAN_BOOST_TIME_GET |  |  | 1 |
|  | [12] CHIMNEY_FAN_BOOST_TIME_REPORT |  |  | 1 |
|  |  | Time |  | 1 |
|  | [13] CHIMNEY_FAN_STOP_TIME_SET |  |  | 1 |
|  |  | Time |  | 1 |
|  | [14] CHIMNEY_FAN_STOP_TIME_GET |  |  | 1 |
|  | [15] CHIMNEY_FAN_STOP_TIME_REPORT |  |  | 1 |
|  |  | Time |  | 1 |
|  | [16] CHIMNEY_FAN_MODE_SET |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
|  | [17] CHIMNEY_FAN_MODE_GET |  |  | 1 |
|  | [18] CHIMNEY_FAN_MODE_REPORT |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
|  | [19] CHIMNEY_FAN_SETUP_SET |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
|  |  | Boost Time |  | 1 |
|  |  | Stop Time |  | 1 |
|  |  | Min. Speed |  | 1 |
|  |  | Size 1 |  | 1 |
|  |  | Scale 1 |  | 1 |
|  |  | Precision 1 |  | 1 |
|  |  | Start Temperature |  | 1 |
|  |  | Size 2 |  | 1 |
|  |  | Scale 2 |  | 1 |
|  |  | Precision 2 |  | 1 |
|  |  | Stop Temperature |  | 1 |
|  |  | Size 3 |  | 1 |
|  |  | Scale 3 |  | 1 |
|  |  | Precision 3 |  | 1 |
|  |  | Alarm Temperature Value |  | 1 |
|  | [1A] CHIMNEY_FAN_SETUP_GET |  |  | 1 |
|  | [1B] CHIMNEY_FAN_SETUP_REPORT |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
|  |  | Boost Time |  | 1 |
|  |  | Stop Time |  | 1 |
|  |  | Min. Speed |  | 1 |
|  |  | Size 1 |  | 1 |
|  |  | Scale 1 |  | 1 |
|  |  | Precision 1 |  | 1 |
|  |  | Start Temperature |  | 1 |
|  |  | Size 2 |  | 1 |
|  |  | Scale 2 |  | 1 |
|  |  | Precision 2 |  | 1 |
|  |  | Stop Temperature |  | 1 |
|  |  | Size 3 |  | 1 |
|  |  | Scale 3 |  | 1 |
|  |  | Precision 3 |  | 1 |
|  |  | Alarm Temperature Value |  | 1 |
|  | [1D] CHIMNEY_FAN_STATUS_GET |  |  | 1 |
|  | [1E] CHIMNEY_FAN_STATUS_REPORT |  |  | 1 |
|  |  | State |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] BOOST | 1 |
|  |  |  | [02] EXHAUST | 1 |
|  |  |  | [03] RELOAD | 1 |
|  |  |  | [04] VENTING | 1 |
|  |  |  | [05] STOP | 1 |
|  |  |  | [06] VENTING_EX | 1 |
|  |  |  | [07] SERVICE | 1 |
|  |  |  | [08] SENSOR_FAILURE | 1 |
|  |  |  | [09] CHIMNEY_FIRE | 1 |
|  |  |  | [0A] EXTERNAL_ALARM | 1 |
|  |  | Speed |  | 1 |
|  |  | Service |  | 1 |
|  |  | External Alarm |  | 1 |
|  |  | Sensor Error |  | 1 |
|  |  | Alarm Temperature Exceeded |  | 1 |
|  |  | Speed change Enable |  | 1 |
|  |  | Start Temperature Exceeded |  | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [1F] CHIMNEY_FAN_ALARM_LOG_SET |  |  | 1 |
|  |  | Message |  | 1 |
|  |  |  | [08] RESET_LOG | 1 |
|  | [20] CHIMNEY_FAN_ALARM_LOG_GET |  |  | 1 |
|  | [21] CHIMNEY_FAN_ALARM_LOG_REPORT |  |  | 1 |
|  |  | External Alarm 1 |  | 1 |
|  |  | Sensor Error 1 |  | 1 |
|  |  | Alarm Temperature Exceeded 1 |  | 1 |
|  |  | Alarm still active 1 |  | 1 |
|  |  | External Alarm 2 |  | 1 |
|  |  | Sensor Error 2 |  | 1 |
|  |  | Alarm Temperature Exceeded 2 |  | 1 |
|  |  | Alarm still active 2 |  | 1 |
|  |  | External Alarm 3 |  | 1 |
|  |  | Sensor Error 3 |  | 1 |
|  |  | Alarm Temperature Exceeded 3 |  | 1 |
|  |  | Alarm still active 3 |  | 1 |
|  |  | External Alarm 4 |  | 1 |
|  |  | Sensor Error 4 |  | 1 |
|  |  | Alarm Temperature Exceeded 4 |  | 1 |
|  |  | Alarm still active 4 |  | 1 |
|  |  | External Alarm 5 |  | 1 |
|  |  | Sensor Error 5 |  | 1 |
|  |  | Alarm Temperature Exceeded 5 |  | 1 |
|  |  | Alarm still active 5 |  | 1 |
|  | [22] CHIMNEY_FAN_ALARM_STATUS_SET |  |  | 1 |
|  |  | Acknowledge External Alarm |  | 1 |
|  |  | Acknowledge Sensor Error |  | 1 |
|  |  | Acknowledge Alarm Temperature Exceeded |  | 1 |
|  | [23] CHIMNEY_FAN_ALARM_STATUS_GET |  |  | 1 |
|  | [24] CHIMNEY_FAN_ALARM_STATUS_REPORT |  |  | 1 |
|  |  | Service |  | 1 |
|  |  | External Alarm |  | 1 |
|  |  | Sensor Error |  | 1 |
|  |  | Alarm Temperature Exceeded |  | 1 |
|  |  | Speed change Enable |  | 1 |
|  |  | Start Temperature Exceeded |  | 1 |
|  | [25] CHIMNEY_FAN_MIN_SPEED_SET |  |  | 1 |
|  |  | Min Speed |  | 1 |
|  | [26] CHIMNEY_FAN_MIN_SPEED_GET |  |  | 1 |
|  | [27] CHIMNEY_FAN_MIN_SPEED_REPORT |  |  | 1 |
|  |  | Min Speed |  | 1 |
|  | [28] CHIMNEY_FAN_DEFAULT_SET |  |  | 1 |
| [2B] COMMAND_CLASS_SCENE_ACTIVATION |  |  |  | 1 |
|  | [01] SCENE_ACTIVATION_SET |  |  | 1 |
|  |  | Scene ID |  | 1 |
|  |  | Dimming Duration |  | 1 |
|  |  |  | [00] INSTANTLY | 1 |
|  |  |  | [FF] CONFIGURED_DIMMING_DURATION | 1 |
| [2C] COMMAND_CLASS_SCENE_ACTUATOR_CONF |  |  |  | 1 |
|  | [01] SCENE_ACTUATOR_CONF_SET |  |  | 1 |
|  |  | Scene ID |  | 1 |
|  |  | Dimming Duration |  | 1 |
|  |  |  | [00] SPECIFY_INSTANTLY | 1 |
|  |  |  | [FF] FACTORY_DEFAULT | 1 |
|  |  | Override |  | 1 |
|  |  | Level |  | 1 |
|  | [02] SCENE_ACTUATOR_CONF_GET |  |  | 1 |
|  |  | Scene ID |  | 1 |
|  | [03] SCENE_ACTUATOR_CONF_REPORT |  |  | 1 |
|  |  | Scene ID |  | 1 |
|  |  | Level |  | 1 |
|  |  | Dimming Duration |  | 1 |
|  |  |  | [00] INSTANTLY | 1 |
| [2D] COMMAND_CLASS_SCENE_CONTROLLER_CONF |  |  |  | 1 |
|  | [01] SCENE_CONTROLLER_CONF_SET |  |  | 1 |
|  |  | Group ID |  | 1 |
|  |  | Scene ID |  | 1 |
|  |  | Dimming Duration |  | 1 |
|  |  |  | [00] INSTANTLY | 1 |
|  |  |  | [FF] FACTORY_DEFAULT | 1 |
|  | [02] SCENE_CONTROLLER_CONF_GET |  |  | 1 |
|  |  | Group ID |  | 1 |
|  | [03] SCENE_CONTROLLER_CONF_REPORT |  |  | 1 |
|  |  | Group ID |  | 1 |
|  |  | Scene ID |  | 1 |
|  |  | Dimming Duration |  | 1 |
|  |  |  | [00] INSTANTLY | 1 |
| [2E] COMMAND_CLASS_SECURITY_PANEL_ZONE |  |  |  | 1 |
|  | [01] SECURITY_PANEL_ZONE_NUMBER_SUPPORTED_GET |  |  | 1 |
|  | [02] SECURITY_PANEL_ZONE_SUPPORTED_REPORT |  |  | 1 |
|  |  | Zones Supported |  | 1 |
|  |  | ZM |  | 1 |
|  | [03] SECURITY_PANEL_ZONE_TYPE_GET |  |  | 1 |
|  |  | Zone Number |  | 1 |
|  | [04] SECURITY_PANEL_ZONE_TYPE_REPORT |  |  | 1 |
|  |  | Zone Number |  | 1 |
|  |  | Zone Type |  | 1 |
|  |  |  | [01] ALARM_ZONE | 1 |
|  |  |  | [02] NOTIFICATION_ZONE | 1 |
|  | [05] SECURITY_PANEL_ZONE_STATE_GET |  |  | 1 |
|  |  | Zone Number |  | 1 |
|  | [06] SECURITY_PANEL_ZONE_STATE_REPORT |  |  | 1 |
|  |  | Zone number |  | 1 |
|  |  | Zone State |  | 1 |
|  |  |  | [00] FAULTED | 1 |
|  |  |  | [01] NOT_FAULTED | 1 |
|  |  |  | [02] BYPASS_FAULTED | 1 |
|  |  |  | [03] BYPASS_NOT_FAULTED | 1 |
| [2F] COMMAND_CLASS_SECURITY_PANEL_ZONE_SENSOR |  |  |  | 1 |
|  | [01] SECURITY_PANEL_ZONE_SENSOR_INSTALLED_GET |  |  | 1 |
|  |  | Zone number |  | 1 |
|  | [02] COMMAND_CLASS_SECURITY_PANEL_ZONE_SENSOR_INSTALLED_REPORT |  |  | 1 |
|  |  | Zone number |  | 1 |
|  |  | Number of Sensors |  | 1 |
|  | [03] SECURITY_PANEL_ZONE_SENSOR_TYPE_GET |  |  | 1 |
|  |  | Zone Number |  | 1 |
|  |  | Sensor Number |  | 1 |
|  | [04] SECURITY_PANEL_ZONE_SENSOR_TYPE_REPORT |  |  | 1 |
|  |  | Zone Number |  | 1 |
|  |  | Sensor Number |  | 1 |
|  |  | ZWave Alarm Type |  | 1 |
|  | [05] SECURITY_PANEL_ZONE_SENSOR_STATE_GET |  |  | 1 |
|  |  | Zone Number |  | 1 |
|  |  | Sensor Number |  | 1 |
|  | [06] SECURITY_PANEL_ZONE_SENSOR_STATE_REPORT |  |  | 1 |
|  |  | Zone Number |  | 1 |
|  |  | Sensor Number |  | 1 |
|  |  | ZWave Alarm Type |  | 1 |
|  |  | ZWave Alarm Event |  | 1 |
|  |  | Event Parameters |  | 1 |
| [30] COMMAND_CLASS_SENSOR_BINARY |  |  |  | 2 |
|  | [01] SENSOR_BINARY_SUPPORTED_GET_SENSOR |  |  | 2 |
|  | [02] SENSOR_BINARY_GET |  |  | 1-2 |
|  |  | Sensor Type |  | 2 |
|  |  |  | [01] GENERAL | 2 |
|  |  |  | [02] SMOKE | 2 |
|  |  |  | [03] CO | 2 |
|  |  |  | [04] CO2 | 2 |
|  |  |  | [05] HEAT | 2 |
|  |  |  | [06] WATER | 2 |
|  |  |  | [07] FREEZE | 2 |
|  |  |  | [08] TAMPER | 2 |
|  |  |  | [09] AUX | 2 |
|  |  |  | [0A] DOOR_WINDOW | 2 |
|  |  |  | [0B] TILT | 2 |
|  |  |  | [0C] MOTION | 2 |
|  |  |  | [0D] GLASS_BREAK | 2 |
|  | [03] SENSOR_BINARY_REPORT |  |  | 1-2 |
|  |  | Sensor Value |  | 1-2 |
|  |  |  | [00] IDLE | 1-2 |
|  |  |  | [FF] DETECTED_AN_EVENT | 1-2 |
|  |  | Sensor Type |  | 2 |
|  |  |  | [01] GENERAL | 2 |
|  |  |  | [02] SMOKE | 2 |
|  |  |  | [03] CO | 2 |
|  |  |  | [04] CO2 | 2 |
|  |  |  | [05] HEAT | 2 |
|  |  |  | [06] WATER | 2 |
|  |  |  | [07] FREEZE | 2 |
|  |  |  | [08] TAMPER | 2 |
|  |  |  | [09] AUX | 2 |
|  |  |  | [0A] DOOR_WINDOW | 2 |
|  |  |  | [0B] TILT | 2 |
|  |  |  | [0C] MOTION | 2 |
|  |  |  | [0D] GLASS_BREAK | 2 |
|  | [04] SENSOR_BINARY_SUPPORTED_SENSOR_REPORT |  |  | 2 |
|  |  | Bit Mask |  | 2 |
|  |  |  | [01] GENERAL | 2 |
|  |  |  | [02] SMOKE | 2 |
|  |  |  | [03] CO | 2 |
|  |  |  | [04] CO2 | 2 |
|  |  |  | [05] HEAT | 2 |
|  |  |  | [06] WATER | 2 |
|  |  |  | [07] FREEZE | 2 |
|  |  |  | [08] TAMPER | 2 |
|  |  |  | [09] AUX | 2 |
|  |  |  | [0A] DOOR_WINDOW | 2 |
|  |  |  | [0B] TILT | 2 |
|  |  |  | [0C] MOTION | 2 |
|  |  |  | [0D] GLASS_BREAK | 2 |
| [31] COMMAND_CLASS_SENSOR_MULTILEVEL |  |  |  | 10 |
|  | [01] SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR |  |  | 5-10 |
|  | [02] SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT |  |  | 5-10 |
|  |  | Bit Mask |  | 5-10 |
|  |  |  | [01] AIR_TEMPERATURE | 5-10 |
|  |  |  | [02] GENERAL_PURPOSE_VALUE | 5-10 |
|  |  |  | [03] LUMINANCE | 5-10 |
|  |  |  | [04] POWER | 5-10 |
|  |  |  | [05] HUMIDITY | 5-10 |
|  |  |  | [06] VELOCITY | 5-10 |
|  |  |  | [07] DIRECTION | 5-10 |
|  |  |  | [08] ATMOSPHERIC_PRESSURE | 5-10 |
|  |  |  | [09] BAROMETRIC_PRESSURE | 5-10 |
|  |  |  | [0A] SOLAR_RADIATION | 5-10 |
|  |  |  | [0B] DEW_POINT | 5-10 |
|  |  |  | [0C] RAIN_RATE | 5-10 |
|  |  |  | [0D] TIDE_LEVEL | 5-10 |
|  |  |  | [0E] WEIGHT | 5-10 |
|  |  |  | [0F] VOLTAGE | 5-10 |
|  |  |  | [10] CURRENT | 5-10 |
|  |  |  | [11] CO2_LEVEL | 5-10 |
|  |  |  | [12] AIR_FLOW | 5-10 |
|  |  |  | [13] TANK_CAPACITY | 5-10 |
|  |  |  | [14] DISTANCE | 5-10 |
|  |  |  | [15] ANGLE_POSITION | 5-10 |
|  |  |  | [16] ROTATION | 5-10 |
|  |  |  | [17] WATER_TEMPERATURE | 5-10 |
|  |  |  | [18] SOIL_TEMPERATURE | 5-10 |
|  |  |  | [19] SEISMIC_INTENSITY | 5-10 |
|  |  |  | [1A] SEISMIC_MAGNITUDE | 5-10 |
|  |  |  | [1B] ULTRAVIOLET | 5-10 |
|  |  |  | [1C] ELECTRICAL_RESISTIVITY | 5-10 |
|  |  |  | [1D] ELECTRICAL_CONDUCTIVITY | 5-10 |
|  |  |  | [1E] LOUDNESS | 5-10 |
|  |  |  | [1F] MOISTURE | 5-10 |
|  |  |  | [20] FREQUENCY | 6-10 |
|  |  |  | [21] TIME | 6-10 |
|  |  |  | [22] TARGET_TEMPERATURE | 6-10 |
|  |  |  | [23] PARTICULATE_MATTER_2_5 | 7-10 |
|  |  |  | [24] FORMALDEHYDE_CH2O_LEVEL | 7-10 |
|  |  |  | [25] RADON_CONCENTRATION | 7-10 |
|  |  |  | [26] METHANE_DENSITY_CH4 | 7-10 |
|  |  |  | [27] VOLATILE_ORGANIC_COMPOUND | 7-10 |
|  |  |  | [28] CARBON_MONOXIDE_CO_LEVEL | 7-10 |
|  |  |  | [29] SOIL_HUMIDITY | 7-10 |
|  |  |  | [2A] SOIL_REACTIVITY | 7-10 |
|  |  |  | [2B] SOIL_SALINITY | 7-10 |
|  |  |  | [2C] HEART_RATE | 7-10 |
|  |  |  | [2D] BLOOD_PRESSURE | 7-10 |
|  |  |  | [2E] MUSCLE_MASS | 7-10 |
|  |  |  | [2F] FAT_MASS | 7-10 |
|  |  |  | [30] BONE_MASS | 7-10 |
|  |  |  | [31] TOTAL_BODY_WATER_TBW | 7-10 |
|  |  |  | [32] BASIC_METABOLIC_RATE_BMR | 7-10 |
|  |  |  | [33] BODY_MASS_INDEX_BMI | 7-10 |
|  |  |  | [34] ACCELERATION_X_AXIS | 8-10 |
|  |  |  | [35] ACCELERATION_Y_AXIS | 8-10 |
|  |  |  | [36] ACCELERATION_Z_AXIS | 8-10 |
|  |  |  | [37] SMOKE_DENSITY | 8-10 |
|  |  |  | [38] WATER_FLOW | 9-10 |
|  |  |  | [39] WATER_PRESSURE | 9-10 |
|  |  |  | [3A] RF_SIGNAL_STRENGTH | 9-10 |
|  |  |  | [3B] PARTICULATE_MATTER | 10 |
|  |  |  | [3C] RESPIRATORY_RATE | 10 |
|  | [03] SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE |  |  | 5-10 |
|  |  | Sensor Type |  | 5-10 |
|  |  |  | [01] TEMPERATURE | 5-10 |
|  |  |  | [02] GENERAL_PURPOSE_VALUE | 5-10 |
|  |  |  | [03] LUMINANCE | 5-10 |
|  |  |  | [04] POWER | 5-10 |
|  |  |  | [05] RELATIVE_HUMIDITY | 5-10 |
|  |  |  | [06] VELOCITY | 5-10 |
|  |  |  | [07] DIRECTION | 5-10 |
|  |  |  | [08] ATMOSPHERIC_PRESSURE | 5-10 |
|  |  |  | [09] BAROMETRIC_PRESSURE | 5-10 |
|  |  |  | [0A] SOLAR_RADIATION | 5-10 |
|  |  |  | [0B] DEW_POINT | 5-10 |
|  |  |  | [0C] RAIN_RATE | 5-10 |
|  |  |  | [0D] TIDE_LEVEL | 5-10 |
|  |  |  | [0E] WEIGHT | 5-10 |
|  |  |  | [0F] VOLTAGE | 5-10 |
|  |  |  | [10] CURRENT | 5-10 |
|  |  |  | [11] CO2_LEVEL | 5-10 |
|  |  |  | [12] AIR_FLOW | 5-10 |
|  |  |  | [13] TANK_CAPACITY | 5-10 |
|  |  |  | [14] DISTANCE | 5-10 |
|  |  |  | [15] ANGLE_POSITION | 5-10 |
|  |  |  | [16] ROTATION | 5-10 |
|  |  |  | [17] WATER_TEMPERATURE | 5-10 |
|  |  |  | [18] SOIL_TEMPERATURE | 5-10 |
|  |  |  | [19] SEISMIC_INTENSITY | 5-10 |
|  |  |  | [1A] SEISMIC_MAGNITUDE | 5-10 |
|  |  |  | [1B] ULTRAVIOLET | 5-10 |
|  |  |  | [1C] ELECTRICAL_RESISTIVITY | 5-10 |
|  |  |  | [1D] ELECTRICAL_CONDUCTIVITY | 5-10 |
|  |  |  | [1E] LOUDNESS | 5-10 |
|  |  |  | [1F] MOISTURE | 5-10 |
|  |  |  | [20] FREQUENCY | 6-10 |
|  |  |  | [21] TIME | 6-10 |
|  |  |  | [22] TARGET_TEMPERATURE | 6-10 |
|  |  |  | [23] PARTICULATE_MATTER_2_5 | 7-10 |
|  |  |  | [24] FORMALDEHYDE_CH2O_LEVEL | 7-10 |
|  |  |  | [25] RADON_CONCENTRATION | 7-10 |
|  |  |  | [26] METHANE_DENSITY_CH4 | 7-10 |
|  |  |  | [27] VOLATILE_ORGANIC_COMPOUND | 7-10 |
|  |  |  | [28] CARBON_MONOXIDE_CO_LEVEL | 7-10 |
|  |  |  | [29] SOIL_HUMIDITY | 7-10 |
|  |  |  | [2A] SOIL_REACTIVITY | 7-10 |
|  |  |  | [2B] SOIL_SALINITY | 7-10 |
|  |  |  | [2C] HEART_RATE | 7-10 |
|  |  |  | [2D] BLOOD_PRESSURE | 7-10 |
|  |  |  | [2E] MUSCLE_MASS | 7-10 |
|  |  |  | [2F] FAT_MASS | 7-10 |
|  |  |  | [30] BONE_MASS | 7-10 |
|  |  |  | [31] TOTAL_BODY_WATER_TBW | 7-10 |
|  |  |  | [32] BASIC_METABOLIC_RATE_BMR | 7-10 |
|  |  |  | [33] BODY_MASS_INDEX_BMI | 7-10 |
|  |  |  | [34] ACCELERATION_X_AXIS | 8-10 |
|  |  |  | [35] ACCELERATION_Y_AXIS | 8-10 |
|  |  |  | [36] ACCELERATION_Z_AXIS | 8-10 |
|  |  |  | [37] SMOKE_DENSITY | 8-10 |
|  |  |  | [38] WATER_FLOW | 9-10 |
|  |  |  | [39] WATER_PRESSURE | 9-10 |
|  |  |  | [3A] RF_SIGNAL_STRENGTH | 9-10 |
|  |  |  | [3B] PARTICULATE_MATTER | 10 |
|  |  |  | [3C] RESPIRATORY_RATE | 10 |
|  | [04] SENSOR_MULTILEVEL_GET |  |  | 1-10 |
|  |  | Sensor Type |  | 5-10 |
|  |  |  | [01] TEMPERATURE | 5-10 |
|  |  |  | [02] GENERAL_PURPOSE_VALUE | 5-10 |
|  |  |  | [03] LUMINANCE | 5-10 |
|  |  |  | [04] POWER | 5-10 |
|  |  |  | [05] RELATIVE_HUMIDITY | 5-10 |
|  |  |  | [06] VELOCITY | 5-10 |
|  |  |  | [07] DIRECTION | 5-10 |
|  |  |  | [08] ATMOSPHERIC_PRESSURE | 5-10 |
|  |  |  | [09] BAROMETRIC_PRESSURE | 5-10 |
|  |  |  | [0A] SOLAR_RADIATION | 5-10 |
|  |  |  | [0B] DEW_POINT | 5-10 |
|  |  |  | [0C] RAIN_RATE | 5-10 |
|  |  |  | [0D] TIDE_LEVEL | 5-10 |
|  |  |  | [0E] WEIGHT | 5-10 |
|  |  |  | [0F] VOLTAGE | 5-10 |
|  |  |  | [10] CURRENT | 5-10 |
|  |  |  | [11] CO2_LEVEL | 5-10 |
|  |  |  | [12] AIR_FLOW | 5-10 |
|  |  |  | [13] TANK_CAPACITY | 5-10 |
|  |  |  | [14] DISTANCE | 5-10 |
|  |  |  | [15] ANGLE_POSITION | 5-10 |
|  |  |  | [16] ROTATION | 5-10 |
|  |  |  | [17] WATER_TEMPERATURE | 5-10 |
|  |  |  | [18] SOIL_TEMPERATURE | 5-10 |
|  |  |  | [19] SEISMIC_INTENSITY | 5-10 |
|  |  |  | [1A] SEISMIC_MAGNITUDE | 5-10 |
|  |  |  | [1B] ULTRAVIOLET | 5-10 |
|  |  |  | [1C] ELECTRICAL_RESISTIVITY | 5-10 |
|  |  |  | [1D] ELECTRICAL_CONDUCTIVITY | 5-10 |
|  |  |  | [1E] LOUDNESS | 5-10 |
|  |  |  | [1F] MOISTURE | 5-10 |
|  |  |  | [20] FREQUENCY | 6-10 |
|  |  |  | [21] TIME | 6-10 |
|  |  |  | [22] TARGET_TEMPERATURE | 6-10 |
|  |  |  | [23] PARTICULATE_MATTER_2_5 | 7-10 |
|  |  |  | [24] FORMALDEHYDE_CH2O_LEVEL | 7-10 |
|  |  |  | [25] RADON_CONCENTRATION | 7-10 |
|  |  |  | [26] METHANE_DENSITY_CH4 | 7-10 |
|  |  |  | [27] VOLATILE_ORGANIC_COMPOUND | 7-10 |
|  |  |  | [28] CARBON_MONOXIDE_CO_LEVEL | 7-10 |
|  |  |  | [29] SOIL_HUMIDITY | 7-10 |
|  |  |  | [2A] SOIL_REACTIVITY | 7-10 |
|  |  |  | [2B] SOIL_SALINITY | 7-10 |
|  |  |  | [2C] HEART_RATE | 7-10 |
|  |  |  | [2D] BLOOD_PRESSURE | 7-10 |
|  |  |  | [2E] MUSCLE_MASS | 7-10 |
|  |  |  | [2F] FAT_MASS | 7-10 |
|  |  |  | [30] BONE_MASS | 7-10 |
|  |  |  | [31] TOTAL_BODY_WATER_TBW | 7-10 |
|  |  |  | [32] BASIC_METABOLIC_RATE_BMR | 7-10 |
|  |  |  | [33] BODY_MASS_INDEX_BMI | 7-10 |
|  |  |  | [34] ACCELERATION_X_AXIS | 8-10 |
|  |  |  | [35] ACCELERATION_Y_AXIS | 8-10 |
|  |  |  | [36] ACCELERATION_Z_AXIS | 8-10 |
|  |  |  | [37] SMOKE_DENSITY | 8-10 |
|  |  |  | [38] WATER_FLOW | 9-10 |
|  |  |  | [39] WATER_PRESSURE | 9-10 |
|  |  |  | [3A] RF_SIGNAL_STRENGTH | 9-10 |
|  |  |  | [3B] PARTICULATE_MATTER | 10 |
|  |  |  | [3C] RESPIRATORY_RATE | 10 |
|  |  | Scale |  | 5-10 |
|  | [05] SENSOR_MULTILEVEL_REPORT |  |  | 1-10 |
|  |  | Sensor Type |  | 1-10 |
|  |  |  | [01] TEMPERATURE | 1-10 |
|  |  |  | [02] GENERAL_PURPOSE_VALUE | 1-10 |
|  |  |  | [03] LUMINANCE | 1-10 |
|  |  |  | [04] POWER | 2-10 |
|  |  |  | [05] RELATIVE_HUMIDITY | 2-10 |
|  |  |  | [06] VELOCITY | 2-10 |
|  |  |  | [07] DIRECTION | 2-10 |
|  |  |  | [08] ATMOSPHERIC_PRESSURE | 2-10 |
|  |  |  | [09] BAROMETRIC_PRESSURE | 2-10 |
|  |  |  | [0A] SOLAR_RADIATION | 2-10 |
|  |  |  | [0B] DEW_POINT | 2-10 |
|  |  |  | [0C] RAIN_RATE | 2-10 |
|  |  |  | [0D] TIDE_LEVEL | 2-10 |
|  |  |  | [0E] WEIGHT | 3-10 |
|  |  |  | [0F] VOLTAGE | 3-10 |
|  |  |  | [10] CURRENT | 3-10 |
|  |  |  | [11] CO2_LEVEL | 3-10 |
|  |  |  | [12] AIR_FLOW | 3-10 |
|  |  |  | [13] TANK_CAPACITY | 3-10 |
|  |  |  | [14] DISTANCE | 3-10 |
|  |  |  | [15] ANGLE_POSITION | 4-10 |
|  |  |  | [16] ROTATION | 5-10 |
|  |  |  | [17] WATER_TEMPERATURE | 5-10 |
|  |  |  | [18] SOIL_TEMPERATURE | 5-10 |
|  |  |  | [19] SEISMIC_INTENSITY | 5-10 |
|  |  |  | [1A] SEISMIC_MAGNITUDE | 5-10 |
|  |  |  | [1B] ULTRAVIOLET | 5-10 |
|  |  |  | [1C] ELECTRICAL_RESISTIVITY | 5-10 |
|  |  |  | [1D] ELECTRICAL_CONDUCTIVITY | 5-10 |
|  |  |  | [1E] LOUDNESS | 5-10 |
|  |  |  | [1F] MOISTURE | 5-10 |
|  |  |  | [20] FREQUENCY | 6-10 |
|  |  |  | [21] TIME | 6-10 |
|  |  |  | [22] TARGET_TEMPERATURE | 6-10 |
|  |  |  | [23] PARTICULATE_MATTER_2_5 | 7-10 |
|  |  |  | [24] FORMALDEHYDE_CH2O_LEVEL | 7-10 |
|  |  |  | [25] RADON_CONCENTRATION | 7-10 |
|  |  |  | [26] METHANE_DENSITY_CH4 | 7-10 |
|  |  |  | [27] VOLATILE_ORGANIC_COMPOUND | 7-10 |
|  |  |  | [28] CARBON_MONOXIDE_CO_LEVEL | 7-10 |
|  |  |  | [29] SOIL_HUMIDITY | 7-10 |
|  |  |  | [2A] SOIL_REACTIVITY | 7-10 |
|  |  |  | [2B] SOIL_SALINITY | 7-10 |
|  |  |  | [2C] HEART_RATE | 7-10 |
|  |  |  | [2D] BLOOD_PRESSURE | 7-10 |
|  |  |  | [2E] MUSCLE_MASS | 7-10 |
|  |  |  | [2F] FAT_MASS | 7-10 |
|  |  |  | [30] BONE_MASS | 7-10 |
|  |  |  | [31] TOTAL_BODY_WATER_TBW | 7-10 |
|  |  |  | [32] BASIC_METABOLIC_RATE_BMR | 7-10 |
|  |  |  | [33] BODY_MASS_INDEX_BMI | 7-10 |
|  |  |  | [34] ACCELERATION_X_AXIS | 8-10 |
|  |  |  | [35] ACCELERATION_Y_AXIS | 8-10 |
|  |  |  | [36] ACCELERATION_Z_AXIS | 8-10 |
|  |  |  | [37] SMOKE_DENSITY | 8-10 |
|  |  |  | [38] WATER_FLOW | 9-10 |
|  |  |  | [39] WATER_PRESSURE | 9-10 |
|  |  |  | [3A] RF_SIGNAL_STRENGTH | 9-10 |
|  |  |  | [3B] PARTICULATE_MATTER | 10 |
|  |  |  | [3C] RESPIRATORY_RATE | 10 |
|  |  | Size |  | 1-10 |
|  |  | Scale |  | 1-10 |
|  |  | Precision |  | 1-10 |
|  |  | Sensor Value |  | 1-10 |
|  | [06] SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT |  |  | 5-10 |
|  |  | Sensor Type |  | 5-10 |
|  |  |  | [01] TEMPERATURE | 5-10 |
|  |  |  | [02] GENERAL_PURPOSE_VALUE | 5-10 |
|  |  |  | [03] LUMINANCE | 5-10 |
|  |  |  | [04] POWER | 5-10 |
|  |  |  | [05] RELATIVE_HUMIDITY | 5-10 |
|  |  |  | [06] VELOCITY | 5-10 |
|  |  |  | [07] DIRECTION | 5-10 |
|  |  |  | [08] ATMOSPHERIC_PRESSURE | 5-10 |
|  |  |  | [09] BAROMETRIC_PRESSURE | 5-10 |
|  |  |  | [0A] SOLAR_RADIATION | 5-10 |
|  |  |  | [0B] DEW_POINT | 5-10 |
|  |  |  | [0C] RAIN_RATE | 5-10 |
|  |  |  | [0D] TIDE_LEVEL | 5-10 |
|  |  |  | [0E] WEIGHT | 5-10 |
|  |  |  | [0F] VOLTAGE | 5-10 |
|  |  |  | [10] CURRENT | 5-10 |
|  |  |  | [11] CO2_LEVEL | 5-10 |
|  |  |  | [12] AIR_FLOW | 5-10 |
|  |  |  | [13] TANK_CAPACITY | 5-10 |
|  |  |  | [14] DISTANCE | 5-10 |
|  |  |  | [15] ANGLE_POSITION | 5-10 |
|  |  |  | [16] ROTATION | 5-10 |
|  |  |  | [17] WATER_TEMPERATURE | 5-10 |
|  |  |  | [18] SOIL_TEMPERATURE | 5-10 |
|  |  |  | [19] SEISMIC_INTENSITY | 5-10 |
|  |  |  | [1A] SEISMIC_MAGNITUDE | 5-10 |
|  |  |  | [1B] ULTRAVIOLET | 5-10 |
|  |  |  | [1C] ELECTRICAL_RESISTIVITY | 5-10 |
|  |  |  | [1D] ELECTRICAL_CONDUCTIVITY | 5-10 |
|  |  |  | [1E] LOUDNESS | 5-10 |
|  |  |  | [1F] MOISTURE | 5-10 |
|  |  |  | [20] FREQUENCY | 6-10 |
|  |  |  | [21] TIME | 6-10 |
|  |  |  | [22] TARGET_TEMPERATURE | 6-10 |
|  |  |  | [23] PARTICULATE_MATTER_2_5 | 7-10 |
|  |  |  | [24] FORMALDEHYDE_CH2O_LEVEL | 7-10 |
|  |  |  | [25] RADON_CONCENTRATION | 7-10 |
|  |  |  | [26] METHANE_DENSITY_CH4 | 7-10 |
|  |  |  | [27] VOLATILE_ORGANIC_COMPOUND | 7-10 |
|  |  |  | [28] CARBON_MONOXIDE_CO_LEVEL | 7-10 |
|  |  |  | [29] SOIL_HUMIDITY | 7-10 |
|  |  |  | [2A] SOIL_REACTIVITY | 7-10 |
|  |  |  | [2B] SOIL_SALINITY | 7-10 |
|  |  |  | [2C] HEART_RATE | 7-10 |
|  |  |  | [2D] BLOOD_PRESSURE | 7-10 |
|  |  |  | [2E] MUSCLE_MASS | 7-10 |
|  |  |  | [2F] FAT_MASS | 7-10 |
|  |  |  | [30] BONE_MASS | 7-10 |
|  |  |  | [31] TOTAL_BODY_WATER_TBW | 7-10 |
|  |  |  | [32] BASIC_METABOLIC_RATE_BMR | 7-10 |
|  |  |  | [33] BODY_MASS_INDEX_BMI | 7-10 |
|  |  |  | [34] ACCELERATION_X_AXIS | 8-10 |
|  |  |  | [35] ACCELERATION_Y_AXIS | 8-10 |
|  |  |  | [36] ACCELERATION_Z_AXIS | 8-10 |
|  |  |  | [37] SMOKE_DENSITY | 8-10 |
|  |  |  | [38] WATER_FLOW | 9-10 |
|  |  |  | [39] WATER_PRESSURE | 9-10 |
|  |  |  | [3A] RF_SIGNAL_STRENGTH | 9-10 |
|  |  |  | [3B] PARTICULATE_MATTER | 10 |
|  |  |  | [3C] RESPIRATORY_RATE | 10 |
|  |  | Scale Bit Mask |  | 5-10 |
| [32] COMMAND_CLASS_METER |  |  |  | 4 |
|  | [01] METER_GET |  |  | 1-4 |
|  |  | Scale |  | 2-4 |
|  |  | Rate Type |  | 4 |
|  |  |  | [01] IMPORT | 4 |
|  |  |  | [02] EXPORT | 4 |
|  |  |  | [03] NOT_TO_BE_USED | 4 |
|  |  | Scale 2 |  | 4 |
|  | [02] METER_REPORT |  |  | 1-4 |
|  |  | Rate Type |  | 2-4 |
|  |  |  | [01] IMPORT | 4 |
|  |  |  | [02] EXPORT | 4 |
|  |  |  | [03] NOT_TO_BE_USED | 4 |
|  |  | Scale bit 2 |  | 3-4 |
|  |  | Meter Type |  | 1-4 |
|  |  |  | [01] ELECTRIC_METER | 1-1, 4-4 |
|  |  |  | [02] GAS_METER | 1-1, 4-4 |
|  |  |  | [03] WATER_METER | 1-1, 4-4 |
|  |  | Size |  | 1-4 |
|  |  | Scale |  | 1-2 |
|  |  | Scale bits 10 |  | 3-4 |
|  |  | Precision |  | 1-4 |
|  |  | Meter Value |  | 1-4 |
|  |  | Delta Time |  | 2-4 |
|  |  | Previous Meter Value |  | 2-4 |
|  |  | Scale 2 |  | 4 |
|  | [03] METER_SUPPORTED_GET |  |  | 2-4 |
|  | [04] METER_SUPPORTED_REPORT |  |  | 2-4 |
|  |  | Meter Type |  | 2-4 |
|  |  |  | [01] ELECTRIC_METER | 4 |
|  |  |  | [02] GAS_METER | 4 |
|  |  |  | [03] WATER_METER | 4 |
|  |  | Rate Type |  | 4 |
|  |  |  | [01] IMPORT_ONLY | 4 |
|  |  |  | [02] EXPORT_ONLY | 4 |
|  |  |  | [03] IMPORT_AND_EXPORT | 4 |
|  |  | Meter Reset |  | 2-4 |
|  |  | Scale Supported |  | 2-4 |
|  |  | More Scale Types |  | 4 |
|  |  | Number of Scale Supported Bytes to Follow |  | 4 |
|  |  | Scale Supported List |  | 4 |
|  | [05] METER_RESET |  |  | 2-4 |
| [33] COMMAND_CLASS_SWITCH_COLOR |  |  |  | 3 |
|  | [01] SWITCH_COLOR_SUPPORTED_GET |  |  | 1-3 |
|  | [02] SWITCH_COLOR_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | Color Component mask |  | 1-3 |
|  | [03] SWITCH_COLOR_GET |  |  | 1-3 |
|  |  | Color Component ID |  | 1-3 |
|  | [04] SWITCH_COLOR_REPORT |  |  | 1-3 |
|  |  | Color Component ID |  | 1-3 |
|  |  | Current Value |  | 1-3 |
|  |  | Target Value |  | 3 |
|  |  | Duration |  | 3 |
|  |  |  | [00] ALREADY_AT_THE_TARGET_VALUE | 3 |
|  |  |  | [FE] UNKNOWN_DURATION | 3 |
|  | [05] SWITCH_COLOR_SET |  |  | 1-3 |
|  |  | Color Component Count |  | 1-3 |
|  |  | Color Value |  | 1-3 |
|  |  | Duration |  | 2-3 |
|  |  |  | [00] INSTANTLY | 3 |
|  |  |  | [FF] DEFAULT | 3 |
|  | [06] SWITCH_COLOR_START_LEVEL_CHANGE |  |  | 1-3 |
|  |  | Res1 |  | 1-3 |
|  |  | Ignore Start State |  | 1-3 |
|  |  | Up/Down |  | 1-3 |
|  |  | Res2 |  | 1-3 |
|  |  | Color Component ID |  | 1-3 |
|  |  | Start Level |  | 1-3 |
|  |  | Duration |  | 3 |
|  |  |  | [00] INSTANTLY | 3 |
|  |  |  | [FF] DEFAULT | 3 |
|  | [07] SWITCH_COLOR_STOP_LEVEL_CHANGE |  |  | 1-3 |
|  |  | Color Component ID |  | 1-3 |
| [34] COMMAND_CLASS_NETWORK_MANAGEMENT_INCLUSION |  |  |  | 2 |
|  | [01] NODE_ADD |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Mode |  | 1-2 |
|  |  |  | [01] NODE_ADD_ANY | 1-2 |
|  |  |  | [02] NODE_ADD_CONTROLLER | 1-2 |
|  |  |  | [03] NODE_ADD_SLAVE | 1-2 |
|  |  |  | [04] NODE_ADD_EXISTING | 1-2 |
|  |  |  | [05] NODE_ADD_STOP | 1-2 |
|  |  |  | [06] NODE_ADD_STOP_FAILED | 1-2 |
|  |  |  | [07] NODE_ADD_ANY_S2 | 2 |
|  |  | tx Options |  | 1-2 |
|  |  |  | [01] ACK | 1-2 |
|  |  |  | [02] LOW_POWER | 1-2 |
|  |  |  | [04] AUTO_ROUTE | 1-2 |
|  |  |  | [10] NO_ROUTE | 1-2 |
|  |  |  | [20] EXPLORE | 1-2 |
|  |  |  | [40] NO_RETRANSMISSION | 1-2 |
|  |  |  | [80] HIGH_POWER | 1-2 |
|  | [02] NODE_ADD_STATUS |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [06] NODE_ADD_STATUS_DONE | 1-2 |
|  |  |  | [07] NODE_ADD_STATUS_FAILED | 1-2 |
|  |  |  | [09] NODE_ADD_STATUS_SECURITY_FAILED | 1-2 |
|  |  | New Node ID |  | 1-2 |
|  |  | Node Info Length |  | 1-2 |
|  |  | Capability |  | 1-2 |
|  |  | Listening |  | 1-2 |
|  |  | Security |  | 1-2 |
|  |  | Opt |  | 1-2 |
|  |  | Basic Device Class |  | 1-2 |
|  |  | Generic Device Class |  | 1-2 |
|  |  | Specific Device Class |  | 1-2 |
|  |  | Command Class |  | 1 |
|  |  | Non-Secure Command Class |  | 2 |
|  |  | Secure Command Class |  | 2 |
|  |  | Granted Keys |  | 2 |
|  |  | KEX Fail Type |  | 2 |
|  | [03] NODE_REMOVE |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Mode |  | 1-2 |
|  |  |  | [01] NODE_REMOVE_ANY | 1-2 |
|  |  |  | [02] NODE_REMOVE_CONTROLLER | 1-2 |
|  |  |  | [03] NODE_REMOVE_SLAVE | 1-2 |
|  |  |  | [05] NODE_REMOVE_STOP | 1-2 |
|  | [04] NODE_REMOVE_STATUS |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [06] NODE_REMOVE_STATUS_DONE | 1-2 |
|  |  |  | [07] NODE_REMOVE_STATUS_FAILED | 1-2 |
|  |  | NodeID |  | 1-2 |
|  | [07] FAILED_NODE_REMOVE |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Node ID |  | 1-2 |
|  | [08] FAILED_NODE_REMOVE_STATUS |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Node ID |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [00] FAILED_NODE_NOT_FOUND | 1-2 |
|  |  |  | [01] DONE | 1-2 |
|  |  |  | [02] FAILED_NODE_REMOVE_FAIL | 1-2 |
|  | [09] FAILED_NODE_REPLACE |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Node ID |  | 1-2 |
|  |  | tx Options |  | 1-2 |
|  |  |  | [01] ACK | 1-2 |
|  |  |  | [02] LOW_POWER | 1-2 |
|  |  |  | [04] AUTO_ROUTE | 1-2 |
|  |  |  | [10] NO_ROUTE | 1-2 |
|  |  |  | [20] EXPLORE | 1-2 |
|  |  |  | [40] NO_RETRANSMISSION | 1-2 |
|  |  |  | [80] HIGH_POWER | 1-2 |
|  |  | Mode |  | 1-2 |
|  | [0A] FAILED_NODE_REPLACE_STATUS |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [04] DONE | 1-2 |
|  |  |  | [05] FAILED_NODE_REPLACE_FAIL | 1-2 |
|  |  |  | [09] FAILED_NODE_REPLACE_SECURITY_FAILED | 1-2 |
|  |  | Node ID |  | 1-2 |
|  |  | Granted Keys |  | 2 |
|  |  | KEX Fail Type |  | 2 |
|  | [0B] NODE_NEIGHBOR_UPDATE_REQUEST |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Node ID |  | 1-2 |
|  | [0C] NODE_NEIGHBOR_UPDATE_STATUS |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [22] NEIGHBOR_UPDATE_STATUS_DONE | 1-2 |
|  |  |  | [23] NEIGHBOR_UPDATE_STATUS_FAIL | 1-2 |
|  | [0D] RETURN_ROUTE_ASSIGN |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Source Node ID |  | 1-2 |
|  |  | Destination Node ID |  | 1-2 |
|  | [0E] RETURN_ROUTE_ASSIGN_COMPLETE |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [00] TRANSMIT_COMPLETE_OK | 1-2 |
|  |  |  | [01] TRANSMIT_COMPLETE_NO_ACK | 1-2 |
|  |  |  | [02] TRANSMIT_COMPLETE_FAIL | 1-2 |
|  | [0F] RETURN_ROUTE_DELETE |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Node ID |  | 1-2 |
|  | [10] RETURN_ROUTE_DELETE_COMPLETE |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [00] TRANSMIT_COMPLETE_OK | 1-2 |
|  |  |  | [01] TRANSMIT_COMPLETE_NO_ACK | 1-2 |
|  |  |  | [02] TRANSMIT_COMPLETE_FAIL | 1-2 |
|  | [11] NODE_ADD_KEYS_REPORT |  |  | 2 |
|  |  | Seq No |  | 2 |
|  |  | Request Client-Side Authentication |  | 2 |
|  |  | Requested Keys |  | 2 |
|  | [12] NODE_ADD_KEYS_SET |  |  | 2 |
|  |  | Seq No |  | 2 |
|  |  | Accept |  | 2 |
|  |  | Grant Client-Side Authentication |  | 2 |
|  |  | Granted Keys |  | 2 |
|  | [13] NODE_ADD_DSK_REPORT |  |  | 2 |
|  |  | Seq No |  | 2 |
|  |  | Input DSK Length |  | 2 |
|  |  | DSK |  | 2 |
|  | [14] NODE_ADD_DSK_SET |  |  | 2 |
|  |  | Seq No |  | 2 |
|  |  | Input DSK Length |  | 2 |
|  |  | Accept |  | 2 |
|  |  | Input DSK |  | 2 |
| [35] COMMAND_CLASS_METER_PULSE |  |  |  | 1 |
|  | [04] METER_PULSE_GET |  |  | 1 |
|  | [05] METER_PULSE_REPORT |  |  | 1 |
|  |  | Pulse Count |  | 1 |
| [36] COMMAND_CLASS_BASIC_TARIFF_INFO |  |  |  | 1 |
|  | [01] BASIC_TARIFF_INFO_GET |  |  | 1 |
|  | [02] BASIC_TARIFF_INFO_REPORT |  |  | 1 |
|  |  | Total No. Import Rates |  | 1 |
|  |  | Dual |  | 1 |
|  |  | E1 Current Rate in Use |  | 1 |
|  |  | E1 Rate Consumption Register |  | 1 |
|  |  | E1 Time for Next Rate Hours |  | 1 |
|  |  | E1 Time for Next Rate Minutes |  | 1 |
|  |  | E1 Time for Next Rate Seconds |  | 1 |
|  |  | E2 Current Rate in Use |  | 1 |
|  |  | E2 Rate Consumption Register |  | 1 |
| [37] COMMAND_CLASS_HRV_STATUS |  |  |  | 1 |
|  | [01] HRV_STATUS_GET |  |  | 1 |
|  |  | Status Parameter |  | 1 |
|  |  |  | [00] OUTDOOR_AIR_TEMPERATURE | 1 |
|  |  |  | [01] SUPPLY_AIR_TEMPERATURE | 1 |
|  |  |  | [02] EXHAUST_AIR_TEMPERATURE | 1 |
|  |  |  | [03] DISCHARGE_AIR_TEMPERATURE | 1 |
|  |  |  | [04] ROOM_TEMPERATURE | 1 |
|  |  |  | [05] RELATIVE_HUMIDITY_IN_ROOM | 1 |
|  |  |  | [06] REMAINING_FILTER_LIFE | 1 |
|  | [02] HRV_STATUS_REPORT |  |  | 1 |
|  |  | Status Parameter |  | 1 |
|  |  |  | [00] OUTDOOR_AIR_TEMPERATURE | 1 |
|  |  |  | [01] SUPPLY_AIR_TEMPERATURE | 1 |
|  |  |  | [02] EXHAUST_AIR_TEMPERATURE | 1 |
|  |  |  | [03] DISCHARGE_AIR_TEMPERATURE | 1 |
|  |  |  | [04] ROOM_TEMPERATURE | 1 |
|  |  |  | [05] RELATIVE_HUMIDITY_IN_ROOM | 1 |
|  |  |  | [06] REMAINING_FILTER_LIFE | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [03] HRV_STATUS_SUPPORTED_GET |  |  | 1 |
|  | [04] HRV_STATUS_SUPPORTED_REPORT |  |  | 1 |
|  |  | Bit Mask |  | 1 |
|  |  |  | [00] OUTDOOR_AIR_TEMPERATURE | 1 |
|  |  |  | [01] SUPPLY_AIR_TEMPERATURE | 1 |
|  |  |  | [02] EXHAUST_AIR_TEMPERATURE | 1 |
|  |  |  | [03] DISCHARGE_AIR_TEMPERATURE | 1 |
|  |  |  | [04] ROOM_TEMPERATURE | 1 |
|  |  |  | [05] RELATIVE_HUMIDITY_IN_ROOM | 1 |
|  |  |  | [06] REMAINING_FILTER_LIFE | 1 |
| [38] COMMAND_CLASS_THERMOSTAT_HEATING |  |  |  | 1 |
|  | [01] THERMOSTAT_HEATING_MODE_SET |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] OFF_TIMED | 1 |
|  |  |  | [02] OFF_3_HOURS | 1 |
|  |  |  | [03] ANTI_FREEZE | 1 |
|  |  |  | [04] MANUAL | 1 |
|  |  |  | [05] TEMPORARY_MANUAL | 1 |
|  |  |  | [06] AUTOMATIC | 1 |
|  |  |  | [07] MANUAL_TIMED | 1 |
|  | [02] THERMOSTAT_HEATING_MODE_GET |  |  | 1 |
|  | [03] THERMOSTAT_HEATING_MODE_REPORT |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] OFF_TIMED | 1 |
|  |  |  | [02] OFF_3_HOURS | 1 |
|  |  |  | [03] ANTI_FREEZE | 1 |
|  |  |  | [04] MANUAL | 1 |
|  |  |  | [05] TEMPORARY_MANUAL | 1 |
|  |  |  | [06] AUTOMATIC | 1 |
|  |  |  | [07] MANUAL_TIMED | 1 |
|  | [04] THERMOSTAT_HEATING_SETPOINT_SET |  |  | 1 |
|  |  | Setpoint Nr |  | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [05] THERMOSTAT_HEATING_SETPOINT_GET |  |  | 1 |
|  |  | Setpoint Nr |  | 1 |
|  | [06] THERMOSTAT_HEATING_SETPOINT_REPORT |  |  | 1 |
|  |  | Setpoint Nr |  | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [09] THERMOSTAT_HEATING_RELAY_STATUS_GET |  |  | 1 |
|  | [0A] THERMOSTAT_HEATING_RELAY_STATUS_REPORT |  |  | 1 |
|  |  | Relay Status |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] ON | 1 |
|  | [0B] THERMOSTAT_HEATING_STATUS_SET |  |  | 1 |
|  |  | Status |  | 1 |
|  |  |  | [00] HEATING | 1 |
|  |  |  | [01] COOLING | 1 |
|  | [0C] THERMOSTAT_HEATING_STATUS_GET |  |  | 1 |
|  | [0D] THERMOSTAT_HEATING_STATUS_REPORT |  |  | 1 |
|  |  | Status |  | 1 |
|  |  |  | [00] HEATING | 1 |
|  |  |  | [01] COOLING | 1 |
|  | [11] THERMOSTAT_HEATING_TIMED_OFF_SET |  |  | 1 |
|  |  | Minutes |  | 1 |
|  |  | Hours |  | 1 |
| [39] COMMAND_CLASS_HRV_CONTROL |  |  |  | 1 |
|  | [01] HRV_CONTROL_MODE_SET |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] DEMAND_AUTOMATIC | 1 |
|  |  |  | [02] SCHEDULE | 1 |
|  |  |  | [03] ENERGY_SAVINGS_MODE | 1 |
|  |  |  | [04] MANUAL | 1 |
|  | [02] HRV_CONTROL_MODE_GET |  |  | 1 |
|  | [03] HRV_CONTROL_MODE_REPORT |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] DEMAND_AUTOMATIC | 1 |
|  |  |  | [02] SCHEDULE | 1 |
|  |  |  | [03] ENERGY_SAVINGS_MODE | 1 |
|  |  |  | [04] MANUAL | 1 |
|  | [04] HRV_CONTROL_BYPASS_SET |  |  | 1 |
|  |  | Bypass |  | 1 |
|  | [05] HRV_CONTROL_BYPASS_GET |  |  | 1 |
|  | [06] HRV_CONTROL_BYPASS_REPORT |  |  | 1 |
|  |  | Bypass |  | 1 |
|  | [07] HRV_CONTROL_VENTILATION_RATE_SET |  |  | 1 |
|  |  | Ventilation Rate |  | 1 |
|  | [08] HRV_CONTROL_VENTILATION_RATE_GET |  |  | 1 |
|  | [09] HRV_CONTROL_VENTILATION_RATE_REPORT |  |  | 1 |
|  |  | Ventilation Rate |  | 1 |
|  | [0A] HRV_CONTROL_MODE_SUPPORTED_GET |  |  | 1 |
|  | [0B] HRV_CONTROL_MODE_SUPPORTED_REPORT |  |  | 1 |
|  |  | Manual Control Supported |  | 1 |
|  |  |  | [00] BYPASS_OPEN_CLOSE | 1 |
|  |  |  | [01] BYPASS_AUTO | 1 |
|  |  |  | [02] MODULATED_BYPASS | 1 |
|  |  |  | [03] VENTILATION_RATE | 1 |
|  |  | Bit Mask |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] DEMAND_AUTOMATIC | 1 |
|  |  |  | [02] SCHEDULE | 1 |
|  |  |  | [03] ENERGY_SAVINGS_MODE | 1 |
|  |  |  | [04] MANUAL | 1 |
| [3A] COMMAND_CLASS_DCP_CONFIG |  |  |  | 1 |
|  | [01] DCP_LIST_SUPPORTED_GET |  |  | 1 |
|  | [02] DCP_LIST_SUPPORTED_REPORT |  |  | 1 |
|  |  | DCP List Size |  | 1 |
|  |  | Free DCP List entries |  | 1 |
|  | [03] DCP_LIST_SET |  |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour Local Time |  | 1 |
|  |  | Minute Local Time |  | 1 |
|  |  | Second Local Time |  | 1 |
|  |  | DCP Rate ID |  | 1 |
|  |  | Number of DC |  | 1 |
|  |  | Device Class |  | 1 |
|  |  | Start Year |  | 1 |
|  |  | Start Month |  | 1 |
|  |  | Start Day |  | 1 |
|  |  | Start Hour Local Time |  | 1 |
|  |  | Start Minute Local Time |  | 1 |
|  |  | Start Second Local Time |  | 1 |
|  |  | Duration Hour Time |  | 1 |
|  |  | Duration Minute Time |  | 1 |
|  |  | Duration Second Time |  | 1 |
|  |  | Event Priority |  | 1 |
|  |  | Load shedding |  | 1 |
|  |  | Start Association Group |  | 1 |
|  |  | Stop Association Group |  | 1 |
|  |  | Randomization interval |  | 1 |
|  | [04] DCP_LIST_REMOVE |  |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour Local Time |  | 1 |
|  |  | Minute Local Time |  | 1 |
|  |  | Second Local Time |  | 1 |
| [3B] COMMAND_CLASS_DCP_MONITOR |  |  |  | 1 |
|  | [01] DCP_LIST_GET |  |  | 1 |
|  | [02] DCP_LIST_REPORT |  |  | 1 |
|  |  | Reports to Follow |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour Local Time |  | 1 |
|  |  | Minute Local Time |  | 1 |
|  |  | Second Local Time |  | 1 |
|  |  | DCP ID |  | 1 |
|  |  | Number of DC |  | 1 |
|  |  | Device Class |  | 1 |
|  |  | Start Year |  | 1 |
|  |  | Start Month |  | 1 |
|  |  | Start Day |  | 1 |
|  |  | Start Hour Local Time |  | 1 |
|  |  | Start Minute Local Time |  | 1 |
|  |  | Start Second Local Time |  | 1 |
|  |  | Duration Hour Time |  | 1 |
|  |  | Duration Minute Time |  | 1 |
|  |  | Duration Second Time |  | 1 |
|  |  | Event Priority |  | 1 |
|  |  | Load shedding |  | 1 |
|  |  | Start Association Group |  | 1 |
|  |  | Stop Association Group |  | 1 |
|  |  | Randomization interval |  | 1 |
|  | [03] DCP_EVENT_STATUS_GET |  |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour Local Time |  | 1 |
|  |  | Minute Local Time |  | 1 |
|  |  | Second Local Time |  | 1 |
|  | [04] DCP_EVENT_STATUS_REPORT |  |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour Local Time |  | 1 |
|  |  | Minute Local Time |  | 1 |
|  |  | Second Local Time |  | 1 |
|  |  | Event status |  | 1 |
|  |  |  | [01] EVENT_STARTED | 1 |
|  |  |  | [02] EVENT_COMPLETED | 1 |
|  |  |  | [03] EVENT_REJECTED | 1 |
|  |  |  | [04] EVENT_NOT_APPLICABLE | 1 |
| [3C] COMMAND_CLASS_METER_TBL_CONFIG |  |  |  | 1 |
|  | [01] METER_TBL_TABLE_POINT_ADM_NO_SET |  |  | 1 |
|  |  | Number of Characters |  | 1 |
|  |  | Meter Point Adm Number Character |  | 1 |
| [3D] COMMAND_CLASS_METER_TBL_MONITOR |  |  |  | 2 |
|  | [01] METER_TBL_TABLE_POINT_ADM_NO_GET |  |  | 1-2 |
|  | [02] METER_TBL_TABLE_POINT_ADM_NO_REPORT |  |  | 1-2 |
|  |  | Number of Characters |  | 1-2 |
|  |  | Meter Point Adm Number Character |  | 1-2 |
|  | [03] METER_TBL_TABLE_ID_GET |  |  | 1-2 |
|  | [04] METER_TBL_TABLE_ID_REPORT |  |  | 1-2 |
|  |  | Number of Characters |  | 1-2 |
|  |  | Meter ID Character |  | 1-2 |
|  | [05] METER_TBL_TABLE_CAPABILITY_GET |  |  | 1-2 |
|  | [06] METER_TBL_REPORT |  |  | 1-2 |
|  |  | Meter Type |  | 1-2 |
|  |  | Rate Type |  | 1-2 |
|  |  | Pay Meter |  | 1-2 |
|  |  |  | [01] CREDITMETER | 1-2 |
|  |  |  | [02] PREPAYMENT_METER | 1-2 |
|  |  |  | [03] PREPAYMENT_METER_DEBT | 1-2 |
|  |  | Dataset Supported |  | 1-2 |
|  |  | Dataset History Supported |  | 1-2 |
|  |  | Data History Supported |  | 1-2 |
|  | [07] METER_TBL_STATUS_SUPPORTED_GET |  |  | 1-2 |
|  | [08] METER_TBL_STATUS_SUPPORTED_REPORT |  |  | 1-2 |
|  |  | Supported Operating Status |  | 1-2 |
|  |  | Status Event Log Depth |  | 1-2 |
|  | [09] METER_TBL_STATUS_DEPTH_GET |  |  | 1-2 |
|  |  | Status Event Log Depth |  | 1-2 |
|  | [0A] METER_TBL_STATUS_DATE_GET |  |  | 1-2 |
|  |  | Maximum Reports |  | 1-2 |
|  |  | Start Year |  | 1-2 |
|  |  | Start Month |  | 1-2 |
|  |  | Start Day |  | 1-2 |
|  |  | Start Hour Local Time |  | 1-2 |
|  |  | Start Minute Local Time |  | 1-2 |
|  |  | Start Second Local Time |  | 1-2 |
|  |  | Stop Year |  | 1-2 |
|  |  | Stop Month |  | 1-2 |
|  |  | Stop Day |  | 1-2 |
|  |  | Stop Hour Local Time |  | 1-2 |
|  |  | Stop Minute Local Time |  | 1-2 |
|  |  | Stop Second Local Time |  | 1-2 |
|  | [0B] METER_TBL_STATUS_REPORT |  |  | 1-2 |
|  |  | Reports to follow |  | 1-2 |
|  |  | Current Operating Status |  | 1-2 |
|  |  | Meter Table Status |  | 1-2 |
|  | [0C] METER_TBL_CURRENT_DATA_GET |  |  | 1-2 |
|  |  | Dataset Requested |  | 1-2 |
|  | [0D] METER_TBL_CURRENT_DATA_REPORT |  |  | 1-2 |
|  |  | Reports to Follow |  | 1-2 |
|  |  | Rate Type |  | 1-2 |
|  |  | Operating Status Indication |  | 2 |
|  |  | Dataset |  | 1-2 |
|  |  | Year |  | 1-2 |
|  |  | Month |  | 1-2 |
|  |  | Day |  | 1-2 |
|  |  | Hour Local Time |  | 1-2 |
|  |  | Minute Local Time |  | 1-2 |
|  |  | Second Local Time |  | 1-2 |
|  |  | Meter Table Value |  | 1-2 |
|  | [0E] METER_TBL_HISTORICAL_DATA_GET |  |  | 1-2 |
|  |  | Maximum Reports |  | 1-2 |
|  |  | Historical Dataset Requested |  | 1-2 |
|  |  | Start Year |  | 1-2 |
|  |  | Start Month |  | 1-2 |
|  |  | Start Day |  | 1-2 |
|  |  | Start Hour Local Time |  | 1-2 |
|  |  | Start Minute Local Time |  | 1-2 |
|  |  | Start Second Local Time |  | 1-2 |
|  |  | Stop Year |  | 1-2 |
|  |  | Stop Month |  | 1-2 |
|  |  | Stop Day |  | 1-2 |
|  |  | Stop Hour Local Time |  | 1-2 |
|  |  | Stop Minute Local Time |  | 1-2 |
|  |  | Stop Second Local Time |  | 1-2 |
|  | [0F] METER_TBL_HISTORICAL_DATA_REPORT |  |  | 1-2 |
|  |  | Reports to Follow |  | 1-2 |
|  |  | Rate Type |  | 1-2 |
|  |  | Operating Status Indication |  | 2 |
|  |  | Dataset |  | 1-2 |
|  |  | Year |  | 1-2 |
|  |  | Month |  | 1-2 |
|  |  | Day |  | 1-2 |
|  |  | Hour Local Time |  | 1-2 |
|  |  | Minute Local Time |  | 1-2 |
|  |  | Second Local Time |  | 1-2 |
|  |  | Meter Table Value |  | 1-2 |
| [3E] COMMAND_CLASS_METER_TBL_PUSH |  |  |  | 1 |
|  | [01] METER_TBL_PUSH_CONFIGURATION_SET |  |  | 1 |
|  |  | Operating Status Push Mode |  | 1 |
|  |  | PS |  | 1 |
|  |  | Push Dataset |  | 1 |
|  |  | Interval Months |  | 1 |
|  |  | Interval Days |  | 1 |
|  |  | Interval Hours |  | 1 |
|  |  | Interval Minutes |  | 1 |
|  |  | Push Node ID |  | 1 |
|  | [02] METER_TBL_PUSH_CONFIGURATION_GET |  |  | 1 |
|  | [03] METER_TBL_PUSH_CONFIGURATION_REPORT |  |  | 1 |
|  |  | Operating Status Push Mode |  | 1 |
|  |  | PS |  | 1 |
|  |  | Push Dataset |  | 1 |
|  |  | Interval Months |  | 1 |
|  |  | Interval Days |  | 1 |
|  |  | Interval Hours |  | 1 |
|  |  | Interval Minutes |  | 1 |
|  |  | Push Node ID |  | 1 |
| [3F] COMMAND_CLASS_PREPAYMENT |  |  |  | 1 |
|  | [01] PREPAYMENT_BALANCE_GET |  |  | 1 |
|  |  | Balance Type |  | 1 |
|  |  |  | [00] UTILITY | 1 |
|  |  |  | [01] MONETARY | 1 |
|  | [02] PREPAYMENT_BALANCE_REPORT |  |  | 1 |
|  |  | Meter type |  | 1 |
|  |  | Balance Type |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Balance Precision |  | 1 |
|  |  | Balance Value |  | 1 |
|  |  | Debt Precision |  | 1 |
|  |  | Debt |  | 1 |
|  |  | Emer Credit Precision |  | 1 |
|  |  | Emer Credit |  | 1 |
|  |  | Currency |  | 1 |
|  |  | Debt Recovery Percentage |  | 1 |
|  | [03] PREPAYMENT_SUPPORTED_GET |  |  | 1 |
|  | [04] PREPAYMENT_SUPPORTED_REPORT |  |  | 1 |
|  |  | Types Supported |  | 1 |
| [40] COMMAND_CLASS_THERMOSTAT_MODE |  |  |  | 3 |
|  | [01] THERMOSTAT_MODE_SET |  |  | 1-3 |
|  |  | Mode |  | 1-3 |
|  |  |  | [00] OFF | 1-3 |
|  |  |  | [01] HEAT | 1-3 |
|  |  |  | [02] COOL | 1-3 |
|  |  |  | [03] AUTO | 1-3 |
|  |  |  | [04] AUXILIARY_HEAT | 1-3 |
|  |  |  | [05] RESUME | 1-3 |
|  |  |  | [06] FAN_ONLY | 1-3 |
|  |  |  | [07] FURNACE | 1-3 |
|  |  |  | [08] DRY_AIR | 1-3 |
|  |  |  | [09] MOIST_AIR | 1-3 |
|  |  |  | [0A] AUTO_CHANGEOVER | 1-3 |
|  |  |  | [0B] ENERGY_SAVE_HEAT | 2-3 |
|  |  |  | [0C] ENERGY_SAVE_COOL | 2-3 |
|  |  |  | [0D] AWAY | 2-3 |
|  |  |  | [0F] FULL_POWER | 3 |
|  |  |  | [1F] MANUFACTURER_SPECIFC | 3 |
|  |  | No of Manufacturer Data fields |  | 3 |
|  |  | Manufacturer Data |  | 3 |
|  | [02] THERMOSTAT_MODE_GET |  |  | 1-3 |
|  | [03] THERMOSTAT_MODE_REPORT |  |  | 1-3 |
|  |  | Mode |  | 1-3 |
|  |  |  | [00] OFF | 1-3 |
|  |  |  | [01] HEAT | 1-3 |
|  |  |  | [02] COOL | 1-3 |
|  |  |  | [03] AUTO | 1-3 |
|  |  |  | [04] AUXILIARY_HEAT | 1-3 |
|  |  |  | [05] RESUME | 1-3 |
|  |  |  | [06] FAN_ONLY | 1-3 |
|  |  |  | [07] FURNACE | 1-3 |
|  |  |  | [08] DRY_AIR | 1-3 |
|  |  |  | [09] MOIST_AIR | 1-3 |
|  |  |  | [0A] AUTO_CHANGEOVER | 1-3 |
|  |  |  | [0B] ENERGY_SAVE_HEAT | 2-3 |
|  |  |  | [0C] ENERGY_SAVE_COOL | 2-3 |
|  |  |  | [0D] AWAY | 2-3 |
|  |  |  | [0F] FULL_POWER | 3 |
|  |  |  | [1F] MANUFACTURER_SPECIFC | 3 |
|  |  | No of Manufacturer Data fields |  | 3 |
|  |  | Manufacturer Data |  | 3 |
|  | [04] THERMOSTAT_MODE_SUPPORTED_GET |  |  | 1-3 |
|  | [05] THERMOSTAT_MODE_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | Bit Mask |  | 1-3 |
|  |  |  | [00] OFF | 1-3 |
|  |  |  | [01] HEAT | 1-3 |
|  |  |  | [02] COOL | 1-3 |
|  |  |  | [03] AUTO | 1-3 |
|  |  |  | [04] AUXILIARY_EMERGENCY_HEAT | 1-3 |
|  |  |  | [05] RESUME | 1-3 |
|  |  |  | [06] FAN_ONLY | 1-3 |
|  |  |  | [07] FURNACE | 1-3 |
|  |  |  | [08] DRY_AIR | 1-3 |
|  |  |  | [09] MOIST_AIR | 1-3 |
|  |  |  | [0A] AUTO_CHANGEOVER | 1-3 |
|  |  |  | [0B] ENERGY_SAVE_HEAT | 2-3 |
|  |  |  | [0C] ENERGY_SAVE_COOL | 2-3 |
|  |  |  | [0D] AWAY | 2-3 |
|  |  |  | [0F] FULL_POWER | 3 |
|  |  |  | [1F] MANUFACTURER_SPECIFC | 3 |
| [41] COMMAND_CLASS_PREPAYMENT_ENCAPSULATION |  |  |  | 1 |
|  | [01] CMD_ENCAPSULATION |  |  | 1 |
|  |  | Data |  | 1 |
| [42] COMMAND_CLASS_THERMOSTAT_OPERATING_STATE |  |  |  | 2 |
|  | [01] THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET |  |  | 2 |
|  | [02] THERMOSTAT_OPERATING_STATE_GET |  |  | 1-2 |
|  | [03] THERMOSTAT_OPERATING_STATE_REPORT |  |  | 1-2 |
|  |  | Operating State |  | 1-2 |
|  |  |  | [00] IDLE | 1-2 |
|  |  |  | [01] HEATING | 1-2 |
|  |  |  | [02] COOLING | 1-2 |
|  |  |  | [03] FAN_ONLY | 1-2 |
|  |  |  | [04] PENDING_HEAT | 1-2 |
|  |  |  | [05] PENDING_COOL | 1-2 |
|  |  |  | [06] VENT_ECONOMIZER | 1-2 |
|  |  |  | [07] AUX_HEATING | 2 |
|  |  |  | [08] 2ND_STAGE_HEATING | 2 |
|  |  |  | [09] 2ND_STAGE_COOLING | 2 |
|  |  |  | [0A] 2ND_STAGE_AUX_HEAT | 2 |
|  |  |  | [0B] 3RD_STAGE_AUX_HEAT | 2 |
|  | [04] THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT |  |  | 2 |
|  |  | Bit Mask |  | 2 |
|  |  |  | [00] IDLE | 2 |
|  |  |  | [01] HEATING | 2 |
|  |  |  | [02] COOLING | 2 |
|  |  |  | [03] FAN_ONLY | 2 |
|  |  |  | [04] PENDING_HEAT | 2 |
|  |  |  | [05] PENDING_COOL | 2 |
|  |  |  | [06] VENT_ECONOMIZER | 2 |
|  |  |  | [07] AUX_HEATING | 2 |
|  |  |  | [08] 2ND_STAGE_HEATING | 2 |
|  |  |  | [09] 2ND_STAGE_COOLING | 2 |
|  |  |  | [0A] 2ND_STAGE_AUX_HEAT | 2 |
|  |  |  | [0B] 3RD_STAGE_AUX_HEAT | 2 |
|  | [05] THERMOSTAT_OPERATING_STATE_LOGGING_GET |  |  | 2 |
|  |  | Bit Mask |  | 2 |
|  |  |  | [00] IDLE | 2 |
|  |  |  | [01] HEATING | 2 |
|  |  |  | [02] COOLING | 2 |
|  |  |  | [03] FAN_ONLY | 2 |
|  |  |  | [04] PENDING_HEAT | 2 |
|  |  |  | [05] PENDING_COOL | 2 |
|  |  |  | [06] VENT_ECONOMIZER | 2 |
|  |  |  | [07] AUX_HEATING | 2 |
|  |  |  | [08] 2ND_STAGE_HEATING | 2 |
|  |  |  | [09] 2ND_STAGE_COOLING | 2 |
|  |  |  | [0A] 2ND_STAGE_AUX_HEAT | 2 |
|  |  |  | [0B] 3RD_STAGE_AUX_HEAT | 2 |
|  | [06] THERMOSTAT_OPERATING_STATE_LOGGING_REPORT |  |  | 2 |
|  |  | Reports to Follow |  | 2 |
|  |  | Thermostat Log Report |  | 2 |
| [43] COMMAND_CLASS_THERMOSTAT_SETPOINT |  |  |  | 3 |
|  | [01] THERMOSTAT_SETPOINT_SET |  |  | 1-3 |
|  |  | Setpoint Type |  | 1-3 |
|  |  |  | [00] NOT_SUPPORTED | 1-3 |
|  |  |  | [01] HEATING_1 | 1-3 |
|  |  |  | [02] COOLING_1 | 1-3 |
|  |  |  | [03] NOT_SUPPORTED1 | 1-3 |
|  |  |  | [04] NOT_SUPPORTED2 | 1-3 |
|  |  |  | [05] NOT_SUPPORTED3 | 1-3 |
|  |  |  | [06] NOT_SUPPORTED4 | 1-3 |
|  |  |  | [07] FURNACE | 1-3 |
|  |  |  | [08] DRY_AIR | 1-3 |
|  |  |  | [09] MOIST_AIR | 1-3 |
|  |  |  | [0A] AUTO_CHANGEOVER | 1-3 |
|  |  |  | [0B] ENERGY_SAVE_HEATING | 2-3 |
|  |  |  | [0C] ENERGY_SAVE_COOLING | 2-3 |
|  |  |  | [0D] AWAY_HEATING | 2-3 |
|  |  |  | [0E] AWAY_COOLING | 3 |
|  |  |  | [0F] FULL_POWER | 3 |
|  |  | Size |  | 1-3 |
|  |  | Scale |  | 1-3 |
|  |  | Precision |  | 1-3 |
|  |  | Value |  | 1-3 |
|  | [02] THERMOSTAT_SETPOINT_GET |  |  | 1-3 |
|  |  | Setpoint Type |  | 1-3 |
|  |  |  | [00] NOT_SUPPORTED | 1-3 |
|  |  |  | [01] HEATING_1 | 1-3 |
|  |  |  | [02] COOLING_1 | 1-3 |
|  |  |  | [03] NOT_SUPPORTED1 | 1-3 |
|  |  |  | [04] NOT_SUPPORTED2 | 1-3 |
|  |  |  | [05] NOT_SUPPORTED3 | 1-3 |
|  |  |  | [06] NOT_SUPPORTED4 | 1-3 |
|  |  |  | [07] FURNACE | 1-3 |
|  |  |  | [08] DRY_AIR | 1-3 |
|  |  |  | [09] MOIST_AIR | 1-3 |
|  |  |  | [0A] AUTO_CHANGEOVER | 1-3 |
|  |  |  | [0B] ENERGY_SAVE_HEATING | 2-3 |
|  |  |  | [0C] ENERGY_SAVE_COOLING | 2-3 |
|  |  |  | [0D] AWAY_HEATING | 2-3 |
|  |  |  | [0E] AWAY_COOLING | 3 |
|  |  |  | [0F] FULL_POWER | 3 |
|  | [03] THERMOSTAT_SETPOINT_REPORT |  |  | 1-3 |
|  |  | Setpoint Type |  | 1-3 |
|  |  |  | [00] NOT_SUPPORTED | 1-3 |
|  |  |  | [01] HEATING_1 | 1-3 |
|  |  |  | [02] COOLING_1 | 1-3 |
|  |  |  | [03] NOT_SUPPORTED1 | 1-3 |
|  |  |  | [04] NOT_SUPPORTED2 | 1-3 |
|  |  |  | [05] NOT_SUPPORTED3 | 1-3 |
|  |  |  | [06] NOT_SUPPORTED4 | 1-3 |
|  |  |  | [07] FURNACE | 1-3 |
|  |  |  | [08] DRY_AIR | 1-3 |
|  |  |  | [09] MOIST_AIR | 1-3 |
|  |  |  | [0A] AUTO_CHANGEOVER | 1-3 |
|  |  |  | [0B] ENERGY_SAVE_HEATING | 2-3 |
|  |  |  | [0C] ENERGY_SAVE_COOLING | 2-3 |
|  |  |  | [0D] AWAY_HEATING | 2-3 |
|  |  |  | [0E] AWAY_COOLING | 3 |
|  |  |  | [0F] FULL_POWER | 3 |
|  |  | Size |  | 1-3 |
|  |  | Scale |  | 1-3 |
|  |  | Precision |  | 1-3 |
|  |  | Value |  | 1-3 |
|  | [04] THERMOSTAT_SETPOINT_SUPPORTED_GET |  |  | 1-3 |
|  | [05] THERMOSTAT_SETPOINT_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | Bit Mask |  | 1-3 |
|  |  |  | [00] NONE | 1-3 |
|  |  |  | [01] HEATING | 1-3 |
|  |  |  | [02] COOLING | 1-3 |
|  |  |  | [07] FURNACE | 1-3 |
|  |  |  | [08] DRY_AIR | 1-3 |
|  |  |  | [09] MOIST_AIR | 1-3 |
|  |  |  | [0A] AUTO_CHANGEOVER | 1-3 |
|  |  |  | [0B] ENERGY_SAVE_HEATING | 2-3 |
|  |  |  | [0C] ENERGY_SAVE_COOLING | 2-3 |
|  |  |  | [0D] AWAY_HEATING | 2-3 |
|  |  |  | [0E] AWAY_COOLING | 3 |
|  |  |  | [0F] FULL_POWER | 3 |
|  | [09] THERMOSTAT_SETPOINT_CAPABILITIES_GET |  |  | 3 |
|  |  | Setpoint Type |  | 3 |
|  |  |  | [00] NOT_SUPPORTED | 3 |
|  |  |  | [01] HEATING_1 | 3 |
|  |  |  | [02] COOLING_1 | 3 |
|  |  |  | [03] NOT_SUPPORTED1 | 3 |
|  |  |  | [04] NOT_SUPPORTED2 | 3 |
|  |  |  | [05] NOT_SUPPORTED3 | 3 |
|  |  |  | [06] NOT_SUPPORTED4 | 3 |
|  |  |  | [07] FURNACE | 3 |
|  |  |  | [08] DRY_AIR | 3 |
|  |  |  | [09] MOIST_AIR | 3 |
|  |  |  | [0A] AUTO_CHANGEOVER | 3 |
|  |  |  | [0B] ENERGY_SAVE_HEATING | 3 |
|  |  |  | [0C] ENERGY_SAVE_COOLING | 3 |
|  |  |  | [0D] AWAY_HEATING | 3 |
|  |  |  | [0E] AWAY_COOLING | 3 |
|  |  |  | [0F] FULL_POWER | 3 |
|  | [0A] THERMOSTAT_SETPOINT_CAPABILITIES_REPORT |  |  | 3 |
|  |  | Setpoint Type |  | 3 |
|  |  |  | [00] NOT_SUPPORTED | 3 |
|  |  |  | [01] HEATING_1 | 3 |
|  |  |  | [02] COOLING_1 | 3 |
|  |  |  | [03] NOT_SUPPORTED1 | 3 |
|  |  |  | [04] NOT_SUPPORTED2 | 3 |
|  |  |  | [05] NOT_SUPPORTED3 | 3 |
|  |  |  | [06] NOT_SUPPORTED4 | 3 |
|  |  |  | [07] FURNACE | 3 |
|  |  |  | [08] DRY_AIR | 3 |
|  |  |  | [09] MOIST_AIR | 3 |
|  |  |  | [0A] AUTO_CHANGEOVER | 3 |
|  |  |  | [0B] ENERGY_SAVE_HEATING | 3 |
|  |  |  | [0C] ENERGY_SAVE_COOLING | 3 |
|  |  |  | [0D] AWAY_HEATING | 3 |
|  |  |  | [0E] AWAY_COOLING | 3 |
|  |  |  | [0F] FULL_POWER | 3 |
|  |  | Size1 |  | 3 |
|  |  | Scale1 |  | 3 |
|  |  | Precision1 |  | 3 |
|  |  | Min Value |  | 3 |
|  |  | Size2 |  | 3 |
|  |  | Scale2 |  | 3 |
|  |  | Precision2 |  | 3 |
|  |  | MaxValue |  | 3 |
| [44] COMMAND_CLASS_THERMOSTAT_FAN_MODE |  |  |  | 4 |
|  | [01] THERMOSTAT_FAN_MODE_SET |  |  | 1-4 |
|  |  | Fan Mode |  | 1-4 |
|  |  |  | [00] AUTO_LOW | 1-4 |
|  |  |  | [01] LOW | 1-4 |
|  |  |  | [02] AUTO_HIGH | 1-4 |
|  |  |  | [03] HIGH | 1-4 |
|  |  |  | [04] AUTO_MEDIUM | 2-4 |
|  |  |  | [05] MEDIUM | 2-4 |
|  |  |  | [06] CIRCULATION | 3-4 |
|  |  |  | [07] HUMIDITY | 3-4 |
|  |  |  | [08] LEFT_RIGHT | 4 |
|  |  |  | [09] UP_DOWN | 4 |
|  |  |  | [0A] QUIET | 4 |
|  |  | Off |  | 2-4 |
|  | [02] THERMOSTAT_FAN_MODE_GET |  |  | 1-4 |
|  | [03] THERMOSTAT_FAN_MODE_REPORT |  |  | 1-4 |
|  |  | Fan Mode |  | 1-4 |
|  |  |  | [00] AUTO_LOW | 1-4 |
|  |  |  | [01] LOW | 1-4 |
|  |  |  | [02] AUTO_HIGH | 1-4 |
|  |  |  | [03] HIGH | 1-4 |
|  |  |  | [04] AUTO_MEDIUM | 2-4 |
|  |  |  | [05] MEDIUM | 2-4 |
|  |  |  | [06] CIRCULATION | 3-4 |
|  |  |  | [07] HUMIDITY | 3-4 |
|  |  |  | [08] LEFT_RIGHT | 4 |
|  |  |  | [09] UP_DOWN | 4 |
|  |  |  | [0A] QUIET | 4 |
|  |  | Off |  | 3-4 |
|  | [04] THERMOSTAT_FAN_MODE_SUPPORTED_GET |  |  | 1-4 |
|  | [05] THERMOSTAT_FAN_MODE_SUPPORTED_REPORT |  |  | 1-4 |
|  |  | Bit Mask |  | 1-4 |
|  |  |  | [00] AUTO | 1-4 |
|  |  |  | [01] ON | 1-4 |
|  |  |  | [02] AUTO_HIGH | 1-4 |
|  |  |  | [03] ON_HIGH | 1-4 |
|  |  |  | [04] AUTO_MEDIUM | 2-4 |
|  |  |  | [05] MEDIUM | 2-4 |
|  |  |  | [06] CIRCULATION | 3-4 |
|  |  |  | [07] HUMIDITY_CIRCULATION | 3-4 |
|  |  |  | [08] LEFT_RIGHT | 4 |
|  |  |  | [09] UP_DOWN | 4 |
|  |  |  | [0A] QUIET | 4 |
| [45] COMMAND_CLASS_THERMOSTAT_FAN_STATE |  |  |  | 2 |
|  | [02] THERMOSTAT_FAN_STATE_GET |  |  | 1-2 |
|  | [03] THERMOSTAT_FAN_STATE_REPORT |  |  | 1-2 |
|  |  | Fan Operating State |  | 1-2 |
|  |  |  | [00] IDLE | 1-2 |
|  |  |  | [01] RUNNING | 1-2 |
|  |  |  | [02] RUNNING_HIGH | 2 |
|  |  |  | [03] RUNNING_MEDIUM | 2 |
|  |  |  | [04] CIRCULATION | 2 |
|  |  |  | [05] HUMIDITY_CIRCULATION | 2 |
|  |  |  | [06] RIGHT_LEFT_CIRCULATION | 2 |
|  |  |  | [07] UP_DOWN_CIRCULATION | 2 |
|  |  |  | [08] QUIET_CIRCULATION | 2 |
| [46] COMMAND_CLASS_CLIMATE_CONTROL_SCHEDULE |  |  |  | 1 |
|  | [01] SCHEDULE_SET |  |  | 1 |
|  |  | Weekday |  | 1 |
|  |  | Switchpoint 0 |  | 1 |
|  |  | Switchpoint 1 |  | 1 |
|  |  | Switchpoint 2 |  | 1 |
|  |  | Switchpoint 3 |  | 1 |
|  |  | Switchpoint 4 |  | 1 |
|  |  | Switchpoint 5 |  | 1 |
|  |  | Switchpoint 6 |  | 1 |
|  |  | Switchpoint 7 |  | 1 |
|  |  | Switchpoint 8 |  | 1 |
|  | [02] SCHEDULE_GET |  |  | 1 |
|  |  | Weekday |  | 1 |
|  | [03] SCHEDULE_REPORT |  |  | 1 |
|  |  | Weekday |  | 1 |
|  |  | Switchpoint 0 |  | 1 |
|  |  | Switchpoint 1 |  | 1 |
|  |  | Switchpoint 2 |  | 1 |
|  |  | Switchpoint 3 |  | 1 |
|  |  | Switchpoint 4 |  | 1 |
|  |  | Switchpoint 5 |  | 1 |
|  |  | Switchpoint 6 |  | 1 |
|  |  | Switchpoint 7 |  | 1 |
|  |  | Switchpoint 8 |  | 1 |
|  | [04] SCHEDULE_CHANGED_GET |  |  | 1 |
|  | [05] SCHEDULE_CHANGED_REPORT |  |  | 1 |
|  |  | ChangeCounter |  | 1 |
|  | [06] SCHEDULE_OVERRIDE_SET |  |  | 1 |
|  |  | Override Type |  | 1 |
|  |  | Override State |  | 1 |
|  |  |  | [00] NO_OVERRIDE | 1 |
|  |  |  | [01] TEMPORARY_OVERRIDE | 1 |
|  |  |  | [02] PERMANENT_OVERRIDE | 1 |
|  | [07] SCHEDULE_OVERRIDE_GET |  |  | 1 |
|  | [08] SCHEDULE_OVERRIDE_REPORT |  |  | 1 |
|  |  | Override Type |  | 1 |
|  |  | Override State |  | 1 |
|  |  |  | [00] NO_OVERRIDE | 1 |
|  |  |  | [01] TEMPORARY_OVERRIDE | 1 |
|  |  |  | [02] PERMANENT_OVERRIDE | 1 |
| [47] COMMAND_CLASS_THERMOSTAT_SETBACK |  |  |  | 1 |
|  | [01] THERMOSTAT_SETBACK_SET |  |  | 1 |
|  |  | Setback Type |  | 1 |
|  |  |  | [00] NO_OVERRIDE | 1 |
|  |  |  | [01] TEMPORARY_OVERRIDE | 1 |
|  |  |  | [02] PERMANENT_OVERRIDE | 1 |
|  |  | Setback State |  | 1 |
|  |  |  | [79] FROST_PROTECTION | 1 |
|  |  |  | [7A] ENERGY_SAVING_MODE | 1 |
|  |  |  | [7F] UNUSED_STATE | 1 |
|  | [02] THERMOSTAT_SETBACK_GET |  |  | 1 |
|  | [03] THERMOSTAT_SETBACK_REPORT |  |  | 1 |
|  |  | Setback Type |  | 1 |
|  |  |  | [00] NO_OVERRIDE | 1 |
|  |  |  | [01] TEMPORARY_OVERRIDE | 1 |
|  |  |  | [02] PERMANENT_OVERRIDE | 1 |
|  |  | Setback State |  | 1 |
|  |  |  | [79] FROST_PROTECTION | 1 |
|  |  |  | [7A] ENERGY_SAVING_MODE | 1 |
|  |  |  | [7F] UNUSED_STATE | 1 |
| [48] COMMAND_CLASS_RATE_TBL_CONFIG |  |  |  | 1 |
|  | [01] RATE_TBL_SET |  |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  |  | Number of Rate Char |  | 1 |
|  |  | Rate Type |  | 1 |
|  |  | Rate Character |  | 1 |
|  |  | Start Hour Local Time |  | 1 |
|  |  | Start Minute Local Time |  | 1 |
|  |  | Duration Minute |  | 1 |
|  |  | Consumption Scale |  | 1 |
|  |  | Consumption Precision |  | 1 |
|  |  | Min Consumption Value |  | 1 |
|  |  | Max Consumption Value |  | 1 |
|  |  | Max Demand Scale |  | 1 |
|  |  | Max Demand Precision |  | 1 |
|  |  | Max Demand Value |  | 1 |
|  |  | DCP Rate ID |  | 1 |
|  | [02] RATE_TBL_REMOVE |  |  | 1 |
|  |  | Rate Parameter Set IDs |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
| [49] COMMAND_CLASS_RATE_TBL_MONITOR |  |  |  | 1 |
|  | [01] RATE_TBL_SUPPORTED_GET |  |  | 1 |
|  | [02] RATE_TBL_SUPPORTED_REPORT |  |  | 1 |
|  |  | Rates Supported |  | 1 |
|  |  | Parameter Set Supported Bit Mask |  | 1 |
|  | [03] RATE_TBL_GET |  |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  | [04] RATE_TBL_REPORT |  |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  |  | Number of Rate Char |  | 1 |
|  |  | Rate Type |  | 1 |
|  |  | Rate Character |  | 1 |
|  |  | Start Hour Local Time |  | 1 |
|  |  | Start Minute Local Time |  | 1 |
|  |  | Duration Minute |  | 1 |
|  |  | Consumption Scale |  | 1 |
|  |  | Consumption Precision |  | 1 |
|  |  | Min Consumption Value |  | 1 |
|  |  | Max Consumption Value |  | 1 |
|  |  | Max Demand Scale |  | 1 |
|  |  | Max Demand Precision |  | 1 |
|  |  | Max Demand Value |  | 1 |
|  |  | DCP Rate ID |  | 1 |
|  | [05] RATE_TBL_ACTIVE_RATE_GET |  |  | 1 |
|  | [06] RATE_TBL_ACTIVE_RATE_REPORT |  |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  | [07] RATE_TBL_CURRENT_DATA_GET |  |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  |  | Dataset Requested |  | 1 |
|  | [08] RATE_TBL_CURRENT_DATA_REPORT |  |  | 1 |
|  |  | Reports to Follow |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  |  | Dataset |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour Local Time |  | 1 |
|  |  | Minute Local Time |  | 1 |
|  |  | Second Local Time |  | 1 |
|  |  | Float Value |  | 1 |
|  | [09] RATE_TBL_HISTORICAL_DATA_GET |  |  | 1 |
|  |  | Maximum Reports |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  |  | Dataset Requested |  | 1 |
|  |  | Start Year |  | 1 |
|  |  | Start Month |  | 1 |
|  |  | Start Day |  | 1 |
|  |  | Start Hour Local Time |  | 1 |
|  |  | Start Minute Local Time |  | 1 |
|  |  | Start Second Local Time |  | 1 |
|  |  | Stop Year |  | 1 |
|  |  | Stop Month |  | 1 |
|  |  | Stop Day |  | 1 |
|  |  | Stop Hour Local Time |  | 1 |
|  |  | Stop Minute Local Time |  | 1 |
|  |  | Stop Second Local Time |  | 1 |
|  | [0A] RATE_TBL_HISTORICAL_DATA_REPORT |  |  | 1 |
|  |  | Reports to Follow |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  |  | Dataset |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour Local Time |  | 1 |
|  |  | Minute Local Time |  | 1 |
|  |  | Second Local Time |  | 1 |
|  |  | Float Value |  | 1 |
| [4A] COMMAND_CLASS_TARIFF_CONFIG |  |  |  | 1 |
|  | [01] TARIFF_TBL_SUPPLIER_SET |  |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour Local Time |  | 1 |
|  |  | Minute Local Time |  | 1 |
|  |  | Second Local Time |  | 1 |
|  |  | Currency |  | 1 |
|  |  | Standing Charge Period |  | 1 |
|  |  | Standing Charge Precision |  | 1 |
|  |  | Standing Charge Value |  | 1 |
|  |  | Number of Supplier Characters |  | 1 |
|  |  | Supplier Character |  | 1 |
|  | [02] TARIFF_TBL_SET |  |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  |  | Tariff Precision |  | 1 |
|  |  | Tariff Value |  | 1 |
|  | [03] TARIFF_TBL_REMOVE |  |  | 1 |
|  |  | Rate Parameter Set IDs |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
| [4B] COMMAND_CLASS_TARIFF_TBL_MONITOR |  |  |  | 1 |
|  | [01] TARIFF_TBL_SUPPLIER_GET |  |  | 1 |
|  | [02] TARIFF_TBL_SUPPLIER_REPORT |  |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour Local Time |  | 1 |
|  |  | Minute Local Time |  | 1 |
|  |  | Second Local Time |  | 1 |
|  |  | Currency |  | 1 |
|  |  | Standing Charge Period |  | 1 |
|  |  | Standing Charge Precision |  | 1 |
|  |  | Standing Charge Value |  | 1 |
|  |  | Number of Supplier Characters |  | 1 |
|  |  | Supplier Character |  | 1 |
|  | [03] TARIFF_TBL_GET |  |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  | [04] TARIFF_TBL_REPORT |  |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  |  | Tariff Precision |  | 1 |
|  |  | Tariff Value |  | 1 |
|  | [05] TARIFF_TBL_COST_GET |  |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  |  | Start Year |  | 1 |
|  |  | Start Month |  | 1 |
|  |  | Start Day |  | 1 |
|  |  | Start Hour Local Time |  | 1 |
|  |  | Start Minute Local Time |  | 1 |
|  |  | Stop Year |  | 1 |
|  |  | Stop Month |  | 1 |
|  |  | Stop Day |  | 1 |
|  |  | Stop Hour Local Time |  | 1 |
|  |  | Stop Minute Local Time |  | 1 |
|  | [06] TARIFF_TBL_COST_REPORT |  |  | 1 |
|  |  | Rate Parameter Set ID |  | 1 |
|  |  | Rate Type |  | 1 |
|  |  | Start Year |  | 1 |
|  |  | Start Month |  | 1 |
|  |  | Start Day |  | 1 |
|  |  | Start Hour Local Time |  | 1 |
|  |  | Start Minute Local Time |  | 1 |
|  |  | Stop Year |  | 1 |
|  |  | Stop Month |  | 1 |
|  |  | Stop Day |  | 1 |
|  |  | Stop Hour Local Time |  | 1 |
|  |  | Stop Minute Local Time |  | 1 |
|  |  | Currency |  | 1 |
|  |  | Cost Precision |  | 1 |
|  |  | Cost Value |  | 1 |
| [4C] COMMAND_CLASS_DOOR_LOCK_LOGGING |  |  |  | 1 |
|  | [01] DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET |  |  | 1 |
|  | [02] DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT |  |  | 1 |
|  |  | Max records stored |  | 1 |
|  | [03] RECORD_GET |  |  | 1 |
|  |  | Record number |  | 1 |
|  | [04] RECORD_REPORT |  |  | 1 |
|  |  | Record number |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour Local Time |  | 1 |
|  |  | Record status |  | 1 |
|  |  | Minute Local Time |  | 1 |
|  |  | Second Local Time |  | 1 |
|  |  | Event Type |  | 1 |
|  |  | User Identifier |  | 1 |
|  |  | User Code Length |  | 1 |
|  |  | USER_CODE |  | 1 |
| [4D] COMMAND_CLASS_NETWORK_MANAGEMENT_BASIC |  |  |  | 2 |
|  | [01] LEARN_MODE_SET |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Mode |  | 1-2 |
|  |  |  | [00] LEARN_MODE_SET_DISABLE | 1-2 |
|  |  |  | [01] LEARN_MODE_SET_CLASSIC | 1-2 |
|  |  |  | [02] LEARN_MODE_SET_NWI | 1-2 |
|  | [02] LEARN_MODE_SET_STATUS |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [01] LEARN_MODE_FAILED_TIMEOUT | 1-2 |
|  |  |  | [06] LEARN_MODE_DONE | 1-2 |
|  |  |  | [07] LEARN_MODE_FAILED | 1-2 |
|  |  |  | [09] LEARN_MODE_SECURITY_FAILED | 1-2 |
|  |  | New Node ID |  | 1-2 |
|  |  | Granted Keys |  | 2 |
|  |  | DSK |  | 2 |
|  | [03] NETWORK_UPDATE_REQUEST |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  | [04] NETWORK_UPDATE_REQUEST_STATUS |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [00] SUC_UPDATE_DONE | 1-2 |
|  |  |  | [01] SUC_UPDATE_ABORT | 1-2 |
|  |  |  | [02] SUC_UPDATE_WAIT | 1-2 |
|  |  |  | [03] SUC_UPDATE_DISABLED | 1-2 |
|  |  |  | [04] SUC_UPDATE_OVERFLOW | 1-2 |
|  | [05] NODE_INFORMATION_SEND |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Destination Node ID |  | 1-2 |
|  |  | tx Options |  | 1-2 |
|  |  |  | [01] ACK | 1-2 |
|  |  |  | [02] LOW_POWER | 1-2 |
|  |  |  | [04] AUTO_ROUTE | 1-2 |
|  |  |  | [10] NO_ROUTE | 1-2 |
|  |  |  | [20] EXPLORE | 1-2 |
|  |  |  | [40] NO_RETRANSMISSION | 1-2 |
|  |  |  | [80] HIGH_POWER | 1-2 |
|  | [06] DEFAULT_SET |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  | [07] DEFAULT_SET_COMPLETE |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [06] DEFAULT_SET_DONE | 1-2 |
|  |  |  | [07] DEFAULT_SET_BUSY | 1-2 |
|  | [08] DSK_GET |  |  | 2 |
|  |  | Seq No |  | 2 |
|  | [09] DSK_REPORT |  |  | 2 |
|  |  | Seq No |  | 2 |
|  |  | DSK |  | 2 |
| [4E] COMMAND_CLASS_SCHEDULE_ENTRY_LOCK |  |  |  | 3 |
|  | [01] SCHEDULE_ENTRY_LOCK_ENABLE_SET |  |  | 1-3 |
|  |  | User Identifier |  | 1-3 |
|  |  | Enabled |  | 1-3 |
|  |  |  | [00] DISABLED | 1-3 |
|  |  |  | [01] ENABLED | 1-3 |
|  | [02] SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET |  |  | 1-3 |
|  |  | Enabled |  | 1-3 |
|  |  |  | [00] DISABLED | 1-3 |
|  |  |  | [01] ENABLED | 1-3 |
|  | [03] SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET |  |  | 1-3 |
|  |  | Set Action |  | 1-3 |
|  |  |  | [00] ERASE | 1-3 |
|  |  |  | [01] MODIFY | 1-3 |
|  |  | User Identifier |  | 1-3 |
|  |  | Schedule Slot ID |  | 1-3 |
|  |  | Day of Week |  | 1-3 |
|  |  | Start Hour |  | 1-3 |
|  |  | Start Minute |  | 1-3 |
|  |  | Stop Hour |  | 1-3 |
|  |  | Stop Minute |  | 1-3 |
|  | [04] SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET |  |  | 1-3 |
|  |  | User Identifier |  | 1-3 |
|  |  | Schedule Slot ID |  | 1-3 |
|  | [05] SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT |  |  | 1-3 |
|  |  | User Identifier |  | 1-3 |
|  |  | Schedule Slot ID |  | 1-3 |
|  |  | Day of Week |  | 1-3 |
|  |  | Start Hour |  | 1-3 |
|  |  | Start Minute |  | 1-3 |
|  |  | Stop Hour |  | 1-3 |
|  |  | Stop Minute |  | 1-3 |
|  | [06] SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET |  |  | 1-3 |
|  |  | Set Action |  | 1-3 |
|  |  |  | [00] ERASE | 1-3 |
|  |  |  | [01] MODIFY | 1-3 |
|  |  | User Identifier |  | 1-3 |
|  |  | Schedule Slot ID |  | 1-3 |
|  |  | Start Year |  | 1-3 |
|  |  | Start Month |  | 1-3 |
|  |  | Start Day |  | 1-3 |
|  |  | Start Hour |  | 1-3 |
|  |  | Start Minute |  | 1-3 |
|  |  | Stop Year |  | 1-3 |
|  |  | Stop Month |  | 1-3 |
|  |  | Stop Day |  | 1-3 |
|  |  | Stop Hour |  | 1-3 |
|  |  | Stop Minute |  | 1-3 |
|  | [07] SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET |  |  | 1-3 |
|  |  | User Identifier |  | 1-3 |
|  |  | Schedule Slot ID |  | 1-3 |
|  | [08] SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT |  |  | 1-3 |
|  |  | User Identifier |  | 1-3 |
|  |  | Schedule Slot ID |  | 1-3 |
|  |  | Start Year |  | 1-3 |
|  |  | Start Month |  | 1-3 |
|  |  | Start Day |  | 1-3 |
|  |  | Start Hour |  | 1-3 |
|  |  | Start Minute |  | 1-3 |
|  |  | Stop Year |  | 1-3 |
|  |  | Stop Month |  | 1-3 |
|  |  | Stop Day |  | 1-3 |
|  |  | Stop Hour |  | 1-3 |
|  |  | Stop Minute |  | 1-3 |
|  | [09] SCHEDULE_ENTRY_TYPE_SUPPORTED_GET |  |  | 1-3 |
|  | [0A] SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | Number of Slots Week Day |  | 1-3 |
|  |  | Number of Slots Year Day |  | 1-3 |
|  |  | Number of Slots Daily Repeating |  | 3 |
|  | [0B] SCHEDULE_ENTRY_LOCK_TIME_OFFSET_GET |  |  | 2-3 |
|  | [0C] SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT |  |  | 2-3 |
|  |  | Hour TZO |  | 2-3 |
|  |  | Sign TZO |  | 2-3 |
|  |  | Minute TZO |  | 2-3 |
|  |  | Minute Offset DST |  | 2-3 |
|  |  | Sign Offset DST |  | 2-3 |
|  | [0D] SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET |  |  | 2-3 |
|  |  | Hour TZO |  | 2-3 |
|  |  | Sign TZO |  | 2-3 |
|  |  | Minute TZO |  | 2-3 |
|  |  | Minute Offset DST |  | 2-3 |
|  |  | Sign Offset DST |  | 2-3 |
|  | [0E] SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_GET |  |  | 3 |
|  |  | User Identifier |  | 3 |
|  |  | Schedule Slot ID |  | 3 |
|  | [0F] SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_REPORT |  |  | 3 |
|  |  | User Identifier |  | 3 |
|  |  | Schedule Slot ID |  | 3 |
|  |  | Week Day Bitmask |  | 3 |
|  |  | Start Hour |  | 3 |
|  |  | Start Minute |  | 3 |
|  |  | Duration Hour |  | 3 |
|  |  | Duration Minute |  | 3 |
|  | [10] SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_SET |  |  | 3 |
|  |  | Set Action |  | 3 |
|  |  |  | [00] ERASE | 3 |
|  |  |  | [01] MODIFY | 3 |
|  |  | User Identifier |  | 3 |
|  |  | Schedule Slot ID |  | 3 |
|  |  | Week Day Bitmask |  | 3 |
|  |  | Start Hour |  | 3 |
|  |  | Start Minute |  | 3 |
|  |  | Duration Hour |  | 3 |
|  |  | Duration Minute |  | 3 |
| [4F] COMMAND_CLASS_ZIP_6LOWPAN |  |  |  | 1 |
|  | [C0] LOWPAN_FIRST_FRAGMENT |  |  | 1 |
|  |  | Datagram Size 1 |  | 1 |
|  |  | Datagram Size 2 |  | 1 |
|  |  | Datagram Tag |  | 1 |
|  |  | Payload |  | 1 |
|  | [E0] LOWPAN_SUBSEQUENT_FRAGMENT |  |  | 1 |
|  |  | Datagram Size 1 |  | 1 |
|  |  | Datagram Size 2 |  | 1 |
|  |  | Datagram Tag |  | 1 |
|  |  | Datagram Offset |  | 1 |
|  |  | Payload |  | 1 |
| [50] COMMAND_CLASS_BASIC_WINDOW_COVERING |  |  |  | 1 |
|  | [01] BASIC_WINDOW_COVERING_START_LEVEL_CHANGE |  |  | 1 |
|  |  | Open/ Close |  | 1 |
|  | [02] BASIC_WINDOW_COVERING_STOP_LEVEL_CHANGE |  |  | 1 |
| [51] COMMAND_CLASS_MTP_WINDOW_COVERING |  |  |  | 1 |
|  | [01] MOVE_TO_POSITION_SET |  |  | 1 |
|  |  | Value |  | 1 |
|  |  |  | [00] CLOSE | 1 |
|  |  |  | [FF] OPEN | 1 |
|  | [02] MOVE_TO_POSITION_GET |  |  | 1 |
|  | [03] MOVE_TO_POSITION_REPORT |  |  | 1 |
|  |  | Value |  | 1 |
|  |  |  | [00] CLOSE | 1 |
|  |  |  | [FF] OPEN | 1 |
| [52] COMMAND_CLASS_NETWORK_MANAGEMENT_PROXY |  |  |  | 2 |
|  | [01] NODE_LIST_GET |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  | [02] NODE_LIST_REPORT |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [00] LATEST | 1-2 |
|  |  |  | [01] MAY_NOT_BE_THE_LATEST | 1-2 |
|  |  | Node List Controller ID |  | 1-2 |
|  |  | Node List Data |  | 1-2 |
|  | [03] NODE_INFO_CACHED_GET |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Max Age |  | 1-2 |
|  |  | Node ID |  | 1-2 |
|  | [04] NODE_INFO_CACHED_REPORT |  |  | 1-2 |
|  |  | Seq. No |  | 1-2 |
|  |  | Age |  | 1-2 |
|  |  | Status |  | 1-2 |
|  |  |  | [00] STATUS_OK | 1-2 |
|  |  |  | [01] STATUS_NOT_RESPONDING | 1-2 |
|  |  |  | [02] STATUS_UNKNOWN | 1-2 |
|  |  | Capability |  | 1-2 |
|  |  | Listening |  | 1-2 |
|  |  | Security |  | 1-2 |
|  |  | Sensor |  | 1-2 |
|  |  | Opt |  | 1-2 |
|  |  | Granted Keys |  | 2 |
|  |  | Basic Device Class |  | 1-2 |
|  |  | Generic Device Class |  | 1-2 |
|  |  | Specific Device Class |  | 1-2 |
|  |  | Non-Secure Command Class |  | 1-2 |
|  |  | Security Scheme 0 Command Class |  | 1 |
|  |  | Secure Command Class |  | 2 |
| [53] COMMAND_CLASS_SCHEDULE |  |  |  | 3 |
|  | [01] SCHEDULE_SUPPORTED_GET |  |  | 1-3 |
|  |  | Schedule ID Block |  | 2-3 |
|  | [02] SCHEDULE_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | Number of Supported Schedule ID |  | 1-3 |
|  |  | Start Time Support |  | 1-3 |
|  |  | Fallback Support |  | 1-3 |
|  |  | Support Enable/Disable |  | 1-3 |
|  |  | Number of supported CC |  | 1-3 |
|  |  | Command Class Command |  | 1-3 |
|  |  | Supported Override Types |  | 1-3 |
|  |  | Override Support |  | 1-3 |
|  |  | Schedule ID Block |  | 2-3 |
|  |  | Number of Supported Schedule Blocks |  | 2-3 |
|  | [03] COMMAND_SCHEDULE_SET |  |  | 1-3 |
|  |  | Schedule ID |  | 1-3 |
|  |  | User Identifier |  | 1 |
|  |  | Schedule ID Block |  | 2-3 |
|  |  | Start Year |  | 1-3 |
|  |  | Start Month |  | 1-3 |
|  |  | Recurrence Offset |  | 3 |
|  |  | Start Day of Month |  | 1-3 |
|  |  | Recurrence Mode |  | 3 |
|  |  |  | [00] REPEAT_EVERY_N_HOURS | 3 |
|  |  |  | [01] REPEAT_EVERY_N_DAYS | 3 |
|  |  |  | [02] REPEAT_EVERY_N_WEEKS | 3 |
|  |  | Start Weekday |  | 1-3 |
|  |  | Res. |  | 1 |
|  |  | Start Hour |  | 1-3 |
|  |  | Duration Type |  | 1-3 |
|  |  | Start Minute |  | 1-3 |
|  |  | Relative |  | 3 |
|  |  | Duration Byte |  | 1-3 |
|  |  | Reports to Follow |  | 1-3 |
|  |  | Number of Cmd to Follow |  | 1-3 |
|  |  | Scheduled Command |  | 1-3 |
|  | [04] COMMAND_SCHEDULE_GET |  |  | 1-3 |
|  |  | Schedule ID |  | 1-3 |
|  |  | Schedule ID Block |  | 2-3 |
|  |  | AID_RO_CTL |  | 3 |
|  | [05] COMMAND_SCHEDULE_REPORT |  |  | 1-3 |
|  |  | Schedule ID |  | 1-3 |
|  |  | User Identifier |  | 1 |
|  |  | Schedule ID Block |  | 2-3 |
|  |  | Start Year |  | 1-3 |
|  |  | Start Month |  | 1-3 |
|  |  | Active_ID |  | 1-2 |
|  |  | AID_RO |  | 3 |
|  |  | Start Day of Month |  | 1-3 |
|  |  | AID_RO_CTL |  | 3 |
|  |  | Recurrence Mode |  | 2-3 |
|  |  |  | [00] REPEAT_EVERY_N_HOURS | 2-3 |
|  |  |  | [01] REPEAT_EVERY_N_DAYS | 2-3 |
|  |  |  | [02] REPEAT_EVERY_N_WEEKS | 2-3 |
|  |  | Start Weekday |  | 1-3 |
|  |  | Res. |  | 1 |
|  |  | Start Hour |  | 1-3 |
|  |  | Duration Type |  | 1-3 |
|  |  | Start Minute |  | 1-3 |
|  |  | Relative |  | 3 |
|  |  | Duration Byte |  | 1-3 |
|  |  | Reports to Follow |  | 1-3 |
|  |  | Number of Cmd to Follow |  | 1-3 |
|  |  | Scheduled Command |  | 1-3 |
|  | [06] SCHEDULE_REMOVE |  |  | 1-3 |
|  |  | Schedule ID |  | 1-3 |
|  |  | Schedule ID Block |  | 2-3 |
|  | [07] SCHEDULE_STATE_SET |  |  | 1-3 |
|  |  | Schedule ID |  | 1-3 |
|  |  | Schedule State |  | 1-3 |
|  |  | Schedule ID Block |  | 2-3 |
|  | [08] SCHEDULE_STATE_GET |  |  | 1-3 |
|  |  | Schedule ID Block |  | 2-3 |
|  | [09] SCHEDULE_STATE_REPORT |  |  | 1-3 |
|  |  | Number of Supported Schedule ID |  | 1-3 |
|  |  | Override |  | 1-3 |
|  |  | Reports to Follow |  | 1-3 |
|  |  | Active_ID 1 |  | 1-3 |
|  |  | Active_ID 2 |  | 1-3 |
|  |  | Active_ID 3 |  | 1-3 |
|  |  | Active_ID N |  | 1-3 |
|  |  | Schedule ID Block |  | 2-3 |
| [54] COMMAND_CLASS_NETWORK_MANAGEMENT_PRIMARY |  |  |  | 1 |
|  | [01] CONTROLLER_CHANGE |  |  | 1 |
|  |  | Seq. No |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [02] CONTROLLER_CHANGE_START | 1 |
|  |  |  | [05] CONTROLLER_CHANGE_STOP | 1 |
|  |  | tx Options |  | 1 |
|  |  |  | [01] ACK | 1 |
|  |  |  | [02] LOW_POWER | 1 |
|  |  |  | [04] AUTO_ROUTE | 1 |
|  |  |  | [10] NO_ROUTE | 1 |
|  |  |  | [20] EXPLORE | 1 |
|  |  |  | [40] NO_RETRANSMISSION | 1 |
|  |  |  | [80] HIGH_POWER | 1 |
|  | [02] CONTROLLER_CHANGE_STATUS |  |  | 1 |
|  |  | Seq. No |  | 1 |
|  |  | Status |  | 1 |
|  |  |  | [06] NODE_ADD_STATUS_DONE | 1 |
|  |  |  | [07] NODE_ADD_STATUS_FAILED | 1 |
|  |  |  | [09] NODE_ADD_STATUS_SECURITY_FAILED | 1 |
|  |  | New Node ID |  | 1 |
|  |  | Node Info Length |  | 1 |
|  |  | Capability |  | 1 |
|  |  | Listening |  | 1 |
|  |  | Security |  | 1 |
|  |  | Opt |  | 1 |
|  |  | Basic Device Class |  | 1 |
|  |  | Generic Device Class |  | 1 |
|  |  | Specific Device Class |  | 1 |
|  |  | Command Class |  | 1 |
| [55] COMMAND_CLASS_TRANSPORT_SERVICE |  |  |  | 2 |
|  | [C0] COMMAND_FIRST_SEGMENT |  |  | 1-2 |
|  |  | datagram_size_1  |  | 1-2 |
|  |  | datagram_size_2 |  | 1-2 |
|  |  | Ext |  | 2 |
|  |  | Sequence No |  | 1 |
|  |  | Session ID |  | 2 |
|  |  | Header Extension Length |  | 2 |
|  |  | Payload |  | 1-2 |
|  |  | Checksum |  | 1 |
|  |  | Header Extension |  | 2 |
|  |  | Frame Check Sequence |  | 2 |
|  | [C8] COMMAND_SEGMENT_REQUEST |  |  | 2 |
|  |  | datagram_offset_1 |  | 2 |
|  |  | Session ID |  | 2 |
|  |  | datagram_offset_2 |  | 2 |
|  | [E0] COMMAND_SUBSEQUENT_SEGMENT |  |  | 1-2 |
|  |  | datagram_size_1 |  | 1-2 |
|  |  | datagram_size_2 |  | 1-2 |
|  |  | datagram_offset_1 |  | 1-2 |
|  |  | Ext |  | 2 |
|  |  | Sequence No |  | 1 |
|  |  | Session ID |  | 2 |
|  |  | datagram_offset_2 |  | 1-2 |
|  |  | Header Extension Length |  | 2 |
|  |  | Payload |  | 1-2 |
|  |  | Checksum |  | 1 |
|  |  | Header Extension |  | 2 |
|  |  | Frame Check Sequence |  | 2 |
|  | [E8] COMMAND_SEGMENT_COMPLETE |  |  | 2 |
|  |  | Session ID |  | 2 |
|  | [F0] COMMAND_SEGMENT_WAIT |  |  | 2 |
|  |  | pending_fragments |  | 2 |
| [56] COMMAND_CLASS_CRC_16_ENCAP |  |  |  | 1 |
|  | [01] CRC_16_ENCAP |  |  | 1 |
|  |  | Command Class |  | 1 |
|  |  | Command |  | 1 |
|  |  | Data |  | 1 |
|  |  | Checksum |  | 1 |
| [57] COMMAND_CLASS_APPLICATION_CAPABILITY |  |  |  | 1 |
|  | [01] COMMAND_COMMAND_CLASS_NOT_SUPPORTED |  |  | 1 |
|  |  | Dynamic |  | 1 |
|  |  | Offending Command Class |  | 1 |
|  |  | Offending Command |  | 1 |
| [58] COMMAND_CLASS_ZIP_ND |  |  |  | 1 |
|  | [01] ZIP_NODE_ADVERTISEMENT |  |  | 1 |
|  |  | Validity |  | 1 |
|  |  |  | [00] INFORMATION_OK | 1 |
|  |  |  | [01] INFORMATION_OBSOLETE | 1 |
|  |  |  | [02] INFORMATION_NOT_FOUND | 1 |
|  |  | Local |  | 1 |
|  |  | Node ID |  | 1 |
|  |  | IPv6 Address |  | 1 |
|  |  | Home ID |  | 1 |
|  | [03] ZIP_NODE_SOLICITATION |  |  | 1 |
|  |  | Node ID |  | 1 |
|  |  | IPv6 Address |  | 1 |
|  | [04] ZIP_INV_NODE_SOLICITATION |  |  | 1 |
|  |  | Local |  | 1 |
|  |  | Node ID |  | 1 |
| [59] COMMAND_CLASS_ASSOCIATION_GRP_INFO |  |  |  | 3 |
|  | [01] ASSOCIATION_GROUP_NAME_GET |  |  | 1-3 |
|  |  | Grouping Identifier |  | 1-3 |
|  | [02] ASSOCIATION_GROUP_NAME_REPORT |  |  | 1-3 |
|  |  | Grouping Identifier |  | 1-3 |
|  |  | Length of Name |  | 1-3 |
|  |  | Name |  | 1-3 |
|  | [03] ASSOCIATION_GROUP_INFO_GET |  |  | 1-3 |
|  |  | List Mode |  | 1-3 |
|  |  | Refresh cache |  | 1-3 |
|  |  | Grouping Identifier |  | 1-3 |
|  | [04] ASSOCIATION_GROUP_INFO_REPORT |  |  | 1-3 |
|  |  | Group Count |  | 1-3 |
|  |  | Dynamic Info |  | 1-3 |
|  |  | List mode |  | 1-3 |
|  |  | Association Group Info |  | 1-3 |
|  | [05] ASSOCIATION_GROUP_COMMAND_LIST_GET |  |  | 1-3 |
|  |  | Allow cache |  | 1-3 |
|  |  | Grouping Identifier |  | 1-3 |
|  | [06] ASSOCIATION_GROUP_COMMAND_LIST_REPORT |  |  | 1-3 |
|  |  | Grouping Identifier |  | 1-3 |
|  |  | List Length |  | 1-3 |
|  |  | Command |  | 1-3 |
| [5A] COMMAND_CLASS_DEVICE_RESET_LOCALLY |  |  |  | 1 |
|  | [01] DEVICE_RESET_LOCALLY_NOTIFICATION |  |  | 1 |
| [5B] COMMAND_CLASS_CENTRAL_SCENE |  |  |  | 3 |
|  | [01] CENTRAL_SCENE_SUPPORTED_GET |  |  | 1-3 |
|  | [02] CENTRAL_SCENE_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | Supported Scenes |  | 1-3 |
|  |  | Identical |  | 2-3 |
|  |  | Number of Bit Mask Bytes |  | 2-3 |
|  |  | Slow Refresh Support |  | 3 |
|  |  | Scene Information |  | 2-3 |
|  | [03] CENTRAL_SCENE_NOTIFICATION |  |  | 1-3 |
|  |  | Sequence Number |  | 1-3 |
|  |  | Key Attributes |  | 1-3 |
|  |  |  | [00] KEY_PRESSED_1_TIME | 1-3 |
|  |  |  | [01] KEY_RELEASED | 1-3 |
|  |  |  | [02] KEY_HELD_DOWN | 1-3 |
|  |  |  | [03] KEY_PRESSED_2_TIMES | 1-3 |
|  |  |  | [04] KEY_PRESSED_3_TIMES | 1-3 |
|  |  |  | [05] KEY_PRESSED_4_TIMES | 1-3 |
|  |  |  | [06] KEY_PRESSED_5_TIMES | 1-3 |
|  |  | Slow Refresh |  | 3 |
|  |  | Scene Number |  | 1-3 |
|  | [04] CENTRAL_SCENE_CONFIGURATION_SET |  |  | 3 |
|  |  | Slow Refresh |  | 3 |
|  | [05] CENTRAL_SCENE_CONFIGURATION_GET |  |  | 3 |
|  | [06] CENTRAL_SCENE_CONFIGURATION_REPORT |  |  | 3 |
|  |  | Slow Refresh |  | 3 |
| [5C] COMMAND_CLASS_IP_ASSOCIATION |  |  |  | 1 |
|  | [01] IP_ASSOCIATION_SET |  |  | 1 |
|  |  | Grouping Identifier |  | 1 |
|  |  | IPv6 Address |  | 1 |
|  |  | End Point |  | 1 |
|  | [02] IP_ASSOCIATION_GET |  |  | 1 |
|  |  | Grouping Identifier |  | 1 |
|  |  | Index |  | 1 |
|  | [03] IP_ASSOCIATION_REPORT |  |  | 1 |
|  |  | Grouping Identifier |  | 1 |
|  |  | Index |  | 1 |
|  |  | Actual Nodes |  | 1 |
|  |  | IPv6 Address |  | 1 |
|  |  | End Point |  | 1 |
|  | [04] IP_ASSOCIATION_REMOVE |  |  | 1 |
|  |  | Grouping Identifier |  | 1 |
|  |  | IPv6 Address |  | 1 |
|  |  | End Point |  | 1 |
| [5D] COMMAND_CLASS_ANTITHEFT |  |  |  | 2 |
|  | [01] ANTITHEFT_SET |  |  | 1-2 |
|  |  | Number of Magic Code bytes |  | 1-2 |
|  |  | Enable |  | 1-2 |
|  |  | Magic Code |  | 1-2 |
|  |  | Manufacturer ID |  | 1-2 |
|  |  | Anti-theft Hint Number Bytes |  | 1-2 |
|  |  | Anti-theft Hint Byte |  | 1-2 |
|  | [02] ANTITHEFT_GET |  |  | 1-2 |
|  | [03] ANTITHEFT_REPORT |  |  | 1-2 |
|  |  | Anti-theft Protection Status |  | 1-2 |
|  |  | Manufacturer ID |  | 1-2 |
|  |  | Anti-theft Hint Number Bytes |  | 1-2 |
|  |  | Anti-theft Hint Byte |  | 1-2 |
| [5E] COMMAND_CLASS_ZWAVEPLUS_INFO |  |  |  | 2 |
|  | [01] ZWAVEPLUS_INFO_GET |  |  | 1-2 |
|  | [02] ZWAVEPLUS_INFO_REPORT |  |  | 1-2 |
|  |  | Z-Wave+ Version |  | 1-2 |
|  |  | Role Type |  | 1-2 |
|  |  |  | [00] ROLE_TYPE_CONTROLLER_CENTRAL_STATIC | 1-2 |
|  |  |  | [01] ROLE_TYPE_CONTROLLER_SUB_STATIC | 1-2 |
|  |  |  | [02] ROLE_TYPE_CONTROLLER_PORTABLE | 1-2 |
|  |  |  | [03] ROLE_TYPE_CONTROLLER_PORTABLE_REPORTING | 1-2 |
|  |  |  | [04] ROLE_TYPE_SLAVE_PORTABLE | 1-2 |
|  |  |  | [05] ROLE_TYPE_SLAVE_ALWAYS_ON | 1-2 |
|  |  |  | [06] ROLE_TYPE_SLAVE_SLEEPING_REPORTING | 1-2 |
|  |  |  | [07] ROLE_TYPE_SLAVE_SLEEPING_LISTENING | 1-2 |
|  |  | Node Type |  | 1-2 |
|  |  |  | [00] NODE_TYPE_ZWAVEPLUS_NODE | 1-2 |
|  |  |  | [01] NODE_TYPE_ZWAVEPLUS_FOR_IP_ROUTER | 1 |
|  |  |  | [02] NODE_TYPE_ZWAVEPLUS_FOR_IP_GATEWAY | 1-2 |
|  |  |  | [03] NODE_TYPE_ZWAVEPLUS_FOR_IP_CLIENT_IP_NODE | 1 |
|  |  |  | [04] NODE_TYPE_ZWAVEPLUS_FOR_IP_CLIENT_ZWAVE_NODE | 1 |
|  |  | Installer Icon Type |  | 2 |
|  |  | User Icon Type |  | 2 |
| [5F] COMMAND_CLASS_ZIP_GATEWAY |  |  |  | 1 |
|  | [01] GATEWAY_MODE_SET |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [01] STAND_ALONE | 1 |
|  |  |  | [02] PORTAL | 1 |
|  | [02] GATEWAY_MODE_GET |  |  | 1 |
|  | [03] GATEWAY_MODE_REPORT |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [01] STAND_ALONE | 1 |
|  |  |  | [02] PORTAL | 1 |
|  | [04] GATEWAY_PEER_SET |  |  | 1 |
|  |  | Peer Profile |  | 1 |
|  |  | IPv6 Address |  | 1 |
|  |  | Port |  | 1 |
|  |  | Peer Name Length |  | 1 |
|  |  | Peer Name |  | 1 |
|  | [05] GATEWAY_PEER_GET |  |  | 1 |
|  |  | Peer Profile |  | 1 |
|  | [06] GATEWAY_PEER_REPORT |  |  | 1 |
|  |  | Peer Profile |  | 1 |
|  |  | Peer Count |  | 1 |
|  |  | IPv6 Address |  | 1 |
|  |  | Port |  | 1 |
|  |  | Peer Name Length |  | 1 |
|  |  | Peer Name |  | 1 |
|  | [07] GATEWAY_LOCK_SET |  |  | 1 |
|  |  | Lock |  | 1 |
|  |  | Show |  | 1 |
|  | [08] UNSOLICITED_DESTINATION_SET |  |  | 1 |
|  |  | Unsolicited IPv6 Destination |  | 1 |
|  |  | Unsolicited Destination Port |  | 1 |
|  | [09] UNSOLICITED_DESTINATION_GET |  |  | 1 |
|  | [0A] UNSOLICITED_DESTINATION_REPORT |  |  | 1 |
|  |  | Unsolicited IPv6 Destination |  | 1 |
|  |  | Unsolicited Destination Port |  | 1 |
|  | [0B] COMMAND_APPLICATION_NODE_INFO_SET |  |  | 1 |
|  |  | Non-Secure Command Class |  | 1 |
|  |  | Security Scheme 0 Command Class |  | 1 |
|  | [0C] COMMAND_APPLICATION_NODE_INFO_GET |  |  | 1 |
|  | [0D] COMMAND_APPLICATION_NODE_INFO_REPORT |  |  | 1 |
|  |  | Non-Secure Command Class |  | 1 |
|  |  | Security Scheme 0 Command Class |  | 1 |
| [60] COMMAND_CLASS_MULTI_CHANNEL |  |  |  | 4 |
|  | [04] MULTI_INSTANCE_GET |  |  | 1-4 |
|  |  | Command Class |  | 1-4 |
|  | [05] MULTI_INSTANCE_REPORT |  |  | 1-4 |
|  |  | Command Class |  | 1-4 |
|  |  | Res |  | 2-4 |
|  |  | Instances |  | 1-4 |
|  | [06] MULTI_INSTANCE_CMD_ENCAP |  |  | 1-4 |
|  |  | Res |  | 2-4 |
|  |  | Instance |  | 1-4 |
|  |  | Command Class |  | 1-4 |
|  |  | Command |  | 1-4 |
|  |  | Parameter |  | 1-4 |
|  | [07] MULTI_CHANNEL_END_POINT_GET |  |  | 2-4 |
|  | [08] MULTI_CHANNEL_END_POINT_REPORT |  |  | 2-4 |
|  |  | Res1 |  | 2-4 |
|  |  | Identical |  | 2-4 |
|  |  | Dynamic |  | 2-4 |
|  |  | End Points |  | 2-3 |
|  |  | Individual End Points |  | 4 |
|  |  | Res2 |  | 2-4 |
|  |  | Aggregated End Points |  | 4 |
|  |  | Res3 |  | 4 |
|  | [09] MULTI_CHANNEL_CAPABILITY_GET |  |  | 2-4 |
|  |  | End Point |  | 2-4 |
|  |  | Res |  | 2-4 |
|  | [0A] MULTI_CHANNEL_CAPABILITY_REPORT |  |  | 2-4 |
|  |  | End Point |  | 2-4 |
|  |  | Dynamic |  | 2-4 |
|  |  | Generic Device Class |  | 2-4 |
|  |  | Specific Device Class |  | 2-4 |
|  |  | Command Class |  | 2-4 |
|  | [0B] MULTI_CHANNEL_END_POINT_FIND |  |  | 2-4 |
|  |  | Generic Device Class |  | 2-4 |
|  |  | Specific Device Class |  | 2-4 |
|  | [0C] MULTI_CHANNEL_END_POINT_FIND_REPORT |  |  | 2-4 |
|  |  | Reports to Follow |  | 2-4 |
|  |  | Generic Device Class |  | 2-4 |
|  |  | Specific Device Class |  | 2-4 |
|  |  | Endpoint |  | 2-4 |
|  | [0D] MULTI_CHANNEL_CMD_ENCAP |  |  | 2-4 |
|  |  | Source End Point |  | 2-4 |
|  |  | Res |  | 2-4 |
|  |  | Destination End Point |  | 2-4 |
|  |  | Bit address |  | 2-4 |
|  |  | Command Class |  | 2-4 |
|  |  | Command |  | 2-4 |
|  |  | Parameter |  | 2-4 |
|  | [0E] MULTI_CHANNEL_AGGREGATED_MEMBERS_GET |  |  | 4 |
|  |  | Aggregated End Point |  | 4 |
|  |  | Res |  | 4 |
|  | [0F] MULTI_CHANNEL_AGGREGATED_MEMBERS_REPORT |  |  | 4 |
|  |  | Aggregated End Point |  | 4 |
|  |  | Res |  | 4 |
|  |  | Number of Bit Masks |  | 4 |
|  |  | Aggregated Members Bit Mask |  | 4 |
| [61] COMMAND_CLASS_ZIP_PORTAL |  |  |  | 1 |
|  | [01] GATEWAY_CONFIGURATION_SET |  |  | 1 |
|  |  | LAN IPv6 Address |  | 1 |
|  |  | LAN IPv6 Prefix Length |  | 1 |
|  |  | Portal IPv6 Prefix |  | 1 |
|  |  | Portal IPv6 Prefix Length |  | 1 |
|  |  | Default Gateway IPv6 Address |  | 1 |
|  |  | PAN IPv6 Prefix |  | 1 |
|  | [02] GATEWAY_CONFIGURATION_STATUS |  |  | 1 |
|  |  | Status |  | 1 |
|  | [03] GATEWAY_CONFIGURATION_GET |  |  | 1 |
|  | [04] GATEWAY_CONFIGURATION_REPORT |  |  | 1 |
|  |  | LAN IPv6 Address |  | 1 |
|  |  | LAN IPv6 Prefix Length |  | 1 |
|  |  | Portal IPv6 Prefix |  | 1 |
|  |  | Portal IPv6 Prefix Length |  | 1 |
|  |  | Default Gateway IPv6 Address |  | 1 |
|  |  | PAN IPv6 Prefix |  | 1 |
| [62] COMMAND_CLASS_DOOR_LOCK |  |  |  | 3 |
|  | [01] DOOR_LOCK_OPERATION_SET |  |  | 1-3 |
|  |  | Door Lock Mode |  | 1-3 |
|  |  |  | [00] DOOR_UNSECURED | 1-3 |
|  |  |  | [01] DOOR_UNSECURED_WITH_TIMEOUT | 1-3 |
|  |  |  | [10] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES | 1-3 |
|  |  |  | [11] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT | 1-3 |
|  |  |  | [20] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES | 1-3 |
|  |  |  | [21] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT | 1-3 |
|  |  |  | [FE] DOOR_LOCK_STATE_UNKNOWN | 2-3 |
|  |  |  | [FF] DOOR_SECURED | 1-3 |
|  | [02] DOOR_LOCK_OPERATION_GET |  |  | 1-3 |
|  | [03] DOOR_LOCK_OPERATION_REPORT |  |  | 1-3 |
|  |  | Door Lock Mode |  | 1-3 |
|  |  |  | [00] DOOR_UNSECURED | 1-3 |
|  |  |  | [01] DOOR_UNSECURED_WITH_TIMEOUT | 1-3 |
|  |  |  | [10] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES | 1-3 |
|  |  |  | [11] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT | 1-3 |
|  |  |  | [20] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES | 1-3 |
|  |  |  | [21] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT | 1-3 |
|  |  |  | [FE] DOOR_LOCK_STATE_UNKNOWN | 2-3 |
|  |  |  | [FF] DOOR_SECURED | 1-3 |
|  |  | Inside Door Handles Mode |  | 1-3 |
|  |  | Outside Door Handles Mode |  | 1-3 |
|  |  | Door Condition |  | 1-3 |
|  |  | Lock Timeout Minutes |  | 1-3 |
|  |  | Lock Timeout Seconds |  | 1-3 |
|  |  | Target Door Lock Mode |  | 3 |
|  |  |  | [00] DOOR_UNSECURED | 3 |
|  |  |  | [01] DOOR_UNSECURED_WITH_TIMEOUT | 3 |
|  |  |  | [10] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES | 3 |
|  |  |  | [11] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT | 3 |
|  |  |  | [20] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES | 3 |
|  |  |  | [21] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT | 3 |
|  |  |  | [FE] DOOR_LOCK_STATE_UNKNOWN | 3 |
|  |  |  | [FF] DOOR_SECURED | 3 |
|  |  | Duration |  | 3 |
|  |  |  | [00] ALREADY_AT_THE_TARGET_VALUE | 3 |
|  |  |  | [FE] UNKNOWN_DURATION | 3 |
|  | [04] DOOR_LOCK_CONFIGURATION_SET |  |  | 1-3 |
|  |  | Operation Type |  | 1-3 |
|  |  |  | [01] CONSTANT_OPERATION | 1-3 |
|  |  |  | [02] TIMED_OPERATION | 1-3 |
|  |  | Inside Door Handles State |  | 1-3 |
|  |  | Outside Door Handles State |  | 1-3 |
|  |  | Lock Timeout Minutes |  | 1-3 |
|  |  | Lock Timeout Seconds |  | 1-3 |
|  | [05] DOOR_LOCK_CONFIGURATION_GET |  |  | 1-3 |
|  | [06] DOOR_LOCK_CONFIGURATION_REPORT |  |  | 1-3 |
|  |  | Operation Type |  | 1-3 |
|  |  |  | [01] CONSTANT_OPERATION | 1-3 |
|  |  |  | [02] TIMED_OPERATION | 1-3 |
|  |  | Inside Door Handles State |  | 1-3 |
|  |  | Outside Door Handles State |  | 1-3 |
|  |  | Lock Timeout Minutes |  | 1-3 |
|  |  | Lock Timeout Seconds |  | 1-3 |
| [63] COMMAND_CLASS_USER_CODE |  |  |  | 1 |
|  | [01] USER_CODE_SET |  |  | 1 |
|  |  | User Identifier |  | 1 |
|  |  | User ID Status |  | 1 |
|  |  |  | [00] AVAILABLE | 1 |
|  |  |  | [01] OCCUPIED | 1 |
|  |  |  | [FE] STATUS_NOT_AVAILABLE | 1 |
|  |  | USER_CODE |  | 1 |
|  | [02] USER_CODE_GET |  |  | 1 |
|  |  | User Identifier |  | 1 |
|  | [03] USER_CODE_REPORT |  |  | 1 |
|  |  | User Identifier |  | 1 |
|  |  | User ID Status |  | 1 |
|  |  |  | [00] AVAILABLE | 1 |
|  |  |  | [01] OCCUPIED | 1 |
|  |  |  | [FE] STATUS_NOT_AVAILABLE | 1 |
|  |  | USER_CODE |  | 1 |
|  | [04] USERS_NUMBER_GET |  |  | 1 |
|  | [05] USERS_NUMBER_REPORT |  |  | 1 |
|  |  | Supported Users |  | 1 |
| [64] COMMAND_CLASS_HUMIDITY_CONTROL_SETPOINT |  |  |  | 1 |
|  | [01] HUMIDITY_CONTROL_SETPOINT_SET |  |  | 1 |
|  |  | Setpoint Type |  | 1 |
|  |  |  | [00] HUMIDIFIER | 1 |
|  |  |  | [01] DEHUMIDIFIER | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  |  | [00] PERCENTAGE | 1 |
|  |  |  | [01] ABSOLUTE | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [02] HUMIDITY_CONTROL_SETPOINT_GET |  |  | 1 |
|  |  | Setpoint Type |  | 1 |
|  |  |  | [00] HUMIDIFIER | 1 |
|  |  |  | [01] DEHUMIDIFIER | 1 |
|  | [03] HUMIDITY_CONTROL_SETPOINT_REPORT |  |  | 1 |
|  |  | Setpoint Type |  | 1 |
|  |  |  | [00] HUMIDIFIER | 1 |
|  |  |  | [01] DEHUMIDIFIER | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  |  | [00] PERCENTAGE | 1 |
|  |  |  | [01] ABSOLUTE | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
|  | [04] HUMIDITY_CONTROL_SETPOINT_SUPPORTED_GET |  |  | 1 |
|  | [05] HUMIDITY_CONTROL_SETPOINT_SUPPORTED_REPORT |  |  | 1 |
|  |  | Bit Mask |  | 1 |
|  |  |  | [01] HUMIDIFIER | 1 |
|  |  |  | [02] DEHUMIDIFIER | 1 |
|  | [06] HUMIDITY_CONTROL_SETPOINT_SCALE_SUPPORTED_GET |  |  | 1 |
|  |  | Setpoint Type |  | 1 |
|  |  |  | [00] HUMIDIFIER | 1 |
|  |  |  | [01] DEHUMIDIFIER | 1 |
|  | [07] HUMIDITY_CONTROL_SETPOINT_SCALE_SUPPORTED_REPORT |  |  | 1 |
|  |  | Scale Bit Mask |  | 1 |
|  |  |  | [00] PERCENTAGE | 1 |
|  |  |  | [01] ABSOLUTE | 1 |
|  | [08] HUMIDITY_CONTROL_SETPOINT_CAPABILITIES_GET |  |  | 1 |
|  |  | Setpoint Type |  | 1 |
|  |  |  | [00] HUMIDIFIER | 1 |
|  |  |  | [01] DEHUMIDIFIER | 1 |
|  | [09] HUMIDITY_CONTROL_SETPOINT_CAPABILITIES_REPORT |  |  | 1 |
|  |  | Setpoint Type |  | 1 |
|  |  |  | [00] HUMIDIFIER | 1 |
|  |  |  | [01] DEHUMIDIFIER | 1 |
|  |  | Size1 |  | 1 |
|  |  | Scale1 |  | 1 |
|  |  |  | [00] PERCENTAGE | 1 |
|  |  |  | [01] ABSOLUTE | 1 |
|  |  | Precision1 |  | 1 |
|  |  | Minimum Value |  | 1 |
|  |  | Size2 |  | 1 |
|  |  | Scale2 |  | 1 |
|  |  |  | [00] PERCENTAGE | 1 |
|  |  |  | [01] ABSOLUTE | 1 |
|  |  | Precision2 |  | 1 |
|  |  | Maximum Value |  | 1 |
| [65] COMMAND_CLASS_DMX |  |  |  | 1 |
|  | [01] DMX_ADDRESS_SET |  |  | 1 |
|  |  | Page ID |  | 1 |
|  |  | Channel ID |  | 1 |
|  | [02] DMX_ADDRESS_GET |  |  | 1 |
|  | [03] DMX_ADDRESS_REPORT |  |  | 1 |
|  |  | Page ID |  | 1 |
|  |  | Channel ID |  | 1 |
|  | [04] DMX_CAPABILITY_GET |  |  | 1 |
|  |  | Channel ID |  | 1 |
|  | [05] DMX_CAPABILITY_REPORT |  |  | 1 |
|  |  | Channel ID |  | 1 |
|  |  | Property ID |  | 1 |
|  |  | Device Channels |  | 1 |
|  |  | Max Channels |  | 1 |
|  | [06] DMX_DATA |  |  | 1 |
|  |  | Source |  | 1 |
|  |  | Page |  | 1 |
|  |  | Sequence No |  | 1 |
|  |  | DMX channel |  | 1 |
| [66] COMMAND_CLASS_BARRIER_OPERATOR |  |  |  | 1 |
|  | [01] BARRIER_OPERATOR_SET |  |  | 1 |
|  |  | Target Value |  | 1 |
|  |  |  | [00] CLOSE | 1 |
|  |  |  | [FF] OPEN | 1 |
|  | [02] BARRIER_OPERATOR_GET |  |  | 1 |
|  | [03] BARRIER_OPERATOR_REPORT |  |  | 1 |
|  |  | State |  | 1 |
|  |  |  | [00] CLOSED | 1 |
|  |  |  | [FC] CLOSING | 1 |
|  |  |  | [FD] STOPPED | 1 |
|  |  |  | [FE] OPENING | 1 |
|  |  |  | [FF] OPEN | 1 |
|  | [04] BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET |  |  | 1 |
|  | [05] BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT |  |  | 1 |
|  |  | Bit Mask |  | 1 |
|  |  |  | [00] NOT_SUPPORTED | 1 |
|  |  |  | [01] AUDIBLE_NOTIFICATION | 1 |
|  |  |  | [02] VISUAL_NOTIFICATION | 1 |
|  | [06] BARRIER_OPERATOR_SIGNAL_SET |  |  | 1 |
|  |  | Subsystem Type |  | 1 |
|  |  |  | [00] NOT_SUPPORTED | 1 |
|  |  |  | [01] AUDIBLE_NOTIFICATION | 1 |
|  |  |  | [02] VISUAL_NOTIFICATION | 1 |
|  |  | Subsystem State |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
|  | [07] BARRIER_OPERATOR_SIGNAL_GET |  |  | 1 |
|  |  | Subsystem Type |  | 1 |
|  |  |  | [00] NOT_SUPPORTED | 1 |
|  |  |  | [01] AUDIBLE_NOTIFICATION | 1 |
|  |  |  | [02] VISUAL_NOTIFICATION | 1 |
|  | [08] BARRIER_OPERATOR_SIGNAL_REPORT |  |  | 1 |
|  |  | Subsystem Type |  | 1 |
|  |  |  | [00] NOT_SUPPORTED | 1 |
|  |  |  | [01] AUDIBLE_NOTIFICATION | 1 |
|  |  |  | [02] VISUAL_NOTIFICATION | 1 |
|  |  | Subsystem State |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
| [67] COMMAND_CLASS_NETWORK_MANAGEMENT_INSTALLATION_MAINTENANCE |  |  |  | 1 |
|  | [01] LAST_WORKING_ROUTE_SET |  |  | 1 |
|  |  | NodeID |  | 1 |
|  |  | Repeater 1 |  | 1 |
|  |  | Repeater 2 |  | 1 |
|  |  | Repeater 3 |  | 1 |
|  |  | Repeater 4 |  | 1 |
|  |  | Speed |  | 1 |
|  |  |  | [01] 9_6_KBIT_SEC | 1 |
|  |  |  | [02] 40_KBIT_SEC | 1 |
|  |  |  | [03] 100_KBIT_SEC | 1 |
|  | [02] LAST_WORKING_ROUTE_GET |  |  | 1 |
|  |  | NodeID |  | 1 |
|  | [03] LAST_WORKING_ROUTE_REPORT |  |  | 1 |
|  |  | NodeID |  | 1 |
|  |  | Repeater 1 |  | 1 |
|  |  | Repeater 2 |  | 1 |
|  |  | Repeater 3 |  | 1 |
|  |  | Repeater 4 |  | 1 |
|  |  | Speed |  | 1 |
|  |  |  | [01] 9_6_KBIT_SEC | 1 |
|  |  |  | [02] 40_KBIT_SEC | 1 |
|  |  |  | [03] 100_KBIT_SEC | 1 |
|  | [04] STATISTICS_GET |  |  | 1 |
|  |  | NodeID |  | 1 |
|  | [05] STATISTICS_REPORT |  |  | 1 |
|  |  | NodeID |  | 1 |
|  |  | Statistics |  | 1 |
|  | [06] STATISTICS_CLEAR |  |  | 1 |
| [68] COMMAND_CLASS_ZIP_NAMING |  |  |  | 1 |
|  | [01] ZIP_NAMING_NAME_SET |  |  | 1 |
|  |  | Name |  | 1 |
|  | [02] ZIP_NAMING_NAME_GET |  |  | 1 |
|  | [03] ZIP_NAMING_NAME_REPORT |  |  | 1 |
|  |  | Name |  | 1 |
|  | [04] ZIP_NAMING_LOCATION_SET |  |  | 1 |
|  |  | Location |  | 1 |
|  | [05] ZIP_NAMING_LOCATION_GET |  |  | 1 |
|  | [06] ZIP_NAMING_LOCATION_REPORT |  |  | 1 |
|  |  | Location |  | 1 |
| [69] COMMAND_CLASS_MAILBOX |  |  |  | 1 |
|  | [01] MAILBOX_CONFIGURATION_GET |  |  | 1 |
|  | [02] MAILBOX_CONFIGURATION_SET |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] DISABLE | 1 |
|  |  |  | [01] ENABLE_MAILBOX_SERVICE | 1 |
|  |  |  | [02] ENABLE_MAILBOX_PROXY | 1 |
|  |  | Forwarding Destination IPv6 Address |  | 1 |
|  |  | UDP Port Number |  | 1 |
|  | [03] MAILBOX_CONFIGURATION_REPORT |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] DISABLE | 1 |
|  |  |  | [01] ENABLE_MAILBOX_SERVICE | 1 |
|  |  |  | [02] ENABLE_MAILBOX_PROXY | 1 |
|  |  | Supported Modes |  | 1 |
|  |  |  | [00] MAILBOX_SERVICE_SUPPORTED | 1 |
|  |  |  | [01] MAILBOX_PROXY_SUPPORTED | 1 |
|  |  | Mailbox Capacity |  | 1 |
|  |  | Forwarding Destination IPv6 Address |  | 1 |
|  |  | UDP Port Number |  | 1 |
|  | [04] MAILBOX_QUEUE |  |  | 1 |
|  |  | Sequence Number |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] PUSH | 1 |
|  |  |  | [01] POP | 1 |
|  |  |  | [02] WAITING | 1 |
|  |  |  | [03] PING | 1 |
|  |  |  | [04] ACK | 1 |
|  |  |  | [05] NACK | 1 |
|  |  |  | [06] QUEUE_FULL | 1 |
|  |  | Last |  | 1 |
|  |  | Queue Handle |  | 1 |
|  |  | Mailbox Entry |  | 1 |
|  | [05] MAILBOX_WAKEUP_NOTIFICATION |  |  | 1 |
|  |  | Queue Handle |  | 1 |
|  | [06] MAILBOX_NODE_FAILING |  |  | 1 |
|  |  | Queue Handle |  | 1 |
| [6A] COMMAND_CLASS_WINDOW_COVERING |  |  |  | 1 |
|  | [01] WINDOW_COVERING_SUPPORTED_GET |  |  | 1 |
|  | [02] WINDOW_COVERING_SUPPORTED_REPORT |  |  | 1 |
|  |  | Number of Parameter Mask bytes |  | 1 |
|  |  | Parameter Mask |  | 1 |
|  | [03] WINDOW_COVERING_GET |  |  | 1 |
|  |  | Parameter ID |  | 1 |
|  |  |  | [00] OUT_LEFT_1 | 1 |
|  |  |  | [01] OUT_LEFT_2 | 1 |
|  |  |  | [02] OUT_RIGHT_1 | 1 |
|  |  |  | [03] OUT_RIGHT_2 | 1 |
|  |  |  | [04] IN_LEFT_1 | 1 |
|  |  |  | [05] IN_LEFT_2 | 1 |
|  |  |  | [06] IN_RIGHT_1 | 1 |
|  |  |  | [07] IN_RIGHT_2 | 1 |
|  |  |  | [08] IN_RIGHT_LEFT_1 | 1 |
|  |  |  | [09] IN_RIGHT_LEFT_2 | 1 |
|  |  |  | [0A] VERTICAL_SLATS_ANGLE_1 | 1 |
|  |  |  | [0B] IN_TOP_1 | 1 |
|  |  |  | [0C] OUT_BOTTOM_1 | 1 |
|  |  |  | [0D] OUT_BOTTOM_2 | 1 |
|  |  |  | [0E] OUT_TOP_1 | 1 |
|  |  |  | [0F] OUT_TOP_2 | 1 |
|  |  |  | [10] IN_BOTTOM_1 | 1 |
|  |  |  | [11] IN_BOTTOM_2 | 1 |
|  |  |  | [12] IN_TOP_2 | 1 |
|  |  |  | [13] IN_TOP_BOTTOM_1 | 1 |
|  |  |  | [14] IN_TOP_BOTTOM_2 | 1 |
|  |  |  | [15] HORIZONTAL_SLATS_ANGLE_1 | 1 |
|  |  |  | [16] HORIZONTAL_SLATS_ANGLE_2 | 1 |
|  | [04] WINDOW_COVERING_REPORT |  |  | 1 |
|  |  | Parameter ID |  | 1 |
|  |  |  | [00] OUT_LEFT_1 | 1 |
|  |  |  | [01] OUT_LEFT_2 | 1 |
|  |  |  | [02] OUT_RIGHT_1 | 1 |
|  |  |  | [03] OUT_RIGHT_2 | 1 |
|  |  |  | [04] IN_LEFT_1 | 1 |
|  |  |  | [05] IN_LEFT_2 | 1 |
|  |  |  | [06] IN_RIGHT_1 | 1 |
|  |  |  | [07] IN_RIGHT_2 | 1 |
|  |  |  | [08] IN_RIGHT_LEFT_1 | 1 |
|  |  |  | [09] IN_RIGHT_LEFT_2 | 1 |
|  |  |  | [0A] VERTICAL_SLATS_ANGLE_1 | 1 |
|  |  |  | [0B] IN_TOP_1 | 1 |
|  |  |  | [0C] OUT_BOTTOM_1 | 1 |
|  |  |  | [0D] OUT_BOTTOM_2 | 1 |
|  |  |  | [0E] OUT_TOP_1 | 1 |
|  |  |  | [0F] OUT_TOP_2 | 1 |
|  |  |  | [10] IN_BOTTOM_1 | 1 |
|  |  |  | [11] IN_BOTTOM_2 | 1 |
|  |  |  | [12] IN_TOP_2 | 1 |
|  |  |  | [13] IN_TOP_BOTTOM_1 | 1 |
|  |  |  | [14] IN_TOP_BOTTOM_2 | 1 |
|  |  |  | [15] HORIZONTAL_SLATS_ANGLE_1 | 1 |
|  |  |  | [16] HORIZONTAL_SLATS_ANGLE_2 | 1 |
|  |  | Current Value |  | 1 |
|  |  | Target Value |  | 1 |
|  |  | Duration |  | 1 |
|  | [05] WINDOW_COVERING_SET |  |  | 1 |
|  |  | Parameter Count |  | 1 |
|  |  | Window Covering |  | 1 |
|  |  | Duration |  | 1 |
|  | [06] WINDOW_COVERING_START_LEVEL_CHANGE |  |  | 1 |
|  |  | Res1 |  | 1 |
|  |  | Up Down |  | 1 |
|  |  | Res2 |  | 1 |
|  |  | Parameter ID |  | 1 |
|  |  |  | [00] OUT_LEFT_1 | 1 |
|  |  |  | [01] OUT_LEFT_2 | 1 |
|  |  |  | [02] OUT_RIGHT_1 | 1 |
|  |  |  | [03] OUT_RIGHT_2 | 1 |
|  |  |  | [04] IN_LEFT_1 | 1 |
|  |  |  | [05] IN_LEFT_2 | 1 |
|  |  |  | [06] IN_RIGHT_1 | 1 |
|  |  |  | [07] IN_RIGHT_2 | 1 |
|  |  |  | [08] IN_RIGHT_LEFT_1 | 1 |
|  |  |  | [09] IN_RIGHT_LEFT_2 | 1 |
|  |  |  | [0A] VERTICAL_SLATS_ANGLE_1 | 1 |
|  |  |  | [0B] IN_TOP_1 | 1 |
|  |  |  | [0C] OUT_BOTTOM_1 | 1 |
|  |  |  | [0D] OUT_BOTTOM_2 | 1 |
|  |  |  | [0E] OUT_TOP_1 | 1 |
|  |  |  | [0F] OUT_TOP_2 | 1 |
|  |  |  | [10] IN_BOTTOM_1 | 1 |
|  |  |  | [11] IN_BOTTOM_2 | 1 |
|  |  |  | [12] IN_TOP_2 | 1 |
|  |  |  | [13] IN_TOP_BOTTOM_1 | 1 |
|  |  |  | [14] IN_TOP_BOTTOM_2 | 1 |
|  |  |  | [15] HORIZONTAL_SLATS_ANGLE_1 | 1 |
|  |  |  | [16] HORIZONTAL_SLATS_ANGLE_2 | 1 |
|  |  | Duration |  | 1 |
|  | [07] WINDOW_COVERING_STOP_LEVEL_CHANGE |  |  | 1 |
|  |  | Parameter ID |  | 1 |
|  |  |  | [00] OUT_LEFT_1 | 1 |
|  |  |  | [01] OUT_LEFT_2 | 1 |
|  |  |  | [02] OUT_RIGHT_1 | 1 |
|  |  |  | [03] OUT_RIGHT_2 | 1 |
|  |  |  | [04] IN_LEFT_1 | 1 |
|  |  |  | [05] IN_LEFT_2 | 1 |
|  |  |  | [06] IN_RIGHT_1 | 1 |
|  |  |  | [07] IN_RIGHT_2 | 1 |
|  |  |  | [08] IN_RIGHT_LEFT_1 | 1 |
|  |  |  | [09] IN_RIGHT_LEFT_2 | 1 |
|  |  |  | [0A] VERTICAL_SLATS_ANGLE_1 | 1 |
|  |  |  | [0B] IN_TOP_1 | 1 |
|  |  |  | [0C] OUT_BOTTOM_1 | 1 |
|  |  |  | [0D] OUT_BOTTOM_2 | 1 |
|  |  |  | [0E] OUT_TOP_1 | 1 |
|  |  |  | [0F] OUT_TOP_2 | 1 |
|  |  |  | [10] IN_BOTTOM_1 | 1 |
|  |  |  | [11] IN_BOTTOM_2 | 1 |
|  |  |  | [12] IN_TOP_2 | 1 |
|  |  |  | [13] IN_TOP_BOTTOM_1 | 1 |
|  |  |  | [14] IN_TOP_BOTTOM_2 | 1 |
|  |  |  | [15] HORIZONTAL_SLATS_ANGLE_1 | 1 |
|  |  |  | [16] HORIZONTAL_SLATS_ANGLE_2 | 1 |
| [6B] COMMAND_CLASS_IRRIGATION |  |  |  | 1 |
|  | [01] IRRIGATION_SYSTEM_INFO_GET |  |  | 1 |
|  | [02] IRRIGATION_SYSTEM_INFO_REPORT |  |  | 1 |
|  |  | Master Valve |  | 1 |
|  |  | Total Number of Valves |  | 1 |
|  |  | Total Number of Valve Tables |  | 1 |
|  |  | Valve Table Max Size |  | 1 |
|  | [03] IRRIGATION_SYSTEM_STATUS_GET |  |  | 1 |
|  | [04] IRRIGATION_SYSTEM_STATUS_REPORT |  |  | 1 |
|  |  | System Voltage |  | 1 |
|  |  | Sensor Status |  | 1 |
|  |  |  | [00] FLOW_SENSOR_DETECTED | 1 |
|  |  |  | [01] PRESSURE_SENSOR_DETECTED | 1 |
|  |  |  | [02] RAIN_SENSOR_DETECTED | 1 |
|  |  |  | [03] MOISTURE_SENSOR_DETECTED | 1 |
|  |  | Flow Size |  | 1 |
|  |  | Flow Scale |  | 1 |
|  |  | Flow Precision |  | 1 |
|  |  | Flow Value |  | 1 |
|  |  | Pressure Size |  | 1 |
|  |  | Pressure Scale |  | 1 |
|  |  | Pressure Precision |  | 1 |
|  |  | Pressure Value |  | 1 |
|  |  | Shutoff Duration |  | 1 |
|  |  | System Error Status |  | 1 |
|  |  |  | [00] NOT_PROGRAMMED | 1 |
|  |  |  | [01] EMERGENCY_SHUTDOWN | 1 |
|  |  |  | [02] HIGH_THRESHOLD_TRIGGERED | 1 |
|  |  |  | [03] LOW_THRESHOLD_TRIGGERED | 1 |
|  |  |  | [04] VALVE_ERRORS | 1 |
|  |  | Master Valve |  | 1 |
|  |  | Valve ID |  | 1 |
|  | [05] IRRIGATION_SYSTEM_CONFIG_SET |  |  | 1 |
|  |  | Master Valve Delay |  | 1 |
|  |  | High Pressure Threshold Size |  | 1 |
|  |  | High Pressure Threshold Scale |  | 1 |
|  |  | High Pressure Threshold Precision |  | 1 |
|  |  | High Pressure Threshold Value |  | 1 |
|  |  | Low Pressure Threshold Size |  | 1 |
|  |  | Low Pressure Threshold Scale |  | 1 |
|  |  | Low Pressure Threshold Precision |  | 1 |
|  |  | Low Pressure Threshold Value |  | 1 |
|  |  | Sensor Polarity |  | 1 |
|  |  |  | [00] RAIN_SENSOR_POLARITY | 1 |
|  |  |  | [01] MOISTURE_SENSOR_POLARITY | 1 |
|  |  |  | [07] VALID | 1 |
|  | [06] IRRIGATION_SYSTEM_CONFIG_GET |  |  | 1 |
|  | [07] IRRIGATION_SYSTEM_CONFIG_REPORT |  |  | 1 |
|  |  | Master Valve Delay |  | 1 |
|  |  | High Pressure Threshold Size |  | 1 |
|  |  | High Pressure Threshold Scale |  | 1 |
|  |  | High Pressure Threshold Precision |  | 1 |
|  |  | High Pressure Threshold Value |  | 1 |
|  |  | Low Pressure Threshold Size |  | 1 |
|  |  | Low Pressure Threshold Scale |  | 1 |
|  |  | Low Pressure Threshold Precision |  | 1 |
|  |  | Low Pressure Threshold Value |  | 1 |
|  |  | Sensor Polarity |  | 1 |
|  |  |  | [00] RAIN_SENSOR_POLARITY | 1 |
|  |  |  | [01] MOISTURE_SENSOR_POLARITY | 1 |
|  |  |  | [07] VALID | 1 |
|  | [08] IRRIGATION_VALVE_INFO_GET |  |  | 1 |
|  |  | Master Valve |  | 1 |
|  |  | Valve ID |  | 1 |
|  | [09] IRRIGATION_VALVE_INFO_REPORT |  |  | 1 |
|  |  | Master |  | 1 |
|  |  | Connected |  | 1 |
|  |  | Valve ID |  | 1 |
|  |  | Nominal Current |  | 1 |
|  |  | Valve Error Status |  | 1 |
|  |  |  | [00] SHORT_CIRCUIT | 1 |
|  |  |  | [01] CURRENT_HIGH_THRESHOLD | 1 |
|  |  |  | [02] CURRENT_LOW_THRESHOLD | 1 |
|  |  |  | [03] MAXIMUM_FLOW | 1 |
|  |  |  | [04] FLOW_HIGH_THRESHOLD | 1 |
|  |  |  | [05] FLOW_LOW_THRESHOLD | 1 |
|  | [0A] IRRIGATION_VALVE_CONFIG_SET |  |  | 1 |
|  |  | Master Valve |  | 1 |
|  |  | Valve ID |  | 1 |
|  |  | Nominal Current High Threshold |  | 1 |
|  |  | Nominal Current Low Threshold |  | 1 |
|  |  | Maximum Flow Size |  | 1 |
|  |  | Maximum Flow Scale |  | 1 |
|  |  | Maximum Flow Precision |  | 1 |
|  |  | Maximum Flow Value |  | 1 |
|  |  | Flow High Threshold Size |  | 1 |
|  |  | Flow High Threshold Scale |  | 1 |
|  |  | Flow High Threshold Precision |  | 1 |
|  |  | Flow High Threshold Value |  | 1 |
|  |  | Flow Low Threshold Size |  | 1 |
|  |  | Flow Low Threshold Scale |  | 1 |
|  |  | Flow Low Threshold Precision |  | 1 |
|  |  | Flow Low Threshold Value |  | 1 |
|  |  | Sensor Usage |  | 1 |
|  |  |  | [00] USE_RAIN_SENSOR | 1 |
|  |  |  | [01] USE_MOISTURE_SENSOR | 1 |
|  | [0B] IRRIGATION_VALVE_CONFIG_GET |  |  | 1 |
|  |  | Master Valve |  | 1 |
|  |  | Valve ID |  | 1 |
|  | [0C] IRRIGATION_VALVE_CONFIG_REPORT |  |  | 1 |
|  |  | Master Valve |  | 1 |
|  |  | Valve ID |  | 1 |
|  |  | Nominal Current High Threshold |  | 1 |
|  |  | Nominal Current Low Threshold |  | 1 |
|  |  | Maximum Flow Size |  | 1 |
|  |  | Maximum Flow Scale |  | 1 |
|  |  | Maximum Flow Precision |  | 1 |
|  |  | Maximum Flow Value |  | 1 |
|  |  | Flow High Threshold Size |  | 1 |
|  |  | Flow High Threshold Scale |  | 1 |
|  |  | Flow High Threshold Precision |  | 1 |
|  |  | Flow High Threshold Value |  | 1 |
|  |  | Flow Low Threshold Size |  | 1 |
|  |  | Flow Low Threshold Scale |  | 1 |
|  |  | Flow Low Threshold Precision |  | 1 |
|  |  | Flow Low Threshold Value |  | 1 |
|  |  | Sensor Usage |  | 1 |
|  |  |  | [00] USE_RAIN_SENSOR | 1 |
|  |  |  | [01] USE_MOISTURE_SENSOR | 1 |
|  | [0D] IRRIGATION_VALVE_RUN |  |  | 1 |
|  |  | Master Valve |  | 1 |
|  |  | Valve ID |  | 1 |
|  |  | Duration |  | 1 |
|  | [0E] IRRIGATION_VALVE_TABLE_SET |  |  | 1 |
|  |  | Valve Table ID |  | 1 |
|  |  | Irrigation Valve |  | 1 |
|  | [0F] IRRIGATION_VALVE_TABLE_GET |  |  | 1 |
|  |  | Valve Table ID |  | 1 |
|  | [10] IRRIGATION_VALVE_TABLE_REPORT |  |  | 1 |
|  |  | Valve Table ID |  | 1 |
|  |  | Irrigation Valve |  | 1 |
|  | [11] IRRIGATION_VALVE_TABLE_RUN |  |  | 1 |
|  |  | Valve Table ID |  | 1 |
|  | [12] IRRIGATION_SYSTEM_SHUTOFF |  |  | 1 |
|  |  | Duration |  | 1 |
| [6C] COMMAND_CLASS_SUPERVISION |  |  |  | 1 |
|  | [01] SUPERVISION_GET |  |  | 1 |
|  |  | Session ID |  | 1 |
|  |  | Status Updates |  | 1 |
|  |  | Encapsulated Command Length |  | 1 |
|  |  | Encapsulated Command |  | 1 |
|  | [02] SUPERVISION_REPORT |  |  | 1 |
|  |  | Session ID |  | 1 |
|  |  | More Status Updates |  | 1 |
|  |  | Status |  | 1 |
|  |  |  | [00] NO_SUPPORT | 1 |
|  |  |  | [01] WORKING | 1 |
|  |  |  | [02] FAIL | 1 |
|  |  |  | [03] BUSY | 1 |
|  |  |  | [FF] SUCCESS | 1 |
|  |  | Duration |  | 1 |
| [6D] COMMAND_CLASS_HUMIDITY_CONTROL_MODE |  |  |  | 1 |
|  | [01] HUMIDITY_CONTROL_MODE_SET |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] HUMIDIFY | 1 |
|  |  |  | [02] DEHUMIDIFY | 1 |
|  | [02] HUMIDITY_CONTROL_MODE_GET |  |  | 1 |
|  | [03] HUMIDITY_CONTROL_MODE_REPORT |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] HUMIDIFY | 1 |
|  |  |  | [02] DEHUMIDIFY | 1 |
|  | [04] HUMIDITY_CONTROL_MODE_SUPPORTED_GET |  |  | 1 |
|  | [05] HUMIDITY_CONTROL_MODE_SUPPORTED_REPORT |  |  | 1 |
|  |  | Bit Mask |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] HUMIDIFY | 1 |
|  |  |  | [02] DEHUMIDIFY | 1 |
| [6E] COMMAND_CLASS_HUMIDITY_CONTROL_OPERATING_STATE |  |  |  | 1 |
|  | [01] HUMIDITY_CONTROL_OPERATING_STATE_GET |  |  | 1 |
|  | [02] HUMIDITY_CONTROL_OPERATING_STATE_REPORT |  |  | 1 |
|  |  | Operating State |  | 1 |
|  |  |  | [00] IDLE | 1 |
|  |  |  | [01] HUMIDIFYING | 1 |
|  |  |  | [02] DEHUMIDIFYING | 1 |
| [6F] COMMAND_CLASS_ENTRY_CONTROL |  |  |  | 1 |
|  | [01] ENTRY_CONTROL_NOTIFICATION |  |  | 1 |
|  |  | Sequence Number |  | 1 |
|  |  | Data Type |  | 1 |
|  |  |  | [00] NA | 1 |
|  |  |  | [01] RAW | 1 |
|  |  |  | [02] ASCII | 1 |
|  |  |  | [03] MD5 | 1 |
|  |  | Event Type |  | 1 |
|  |  |  | [00] CACHING | 1 |
|  |  |  | [01] CACHED_KEYS | 1 |
|  |  |  | [02] ENTER | 1 |
|  |  |  | [03] DISARM_ALL | 1 |
|  |  |  | [04] ARM_ALL | 1 |
|  |  |  | [05] ARM_AWAY | 1 |
|  |  |  | [06] ARM_HOME | 1 |
|  |  |  | [07] EXIT_DELAY | 1 |
|  |  |  | [08] ARM_1 | 1 |
|  |  |  | [09] ARM_2 | 1 |
|  |  |  | [0A] ARM_3 | 1 |
|  |  |  | [0B] ARM_4 | 1 |
|  |  |  | [0C] ARM_5 | 1 |
|  |  |  | [0D] ARM_6 | 1 |
|  |  |  | [0E] RFID | 1 |
|  |  |  | [0F] BELL | 1 |
|  |  |  | [10] FIRE | 1 |
|  |  |  | [11] POLICE | 1 |
|  |  |  | [12] ALERT_PANIC | 1 |
|  |  |  | [13] ALERT_MEDICAL | 1 |
|  |  |  | [14] GATE_OPEN | 1 |
|  |  |  | [15] GATE_CLOSE | 1 |
|  |  |  | [16] LOCK | 1 |
|  |  |  | [17] UNLOCK | 1 |
|  |  |  | [18] TEST | 1 |
|  |  |  | [19] CANCEL | 1 |
|  |  | Event Data Length |  | 1 |
|  |  | Event Data |  | 1 |
|  | [02] ENTRY_CONTROL_KEY_SUPPORTED_GET |  |  | 1 |
|  | [03] ENTRY_CONTROL_KEY_SUPPORTED_REPORT |  |  | 1 |
|  |  | Key Supported Bit Mask Length |  | 1 |
|  |  | Key Supported Bit Mask |  | 1 |
|  | [04] ENTRY_CONTROL_EVENT_SUPPORTED_GET |  |  | 1 |
|  | [05] ENTRY_CONTROL_EVENT_SUPPORTED_REPORT |  |  | 1 |
|  |  | Data Type Supported Bit Mask Length |  | 1 |
|  |  | Data Type Supported Bit Mask |  | 1 |
|  |  |  | [00] NA | 1 |
|  |  |  | [01] RAW | 1 |
|  |  |  | [02] ASCII | 1 |
|  |  |  | [03] MD5 | 1 |
|  |  | Event Supported Bit Mask Length |  | 1 |
|  |  | Event Type Supported Bit Mask |  | 1 |
|  |  |  | [00] CACHING | 1 |
|  |  |  | [01] CACHED_KEYS | 1 |
|  |  |  | [02] ENTER | 1 |
|  |  |  | [03] DISARM_ALL | 1 |
|  |  |  | [04] ARM_ALL | 1 |
|  |  |  | [05] ARM_AWAY | 1 |
|  |  |  | [06] ARM_HOME | 1 |
|  |  |  | [07] EXIT_DELAY | 1 |
|  |  |  | [08] ARM_1 | 1 |
|  |  |  | [09] ARM_2 | 1 |
|  |  |  | [0A] ARM_3 | 1 |
|  |  |  | [0B] ARM_4 | 1 |
|  |  |  | [0C] ARM_5 | 1 |
|  |  |  | [0D] ARM_6 | 1 |
|  |  |  | [0E] RFID | 1 |
|  |  |  | [0F] BELL | 1 |
|  |  |  | [10] FIRE | 1 |
|  |  |  | [11] POLICE | 1 |
|  |  |  | [12] ALERT_PANIC | 1 |
|  |  |  | [13] ALERT_MEDICAL | 1 |
|  |  |  | [14] GATE_OPEN | 1 |
|  |  |  | [15] GATE_CLOSE | 1 |
|  |  |  | [16] LOCK | 1 |
|  |  |  | [17] UNLOCK | 1 |
|  |  |  | [18] TEST | 1 |
|  |  |  | [19] CANCEL | 1 |
|  |  | Key Cached Size supported Minimum |  | 1 |
|  |  | Key Cached Size supported Maximum |  | 1 |
|  |  | Key Cached Timeout supported Minimum |  | 1 |
|  |  | Key Cached Timeout supported Maximum |  | 1 |
|  | [06] ENTRY_CONTROL_CONFIGURATION_SET |  |  | 1 |
|  |  | Key Cache Size |  | 1 |
|  |  | Key Cache Timeout |  | 1 |
|  | [07] ENTRY_CONTROL_CONFIGURATION_GET |  |  | 1 |
|  | [08] ENTRY_CONTROL_CONFIGURATION_REPORT |  |  | 1 |
|  |  | Key Cache Size |  | 1 |
|  |  | Key Cache Timeout |  | 1 |
| [70] COMMAND_CLASS_CONFIGURATION |  |  |  | 4 |
|  | [01] CONFIGURATION_DEFAULT_RESET |  |  | 4 |
|  | [04] CONFIGURATION_SET |  |  | 1-4 |
|  |  | Parameter Number |  | 1-4 |
|  |  | Size |  | 1-4 |
|  |  | Default Value |  | 1-4 |
|  |  | Configuration Value |  | 1-4 |
|  | [05] CONFIGURATION_GET |  |  | 1-4 |
|  |  | Parameter Number |  | 1-4 |
|  | [06] CONFIGURATION_REPORT |  |  | 1-4 |
|  |  | Parameter Number |  | 1-4 |
|  |  | Size |  | 1-4 |
|  |  | Configuration Value |  | 1-4 |
|  | [07] CONFIGURATION_BULK_SET |  |  | 2-4 |
|  |  | Parameter Offset |  | 2-4 |
|  |  | Number of Parameters |  | 2-4 |
|  |  | Size |  | 2-4 |
|  |  | Handshake |  | 2-4 |
|  |  | Default Value |  | 2-4 |
|  |  | Configuration Parameter |  | 2-4 |
|  | [08] CONFIGURATION_BULK_GET |  |  | 2-4 |
|  |  | Parameter Offset |  | 2-4 |
|  |  | Number of Parameters |  | 2-4 |
|  | [09] CONFIGURATION_BULK_REPORT |  |  | 2-4 |
|  |  | Parameter Offset |  | 2-4 |
|  |  | Number of Parameters |  | 2-4 |
|  |  | Reports to follow |  | 2-4 |
|  |  | Size |  | 2-4 |
|  |  | Handshake |  | 2-4 |
|  |  | Default Value |  | 2-4 |
|  |  | Configuration Parameter |  | 2-4 |
|  | [0A] CONFIGURATION_NAME_GET |  |  | 3-4 |
|  |  | Parameter Number |  | 3-4 |
|  | [0B] CONFIGURATION_NAME_REPORT |  |  | 3-4 |
|  |  | Parameter Number |  | 3-4 |
|  |  | Reports to follow |  | 3-4 |
|  |  | Name |  | 3-4 |
|  | [0C] CONFIGURATION_INFO_GET |  |  | 3-4 |
|  |  | Parameter Number |  | 3-4 |
|  | [0D] CONFIGURATION_INFO_REPORT |  |  | 3-4 |
|  |  | Parameter Number |  | 3-4 |
|  |  | Reports to follow |  | 3-4 |
|  |  | Info |  | 3-4 |
|  | [0E] CONFIGURATION_PROPERTIES_GET |  |  | 3-4 |
|  |  | Parameter Number |  | 3-4 |
|  | [0F] CONFIGURATION_PROPERTIES_REPORT |  |  | 3-4 |
|  |  | Parameter Number |  | 3-4 |
|  |  | Size |  | 3-4 |
|  |  | Format |  | 3-4 |
|  |  |  | [00] SIGNED_INTEGER | 3-4 |
|  |  |  | [01] UNSIGNED_INTEGER | 3-4 |
|  |  |  | [02] ENUMERATED | 3-4 |
|  |  |  | [03] BIT_FIELD | 3-4 |
|  |  | Readonly |  | 4 |
|  |  | Re-inclusion required |  | 4 |
|  |  | Min Value |  | 3-4 |
|  |  | Max Value |  | 3-4 |
|  |  | Default Value |  | 3-4 |
|  |  | Next Parameter Number |  | 3-4 |
|  |  | Advanced |  | 4 |
|  |  | No Bulk support |  | 4 |
| [71] COMMAND_CLASS_NOTIFICATION |  |  |  | 8 |
|  | [01] EVENT_SUPPORTED_GET |  |  | 3-8 |
|  |  | Notification Type |  | 3-8 |
|  |  |  | [01] SMOKE | 3-8 |
|  |  |  | [02] CO | 3-8 |
|  |  |  | [03] CO2 | 3-8 |
|  |  |  | [04] HEAT | 3-8 |
|  |  |  | [05] WATER | 3-8 |
|  |  |  | [06] ACCESS_CONTROL | 3-8 |
|  |  |  | [07] BURGLAR | 3-8 |
|  |  |  | [08] POWER_MANAGEMENT | 3-8 |
|  |  |  | [09] SYSTEM | 3-8 |
|  |  |  | [0A] EMERGENCY | 3-8 |
|  |  |  | [0B] CLOCK | 3-8 |
|  |  |  | [0C] APPLIANCE | 4-8 |
|  |  |  | [0D] HOME_HEALTH | 4-8 |
|  |  |  | [0E] SIREN | 6-8 |
|  |  |  | [0F] WATER_VALVE | 7-8 |
|  |  |  | [10] WEATHER_ALARM | 7-8 |
|  |  |  | [11] IRRIGATION | 7-8 |
|  |  |  | [12] GAS_ALARM | 7-8 |
|  | [02] EVENT_SUPPORTED_REPORT |  |  | 3-8 |
|  |  | Notification Type |  | 3-8 |
|  |  |  | [01] SMOKE | 3-8 |
|  |  |  | [02] CO | 3-8 |
|  |  |  | [03] CO2 | 3-8 |
|  |  |  | [04] HEAT | 3-8 |
|  |  |  | [05] WATER | 3-8 |
|  |  |  | [06] ACCESS_CONTROL | 3-8 |
|  |  |  | [07] BURGLAR | 3-8 |
|  |  |  | [08] POWER_MANAGEMENT | 3-8 |
|  |  |  | [09] SYSTEM | 3-8 |
|  |  |  | [0A] EMERGENCY | 3-8 |
|  |  |  | [0B] CLOCK | 3-8 |
|  |  |  | [0C] APPLIANCE | 4-8 |
|  |  |  | [0D] HOME_HEALTH | 4-8 |
|  |  |  | [0E] SIREN | 6-8 |
|  |  |  | [0F] WATER_VALVE | 7-8 |
|  |  |  | [10] WEATHER_ALARM | 7-8 |
|  |  |  | [11] IRRIGATION | 7-8 |
|  |  |  | [12] GAS_ALARM | 7-8 |
|  |  | Number of Bit Masks |  | 3-8 |
|  |  | Bit Mask |  | 3-8 |
|  | [04] NOTIFICATION_GET |  |  | 1-8 |
|  |  | V1 Alarm Type |  | 1-8 |
|  |  | ZWave Alarm Type |  | 2 |
|  |  |  | [01] SMOKE | 2 |
|  |  |  | [02] CO | 2 |
|  |  |  | [03] CO2 | 2 |
|  |  |  | [04] HEAT | 2 |
|  |  |  | [05] WATER | 2 |
|  |  |  | [06] ACCESS_CONTROL | 2 |
|  |  |  | [07] BURGLAR | 2 |
|  |  |  | [08] POWER_MANAGEMENT | 2 |
|  |  |  | [09] SYSTEM | 2 |
|  |  |  | [0A] EMERGENCY | 2 |
|  |  |  | [0B] CLOCK | 2 |
|  |  | Notification Type |  | 3-8 |
|  |  |  | [01] SMOKE | 3-8 |
|  |  |  | [02] CO | 3-8 |
|  |  |  | [03] CO2 | 3-8 |
|  |  |  | [04] HEAT | 3-8 |
|  |  |  | [05] WATER | 3-8 |
|  |  |  | [06] ACCESS_CONTROL | 3-8 |
|  |  |  | [07] BURGLAR | 3-8 |
|  |  |  | [08] POWER_MANAGEMENT | 3-8 |
|  |  |  | [09] SYSTEM | 3-8 |
|  |  |  | [0A] EMERGENCY | 3-8 |
|  |  |  | [0B] CLOCK | 3-8 |
|  |  |  | [0C] APPLIANCE | 4-8 |
|  |  |  | [0D] HOME_HEALTH | 4-8 |
|  |  |  | [0E] SIREN | 6-8 |
|  |  |  | [0F] WATER_VALVE | 7-8 |
|  |  |  | [10] WEATHER_ALARM | 7-8 |
|  |  |  | [11] IRRIGATION | 7-8 |
|  |  |  | [12] GAS_ALARM | 7-8 |
|  |  | Event |  | 3-8 |
|  | [05] NOTIFICATION_REPORT |  |  | 1-8 |
|  |  | V1 Alarm Type |  | 1-8 |
|  |  | V1 Alarm Level |  | 1-8 |
|  |  | Zensor Net Source Node ID |  | 2 |
|  |  | ZWave Alarm Status |  | 2 |
|  |  |  | [00] OFF | 2 |
|  |  |  | [FF] ON | 2 |
|  |  | Notification Status |  | 3-8 |
|  |  |  | [00] OFF | 3-8 |
|  |  |  | [FE] NO_PENDING_NOTIFICATIONS | 4-8 |
|  |  |  | [FF] ON | 3-8 |
|  |  | ZWave Alarm Type |  | 2 |
|  |  |  | [01] SMOKE | 2 |
|  |  |  | [02] CO | 2 |
|  |  |  | [03] CO2 | 2 |
|  |  |  | [04] HEAT | 2 |
|  |  |  | [05] WATER | 2 |
|  |  |  | [06] ACCESS_CONTROL | 2 |
|  |  |  | [07] BURGLAR | 2 |
|  |  |  | [08] POWER_MANAGEMENT | 2 |
|  |  |  | [09] SYSTEM | 2 |
|  |  |  | [0A] EMERGENCY | 2 |
|  |  |  | [0B] CLOCK | 2 |
|  |  | Notification Type |  | 3-8 |
|  |  |  | [01] SMOKE | 3-8 |
|  |  |  | [02] CO | 3-8 |
|  |  |  | [03] CO2 | 3-8 |
|  |  |  | [04] HEAT | 3-8 |
|  |  |  | [05] WATER | 3-8 |
|  |  |  | [06] ACCESS_CONTROL | 3-8 |
|  |  |  | [07] BURGLAR | 3-8 |
|  |  |  | [08] POWER_MANAGEMENT | 3-8 |
|  |  |  | [09] SYSTEM | 3-8 |
|  |  |  | [0A] EMERGENCY | 3-8 |
|  |  |  | [0B] CLOCK | 3-8 |
|  |  |  | [0C] APPLIANCE | 4-8 |
|  |  |  | [0D] HOME_HEALTH | 4-8 |
|  |  |  | [0E] SIREN | 6-8 |
|  |  |  | [0F] WATER_VALVE | 7-8 |
|  |  |  | [10] WEATHER_ALARM | 7-8 |
|  |  |  | [11] IRRIGATION | 7-8 |
|  |  |  | [12] GAS_ALARM | 7-8 |
|  |  | ZWave Alarm Event |  | 2 |
|  |  | Event |  | 3-8 |
|  |  | Event Parameters Length |  | 3-8 |
|  |  | Sequence |  | 3-8 |
|  |  | Number of Event Parameters |  | 2 |
|  |  | Event Parameter |  | 2-8 |
|  |  | Sequence Number |  | 3-8 |
|  | [06] NOTIFICATION_SET |  |  | 2-8 |
|  |  | ZWave Alarm Type |  | 2 |
|  |  |  | [01] SMOKE | 2 |
|  |  |  | [02] CO | 2 |
|  |  |  | [03] CO2 | 2 |
|  |  |  | [04] HEAT | 2 |
|  |  |  | [05] WATER | 2 |
|  |  |  | [06] ACCESS_CONTROL | 2 |
|  |  |  | [07] BURGLAR | 2 |
|  |  |  | [08] POWER_MANAGEMENT | 2 |
|  |  |  | [09] SYSTEM | 2 |
|  |  |  | [0A] EMERGENCY | 2 |
|  |  |  | [0B] CLOCK | 2 |
|  |  | Notification Type |  | 3-8 |
|  |  |  | [01] SMOKE | 3-8 |
|  |  |  | [02] CO | 3-8 |
|  |  |  | [03] CO2 | 3-8 |
|  |  |  | [04] HEAT | 3-8 |
|  |  |  | [05] WATER | 3-8 |
|  |  |  | [06] ACCESS_CONTROL | 3-8 |
|  |  |  | [07] BURGLAR | 3-8 |
|  |  |  | [08] POWER_MANAGEMENT | 3-8 |
|  |  |  | [09] SYSTEM | 3-8 |
|  |  |  | [0A] EMERGENCY | 3-8 |
|  |  |  | [0B] CLOCK | 3-8 |
|  |  |  | [0C] APPLIANCE | 4-8 |
|  |  |  | [0D] HOME_HEALTH | 4-8 |
|  |  |  | [0E] SIREN | 6-8 |
|  |  |  | [0F] WATER_VALVE | 7-8 |
|  |  |  | [10] WEATHER_ALARM | 7-8 |
|  |  |  | [11] IRRIGATION | 7-8 |
|  |  |  | [12] GAS_ALARM | 7-8 |
|  |  | ZWave Alarm Status |  | 2 |
|  |  |  | [00] OFF | 2 |
|  |  |  | [FF] ON | 2 |
|  |  | Notification Status |  | 3-8 |
|  |  |  | [00] OFF | 3-8 |
|  |  |  | [FE] NO_PENDING_NOTIFICATIONS | 4-8 |
|  |  |  | [FF] ON | 3-8 |
|  | [07] NOTIFICATION_SUPPORTED_GET |  |  | 2-8 |
|  | [08] NOTIFICATION_SUPPORTED_REPORT |  |  | 2-8 |
|  |  | Number of Bit Masks |  | 2-8 |
|  |  | V1 Alarm |  | 2-8 |
|  |  | Bit Mask |  | 2-8 |
|  |  |  | [01] SMOKE | 2-8 |
|  |  |  | [02] CO | 2-8 |
|  |  |  | [03] CO2 | 2-8 |
|  |  |  | [04] HEAT | 2-8 |
|  |  |  | [05] WATER | 2-8 |
|  |  |  | [06] ACCESS_CONTROL | 2-8 |
|  |  |  | [07] BURGLAR | 2-8 |
|  |  |  | [08] POWER_MANAGEMENT | 2-8 |
|  |  |  | [09] SYSTEM | 2-8 |
|  |  |  | [0A] EMERGENCY | 2-8 |
|  |  |  | [0B] CLOCK | 2-8 |
|  |  |  | [0C] APPLIANCE | 4-8 |
|  |  |  | [0D] HOME_HEALTH | 4-8 |
|  |  |  | [0E] SIREN | 6-8 |
|  |  |  | [0F] WATER_VALVE | 7-8 |
|  |  |  | [10] WEATHER_ALARM | 7-8 |
|  |  |  | [11] IRRIGATION | 7-8 |
|  |  |  | [12] GAS_ALARM | 7-8 |
| [72] COMMAND_CLASS_MANUFACTURER_SPECIFIC |  |  |  | 2 |
|  | [04] MANUFACTURER_SPECIFIC_GET |  |  | 1-2 |
|  | [05] MANUFACTURER_SPECIFIC_REPORT |  |  | 1-2 |
|  |  | Manufacturer ID |  | 1-2 |
|  |  | Product Type ID |  | 1-2 |
|  |  | Product ID |  | 1-2 |
|  | [06] DEVICE_SPECIFIC_GET |  |  | 2 |
|  |  | Device ID Type |  | 2 |
|  |  |  | [01] SERIAL_NUMBER | 2 |
|  | [07] DEVICE_SPECIFIC_REPORT |  |  | 2 |
|  |  | Device ID Type |  | 2 |
|  |  |  | [01] SERIAL_NUMBER | 2 |
|  |  | Device ID Data Length Indicator |  | 2 |
|  |  | Device ID Data Format |  | 2 |
|  |  |  | [01] BINARY | 2 |
|  |  | Device ID Data |  | 2 |
| [73] COMMAND_CLASS_POWERLEVEL |  |  |  | 1 |
|  | [01] POWERLEVEL_SET |  |  | 1 |
|  |  | Power level |  | 1 |
|  |  |  | [00] NORMALPOWER | 1 |
|  |  |  | [01] MINUS1DBM | 1 |
|  |  |  | [02] MINUS2DBM | 1 |
|  |  |  | [03] MINUS3DBM | 1 |
|  |  |  | [04] MINUS4DBM | 1 |
|  |  |  | [05] MINUS5DBM | 1 |
|  |  |  | [06] MINUS6DBM | 1 |
|  |  |  | [07] MINUS7DBM | 1 |
|  |  |  | [08] MINUS8DBM | 1 |
|  |  |  | [09] MINUS9DBM | 1 |
|  |  | Timeout |  | 1 |
|  | [02] POWERLEVEL_GET |  |  | 1 |
|  | [03] POWERLEVEL_REPORT |  |  | 1 |
|  |  | Power level |  | 1 |
|  |  |  | [00] NORMALPOWER | 1 |
|  |  |  | [01] MINUS1DBM | 1 |
|  |  |  | [02] MINUS2DBM | 1 |
|  |  |  | [03] MINUS3DBM | 1 |
|  |  |  | [04] MINUS4DBM | 1 |
|  |  |  | [05] MINUS5DBM | 1 |
|  |  |  | [06] MINUS6DBM | 1 |
|  |  |  | [07] MINUS7DBM | 1 |
|  |  |  | [08] MINUS8DBM | 1 |
|  |  |  | [09] MINUS9DBM | 1 |
|  |  | Timeout |  | 1 |
|  | [04] POWERLEVEL_TEST_NODE_SET |  |  | 1 |
|  |  | Test NodeID |  | 1 |
|  |  | Power level |  | 1 |
|  |  |  | [00] NORMALPOWER | 1 |
|  |  |  | [01] MINUS1DBM | 1 |
|  |  |  | [02] MINUS2DBM | 1 |
|  |  |  | [03] MINUS3DBM | 1 |
|  |  |  | [04] MINUS4DBM | 1 |
|  |  |  | [05] MINUS5DBM | 1 |
|  |  |  | [06] MINUS6DBM | 1 |
|  |  |  | [07] MINUS7DBM | 1 |
|  |  |  | [08] MINUS8DBM | 1 |
|  |  |  | [09] MINUS9DBM | 1 |
|  |  | Test frame count |  | 1 |
|  | [05] POWERLEVEL_TEST_NODE_GET |  |  | 1 |
|  | [06] POWERLEVEL_TEST_NODE_REPORT |  |  | 1 |
|  |  | Test NodeID |  | 1 |
|  |  |  | [00] ZW_TEST_NOT_A_NODEID | 1 |
|  |  | Status of operation |  | 1 |
|  |  |  | [00] ZW_TEST_FAILED | 1 |
|  |  |  | [01] ZW_TEST_SUCCES | 1 |
|  |  |  | [02] ZW_TEST_INPROGRESS | 1 |
|  |  | Test Frame Count |  | 1 |
| [74] COMMAND_CLASS_INCLUSION_CONTROLLER |  |  |  | 1 |
|  | [01] INITIATE |  |  | 1 |
|  |  | Node ID |  | 1 |
|  |  | Step ID |  | 1 |
|  |  |  | [01] PROXY_INCLUSION | 1 |
|  |  |  | [02] S0_INCLUSION | 1 |
|  | [02] COMPLETE |  |  | 1 |
|  |  | Step ID |  | 1 |
|  |  |  | [01] PROXY_INCLUSION | 1 |
|  |  |  | [02] S0_INCLUSION | 1 |
|  |  | Status |  | 1 |
|  |  |  | [01] STEP_OK | 1 |
|  |  |  | [02] STEP_USER_REJECTED | 1 |
|  |  |  | [03] STEP_FAILED | 1 |
|  |  |  | [04] STEP_NOT_SUPPORTED | 1 |
| [75] COMMAND_CLASS_PROTECTION |  |  |  | 2 |
|  | [01] PROTECTION_SET |  |  | 1-2 |
|  |  | Local Protection State |  | 1-2 |
|  |  |  | [00] UNPROTECTED | 1-2 |
|  |  |  | [01] PROTECTION_BY_SEQUENCE | 1-2 |
|  |  |  | [02] NO_OPERATION_POSSIBLE | 1-2 |
|  |  | RF Protection State |  | 2 |
|  |  |  | [00] UNPROTECTED | 2 |
|  |  |  | [01] PROTECTION_BY_SEQUENCE | 2 |
|  |  |  | [02] NO_OPERATION_POSSIBLE | 2 |
|  | [02] PROTECTION_GET |  |  | 1-2 |
|  | [03] PROTECTION_REPORT |  |  | 1-2 |
|  |  | Local Protection State |  | 1-2 |
|  |  |  | [00] UNPROTECTED | 1-2 |
|  |  |  | [01] PROTECTION_BY_SEQUENCE | 1-2 |
|  |  |  | [02] NO_OPERATION_POSSIBLE | 1-2 |
|  |  | RF Protection State |  | 2 |
|  |  |  | [00] UNPROTECTED | 2 |
|  |  |  | [01] PROTECTION_BY_SEQUENCE | 2 |
|  |  |  | [02] NO_OPERATION_POSSIBLE | 2 |
|  | [04] PROTECTION_SUPPORTED_GET |  |  | 2 |
|  | [05] PROTECTION_SUPPORTED_REPORT |  |  | 2 |
|  |  | Timeout |  | 2 |
|  |  | Exclusive Control |  | 2 |
|  |  | Local Protection State |  | 2 |
|  |  | RF Protection State |  | 2 |
|  | [06] PROTECTION_EC_SET |  |  | 2 |
|  |  | Node ID |  | 2 |
|  | [07] PROTECTION_EC_GET |  |  | 2 |
|  | [08] PROTECTION_EC_REPORT |  |  | 2 |
|  |  | Node ID |  | 2 |
|  | [09] PROTECTION_TIMEOUT_SET |  |  | 2 |
|  |  | Timeout |  | 2 |
|  |  |  | [00] NO_TIMER_IS_SET | 2 |
|  |  |  | [FF] NO_TIMEOUT | 2 |
|  | [0A] PROTECTION_TIMEOUT_GET |  |  | 2 |
|  | [0B] PROTECTION_TIMEOUT_REPORT |  |  | 2 |
|  |  | Timeout |  | 2 |
|  |  |  | [00] NO_TIMER_IS_SET | 2 |
|  |  |  | [FF] NO_TIMEOUT_IS_SET | 2 |
| [76] COMMAND_CLASS_LOCK |  |  |  | 1 |
|  | [01] LOCK_SET |  |  | 1 |
|  |  | Lock State |  | 1 |
|  |  |  | [00] UNLOCKED | 1 |
|  |  |  | [01] LOCKED | 1 |
|  | [02] LOCK_GET |  |  | 1 |
|  | [03] LOCK_REPORT |  |  | 1 |
|  |  | Lock State |  | 1 |
|  |  |  | [00] UNLOCKED | 1 |
|  |  |  | [01] LOCKED | 1 |
| [77] COMMAND_CLASS_NODE_NAMING |  |  |  | 1 |
|  | [01] NODE_NAMING_NODE_NAME_SET |  |  | 1 |
|  |  | Char. Presentation |  | 1 |
|  |  | Node name char |  | 1 |
|  | [02] NODE_NAMING_NODE_NAME_GET |  |  | 1 |
|  | [03] NODE_NAMING_NODE_NAME_REPORT |  |  | 1 |
|  |  | Char. Presentation |  | 1 |
|  |  | Node name char |  | 1 |
|  | [04] NODE_NAMING_NODE_LOCATION_SET |  |  | 1 |
|  |  | Char. Presentation |  | 1 |
|  |  | Node location char |  | 1 |
|  | [05] NODE_NAMING_NODE_LOCATION_GET |  |  | 1 |
|  | [06] NODE_NAMING_NODE_LOCATION_REPORT |  |  | 1 |
|  |  | Char. Presentation |  | 1 |
|  |  | Node location char |  | 1 |
| [7A] COMMAND_CLASS_FIRMWARE_UPDATE_MD |  |  |  | 5 |
|  | [01] FIRMWARE_MD_GET |  |  | 1-5 |
|  | [02] FIRMWARE_MD_REPORT |  |  | 1-5 |
|  |  | Manufacturer ID |  | 1-5 |
|  |  | Firmware 0 ID |  | 1-5 |
|  |  | Firmware 0 Checksum |  | 1-5 |
|  |  | Firmware Upgradable |  | 3-5 |
|  |  | Number of Firmware Targets |  | 3-5 |
|  |  | Max Fragment Size  |  | 3-5 |
|  |  | Firmware Report |  | 3-5 |
|  |  | Hardware Version |  | 5 |
|  | [03] FIRMWARE_UPDATE_MD_REQUEST_GET |  |  | 1-5 |
|  |  | Manufacturer ID |  | 1-5 |
|  |  | Firmware ID |  | 1-5 |
|  |  | Checksum |  | 1-5 |
|  |  | Firmware Target |  | 3-5 |
|  |  | Fragment Size |  | 3-5 |
|  |  | Activation |  | 4-5 |
|  |  | Hardware Version |  | 5 |
|  | [04] FIRMWARE_UPDATE_MD_REQUEST_REPORT |  |  | 1-5 |
|  |  | Status |  | 1-5 |
|  |  |  | [00] INVALID_COMBINATION | 1-5 |
|  |  |  | [01] REQUIRES_AUTHENTICATION | 1-5 |
|  |  |  | [02] INVALID_FRAGMENT_SIZE | 3-5 |
|  |  |  | [03] NOT_UPGRADABLE | 3-5 |
|  |  |  | [04] INVALID_HARDWARE_VERSION | 5 |
|  |  |  | [FF] VALID_COMBINATION | 1-5 |
|  | [05] FIRMWARE_UPDATE_MD_GET |  |  | 1-5 |
|  |  | Number of Reports |  | 1-5 |
|  |  | Report number 1 |  | 1-5 |
|  |  | zero |  | 1-5 |
|  |  | Report number 2 |  | 1-5 |
|  | [06] FIRMWARE_UPDATE_MD_REPORT |  |  | 1-5 |
|  |  | Report number 1 |  | 1-5 |
|  |  | Last |  | 1-5 |
|  |  | Report number 2 |  | 1-5 |
|  |  | Data |  | 1-5 |
|  |  | Checksum |  | 2-5 |
|  | [07] FIRMWARE_UPDATE_MD_STATUS_REPORT |  |  | 1-5 |
|  |  | Status |  | 1-5 |
|  |  |  | [00] UNABLE_TO_RECEIVE_WITHOUT_CHECKSUM_ERROR | 1-5 |
|  |  |  | [01] UNABLE_TO_RECEIVE | 1-5 |
|  |  |  | [02] DOES_NOT_MATCH_THE_MANUFACTURER_ID | 4-5 |
|  |  |  | [03] DOES_NOT_MATCH_THE_FIRMWARE_ID | 4-5 |
|  |  |  | [04] DOES_NOT_MATCH_THE_FIRMWARE_TARGET | 4-5 |
|  |  |  | [05] INVALID_FILE_HEADER_INFORMATION | 4-5 |
|  |  |  | [06] INVALID_FILE_HEADER_FORMAT | 4-5 |
|  |  |  | [07] INSUFFICIENT_MEMORY | 4-5 |
|  |  |  | [08] DOES_NOT_MATCH_THE_HARDWARE_VERSION | 5 |
|  |  |  | [FD] SUCCESSFULLY_WAITING_FOR_ACTIVATION | 4-5 |
|  |  |  | [FE] SUCCESSFULLY_STORED | 3-5 |
|  |  |  | [FF] SUCCESSFULLY | 1-5 |
|  |  | WaitTime |  | 3-5 |
|  | [08] FIRMWARE_UPDATE_ACTIVATION_SET |  |  | 4-5 |
|  |  | Manufacturer ID |  | 4-5 |
|  |  | Firmware ID |  | 4-5 |
|  |  | Checksum |  | 4-5 |
|  |  | Firmware Target |  | 4-5 |
|  |  | Hardware Version |  | 5 |
|  | [09] FIRMWARE_UPDATE_ACTIVATION_STATUS_REPORT |  |  | 4-5 |
|  |  | Manufacturer ID |  | 4-5 |
|  |  | Firmware ID |  | 4-5 |
|  |  | Checksum |  | 4-5 |
|  |  | Firmware Target |  | 4-5 |
|  |  | Firmware Update Status |  | 4-5 |
|  |  |  | [00] INVALID_COMBINATION | 4-5 |
|  |  |  | [01] ERROR_ACTIVATING_THE_FIRMWARE | 4-5 |
|  |  |  | [FF] FIRMWARE_UPDATE_COMPLETED_SUCCESSFULLY | 4-5 |
|  |  | Hardware Version |  | 5 |
|  | [0A] FIRMWARE_UPDATE_MD_PREPARE_GET |  |  | 5 |
|  |  | Manufacturer ID |  | 5 |
|  |  | Firmware ID |  | 5 |
|  |  | Firmware Target |  | 5 |
|  |  | Fragment Size |  | 5 |
|  |  | Hardware Version |  | 5 |
|  | [0B] FIRMWARE_UPDATE_MD_PREPARE_REPORT |  |  | 5 |
|  |  | Status |  | 5 |
|  |  |  | [00] INVALID_COMBINATION | 5 |
|  |  |  | [01] REQUIRES_AUTHENTICATION | 5 |
|  |  |  | [02] INVALID_FRAGMENT_SIZE | 5 |
|  |  |  | [03] NOT_UPGRADABLE | 5 |
|  |  |  | [04] INVALID_HARDWARE_VERSION | 5 |
|  |  |  | [FF] VALID_COMBINATION | 5 |
|  |  | Firmware Checksum |  | 5 |
| [7B] COMMAND_CLASS_GROUPING_NAME |  |  |  | 1 |
|  | [01] GROUPING_NAME_SET |  |  | 1 |
|  |  | Grouping identifier |  | 1 |
|  |  | Char. Presentation |  | 1 |
|  |  | Grouping Name |  | 1 |
|  | [02] GROUPING_NAME_GET |  |  | 1 |
|  |  | Grouping identifier |  | 1 |
|  | [03] GROUPING_NAME_REPORT |  |  | 1 |
|  |  | Grouping identifier |  | 1 |
|  |  | Char. Presentation |  | 1 |
|  |  | Grouping Name |  | 1 |
| [7C] COMMAND_CLASS_REMOTE_ASSOCIATION_ACTIVATE |  |  |  | 1 |
|  | [01] REMOTE_ASSOCIATION_ACTIVATE |  |  | 1 |
|  |  | Grouping identifier |  | 1 |
| [7D] COMMAND_CLASS_REMOTE_ASSOCIATION |  |  |  | 1 |
|  | [01] REMOTE_ASSOCIATION_CONFIGURATION_SET |  |  | 1 |
|  |  | Local Grouping identifier |  | 1 |
|  |  |  | [00] ERASE_ALL_LIN | 1 |
|  |  | Remote NodeID |  | 1 |
|  |  |  | [00] REMOVE_A_LINK | 1 |
|  |  | Remote Grouping identifier |  | 1 |
|  | [02] REMOTE_ASSOCIATION_CONFIGURATION_GET |  |  | 1 |
|  |  | Local Grouping identifier |  | 1 |
|  | [03] REMOTE_ASSOCIATION_CONFIGURATION_REPORT |  |  | 1 |
|  |  | Local Grouping identifier |  | 1 |
|  |  |  | [00] ERASE_ALL_LIN | 1 |
|  |  | Remote NodeID |  | 1 |
|  |  |  | [00] REMOVE_A_LINK | 1 |
|  |  | Remote Grouping identifier |  | 1 |
| [80] COMMAND_CLASS_BATTERY |  |  |  | 1 |
|  | [02] BATTERY_GET |  |  | 1 |
|  | [03] BATTERY_REPORT |  |  | 1 |
|  |  | Battery Level |  | 1 |
|  |  |  | [FF] BATTERY_LOW_WARNING | 1 |
| [81] COMMAND_CLASS_CLOCK |  |  |  | 1 |
|  | [04] CLOCK_SET |  |  | 1 |
|  |  | Hour |  | 1 |
|  |  | Weekday |  | 1 |
|  |  | Minute |  | 1 |
|  | [05] CLOCK_GET |  |  | 1 |
|  | [06] CLOCK_REPORT |  |  | 1 |
|  |  | Hour |  | 1 |
|  |  | Weekday |  | 1 |
|  |  | Minute |  | 1 |
| [82] COMMAND_CLASS_HAIL |  |  |  | 1 |
|  | [01] HAIL |  |  | 1 |
| [84] COMMAND_CLASS_WAKE_UP |  |  |  | 2 |
|  | [04] WAKE_UP_INTERVAL_SET |  |  | 1-2 |
|  |  | Seconds |  | 1-2 |
|  |  | NodeID |  | 1-2 |
|  | [05] WAKE_UP_INTERVAL_GET |  |  | 1-2 |
|  | [06] WAKE_UP_INTERVAL_REPORT |  |  | 1-2 |
|  |  | Seconds |  | 1-2 |
|  |  | NodeID |  | 1-2 |
|  | [07] WAKE_UP_NOTIFICATION |  |  | 1-2 |
|  | [08] WAKE_UP_NO_MORE_INFORMATION |  |  | 1-2 |
|  | [09] WAKE_UP_INTERVAL_CAPABILITIES_GET |  |  | 2 |
|  | [0A] WAKE_UP_INTERVAL_CAPABILITIES_REPORT |  |  | 2 |
|  |  | Minimum Wake Up Interval Seconds |  | 2 |
|  |  | Maximum Wake Up Interval Seconds |  | 2 |
|  |  | Default Wake Up Interval Seconds |  | 2 |
|  |  | Wake Up Interval Step Seconds |  | 2 |
| [85] COMMAND_CLASS_ASSOCIATION |  |  |  | 2 |
|  | [01] ASSOCIATION_SET |  |  | 1-2 |
|  |  | Grouping Identifier |  | 1-2 |
|  |  | Node ID |  | 1-2 |
|  | [02] ASSOCIATION_GET |  |  | 1-2 |
|  |  | Grouping Identifier |  | 1-2 |
|  | [03] ASSOCIATION_REPORT |  |  | 1-2 |
|  |  | Grouping Identifier |  | 1-2 |
|  |  | Max Nodes Supported |  | 1-2 |
|  |  | Reports to Follow |  | 1-2 |
|  |  | NodeID |  | 1-2 |
|  | [04] ASSOCIATION_REMOVE |  |  | 1-2 |
|  |  | Grouping Identifier |  | 1-2 |
|  |  | Node ID |  | 1-2 |
|  | [05] ASSOCIATION_GROUPINGS_GET |  |  | 1-2 |
|  | [06] ASSOCIATION_GROUPINGS_REPORT |  |  | 1-2 |
|  |  | Supported Groupings |  | 1-2 |
|  | [0B] ASSOCIATION_SPECIFIC_GROUP_GET |  |  | 2 |
|  | [0C] ASSOCIATION_SPECIFIC_GROUP_REPORT |  |  | 2 |
|  |  | Group |  | 2 |
| [86] COMMAND_CLASS_VERSION |  |  |  | 2 |
|  | [11] VERSION_GET |  |  | 1-2 |
|  | [12] VERSION_REPORT |  |  | 1-2 |
|  |  | Z-Wave Library Type |  | 1-2 |
|  |  | Z-Wave Protocol Version |  | 1-2 |
|  |  | Z-Wave Protocol Sub Version |  | 1-2 |
|  |  | Firmware 0 Version |  | 1-2 |
|  |  | Firmware 0 Sub Version |  | 1-2 |
|  |  | Hardware Version |  | 2 |
|  |  | Number of firmware targets |  | 2 |
|  |  | Firmware Version |  | 2 |
|  | [13] VERSION_COMMAND_CLASS_GET |  |  | 1-2 |
|  |  | Requested Command Class |  | 1-2 |
|  | [14] VERSION_COMMAND_CLASS_REPORT |  |  | 1-2 |
|  |  | Requested Command Class |  | 1-2 |
|  |  | Command Class Version |  | 1-2 |
| [87] COMMAND_CLASS_INDICATOR |  |  |  | 2 |
|  | [01] INDICATOR_SET |  |  | 1-2 |
|  |  | Indicator 0 Value |  | 1-2 |
|  |  |  | [00] OFF_DISABLE | 1-2 |
|  |  |  | [FF] ON_ENABLE | 1-2 |
|  |  | Indicator Object Count |  | 2 |
|  |  | Indicator Information |  | 2 |
|  | [02] INDICATOR_GET |  |  | 1-2 |
|  |  | Indicator ID |  | 2 |
|  |  |  | [00] NA | 2 |
|  |  |  | [01] ARMED | 2 |
|  |  |  | [02] NOT_ARMED | 2 |
|  |  |  | [03] READY | 2 |
|  |  |  | [04] FAULT | 2 |
|  |  |  | [05] BUSY | 2 |
|  |  |  | [06] ENTER_ID | 2 |
|  |  |  | [07] ENTER_PIN | 2 |
|  |  |  | [08] OK | 2 |
|  |  |  | [09] NOT_OK | 2 |
|  |  |  | [20] ZONE1_ARMED | 2 |
|  |  |  | [21] ZONE2_ARMED | 2 |
|  |  |  | [22] ZONE3_ARMED | 2 |
|  |  |  | [23] ZONE4_ARMED | 2 |
|  |  |  | [24] ZONE5_ARMED | 2 |
|  |  |  | [25] ZONE6_ARMED | 2 |
|  |  |  | [30] LCD_BACKLIGHT | 2 |
|  |  |  | [40] BUTTON_BACKLIGHT_LETTERS | 2 |
|  |  |  | [41] BUTTON_BACKLIGHT_DIGITS | 2 |
|  |  |  | [42] BUTTON_BACKLIGHT_COMMAND | 2 |
|  |  |  | [43] BUTTON1_INDICATION | 2 |
|  |  |  | [44] BUTTON2_INDICATION | 2 |
|  |  |  | [45] BUTTON3_INDICATION | 2 |
|  |  |  | [46] BUTTON4_INDICATION | 2 |
|  |  |  | [47] BUTTON5_INDICATION | 2 |
|  |  |  | [48] BUTTON6_INDICATION | 2 |
|  |  |  | [49] BUTTON7_INDICATION | 2 |
|  |  |  | [4A] BUTTON8_INDICATION | 2 |
|  |  |  | [4B] BUTTON9_INDICATION | 2 |
|  |  |  | [4C] BUTTON10_INDICATION | 2 |
|  |  |  | [4D] BUTTON11_INDICATION | 2 |
|  |  |  | [4E] BUTTON12_INDICATION | 2 |
|  |  |  | [F0] BUZZER | 2 |
|  | [03] INDICATOR_REPORT |  |  | 1-2 |
|  |  | Indicator 0 Value |  | 1-2 |
|  |  |  | [00] OFF_DISABLE | 1-2 |
|  |  |  | [FF] ON_ENABLE | 1-2 |
|  |  | Indicator Object Count |  | 2 |
|  |  | Indicator Information |  | 2 |
|  | [04] INDICATOR_SUPPORTED_GET |  |  | 2 |
|  |  | Indicator ID |  | 2 |
|  |  |  | [00] NA | 2 |
|  |  |  | [01] ARMED | 2 |
|  |  |  | [02] NOT_ARMED | 2 |
|  |  |  | [03] READY | 2 |
|  |  |  | [04] FAULT | 2 |
|  |  |  | [05] BUSY | 2 |
|  |  |  | [06] ENTER_ID | 2 |
|  |  |  | [07] ENTER_PIN | 2 |
|  |  |  | [08] OK | 2 |
|  |  |  | [09] NOT_OK | 2 |
|  |  |  | [20] ZONE1_ARMED | 2 |
|  |  |  | [21] ZONE2_ARMED | 2 |
|  |  |  | [22] ZONE3_ARMED | 2 |
|  |  |  | [23] ZONE4_ARMED | 2 |
|  |  |  | [24] ZONE5_ARMED | 2 |
|  |  |  | [25] ZONE6_ARMED | 2 |
|  |  |  | [30] LCD_BACKLIGHT | 2 |
|  |  |  | [40] BUTTON_BACKLIGHT_LETTERS | 2 |
|  |  |  | [41] BUTTON_BACKLIGHT_DIGITS | 2 |
|  |  |  | [42] BUTTON_BACKLIGHT_COMMAND | 2 |
|  |  |  | [43] BUTTON1_INDICATION | 2 |
|  |  |  | [44] BUTTON2_INDICATION | 2 |
|  |  |  | [45] BUTTON3_INDICATION | 2 |
|  |  |  | [46] BUTTON4_INDICATION | 2 |
|  |  |  | [47] BUTTON5_INDICATION | 2 |
|  |  |  | [48] BUTTON6_INDICATION | 2 |
|  |  |  | [49] BUTTON7_INDICATION | 2 |
|  |  |  | [4A] BUTTON8_INDICATION | 2 |
|  |  |  | [4B] BUTTON9_INDICATION | 2 |
|  |  |  | [4C] BUTTON10_INDICATION | 2 |
|  |  |  | [4D] BUTTON11_INDICATION | 2 |
|  |  |  | [4E] BUTTON12_INDICATION | 2 |
|  |  |  | [F0] BUZZER | 2 |
|  | [05] INDICATOR_SUPPORTED_REPORT |  |  | 2 |
|  |  | Indicator ID |  | 2 |
|  |  |  | [00] NA | 2 |
|  |  |  | [01] ARMED | 2 |
|  |  |  | [02] NOT_ARMED | 2 |
|  |  |  | [03] READY | 2 |
|  |  |  | [04] FAULT | 2 |
|  |  |  | [05] BUSY | 2 |
|  |  |  | [06] ENTER_ID | 2 |
|  |  |  | [07] ENTER_PIN | 2 |
|  |  |  | [08] OK | 2 |
|  |  |  | [09] NOT_OK | 2 |
|  |  |  | [20] ZONE1_ARMED | 2 |
|  |  |  | [21] ZONE2_ARMED | 2 |
|  |  |  | [22] ZONE3_ARMED | 2 |
|  |  |  | [23] ZONE4_ARMED | 2 |
|  |  |  | [24] ZONE5_ARMED | 2 |
|  |  |  | [25] ZONE6_ARMED | 2 |
|  |  |  | [30] LCD_BACKLIGHT | 2 |
|  |  |  | [40] BUTTON_BACKLIGHT_LETTERS | 2 |
|  |  |  | [41] BUTTON_BACKLIGHT_DIGITS | 2 |
|  |  |  | [42] BUTTON_BACKLIGHT_COMMAND | 2 |
|  |  |  | [43] BUTTON1_INDICATION | 2 |
|  |  |  | [44] BUTTON2_INDICATION | 2 |
|  |  |  | [45] BUTTON3_INDICATION | 2 |
|  |  |  | [46] BUTTON4_INDICATION | 2 |
|  |  |  | [47] BUTTON5_INDICATION | 2 |
|  |  |  | [48] BUTTON6_INDICATION | 2 |
|  |  |  | [49] BUTTON7_INDICATION | 2 |
|  |  |  | [4A] BUTTON8_INDICATION | 2 |
|  |  |  | [4B] BUTTON9_INDICATION | 2 |
|  |  |  | [4C] BUTTON10_INDICATION | 2 |
|  |  |  | [4D] BUTTON11_INDICATION | 2 |
|  |  |  | [4E] BUTTON12_INDICATION | 2 |
|  |  |  | [F0] BUZZER | 2 |
|  |  | Next Indicator ID |  | 2 |
|  |  |  | [00] NA | 2 |
|  |  |  | [01] ARMED | 2 |
|  |  |  | [02] NOT_ARMED | 2 |
|  |  |  | [03] READY | 2 |
|  |  |  | [04] FAULT | 2 |
|  |  |  | [05] BUSY | 2 |
|  |  |  | [06] ENTER_ID | 2 |
|  |  |  | [07] ENTER_PIN | 2 |
|  |  |  | [08] OK | 2 |
|  |  |  | [09] NOT_OK | 2 |
|  |  |  | [20] ZONE1_ARMED | 2 |
|  |  |  | [21] ZONE2_ARMED | 2 |
|  |  |  | [22] ZONE3_ARMED | 2 |
|  |  |  | [23] ZONE4_ARMED | 2 |
|  |  |  | [24] ZONE5_ARMED | 2 |
|  |  |  | [25] ZONE6_ARMED | 2 |
|  |  |  | [30] LCD_BACKLIGHT | 2 |
|  |  |  | [40] BUTTON_BACKLIGHT_LETTERS | 2 |
|  |  |  | [41] BUTTON_BACKLIGHT_DIGITS | 2 |
|  |  |  | [42] BUTTON_BACKLIGHT_COMMAND | 2 |
|  |  |  | [43] BUTTON1_INDICATION | 2 |
|  |  |  | [44] BUTTON2_INDICATION | 2 |
|  |  |  | [45] BUTTON3_INDICATION | 2 |
|  |  |  | [46] BUTTON4_INDICATION | 2 |
|  |  |  | [47] BUTTON5_INDICATION | 2 |
|  |  |  | [48] BUTTON6_INDICATION | 2 |
|  |  |  | [49] BUTTON7_INDICATION | 2 |
|  |  |  | [4A] BUTTON8_INDICATION | 2 |
|  |  |  | [4B] BUTTON9_INDICATION | 2 |
|  |  |  | [4C] BUTTON10_INDICATION | 2 |
|  |  |  | [4D] BUTTON11_INDICATION | 2 |
|  |  |  | [4E] BUTTON12_INDICATION | 2 |
|  |  |  | [F0] BUZZER | 2 |
|  |  | Property Supported Bit Mask Length |  | 2 |
|  |  | Property Supported Bit Mask |  | 2 |
|  |  |  | [01] MULTILEVEL | 2 |
|  |  |  | [02] BINARY | 2 |
|  |  |  | [03] ON_OFF_PERIOD | 2 |
|  |  |  | [04] ON_OFF_CYCLES | 2 |
|  |  |  | [10] LOW_POWER | 2 |
| [88] COMMAND_CLASS_PROPRIETARY |  |  |  | 1 |
|  | [01] PROPRIETARY_SET |  |  | 1 |
|  |  | Data |  | 1 |
|  | [02] PROPRIETARY_GET |  |  | 1 |
|  |  | Data |  | 1 |
|  | [03] PROPRIETARY_REPORT |  |  | 1 |
|  |  | Data |  | 1 |
| [89] COMMAND_CLASS_LANGUAGE |  |  |  | 1 |
|  | [01] LANGUAGE_SET |  |  | 1 |
|  |  | Language |  | 1 |
|  |  | Country |  | 1 |
|  | [02] LANGUAGE_GET |  |  | 1 |
|  | [03] LANGUAGE_REPORT |  |  | 1 |
|  |  | Language |  | 1 |
|  |  | Country |  | 1 |
| [8A] COMMAND_CLASS_TIME |  |  |  | 2 |
|  | [01] TIME_GET |  |  | 1-2 |
|  | [02] TIME_REPORT |  |  | 1-2 |
|  |  | Hour Local Time |  | 1-2 |
|  |  | RTC failure |  | 1-2 |
|  |  | Minute Local Time |  | 1-2 |
|  |  | Second Local Time |  | 1-2 |
|  | [03] DATE_GET |  |  | 1-2 |
|  | [04] DATE_REPORT |  |  | 1-2 |
|  |  | Year |  | 1-2 |
|  |  | Month |  | 1-2 |
|  |  | Day |  | 1-2 |
|  | [05] TIME_OFFSET_SET |  |  | 2 |
|  |  | Hour TZO |  | 2 |
|  |  | Sign TZO |  | 2 |
|  |  | Minute TZO |  | 2 |
|  |  | Minute Offset DST |  | 2 |
|  |  | Sign Offset DST |  | 2 |
|  |  | Month Start DST |  | 2 |
|  |  | Day Start DST |  | 2 |
|  |  | Hour Start DST |  | 2 |
|  |  | Month End DST |  | 2 |
|  |  | Day End DST |  | 2 |
|  |  | Hour End DST |  | 2 |
|  | [06] TIME_OFFSET_GET |  |  | 2 |
|  | [07] TIME_OFFSET_REPORT |  |  | 2 |
|  |  | Hour TZO |  | 2 |
|  |  | Sign TZO |  | 2 |
|  |  | Minute TZO |  | 2 |
|  |  | Minute Offset DST |  | 2 |
|  |  | Sign Offset DST |  | 2 |
|  |  | Month Start DST |  | 2 |
|  |  | Day Start DST |  | 2 |
|  |  | Hour Start DST |  | 2 |
|  |  | Month End DST |  | 2 |
|  |  | Day End DST |  | 2 |
|  |  | Hour End DST |  | 2 |
| [8B] COMMAND_CLASS_TIME_PARAMETERS |  |  |  | 1 |
|  | [01] TIME_PARAMETERS_SET |  |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour UTC |  | 1 |
|  |  | Minute UTC |  | 1 |
|  |  | Second UTC |  | 1 |
|  | [02] TIME_PARAMETERS_GET |  |  | 1 |
|  | [03] TIME_PARAMETERS_REPORT |  |  | 1 |
|  |  | Year |  | 1 |
|  |  | Month |  | 1 |
|  |  | Day |  | 1 |
|  |  | Hour UTC |  | 1 |
|  |  | Minute UTC |  | 1 |
|  |  | Second UTC |  | 1 |
| [8C] COMMAND_CLASS_GEOGRAPHIC_LOCATION |  |  |  | 1 |
|  | [01] GEOGRAPHIC_LOCATION_SET |  |  | 1 |
|  |  | Longitude Degrees |  | 1 |
|  |  | Longitude Minutes |  | 1 |
|  |  | Long. Sign |  | 1 |
|  |  | Latitude Degrees |  | 1 |
|  |  | Latitude Minutes |  | 1 |
|  |  | Lat. Sign |  | 1 |
|  | [02] GEOGRAPHIC_LOCATION_GET |  |  | 1 |
|  | [03] GEOGRAPHIC_LOCATION_REPORT |  |  | 1 |
|  |  | Longitude Degrees |  | 1 |
|  |  | Longitude Minutes |  | 1 |
|  |  | Long. Sign |  | 1 |
|  |  | Latitude Degrees |  | 1 |
|  |  | Latitude Minutes |  | 1 |
|  |  | Lat. Sign |  | 1 |
| [8E] COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION |  |  |  | 3 |
|  | [01] MULTI_CHANNEL_ASSOCIATION_SET |  |  | 1-3 |
|  |  | Grouping Identifier |  | 1-3 |
|  |  | Node ID |  | 1-3 |
|  |  | Multi Instance |  | 1 |
|  |  | Multi Channel Association Group |  | 2-3 |
|  | [02] MULTI_CHANNEL_ASSOCIATION_GET |  |  | 1-3 |
|  |  | Grouping Identifier |  | 1-3 |
|  | [03] MULTI_CHANNEL_ASSOCIATION_REPORT |  |  | 1-3 |
|  |  | Grouping Identifier |  | 1-3 |
|  |  | Max Nodes Supported |  | 1-3 |
|  |  | Reports to Follow |  | 1-3 |
|  |  | Node ID |  | 1-3 |
|  |  | Multi Instance |  | 1 |
|  |  | Multi Channel Association Group |  | 2-3 |
|  | [04] MULTI_CHANNEL_ASSOCIATION_REMOVE |  |  | 1-3 |
|  |  | Grouping Identifier |  | 1-3 |
|  |  | Node ID |  | 1-3 |
|  |  | Multi Instance |  | 1 |
|  |  | Multi Channel Association Group |  | 2-3 |
|  | [05] MULTI_CHANNEL_ASSOCIATION_GROUPINGS_GET |  |  | 1-3 |
|  | [06] MULTI_CHANNEL_ASSOCIATION_GROUPINGS_REPORT |  |  | 1-3 |
|  |  | Supported Groupings |  | 1-3 |
| [8F] COMMAND_CLASS_MULTI_CMD |  |  |  | 1 |
|  | [01] MULTI_CMD_ENCAP |  |  | 1 |
|  |  | Number of Commands |  | 1 |
|  |  | Encapsulated Command |  | 1 |
| [90] COMMAND_CLASS_ENERGY_PRODUCTION |  |  |  | 1 |
|  | [02] ENERGY_PRODUCTION_GET |  |  | 1 |
|  |  | Parameter Number |  | 1 |
|  |  |  | [00] INSTANT_ENERGY_PRODUCTION | 1 |
|  |  |  | [01] TOTAL_ENERGY_PRODUCTION | 1 |
|  |  |  | [02] ENERGY_PRODUCTION_TODAY | 1 |
|  |  |  | [03] TOTAL_PRODUCTION_TIME | 1 |
|  | [03] ENERGY_PRODUCTION_REPORT |  |  | 1 |
|  |  | Parameter Number |  | 1 |
|  |  |  | [00] INSTANT_ENERGY_PRODUCTION | 1 |
|  |  |  | [01] TOTAL_ENERGY_PRODUCTION | 1 |
|  |  |  | [02] ENERGY_PRODUCTION_TODAY | 1 |
|  |  |  | [03] TOTAL_PRODUCTION_TIME | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Value |  | 1 |
| [91] COMMAND_CLASS_MANUFACTURER_PROPRIETARY |  |  |  | 1 |
| [92] COMMAND_CLASS_SCREEN_MD |  |  |  | 2 |
|  | [01] SCREEN_MD_GET |  |  | 1-2 |
|  |  | Number of Reports |  | 1-2 |
|  |  | Node ID |  | 1-2 |
|  | [02] SCREEN_MD_REPORT |  |  | 1 |
|  |  | Char. Presentation |  | 1 |
|  |  | Screen Settings |  | 1 |
|  |  | More Data |  | 1 |
|  |  | Screen MD String |  | 1 |
|  | [03] SCREEN_MD_REPORT |  |  | 2 |
|  |  | Char. Presentation |  | 2 |
|  |  | Screen Settings |  | 2 |
|  |  | More Data |  | 2 |
|  |  | Screen MD String |  | 2 |
|  |  | Screen Timeout |  | 2 |
| [93] COMMAND_CLASS_SCREEN_ATTRIBUTES |  |  |  | 2 |
|  | [01] SCREEN_ATTRIBUTES_GET |  |  | 1-2 |
|  | [02] SCREEN_ATTRIBUTES_REPORT |  |  | 1-2 |
|  |  | Number of Lines |  | 1-2 |
|  |  | Escape Sequence |  | 2 |
|  |  | Number of Characters per Line |  | 1-2 |
|  |  | Size of Line Buffer |  | 1-2 |
|  |  | Numerical Presentation of a Character |  | 1-2 |
|  |  | Screen Timeout |  | 2 |
| [94] COMMAND_CLASS_SIMPLE_AV_CONTROL |  |  |  | 1 |
|  | [01] SIMPLE_AV_CONTROL_SET |  |  | 1 |
|  |  | Sequence Number |  | 1 |
|  |  | Key Attributes |  | 1 |
|  |  | Item ID |  | 1 |
|  |  | AV Command |  | 1 |
|  | [02] SIMPLE_AV_CONTROL_GET |  |  | 1 |
|  | [03] SIMPLE_AV_CONTROL_REPORT |  |  | 1 |
|  |  | Number of reports |  | 1 |
|  | [04] SIMPLE_AV_CONTROL_SUPPORTED_GET |  |  | 1 |
|  |  | Report No |  | 1 |
|  | [05] SIMPLE_AV_CONTROL_SUPPORTED_REPORT |  |  | 1 |
|  |  | Report No |  | 1 |
|  |  | Bit Mask |  | 1 |
| [95] COMMAND_CLASS_AV_CONTENT_DIRECTORY_MD |  |  |  | 1 |
|  | [01] AV_CONTENT_BROWSE_MD_GET |  |  | 1 |
|  | [02] AV_CONTENT_BROWSE_MD_REPORT |  |  | 1 |
|  | [03] AV_CONTENT_BROWSE_MD_BY_LETTER_GET |  |  | 1 |
|  | [04] AV_CONTENT_BROWSE_MD_BY_LETTER_REPORT |  |  | 1 |
|  | [05] AV_CONTENT_BROWSE_MD_CHILD_COUNT_GET |  |  | 1 |
|  | [06] AV_CONTENT_BROWSE_MD_CHILD_COUNT_REPORT |  |  | 1 |
|  | [07] AV_MATCH_ITEM_TO_RENDERER_MD_GET |  |  | 1 |
|  | [08] AV_MATCH_ITEM_TO_RENDERER_MD_REPORT |  |  | 1 |
| [96] COMMAND_CLASS_AV_RENDERER_STATUS |  |  |  | 1 |
|  | [01] AV_RENDERER_STATUS_GET |  |  | 1 |
|  | [02] AV_RENDERER_STATUS_REPORT |  |  | 1 |
| [97] COMMAND_CLASS_AV_CONTENT_SEARCH_MD |  |  |  | 1 |
|  | [01] AV_CONTENT_SEARCH_MD_GET |  |  | 1 |
|  | [02] AV_CONTENT_SEARCH_MD_REPORT |  |  | 1 |
| [98] COMMAND_CLASS_SECURITY |  |  |  | 1 |
|  | [02] SECURITY_COMMANDS_SUPPORTED_GET |  |  | 1 |
|  | [03] SECURITY_COMMANDS_SUPPORTED_REPORT |  |  | 1 |
|  |  | Reports to follow |  | 1 |
|  |  | Command Class support |  | 1 |
|  |  | Command Class control |  | 1 |
|  | [04] SECURITY_SCHEME_GET |  |  | 1 |
|  |  | Supported Security Schemes |  | 1 |
|  | [05] SECURITY_SCHEME_REPORT |  |  | 1 |
|  |  | Supported Security Schemes |  | 1 |
|  | [06] NETWORK_KEY_SET |  |  | 1 |
|  |  | Network Key byte |  | 1 |
|  | [07] NETWORK_KEY_VERIFY |  |  | 1 |
|  | [08] SECURITY_SCHEME_INHERIT |  |  | 1 |
|  |  | Supported Security Schemes |  | 1 |
|  | [40] SECURITY_NONCE_GET |  |  | 1 |
|  | [80] SECURITY_NONCE_REPORT |  |  | 1 |
|  |  | Nonce byte |  | 1 |
|  | [81] SECURITY_MESSAGE_ENCAPSULATION |  |  | 1 |
|  |  | Initialization Vector byte |  | 1 |
|  |  | Sequence Counter |  | 1 |
|  |  | Sequenced |  | 1 |
|  |  | Second Frame |  | 1 |
|  |  | Command byte |  | 1 |
|  |  | Receivers nonce Identifier |  | 1 |
|  |  | Message Authentication Code byte |  | 1 |
|  | [C1] SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET |  |  | 1 |
|  |  | Initialization Vector byte |  | 1 |
|  |  | Sequence Counter |  | 1 |
|  |  | Sequenced |  | 1 |
|  |  | Second Frame |  | 1 |
|  |  | Command byte |  | 1 |
|  |  | Receivers nonce Identifier |  | 1 |
|  |  | Message Authentication Code byte |  | 1 |
| [99] COMMAND_CLASS_AV_TAGGING_MD |  |  |  | 1 |
|  | [01] AV_TAGGING_MD_GET |  |  | 1 |
|  | [02] AV_TAGGING_MD_REPORT |  |  | 1 |
| [9A] COMMAND_CLASS_IP_CONFIGURATION |  |  |  | 1 |
|  | [01] IP_CONFIGURATION_SET |  |  | 1 |
|  |  | Auto DNS |  | 1 |
|  |  | Auto IP |  | 1 |
|  |  | IP Address |  | 1 |
|  |  | Subnet Mask |  | 1 |
|  |  | Gateway |  | 1 |
|  |  | DNS1 |  | 1 |
|  |  | DNS2 |  | 1 |
|  | [02] IP_CONFIGURATION_GET |  |  | 1 |
|  | [03] IP_CONFIGURATION_REPORT |  |  | 1 |
|  |  | Auto DNS |  | 1 |
|  |  | Auto IP |  | 1 |
|  |  | IP Address |  | 1 |
|  |  | Subnet Mask |  | 1 |
|  |  | Gateway |  | 1 |
|  |  | DNS1 |  | 1 |
|  |  | DNS2 |  | 1 |
|  |  | LeaseTime |  | 1 |
|  | [04] IP_CONFIGURATION_RELEASE |  |  | 1 |
|  | [05] IP_CONFIGURATION_RENEW |  |  | 1 |
| [9B] COMMAND_CLASS_ASSOCIATION_COMMAND_CONFIGURATION |  |  |  | 1 |
|  | [01] COMMAND_RECORDS_SUPPORTED_GET |  |  | 1 |
|  | [02] COMMAND_RECORDS_SUPPORTED_REPORT |  |  | 1 |
|  |  | Conf. Cmd |  | 1 |
|  |  | V/C |  | 1 |
|  |  | Max command length |  | 1 |
|  |  | Free Command records |  | 1 |
|  |  | Max Command records |  | 1 |
|  | [03] COMMAND_CONFIGURATION_SET |  |  | 1 |
|  |  | Grouping identifier |  | 1 |
|  |  | Node ID |  | 1 |
|  |  | Command length |  | 1 |
|  |  | Command Class identifier |  | 1 |
|  |  | Command identifier |  | 1 |
|  |  | Command byte |  | 1 |
|  | [04] COMMAND_CONFIGURATION_GET |  |  | 1 |
|  |  | Grouping identifier |  | 1 |
|  |  | Node ID |  | 1 |
|  | [05] COMMAND_CONFIGURATION_REPORT |  |  | 1 |
|  |  | Grouping identifier |  | 1 |
|  |  | Node ID |  | 1 |
|  |  | Reports to follow |  | 1 |
|  |  | Command length |  | 1 |
|  |  | Command Class identifier |  | 1 |
|  |  | Command identifier |  | 1 |
|  |  | Command byte |  | 1 |
| [9C] COMMAND_CLASS_SENSOR_ALARM |  |  |  | 1 |
|  | [01] SENSOR_ALARM_GET |  |  | 1 |
|  |  | Sensor Type |  | 1 |
|  |  |  | [00] GENERAL_PURPOSE_ALARM | 1 |
|  |  |  | [01] SMOKE_ALARM | 1 |
|  |  |  | [02] CO_ALARM | 1 |
|  |  |  | [03] CO2_ALARM | 1 |
|  |  |  | [04] HEAT_ALARM | 1 |
|  |  |  | [05] WATER_LEAK_ALARM | 1 |
|  |  |  | [FF] RETURN_FIRST_ALARM_ON_SUPPORTED_LIST | 1 |
|  | [02] SENSOR_ALARM_REPORT |  |  | 1 |
|  |  | Source Node ID |  | 1 |
|  |  | Sensor Type |  | 1 |
|  |  |  | [00] GENERAL_PURPOSE_ALARM | 1 |
|  |  |  | [01] SMOKE_ALARM | 1 |
|  |  |  | [02] CO_ALARM | 1 |
|  |  |  | [03] CO2_ALARM | 1 |
|  |  |  | [04] HEAT_ALARM | 1 |
|  |  |  | [05] WATER_LEAK_ALARM | 1 |
|  |  |  | [FF] RETURN_FIRST_ALARM_ON_SUPPORTED_LIST | 1 |
|  |  | Sensor State |  | 1 |
|  |  |  | [00] NO_ALARM | 1 |
|  |  |  | [FF] ALARM | 1 |
|  |  | Seconds |  | 1 |
|  | [03] SENSOR_ALARM_SUPPORTED_GET |  |  | 1 |
|  | [04] SENSOR_ALARM_SUPPORTED_REPORT |  |  | 1 |
|  |  | Number of Bit Masks |  | 1 |
|  |  | Bit Mask |  | 1 |
| [9D] COMMAND_CLASS_SILENCE_ALARM |  |  |  | 1 |
|  | [01] SENSOR_ALARM_SET |  |  | 1 |
|  |  | Mode |  | 1 |
|  |  |  | [00] DISABLE_SOUNDING_OF_ALL_SENSOR_ALARMS | 1 |
|  |  |  | [01] DISABLE_SOUNDING_OF_ALL_SENSOR_ALARMS_INDEPENDENT_OF_BIT_MASK_WHICH_HAVE_RECEIVED_THE_ALARM | 1 |
|  |  |  | [02] DISABLE_SOUNDING_OF_ALL_SENSOR_ALARMS_ACCORDING_TO_BIT_MASK | 1 |
|  |  |  | [03] DISABLE_SOUNDING_OF_ALL_SENSOR_ALARMS_ACCORDING_TO_BIT_MASK_WHICH_HAVE_RECEIVED_THE_ALARM | 1 |
|  |  | Seconds |  | 1 |
|  |  | Number of Bit Masks |  | 1 |
|  |  | Bit Mask |  | 1 |
| [9E] COMMAND_CLASS_SENSOR_CONFIGURATION |  |  |  | 1 |
|  | [01] SENSOR_TRIGGER_LEVEL_SET |  |  | 1 |
|  |  | Current |  | 1 |
|  |  | Default Value |  | 1 |
|  |  | Sensor Type |  | 1 |
|  |  |  | [01] TEMPERATURE | 1 |
|  |  |  | [02] GENERAL_PURPOSE_VALUE | 1 |
|  |  |  | [03] LUMINANCE | 1 |
|  |  |  | [04] POWER | 1 |
|  |  |  | [05] RELATIVE_HUMIDITY | 1 |
|  |  |  | [06] VELOCITY | 1 |
|  |  |  | [07] DIRECTION | 1 |
|  |  |  | [08] ATMOSPHERIC_PRESSURE | 1 |
|  |  |  | [09] BAROMETRIC_PRESSURE | 1 |
|  |  |  | [0A] SOLAR_RADIATION | 1 |
|  |  |  | [0B] DEW_POINT | 1 |
|  |  |  | [0C] RAIN_RATE | 1 |
|  |  |  | [0D] TIDE_LEVEL | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Trigger Value |  | 1 |
|  | [02] SENSOR_TRIGGER_LEVEL_GET |  |  | 1 |
|  | [03] SENSOR_TRIGGER_LEVEL_REPORT |  |  | 1 |
|  |  | Sensor Type |  | 1 |
|  |  |  | [01] TEMPERATURE | 1 |
|  |  |  | [02] GENERAL_PURPOSE_VALUE | 1 |
|  |  |  | [03] LUMINANCE | 1 |
|  |  |  | [04] POWER | 1 |
|  |  |  | [05] RELATIVE_HUMIDITY | 1 |
|  |  |  | [06] VELOCITY | 1 |
|  |  |  | [07] DIRECTION | 1 |
|  |  |  | [08] ATMOSPHERIC_PRESSURE | 1 |
|  |  |  | [09] BAROMETRIC_PRESSURE | 1 |
|  |  |  | [0A] SOLAR_RADIATION | 1 |
|  |  |  | [0B] DEW_POINT | 1 |
|  |  |  | [0C] RAIN_RATE | 1 |
|  |  |  | [0D] TIDE_LEVEL | 1 |
|  |  | Size |  | 1 |
|  |  | Scale |  | 1 |
|  |  | Precision |  | 1 |
|  |  | Trigger Value |  | 1 |
| [9F] COMMAND_CLASS_SECURITY_2 |  |  |  | 1 |
|  | [01] SECURITY_2_NONCE_GET |  |  | 1 |
|  |  | Sequence Number |  | 1 |
|  | [02] SECURITY_2_NONCE_REPORT |  |  | 1 |
|  |  | Sequence Number |  | 1 |
|  |  | SOS |  | 1 |
|  |  | MOS |  | 1 |
|  |  | Receivers Entropy Input |  | 1 |
|  | [03] SECURITY_2_MESSAGE_ENCAPSULATION |  |  | 1 |
|  |  | Sequence Number |  | 1 |
|  |  | Extension |  | 1 |
|  |  | Encrypted Extension |  | 1 |
|  |  | Security Header |  | 1 |
|  |  | CCM Ciphertext Object |  | 1 |
|  | [04] KEX_GET |  |  | 1 |
|  | [05] KEX_REPORT |  |  | 1 |
|  |  | Echo |  | 1 |
|  |  | Request CSA |  | 1 |
|  |  | Supported KEX Schemes |  | 1 |
|  |  | Supported ECDH Profiles |  | 1 |
|  |  | Requested Keys |  | 1 |
|  |  |  | [00] UNAUTHENTICATED | 1 |
|  |  |  | [01] AUTHENTICATED | 1 |
|  |  |  | [02] ACCESS | 1 |
|  |  |  | [07] S0 | 1 |
|  | [06] KEX_SET |  |  | 1 |
|  |  | Echo |  | 1 |
|  |  | Request CSA |  | 1 |
|  |  | Selected KEX Scheme |  | 1 |
|  |  | Selected ECDH Profile |  | 1 |
|  |  | Granted Keys |  | 1 |
|  |  |  | [00] UNAUTHENTICATED | 1 |
|  |  |  | [01] AUTHENTICATED | 1 |
|  |  |  | [02] ACCESS | 1 |
|  |  |  | [07] S0 | 1 |
|  | [07] KEX_FAIL |  |  | 1 |
|  |  | KEX Fail Type |  | 1 |
|  |  |  | [01] KEX_KEY | 1 |
|  |  |  | [02] KEX_SCHEME | 1 |
|  |  |  | [03] KEX_CURVES | 1 |
|  |  |  | [05] DECRYPT | 1 |
|  |  |  | [06] CANCEL | 1 |
|  |  |  | [07] AUTH | 1 |
|  |  |  | [08] KEY_GET | 1 |
|  |  |  | [09] KEY_VERIFY | 1 |
|  |  |  | [0A] KEY_REPORT | 1 |
|  | [08] PUBLIC_KEY_REPORT |  |  | 1 |
|  |  | Including Node |  | 1 |
|  |  | ECDH Public Key |  | 1 |
|  | [09] SECURITY_2_NETWORK_KEY_GET |  |  | 1 |
|  |  | Requested Key |  | 1 |
|  |  |  | [00] UNAUTHENTICATED | 1 |
|  |  |  | [01] AUTHENTICATED | 1 |
|  |  |  | [02] ACCESS | 1 |
|  |  |  | [07] S0 | 1 |
|  | [0A] SECURITY_2_NETWORK_KEY_REPORT |  |  | 1 |
|  |  | Granted Key |  | 1 |
|  |  |  | [00] UNAUTHENTICATED | 1 |
|  |  |  | [01] AUTHENTICATED | 1 |
|  |  |  | [02] ACCESS | 1 |
|  |  |  | [07] S0 | 1 |
|  |  | Network Key |  | 1 |
|  | [0B] SECURITY_2_NETWORK_KEY_VERIFY |  |  | 1 |
|  | [0C] SECURITY_2_TRANSFER_END |  |  | 1 |
|  |  | Key Request Complete |  | 1 |
|  |  | Key Verified |  | 1 |
|  | [0D] SECURITY_2_COMMANDS_SUPPORTED_GET |  |  | 1 |
|  | [0E] SECURITY_2_COMMANDS_SUPPORTED_REPORT |  |  | 1 |
|  |  | Command Class |  | 1 |
|  | [0F] SECURITY_2_CAPABILITIES_GET |  |  | 1 |
|  | [10] SECURITY_2_CAPABILITIES_REPORT |  |  | 1 |
|  |  | Supported SPANs |  | 1 |
|  |  | Supported MPANs |  | 1 |
| [EF] COMMAND_CLASS_MARK |  |  |  | 1 |
| [F0] COMMAND_CLASS_NON_INTEROPERABLE |  |  |  | 1 |
