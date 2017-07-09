# Z-Wave Consolidated Command Class Report

This file provides a summary of the Z-Wave command class version, summarising the commands, parameters
and constants. The applicable versions of the command class for command/parameter/constant is provided. 

| Command Class | Command | Parameter | Constant| Version |
|---------------|---------|-----------|---------|---------|
| [00] COMMAND_CLASS_NO_OPERATION |  |  |  | 1 |
| [01] ZWAVE_CMD_CLASS |  |  |  | 1 |
|  | [00] ZWAVE_CMD_NOP |  |  | 1 |
|  | [01] NODE_INFO |  |  | 1 |
|  |  | BASIC_DEVICE_CLASS |  | 1 |
|  |  |  | [01] BASIC_TYPE_CONTROLLER | 1 |
|  |  |  | [02] BASIC_TYPE_STATIC_CONTROLLER | 1 |
|  |  |  | [03] BASIC_TYPE_SLAVE | 1 |
|  |  |  | [04] BASIC_TYPE_ROUTING_SLAVE | 1 |
|  |  | GENERIC_DEVICE_CLASS |  | 1 |
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
|  |  | SPECIFIC_DEVICE_CLASS |  | 1 |
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
|  |  | COMMAND_CLASSES |  | 1 |
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
|  |  | VALUE |  | 1-2 |
|  | [02] BASIC_GET |  |  | 1-2 |
|  | [03] BASIC_REPORT |  |  | 1-2 |
|  |  | VALUE |  | 1-2 |
|  |  | TARGET_VALUE |  | 2 |
|  |  | DURATION |  | 2 |
| [21] COMMAND_CLASS_CONTROLLER_REPLICATION |  |  |  | 1 |
|  | [31] CTRL_REPLICATION_TRANSFER_GROUP |  |  | 1 |
|  |  | SEQUENCE_NUMBER |  | 1 |
|  |  | GROUP_ID |  | 1 |
|  |  | NODE_ID |  | 1 |
|  | [32] CTRL_REPLICATION_TRANSFER_GROUP_NAME |  |  | 1 |
|  |  | SEQUENCE_NUMBER |  | 1 |
|  |  | GROUP_ID |  | 1 |
|  |  | GROUP_NAME |  | 1 |
|  | [33] CTRL_REPLICATION_TRANSFER_SCENE |  |  | 1 |
|  |  | SEQUENCE_NUMBER |  | 1 |
|  |  | SCENE_ID |  | 1 |
|  |  | NODE_ID |  | 1 |
|  |  | LEVEL |  | 1 |
|  | [34] CTRL_REPLICATION_TRANSFER_SCENE_NAME |  |  | 1 |
|  |  | SEQUENCE_NUMBER |  | 1 |
|  |  | SCENE_ID |  | 1 |
|  |  | SCENE_NAME |  | 1 |
| [22] COMMAND_CLASS_APPLICATION_STATUS |  |  |  | 1 |
|  | [01] APPLICATION_BUSY |  |  | 1 |
|  |  | STATUS |  | 1 |
|  |  |  | [00] TRY_AGAIN_LATER | 1 |
|  |  |  | [01] TRY_AGAIN_IN_WAIT_TIME_SECONDS | 1 |
|  |  |  | [02] REQUEST_QUEUED_EXECUTED_LATER | 1 |
|  |  | WAIT_TIME |  | 1 |
|  | [02] APPLICATION_REJECTED_REQUEST |  |  | 1 |
|  |  | STATUS |  | 1 |
| [23] COMMAND_CLASS_ZIP |  |  |  | 3 |
|  | [02] COMMAND_ZIP_PACKET |  |  | 1-3 |
|  |  | SEQ_NO |  | 1-3 |
|  |  | HEADER_EXTENSION |  | 1-3 |
|  |  | Z_WAVE_COMMAND |  | 1-3 |
|  |  | Z_WAVE_COMMAND |  | 2-3 |
| [24] COMMAND_CLASS_SECURITY_PANEL_MODE |  |  |  | 1 |
|  | [01] SECURITY_PANEL_MODE_SUPPORTED_GET |  |  | 1 |
|  | [02] SECURITY_PANEL_MODE_SUPPORTED_REPORT |  |  | 1 |
|  |  | SUPPORTED_MODE_BIT_MASK |  | 1 |
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
|  |  | TARGET_VALUE |  | 1-2 |
|  |  |  | [00] OFF_DISABLE | 1-2 |
|  |  |  | [FF] ON_ENABLE | 1-2 |
|  |  | DURATION |  | 2 |
|  |  |  | [00] INSTANTLY | 2 |
|  |  |  | [FF] DEFAULT | 2 |
|  | [02] SWITCH_BINARY_GET |  |  | 1-2 |
|  | [03] SWITCH_BINARY_REPORT |  |  | 1-2 |
|  |  | CURRENT_VALUE |  | 1-2 |
|  |  |  | [00] OFF_DISABLE | 1-2 |
|  |  |  | [FF] ON_ENABLE | 1-2 |
|  |  | TARGET_VALUE |  | 2 |
|  |  |  | [00] OFF_DISABLE | 2 |
|  |  |  | [FF] ON_ENABLE | 2 |
|  |  | DURATION |  | 2 |
|  |  |  | [00] ALREADY_AT_THE_TARGET_VALUE | 2 |
|  |  |  | [FE] UNKNOWN_DURATION | 2 |
| [26] COMMAND_CLASS_SWITCH_MULTILEVEL |  |  |  | 4 |
|  | [01] SWITCH_MULTILEVEL_SET |  |  | 1-4 |
|  |  | VALUE |  | 1-4 |
|  |  |  | [00] OFF_DISABLE | 1-4 |
|  |  |  | [FF] ON_ENABLE | 1-4 |
|  |  | DIMMING_DURATION |  | 2-4 |
|  |  |  | [00] INSTANTLY | 2-4 |
|  |  |  | [FF] FACTORY_DEFAULT | 2-4 |
|  | [02] SWITCH_MULTILEVEL_GET |  |  | 1-4 |
|  | [03] SWITCH_MULTILEVEL_REPORT |  |  | 1-4 |
|  |  | VALUE |  | 1-4 |
|  |  |  | [00] OFF_DISABLE | 1-4 |
|  |  |  | [FF] ON_ENABLE | 1-4 |
|  |  | TARGET_VALUE |  | 4 |
|  |  | DURATION |  | 4 |
|  |  |  | [00] ALREADY_AT_THE_TARGET_VALUE | 4 |
|  |  |  | [FE] UNKNOWN_DURATION | 4 |
|  | [04] SWITCH_MULTILEVEL_START_LEVEL_CHANGE |  |  | 1-4 |
|  |  | START_LEVEL |  | 1-4 |
|  |  | DIMMING_DURATION |  | 2-4 |
|  |  | STEP_SIZE |  | 3-4 |
|  | [05] SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE |  |  | 1-4 |
|  | [06] SWITCH_MULTILEVEL_SUPPORTED_GET |  |  | 3-4 |
|  | [07] SWITCH_MULTILEVEL_SUPPORTED_REPORT |  |  | 3-4 |
| [27] COMMAND_CLASS_SWITCH_ALL |  |  |  | 1 |
|  | [01] SWITCH_ALL_SET |  |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [00] EXCLUDED_FROM_THE_ALL_ON_ALL_OFF_FUNCTIONALITY | 1 |
|  |  |  | [01] EXCLUDED_FROM_THE_ALL_ON_FUNCTIONALITY_BUT_NOT_ALL_OFF | 1 |
|  |  |  | [02] EXCLUDED_FROM_THE_ALL_OFF_FUNCTIONALITY_BUT_NOT_ALL_ON | 1 |
|  |  |  | [FF] INCLUDED_IN_THE_ALL_ON_ALL_OFF_FUNCTIONALITY | 1 |
|  | [02] SWITCH_ALL_GET |  |  | 1 |
|  | [03] SWITCH_ALL_REPORT |  |  | 1 |
|  |  | MODE |  | 1 |
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
|  |  | VALUE |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
| [29] COMMAND_CLASS_SWITCH_TOGGLE_MULTILEVEL |  |  |  | 1 |
|  | [01] SWITCH_TOGGLE_MULTILEVEL_SET |  |  | 1 |
|  | [02] SWITCH_TOGGLE_MULTILEVEL_GET |  |  | 1 |
|  | [03] SWITCH_TOGGLE_MULTILEVEL_REPORT |  |  | 1 |
|  |  | VALUE |  | 1 |
|  |  |  | [00] OFF_DISABLE | 1 |
|  |  |  | [FF] ON_ENABLE | 1 |
|  | [04] SWITCH_TOGGLE_MULTILEVEL_START_LEVEL_CHANGE |  |  | 1 |
|  |  | START_LEVEL |  | 1 |
|  | [05] SWITCH_TOGGLE_MULTILEVEL_STOP_LEVEL_CHANGE |  |  | 1 |
| [2A] COMMAND_CLASS_CHIMNEY_FAN |  |  |  | 1 |
|  | [01] CHIMNEY_FAN_STATE_SET |  |  | 1 |
|  |  | STATE |  | 1 |
|  |  |  | [01] NEXT_STATE | 1 |
|  | [02] CHIMNEY_FAN_STATE_GET |  |  | 1 |
|  | [03] CHIMNEY_FAN_STATE_REPORT |  |  | 1 |
|  |  | STATE |  | 1 |
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
|  |  | SPEED |  | 1 |
|  |  |  | [65] SPEED_DOWN | 1 |
|  |  |  | [C8] SPEED_UP | 1 |
|  | [05] CHIMNEY_FAN_SPEED_GET |  |  | 1 |
|  | [06] CHIMNEY_FAN_SPEED_REPORT |  |  | 1 |
|  |  | SPEED |  | 1 |
|  | [07] CHIMNEY_FAN_START_TEMP_SET |  |  | 1 |
|  |  | VALUE |  | 1 |
|  | [08] CHIMNEY_FAN_START_TEMP_GET |  |  | 1 |
|  | [09] CHIMNEY_FAN_START_TEMP_REPORT |  |  | 1 |
|  |  | VALUE |  | 1 |
|  | [0A] CHIMNEY_FAN_STOP_TEMP_SET |  |  | 1 |
|  |  | VALUE |  | 1 |
|  | [0B] CHIMNEY_FAN_STOP_TEMP_GET |  |  | 1 |
|  | [0C] CHIMNEY_FAN_STOP_TEMP_REPORT |  |  | 1 |
|  |  | VALUE |  | 1 |
|  | [0D] CHIMNEY_FAN_ALARM_TEMP_SET |  |  | 1 |
|  |  | VALUE |  | 1 |
|  | [0E] CHIMNEY_FAN_ALARM_TEMP_GET |  |  | 1 |
|  | [0F] CHIMNEY_FAN_ALARM_TEMP_REPORT |  |  | 1 |
|  |  | VALUE |  | 1 |
|  | [10] CHIMNEY_FAN_BOOST_TIME_SET |  |  | 1 |
|  |  | TIME |  | 1 |
|  | [11] CHIMNEY_FAN_BOOST_TIME_GET |  |  | 1 |
|  | [12] CHIMNEY_FAN_BOOST_TIME_REPORT |  |  | 1 |
|  |  | TIME |  | 1 |
|  | [13] CHIMNEY_FAN_STOP_TIME_SET |  |  | 1 |
|  |  | TIME |  | 1 |
|  | [14] CHIMNEY_FAN_STOP_TIME_GET |  |  | 1 |
|  | [15] CHIMNEY_FAN_STOP_TIME_REPORT |  |  | 1 |
|  |  | TIME |  | 1 |
|  | [16] CHIMNEY_FAN_MODE_SET |  |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
|  | [17] CHIMNEY_FAN_MODE_GET |  |  | 1 |
|  | [18] CHIMNEY_FAN_MODE_REPORT |  |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
|  | [19] CHIMNEY_FAN_SETUP_SET |  |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
|  |  | BOOST_TIME |  | 1 |
|  |  | STOP_TIME |  | 1 |
|  |  | MIN_SPEED |  | 1 |
|  |  | START_TEMPERATURE |  | 1 |
|  |  | STOP_TEMPERATURE |  | 1 |
|  |  | ALARM_TEMPERATURE_VALUE |  | 1 |
|  | [1A] CHIMNEY_FAN_SETUP_GET |  |  | 1 |
|  | [1B] CHIMNEY_FAN_SETUP_REPORT |  |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
|  |  | BOOST_TIME |  | 1 |
|  |  | STOP_TIME |  | 1 |
|  |  | MIN_SPEED |  | 1 |
|  |  | START_TEMPERATURE |  | 1 |
|  |  | STOP_TEMPERATURE |  | 1 |
|  |  | ALARM_TEMPERATURE_VALUE |  | 1 |
|  | [1D] CHIMNEY_FAN_STATUS_GET |  |  | 1 |
|  | [1E] CHIMNEY_FAN_STATUS_REPORT |  |  | 1 |
|  |  | STATE |  | 1 |
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
|  |  | SPEED |  | 1 |
|  |  | VALUE |  | 1 |
|  | [1F] CHIMNEY_FAN_ALARM_LOG_SET |  |  | 1 |
|  |  | MESSAGE |  | 1 |
|  |  |  | [08] RESET_LOG | 1 |
|  | [20] CHIMNEY_FAN_ALARM_LOG_GET |  |  | 1 |
|  | [21] CHIMNEY_FAN_ALARM_LOG_REPORT |  |  | 1 |
|  | [22] CHIMNEY_FAN_ALARM_STATUS_SET |  |  | 1 |
|  | [23] CHIMNEY_FAN_ALARM_STATUS_GET |  |  | 1 |
|  | [24] CHIMNEY_FAN_ALARM_STATUS_REPORT |  |  | 1 |
|  | [25] CHIMNEY_FAN_MIN_SPEED_SET |  |  | 1 |
|  |  | MIN_SPEED |  | 1 |
|  | [26] CHIMNEY_FAN_MIN_SPEED_GET |  |  | 1 |
|  | [27] CHIMNEY_FAN_MIN_SPEED_REPORT |  |  | 1 |
|  |  | MIN_SPEED |  | 1 |
|  | [28] CHIMNEY_FAN_DEFAULT_SET |  |  | 1 |
| [2B] COMMAND_CLASS_SCENE_ACTIVATION |  |  |  | 1 |
|  | [01] SCENE_ACTIVATION_SET |  |  | 1 |
|  |  | SCENE_ID |  | 1 |
|  |  | DIMMING_DURATION |  | 1 |
|  |  |  | [00] INSTANTLY | 1 |
|  |  |  | [FF] CONFIGURED_DIMMING_DURATION | 1 |
| [2C] COMMAND_CLASS_SCENE_ACTUATOR_CONF |  |  |  | 1 |
|  | [01] SCENE_ACTUATOR_CONF_SET |  |  | 1 |
|  |  | SCENE_ID |  | 1 |
|  |  | DIMMING_DURATION |  | 1 |
|  |  |  | [00] SPECIFY_INSTANTLY | 1 |
|  |  |  | [FF] FACTORY_DEFAULT | 1 |
|  |  | LEVEL |  | 1 |
|  | [02] SCENE_ACTUATOR_CONF_GET |  |  | 1 |
|  |  | SCENE_ID |  | 1 |
|  | [03] SCENE_ACTUATOR_CONF_REPORT |  |  | 1 |
|  |  | SCENE_ID |  | 1 |
|  |  | LEVEL |  | 1 |
|  |  | DIMMING_DURATION |  | 1 |
|  |  |  | [00] INSTANTLY | 1 |
| [2D] COMMAND_CLASS_SCENE_CONTROLLER_CONF |  |  |  | 1 |
|  | [01] SCENE_CONTROLLER_CONF_SET |  |  | 1 |
|  |  | GROUP_ID |  | 1 |
|  |  | SCENE_ID |  | 1 |
|  |  | DIMMING_DURATION |  | 1 |
|  |  |  | [00] INSTANTLY | 1 |
|  |  |  | [FF] FACTORY_DEFAULT | 1 |
|  | [02] SCENE_CONTROLLER_CONF_GET |  |  | 1 |
|  |  | GROUP_ID |  | 1 |
|  | [03] SCENE_CONTROLLER_CONF_REPORT |  |  | 1 |
|  |  | GROUP_ID |  | 1 |
|  |  | SCENE_ID |  | 1 |
|  |  | DIMMING_DURATION |  | 1 |
|  |  |  | [00] INSTANTLY | 1 |
| [2E] COMMAND_CLASS_SECURITY_PANEL_ZONE |  |  |  | 1 |
|  | [01] SECURITY_PANEL_ZONE_NUMBER_SUPPORTED_GET |  |  | 1 |
|  | [02] SECURITY_PANEL_ZONE_SUPPORTED_REPORT |  |  | 1 |
|  | [03] SECURITY_PANEL_ZONE_TYPE_GET |  |  | 1 |
|  |  | ZONE_NUMBER |  | 1 |
|  | [04] SECURITY_PANEL_ZONE_TYPE_REPORT |  |  | 1 |
|  |  | ZONE_NUMBER |  | 1 |
|  |  | ZONE_TYPE |  | 1 |
|  |  |  | [01] ALARM_ZONE | 1 |
|  |  |  | [02] NOTIFICATION_ZONE | 1 |
|  | [05] SECURITY_PANEL_ZONE_STATE_GET |  |  | 1 |
|  |  | ZONE_NUMBER |  | 1 |
|  | [06] SECURITY_PANEL_ZONE_STATE_REPORT |  |  | 1 |
|  |  | ZONE_NUMBER |  | 1 |
|  |  | ZONE_STATE |  | 1 |
|  |  |  | [00] FAULTED | 1 |
|  |  |  | [01] NOT_FAULTED | 1 |
|  |  |  | [02] BYPASS_FAULTED | 1 |
|  |  |  | [03] BYPASS_NOT_FAULTED | 1 |
| [2F] COMMAND_CLASS_SECURITY_PANEL_ZONE_SENSOR |  |  |  | 1 |
|  | [01] SECURITY_PANEL_ZONE_SENSOR_INSTALLED_GET |  |  | 1 |
|  |  | ZONE_NUMBER |  | 1 |
|  | [02] COMMAND_CLASS_SECURITY_PANEL_ZONE_SENSOR_INSTALLED_REPORT |  |  | 1 |
|  |  | ZONE_NUMBER |  | 1 |
|  |  | NUMBER_OF_SENSORS |  | 1 |
|  | [03] SECURITY_PANEL_ZONE_SENSOR_TYPE_GET |  |  | 1 |
|  |  | ZONE_NUMBER |  | 1 |
|  |  | SENSOR_NUMBER |  | 1 |
|  | [04] SECURITY_PANEL_ZONE_SENSOR_TYPE_REPORT |  |  | 1 |
|  |  | ZONE_NUMBER |  | 1 |
|  |  | SENSOR_NUMBER |  | 1 |
|  |  | ZWAVE_ALARM_TYPE |  | 1 |
|  | [05] SECURITY_PANEL_ZONE_SENSOR_STATE_GET |  |  | 1 |
|  |  | ZONE_NUMBER |  | 1 |
|  |  | SENSOR_NUMBER |  | 1 |
|  | [06] SECURITY_PANEL_ZONE_SENSOR_STATE_REPORT |  |  | 1 |
|  |  | ZONE_NUMBER |  | 1 |
|  |  | SENSOR_NUMBER |  | 1 |
|  |  | ZWAVE_ALARM_TYPE |  | 1 |
|  |  | ZWAVE_ALARM_EVENT |  | 1 |
|  |  | EVENT_PARAMETERS |  | 1 |
| [30] COMMAND_CLASS_SENSOR_BINARY |  |  |  | 2 |
|  | [01] SENSOR_BINARY_SUPPORTED_GET_SENSOR |  |  | 2 |
|  | [02] SENSOR_BINARY_GET |  |  | 1-2 |
|  |  | SENSOR_TYPE |  | 2 |
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
|  |  | SENSOR_VALUE |  | 1-2 |
|  |  |  | [00] IDLE | 1-2 |
|  |  |  | [FF] DETECTED_AN_EVENT | 1-2 |
|  |  | SENSOR_TYPE |  | 2 |
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
|  |  | BIT_MASK |  | 2 |
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
|  |  | BIT_MASK |  | 5-10 |
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
|  | [03] SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE |  |  | 5-10 |
|  |  | SENSOR_TYPE |  | 5-10 |
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
|  | [04] SENSOR_MULTILEVEL_GET |  |  | 1-10 |
|  |  | SENSOR_TYPE |  | 5-10 |
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
|  | [05] SENSOR_MULTILEVEL_REPORT |  |  | 1-10 |
|  |  | SENSOR_TYPE |  | 1-10 |
|  |  |  | [01] TEMPERATURE | 1-10 |
|  |  |  | [02] GENERAL_PURPOSE_VALUE | 1-10 |
|  |  |  | [03] LUMINANCE | 1-10 |
|  |  | SENSOR_VALUE |  | 1-10 |
|  | [06] SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT |  |  | 5-10 |
|  |  | SENSOR_TYPE |  | 5-10 |
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
| [32] COMMAND_CLASS_METER |  |  |  | 4 |
|  | [01] METER_GET |  |  | 1-4 |
|  |  | SCALE_2 |  | 4 |
|  | [02] METER_REPORT |  |  | 1-4 |
|  |  | METER_TYPE |  | 1 |
|  |  |  | [01] ELECTRIC_METER | 1 |
|  |  |  | [02] GAS_METER | 1 |
|  |  |  | [03] WATER_METER | 1 |
|  |  | METER_VALUE |  | 1-4 |
|  |  | DELTA_TIME |  | 2-4 |
|  |  | PREVIOUS_METER_VALUE |  | 2-4 |
|  |  | SCALE_2 |  | 4 |
|  | [03] METER_SUPPORTED_GET |  |  | 2-4 |
|  | [04] METER_SUPPORTED_REPORT |  |  | 2-4 |
|  |  | SCALE_SUPPORTED |  | 3 |
|  |  | NUMBER_OF_SCALE_SUPPORTED_BYTES_TO_FOLLOW |  | 4 |
|  |  | SCALE_SUPPORTED_LIST |  | 4 |
|  | [05] METER_RESET |  |  | 2-4 |
| [33] COMMAND_CLASS_SWITCH_COLOR |  |  |  | 3 |
|  | [01] SWITCH_COLOR_SUPPORTED_GET |  |  | 1-3 |
|  | [02] SWITCH_COLOR_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | COLOR_COMPONENT_MASK |  | 1-3 |
|  | [03] SWITCH_COLOR_GET |  |  | 1-3 |
|  |  | COLOR_COMPONENT_ID |  | 1-3 |
|  | [04] SWITCH_COLOR_REPORT |  |  | 1-3 |
|  |  | COLOR_COMPONENT_ID |  | 1-3 |
|  |  | CURRENT_VALUE |  | 1-3 |
|  |  | TARGET_VALUE |  | 3 |
|  |  | DURATION |  | 3 |
|  |  |  | [00] ALREADY_AT_THE_TARGET_VALUE | 3 |
|  |  |  | [FE] UNKNOWN_DURATION | 3 |
|  | [05] SWITCH_COLOR_SET |  |  | 1-3 |
|  |  | COLOR_VALUE |  | 1-3 |
|  |  | DURATION |  | 2-3 |
|  | [06] SWITCH_COLOR_START_LEVEL_CHANGE |  |  | 1-3 |
|  |  | COLOR_COMPONENT_ID |  | 1-3 |
|  |  | START_LEVEL |  | 1-3 |
|  |  | DURATION |  | 3 |
|  |  |  | [00] INSTANTLY | 3 |
|  |  |  | [FF] DEFAULT | 3 |
|  | [07] SWITCH_COLOR_STOP_LEVEL_CHANGE |  |  | 1-3 |
|  |  | COLOR_COMPONENT_ID |  | 1-3 |
| [34] COMMAND_CLASS_NETWORK_MANAGEMENT_INCLUSION |  |  |  | 2 |
|  | [01] NODE_ADD |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | MODE |  | 1-2 |
|  |  |  | [01] NODE_ADD_ANY | 1-2 |
|  |  |  | [02] NODE_ADD_CONTROLLER | 1-2 |
|  |  |  | [03] NODE_ADD_SLAVE | 1-2 |
|  |  |  | [04] NODE_ADD_EXISTING | 1-2 |
|  |  |  | [05] NODE_ADD_STOP | 1-2 |
|  |  |  | [06] NODE_ADD_STOP_FAILED | 1-2 |
|  |  | TX_OPTIONS |  | 1-2 |
|  |  |  | [01] ACK | 1-2 |
|  |  |  | [02] LOW_POWER | 1-2 |
|  |  |  | [04] AUTO_ROUTE | 1-2 |
|  |  |  | [10] NO_ROUTE | 1-2 |
|  |  |  | [20] EXPLORE | 1-2 |
|  |  |  | [40] NO_RETRANSMISSION | 1-2 |
|  |  |  | [80] HIGH_POWER | 1-2 |
|  | [02] NODE_ADD_STATUS |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [06] NODE_ADD_STATUS_DONE | 1-2 |
|  |  |  | [07] NODE_ADD_STATUS_FAILED | 1-2 |
|  |  |  | [09] NODE_ADD_STATUS_SECURITY_FAILED | 1-2 |
|  |  | NEW_NODE_ID |  | 1-2 |
|  |  | NODE_INFO_LENGTH |  | 1-2 |
|  |  | BASIC_DEVICE_CLASS |  | 1-2 |
|  |  | GENERIC_DEVICE_CLASS |  | 1-2 |
|  |  | SPECIFIC_DEVICE_CLASS |  | 1-2 |
|  |  | COMMAND_CLASS |  | 1-2 |
|  |  | SECURITY_MARK |  | 2 |
|  |  |  | [00] SECURITY_MARK | 2 |
|  |  |  | [F1] SECURITY_MARK | 2 |
|  |  | SECURE_COMMAND_CLASS |  | 2 |
|  |  | GRANTED_KEYS |  | 2 |
|  |  | KEX_FAIL_TYPE |  | 2 |
|  | [03] NODE_REMOVE |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | MODE |  | 1-2 |
|  |  |  | [01] NODE_REMOVE_ANY | 1-2 |
|  |  |  | [02] NODE_REMOVE_CONTROLLER | 1-2 |
|  |  |  | [03] NODE_REMOVE_SLAVE | 1-2 |
|  |  |  | [05] NODE_REMOVE_STOP | 1-2 |
|  | [04] NODE_REMOVE_STATUS |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [06] NODE_REMOVE_STATUS_DONE | 1-2 |
|  |  |  | [07] NODE_REMOVE_STATUS_FAILED | 1-2 |
|  |  | NODEID |  | 1-2 |
|  | [07] FAILED_NODE_REMOVE |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | NODE_ID |  | 1-2 |
|  | [08] FAILED_NODE_REMOVE_STATUS |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | NODE_ID |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [00] FAILED_NODE_NOT_FOUND | 1-2 |
|  |  |  | [01] DONE | 1-2 |
|  |  |  | [02] FAILED_NODE_REMOVE_FAIL | 1-2 |
|  | [09] FAILED_NODE_REPLACE |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | NODE_ID |  | 1-2 |
|  |  | TX_OPTIONS |  | 1-2 |
|  |  |  | [01] ACK | 1-2 |
|  |  |  | [02] LOW_POWER | 1-2 |
|  |  |  | [04] AUTO_ROUTE | 1-2 |
|  |  |  | [10] NO_ROUTE | 1-2 |
|  |  |  | [20] EXPLORE | 1-2 |
|  |  |  | [40] NO_RETRANSMISSION | 1-2 |
|  |  |  | [80] HIGH_POWER | 1-2 |
|  |  | MODE |  | 1-2 |
|  | [0A] FAILED_NODE_REPLACE_STATUS |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [04] DONE | 1-2 |
|  |  |  | [05] FAILED_NODE_REPLACE_FAIL | 1-2 |
|  |  |  | [09] FAILED_NODE_REPLACE_SECURITY_FAILED | 1-2 |
|  |  | NODE_ID |  | 1-2 |
|  |  | GRANTED_KEYS |  | 2 |
|  |  | KEX_FAIL_TYPE |  | 2 |
|  | [0B] NODE_NEIGHBOR_UPDATE_REQUEST |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | NODE_ID |  | 1-2 |
|  | [0C] NODE_NEIGHBOR_UPDATE_STATUS |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [22] NEIGHBOR_UPDATE_STATUS_DONE | 1-2 |
|  |  |  | [23] NEIGHBOR_UPDATE_STATUS_FAIL | 1-2 |
|  | [0D] RETURN_ROUTE_ASSIGN |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | SOURCE_NODE_ID |  | 1-2 |
|  |  | DESTINATION_NODE_ID |  | 1-2 |
|  | [0E] RETURN_ROUTE_ASSIGN_COMPLETE |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [00] TRANSMIT_COMPLETE_OK | 1-2 |
|  |  |  | [01] TRANSMIT_COMPLETE_NO_ACK | 1-2 |
|  |  |  | [02] TRANSMIT_COMPLETE_FAIL | 1-2 |
|  | [0F] RETURN_ROUTE_DELETE |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | NODE_ID |  | 1-2 |
|  | [10] RETURN_ROUTE_DELETE_COMPLETE |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [00] TRANSMIT_COMPLETE_OK | 1-2 |
|  |  |  | [01] TRANSMIT_COMPLETE_NO_ACK | 1-2 |
|  |  |  | [02] TRANSMIT_COMPLETE_FAIL | 1-2 |
|  | [11] NODE_ADD_KEYS_REPORT |  |  | 2 |
|  |  | SEQ_NO |  | 2 |
|  |  | REQUESTED_KEYS |  | 2 |
|  | [12] NODE_ADD_KEYS_SET |  |  | 2 |
|  |  | SEQ_NO |  | 2 |
|  |  | GRANTED_KEYS |  | 2 |
|  | [13] NODE_ADD_DSK_REPORT |  |  | 2 |
|  |  | SEQ_NO |  | 2 |
|  |  | DSK |  | 2 |
|  | [14] NODE_ADD_DSK_SET |  |  | 2 |
|  |  | SEQ_NO |  | 2 |
|  |  | INPUT_DSK |  | 2 |
| [35] COMMAND_CLASS_METER_PULSE |  |  |  | 1 |
|  | [04] METER_PULSE_GET |  |  | 1 |
|  | [05] METER_PULSE_REPORT |  |  | 1 |
|  |  | PULSE_COUNT |  | 1 |
| [36] COMMAND_CLASS_BASIC_TARIFF_INFO |  |  |  | 1 |
|  | [01] BASIC_TARIFF_INFO_GET |  |  | 1 |
|  | [02] BASIC_TARIFF_INFO_REPORT |  |  | 1 |
|  |  | E1_RATE_CONSUMPTION_REGISTER |  | 1 |
|  |  | E1_TIME_FOR_NEXT_RATE_HOURS |  | 1 |
|  |  | E1_TIME_FOR_NEXT_RATE_MINUTES |  | 1 |
|  |  | E1_TIME_FOR_NEXT_RATE_SECONDS |  | 1 |
|  |  | E2_RATE_CONSUMPTION_REGISTER |  | 1 |
| [37] COMMAND_CLASS_HRV_STATUS |  |  |  | 1 |
|  | [01] HRV_STATUS_GET |  |  | 1 |
|  |  | STATUS_PARAMETER |  | 1 |
|  |  |  | [00] OUTDOOR_AIR_TEMPERATURE | 1 |
|  |  |  | [01] SUPPLY_AIR_TEMPERATURE | 1 |
|  |  |  | [02] EXHAUST_AIR_TEMPERATURE | 1 |
|  |  |  | [03] DISCHARGE_AIR_TEMPERATURE | 1 |
|  |  |  | [04] ROOM_TEMPERATURE | 1 |
|  |  |  | [05] RELATIVE_HUMIDITY_IN_ROOM | 1 |
|  |  |  | [06] REMAINING_FILTER_LIFE | 1 |
|  | [02] HRV_STATUS_REPORT |  |  | 1 |
|  |  | STATUS_PARAMETER |  | 1 |
|  |  |  | [00] OUTDOOR_AIR_TEMPERATURE | 1 |
|  |  |  | [01] SUPPLY_AIR_TEMPERATURE | 1 |
|  |  |  | [02] EXHAUST_AIR_TEMPERATURE | 1 |
|  |  |  | [03] DISCHARGE_AIR_TEMPERATURE | 1 |
|  |  |  | [04] ROOM_TEMPERATURE | 1 |
|  |  |  | [05] RELATIVE_HUMIDITY_IN_ROOM | 1 |
|  |  |  | [06] REMAINING_FILTER_LIFE | 1 |
|  |  | VALUE |  | 1 |
|  | [03] HRV_STATUS_SUPPORTED_GET |  |  | 1 |
|  | [04] HRV_STATUS_SUPPORTED_REPORT |  |  | 1 |
|  |  | BIT_MASK |  | 1 |
|  |  |  | [00] OUTDOOR_AIR_TEMPERATURE | 1 |
|  |  |  | [01] SUPPLY_AIR_TEMPERATURE | 1 |
|  |  |  | [02] EXHAUST_AIR_TEMPERATURE | 1 |
|  |  |  | [03] DISCHARGE_AIR_TEMPERATURE | 1 |
|  |  |  | [04] ROOM_TEMPERATURE | 1 |
|  |  |  | [05] RELATIVE_HUMIDITY_IN_ROOM | 1 |
|  |  |  | [06] REMAINING_FILTER_LIFE | 1 |
| [38] COMMAND_CLASS_THERMOSTAT_HEATING |  |  |  | 1 |
|  | [01] THERMOSTAT_HEATING_MODE_SET |  |  | 1 |
|  |  | MODE |  | 1 |
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
|  |  | MODE |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] OFF_TIMED | 1 |
|  |  |  | [02] OFF_3_HOURS | 1 |
|  |  |  | [03] ANTI_FREEZE | 1 |
|  |  |  | [04] MANUAL | 1 |
|  |  |  | [05] TEMPORARY_MANUAL | 1 |
|  |  |  | [06] AUTOMATIC | 1 |
|  |  |  | [07] MANUAL_TIMED | 1 |
|  | [04] THERMOSTAT_HEATING_SETPOINT_SET |  |  | 1 |
|  |  | SETPOINT_NR |  | 1 |
|  |  | VALUE |  | 1 |
|  | [05] THERMOSTAT_HEATING_SETPOINT_GET |  |  | 1 |
|  |  | SETPOINT_NR |  | 1 |
|  | [06] THERMOSTAT_HEATING_SETPOINT_REPORT |  |  | 1 |
|  |  | SETPOINT_NR |  | 1 |
|  |  | VALUE |  | 1 |
|  | [09] THERMOSTAT_HEATING_RELAY_STATUS_GET |  |  | 1 |
|  | [0A] THERMOSTAT_HEATING_RELAY_STATUS_REPORT |  |  | 1 |
|  |  | RELAY_STATUS |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] ON | 1 |
|  | [0B] THERMOSTAT_HEATING_STATUS_SET |  |  | 1 |
|  |  | STATUS |  | 1 |
|  |  |  | [00] HEATING | 1 |
|  |  |  | [01] COOLING | 1 |
|  | [0C] THERMOSTAT_HEATING_STATUS_GET |  |  | 1 |
|  | [0D] THERMOSTAT_HEATING_STATUS_REPORT |  |  | 1 |
|  |  | STATUS |  | 1 |
|  |  |  | [00] HEATING | 1 |
|  |  |  | [01] COOLING | 1 |
|  | [11] THERMOSTAT_HEATING_TIMED_OFF_SET |  |  | 1 |
|  |  | MINUTES |  | 1 |
|  |  | HOURS |  | 1 |
| [39] COMMAND_CLASS_HRV_CONTROL |  |  |  | 1 |
|  | [01] HRV_CONTROL_MODE_SET |  |  | 1 |
|  | [02] HRV_CONTROL_MODE_GET |  |  | 1 |
|  | [03] HRV_CONTROL_MODE_REPORT |  |  | 1 |
|  | [04] HRV_CONTROL_BYPASS_SET |  |  | 1 |
|  |  | BYPASS |  | 1 |
|  | [05] HRV_CONTROL_BYPASS_GET |  |  | 1 |
|  | [06] HRV_CONTROL_BYPASS_REPORT |  |  | 1 |
|  |  | BYPASS |  | 1 |
|  | [07] HRV_CONTROL_VENTILATION_RATE_SET |  |  | 1 |
|  |  | VENTILATION_RATE |  | 1 |
|  | [08] HRV_CONTROL_VENTILATION_RATE_GET |  |  | 1 |
|  | [09] HRV_CONTROL_VENTILATION_RATE_REPORT |  |  | 1 |
|  |  | VENTILATION_RATE |  | 1 |
|  | [0A] HRV_CONTROL_MODE_SUPPORTED_GET |  |  | 1 |
|  | [0B] HRV_CONTROL_MODE_SUPPORTED_REPORT |  |  | 1 |
|  |  | BIT_MASK |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] DEMAND_AUTOMATIC | 1 |
|  |  |  | [02] SCHEDULE | 1 |
|  |  |  | [03] ENERGY_SAVINGS_MODE | 1 |
|  |  |  | [04] MANUAL | 1 |
| [3A] COMMAND_CLASS_DCP_CONFIG |  |  |  | 1 |
|  | [01] DCP_LIST_SUPPORTED_GET |  |  | 1 |
|  | [02] DCP_LIST_SUPPORTED_REPORT |  |  | 1 |
|  |  | DCP_LIST_SIZE |  | 1 |
|  |  | FREE_DCP_LIST_ENTRIES |  | 1 |
|  | [03] DCP_LIST_SET |  |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_LOCAL_TIME |  | 1 |
|  |  | MINUTE_LOCAL_TIME |  | 1 |
|  |  | SECOND_LOCAL_TIME |  | 1 |
|  |  | DCP_RATE_ID |  | 1 |
|  |  | DEVICE_CLASS |  | 1 |
|  |  | START_YEAR |  | 1 |
|  |  | START_MONTH |  | 1 |
|  |  | START_DAY |  | 1 |
|  |  | START_HOUR_LOCAL_TIME |  | 1 |
|  |  | START_MINUTE_LOCAL_TIME |  | 1 |
|  |  | START_SECOND_LOCAL_TIME |  | 1 |
|  |  | DURATION_HOUR_TIME |  | 1 |
|  |  | DURATION_MINUTE_TIME |  | 1 |
|  |  | DURATION_SECOND_TIME |  | 1 |
|  |  | EVENT_PRIORITY |  | 1 |
|  |  | LOAD_SHEDDING |  | 1 |
|  |  | START_ASSOCIATION_GROUP |  | 1 |
|  |  | STOP_ASSOCIATION_GROUP |  | 1 |
|  |  | RANDOMIZATION_INTERVAL |  | 1 |
|  | [04] DCP_LIST_REMOVE |  |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_LOCAL_TIME |  | 1 |
|  |  | MINUTE_LOCAL_TIME |  | 1 |
|  |  | SECOND_LOCAL_TIME |  | 1 |
| [3B] COMMAND_CLASS_DCP_MONITOR |  |  |  | 1 |
|  | [01] DCP_LIST_GET |  |  | 1 |
|  | [02] DCP_LIST_REPORT |  |  | 1 |
|  |  | REPORTS_TO_FOLLOW |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_LOCAL_TIME |  | 1 |
|  |  | MINUTE_LOCAL_TIME |  | 1 |
|  |  | SECOND_LOCAL_TIME |  | 1 |
|  |  | DCP_ID |  | 1 |
|  |  | DEVICE_CLASS |  | 1 |
|  |  | START_YEAR |  | 1 |
|  |  | START_MONTH |  | 1 |
|  |  | START_DAY |  | 1 |
|  |  | START_HOUR_LOCAL_TIME |  | 1 |
|  |  | START_MINUTE_LOCAL_TIME |  | 1 |
|  |  | START_SECOND_LOCAL_TIME |  | 1 |
|  |  | DURATION_HOUR_TIME |  | 1 |
|  |  | DURATION_MINUTE_TIME |  | 1 |
|  |  | DURATION_SECOND_TIME |  | 1 |
|  |  | EVENT_PRIORITY |  | 1 |
|  |  | LOAD_SHEDDING |  | 1 |
|  |  | START_ASSOCIATION_GROUP |  | 1 |
|  |  | STOP_ASSOCIATION_GROUP |  | 1 |
|  |  | RANDOMIZATION_INTERVAL |  | 1 |
|  | [03] DCP_EVENT_STATUS_GET |  |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_LOCAL_TIME |  | 1 |
|  |  | MINUTE_LOCAL_TIME |  | 1 |
|  |  | SECOND_LOCAL_TIME |  | 1 |
|  | [04] DCP_EVENT_STATUS_REPORT |  |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_LOCAL_TIME |  | 1 |
|  |  | MINUTE_LOCAL_TIME |  | 1 |
|  |  | SECOND_LOCAL_TIME |  | 1 |
|  |  | EVENT_STATUS |  | 1 |
|  |  |  | [01] EVENT_STARTED | 1 |
|  |  |  | [02] EVENT_COMPLETED | 1 |
|  |  |  | [03] EVENT_REJECTED | 1 |
|  |  |  | [04] EVENT_NOT_APPLICABLE | 1 |
| [3C] COMMAND_CLASS_METER_TBL_CONFIG |  |  |  | 1 |
|  | [01] METER_TBL_TABLE_POINT_ADM_NO_SET |  |  | 1 |
|  |  | METER_POINT_ADM_NUMBER_CHARACTER |  | 1 |
| [3D] COMMAND_CLASS_METER_TBL_MONITOR |  |  |  | 2 |
|  | [01] METER_TBL_TABLE_POINT_ADM_NO_GET |  |  | 1-2 |
|  | [02] METER_TBL_TABLE_POINT_ADM_NO_REPORT |  |  | 1-2 |
|  |  | METER_POINT_ADM_NUMBER_CHARACTER |  | 1-2 |
|  | [03] METER_TBL_TABLE_ID_GET |  |  | 1-2 |
|  | [04] METER_TBL_TABLE_ID_REPORT |  |  | 1-2 |
|  |  | METER_ID_CHARACTER |  | 1-2 |
|  | [05] METER_TBL_TABLE_CAPABILITY_GET |  |  | 1-2 |
|  | [06] METER_TBL_REPORT |  |  | 1-2 |
|  |  | DATASET_SUPPORTED |  | 1-2 |
|  |  | DATASET_HISTORY_SUPPORTED |  | 1-2 |
|  |  | DATA_HISTORY_SUPPORTED |  | 1-2 |
|  | [07] METER_TBL_STATUS_SUPPORTED_GET |  |  | 1-2 |
|  | [08] METER_TBL_STATUS_SUPPORTED_REPORT |  |  | 1-2 |
|  |  | SUPPORTED_OPERATING_STATUS |  | 1-2 |
|  |  | STATUS_EVENT_LOG_DEPTH |  | 1-2 |
|  | [09] METER_TBL_STATUS_DEPTH_GET |  |  | 1-2 |
|  |  | STATUS_EVENT_LOG_DEPTH |  | 1-2 |
|  | [0A] METER_TBL_STATUS_DATE_GET |  |  | 1-2 |
|  |  | MAXIMUM_REPORTS |  | 1-2 |
|  |  | START_YEAR |  | 1-2 |
|  |  | START_MONTH |  | 1-2 |
|  |  | START_DAY |  | 1-2 |
|  |  | START_HOUR_LOCAL_TIME |  | 1-2 |
|  |  | START_MINUTE_LOCAL_TIME |  | 1-2 |
|  |  | START_SECOND_LOCAL_TIME |  | 1-2 |
|  |  | STOP_YEAR |  | 1-2 |
|  |  | STOP_MONTH |  | 1-2 |
|  |  | STOP_DAY |  | 1-2 |
|  |  | STOP_HOUR_LOCAL_TIME |  | 1-2 |
|  |  | STOP_MINUTE_LOCAL_TIME |  | 1-2 |
|  |  | STOP_SECOND_LOCAL_TIME |  | 1-2 |
|  | [0B] METER_TBL_STATUS_REPORT |  |  | 1-2 |
|  |  | REPORTS_TO_FOLLOW |  | 1-2 |
|  |  | CURRENT_OPERATING_STATUS |  | 1-2 |
|  |  | METER_TABLE_STATUS |  | 1-2 |
|  | [0C] METER_TBL_CURRENT_DATA_GET |  |  | 1-2 |
|  |  | DATASET_REQUESTED |  | 1-2 |
|  | [0D] METER_TBL_CURRENT_DATA_REPORT |  |  | 1-2 |
|  |  | REPORTS_TO_FOLLOW |  | 1-2 |
|  |  | DATASET |  | 1-2 |
|  |  | YEAR |  | 1-2 |
|  |  | MONTH |  | 1-2 |
|  |  | DAY |  | 1-2 |
|  |  | HOUR_LOCAL_TIME |  | 1-2 |
|  |  | MINUTE_LOCAL_TIME |  | 1-2 |
|  |  | SECOND_LOCAL_TIME |  | 1-2 |
|  |  | METER_TABLE_VALUE |  | 1-2 |
|  | [0E] METER_TBL_HISTORICAL_DATA_GET |  |  | 1-2 |
|  |  | MAXIMUM_REPORTS |  | 1-2 |
|  |  | HISTORICAL_DATASET_REQUESTED |  | 1-2 |
|  |  | START_YEAR |  | 1-2 |
|  |  | START_MONTH |  | 1-2 |
|  |  | START_DAY |  | 1-2 |
|  |  | START_HOUR_LOCAL_TIME |  | 1-2 |
|  |  | START_MINUTE_LOCAL_TIME |  | 1-2 |
|  |  | START_SECOND_LOCAL_TIME |  | 1-2 |
|  |  | STOP_YEAR |  | 1-2 |
|  |  | STOP_MONTH |  | 1-2 |
|  |  | STOP_DAY |  | 1-2 |
|  |  | STOP_HOUR_LOCAL_TIME |  | 1-2 |
|  |  | STOP_MINUTE_LOCAL_TIME |  | 1-2 |
|  |  | STOP_SECOND_LOCAL_TIME |  | 1-2 |
|  | [0F] METER_TBL_HISTORICAL_DATA_REPORT |  |  | 1-2 |
|  |  | REPORTS_TO_FOLLOW |  | 1-2 |
|  |  | DATASET |  | 1-2 |
|  |  | YEAR |  | 1-2 |
|  |  | MONTH |  | 1-2 |
|  |  | DAY |  | 1-2 |
|  |  | HOUR_LOCAL_TIME |  | 1-2 |
|  |  | MINUTE_LOCAL_TIME |  | 1-2 |
|  |  | SECOND_LOCAL_TIME |  | 1-2 |
|  |  | METER_TABLE_VALUE |  | 1-2 |
| [3E] COMMAND_CLASS_METER_TBL_PUSH |  |  |  | 1 |
|  | [01] METER_TBL_PUSH_CONFIGURATION_SET |  |  | 1 |
|  |  | PUSH_DATASET |  | 1 |
|  |  | INTERVAL_MONTHS |  | 1 |
|  |  | INTERVAL_DAYS |  | 1 |
|  |  | INTERVAL_HOURS |  | 1 |
|  |  | INTERVAL_MINUTES |  | 1 |
|  |  | PUSH_NODE_ID |  | 1 |
|  | [02] METER_TBL_PUSH_CONFIGURATION_GET |  |  | 1 |
|  | [03] METER_TBL_PUSH_CONFIGURATION_REPORT |  |  | 1 |
|  |  | PUSH_DATASET |  | 1 |
|  |  | INTERVAL_MONTHS |  | 1 |
|  |  | INTERVAL_DAYS |  | 1 |
|  |  | INTERVAL_HOURS |  | 1 |
|  |  | INTERVAL_MINUTES |  | 1 |
|  |  | PUSH_NODE_ID |  | 1 |
| [3F] COMMAND_CLASS_PREPAYMENT |  |  |  | 1 |
|  | [01] PREPAYMENT_BALANCE_GET |  |  | 1 |
|  | [02] PREPAYMENT_BALANCE_REPORT |  |  | 1 |
|  |  | BALANCE_VALUE |  | 1 |
|  |  | DEBT |  | 1 |
|  |  | EMER_CREDIT |  | 1 |
|  |  | CURRENCY |  | 1 |
|  |  | DEBT_RECOVERY_PERCENTAGE |  | 1 |
|  | [03] PREPAYMENT_SUPPORTED_GET |  |  | 1 |
|  | [04] PREPAYMENT_SUPPORTED_REPORT |  |  | 1 |
| [40] COMMAND_CLASS_THERMOSTAT_MODE |  |  |  | 3 |
|  | [01] THERMOSTAT_MODE_SET |  |  | 1-3 |
|  |  | MANUFACTURER_DATA |  | 3 |
|  | [02] THERMOSTAT_MODE_GET |  |  | 1-3 |
|  | [03] THERMOSTAT_MODE_REPORT |  |  | 1-3 |
|  |  | MANUFACTURER_DATA |  | 3 |
|  | [04] THERMOSTAT_MODE_SUPPORTED_GET |  |  | 1-3 |
|  | [05] THERMOSTAT_MODE_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | BIT_MASK |  | 1-3 |
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
| [41] COMMAND_CLASS_PREPAYMENT_ENCAPSULATION |  |  |  | 1 |
|  | [01] CMD_ENCAPSULATION |  |  | 1 |
|  |  | DATA |  | 1 |
| [42] COMMAND_CLASS_THERMOSTAT_OPERATING_STATE |  |  |  | 2 |
|  | [01] THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET |  |  | 2 |
|  | [02] THERMOSTAT_OPERATING_STATE_GET |  |  | 1-2 |
|  | [03] THERMOSTAT_OPERATING_STATE_REPORT |  |  | 1-2 |
|  | [04] THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT |  |  | 2 |
|  |  | BIT_MASK |  | 2 |
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
|  |  | BIT_MASK |  | 2 |
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
|  |  | REPORTS_TO_FOLLOW |  | 2 |
|  |  | THERMOSTAT_LOG_REPORT |  | 2 |
| [43] COMMAND_CLASS_THERMOSTAT_SETPOINT |  |  |  | 3 |
|  | [01] THERMOSTAT_SETPOINT_SET |  |  | 1-3 |
|  |  | VALUE |  | 1-3 |
|  | [02] THERMOSTAT_SETPOINT_GET |  |  | 1-3 |
|  | [03] THERMOSTAT_SETPOINT_REPORT |  |  | 1-3 |
|  |  | VALUE |  | 1-3 |
|  | [04] THERMOSTAT_SETPOINT_SUPPORTED_GET |  |  | 1-3 |
|  | [05] THERMOSTAT_SETPOINT_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | BIT_MASK |  | 1-3 |
|  |  |  | [00] NONE | 1-3 |
|  |  |  | [01] HEATING | 1-3 |
|  |  |  | [02] COOLING | 1-3 |
|  |  |  | [07] FURNACE | 1-3 |
|  |  |  | [08] DRY_AIR | 1-3 |
|  |  |  | [09] MOIST_AIR | 1-3 |
|  |  |  | [0A] AUTO_CHANGEOVER | 1-3 |
|  | [09] THERMOSTAT_SETPOINT_CAPABILITIES_GET |  |  | 3 |
|  | [0A] THERMOSTAT_SETPOINT_CAPABILITIES_REPORT |  |  | 3 |
|  |  | MIN_VALUE |  | 3 |
|  |  | MAXVALUE |  | 3 |
| [44] COMMAND_CLASS_THERMOSTAT_FAN_MODE |  |  |  | 4 |
|  | [01] THERMOSTAT_FAN_MODE_SET |  |  | 1-4 |
|  | [02] THERMOSTAT_FAN_MODE_GET |  |  | 1-4 |
|  | [03] THERMOSTAT_FAN_MODE_REPORT |  |  | 1-4 |
|  | [04] THERMOSTAT_FAN_MODE_SUPPORTED_GET |  |  | 1-4 |
|  | [05] THERMOSTAT_FAN_MODE_SUPPORTED_REPORT |  |  | 1-4 |
|  |  | BIT_MASK |  | 1-4 |
|  |  |  | [00] AUTO | 1-4 |
|  |  |  | [01] ON | 1-4 |
|  |  |  | [02] AUTO_HIGH | 1-4 |
|  |  |  | [03] ON_HIGH | 1-4 |
| [45] COMMAND_CLASS_THERMOSTAT_FAN_STATE |  |  |  | 2 |
|  | [02] THERMOSTAT_FAN_STATE_GET |  |  | 1-2 |
|  | [03] THERMOSTAT_FAN_STATE_REPORT |  |  | 1-2 |
| [46] COMMAND_CLASS_CLIMATE_CONTROL_SCHEDULE |  |  |  | 1 |
|  | [01] SCHEDULE_SET |  |  | 1 |
|  |  | SWITCHPOINT_0 |  | 1 |
|  |  | SWITCHPOINT_1 |  | 1 |
|  |  | SWITCHPOINT_2 |  | 1 |
|  |  | SWITCHPOINT_3 |  | 1 |
|  |  | SWITCHPOINT_4 |  | 1 |
|  |  | SWITCHPOINT_5 |  | 1 |
|  |  | SWITCHPOINT_6 |  | 1 |
|  |  | SWITCHPOINT_7 |  | 1 |
|  |  | SWITCHPOINT_8 |  | 1 |
|  | [02] SCHEDULE_GET |  |  | 1 |
|  | [03] SCHEDULE_REPORT |  |  | 1 |
|  |  | SWITCHPOINT_0 |  | 1 |
|  |  | SWITCHPOINT_1 |  | 1 |
|  |  | SWITCHPOINT_2 |  | 1 |
|  |  | SWITCHPOINT_3 |  | 1 |
|  |  | SWITCHPOINT_4 |  | 1 |
|  |  | SWITCHPOINT_5 |  | 1 |
|  |  | SWITCHPOINT_6 |  | 1 |
|  |  | SWITCHPOINT_7 |  | 1 |
|  |  | SWITCHPOINT_8 |  | 1 |
|  | [04] SCHEDULE_CHANGED_GET |  |  | 1 |
|  | [05] SCHEDULE_CHANGED_REPORT |  |  | 1 |
|  |  | CHANGECOUNTER |  | 1 |
|  | [06] SCHEDULE_OVERRIDE_SET |  |  | 1 |
|  |  | OVERRIDE_STATE |  | 1 |
|  |  |  | [00] NO_OVERRIDE | 1 |
|  |  |  | [01] TEMPORARY_OVERRIDE | 1 |
|  |  |  | [02] PERMANENT_OVERRIDE | 1 |
|  | [07] SCHEDULE_OVERRIDE_GET |  |  | 1 |
|  | [08] SCHEDULE_OVERRIDE_REPORT |  |  | 1 |
|  |  | OVERRIDE_STATE |  | 1 |
|  |  |  | [00] NO_OVERRIDE | 1 |
|  |  |  | [01] TEMPORARY_OVERRIDE | 1 |
|  |  |  | [02] PERMANENT_OVERRIDE | 1 |
| [47] COMMAND_CLASS_THERMOSTAT_SETBACK |  |  |  | 1 |
|  | [01] THERMOSTAT_SETBACK_SET |  |  | 1 |
|  |  | SETBACK_STATE |  | 1 |
|  |  |  | [79] FROST_PROTECTION | 1 |
|  |  |  | [7A] ENERGY_SAVING_MODE | 1 |
|  |  |  | [7F] UNUSED_STATE | 1 |
|  | [02] THERMOSTAT_SETBACK_GET |  |  | 1 |
|  | [03] THERMOSTAT_SETBACK_REPORT |  |  | 1 |
|  |  | SETBACK_STATE |  | 1 |
|  |  |  | [79] FROST_PROTECTION | 1 |
|  |  |  | [7A] ENERGY_SAVING_MODE | 1 |
|  |  |  | [7F] UNUSED_STATE | 1 |
| [48] COMMAND_CLASS_RATE_TBL_CONFIG |  |  |  | 1 |
|  | [01] RATE_TBL_SET |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  |  | RATE_CHARACTER |  | 1 |
|  |  | START_HOUR_LOCAL_TIME |  | 1 |
|  |  | START_MINUTE_LOCAL_TIME |  | 1 |
|  |  | DURATION_MINUTE |  | 1 |
|  |  | MIN_CONSUMPTION_VALUE |  | 1 |
|  |  | MAX_CONSUMPTION_VALUE |  | 1 |
|  |  | MAX_DEMAND_VALUE |  | 1 |
|  |  | DCP_RATE_ID |  | 1 |
|  | [02] RATE_TBL_REMOVE |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
| [49] COMMAND_CLASS_RATE_TBL_MONITOR |  |  |  | 1 |
|  | [01] RATE_TBL_SUPPORTED_GET |  |  | 1 |
|  | [02] RATE_TBL_SUPPORTED_REPORT |  |  | 1 |
|  |  | RATES_SUPPORTED |  | 1 |
|  |  | PARAMETER_SET_SUPPORTED_BIT_MASK |  | 1 |
|  | [03] RATE_TBL_GET |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  | [04] RATE_TBL_REPORT |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  |  | RATE_CHARACTER |  | 1 |
|  |  | START_HOUR_LOCAL_TIME |  | 1 |
|  |  | START_MINUTE_LOCAL_TIME |  | 1 |
|  |  | DURATION_MINUTE |  | 1 |
|  |  | MIN_CONSUMPTION_VALUE |  | 1 |
|  |  | MAX_CONSUMPTION_VALUE |  | 1 |
|  |  | MAX_DEMAND_VALUE |  | 1 |
|  |  | DCP_RATE_ID |  | 1 |
|  | [05] RATE_TBL_ACTIVE_RATE_GET |  |  | 1 |
|  | [06] RATE_TBL_ACTIVE_RATE_REPORT |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  | [07] RATE_TBL_CURRENT_DATA_GET |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  |  | DATASET_REQUESTED |  | 1 |
|  | [08] RATE_TBL_CURRENT_DATA_REPORT |  |  | 1 |
|  |  | REPORTS_TO_FOLLOW |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  |  | DATASET |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_LOCAL_TIME |  | 1 |
|  |  | MINUTE_LOCAL_TIME |  | 1 |
|  |  | SECOND_LOCAL_TIME |  | 1 |
|  |  | FLOAT_VALUE |  | 1 |
|  | [09] RATE_TBL_HISTORICAL_DATA_GET |  |  | 1 |
|  |  | MAXIMUM_REPORTS |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  |  | DATASET_REQUESTED |  | 1 |
|  |  | START_YEAR |  | 1 |
|  |  | START_MONTH |  | 1 |
|  |  | START_DAY |  | 1 |
|  |  | START_HOUR_LOCAL_TIME |  | 1 |
|  |  | START_MINUTE_LOCAL_TIME |  | 1 |
|  |  | START_SECOND_LOCAL_TIME |  | 1 |
|  |  | STOP_YEAR |  | 1 |
|  |  | STOP_MONTH |  | 1 |
|  |  | STOP_DAY |  | 1 |
|  |  | STOP_HOUR_LOCAL_TIME |  | 1 |
|  |  | STOP_MINUTE_LOCAL_TIME |  | 1 |
|  |  | STOP_SECOND_LOCAL_TIME |  | 1 |
|  | [0A] RATE_TBL_HISTORICAL_DATA_REPORT |  |  | 1 |
|  |  | REPORTS_TO_FOLLOW |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  |  | DATASET |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_LOCAL_TIME |  | 1 |
|  |  | MINUTE_LOCAL_TIME |  | 1 |
|  |  | SECOND_LOCAL_TIME |  | 1 |
|  |  | FLOAT_VALUE |  | 1 |
| [4A] COMMAND_CLASS_TARIFF_CONFIG |  |  |  | 1 |
|  | [01] TARIFF_TBL_SUPPLIER_SET |  |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_LOCAL_TIME |  | 1 |
|  |  | MINUTE_LOCAL_TIME |  | 1 |
|  |  | SECOND_LOCAL_TIME |  | 1 |
|  |  | CURRENCY |  | 1 |
|  |  | STANDING_CHARGE_VALUE |  | 1 |
|  |  | SUPPLIER_CHARACTER |  | 1 |
|  | [02] TARIFF_TBL_SET |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  |  | TARIFF_VALUE |  | 1 |
|  | [03] TARIFF_TBL_REMOVE |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
| [4B] COMMAND_CLASS_TARIFF_TBL_MONITOR |  |  |  | 1 |
|  | [01] TARIFF_TBL_SUPPLIER_GET |  |  | 1 |
|  | [02] TARIFF_TBL_SUPPLIER_REPORT |  |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_LOCAL_TIME |  | 1 |
|  |  | MINUTE_LOCAL_TIME |  | 1 |
|  |  | SECOND_LOCAL_TIME |  | 1 |
|  |  | CURRENCY |  | 1 |
|  |  | STANDING_CHARGE_VALUE |  | 1 |
|  |  | SUPPLIER_CHARACTER |  | 1 |
|  | [03] TARIFF_TBL_GET |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  | [04] TARIFF_TBL_REPORT |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  |  | TARIFF_VALUE |  | 1 |
|  | [05] TARIFF_TBL_COST_GET |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  |  | START_YEAR |  | 1 |
|  |  | START_MONTH |  | 1 |
|  |  | START_DAY |  | 1 |
|  |  | START_HOUR_LOCAL_TIME |  | 1 |
|  |  | START_MINUTE_LOCAL_TIME |  | 1 |
|  |  | STOP_YEAR |  | 1 |
|  |  | STOP_MONTH |  | 1 |
|  |  | STOP_DAY |  | 1 |
|  |  | STOP_HOUR_LOCAL_TIME |  | 1 |
|  |  | STOP_MINUTE_LOCAL_TIME |  | 1 |
|  | [06] TARIFF_TBL_COST_REPORT |  |  | 1 |
|  |  | RATE_PARAMETER_SET_ID |  | 1 |
|  |  | START_YEAR |  | 1 |
|  |  | START_MONTH |  | 1 |
|  |  | START_DAY |  | 1 |
|  |  | START_HOUR_LOCAL_TIME |  | 1 |
|  |  | START_MINUTE_LOCAL_TIME |  | 1 |
|  |  | STOP_YEAR |  | 1 |
|  |  | STOP_MONTH |  | 1 |
|  |  | STOP_DAY |  | 1 |
|  |  | STOP_HOUR_LOCAL_TIME |  | 1 |
|  |  | STOP_MINUTE_LOCAL_TIME |  | 1 |
|  |  | CURRENCY |  | 1 |
|  |  | COST_VALUE |  | 1 |
| [4C] COMMAND_CLASS_DOOR_LOCK_LOGGING |  |  |  | 1 |
|  | [01] DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET |  |  | 1 |
|  | [02] DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT |  |  | 1 |
|  |  | MAX_RECORDS_STORED |  | 1 |
|  | [03] RECORD_GET |  |  | 1 |
|  |  | RECORD_NUMBER |  | 1 |
|  | [04] RECORD_REPORT |  |  | 1 |
|  |  | RECORD_NUMBER |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | MINUTE_LOCAL_TIME |  | 1 |
|  |  | SECOND_LOCAL_TIME |  | 1 |
|  |  | EVENT_TYPE |  | 1 |
|  |  | USER_IDENTIFIER |  | 1 |
|  |  | USER_CODE_LENGTH |  | 1 |
|  |  | USER_CODE |  | 1 |
| [4D] COMMAND_CLASS_NETWORK_MANAGEMENT_BASIC |  |  |  | 2 |
|  | [01] LEARN_MODE_SET |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | MODE |  | 1-2 |
|  |  |  | [00] LEARN_MODE_SET_DISABLE | 1-2 |
|  |  |  | [01] LEARN_MODE_SET_CLASSIC | 1-2 |
|  |  |  | [02] LEARN_MODE_SET_NWI | 1-2 |
|  | [02] LEARN_MODE_SET_STATUS |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [01] LEARN_MODE_FAILED_TIMEOUT | 1-2 |
|  |  |  | [06] LEARN_MODE_DONE | 1-2 |
|  |  |  | [07] LEARN_MODE_FAILED | 1-2 |
|  |  |  | [09] LEARN_MODE_SECURITY_FAILED | 1-2 |
|  |  | NEW_NODE_ID |  | 1-2 |
|  |  | GRANTED_KEYS |  | 2 |
|  |  | DSK |  | 2 |
|  | [03] NETWORK_UPDATE_REQUEST |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  | [04] NETWORK_UPDATE_REQUEST_STATUS |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [00] SUC_UPDATE_DONE | 1-2 |
|  |  |  | [01] SUC_UPDATE_ABORT | 1-2 |
|  |  |  | [02] SUC_UPDATE_WAIT | 1-2 |
|  |  |  | [03] SUC_UPDATE_DISABLED | 1-2 |
|  |  |  | [04] SUC_UPDATE_OVERFLOW | 1-2 |
|  | [05] NODE_INFORMATION_SEND |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | DESTINATION_NODE_ID |  | 1-2 |
|  |  | TX_OPTIONS |  | 1-2 |
|  |  |  | [01] ACK | 1-2 |
|  |  |  | [02] LOW_POWER | 1-2 |
|  |  |  | [04] AUTO_ROUTE | 1-2 |
|  |  |  | [10] NO_ROUTE | 1-2 |
|  |  |  | [20] EXPLORE | 1-2 |
|  |  |  | [40] NO_RETRANSMISSION | 1-2 |
|  |  |  | [80] HIGH_POWER | 1-2 |
|  | [06] DEFAULT_SET |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  | [07] DEFAULT_SET_COMPLETE |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [06] DEFAULT_SET_DONE | 1-2 |
|  |  |  | [07] DEFAULT_SET_BUSY | 1-2 |
|  | [08] DSK_GET |  |  | 2 |
|  |  | SEQ_NO |  | 2 |
|  | [09] DSK_REPORT |  |  | 2 |
|  |  | SEQ_NO |  | 2 |
|  |  | DSK |  | 2 |
| [4E] COMMAND_CLASS_SCHEDULE_ENTRY_LOCK |  |  |  | 3 |
|  | [01] SCHEDULE_ENTRY_LOCK_ENABLE_SET |  |  | 1-3 |
|  |  | USER_IDENTIFIER |  | 1-3 |
|  |  | ENABLED |  | 1-3 |
|  |  |  | [00] DISABLED | 1-3 |
|  |  |  | [01] ENABLED | 1-3 |
|  | [02] SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET |  |  | 1-3 |
|  |  | ENABLED |  | 1-3 |
|  |  |  | [00] DISABLED | 1-3 |
|  |  |  | [01] ENABLED | 1-3 |
|  | [03] SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET |  |  | 1-3 |
|  |  | SET_ACTION |  | 1-3 |
|  |  |  | [00] ERASE | 1-3 |
|  |  |  | [01] MODIFY | 1-3 |
|  |  | USER_IDENTIFIER |  | 1-3 |
|  |  | SCHEDULE_SLOT_ID |  | 1-3 |
|  |  | DAY_OF_WEEK |  | 1-3 |
|  |  | START_HOUR |  | 1-3 |
|  |  | START_MINUTE |  | 1-3 |
|  |  | STOP_HOUR |  | 1-3 |
|  |  | STOP_MINUTE |  | 1-3 |
|  | [04] SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET |  |  | 1-3 |
|  |  | USER_IDENTIFIER |  | 1-3 |
|  |  | SCHEDULE_SLOT_ID |  | 1-3 |
|  | [05] SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT |  |  | 1-3 |
|  |  | USER_IDENTIFIER |  | 1-3 |
|  |  | SCHEDULE_SLOT_ID |  | 1-3 |
|  |  | DAY_OF_WEEK |  | 1-3 |
|  |  | START_HOUR |  | 1-3 |
|  |  | START_MINUTE |  | 1-3 |
|  |  | STOP_HOUR |  | 1-3 |
|  |  | STOP_MINUTE |  | 1-3 |
|  | [06] SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET |  |  | 1-3 |
|  |  | SET_ACTION |  | 1-3 |
|  |  |  | [00] ERASE | 1-3 |
|  |  |  | [01] MODIFY | 1-3 |
|  |  | USER_IDENTIFIER |  | 1-3 |
|  |  | SCHEDULE_SLOT_ID |  | 1-3 |
|  |  | START_YEAR |  | 1-3 |
|  |  | START_MONTH |  | 1-3 |
|  |  | START_DAY |  | 1-3 |
|  |  | START_HOUR |  | 1-3 |
|  |  | START_MINUTE |  | 1-3 |
|  |  | STOP_YEAR |  | 1-3 |
|  |  | STOP_MONTH |  | 1-3 |
|  |  | STOP_DAY |  | 1-3 |
|  |  | STOP_HOUR |  | 1-3 |
|  |  | STOP_MINUTE |  | 1-3 |
|  | [07] SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET |  |  | 1-3 |
|  |  | USER_IDENTIFIER |  | 1-3 |
|  |  | SCHEDULE_SLOT_ID |  | 1-3 |
|  | [08] SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT |  |  | 1-3 |
|  |  | USER_IDENTIFIER |  | 1-3 |
|  |  | SCHEDULE_SLOT_ID |  | 1-3 |
|  |  | START_YEAR |  | 1-3 |
|  |  | START_MONTH |  | 1-3 |
|  |  | START_DAY |  | 1-3 |
|  |  | START_HOUR |  | 1-3 |
|  |  | START_MINUTE |  | 1-3 |
|  |  | STOP_YEAR |  | 1-3 |
|  |  | STOP_MONTH |  | 1-3 |
|  |  | STOP_DAY |  | 1-3 |
|  |  | STOP_HOUR |  | 1-3 |
|  |  | STOP_MINUTE |  | 1-3 |
|  | [09] SCHEDULE_ENTRY_TYPE_SUPPORTED_GET |  |  | 1-3 |
|  | [0A] SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | NUMBER_OF_SLOTS_WEEK_DAY |  | 1-3 |
|  |  | NUMBER_OF_SLOTS_YEAR_DAY |  | 1-3 |
|  |  | NUMBER_OF_SLOTS_DAILY_REPEATING |  | 3 |
|  | [0B] SCHEDULE_ENTRY_LOCK_TIME_OFFSET_GET |  |  | 2-3 |
|  | [0C] SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT |  |  | 2-3 |
|  |  | MINUTE_TZO |  | 2-3 |
|  | [0D] SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET |  |  | 2-3 |
|  |  | MINUTE_TZO |  | 2-3 |
|  | [0E] SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_GET |  |  | 3 |
|  |  | USER_IDENTIFIER |  | 3 |
|  |  | SCHEDULE_SLOT_ID |  | 3 |
|  | [0F] SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_REPORT |  |  | 3 |
|  |  | USER_IDENTIFIER |  | 3 |
|  |  | SCHEDULE_SLOT_ID |  | 3 |
|  |  | WEEK_DAY_BITMASK |  | 3 |
|  |  | START_HOUR |  | 3 |
|  |  | START_MINUTE |  | 3 |
|  |  | DURATION_HOUR |  | 3 |
|  |  | DURATION_MINUTE |  | 3 |
|  | [10] SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_SET |  |  | 3 |
|  |  | SET_ACTION |  | 3 |
|  |  |  | [00] ERASE | 3 |
|  |  |  | [01] MODIFY | 3 |
|  |  | USER_IDENTIFIER |  | 3 |
|  |  | SCHEDULE_SLOT_ID |  | 3 |
|  |  | WEEK_DAY_BITMASK |  | 3 |
|  |  | START_HOUR |  | 3 |
|  |  | START_MINUTE |  | 3 |
|  |  | DURATION_HOUR |  | 3 |
|  |  | DURATION_MINUTE |  | 3 |
| [4F] COMMAND_CLASS_ZIP_6LOWPAN |  |  |  | 1 |
|  | [C0] LOWPAN_FIRST_FRAGMENT |  |  | 1 |
|  |  | DATAGRAM_SIZE_2 |  | 1 |
|  |  | DATAGRAM_TAG |  | 1 |
|  |  | PAYLOAD |  | 1 |
|  | [E0] LOWPAN_SUBSEQUENT_FRAGMENT |  |  | 1 |
|  |  | DATAGRAM_SIZE_2 |  | 1 |
|  |  | DATAGRAM_TAG |  | 1 |
|  |  | DATAGRAM_OFFSET |  | 1 |
|  |  | PAYLOAD |  | 1 |
| [50] COMMAND_CLASS_BASIC_WINDOW_COVERING |  |  |  | 1 |
|  | [01] BASIC_WINDOW_COVERING_START_LEVEL_CHANGE |  |  | 1 |
|  | [02] BASIC_WINDOW_COVERING_STOP_LEVEL_CHANGE |  |  | 1 |
| [51] COMMAND_CLASS_MTP_WINDOW_COVERING |  |  |  | 1 |
|  | [01] MOVE_TO_POSITION_SET |  |  | 1 |
|  |  | VALUE |  | 1 |
|  |  |  | [00] CLOSE | 1 |
|  |  |  | [FF] OPEN | 1 |
|  | [02] MOVE_TO_POSITION_GET |  |  | 1 |
|  | [03] MOVE_TO_POSITION_REPORT |  |  | 1 |
|  |  | VALUE |  | 1 |
|  |  |  | [00] CLOSE | 1 |
|  |  |  | [FF] OPEN | 1 |
| [52] COMMAND_CLASS_NETWORK_MANAGEMENT_PROXY |  |  |  | 2 |
|  | [01] NODE_LIST_GET |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  | [02] NODE_LIST_REPORT |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | STATUS |  | 1-2 |
|  |  |  | [00] LATEST | 1-2 |
|  |  |  | [01] MAY_NOT_BE_THE_LATEST | 1-2 |
|  |  | NODE_LIST_CONTROLLER_ID |  | 1-2 |
|  |  | NODE_LIST_DATA |  | 1-2 |
|  | [03] NODE_INFO_CACHED_GET |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | NODE_ID |  | 1-2 |
|  | [04] NODE_INFO_CACHED_REPORT |  |  | 1-2 |
|  |  | SEQ_NO |  | 1-2 |
|  |  | GRANTED_KEYS |  | 2 |
|  |  | BASIC_DEVICE_CLASS |  | 1-2 |
|  |  | GENERIC_DEVICE_CLASS |  | 1-2 |
|  |  | SPECIFIC_DEVICE_CLASS |  | 1-2 |
|  |  | NON_SECURE_COMMAND_CLASS |  | 1-2 |
|  |  | SECURITY_SCHEME_0_MARK |  | 1-2 |
|  |  |  | [00] SECURITY_SCHEME_0_MARK | 1-2 |
|  |  |  | [F1] SECURITY_SCHEME_0_MARK | 1-2 |
|  |  | SECURITY_SCHEME_0_COMMAND_CLASS |  | 1-2 |
| [53] COMMAND_CLASS_SCHEDULE |  |  |  | 3 |
|  | [01] SCHEDULE_SUPPORTED_GET |  |  | 1-3 |
|  |  | SCHEDULE_ID_BLOCK |  | 2-3 |
|  | [02] SCHEDULE_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | NUMBER_OF_SUPPORTED_SCHEDULE_ID |  | 1-3 |
|  |  | NUMBER_OF_SUPPORTED_CC |  | 1-3 |
|  |  | COMMAND_CLASS_COMMAND |  | 1-3 |
|  |  | SCHEDULE_ID_BLOCK |  | 2-3 |
|  |  | NUMBER_OF_SUPPORTED_SCHEDULE_BLOCKS |  | 2-3 |
|  | [03] COMMAND_SCHEDULE_SET |  |  | 1-3 |
|  |  | SCHEDULE_ID |  | 1-3 |
|  |  | USER_IDENTIFIER |  | 1-3 |
|  |  | START_YEAR |  | 1-3 |
|  |  | DURATION_BYTE |  | 1-3 |
|  |  | REPORTS_TO_FOLLOW |  | 1-3 |
|  |  | NUMBER_OF_CMD_TO_FOLLOW |  | 1-3 |
|  |  | SCHEDULED_COMMAND |  | 1-3 |
|  | [04] COMMAND_SCHEDULE_GET |  |  | 1-3 |
|  |  | SCHEDULE_ID |  | 1-3 |
|  |  | SCHEDULE_ID_BLOCK |  | 2-3 |
|  | [05] COMMAND_SCHEDULE_REPORT |  |  | 1-3 |
|  |  | SCHEDULE_ID |  | 1-3 |
|  |  | USER_IDENTIFIER |  | 1-3 |
|  |  | START_YEAR |  | 1-3 |
|  |  | DURATION_BYTE |  | 1-3 |
|  |  | REPORTS_TO_FOLLOW |  | 1-3 |
|  |  | NUMBER_OF_CMD_TO_FOLLOW |  | 1-3 |
|  |  | SCHEDULED_COMMAND |  | 1-3 |
|  | [06] SCHEDULE_REMOVE |  |  | 1-3 |
|  |  | SCHEDULE_ID |  | 1-3 |
|  |  | SCHEDULE_ID_BLOCK |  | 2-3 |
|  | [07] SCHEDULE_STATE_SET |  |  | 1-3 |
|  |  | SCHEDULE_ID |  | 1-3 |
|  |  | SCHEDULE_STATE |  | 1-3 |
|  |  | SCHEDULE_ID_BLOCK |  | 2-3 |
|  | [08] SCHEDULE_STATE_GET |  |  | 1-3 |
|  |  | SCHEDULE_ID_BLOCK |  | 2-3 |
|  | [09] SCHEDULE_STATE_REPORT |  |  | 1-3 |
|  |  | NUMBER_OF_SUPPORTED_SCHEDULE_ID |  | 1-3 |
|  |  | SCHEDULE_ID_BLOCK |  | 2-3 |
| [54] COMMAND_CLASS_NETWORK_MANAGEMENT_PRIMARY |  |  |  | 1 |
|  | [01] CONTROLLER_CHANGE |  |  | 1 |
|  |  | SEQ_NO |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [02] CONTROLLER_CHANGE_START | 1 |
|  |  |  | [05] CONTROLLER_CHANGE_STOP | 1 |
|  |  | TX_OPTIONS |  | 1 |
|  |  |  | [01] ACK | 1 |
|  |  |  | [02] LOW_POWER | 1 |
|  |  |  | [04] AUTO_ROUTE | 1 |
|  |  |  | [10] NO_ROUTE | 1 |
|  |  |  | [20] EXPLORE | 1 |
|  |  |  | [40] NO_RETRANSMISSION | 1 |
|  |  |  | [80] HIGH_POWER | 1 |
|  | [02] CONTROLLER_CHANGE_STATUS |  |  | 1 |
|  |  | SEQ_NO |  | 1 |
|  |  | STATUS |  | 1 |
|  |  |  | [06] NODE_ADD_STATUS_DONE | 1 |
|  |  |  | [07] NODE_ADD_STATUS_FAILED | 1 |
|  |  |  | [09] NODE_ADD_STATUS_SECURITY_FAILED | 1 |
|  |  | NEW_NODE_ID |  | 1 |
|  |  | NODE_INFO_LENGTH |  | 1 |
|  |  | BASIC_DEVICE_CLASS |  | 1 |
|  |  | GENERIC_DEVICE_CLASS |  | 1 |
|  |  | SPECIFIC_DEVICE_CLASS |  | 1 |
|  |  | COMMAND_CLASS |  | 1 |
| [55] COMMAND_CLASS_TRANSPORT_SERVICE |  |  |  | 2 |
|  | [C0] COMMAND_FIRST_FRAGMENT |  |  | 1-2 |
|  |  | DATAGRAM_SIZE_2 |  | 1-2 |
|  |  | PAYLOAD |  | 1-2 |
|  |  | CHECKSUM |  | 1-2 |
|  |  | PAYLOAD |  | 2 |
|  |  | FRAME_CHECK_SEQUENCE |  | 2 |
|  | [C8] COMMAND_SEGMENT_REQUEST |  |  | 2 |
|  |  | DATAGRAM_OFFSET_2 |  | 2 |
|  | [E0] COMMAND_SUBSEQUENT_FRAGMENT |  |  | 1-2 |
|  |  | DATAGRAM_SIZE_2 |  | 1-2 |
|  |  | DATAGRAM_OFFSET_2 |  | 1-2 |
|  |  | PAYLOAD |  | 1-2 |
|  |  | CHECKSUM |  | 1-2 |
|  |  | PAYLOAD |  | 2 |
|  |  | FRAME_CHECK_SEQUENCE |  | 2 |
|  | [E8] COMMAND_SEGMENT_COMPLETE |  |  | 2 |
|  | [F0] COMMAND_SEGMENT_WAIT |  |  | 2 |
|  |  | PENDING_FRAGMENTS |  | 2 |
| [56] COMMAND_CLASS_CRC_16_ENCAP |  |  |  | 1 |
|  | [01] CRC_16_ENCAP |  |  | 1 |
|  |  | COMMAND_CLASS |  | 1 |
|  |  | COMMAND |  | 1 |
|  |  | DATA |  | 1 |
|  |  | CHECKSUM |  | 1 |
| [57] COMMAND_CLASS_APPLICATION_CAPABILITY |  |  |  | 1 |
|  | [01] COMMAND_COMMAND_CLASS_NOT_SUPPORTED |  |  | 1 |
|  |  | OFFENDING_COMMAND_CLASS |  | 1 |
|  |  | OFFENDING_COMMAND |  | 1 |
| [58] COMMAND_CLASS_ZIP_ND |  |  |  | 1 |
|  | [01] ZIP_NODE_ADVERTISEMENT |  |  | 1 |
|  |  | NODE_ID |  | 1 |
|  |  | IPV6_ADDRESS |  | 1 |
|  |  | HOME_ID |  | 1 |
|  | [03] ZIP_NODE_SOLICITATION |  |  | 1 |
|  |  | NODE_ID |  | 1 |
|  |  | IPV6_ADDRESS |  | 1 |
|  | [04] ZIP_INV_NODE_SOLICITATION |  |  | 1 |
|  |  | NODE_ID |  | 1 |
| [59] COMMAND_CLASS_ASSOCIATION_GRP_INFO |  |  |  | 3 |
|  | [01] ASSOCIATION_GROUP_NAME_GET |  |  | 1-3 |
|  |  | GROUPING_IDENTIFIER |  | 1-3 |
|  | [02] ASSOCIATION_GROUP_NAME_REPORT |  |  | 1-3 |
|  |  | GROUPING_IDENTIFIER |  | 1-3 |
|  |  | LENGTH_OF_NAME |  | 1-3 |
|  |  | NAME |  | 1-3 |
|  | [03] ASSOCIATION_GROUP_INFO_GET |  |  | 1-3 |
|  |  | GROUPING_IDENTIFIER |  | 1-3 |
|  | [04] ASSOCIATION_GROUP_INFO_REPORT |  |  | 1-3 |
|  |  | ASSOCIATION_GROUP_INFO |  | 1-3 |
|  | [05] ASSOCIATION_GROUP_COMMAND_LIST_GET |  |  | 1-3 |
|  |  | GROUPING_IDENTIFIER |  | 1-3 |
|  | [06] ASSOCIATION_GROUP_COMMAND_LIST_REPORT |  |  | 1-3 |
|  |  | GROUPING_IDENTIFIER |  | 1-3 |
|  |  | LIST_LENGTH |  | 1-3 |
|  |  | COMMAND |  | 1-3 |
| [5A] COMMAND_CLASS_DEVICE_RESET_LOCALLY |  |  |  | 1 |
|  | [01] DEVICE_RESET_LOCALLY_NOTIFICATION |  |  | 1 |
| [5B] COMMAND_CLASS_CENTRAL_SCENE |  |  |  | 3 |
|  | [01] CENTRAL_SCENE_SUPPORTED_GET |  |  | 1-3 |
|  | [02] CENTRAL_SCENE_SUPPORTED_REPORT |  |  | 1-3 |
|  |  | SUPPORTED_SCENES |  | 1-3 |
|  |  | SCENE_INFORMATION |  | 2-3 |
|  | [03] CENTRAL_SCENE_NOTIFICATION |  |  | 1-3 |
|  |  | SEQUENCE_NUMBER |  | 1-3 |
|  |  | SCENE_NUMBER |  | 1-3 |
|  | [04] CENTRAL_SCENE_CONFIGURATION_SET |  |  | 3 |
|  | [05] CENTRAL_SCENE_CONFIGURATION_GET |  |  | 3 |
|  | [06] CENTRAL_SCENE_CONFIGURATION_REPORT |  |  | 3 |
| [5C] COMMAND_CLASS_IP_ASSOCIATION |  |  |  | 1 |
|  | [01] IP_ASSOCIATION_SET |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
|  |  | IPV6_ADDRESS |  | 1 |
|  |  | END_POINT |  | 1 |
|  | [02] IP_ASSOCIATION_GET |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
|  |  | INDEX |  | 1 |
|  | [03] IP_ASSOCIATION_REPORT |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
|  |  | INDEX |  | 1 |
|  |  | ACTUAL_NODES |  | 1 |
|  |  | IPV6_ADDRESS |  | 1 |
|  |  | END_POINT |  | 1 |
|  | [04] IP_ASSOCIATION_REMOVE |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
|  |  | IPV6_ADDRESS |  | 1 |
|  |  | END_POINT |  | 1 |
| [5D] COMMAND_CLASS_ANTITHEFT |  |  |  | 2 |
|  | [01] ANTITHEFT_SET |  |  | 1-2 |
|  |  | MAGIC_CODE |  | 1-2 |
|  |  | MANUFACTURER_ID |  | 1-2 |
|  |  | ANTI_THEFT_HINT_NUMBER_BYTES |  | 1-2 |
|  |  | ANTI_THEFT_HINT_BYTE |  | 1-2 |
|  | [02] ANTITHEFT_GET |  |  | 1-2 |
|  | [03] ANTITHEFT_REPORT |  |  | 1-2 |
|  |  | ANTI_THEFT_PROTECTION_STATUS |  | 1-2 |
|  |  | MANUFACTURER_ID |  | 1-2 |
|  |  | ANTI_THEFT_HINT_NUMBER_BYTES |  | 1-2 |
|  |  | ANTI_THEFT_HINT_BYTE |  | 1-2 |
| [5E] COMMAND_CLASS_ZWAVEPLUS_INFO |  |  |  | 2 |
|  | [01] ZWAVEPLUS_INFO_GET |  |  | 1-2 |
|  | [02] ZWAVEPLUS_INFO_REPORT |  |  | 1-2 |
|  |  | Z_WAVE_PLUS_VERSION |  | 1-2 |
|  |  | ROLE_TYPE |  | 1-2 |
|  |  |  | [00] ROLE_TYPE_CONTROLLER_CENTRAL_STATIC | 1-2 |
|  |  |  | [01] ROLE_TYPE_CONTROLLER_SUB_STATIC | 1-2 |
|  |  |  | [02] ROLE_TYPE_CONTROLLER_PORTABLE | 1-2 |
|  |  |  | [03] ROLE_TYPE_CONTROLLER_PORTABLE_REPORTING | 1-2 |
|  |  |  | [04] ROLE_TYPE_SLAVE_PORTABLE | 1-2 |
|  |  |  | [05] ROLE_TYPE_SLAVE_ALWAYS_ON | 1-2 |
|  |  |  | [06] ROLE_TYPE_SLAVE_SLEEPING_REPORTING | 1-2 |
|  |  |  | [07] ROLE_TYPE_SLAVE_SLEEPING_LISTENING | 1-2 |
|  |  | NODE_TYPE |  | 1-2 |
|  |  |  | [00] NODE_TYPE_ZWAVEPLUS_NODE | 1-2 |
|  |  |  | [01] NODE_TYPE_ZWAVEPLUS_FOR_IP_ROUTER | 1 |
|  |  |  | [02] NODE_TYPE_ZWAVEPLUS_FOR_IP_GATEWAY | 1-2 |
|  |  |  | [03] NODE_TYPE_ZWAVEPLUS_FOR_IP_CLIENT_IP_NODE | 1 |
|  |  |  | [04] NODE_TYPE_ZWAVEPLUS_FOR_IP_CLIENT_ZWAVE_NODE | 1 |
|  |  | INSTALLER_ICON_TYPE |  | 2 |
|  |  | USER_ICON_TYPE |  | 2 |
| [5F] COMMAND_CLASS_ZIP_GATEWAY |  |  |  | 1 |
|  | [01] GATEWAY_MODE_SET |  |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [01] STAND_ALONE | 1 |
|  |  |  | [02] PORTAL | 1 |
|  | [02] GATEWAY_MODE_GET |  |  | 1 |
|  | [03] GATEWAY_MODE_REPORT |  |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [01] STAND_ALONE | 1 |
|  |  |  | [02] PORTAL | 1 |
|  | [04] GATEWAY_PEER_SET |  |  | 1 |
|  |  | PEER_PROFILE |  | 1 |
|  |  | IPV6_ADDRESS |  | 1 |
|  |  | PORT |  | 1 |
|  |  | PEER_NAME |  | 1 |
|  | [05] GATEWAY_PEER_GET |  |  | 1 |
|  |  | PEER_PROFILE |  | 1 |
|  | [06] GATEWAY_PEER_REPORT |  |  | 1 |
|  |  | PEER_PROFILE |  | 1 |
|  |  | PEER_COUNT |  | 1 |
|  |  | IPV6_ADDRESS |  | 1 |
|  |  | PORT |  | 1 |
|  |  | PEER_NAME |  | 1 |
|  | [07] GATEWAY_LOCK_SET |  |  | 1 |
|  | [08] UNSOLICITED_DESTINATION_SET |  |  | 1 |
|  |  | UNSOLICITED_IPV6_DESTINATION |  | 1 |
|  |  | UNSOLICITED_DESTINATION_PORT |  | 1 |
|  | [09] UNSOLICITED_DESTINATION_GET |  |  | 1 |
|  | [0A] UNSOLICITED_DESTINATION_REPORT |  |  | 1 |
|  |  | UNSOLICITED_IPV6_DESTINATION |  | 1 |
|  |  | UNSOLICITED_DESTINATION_PORT |  | 1 |
|  | [0B] COMMAND_APPLICATION_NODE_INFO_SET |  |  | 1 |
|  |  | NON_SECURE_COMMAND_CLASS |  | 1 |
|  |  | SECURITY_SCHEME_0_MARK |  | 1 |
|  |  |  | [00] SECURITY_SCHEME_0_MARK | 1 |
|  |  |  | [F1] SECURITY_SCHEME_0_MARK | 1 |
|  |  | SECURITY_SCHEME_0_COMMAND_CLASS |  | 1 |
|  | [0C] COMMAND_APPLICATION_NODE_INFO_GET |  |  | 1 |
|  | [0D] COMMAND_APPLICATION_NODE_INFO_REPORT |  |  | 1 |
|  |  | NON_SECURE_COMMAND_CLASS |  | 1 |
|  |  | SECURITY_SCHEME_0_MARK |  | 1 |
|  |  |  | [00] SECURITY_SCHEME_0_MARK | 1 |
|  |  |  | [F1] SECURITY_SCHEME_0_MARK | 1 |
|  |  | SECURITY_SCHEME_0_COMMAND_CLASS |  | 1 |
| [60] COMMAND_CLASS_MULTI_INSTANCE |  |  |  | 4 |
|  | [04] MULTI_INSTANCE_GET |  |  | 1-4 |
|  |  | COMMAND_CLASS |  | 1-4 |
|  | [05] MULTI_INSTANCE_REPORT |  |  | 1-4 |
|  |  | COMMAND_CLASS |  | 1-4 |
|  |  | INSTANCES |  | 1 |
|  | [06] MULTI_INSTANCE_CMD_ENCAP |  |  | 1-4 |
|  |  | INSTANCE |  | 1 |
|  |  | COMMAND_CLASS |  | 1-4 |
|  |  | COMMAND |  | 1-4 |
|  |  | PARAMETER |  | 1-4 |
|  | [07] MULTI_CHANNEL_END_POINT_GET |  |  | 2-4 |
|  | [08] MULTI_CHANNEL_END_POINT_REPORT |  |  | 2-4 |
|  | [09] MULTI_CHANNEL_CAPABILITY_GET |  |  | 2-4 |
|  | [0A] MULTI_CHANNEL_CAPABILITY_REPORT |  |  | 2-4 |
|  |  | GENERIC_DEVICE_CLASS |  | 2-4 |
|  |  | SPECIFIC_DEVICE_CLASS |  | 2-4 |
|  |  | COMMAND_CLASS |  | 2-4 |
|  | [0B] MULTI_CHANNEL_END_POINT_FIND |  |  | 2-4 |
|  |  | GENERIC_DEVICE_CLASS |  | 2-4 |
|  |  | SPECIFIC_DEVICE_CLASS |  | 2-4 |
|  | [0C] MULTI_CHANNEL_END_POINT_FIND_REPORT |  |  | 2-4 |
|  |  | REPORTS_TO_FOLLOW |  | 2-4 |
|  |  | GENERIC_DEVICE_CLASS |  | 2-4 |
|  |  | SPECIFIC_DEVICE_CLASS |  | 2-4 |
|  |  | ENDPOINT |  | 2-4 |
|  | [0D] MULTI_CHANNEL_CMD_ENCAP |  |  | 2-4 |
|  |  | COMMAND_CLASS |  | 2-4 |
|  |  | COMMAND |  | 2-4 |
|  |  | PARAMETER |  | 2-4 |
|  | [0E] MULTI_CHANNEL_AGGREGATED_MEMBERS_GET |  |  | 4 |
|  | [0F] MULTI_CHANNEL_AGGREGATED_MEMBERS_REPORT |  |  | 4 |
|  |  | NUMBER_OF_BIT_MASKS |  | 4 |
|  |  | AGGREGATED_MEMBERS_BIT_MASK |  | 4 |
| [61] COMMAND_CLASS_ZIP_PORTAL |  |  |  | 1 |
|  | [01] GATEWAY_CONFIGURATION_SET |  |  | 1 |
|  |  | LAN_IPV6_ADDRESS |  | 1 |
|  |  | LAN_IPV6_PREFIX_LENGTH |  | 1 |
|  |  | PORTAL_IPV6_PREFIX |  | 1 |
|  |  | PORTAL_IPV6_PREFIX_LENGTH |  | 1 |
|  |  | DEFAULT_GATEWAY_IPV6_ADDRESS |  | 1 |
|  |  | PAN_IPV6_PREFIX |  | 1 |
|  | [02] GATEWAY_CONFIGURATION_STATUS |  |  | 1 |
|  |  | STATUS |  | 1 |
|  | [03] GATEWAY_CONFIGURATION_GET |  |  | 1 |
|  | [04] GATEWAY_CONFIGURATION_REPORT |  |  | 1 |
|  |  | LAN_IPV6_ADDRESS |  | 1 |
|  |  | LAN_IPV6_PREFIX_LENGTH |  | 1 |
|  |  | PORTAL_IPV6_PREFIX |  | 1 |
|  |  | PORTAL_IPV6_PREFIX_LENGTH |  | 1 |
|  |  | DEFAULT_GATEWAY_IPV6_ADDRESS |  | 1 |
|  |  | PAN_IPV6_PREFIX |  | 1 |
| [62] COMMAND_CLASS_DOOR_LOCK |  |  |  | 3 |
|  | [01] DOOR_LOCK_OPERATION_SET |  |  | 1-3 |
|  |  | DOOR_LOCK_MODE |  | 1-3 |
|  |  |  | [00] DOOR_UNSECURED | 1-3 |
|  |  |  | [01] DOOR_UNSECURED_WITH_TIMEOUT | 1-3 |
|  |  |  | [10] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES | 1-3 |
|  |  |  | [11] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT | 1-3 |
|  |  |  | [20] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES | 1-3 |
|  |  |  | [21] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT | 1-3 |
|  |  |  | [FF] DOOR_SECURED | 1-3 |
|  | [02] DOOR_LOCK_OPERATION_GET |  |  | 1-3 |
|  | [03] DOOR_LOCK_OPERATION_REPORT |  |  | 1-3 |
|  |  | DOOR_LOCK_MODE |  | 1-3 |
|  |  |  | [00] DOOR_UNSECURED | 1-3 |
|  |  |  | [01] DOOR_UNSECURED_WITH_TIMEOUT | 1-3 |
|  |  |  | [10] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES | 1-3 |
|  |  |  | [11] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT | 1-3 |
|  |  |  | [20] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES | 1-3 |
|  |  |  | [21] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT | 1-3 |
|  |  |  | [FF] DOOR_SECURED | 1-3 |
|  |  | DOOR_CONDITION |  | 1-3 |
|  |  | LOCK_TIMEOUT_MINUTES |  | 1-3 |
|  |  | LOCK_TIMEOUT_SECONDS |  | 1-3 |
|  |  | TARGET_DOOR_LOCK_MODE |  | 3 |
|  |  |  | [00] DOOR_UNSECURED | 3 |
|  |  |  | [01] DOOR_UNSECURED_WITH_TIMEOUT | 3 |
|  |  |  | [10] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES | 3 |
|  |  |  | [11] DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT | 3 |
|  |  |  | [20] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES | 3 |
|  |  |  | [21] DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT | 3 |
|  |  |  | [FE] DOOR_LOCK_STATE_UNKNOWN | 3 |
|  |  |  | [FF] DOOR_SECURED | 3 |
|  |  | DURATION |  | 3 |
|  |  |  | [00] ALREADY_AT_THE_TARGET_VALUE | 3 |
|  |  |  | [FE] UNKNOWN_DURATION | 3 |
|  | [04] DOOR_LOCK_CONFIGURATION_SET |  |  | 1-3 |
|  |  | OPERATION_TYPE |  | 1-3 |
|  |  |  | [01] CONSTANT_OPERATION | 1-3 |
|  |  |  | [02] TIMED_OPERATION | 1-3 |
|  |  | LOCK_TIMEOUT_MINUTES |  | 1-3 |
|  |  | LOCK_TIMEOUT_SECONDS |  | 1-3 |
|  | [05] DOOR_LOCK_CONFIGURATION_GET |  |  | 1-3 |
|  | [06] DOOR_LOCK_CONFIGURATION_REPORT |  |  | 1-3 |
|  |  | OPERATION_TYPE |  | 1-3 |
|  |  |  | [01] CONSTANT_OPERATION | 1-3 |
|  |  |  | [02] TIMED_OPERATION | 1-3 |
|  |  | LOCK_TIMEOUT_MINUTES |  | 1-3 |
|  |  | LOCK_TIMEOUT_SECONDS |  | 1-3 |
| [63] COMMAND_CLASS_USER_CODE |  |  |  | 1 |
|  | [01] USER_CODE_SET |  |  | 1 |
|  |  | USER_IDENTIFIER |  | 1 |
|  |  | USER_ID_STATUS |  | 1 |
|  |  |  | [00] AVAILABLE | 1 |
|  |  |  | [01] OCCUPIED | 1 |
|  |  |  | [FE] STATUS_NOT_AVAILABLE | 1 |
|  |  | USER_CODE |  | 1 |
|  | [02] USER_CODE_GET |  |  | 1 |
|  |  | USER_IDENTIFIER |  | 1 |
|  | [03] USER_CODE_REPORT |  |  | 1 |
|  |  | USER_IDENTIFIER |  | 1 |
|  |  | USER_ID_STATUS |  | 1 |
|  |  |  | [00] AVAILABLE | 1 |
|  |  |  | [01] OCCUPIED | 1 |
|  |  |  | [FE] STATUS_NOT_AVAILABLE | 1 |
|  |  | USER_CODE |  | 1 |
|  | [04] USERS_NUMBER_GET |  |  | 1 |
|  | [05] USERS_NUMBER_REPORT |  |  | 1 |
|  |  | SUPPORTED_USERS |  | 1 |
| [64] COMMAND_CLASS_HUMIDITY_CONTROL_SETPOINT |  |  |  | 1 |
|  | [01] HUMIDITY_CONTROL_SETPOINT_SET |  |  | 1 |
|  |  | VALUE |  | 1 |
|  | [02] HUMIDITY_CONTROL_SETPOINT_GET |  |  | 1 |
|  | [03] HUMIDITY_CONTROL_SETPOINT_REPORT |  |  | 1 |
|  |  | VALUE |  | 1 |
|  | [04] HUMIDITY_CONTROL_SETPOINT_SUPPORTED_GET |  |  | 1 |
|  | [05] HUMIDITY_CONTROL_SETPOINT_SUPPORTED_REPORT |  |  | 1 |
|  |  | BIT_MASK |  | 1 |
|  |  |  | [01] HUMIDIFIER | 1 |
|  |  |  | [02] DEHUMIDIFIER | 1 |
|  | [06] HUMIDITY_CONTROL_SETPOINT_SCALE_SUPPORTED_GET |  |  | 1 |
|  | [07] HUMIDITY_CONTROL_SETPOINT_SCALE_SUPPORTED_REPORT |  |  | 1 |
|  | [08] HUMIDITY_CONTROL_SETPOINT_CAPABILITIES_GET |  |  | 1 |
|  | [09] HUMIDITY_CONTROL_SETPOINT_CAPABILITIES_REPORT |  |  | 1 |
|  |  | MINIMUM_VALUE |  | 1 |
|  |  | MAXIMUM_VALUE |  | 1 |
| [65] COMMAND_CLASS_DMX |  |  |  | 1 |
|  | [01] DMX_ADDRESS_SET |  |  | 1 |
|  |  | CHANNEL_ID |  | 1 |
|  | [02] DMX_ADDRESS_GET |  |  | 1 |
|  | [03] DMX_ADDRESS_REPORT |  |  | 1 |
|  |  | CHANNEL_ID |  | 1 |
|  | [04] DMX_CAPABILITY_GET |  |  | 1 |
|  |  | CHANNEL_ID |  | 1 |
|  | [05] DMX_CAPABILITY_REPORT |  |  | 1 |
|  |  | CHANNEL_ID |  | 1 |
|  |  | PROPERTY_ID |  | 1 |
|  |  | DEVICE_CHANNELS |  | 1 |
|  |  | MAX_CHANNELS |  | 1 |
|  | [06] DMX_DATA |  |  | 1 |
|  |  | SOURCE |  | 1 |
|  |  | DMX_CHANNEL |  | 1 |
| [66] COMMAND_CLASS_BARRIER_OPERATOR |  |  |  | 1 |
|  | [01] BARRIER_OPERATOR_SET |  |  | 1 |
|  |  | TARGET_VALUE |  | 1 |
|  |  |  | [00] CLOSE | 1 |
|  |  |  | [FF] OPEN | 1 |
|  | [02] BARRIER_OPERATOR_GET |  |  | 1 |
|  | [03] BARRIER_OPERATOR_REPORT |  |  | 1 |
|  |  | STATE |  | 1 |
|  |  |  | [00] CLOSED | 1 |
|  |  |  | [FC] CLOSING | 1 |
|  |  |  | [FD] STOPPED | 1 |
|  |  |  | [FE] OPENING | 1 |
|  |  |  | [FF] OPEN | 1 |
|  | [04] BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET |  |  | 1 |
|  | [05] BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT |  |  | 1 |
|  |  | BIT_MASK |  | 1 |
|  |  |  | [00] NOT_SUPPORTED | 1 |
|  |  |  | [01] AUDIBLE_NOTIFICATION | 1 |
|  |  |  | [02] VISUAL_NOTIFICATION | 1 |
|  | [06] BARRIER_OPERATOR_SIGNAL_SET |  |  | 1 |
|  |  | SUBSYSTEM_TYPE |  | 1 |
|  |  |  | [00] NOT_SUPPORTED | 1 |
|  |  |  | [01] AUDIBLE_NOTIFICATION | 1 |
|  |  |  | [02] VISUAL_NOTIFICATION | 1 |
|  |  | SUBSYSTEM_STATE |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
|  | [07] BARRIER_OPERATOR_SIGNAL_GET |  |  | 1 |
|  |  | SUBSYSTEM_TYPE |  | 1 |
|  |  |  | [00] NOT_SUPPORTED | 1 |
|  |  |  | [01] AUDIBLE_NOTIFICATION | 1 |
|  |  |  | [02] VISUAL_NOTIFICATION | 1 |
|  | [08] BARRIER_OPERATOR_SIGNAL_REPORT |  |  | 1 |
|  |  | SUBSYSTEM_TYPE |  | 1 |
|  |  |  | [00] NOT_SUPPORTED | 1 |
|  |  |  | [01] AUDIBLE_NOTIFICATION | 1 |
|  |  |  | [02] VISUAL_NOTIFICATION | 1 |
|  |  | SUBSYSTEM_STATE |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [FF] ON | 1 |
| [67] COMMAND_CLASS_NETWORK_MANAGEMENT_INSTALLATION_MAINTENANCE |  |  |  | 1 |
|  | [01] LAST_WORKING_ROUTE_SET |  |  | 1 |
|  |  | NODEID |  | 1 |
|  |  | REPEATER_1 |  | 1 |
|  |  | REPEATER_2 |  | 1 |
|  |  | REPEATER_3 |  | 1 |
|  |  | REPEATER_4 |  | 1 |
|  |  | SPEED |  | 1 |
|  |  |  | [01] 9_6_KBIT_SEC | 1 |
|  |  |  | [02] 40_KBIT_SEC | 1 |
|  |  |  | [03] 100_KBIT_SEC | 1 |
|  | [02] LAST_WORKING_ROUTE_GET |  |  | 1 |
|  |  | NODEID |  | 1 |
|  | [03] LAST_WORKING_ROUTE_REPORT |  |  | 1 |
|  |  | NODEID |  | 1 |
|  |  | REPEATER_1 |  | 1 |
|  |  | REPEATER_2 |  | 1 |
|  |  | REPEATER_3 |  | 1 |
|  |  | REPEATER_4 |  | 1 |
|  |  | SPEED |  | 1 |
|  |  |  | [01] 9_6_KBIT_SEC | 1 |
|  |  |  | [02] 40_KBIT_SEC | 1 |
|  |  |  | [03] 100_KBIT_SEC | 1 |
|  | [04] STATISTICS_GET |  |  | 1 |
|  |  | NODEID |  | 1 |
|  | [05] STATISTICS_REPORT |  |  | 1 |
|  |  | NODEID |  | 1 |
|  |  | STATISTICS |  | 1 |
|  | [06] STATISTICS_CLEAR |  |  | 1 |
| [68] COMMAND_CLASS_ZIP_NAMING |  |  |  | 1 |
|  | [01] ZIP_NAMING_NAME_SET |  |  | 1 |
|  |  | NAME |  | 1 |
|  | [02] ZIP_NAMING_NAME_GET |  |  | 1 |
|  | [03] ZIP_NAMING_NAME_REPORT |  |  | 1 |
|  |  | NAME |  | 1 |
|  | [04] ZIP_NAMING_LOCATION_SET |  |  | 1 |
|  |  | LOCATION |  | 1 |
|  | [05] ZIP_NAMING_LOCATION_GET |  |  | 1 |
|  | [06] ZIP_NAMING_LOCATION_REPORT |  |  | 1 |
|  |  | LOCATION |  | 1 |
| [69] COMMAND_CLASS_MAILBOX |  |  |  | 1 |
|  | [01] MAILBOX_CONFIGURATION_GET |  |  | 1 |
|  | [02] MAILBOX_CONFIGURATION_SET |  |  | 1 |
|  |  | FORWARDING_DESTINATION_IPV6_ADDRESS |  | 1 |
|  |  | UDP_PORT_NUMBER |  | 1 |
|  | [03] MAILBOX_CONFIGURATION_REPORT |  |  | 1 |
|  |  | MAILBOX_CAPACITY |  | 1 |
|  |  | FORWARDING_DESTINATION_IPV6_ADDRESS |  | 1 |
|  |  | UDP_PORT_NUMBER |  | 1 |
|  | [04] MAILBOX_QUEUE |  |  | 1 |
|  |  | SEQUENCE_NUMBER |  | 1 |
|  |  | QUEUE_HANDLE |  | 1 |
|  |  | MAILBOX_ENTRY |  | 1 |
|  | [05] MAILBOX_WAKEUP_NOTIFICATION |  |  | 1 |
|  |  | QUEUE_HANDLE |  | 1 |
|  | [06] MAILBOX_NODE_FAILING |  |  | 1 |
|  |  | QUEUE_HANDLE |  | 1 |
| [6A] COMMAND_CLASS_WINDOW_COVERING |  |  |  | 1 |
|  | [01] WINDOW_COVERING_SUPPORTED_GET |  |  | 1 |
|  | [02] WINDOW_COVERING_SUPPORTED_REPORT |  |  | 1 |
|  |  | PARAMETER_MASK |  | 1 |
|  | [03] WINDOW_COVERING_GET |  |  | 1 |
|  |  | PARAMETER_ID |  | 1 |
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
|  |  | PARAMETER_ID |  | 1 |
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
|  |  | CURRENT_VALUE |  | 1 |
|  |  | TARGET_VALUE |  | 1-1, 1 |
|  | [05] WINDOW_COVERING_SET |  |  | 1 |
|  |  | WINDOW_COVERING |  | 1 |
|  |  | DURATION |  | 1 |
|  | [06] WINDOW_COVERING_START_LEVEL_CHANGE |  |  | 1 |
|  |  | PARAMETER_ID |  | 1 |
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
|  |  | DURATION |  | 1 |
|  | [07] WINDOW_COVERING_STOP_LEVEL_CHANGE |  |  | 1 |
|  |  | PARAMETER_ID |  | 1 |
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
|  |  | TOTAL_NUMBER_OF_VALVES |  | 1 |
|  |  | TOTAL_NUMBER_OF_VALVE_TABLES |  | 1 |
|  | [03] IRRIGATION_SYSTEM_STATUS_GET |  |  | 1 |
|  | [04] IRRIGATION_SYSTEM_STATUS_REPORT |  |  | 1 |
|  |  | SYSTEM_VOLTAGE |  | 1 |
|  |  | SENSOR_STATUS |  | 1 |
|  |  |  | [00] FLOW_SENSOR_DETECTED | 1 |
|  |  |  | [01] PRESSURE_SENSOR_DETECTED | 1 |
|  |  |  | [02] RAIN_SENSOR_DETECTED | 1 |
|  |  |  | [03] MOISTURE_SENSOR_DETECTED | 1 |
|  |  | FLOW_VALUE |  | 1 |
|  |  | PRESSURE_VALUE |  | 1 |
|  |  | SHUTOFF_DURATION |  | 1 |
|  |  | SYSTEM_ERROR_STATUS |  | 1 |
|  |  |  | [00] NOT_PROGRAMMED | 1 |
|  |  |  | [01] EMERGENCY_SHUTDOWN | 1 |
|  |  |  | [02] HIGH_THRESHOLD_TRIGGERED | 1 |
|  |  |  | [03] LOW_THRESHOLD_TRIGGERED | 1 |
|  |  |  | [04] VALVE_ERRORS | 1 |
|  |  | VALVE_ID |  | 1 |
|  | [05] IRRIGATION_SYSTEM_CONFIG_SET |  |  | 1 |
|  |  | MASTER_VALVE_DELAY |  | 1 |
|  |  | HIGH_PRESSURE_THRESHOLD_VALUE |  | 1 |
|  |  | LOW_PRESSURE_THRESHOLD_VALUE |  | 1 |
|  |  | SENSOR_POLARITY |  | 1 |
|  |  |  | [00] RAIN_SENSOR_POLARITY | 1 |
|  |  |  | [01] MOISTURE_SENSOR_POLARITY | 1 |
|  |  |  | [07] VALID | 1 |
|  | [06] IRRIGATION_SYSTEM_CONFIG_GET |  |  | 1 |
|  | [07] IRRIGATION_SYSTEM_CONFIG_REPORT |  |  | 1 |
|  |  | MASTER_VALVE_DELAY |  | 1 |
|  |  | HIGH_PRESSURE_THRESHOLD_VALUE |  | 1 |
|  |  | LOW_PRESSURE_THRESHOLD_VALUE |  | 1 |
|  |  | SENSOR_POLARITY |  | 1 |
|  |  |  | [00] RAIN_SENSOR_POLARITY | 1 |
|  |  |  | [01] MOISTURE_SENSOR_POLARITY | 1 |
|  |  |  | [07] VALID | 1 |
|  | [08] IRRIGATION_VALVE_INFO_GET |  |  | 1 |
|  |  | VALVE_ID |  | 1 |
|  | [09] IRRIGATION_VALVE_INFO_REPORT |  |  | 1 |
|  |  | VALVE_ID |  | 1 |
|  |  | NOMINAL_CURRENT |  | 1 |
|  |  | VALVE_ERROR_STATUS |  | 1 |
|  |  |  | [00] SHORT_CIRCUIT | 1 |
|  |  |  | [01] CURRENT_HIGH_THRESHOLD | 1 |
|  |  |  | [02] CURRENT_LOW_THRESHOLD | 1 |
|  |  |  | [03] MAXIMUM_FLOW | 1 |
|  |  |  | [04] FLOW_HIGH_THRESHOLD | 1 |
|  |  |  | [05] FLOW_LOW_THRESHOLD | 1 |
|  | [0A] IRRIGATION_VALVE_CONFIG_SET |  |  | 1 |
|  |  | VALVE_ID |  | 1 |
|  |  | NOMINAL_CURRENT_HIGH_THRESHOLD |  | 1 |
|  |  | NOMINAL_CURRENT_LOW_THRESHOLD |  | 1 |
|  |  | MAXIMUM_FLOW_VALUE |  | 1 |
|  |  | FLOW_HIGH_THRESHOLD_VALUE |  | 1 |
|  |  | FLOW_LOW_THRESHOLD_VALUE |  | 1 |
|  |  | SENSOR_USAGE |  | 1 |
|  |  |  | [00] USE_RAIN_SENSOR | 1 |
|  |  |  | [01] USE_MOISTURE_SENSOR | 1 |
|  | [0B] IRRIGATION_VALVE_CONFIG_GET |  |  | 1 |
|  |  | VALVE_ID |  | 1 |
|  | [0C] IRRIGATION_VALVE_CONFIG_REPORT |  |  | 1 |
|  |  | VALVE_ID |  | 1 |
|  |  | NOMINAL_CURRENT_HIGH_THRESHOLD |  | 1 |
|  |  | NOMINAL_CURRENT_LOW_THRESHOLD |  | 1 |
|  |  | MAXIMUM_FLOW_VALUE |  | 1 |
|  |  | FLOW_HIGH_THRESHOLD_VALUE |  | 1 |
|  |  | FLOW_LOW_THRESHOLD_VALUE |  | 1 |
|  |  | SENSOR_USAGE |  | 1 |
|  |  |  | [00] USE_RAIN_SENSOR | 1 |
|  |  |  | [01] USE_MOISTURE_SENSOR | 1 |
|  | [0D] IRRIGATION_VALVE_RUN |  |  | 1 |
|  |  | VALVE_ID |  | 1 |
|  |  | DURATION |  | 1 |
|  | [0E] IRRIGATION_VALVE_TABLE_SET |  |  | 1 |
|  |  | VALVE_TABLE_ID |  | 1 |
|  |  | IRRIGATION_VALVE |  | 1 |
|  | [0F] IRRIGATION_VALVE_TABLE_GET |  |  | 1 |
|  |  | VALVE_TABLE_ID |  | 1 |
|  | [10] IRRIGATION_VALVE_TABLE_REPORT |  |  | 1 |
|  |  | VALVE_TABLE_ID |  | 1 |
|  |  | IRRIGATION_VALVE |  | 1 |
|  | [11] IRRIGATION_VALVE_TABLE_RUN |  |  | 1 |
|  |  | VALVE_TABLE_ID |  | 1 |
|  | [12] IRRIGATION_SYSTEM_SHUTOFF |  |  | 1 |
|  |  | DURATION |  | 1 |
| [6C] COMMAND_CLASS_SUPERVISION |  |  |  | 1 |
|  | [01] SUPERVISION_GET |  |  | 1 |
|  |  | ENCAPSULATED_COMMAND_LENGTH |  | 1 |
|  |  | ENCAPSULATED_COMMAND |  | 1 |
|  | [02] SUPERVISION_REPORT |  |  | 1 |
|  |  | STATUS |  | 1 |
|  |  |  | [00] NO_SUPPORT | 1 |
|  |  |  | [01] WORKING | 1 |
|  |  |  | [02] FAIL | 1 |
|  |  |  | [03] BUSY | 1 |
|  |  |  | [FF] SUCCESS | 1 |
|  |  | DURATION |  | 1 |
| [6D] COMMAND_CLASS_HUMIDITY_CONTROL_MODE |  |  |  | 1 |
|  | [01] HUMIDITY_CONTROL_MODE_SET |  |  | 1 |
|  | [02] HUMIDITY_CONTROL_MODE_GET |  |  | 1 |
|  | [03] HUMIDITY_CONTROL_MODE_REPORT |  |  | 1 |
|  | [04] HUMIDITY_CONTROL_MODE_SUPPORTED_GET |  |  | 1 |
|  | [05] HUMIDITY_CONTROL_MODE_SUPPORTED_REPORT |  |  | 1 |
|  |  | BIT_MASK |  | 1 |
|  |  |  | [00] OFF | 1 |
|  |  |  | [01] HUMIDIFY | 1 |
|  |  |  | [02] DEHUMIDIFY | 1 |
| [6E] COMMAND_CLASS_HUMIDITY_CONTROL_OPERATING_STATE |  |  |  | 1 |
|  | [01] HUMIDITY_CONTROL_OPERATING_STATE_GET |  |  | 1 |
|  | [02] HUMIDITY_CONTROL_OPERATING_STATE_REPORT |  |  | 1 |
| [6F] COMMAND_CLASS_ENTRY_CONTROL |  |  |  | 1 |
|  | [01] ENTRY_CONTROL_NOTIFICATION |  |  | 1 |
|  |  | SEQUENCE_NUMBER |  | 1 |
|  |  | EVENT_TYPE |  | 1 |
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
|  |  | EVENT_DATA_LENGTH |  | 1 |
|  |  | EVENT_DATA |  | 1 |
|  | [02] ENTRY_CONTROL_KEY_SUPPORTED_GET |  |  | 1 |
|  | [03] ENTRY_CONTROL_KEY_SUPPORTED_REPORT |  |  | 1 |
|  |  | KEY_SUPPORTED_BIT_MASK_LENGTH |  | 1 |
|  |  | KEY_SUPPORTED_BIT_MASK |  | 1 |
|  | [04] ENTRY_CONTROL_EVENT_SUPPORTED_GET |  |  | 1 |
|  | [05] ENTRY_CONTROL_EVENT_SUPPORTED_REPORT |  |  | 1 |
|  |  | DATA_TYPE_SUPPORTED_BIT_MASK |  | 1 |
|  |  |  | [00] NA | 1 |
|  |  |  | [01] RAW | 1 |
|  |  |  | [02] ASCII | 1 |
|  |  |  | [03] MD5 | 1 |
|  |  | EVENT_TYPE_SUPPORTED_BIT_MASK |  | 1 |
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
|  |  | KEY_CACHED_SIZE_SUPPORTED_MINIMUM |  | 1 |
|  |  | KEY_CACHED_SIZE_SUPPORTED_MAXIMUM |  | 1 |
|  |  | KEY_CACHED_TIMEOUT_SUPPORTED_MINIMUM |  | 1 |
|  |  | KEY_CACHED_TIMEOUT_SUPPORTED_MAXIMUM |  | 1 |
|  | [06] ENTRY_CONTROL_CONFIGURATION_SET |  |  | 1 |
|  |  | KEY_CACHE_SIZE |  | 1 |
|  |  | KEY_CACHE_TIMEOUT |  | 1 |
|  | [07] ENTRY_CONTROL_CONFIGURATION_GET |  |  | 1 |
|  | [08] ENTRY_CONTROL_CONFIGURATION_REPORT |  |  | 1 |
|  |  | KEY_CACHE_SIZE |  | 1 |
|  |  | KEY_CACHE_TIMEOUT |  | 1 |
| [70] COMMAND_CLASS_CONFIGURATION |  |  |  | 4 |
|  | [01] CONFIGURATION_DEFAULT_RESET |  |  | 4 |
|  | [04] CONFIGURATION_SET |  |  | 1-4 |
|  |  | PARAMETER_NUMBER |  | 1-4 |
|  |  | CONFIGURATION_VALUE |  | 1-4 |
|  | [05] CONFIGURATION_GET |  |  | 1-4 |
|  |  | PARAMETER_NUMBER |  | 1-4 |
|  | [06] CONFIGURATION_REPORT |  |  | 1-4 |
|  |  | PARAMETER_NUMBER |  | 1-4 |
|  |  | CONFIGURATION_VALUE |  | 1-4 |
|  | [07] CONFIGURATION_BULK_SET |  |  | 2-4 |
|  |  | PARAMETER_OFFSET |  | 2-4 |
|  |  | NUMBER_OF_PARAMETERS |  | 2-4 |
|  |  | CONFIGURATION_PARAMETER |  | 2-4 |
|  | [08] CONFIGURATION_BULK_GET |  |  | 2-4 |
|  |  | PARAMETER_OFFSET |  | 2-4 |
|  |  | NUMBER_OF_PARAMETERS |  | 2-4 |
|  | [09] CONFIGURATION_BULK_REPORT |  |  | 2-4 |
|  |  | PARAMETER_OFFSET |  | 2-4 |
|  |  | NUMBER_OF_PARAMETERS |  | 2-4 |
|  |  | REPORTS_TO_FOLLOW |  | 2-4 |
|  |  | CONFIGURATION_PARAMETER |  | 2-4 |
|  | [0A] CONFIGURATION_NAME_GET |  |  | 3-4 |
|  |  | PARAMETER_NUMBER |  | 3-4 |
|  | [0B] CONFIGURATION_NAME_REPORT |  |  | 3-4 |
|  |  | PARAMETER_NUMBER |  | 3-4 |
|  |  | REPORTS_TO_FOLLOW |  | 3-4 |
|  |  | NAME |  | 3-4 |
|  | [0C] CONFIGURATION_INFO_GET |  |  | 3-4 |
|  |  | PARAMETER_NUMBER |  | 3-4 |
|  | [0D] CONFIGURATION_INFO_REPORT |  |  | 3-4 |
|  |  | PARAMETER_NUMBER |  | 3-4 |
|  |  | REPORTS_TO_FOLLOW |  | 3-4 |
|  |  | INFO |  | 3-4 |
|  | [0E] CONFIGURATION_PROPERTIES_GET |  |  | 3-4 |
|  |  | PARAMETER_NUMBER |  | 3-4 |
|  | [0F] CONFIGURATION_PROPERTIES_REPORT |  |  | 3-4 |
|  |  | PARAMETER_NUMBER |  | 3-4 |
|  |  | MIN_VALUE |  | 3-4 |
|  |  | MAX_VALUE |  | 3-4 |
|  |  | DEFAULT_VALUE |  | 3-4 |
|  |  | NEXT_PARAMETER_NUMBER |  | 3-4 |
| [71] COMMAND_CLASS_ALARM |  |  |  | 8 |
|  | [01] EVENT_SUPPORTED_GET |  |  | 3-8 |
|  |  | NOTIFICATION_TYPE |  | 3-8 |
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
|  | [02] EVENT_SUPPORTED_REPORT |  |  | 3-8 |
|  |  | NOTIFICATION_TYPE |  | 3-8 |
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
|  |  | BIT_MASK |  | 3-8 |
|  | [04] ALARM_GET |  |  | 1-8 |
|  |  | V1_ALARM_TYPE |  | 1-8 |
|  |  | ZWAVE_ALARM_TYPE |  | 2-8 |
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
|  |  | EVENT |  | 3-8 |
|  | [05] ALARM_REPORT |  |  | 1-8 |
|  |  | V1_ALARM_TYPE |  | 1-8 |
|  |  | V1_ALARM_LEVEL |  | 1-8 |
|  |  | ZENSOR_NET_SOURCE_NODE_ID |  | 2 |
|  |  | ZWAVE_ALARM_STATUS |  | 2-8 |
|  |  |  | [00] OFF | 2-8 |
|  |  |  | [FF] ON | 2-8 |
|  |  | ZWAVE_ALARM_TYPE |  | 2-8 |
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
|  |  | ZWAVE_ALARM_EVENT |  | 2-8 |
|  |  | NUMBER_OF_EVENT_PARAMETERS |  | 2 |
|  |  | EVENT_PARAMETER |  | 2-8 |
|  |  | SEQUENCE_NUMBER |  | 3-8 |
|  | [06] ALARM_SET |  |  | 2-8 |
|  |  | ZWAVE_ALARM_TYPE |  | 2-8 |
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
|  |  | ZWAVE_ALARM_STATUS |  | 2-8 |
|  |  |  | [00] OFF | 2-8 |
|  |  |  | [FF] ON | 2-8 |
|  | [07] ALARM_TYPE_SUPPORTED_GET |  |  | 2-8 |
|  | [08] ALARM_TYPE_SUPPORTED_REPORT |  |  | 2-8 |
|  |  | BIT_MASK |  | 2-8 |
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
| [72] COMMAND_CLASS_MANUFACTURER_SPECIFIC |  |  |  | 2 |
|  | [04] MANUFACTURER_SPECIFIC_GET |  |  | 1-2 |
|  | [05] MANUFACTURER_SPECIFIC_REPORT |  |  | 1-2 |
|  |  | MANUFACTURER_ID |  | 1-2 |
|  |  | PRODUCT_TYPE_ID |  | 1-2 |
|  |  | PRODUCT_ID |  | 1-2 |
|  | [06] DEVICE_SPECIFIC_GET |  |  | 2 |
|  | [07] DEVICE_SPECIFIC_REPORT |  |  | 2 |
|  |  | DEVICE_ID_DATA |  | 2 |
| [73] COMMAND_CLASS_POWERLEVEL |  |  |  | 1 |
|  | [01] POWERLEVEL_SET |  |  | 1 |
|  |  | POWER_LEVEL |  | 1 |
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
|  |  | TIMEOUT |  | 1 |
|  | [02] POWERLEVEL_GET |  |  | 1 |
|  | [03] POWERLEVEL_REPORT |  |  | 1 |
|  |  | POWER_LEVEL |  | 1 |
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
|  |  | TIMEOUT |  | 1 |
|  | [04] POWERLEVEL_TEST_NODE_SET |  |  | 1 |
|  |  | TEST_NODEID |  | 1 |
|  |  | POWER_LEVEL |  | 1 |
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
|  |  | TEST_FRAME_COUNT |  | 1 |
|  | [05] POWERLEVEL_TEST_NODE_GET |  |  | 1 |
|  | [06] POWERLEVEL_TEST_NODE_REPORT |  |  | 1 |
|  |  | TEST_NODEID |  | 1 |
|  |  |  | [00] ZW_TEST_NOT_A_NODEID | 1 |
|  |  | STATUS_OF_OPERATION |  | 1 |
|  |  |  | [00] ZW_TEST_FAILED | 1 |
|  |  |  | [01] ZW_TEST_SUCCES | 1 |
|  |  |  | [02] ZW_TEST_INPROGRESS | 1 |
|  |  | TEST_FRAME_COUNT |  | 1 |
| [74] COMMAND_CLASS_INCLUSION_CONTROLLER |  |  |  | 1 |
|  | [01] INITIATE |  |  | 1 |
|  |  | NODE_ID |  | 1 |
|  |  | STEP_ID |  | 1 |
|  |  |  | [01] PROXY_INCLUSION | 1 |
|  |  |  | [02] S0_INCLUSION | 1 |
|  | [02] COMPLETE |  |  | 1 |
|  |  | STEP_ID |  | 1 |
|  |  |  | [01] PROXY_INCLUSION | 1 |
|  |  |  | [02] S0_INCLUSION | 1 |
|  |  | STATUS |  | 1 |
|  |  |  | [01] STEP_OK | 1 |
|  |  |  | [02] STEP_USER_REJECTED | 1 |
|  |  |  | [03] STEP_FAILED | 1 |
|  |  |  | [04] STEP_NOT_SUPPORTED | 1 |
| [75] COMMAND_CLASS_PROTECTION |  |  |  | 2 |
|  | [01] PROTECTION_SET |  |  | 1-2 |
|  |  | LOCAL_PROTECTION_STATE |  | 1 |
|  |  |  | [00] UNPROTECTED | 1 |
|  |  |  | [01] PROTECTION_BY_SEQUENCE | 1 |
|  |  |  | [02] NO_OPERATION_POSSIBLE | 1 |
|  | [02] PROTECTION_GET |  |  | 1-2 |
|  | [03] PROTECTION_REPORT |  |  | 1-2 |
|  |  | LOCAL_PROTECTION_STATE |  | 1 |
|  |  |  | [00] UNPROTECTED | 1 |
|  |  |  | [01] PROTECTION_BY_SEQUENCE | 1 |
|  |  |  | [02] NO_OPERATION_POSSIBLE | 1 |
|  | [04] PROTECTION_SUPPORTED_GET |  |  | 2 |
|  | [05] PROTECTION_SUPPORTED_REPORT |  |  | 2 |
|  |  | LOCAL_PROTECTION_STATE |  | 2 |
|  |  | RF_PROTECTION_STATE |  | 2 |
|  | [06] PROTECTION_EC_SET |  |  | 2 |
|  |  | NODE_ID |  | 2 |
|  | [07] PROTECTION_EC_GET |  |  | 2 |
|  | [08] PROTECTION_EC_REPORT |  |  | 2 |
|  |  | NODE_ID |  | 2 |
|  | [09] PROTECTION_TIMEOUT_SET |  |  | 2 |
|  |  | TIMEOUT |  | 2 |
|  |  |  | [00] NO_TIMER_IS_SET | 2 |
|  |  |  | [FF] NO_TIMEOUT | 2 |
|  | [0A] PROTECTION_TIMEOUT_GET |  |  | 2 |
|  | [0B] PROTECTION_TIMEOUT_REPORT |  |  | 2 |
|  |  | TIMEOUT |  | 2 |
|  |  |  | [00] NO_TIMER_IS_SET | 2 |
|  |  |  | [FF] NO_TIMEOUT_IS_SET | 2 |
| [76] COMMAND_CLASS_LOCK |  |  |  | 1 |
|  | [01] LOCK_SET |  |  | 1 |
|  |  | LOCK_STATE |  | 1 |
|  |  |  | [00] UNLOCKED | 1 |
|  |  |  | [01] LOCKED | 1 |
|  | [02] LOCK_GET |  |  | 1 |
|  | [03] LOCK_REPORT |  |  | 1 |
|  |  | LOCK_STATE |  | 1 |
|  |  |  | [00] UNLOCKED | 1 |
|  |  |  | [01] LOCKED | 1 |
| [77] COMMAND_CLASS_NODE_NAMING |  |  |  | 1 |
|  | [01] NODE_NAMING_NODE_NAME_SET |  |  | 1 |
|  |  | NODE_NAME_CHAR |  | 1 |
|  | [02] NODE_NAMING_NODE_NAME_GET |  |  | 1 |
|  | [03] NODE_NAMING_NODE_NAME_REPORT |  |  | 1 |
|  |  | NODE_NAME_CHAR |  | 1 |
|  | [04] NODE_NAMING_NODE_LOCATION_SET |  |  | 1 |
|  |  | NODE_LOCATION_CHAR |  | 1 |
|  | [05] NODE_NAMING_NODE_LOCATION_GET |  |  | 1 |
|  | [06] NODE_NAMING_NODE_LOCATION_REPORT |  |  | 1 |
|  |  | NODE_LOCATION_CHAR |  | 1 |
| [7A] COMMAND_CLASS_FIRMWARE_UPDATE_MD |  |  |  | 5 |
|  | [01] FIRMWARE_MD_GET |  |  | 1-5 |
|  | [02] FIRMWARE_MD_REPORT |  |  | 1-5 |
|  |  | MANUFACTURER_ID |  | 1-5 |
|  |  | FIRMWARE_0_ID |  | 1-5 |
|  |  | FIRMWARE_0_CHECKSUM |  | 1-5 |
|  |  | FIRMWARE_UPGRADABLE |  | 3-5 |
|  |  | NUMBER_OF_FIRMWARE_TARGETS |  | 3-5 |
|  |  | MAX_FRAGMENT_SIZE |  | 3-5 |
|  |  | FIRMWARE_REPORT |  | 3-5 |
|  |  | HARDWARE_VERSION |  | 5 |
|  | [03] FIRMWARE_UPDATE_MD_REQUEST_GET |  |  | 1-5 |
|  |  | MANUFACTURER_ID |  | 1-5 |
|  |  | FIRMWARE_ID |  | 1-5 |
|  |  | CHECKSUM |  | 1-5 |
|  |  | FIRMWARE_TARGET |  | 3-5 |
|  |  | FRAGMENT_SIZE |  | 3-5 |
|  |  | HARDWARE_VERSION |  | 5 |
|  | [04] FIRMWARE_UPDATE_MD_REQUEST_REPORT |  |  | 1-5 |
|  |  | STATUS |  | 1-5 |
|  |  |  | [00] INVALID_COMBINATION | 1-5 |
|  |  |  | [01] REQUIRES_AUTHENTICATION | 1-5 |
|  |  |  | [FF] VALID_COMBINATION | 1-5 |
|  | [05] FIRMWARE_UPDATE_MD_GET |  |  | 1-5 |
|  |  | NUMBER_OF_REPORTS |  | 1-5 |
|  |  | REPORT_NUMBER_2 |  | 1-5 |
|  | [06] FIRMWARE_UPDATE_MD_REPORT |  |  | 1-5 |
|  |  | REPORT_NUMBER_2 |  | 1-5 |
|  |  | DATA |  | 1-5 |
|  |  | CHECKSUM |  | 2-5 |
|  | [07] FIRMWARE_UPDATE_MD_STATUS_REPORT |  |  | 1-5 |
|  |  | STATUS |  | 1-5 |
|  |  |  | [00] UNABLE_TO_RECEIVE_WITHOUT_CHECKSUM_ERROR | 1-5 |
|  |  |  | [01] UNABLE_TO_RECEIVE | 1-5 |
|  |  |  | [FF] SUCCESSFULLY | 1-5 |
|  |  | WAITTIME |  | 3-5 |
|  | [08] FIRMWARE_UPDATE_ACTIVATION_SET |  |  | 4-5 |
|  |  | MANUFACTURER_ID |  | 4-5 |
|  |  | FIRMWARE_ID |  | 4-5 |
|  |  | CHECKSUM |  | 4-5 |
|  |  | FIRMWARE_TARGET |  | 4-5 |
|  |  | HARDWARE_VERSION |  | 5 |
|  | [09] FIRMWARE_UPDATE_ACTIVATION_STATUS_REPORT |  |  | 4-5 |
|  |  | MANUFACTURER_ID |  | 4-5 |
|  |  | FIRMWARE_ID |  | 4-5 |
|  |  | CHECKSUM |  | 4-5 |
|  |  | FIRMWARE_TARGET |  | 4-5 |
|  |  | FIRMWARE_UPDATE_STATUS |  | 4-5 |
|  |  |  | [00] INVALID_COMBINATION | 4-5 |
|  |  |  | [01] ERROR_ACTIVATING_THE_FIRMWARE | 4-5 |
|  |  |  | [FF] FIRMWARE_UPDATE_COMPLETED_SUCCESSFULLY | 4-5 |
|  |  | HARDWARE_VERSION |  | 5 |
|  | [0A] FIRMWARE_UPDATE_MD_PREPARE_GET |  |  | 5 |
|  |  | MANUFACTURER_ID |  | 5 |
|  |  | FIRMWARE_ID |  | 5 |
|  |  | FIRMWARE_TARGET |  | 5 |
|  |  | FRAGMENT_SIZE |  | 5 |
|  |  | HARDWARE_VERSION |  | 5 |
|  | [0B] FIRMWARE_UPDATE_MD_PREPARE_REPORT |  |  | 5 |
|  |  | STATUS |  | 5 |
|  |  |  | [00] INVALID_COMBINATION | 5 |
|  |  |  | [01] REQUIRES_AUTHENTICATION | 5 |
|  |  |  | [02] INVALID_FRAGMENT_SIZE | 5 |
|  |  |  | [03] NOT_UPGRADABLE | 5 |
|  |  |  | [04] INVALID_HARDWARE_VERSION | 5 |
|  |  |  | [FF] VALID_COMBINATION | 5 |
|  |  | FIRMWARE_CHECKSUM |  | 5 |
| [7B] COMMAND_CLASS_GROUPING_NAME |  |  |  | 1 |
|  | [01] GROUPING_NAME_SET |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
|  |  | GROUPING_NAME |  | 1 |
|  | [02] GROUPING_NAME_GET |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
|  | [03] GROUPING_NAME_REPORT |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
|  |  | GROUPING_NAME |  | 1 |
| [7C] COMMAND_CLASS_REMOTE_ASSOCIATION_ACTIVATE |  |  |  | 1 |
|  | [01] REMOTE_ASSOCIATION_ACTIVATE |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
| [7D] COMMAND_CLASS_REMOTE_ASSOCIATION |  |  |  | 1 |
|  | [01] REMOTE_ASSOCIATION_CONFIGURATION_SET |  |  | 1 |
|  |  | LOCAL_GROUPING_IDENTIFIER |  | 1 |
|  |  |  | [00] ERASE_ALL_LIN | 1 |
|  |  | REMOTE_NODEID |  | 1 |
|  |  |  | [00] REMOVE_A_LINK | 1 |
|  |  | REMOTE_GROUPING_IDENTIFIER |  | 1 |
|  | [02] REMOTE_ASSOCIATION_CONFIGURATION_GET |  |  | 1 |
|  |  | LOCAL_GROUPING_IDENTIFIER |  | 1 |
|  | [03] REMOTE_ASSOCIATION_CONFIGURATION_REPORT |  |  | 1 |
|  |  | LOCAL_GROUPING_IDENTIFIER |  | 1 |
|  |  |  | [00] ERASE_ALL_LIN | 1 |
|  |  | REMOTE_NODEID |  | 1 |
|  |  |  | [00] REMOVE_A_LINK | 1 |
|  |  | REMOTE_GROUPING_IDENTIFIER |  | 1 |
| [80] COMMAND_CLASS_BATTERY |  |  |  | 1 |
|  | [02] BATTERY_GET |  |  | 1 |
|  | [03] BATTERY_REPORT |  |  | 1 |
|  |  | BATTERY_LEVEL |  | 1 |
|  |  |  | [FF] BATTERY_LOW_WARNING | 1 |
| [81] COMMAND_CLASS_CLOCK |  |  |  | 1 |
|  | [04] CLOCK_SET |  |  | 1 |
|  |  | MINUTE |  | 1 |
|  | [05] CLOCK_GET |  |  | 1 |
|  | [06] CLOCK_REPORT |  |  | 1 |
|  |  | MINUTE |  | 1 |
| [82] COMMAND_CLASS_HAIL |  |  |  | 1 |
|  | [01] HAIL |  |  | 1 |
| [84] COMMAND_CLASS_WAKE_UP |  |  |  | 2 |
|  | [04] WAKE_UP_INTERVAL_SET |  |  | 1-2 |
|  |  | SECONDS |  | 1-2 |
|  |  | NODEID |  | 1-2 |
|  | [05] WAKE_UP_INTERVAL_GET |  |  | 1-2 |
|  | [06] WAKE_UP_INTERVAL_REPORT |  |  | 1-2 |
|  |  | SECONDS |  | 1-2 |
|  |  | NODEID |  | 1-2 |
|  | [07] WAKE_UP_NOTIFICATION |  |  | 1-2 |
|  | [08] WAKE_UP_NO_MORE_INFORMATION |  |  | 1-2 |
|  | [09] WAKE_UP_INTERVAL_CAPABILITIES_GET |  |  | 2 |
|  | [0A] WAKE_UP_INTERVAL_CAPABILITIES_REPORT |  |  | 2 |
|  |  | MINIMUM_WAKE_UP_INTERVAL_SECONDS |  | 2 |
|  |  | MAXIMUM_WAKE_UP_INTERVAL_SECONDS |  | 2 |
|  |  | DEFAULT_WAKE_UP_INTERVAL_SECONDS |  | 2 |
|  |  | WAKE_UP_INTERVAL_STEP_SECONDS |  | 2 |
| [85] COMMAND_CLASS_ASSOCIATION |  |  |  | 2 |
|  | [01] ASSOCIATION_SET |  |  | 1-2 |
|  |  | GROUPING_IDENTIFIER |  | 1-2 |
|  |  | NODE_ID |  | 1-2 |
|  | [02] ASSOCIATION_GET |  |  | 1-2 |
|  |  | GROUPING_IDENTIFIER |  | 1-2 |
|  | [03] ASSOCIATION_REPORT |  |  | 1-2 |
|  |  | GROUPING_IDENTIFIER |  | 1-2 |
|  |  | MAX_NODES_SUPPORTED |  | 1-2 |
|  |  | REPORTS_TO_FOLLOW |  | 1-2 |
|  |  | NODEID |  | 1-2 |
|  | [04] ASSOCIATION_REMOVE |  |  | 1-2 |
|  |  | GROUPING_IDENTIFIER |  | 1-2 |
|  |  | NODE_ID |  | 1-2 |
|  | [05] ASSOCIATION_GROUPINGS_GET |  |  | 1-2 |
|  | [06] ASSOCIATION_GROUPINGS_REPORT |  |  | 1-2 |
|  |  | SUPPORTED_GROUPINGS |  | 1-2 |
|  | [0B] ASSOCIATION_SPECIFIC_GROUP_GET |  |  | 2 |
|  | [0C] ASSOCIATION_SPECIFIC_GROUP_REPORT |  |  | 2 |
|  |  | GROUP |  | 2 |
| [86] COMMAND_CLASS_VERSION |  |  |  | 2 |
|  | [11] VERSION_GET |  |  | 1-2 |
|  | [12] VERSION_REPORT |  |  | 1-2 |
|  |  | Z_WAVE_LIBRARY_TYPE |  | 1-2 |
|  |  | Z_WAVE_PROTOCOL_VERSION |  | 1-2 |
|  |  | Z_WAVE_PROTOCOL_SUB_VERSION |  | 1-2 |
|  |  | FIRMWARE_0_VERSION |  | 1-2 |
|  |  | FIRMWARE_0_SUB_VERSION |  | 1-2 |
|  |  | HARDWARE_VERSION |  | 2 |
|  |  | NUMBER_OF_FIRMWARE_TARGETS |  | 2 |
|  |  | FIRMWARE_VERSION |  | 2 |
|  | [13] VERSION_COMMAND_CLASS_GET |  |  | 1-2 |
|  |  | REQUESTED_COMMAND_CLASS |  | 1-2 |
|  | [14] VERSION_COMMAND_CLASS_REPORT |  |  | 1-2 |
|  |  | REQUESTED_COMMAND_CLASS |  | 1-2 |
|  |  | COMMAND_CLASS_VERSION |  | 1-2 |
| [87] COMMAND_CLASS_INDICATOR |  |  |  | 2 |
|  | [01] INDICATOR_SET |  |  | 1-2 |
|  |  | INDICATOR_0_VALUE |  | 1-2 |
|  |  |  | [00] OFF_DISABLE | 1-2 |
|  |  |  | [FF] ON_ENABLE | 1-2 |
|  |  | INDICATOR_INFORMATION |  | 2 |
|  | [02] INDICATOR_GET |  |  | 1-2 |
|  |  | INDICATOR_ID |  | 2 |
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
|  |  | INDICATOR_0_VALUE |  | 1-2 |
|  |  |  | [00] OFF_DISABLE | 1-2 |
|  |  |  | [FF] ON_ENABLE | 1-2 |
|  |  | INDICATOR_INFORMATION |  | 2 |
|  | [04] INDICATOR_SUPPORTED_GET |  |  | 2 |
|  |  | INDICATOR_ID |  | 2 |
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
|  |  | INDICATOR_ID |  | 2 |
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
|  |  | NEXT_INDICATOR_ID |  | 2 |
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
|  |  | PROPERTY_SUPPORTED_BIT_MASK |  | 2 |
|  |  |  | [01] MULTILEVEL | 2 |
|  |  |  | [02] BINARY | 2 |
|  |  |  | [03] ON_OFF_PERIOD | 2 |
|  |  |  | [04] ON_OFF_CYCLES | 2 |
|  |  |  | [10] LOW_POWER | 2 |
| [88] COMMAND_CLASS_PROPRIETARY |  |  |  | 1 |
|  | [01] PROPRIETARY_SET |  |  | 1 |
|  |  | DATA |  | 1 |
|  | [02] PROPRIETARY_GET |  |  | 1 |
|  |  | DATA |  | 1 |
|  | [03] PROPRIETARY_REPORT |  |  | 1 |
|  |  | DATA |  | 1 |
| [89] COMMAND_CLASS_LANGUAGE |  |  |  | 1 |
|  | [01] LANGUAGE_SET |  |  | 1 |
|  |  | LANGUAGE |  | 1 |
|  |  | COUNTRY |  | 1 |
|  | [02] LANGUAGE_GET |  |  | 1 |
|  | [03] LANGUAGE_REPORT |  |  | 1 |
|  |  | LANGUAGE |  | 1 |
|  |  | COUNTRY |  | 1 |
| [8A] COMMAND_CLASS_TIME |  |  |  | 2 |
|  | [01] TIME_GET |  |  | 1-2 |
|  | [02] TIME_REPORT |  |  | 1-2 |
|  |  | MINUTE_LOCAL_TIME |  | 1-2 |
|  |  | SECOND_LOCAL_TIME |  | 1-2 |
|  | [03] DATE_GET |  |  | 1-2 |
|  | [04] DATE_REPORT |  |  | 1-2 |
|  |  | YEAR |  | 1-2 |
|  |  | MONTH |  | 1-2 |
|  |  | DAY |  | 1-2 |
|  | [05] TIME_OFFSET_SET |  |  | 2 |
|  |  | MINUTE_TZO |  | 2 |
|  |  | MONTH_START_DST |  | 2 |
|  |  | DAY_START_DST |  | 2 |
|  |  | HOUR_START_DST |  | 2 |
|  |  | MONTH_END_DST |  | 2 |
|  |  | DAY_END_DST |  | 2 |
|  |  | HOUR_END_DST |  | 2 |
|  | [06] TIME_OFFSET_GET |  |  | 2 |
|  | [07] TIME_OFFSET_REPORT |  |  | 2 |
|  |  | MINUTE_TZO |  | 2 |
|  |  | MONTH_START_DST |  | 2 |
|  |  | DAY_START_DST |  | 2 |
|  |  | HOUR_START_DST |  | 2 |
|  |  | MONTH_END_DST |  | 2 |
|  |  | DAY_END_DST |  | 2 |
|  |  | HOUR_END_DST |  | 2 |
| [8B] COMMAND_CLASS_TIME_PARAMETERS |  |  |  | 1 |
|  | [01] TIME_PARAMETERS_SET |  |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_UTC |  | 1 |
|  |  | MINUTE_UTC |  | 1 |
|  |  | SECOND_UTC |  | 1 |
|  | [02] TIME_PARAMETERS_GET |  |  | 1 |
|  | [03] TIME_PARAMETERS_REPORT |  |  | 1 |
|  |  | YEAR |  | 1 |
|  |  | MONTH |  | 1 |
|  |  | DAY |  | 1 |
|  |  | HOUR_UTC |  | 1 |
|  |  | MINUTE_UTC |  | 1 |
|  |  | SECOND_UTC |  | 1 |
| [8C] COMMAND_CLASS_GEOGRAPHIC_LOCATION |  |  |  | 1 |
|  | [01] GEOGRAPHIC_LOCATION_SET |  |  | 1 |
|  |  | LONGITUDE_DEGREES |  | 1 |
|  |  | LATITUDE_DEGREES |  | 1 |
|  | [02] GEOGRAPHIC_LOCATION_GET |  |  | 1 |
|  | [03] GEOGRAPHIC_LOCATION_REPORT |  |  | 1 |
|  |  | LONGITUDE_DEGREES |  | 1 |
|  |  | LATITUDE_DEGREES |  | 1 |
| [8E] COMMAND_CLASS_MULTI_INSTANCE_ASSOCIATION |  |  |  | 3 |
|  | [01] MULTI_INSTANCE_ASSOCIATION_SET |  |  | 1-3 |
|  |  | GROUPING_IDENTIFIER |  | 1-3 |
|  |  | NODE_ID |  | 1-3 |
|  |  | MARKER |  | 1-3 |
|  |  |  | [00] MARKER | 1-3 |
|  |  | MULTI_INSTANCE |  | 1-3 |
|  | [02] MULTI_INSTANCE_ASSOCIATION_GET |  |  | 1-3 |
|  |  | GROUPING_IDENTIFIER |  | 1-3 |
|  | [03] MULTI_INSTANCE_ASSOCIATION_REPORT |  |  | 1-3 |
|  |  | GROUPING_IDENTIFIER |  | 1-3 |
|  |  | MAX_NODES_SUPPORTED |  | 1-3 |
|  |  | REPORTS_TO_FOLLOW |  | 1-3 |
|  |  | NODE_ID |  | 1-3 |
|  |  | MARKER |  | 1-3 |
|  |  |  | [00] MARKER | 1-3 |
|  |  | MULTI_INSTANCE |  | 1-3 |
|  | [04] MULTI_INSTANCE_ASSOCIATION_REMOVE |  |  | 1-3 |
|  |  | GROUPING_IDENTIFIER |  | 1-3 |
|  |  | NODE_ID |  | 1-3 |
|  |  | MARKER |  | 1-3 |
|  |  |  | [00] MARKER | 1-3 |
|  |  | MULTI_INSTANCE |  | 1-3 |
|  | [05] MULTI_INSTANCE_ASSOCIATION_GROUPINGS_GET |  |  | 1-3 |
|  | [06] MULTI_INSTANCE_ASSOCIATION_GROUPINGS_REPORT |  |  | 1-3 |
|  |  | SUPPORTED_GROUPINGS |  | 1-3 |
| [8F] COMMAND_CLASS_MULTI_CMD |  |  |  | 1 |
|  | [01] MULTI_CMD_ENCAP |  |  | 1 |
|  |  | NUMBER_OF_COMMANDS |  | 1 |
|  |  | ENCAPSULATED_COMMAND |  | 1 |
| [90] COMMAND_CLASS_ENERGY_PRODUCTION |  |  |  | 1 |
|  | [02] ENERGY_PRODUCTION_GET |  |  | 1 |
|  |  | PARAMETER_NUMBER |  | 1 |
|  |  |  | [00] INSTANT_ENERGY_PRODUCTION | 1 |
|  |  |  | [01] TOTAL_ENERGY_PRODUCTION | 1 |
|  |  |  | [02] ENERGY_PRODUCTION_TODAY | 1 |
|  |  |  | [03] TOTAL_PRODUCTION_TIME | 1 |
|  | [03] ENERGY_PRODUCTION_REPORT |  |  | 1 |
|  |  | PARAMETER_NUMBER |  | 1 |
|  |  |  | [00] INSTANT_ENERGY_PRODUCTION | 1 |
|  |  |  | [01] TOTAL_ENERGY_PRODUCTION | 1 |
|  |  |  | [02] ENERGY_PRODUCTION_TODAY | 1 |
|  |  |  | [03] TOTAL_PRODUCTION_TIME | 1 |
|  |  | VALUE |  | 1 |
| [91] COMMAND_CLASS_MANUFACTURER_PROPRIETARY |  |  |  | 1 |
| [92] COMMAND_CLASS_SCREEN_MD |  |  |  | 2 |
|  | [01] SCREEN_MD_GET |  |  | 1-2 |
|  |  | NUMBER_OF_REPORTS |  | 1-2 |
|  |  | NODE_ID |  | 1-2 |
|  | [02] SCREEN_MD_REPORT |  |  | 1 |
|  |  | SCREEN_MD_STRING |  | 1 |
|  | [03] SCREEN_MD_REPORT |  |  | 2 |
|  |  | SCREEN_MD_STRING |  | 2 |
| [93] COMMAND_CLASS_SCREEN_ATTRIBUTES |  |  |  | 2 |
|  | [01] SCREEN_ATTRIBUTES_GET |  |  | 1-2 |
|  | [02] SCREEN_ATTRIBUTES_REPORT |  |  | 1-2 |
|  |  | NUMBER_OF_CHARACTERS_PER_LINE |  | 1-2 |
|  |  | SIZE_OF_LINE_BUFFER |  | 1-2 |
|  |  | NUMERICAL_PRESENTATION_OF_A_CHARACTER |  | 1-2 |
|  |  | SCREEN_TIMEOUT |  | 2 |
| [94] COMMAND_CLASS_SIMPLE_AV_CONTROL |  |  |  | 1 |
|  | [01] SIMPLE_AV_CONTROL_SET |  |  | 1 |
|  |  | SEQUENCE_NUMBER |  | 1 |
|  |  | ITEM_ID |  | 1 |
|  |  | AV_COMMAND |  | 1 |
|  | [02] SIMPLE_AV_CONTROL_GET |  |  | 1 |
|  | [03] SIMPLE_AV_CONTROL_REPORT |  |  | 1 |
|  |  | NUMBER_OF_REPORTS |  | 1 |
|  | [04] SIMPLE_AV_CONTROL_SUPPORTED_GET |  |  | 1 |
|  |  | REPORT_NO |  | 1 |
|  | [05] SIMPLE_AV_CONTROL_SUPPORTED_REPORT |  |  | 1 |
|  |  | REPORT_NO |  | 1 |
|  |  | BIT_MASK |  | 1 |
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
|  |  | REPORTS_TO_FOLLOW |  | 1 |
|  |  | COMMAND_CLASS_SUPPORT |  | 1 |
|  |  | COMMAND_CLASS_MARK |  | 1 |
|  |  |  | [EF] COMMAND_CLASS_MARK | 1 |
|  |  | COMMAND_CLASS_CONTROL |  | 1 |
|  | [04] SECURITY_SCHEME_GET |  |  | 1 |
|  |  | SUPPORTED_SECURITY_SCHEMES |  | 1 |
|  | [05] SECURITY_SCHEME_REPORT |  |  | 1 |
|  |  | SUPPORTED_SECURITY_SCHEMES |  | 1 |
|  | [06] NETWORK_KEY_SET |  |  | 1 |
|  |  | NETWORK_KEY_BYTE |  | 1 |
|  | [07] NETWORK_KEY_VERIFY |  |  | 1 |
|  | [08] SECURITY_SCHEME_INHERIT |  |  | 1 |
|  |  | SUPPORTED_SECURITY_SCHEMES |  | 1 |
|  | [40] SECURITY_NONCE_GET |  |  | 1 |
|  | [80] SECURITY_NONCE_REPORT |  |  | 1 |
|  |  | NONCE_BYTE |  | 1 |
|  | [81] SECURITY_MESSAGE_ENCAPSULATION |  |  | 1 |
|  |  | INITIALIZATION_VECTOR_BYTE |  | 1 |
|  |  | COMMAND_BYTE |  | 1 |
|  |  | RECEIVERS_NONCE_IDENTIFIER |  | 1 |
|  |  | MESSAGE_AUTHENTICATION_CODE_BYTE |  | 1 |
|  | [C1] SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET |  |  | 1 |
|  |  | INITIALIZATION_VECTOR_BYTE |  | 1 |
|  |  | COMMAND_BYTE |  | 1 |
|  |  | RECEIVERS_NONCE_IDENTIFIER |  | 1 |
|  |  | MESSAGE_AUTHENTICATION_CODE_BYTE |  | 1 |
| [99] COMMAND_CLASS_AV_TAGGING_MD |  |  |  | 1 |
|  | [01] AV_TAGGING_MD_GET |  |  | 1 |
|  | [02] AV_TAGGING_MD_REPORT |  |  | 1 |
| [9A] COMMAND_CLASS_IP_CONFIGURATION |  |  |  | 1 |
|  | [01] IP_CONFIGURATION_SET |  |  | 1 |
|  |  | IP_ADDRESS |  | 1 |
|  |  | SUBNET_MASK |  | 1 |
|  |  | GATEWAY |  | 1 |
|  |  | DNS1 |  | 1 |
|  |  | DNS2 |  | 1 |
|  | [02] IP_CONFIGURATION_GET |  |  | 1 |
|  | [03] IP_CONFIGURATION_REPORT |  |  | 1 |
|  |  | IP_ADDRESS |  | 1 |
|  |  | SUBNET_MASK |  | 1 |
|  |  | GATEWAY |  | 1 |
|  |  | DNS1 |  | 1 |
|  |  | DNS2 |  | 1 |
|  |  | LEASETIME |  | 1 |
|  | [04] IP_CONFIGURATION_RELEASE |  |  | 1 |
|  | [05] IP_CONFIGURATION_RENEW |  |  | 1 |
| [9B] COMMAND_CLASS_ASSOCIATION_COMMAND_CONFIGURATION |  |  |  | 1 |
|  | [01] COMMAND_RECORDS_SUPPORTED_GET |  |  | 1 |
|  | [02] COMMAND_RECORDS_SUPPORTED_REPORT |  |  | 1 |
|  |  | FREE_COMMAND_RECORDS |  | 1 |
|  |  | MAX_COMMAND_RECORDS |  | 1 |
|  | [03] COMMAND_CONFIGURATION_SET |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
|  |  | NODE_ID |  | 1 |
|  |  | COMMAND_LENGTH |  | 1 |
|  |  | COMMAND_CLASS_IDENTIFIER |  | 1 |
|  |  | COMMAND_IDENTIFIER |  | 1 |
|  |  | COMMAND_BYTE |  | 1 |
|  | [04] COMMAND_CONFIGURATION_GET |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
|  |  | NODE_ID |  | 1 |
|  | [05] COMMAND_CONFIGURATION_REPORT |  |  | 1 |
|  |  | GROUPING_IDENTIFIER |  | 1 |
|  |  | NODE_ID |  | 1 |
|  |  | COMMAND_LENGTH |  | 1 |
|  |  | COMMAND_CLASS_IDENTIFIER |  | 1 |
|  |  | COMMAND_IDENTIFIER |  | 1 |
|  |  | COMMAND_BYTE |  | 1 |
| [9C] COMMAND_CLASS_SENSOR_ALARM |  |  |  | 1 |
|  | [01] SENSOR_ALARM_GET |  |  | 1 |
|  |  | SENSOR_TYPE |  | 1 |
|  |  |  | [00] GENERAL_PURPOSE_ALARM | 1 |
|  |  |  | [01] SMOKE_ALARM | 1 |
|  |  |  | [02] CO_ALARM | 1 |
|  |  |  | [03] CO2_ALARM | 1 |
|  |  |  | [04] HEAT_ALARM | 1 |
|  |  |  | [05] WATER_LEAK_ALARM | 1 |
|  |  |  | [FF] RETURN_FIRST_ALARM_ON_SUPPORTED_LIST | 1 |
|  | [02] SENSOR_ALARM_REPORT |  |  | 1 |
|  |  | SOURCE_NODE_ID |  | 1 |
|  |  | SENSOR_TYPE |  | 1 |
|  |  |  | [00] GENERAL_PURPOSE_ALARM | 1 |
|  |  |  | [01] SMOKE_ALARM | 1 |
|  |  |  | [02] CO_ALARM | 1 |
|  |  |  | [03] CO2_ALARM | 1 |
|  |  |  | [04] HEAT_ALARM | 1 |
|  |  |  | [05] WATER_LEAK_ALARM | 1 |
|  |  |  | [FF] RETURN_FIRST_ALARM_ON_SUPPORTED_LIST | 1 |
|  |  | SENSOR_STATE |  | 1 |
|  |  |  | [00] NO_ALARM | 1 |
|  |  |  | [FF] ALARM | 1 |
|  |  | SECONDS |  | 1 |
|  | [03] SENSOR_ALARM_SUPPORTED_GET |  |  | 1 |
|  | [04] SENSOR_ALARM_SUPPORTED_REPORT |  |  | 1 |
|  |  | NUMBER_OF_BIT_MASKS |  | 1 |
|  |  | BIT_MASK |  | 1 |
| [9D] COMMAND_CLASS_SILENCE_ALARM |  |  |  | 1 |
|  | [01] SENSOR_ALARM_SET |  |  | 1 |
|  |  | MODE |  | 1 |
|  |  |  | [00] DISABLE_SOUNDING_OF_ALL_SENSOR_ALARMS | 1 |
|  |  |  | [01] DISABLE_SOUNDING_OF_ALL_SENSOR_ALARMS_INDEPENDENT_OF_BIT_MASK_WHICH_HAVE_RECEIVED_THE_ALARM | 1 |
|  |  |  | [02] DISABLE_SOUNDING_OF_ALL_SENSOR_ALARMS_ACCORDING_TO_BIT_MASK | 1 |
|  |  |  | [03] DISABLE_SOUNDING_OF_ALL_SENSOR_ALARMS_ACCORDING_TO_BIT_MASK_WHICH_HAVE_RECEIVED_THE_ALARM | 1 |
|  |  | SECONDS |  | 1 |
|  |  | NUMBER_OF_BIT_MASKS |  | 1 |
|  |  | BIT_MASK |  | 1 |
| [9E] COMMAND_CLASS_SENSOR_CONFIGURATION |  |  |  | 1 |
|  | [01] SENSOR_TRIGGER_LEVEL_SET |  |  | 1 |
|  |  | SENSOR_TYPE |  | 1 |
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
|  |  | TRIGGER_VALUE |  | 1 |
|  | [02] SENSOR_TRIGGER_LEVEL_GET |  |  | 1 |
|  | [03] SENSOR_TRIGGER_LEVEL_REPORT |  |  | 1 |
|  |  | SENSOR_TYPE |  | 1 |
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
|  |  | TRIGGER_VALUE |  | 1 |
| [9F] COMMAND_CLASS_SECURITY_2 |  |  |  | 1 |
|  | [01] SECURITY_2_NONCE_GET |  |  | 1 |
|  |  | SEQUENCE_NUMBER |  | 1 |
|  | [02] SECURITY_2_NONCE_REPORT |  |  | 1 |
|  |  | SEQUENCE_NUMBER |  | 1 |
|  |  | RECEIVERS_ENTROPY_INPUT |  | 1 |
|  | [03] SECURITY_2_MESSAGE_ENCAPSULATION |  |  | 1 |
|  |  | SEQUENCE_NUMBER |  | 1 |
|  |  | SECURITY_HEADER |  | 1 |
|  |  | CCM_CIPHERTEXT_OBJECT |  | 1 |
|  | [04] KEX_GET |  |  | 1 |
|  | [05] KEX_REPORT |  |  | 1 |
|  |  | SUPPORTED_KEX_SCHEMES |  | 1 |
|  |  | SUPPORTED_ECDH_PROFILES |  | 1 |
|  |  | REQUESTED_KEYS |  | 1 |
|  |  |  | [00] UNAUTHENTICATED | 1 |
|  |  |  | [01] AUTHENTICATED | 1 |
|  |  |  | [02] ACCESS | 1 |
|  |  |  | [07] S0 | 1 |
|  | [06] KEX_SET |  |  | 1 |
|  |  | SELECTED_KEX_SCHEME |  | 1 |
|  |  | SELECTED_ECDH_PROFILE |  | 1 |
|  |  | GRANTED_KEYS |  | 1 |
|  |  |  | [00] UNAUTHENTICATED | 1 |
|  |  |  | [01] AUTHENTICATED | 1 |
|  |  |  | [02] ACCESS | 1 |
|  |  |  | [07] S0 | 1 |
|  | [07] KEX_FAIL |  |  | 1 |
|  |  | KEX_FAIL_TYPE |  | 1 |
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
|  |  | ECDH_PUBLIC_KEY |  | 1 |
|  | [09] SECURITY_2_NETWORK_KEY_GET |  |  | 1 |
|  |  | REQUESTED_KEY |  | 1 |
|  |  |  | [00] UNAUTHENTICATED | 1 |
|  |  |  | [01] AUTHENTICATED | 1 |
|  |  |  | [02] ACCESS | 1 |
|  |  |  | [07] S0 | 1 |
|  | [0A] SECURITY_2_NETWORK_KEY_REPORT |  |  | 1 |
|  |  | GRANTED_KEY |  | 1 |
|  |  |  | [00] UNAUTHENTICATED | 1 |
|  |  |  | [01] AUTHENTICATED | 1 |
|  |  |  | [02] ACCESS | 1 |
|  |  |  | [07] S0 | 1 |
|  |  | NETWORK_KEY |  | 1 |
|  | [0B] SECURITY_2_NETWORK_KEY_VERIFY |  |  | 1 |
|  | [0C] SECURITY_2_TRANSFER_END |  |  | 1 |
|  | [0D] SECURITY_2_COMMANDS_SUPPORTED_GET |  |  | 1 |
|  | [0E] SECURITY_2_COMMANDS_SUPPORTED_REPORT |  |  | 1 |
|  |  | COMMAND_CLASS |  | 1 |
|  | [0F] SECURITY_2_CAPABILITIES_GET |  |  | 1 |
|  | [10] SECURITY_2_CAPABILITIES_REPORT |  |  | 1 |
|  |  | SUPPORTED_SPANS |  | 1 |
|  |  | SUPPORTED_MPANS |  | 1 |
| [EF] COMMAND_CLASS_MARK |  |  |  | 1 |
| [F0] COMMAND_CLASS_NON_INTEROPERABLE |  |  |  | 1 |
