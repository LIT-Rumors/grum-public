
## The PiCar Example 

For Demo purposes, we have created a simple example using a [PiCar](https://www.sunfounder.com/products/raspberrypi-sensor-car) (Raspberry Pi powered - Python controllable car)
In the following we describe each step to get the example up and running.

- [Modeling Project](/usecases/examples/monitoredsystems/at.jku.lit.grum.picar.model): ``at.jku.lit.grum.picar.model``

- Generated GRuM Projects: [here](/usecases/examples/monitoredsystems/generated/picar)


<img src="https://user-images.githubusercontent.com/24531486/172547924-d5d82048-fb8c-4123-8d5c-c377f6a78898.jpg" width="400" />

### Start the GRUM Development platform
We provide an Eclipse Update Site to install all necessary components - Please see the [GRuM Installation Instructions](INSTALLATION.md) on how to install GRuM The Update Site contains all relevant plugins and a code generator for both Python and Java Probes



### Domain Model Fragment (DMF)

The ecore model represents the  ``Domain Model Fragment`` containing the relevant monitoring Information of the PiCar System.

<img src="https://github.com/LIT-Rumors/grum/blob/grum-public/wiki/images/ecore_picar.png" width="600" />

When creating the DMF 2 things need to be considered:

1) The Model needs a "container" i.e., a System (the ``PicarSystem``) that contains the respective Agents (the ``Picar``).
2) All Monitorable Properties and Agents need to be a subclass of an abstract Class called ``IdableElement`` (this is a small inconvenience in our current prototype used when generating the APIs - we are currently working on improving this part)


We provide examples for both the UAV system and the TurtleBot3 robots:

- [Dronology UAV system](/wiki/SUM_DRONOLOGY.md): ``at.jku.lit.grum.dronology.model``
- [TurtleBot3 robots](/wiki/SUM_TURTLEBOT.md): ``at.jku.lit.grum.turtlebot.model``


#### Generate Ecore Classes using the GenModel

When Agents, Monitorable Properties, etc. are added to the DMF, the respective ecore classes need to be generated.

In the genmodel use "Generate All" and Eclipse will automaticall generate all projects and relevant Ecore Code.

![image](https://user-images.githubusercontent.com/24531486/168985229-b63ec905-a199-459d-888a-fa4648dfe65e.png)



### Weaved Monitoring Model (WD)

The Weaved Monitoring Model contains the relevant information, what should be monitored, where should data be sent to, and what topic do relvant properties belong to.

<img src="https://github.com/LIT-Rumors/grum/blob/grum-public/wiki/images/weaved_picar.png" height="650" />



#### Generate Platform and Probe Code

Once the DMF and WD are created, the Monitoring Platform and Probe code can be generated.

Currently we provided 2 different Probe APIs, one for Java-based systems, one for Python-based ROS applications.

![image](https://user-images.githubusercontent.com/24531486/168986687-f7b2358a-c125-42fc-8cef-aa7ee7bafe7d.png)

Selecting the respective generator creates a number of different projects.
See the [monitoring example for the PiCar Platform](/wiki/USE_GRUM.md)


