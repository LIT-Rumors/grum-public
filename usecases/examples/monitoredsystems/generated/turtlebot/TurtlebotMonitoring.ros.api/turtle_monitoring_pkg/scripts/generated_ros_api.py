#!/usr/bin/env python

from generated_mqtt import MQTTForwarder
mqtt_forwarder = MQTTForwarder()


def init_api():
    global mqtt_forwarder
    mqtt_forwarder.init()




# ###################### DYNAMIC GENERATED CODE #######################

# register a bot
def register_TurtleBot(element_id):
    mqtt_forwarder.publish('register/turtlebot', element_id)


# update methods

def update_batterystatus(parent, message):  
    mqtt_forwarder.publish(parent + '/batterystatus', message)


def update_diagnostics(parent, message):  
    mqtt_forwarder.publish(parent + '/diagnostics', message)


def update_jointstate(parent, message):  
    mqtt_forwarder.publish(parent + '/jointstate', message)


def update_laserscan(parent, message):  
    mqtt_forwarder.publish(parent + '/laserscan', message)


def update_magneticfield(parent, message):  
    mqtt_forwarder.publish(parent + '/magneticfield', message)


def update_odometry(parent, message):  
    mqtt_forwarder.publish(parent + '/odometry', message)


def update_sensor(parent, message):  
    mqtt_forwarder.publish(parent + '/sensor', message)


def update_velocity(parent, message):  
    mqtt_forwarder.publish(parent + '/velocity', message)


def update_versioninfo(parent, message):  
    mqtt_forwarder.publish(parent + '/versioninfo', message)


# ###################### END DYNAMIC GENERATED CODE #######################
