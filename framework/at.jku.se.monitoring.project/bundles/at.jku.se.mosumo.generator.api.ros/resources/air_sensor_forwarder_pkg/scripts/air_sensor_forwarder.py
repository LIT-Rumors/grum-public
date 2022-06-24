#!/usr/bin/env python
import rospy
from paho.mqtt import client as mqtt_client
from std_msgs.msg import String

pub = rospy.Publisher('ros_sensor/air_sensor', String, queue_size=10)


def on_message_received(client, userdata, message):
    do_ros_publish(str(message.payload.decode('utf-8')))


def do_ros_publish(sensor_msg):
    global pub
    rospy.loginfo(sensor_msg)
    pub.publish(sensor_msg)


def init_mqtt():
    client = mqtt_client.Client('client_id')
    client.connect('140.78.42.41', 1883)

    client.on_message = on_message_received

    client.loop_start()
    client.subscribe("sensors/co2/CO2-1")

    rospy.spin()


if __name__ == '__main__':
    try:
        rospy.init_node('turtle_listener', anonymous=True)
        init_mqtt()
    except rospy.ROSInterruptException:
        pass
