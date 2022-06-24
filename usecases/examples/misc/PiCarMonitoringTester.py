#####################################################
###### GRuM Test Script                          ####
##### Registers Picars as MoAgents and           ####
##### sends location and status monitoring data  ####
#####################################################
import json
import time
import random

import paho.mqtt.client as mqtt_client
from threading import Thread

# MQTT Broker Configuration
client_id = 'PiCarMonitoringTester'
broker = 'localhost'
port = 1883

NUM_OF_PICARS = 3

agents = []
# Topics
PICAR_ID = 'TestPicar'
TOPIC_REGISTER = 'register/picar'
TOPIC_LOCATION = 'location'
TOPIC_STATUS = 'status'


def connect_mqtt():
    global client
    try:
        def on_connect(client, userdata, flags, rc):
            if rc == 0:
                print("Connected to MQTT Broker!")
            else:
                print("Failed to connect, return code %d\n", rc)

        client = mqtt_client.Client(client_id)
        # client.username_pw_set(username, password)
        client.on_connect = on_connect
        client.connect(broker, port)
        client.loop_forever()
        # return client
    except Exception as e:
        print(e)


# Sending Status Updates
def send_status_data():
    while True:
        print('Sending Status Data...')
        for ag in agents:
            send_message(ag + '/' + TOPIC_STATUS, {'initialized': 'True', 'operationmode': get_random_op_mode()})
        time.sleep(5)


# Generate a Random error so that the Viatra Constraint is triggered
def get_random_op_mode():
    return 'ERROR' if random.randint(0, 100) < 10 else 'OPERATIONAL'


# Sending Location Updates
def send_location_data():
    while True:
        print('Sending Location Data...')
        for ag in agents:
            if random.randint(0, 100) < 3: ### send a distance too far away to trigger violation
                send_message(ag + '/' + TOPIC_LOCATION, {'lat': 48.337162, 'lon': 14.316953, 'alt': '220'})
            else:
                send_message(ag + '/' + TOPIC_LOCATION, {'lat': 48.337162, 'lon': 14.315453, 'alt': '220'})
        time.sleep(1)


def send_message(topic, message):
    if client.is_connected():
        client.publish(topic, json.dumps(message))
    else:
        print(f'Can not send message to {topic} Not connected to MQTT Broker!')


def register_picar():
    for i in range(1, NUM_OF_PICARS + 1):
        print('Registering Picar', PICAR_ID + str(i))
        agents.append(PICAR_ID + str(i))
        send_message(TOPIC_REGISTER, {'id': PICAR_ID + str(i), 'geofence_range': 50, 'startlocation': {'lat' : 48.337162, 'lon': 14.315453, 'alt': 220}})


def initialize():
    time.sleep(5)
    register_picar()
    time.sleep(5)
    t = Thread(target=send_status_data, args=())
    t.start()
    t2 = Thread(target=send_location_data, args=())
    t2.start()


def start_data_producer():
    t = Thread(target=connect_mqtt, args=())
    t.start()
    initialize()


if __name__ == '__main__':
    start_data_producer()
