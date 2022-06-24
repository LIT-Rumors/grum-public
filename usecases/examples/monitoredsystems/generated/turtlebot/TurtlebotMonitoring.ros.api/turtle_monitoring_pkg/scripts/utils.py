import time
import math
import random
import rospy


def make_ros_log(msg):
    rospy.loginfo(time.ctime() + ' -- ' + msg + '\n\n')


def calculate_distance(new_position, old_position):
    # Calculate the distance between two Points (positions)
    x2 = new_position.x
    x1 = old_position.x
    y2 = new_position.y
    y1 = old_position.y
    dist = math.hypot(x2 - x1, y2 - y1)
    return dist


def get_random_integer(start, end):
    return random.randrange(start, end, 1)


def get_random_float(start, end):
    return round(random.uniform(start, end), 2)
