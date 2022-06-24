#  Dronology
[Dronology](http://www.dronology.info) is  a Cyber-Physical System Research Incubator for for managing, controlling, and executing missions for UAVs



### The  Dronology DMF:

![image](https://user-images.githubusercontent.com/24531486/173560698-428136e7-da8d-4950-8a9f-92c9c5cdb284.png)


### The  Dronology MW:

[Weaved Monitoring Model](/at.jku.se.monitoring.project/examples/monitoredsystems/at.jku.lit.grum.dronology.model/model/dronology_monitoring.mos)


### Constraints:

| CST | Description                                                                                                                                                   | Type |
|-----|---------------------------------------------------------------------------------------------------------------------------------------------------------------|------|
| D01 | Altitude Restrictions: The UAV must not exceed  a maximum altitude of 50m                                                                                     | Viatra    |
| D02 | Speed Restrictions: The UAV must not exceed  a maximum speed of 15ms/s                                                                                        | Viatra    |
| D03 | Minimum Battery Level: The UAV has to maintain a minimum battery voltage of 10.5 V                                                                            | Viatra    |
| D04 | Valid Goto-Commands: A waypoint sent to the UAV must have valid latitude, longitude altitude values                                                           | Viatra    |
| D05 | Startup Arming Check: Before active, the UAV needs to compute its arming checks                                                                               | Viatra    |
| D06 | Flight Controller Startup: Before active, the UAV flight controller need to properly startup                                                                  | Viatra   |
| D07 | GPS: A min. number of 10 satellites must be available                                                                                                         | Viatra    |
| D08 | Flight Completion: An assigned route for a UAV has to be completed within 5 minutes                                                                           | Esper    |
| D09 | Update Frequency: State data from the UAV, updating its speed  and position must be sent at least every 2 sec                                                 | Esper    |
| D10 | Geolocation Accuracy: When GPS accuracy of the UAV is low for more than 30 sec., an active mission can not be continued and  manual control has to be assumed | Viatra/Esper  |




### The  Dronology GRuM Platform:

[Generated Grum Platform](/examples/monitoredsystems/generated/dronology/)

