#  TurtleBot
[TurtleBot](https://emanual.robotis.com/docs/en/platform/turtlebot3/overview/) is a [ROS](https://www.ros.org/) standard platform robot. In GRuM, TurtleBot3 was used for evaluation. TurtleBot3 can be customized into various ways depending on the reconstruction of the mechanical parts and use of optional parts such as the computer and sensor. In addition, TurtleBot3 is evolved with cost-effective and small-sized SBC that is suitable for robust embedded system, 360 degree distance sensor and 3D printing technology. The TurtleBot3’s core technology is SLAM, Navigation and Manipulation, making it suitable for home service robots. The TurtleBot can run SLAM(simultaneous localization and mapping) algorithms to build a map and can drive around in a room. It can be controlled remotely from a laptop, joypad or Android-based smart phone. The TurtleBot can also follow a person’s legs as they walk in a room. Also the TurtleBot3 can be used as a mobile manipulator capable of manipulating an object by attaching a manipulator like OpenMANIPULATOR.



### The  TurtleBot DMF:

![image](https://user-images.githubusercontent.com/24531486/173831037-d7f7454f-2265-4775-be75-f21a9de2cf12.png)



### The  TurtleBot MW:

[Weaved Monitoring Model](/at.jku.se.monitoring.project/examples/monitoredsystems/at.jku.lit.grum.turtlebot.model/model/turtlebot_monitoring.mos)


### Constraints:

| CST | Description                                                                                                                              | Type |
|-----|------------------------------------------------------------------------------------------------------------------------------------------|------|
| T01        | Movement Speed Limit: To maintain accuracy during navigation, the bot must not move faster than 2.5m/s                            | Viatra       |   
| T02        | Minimum Battery Status: The Bot has to maintain a minimum battery level of 5%                                                     | Viatra       | 
| T03        | Minimum Battery Voltage:   The Bot has to maintain a voltage between 10.5  and 12.5 volts                                         | Viatra       | 
| T04        | Power Supply Health: The Bot's power supply must remain in a healthy condition, e.g., no overheating                              | Viatra       | 
| T05        | Diagnostics Error: The operating level of the hardware components (actuator etc.) must not be in an error state                   | Viatra       | 
| T06        | cotwo Limit: The cotwo measurements from the air quality sensor must not exceed a threshold of 800ppm                             | Viatra       | 
| T07        | Obstacle: The Bot must maintain a minimum distance of 5cm to an object, as detected by the Lidar unit                             | Viatra       | 
| T08        | Speed Reduction: When the bot operates  below 25% battery level, the speed must not exceed 2.0m/s anymore                         | Esper        | 
| T09        | Diagnostics temporal check: A stale state of the actuator must change within 10 sec. to another state                             | Esper        | 
| T10        | Measurements Accuracy: To ensure accurate measurements, an alert should be raised  when measurements are transmitted while moving | Esper        |




### The  Dronology GRuM Platform:

[Generated Grum Platform](/examples/monitoredsystems/generated/turtlebot/)
