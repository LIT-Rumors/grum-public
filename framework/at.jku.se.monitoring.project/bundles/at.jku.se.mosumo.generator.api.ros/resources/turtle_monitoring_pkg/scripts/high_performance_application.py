#!/usr/bin/env python
import json
import os
import random
import sys
import threading
import time

import numpy as np
import rospy
import yaml
from diagnostic_msgs.msg import DiagnosticArray
from geometry_msgs.msg import Twist
from nav_msgs.msg import Odometry
from sensor_msgs.msg import BatteryState, JointState, MagneticField, LaserScan
from std_msgs.msg import String
from turtlebot3_msgs.msg import VersionInfo, SensorState

dir_path = os.path.dirname(os.path.realpath(__file__))
sys.path.append(dir_path)

from generated_ros_api import init_api, update_BatteryStatus, update_Velocity, update_Diagnostics, update_JointState, \
    update_MagneticField, update_VersionInfo, update_SensorState, register_TurtleBot, update_Odometry, update_LaserScan, \
    update_AirQuality
from utils import make_ros_log, calculate_distance, get_random_integer, get_random_float

NA = '(n/a)'
BOT_ID = "TB01"

last_odom_pos = NA
moved_distance = 0.0
is_moving = False
is_first_esper_viol_running = False
is_sec_and_third_esper_viol_running = False

battery_state_data = {'data': NA}
velocity_data = {'data': NA}
diagnostic_data = {'data': NA}
joint_state_data = {'data': NA}
magnetic_field_data = {'data': NA}
version_info_data = {'data': NA}
sensor_state_data = {'data': NA}
odometry_data = {'data': NA}
laser_scan_data = {'data': NA}
air_sensor_data = {'data': NA}


def handle_battery_state_data():
    global is_sec_and_third_esper_viol_running
    while True:
        try:
            data_battery = {'percentage': NA, 'voltage': NA, 'powerSupplyTemperature': NA}
            battery = battery_state_data['data'].percentage - 1
            battery *= 1000

            if is_sec_and_third_esper_viol_running:
                battery = get_random_float(6.0, 24.0)

            data_battery['percentage'] = round(battery, 2)

            voltage = float(battery_state_data['data'].voltage)
            data_battery['voltage'] = round(voltage, 2)

            power_supply_temperature = battery_state_data['data'].power_supply_health
            data_battery['powerSupplyTemperature'] = power_supply_temperature

            json_msg = json.dumps(data_battery)

            # create log
            make_ros_log('Battery-Level -> ' + json_msg)

            # forward msg
            update_BatteryStatus(BOT_ID, json_msg)

        except Exception as e:
            print(e)

        time.sleep(0.25)


# gather battery data
def battery_state_callback(data):
    try:
        battery_state_data['data'] = data
    except Exception as e:
        print(e)


def handle_velocity_data():
    global is_moving, is_sec_and_third_esper_viol_running
    while True:
        try:
            data = velocity_data['data']

            rotation = data.angular.z
            speed = data.linear.x

            # set moving flag
            if speed > 0:
                is_moving = True
            else:
                is_moving = False

            data_vel = {'rotation': rotation, 'speed': speed}

            # create log
            make_ros_log('Velocity -> ' + json.dumps(data_vel))
            # forward msg
            if not is_sec_and_third_esper_viol_running:
                update_Velocity(BOT_ID, json.dumps(data_vel))

        except Exception as e:
            print(e)

        time.sleep(0.25)


# gather velocity data
def cmd_vel_callback(data):
    try:
        velocity_data['data'] = data
    except Exception as e:
        print(e)


def handle_diagnostics_data():
    while True:
        try:
            data = diagnostic_data['data']
            if len(data.status) == 5:

                if is_first_esper_viol_running:
                    level_of_operation_actuator_value = 3
                else:
                    level_of_operation_actuator_value = data.status[1].level

                data_diag = {'levelOfOperationIMUSensor': data.status[0].level,
                             'levelOfOperationActuator': level_of_operation_actuator_value,
                             'levelOfOperationLidarSensor': data.status[2].level,
                             'levelOfOperationPowerSystem': data.status[3].level,
                             'levelOfOperationAnalogButton': data.status[4].level
                             }

                msg = json.dumps(data_diag)

                # create log
                make_ros_log('Diagnostics -> ' + msg)
                # forward msg
                update_Diagnostics(BOT_ID, msg)
            else:
                make_ros_log('ERROR: Got unexpected length of diagnostic data!')

        except Exception as e:
            print(e)

        time.sleep(0.25)


def diagnostic_callback(data):
    try:
        diagnostic_data['data'] = data
    except Exception as e:
        print(e)


def handle_joint_states_data():
    while True:
        try:
            data = joint_state_data['data']
            data_jst = {'effortLeftJoint': data.effort[0],
                        'effortRightJoint': data.effort[1]}

            msg = json.dumps(data_jst)

            # create log
            make_ros_log('Joint States -> ' + msg)
            # forward msg
            update_JointState(BOT_ID, msg)

        except Exception as e:
            print(e)

        time.sleep(0.25)


def joint_state_callback(data):
    try:
        joint_state_data['data'] = data
    except Exception as e:
        print(e)


def handle_magnetic_field_data():
    while True:
        try:

            data = magnetic_field_data['data']
            data_mf = {'x': data.magnetic_field.x,
                       'y': data.magnetic_field.y,
                       'z': data.magnetic_field.z}

            msg = json.dumps(data_mf)
            # create log
            make_ros_log('Magnetic Field -> ' + msg)
            # forward msg
            update_MagneticField(BOT_ID, msg)

        except Exception as e:
            print(e)

        time.sleep(0.25)


def magnetic_field_callback(data):
    try:
        magnetic_field_data['data'] = data
    except Exception as e:
        print(e)


def handle_version_info_data():
    while True:
        try:
            # create log
            make_ros_log('Version Info -> ' + ros_msg2json(version_info_data['data']))
            # forward msg
            update_VersionInfo(BOT_ID, ros_msg2json(version_info_data['data']))

        except Exception as e:
            print(e)

        time.sleep(0.25)


def version_info_callback(data):
    try:
        version_info_data['data'] = data
    except Exception as e:
        print(e)


def handle_sensor_state_data():
    while True:
        try:
            # create log
            make_ros_log('Sensor State -> ' + ros_msg2json(sensor_state_data['data']))
            # forward msg
            update_SensorState(BOT_ID, ros_msg2json(sensor_state_data['data']))

        except Exception as e:
            print(e)

        time.sleep(0.25)


def sensor_state_callback(data):
    try:
        sensor_state_data['data'] = data
    except Exception as e:
        print(e)


def handle_odometry_data():
    global moved_distance, last_odom_pos

    while True:
        try:
            current_pose = odometry_data['data'].pose.pose.position
            if last_odom_pos == NA:
                # first time data, set the initial position
                last_odom_pos = current_pose
            else:
                # calculate distance and send it
                moved_distance += calculate_distance(current_pose, last_odom_pos)
                last_odom_pos = current_pose

                temp_data = {'movedDistance': moved_distance}

                # forward msg
                update_Odometry(BOT_ID, json.dumps(temp_data))
                make_ros_log('Distance -> ' + str(moved_distance))

            # create log
            make_ros_log('Odometry -> ' + ros_msg2json(odometry_data['data']))

        except Exception as e:
            print(e)

        time.sleep(0.25)


def odometry_callback(data):
    try:
        odometry_data['data'] = data
    except Exception as e:
        print(e)


def handle_laser_scan_data():
    while True:
        try:
            # get sensor range
            range_min = laser_scan_data['data'].range_min
            range_max = laser_scan_data['data'].range_max

            if (range_min > 0) and (range_max > 0):
                measured_ranges_np = np.array(laser_scan_data['data'].ranges)

                # remove wrong measurements
                measured_ranges_np = measured_ranges_np[
                    (measured_ranges_np > range_min) & (measured_ranges_np < range_max)]
                smallest_range = np.amin(measured_ranges_np)

                make_ros_log('Laser Scan (minimum range) -> ' + str(smallest_range))

                # forward data
                temp_data = {'smallestRange': smallest_range}
                update_LaserScan(BOT_ID, json.dumps(temp_data))


        except Exception as e:
            print(e)
        time.sleep(0.25)


def laser_scan_callback(data):
    try:
        laser_scan_data['data'] = data
    except Exception as e:
        print(e)


def handle_air_sensor_data():
    global is_moving
    while True:
        try:
            if air_sensor_data['data'] != NA:
                temp = str(air_sensor_data['data']).replace("\\", "")
                temp = temp[7:-1]
                data_obj = json.loads(temp)
                # create log
                make_ros_log('Air Sensor -> ' + str(data_obj))

                ppm = round(data_obj['ppm'], 2)
                temp_data = {'partsPerMillion': ppm}

                # only send data if bot stands still
                if not is_moving:
                    # forward msg
                    update_AirQuality(BOT_ID, json.dumps(temp_data))
            else:
                make_ros_log('Got no air sensor data so far')
        except Exception as e:
            print(e)

        time.sleep(0.25)


def air_sensor_callback(data):
    try:
        air_sensor_data['data'] = data
    except Exception as e:
        print(e)


def violate_viatra_constraints():
    while True:
        # 1 - violated, when moving speed is > 0.25
        data = velocity_data['data']

        if data != NA:
            rotation = data.angular.z
        else:
            rotation = 0.0

        data_vel_viol = {'rotation': rotation, 'speed': get_random_float(0.3, 0.5)}
        update_Velocity(BOT_ID, json.dumps(data_vel_viol))

        print("Violation Velocity:" + str(data_vel_viol))

        # 2 - violated, when battery level is < 5%
        voltage = float(battery_state_data['data'].voltage)
        voltage = round(voltage, 2)

        power_supply_temperature = battery_state_data['data'].power_supply_health

        data_bat_perc_viol = {'percentage': get_random_float(0.0, 4.9), 'voltage': voltage,
                              'powerSupplyTemperature': power_supply_temperature}
        update_BatteryStatus(BOT_ID, json.dumps(data_bat_perc_viol))
        print("Violation Battery Percentage:" + str(data_bat_perc_viol))

        # 3 - violated, when battery voltage is outside range of 10.5 and 12.5
        battery = battery_state_data['data'].percentage - 1
        battery *= 1000
        battery = round(battery, 2)

        random_int = get_random_integer(0, 9)
        if random_int % 2 == 0:
            # set voltage below 10.5
            viol_voltage = get_random_float(0.0, 10.4)
        else:
            # set voltage above 12.5
            viol_voltage = get_random_float(12.6, 50.0)

        data_bat_vol_viol = {'percentage': battery, 'voltage': viol_voltage,
                             'powerSupplyTemperature': power_supply_temperature}
        update_BatteryStatus(BOT_ID, json.dumps(data_bat_vol_viol))
        print("Violation Voltage:" + str(data_bat_vol_viol))

        # 4 - violated, when powerSupplyStatus shows something other than unknown or good (value is > 1)
        viol_power_supply_temperature = get_random_integer(2, 8)
        data_bat_ps_viol = {'percentage': battery, 'voltage': voltage,
                            'powerSupplyTemperature': viol_power_supply_temperature}
        update_BatteryStatus(BOT_ID, json.dumps(data_bat_ps_viol))
        print("Violation Powersupplystatus:" + str(data_bat_ps_viol))

        # 5 - violated, when a diagnostics message shows an error (value is 2)
        arr_random = [0, 0, 0, 0, 2]
        random.shuffle(arr_random)

        if is_first_esper_viol_running:
            level_of_operation_actuator_value = 3
        else:
            level_of_operation_actuator_value = arr_random[1]

        data_viol_diag = {'levelOfOperationIMUSensor': arr_random[0],
                          'levelOfOperationActuator': level_of_operation_actuator_value,
                          'levelOfOperationLidarSensor': arr_random[2],
                          'levelOfOperationPowerSystem': arr_random[3],
                          'levelOfOperationAnalogButton': arr_random[4]
                          }

        update_Diagnostics(BOT_ID, json.dumps(data_viol_diag))
        print("Violation Diagnostics:" + str(data_viol_diag))

        # 6 - violated, when ppm (air-quality) is > 800
        data_aq_viol = {'partsPerMillion': get_random_integer(801, 5000)}
        update_AirQuality(BOT_ID, json.dumps(data_aq_viol))
        print("Violation Air-Quality:" + str(data_aq_viol))

        # 7 - violated, when distance to next obstacle is < 0.05
        data_laser_viol = {'smallestRange': get_random_float(0.0, 0.04)}
        update_LaserScan(BOT_ID, json.dumps(data_laser_viol))
        print("Violation smallestRange:" + str(data_laser_viol) + "\n\n")

        time.sleep(30)


def violate_first_esper_constraint():
    global is_first_esper_viol_running
    while True:
        is_first_esper_viol_running = True
        diag_viol = {'levelOfOperationIMUSensor': 0,
                     'levelOfOperationActuator': 3,
                     'levelOfOperationLidarSensor': 0,
                     'levelOfOperationPowerSystem': 0,
                     'levelOfOperationAnalogButton': 0
                     }

        update_Diagnostics(BOT_ID, json.dumps(diag_viol))

        time.sleep(11)
        is_first_esper_viol_running = False

        time.sleep(19)


def violate_sec_and_third_esper_constraint():
    global is_sec_and_third_esper_viol_running
    while True:
        is_sec_and_third_esper_viol_running = True

        # second constraint: battery < 25%, then no speed above 0.10 on average on the next 6 velocity measurements
        # set battery initially to < 25 %, and use the other values of the object as usual

        data_battery = {'percentage': NA, 'voltage': NA, 'powerSupplyTemperature': NA}

        data_battery['percentage'] = get_random_float(6.0, 24.0)

        voltage = float(battery_state_data['data'].voltage)
        data_battery['voltage'] = round(voltage, 2)

        power_supply_temperature = battery_state_data['data'].power_supply_health
        data_battery['powerSupplyTemperature'] = power_supply_temperature

        update_BatteryStatus(BOT_ID, json.dumps(data_battery))

        # update the velocity 6 times with values higher than 0.10 to trigger the constraint
        data = velocity_data['data']

        if data != NA:
            rotation = data.angular.z
        else:
            rotation = 0.0

        data_vel_viol = {'rotation': rotation, 'speed': get_random_float(0.11, 0.22)}
        update_Velocity(BOT_ID, json.dumps(data_vel_viol))
        data_vel_viol = {'rotation': rotation, 'speed': get_random_float(0.11, 0.22)}
        update_Velocity(BOT_ID, json.dumps(data_vel_viol))
        data_vel_viol = {'rotation': rotation, 'speed': get_random_float(0.11, 0.22)}
        update_Velocity(BOT_ID, json.dumps(data_vel_viol))
        data_vel_viol = {'rotation': rotation, 'speed': get_random_float(0.11, 0.22)}
        update_Velocity(BOT_ID, json.dumps(data_vel_viol))
        data_vel_viol = {'rotation': rotation, 'speed': get_random_float(0.11, 0.22)}
        update_Velocity(BOT_ID, json.dumps(data_vel_viol))
        data_vel_viol = {'rotation': rotation, 'speed': get_random_float(0.11, 0.22)}
        update_Velocity(BOT_ID, json.dumps(data_vel_viol))

        # third esper constraint: when moving, it is not allowed to measure the air quality within 5 seconds
        aq_data = {'partsPerMillion': get_random_integer(0, 1000)}
        update_AirQuality(BOT_ID, json.dumps(aq_data))

        is_sec_and_third_esper_viol_running = False

        time.sleep(30)


def listener():
    # init listener node
    rospy.init_node('turtle_listener', anonymous=True)

    # setup api
    init_api()

    # register a bot
    register_obj = {'id': BOT_ID}
    register_TurtleBot(json.dumps(register_obj))

    # specify subscriber topics
    rospy.Subscriber('battery_state', BatteryState, battery_state_callback)
    rospy.Subscriber('cmd_vel', Twist, cmd_vel_callback)
    rospy.Subscriber('diagnostics', DiagnosticArray, diagnostic_callback)
    rospy.Subscriber('joint_states', JointState, joint_state_callback)
    rospy.Subscriber('magnetic_field', MagneticField, magnetic_field_callback)
    rospy.Subscriber('version_info', VersionInfo, version_info_callback)
    rospy.Subscriber('sensor_state', SensorState, sensor_state_callback)
    rospy.Subscriber('odom', Odometry, odometry_callback)
    rospy.Subscriber('scan', LaserScan, laser_scan_callback)
    rospy.Subscriber('ros_sensor/air_sensor', String, air_sensor_callback)

    # create threads for the topics
    threading.Timer(1, handle_battery_state_data).start()
    threading.Timer(1, handle_velocity_data).start()
    threading.Timer(1, handle_diagnostics_data).start()
    threading.Timer(1, handle_joint_states_data).start()
    threading.Timer(1, handle_magnetic_field_data).start()
    threading.Timer(1, handle_version_info_data).start()
    threading.Timer(1, handle_sensor_state_data).start()
    threading.Timer(1, handle_odometry_data).start()
    threading.Timer(1, handle_laser_scan_data).start()
    threading.Timer(1, handle_air_sensor_data).start()

    # threads for violation of constraints
    threading.Timer(1, violate_viatra_constraints).start()
    threading.Timer(1, violate_first_esper_constraint).start()
    threading.Timer(1, violate_sec_and_third_esper_constraint).start()

    # do not stop
    rospy.spin()


# Convert a ROS message to JSON format
def ros_msg2json(msg):
    y = yaml.safe_load(str(msg))
    return json.dumps(y, indent=4)


if __name__ == '__main__':
    listener()
