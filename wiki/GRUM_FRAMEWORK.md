# GRuM Framework


To provide support for the different parts of a runtime monitoring architecture and to ease the task of maintaining and co-evolving monitors, GRuM leverages MDE techniques to specify relevant monitoring properties and ultimately generate a complete monitoring infrastructure. One of the novel characteristics of GRuM is that for a System under Monitoring (SuM), both a __Set of Probes__, as well as a fully customized __Monitoring Platform__ can be generated based on a model describing the parts to be monitored. 

The _Modeling_ part relies on a Monitoring Meta-Model (MMM) and a system-specific Domain Model Fragment that is populated for a SuM; the _Code Generators_ responsible for generating the Monitoring Platform and the Probes for collecting data from the SuM; and finally the generated _Monitoring Platform_ itself, providing a number of runtime capabilities such as a runtime model, a query engine, and a middleware layer to connect external services.


<br><br>

1. [Monitoring Meta-Model (MMM)](https://github.com/LIT-Rumors/grum/blob/grum_v1/wiki/GRUM_FRAMEWORK.md#monitoring-meta-model-mmm)
1. [Domain Model Fragment (DMF)](https://github.com/LIT-Rumors/grum/blob/grum_v1/wiki/GRUM_FRAMEWORK.md#domain-model-fragment-dmf)
1. [Weaved Monitoring Model (WM)](
https://github.com/LIT-Rumors/grum/blob/grum_v1/wiki/GRUM_FRAMEWORK.md#weaved-monitoring-model-wm)


<br><br><br><br><br>


## Monitoring Meta-Model (MMM)



![image](https://github.com/LIT-Rumors/grum/blob/grum_v1/wiki/images/monitoring-mm.png)

The ``MoSystem`` describes the system (or parts of it to be monitored.

The ``MoConfig`` element defines the monitoring configuration for a specific system and is subsequently used to generate the code for a target system. It contains information regarding the monitoring setup, e.g., the server configuration (``Server``), and it specifies  elements of the system to be monitored.

Monitorable agents (``MoAgent``) represent elements of the system, such as individual machines, devices, or robots that are subjects for monitoring. Each agent has its own set of monitorable properties (``MoProperty``) that are exposed to the monitoring framework and used for checking constraints or logging.
Finally, the MMM provides support for defining derived properties (``DerivedProperty``) that are a result of a post-processing analysis such as data aggregation or querying the data model.


<br><br><br><br>

## Domain Model Fragment (DMF)


The Domain Model Fragment (DMF) contains those agents and properties of the SuM that should be collected and analyzed at runtime.

For the [PiCar example](/wiki/MODEL_NEW_SYSTEM.md) a  ``PiCar`` agent consists of different properties, such as the ``Status`` and  ``Location``
While a ``PiCar`` may also have other properties,  the Domain Model Fragment describes the subset of properties to be collected and analyzed by the monitoring framework. Properties can represent primitive data types (e.g., numbers, strings) or more complex aggregated elements. 


<img src="https://github.com/LIT-Rumors/grum/blob/grum_v1/wiki/images/ecore_picar.png" width="600" />


<br><br><br><br>

## Weaved Monitoring Model (WM)



In order to be able to generate monitoring code, the different elements specified in the Domain Model Fragment need to be linked to the concepts specified on the MMM.
These links are specified in the ``Weaved Monitoring Model (WM)`` and are subsequently used to determine which code fragments are generated for which element in the Domain Model Fragment.


<img src="https://github.com/LIT-Rumors/grum/blob/grum_v1/wiki/images/weaved_picar.png" height="650" />

In the WM of the ``PiCar``, for example, a ``PiCar`` element from the  Domain Model Fragment is linked to the ``MonitorableAgent`` concept from the MMM, whilst ``Status`` and ``Location`` are children of the PiCar, representing  ``MonitorableProperty`` which should be collected at runtime 

Additionally, the WM also contains information about the topic mappings as well as the server  
configuration which is used to automatically generate topic subscriptions and connection code.







