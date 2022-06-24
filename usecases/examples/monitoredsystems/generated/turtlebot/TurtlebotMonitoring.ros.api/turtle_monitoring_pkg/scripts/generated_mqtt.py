#!/usr/bin/env python
import json
from paho.mqtt import client as mqtt_client

class MQTTForwarder:

    def init(self):
        self.connect_mqtt()

    def connect_mqtt(self):
        def on_connect(client, userdata, flags, rc):
            if rc == 0:
                print("Connected to MQTT Broker!")
            else:
                print("Failed to connect, return code %d \n ", rc)
        # Set Connecting Client ID
        client = mqtt_client.Client('client_id')
        client.on_connect = on_connect
        client.connect('tcp', //localhost)
        self.client = client

    def publish(self, topic, message):
        self.client.publish(topic, str(message))

