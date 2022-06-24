#!/usr/bin/env python

from generated_mqtt import MQTTForwarder
mqtt_forwarder = MQTTForwarder()


def init_api():
    global mqtt_forwarder
    mqtt_forwarder.init()




# ###################### DYNAMIC GENERATED CODE #######################

# register a bot
def register_TurtleBot(element_id):
    mqtt_forwarder.publish('register/bot', element_id)


# update methods

def update_BatteryStatus(parent, message):  
    mqtt_forwarder.publish(parent + '/battery_state', message)


def update_Diagnostics(parent, message):  
    mqtt_forwarder.publish(parent + '/diagnostics', message)


def update_Velocity(parent, message):  
    mqtt_forwarder.publish(parent + '/velocity', message)


def update_JointState(parent, message):  
    mqtt_forwarder.publish(parent + '/joint_state', message)


def update_MagneticField(parent, message):  
    mqtt_forwarder.publish(parent + '/magnetic_field', message)


def update_VersionInfo(parent, message):  
    mqtt_forwarder.publish(parent + '/version_info', message)


def update_SensorState(parent, message):  
    mqtt_forwarder.publish(parent + '/sensor_state', message)


def update_Odometry(parent, message):  
    mqtt_forwarder.publish(parent + '/odometry', message)


def update_LaserScan(parent, message):  
    mqtt_forwarder.publish(parent + '/laser_scan', message)


def update_AirQuality(parent, message):  
    mqtt_forwarder.publish(parent + '/air_quality', message)


# ###################### END DYNAMIC GENERATED CODE #######################
