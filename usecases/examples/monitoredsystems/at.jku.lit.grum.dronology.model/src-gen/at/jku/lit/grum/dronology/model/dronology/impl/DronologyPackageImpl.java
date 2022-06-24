/**
 */
package at.jku.lit.grum.dronology.model.dronology.impl;

import at.jku.lit.grum.dronology.model.dronology.BatteryStatus;
import at.jku.lit.grum.dronology.model.dronology.Drone;
import at.jku.lit.grum.dronology.model.dronology.DroneSystem;
import at.jku.lit.grum.dronology.model.dronology.Dronecommand;
import at.jku.lit.grum.dronology.model.dronology.Dronestate;
import at.jku.lit.grum.dronology.model.dronology.DronologyFactory;
import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;
import at.jku.lit.grum.dronology.model.dronology.FlightControllerData;
import at.jku.lit.grum.dronology.model.dronology.FlightMode;
import at.jku.lit.grum.dronology.model.dronology.FlightPlan;
import at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus;
import at.jku.lit.grum.dronology.model.dronology.IdableElement;
import at.jku.lit.grum.dronology.model.dronology.LLACoordinate;
import at.jku.lit.grum.dronology.model.dronology.Operationmode;
import at.jku.lit.grum.dronology.model.dronology.Startupchecks;
import at.jku.lit.grum.dronology.model.dronology.SystemStatus;
import at.jku.lit.grum.dronology.model.dronology.Systemhealth;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DronologyPackageImpl extends EPackageImpl implements DronologyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droneSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemhealthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dronestateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationmodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flightControllerDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dronecommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flightPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startupchecksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass llaCoordinateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flightPlanStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flightModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DronologyPackageImpl() {
		super(eNS_URI, DronologyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DronologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DronologyPackage init() {
		if (isInited)
			return (DronologyPackage) EPackage.Registry.INSTANCE.getEPackage(DronologyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDronologyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DronologyPackageImpl theDronologyPackage = registeredDronologyPackage instanceof DronologyPackageImpl
				? (DronologyPackageImpl) registeredDronologyPackage
				: new DronologyPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDronologyPackage.createPackageContents();

		// Initialize created meta-data
		theDronologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDronologyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DronologyPackage.eNS_URI, theDronologyPackage);
		return theDronologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDroneSystem() {
		return droneSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneSystem_Drones() {
		return (EReference) droneSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrone() {
		return droneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Dronestate() {
		return (EReference) droneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Dronecommand() {
		return (EReference) droneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Homelocation() {
		return (EReference) droneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Startupchecks() {
		return (EReference) droneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_GeofenceDistance() {
		return (EAttribute) droneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Operationmode() {
		return (EReference) droneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Flightplan() {
		return (EReference) droneEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Systemhealth() {
		return (EReference) droneEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Flightcontrollerdata() {
		return (EReference) droneEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatteryStatus() {
		return batteryStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryStatus_Level() {
		return (EAttribute) batteryStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryStatus_Voltage() {
		return (EAttribute) batteryStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryStatus_Current() {
		return (EAttribute) batteryStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemhealth() {
		return systemhealthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemhealth_Status() {
		return (EAttribute) systemhealthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDronestate() {
		return dronestateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronestate_Location() {
		return (EReference) dronestateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronestate_Batterystatus() {
		return (EReference) dronestateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronestate_Armed() {
		return (EAttribute) dronestateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronestate_Groundspeed() {
		return (EAttribute) dronestateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronestate_Mode() {
		return (EAttribute) dronestateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronestate_Armable() {
		return (EAttribute) dronestateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronestate_Status() {
		return (EAttribute) dronestateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdableElement() {
		return idableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdableElement_Id() {
		return (EAttribute) idableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmode() {
		return operationmodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmode_Mode() {
		return (EAttribute) operationmodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmode_IsInMission() {
		return (EAttribute) operationmodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmode_MissionName() {
		return (EAttribute) operationmodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlightControllerData() {
		return flightControllerDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightControllerData_Num_satellites() {
		return (EAttribute) flightControllerDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightControllerData_Eph() {
		return (EAttribute) flightControllerDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightControllerData_Epv() {
		return (EAttribute) flightControllerDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightControllerData_Roll() {
		return (EAttribute) flightControllerDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightControllerData_Pitch() {
		return (EAttribute) flightControllerDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightControllerData_Yaw() {
		return (EAttribute) flightControllerDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightControllerData_Fix_type() {
		return (EAttribute) flightControllerDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDronecommand() {
		return dronecommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronecommand_Commandid() {
		return (EAttribute) dronecommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronecommand_Timestamp() {
		return (EAttribute) dronecommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronecommand_Command() {
		return (EAttribute) dronecommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronecommand_X() {
		return (EAttribute) dronecommandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronecommand_Y() {
		return (EAttribute) dronecommandEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDronecommand_Z() {
		return (EAttribute) dronecommandEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlightPlan() {
		return flightPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPlan_StartTime() {
		return (EAttribute) flightPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPlan_EndTime() {
		return (EAttribute) flightPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPlan_FlightID() {
		return (EAttribute) flightPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlightPlan_StartLocation() {
		return (EReference) flightPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlightPlan_EndLocation() {
		return (EReference) flightPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPlan_Status() {
		return (EAttribute) flightPlanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartupchecks() {
		return startupchecksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartupchecks_Armingstatus() {
		return (EAttribute) startupchecksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartupchecks_Systemstatus() {
		return (EAttribute) startupchecksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartupchecks_Mode() {
		return (EAttribute) startupchecksEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartupchecks_Num_satellites() {
		return (EAttribute) startupchecksEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartupchecks_Armable() {
		return (EAttribute) startupchecksEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLLACoordinate() {
		return llaCoordinateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLLACoordinate_Y() {
		return (EAttribute) llaCoordinateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLLACoordinate_Z() {
		return (EAttribute) llaCoordinateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLLACoordinate_X() {
		return (EAttribute) llaCoordinateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToStringMap() {
		return stringToStringMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMap_Key() {
		return (EAttribute) stringToStringMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMap_Value() {
		return (EAttribute) stringToStringMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlightPlanStatus() {
		return flightPlanStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemStatus() {
		return systemStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlightMode() {
		return flightModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronologyFactory getDronologyFactory() {
		return (DronologyFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		droneSystemEClass = createEClass(DRONE_SYSTEM);
		createEReference(droneSystemEClass, DRONE_SYSTEM__DRONES);

		droneEClass = createEClass(DRONE);
		createEReference(droneEClass, DRONE__DRONESTATE);
		createEReference(droneEClass, DRONE__DRONECOMMAND);
		createEReference(droneEClass, DRONE__HOMELOCATION);
		createEReference(droneEClass, DRONE__STARTUPCHECKS);
		createEAttribute(droneEClass, DRONE__GEOFENCE_DISTANCE);
		createEReference(droneEClass, DRONE__OPERATIONMODE);
		createEReference(droneEClass, DRONE__FLIGHTPLAN);
		createEReference(droneEClass, DRONE__SYSTEMHEALTH);
		createEReference(droneEClass, DRONE__FLIGHTCONTROLLERDATA);

		batteryStatusEClass = createEClass(BATTERY_STATUS);
		createEAttribute(batteryStatusEClass, BATTERY_STATUS__LEVEL);
		createEAttribute(batteryStatusEClass, BATTERY_STATUS__VOLTAGE);
		createEAttribute(batteryStatusEClass, BATTERY_STATUS__CURRENT);

		systemhealthEClass = createEClass(SYSTEMHEALTH);
		createEAttribute(systemhealthEClass, SYSTEMHEALTH__STATUS);

		dronestateEClass = createEClass(DRONESTATE);
		createEReference(dronestateEClass, DRONESTATE__LOCATION);
		createEReference(dronestateEClass, DRONESTATE__BATTERYSTATUS);
		createEAttribute(dronestateEClass, DRONESTATE__ARMED);
		createEAttribute(dronestateEClass, DRONESTATE__GROUNDSPEED);
		createEAttribute(dronestateEClass, DRONESTATE__MODE);
		createEAttribute(dronestateEClass, DRONESTATE__ARMABLE);
		createEAttribute(dronestateEClass, DRONESTATE__STATUS);

		idableElementEClass = createEClass(IDABLE_ELEMENT);
		createEAttribute(idableElementEClass, IDABLE_ELEMENT__ID);

		operationmodeEClass = createEClass(OPERATIONMODE);
		createEAttribute(operationmodeEClass, OPERATIONMODE__MODE);
		createEAttribute(operationmodeEClass, OPERATIONMODE__IS_IN_MISSION);
		createEAttribute(operationmodeEClass, OPERATIONMODE__MISSION_NAME);

		flightControllerDataEClass = createEClass(FLIGHT_CONTROLLER_DATA);
		createEAttribute(flightControllerDataEClass, FLIGHT_CONTROLLER_DATA__NUM_SATELLITES);
		createEAttribute(flightControllerDataEClass, FLIGHT_CONTROLLER_DATA__EPH);
		createEAttribute(flightControllerDataEClass, FLIGHT_CONTROLLER_DATA__EPV);
		createEAttribute(flightControllerDataEClass, FLIGHT_CONTROLLER_DATA__ROLL);
		createEAttribute(flightControllerDataEClass, FLIGHT_CONTROLLER_DATA__PITCH);
		createEAttribute(flightControllerDataEClass, FLIGHT_CONTROLLER_DATA__YAW);
		createEAttribute(flightControllerDataEClass, FLIGHT_CONTROLLER_DATA__FIX_TYPE);

		dronecommandEClass = createEClass(DRONECOMMAND);
		createEAttribute(dronecommandEClass, DRONECOMMAND__COMMANDID);
		createEAttribute(dronecommandEClass, DRONECOMMAND__TIMESTAMP);
		createEAttribute(dronecommandEClass, DRONECOMMAND__COMMAND);
		createEAttribute(dronecommandEClass, DRONECOMMAND__X);
		createEAttribute(dronecommandEClass, DRONECOMMAND__Y);
		createEAttribute(dronecommandEClass, DRONECOMMAND__Z);

		flightPlanEClass = createEClass(FLIGHT_PLAN);
		createEAttribute(flightPlanEClass, FLIGHT_PLAN__START_TIME);
		createEAttribute(flightPlanEClass, FLIGHT_PLAN__END_TIME);
		createEAttribute(flightPlanEClass, FLIGHT_PLAN__FLIGHT_ID);
		createEReference(flightPlanEClass, FLIGHT_PLAN__START_LOCATION);
		createEReference(flightPlanEClass, FLIGHT_PLAN__END_LOCATION);
		createEAttribute(flightPlanEClass, FLIGHT_PLAN__STATUS);

		startupchecksEClass = createEClass(STARTUPCHECKS);
		createEAttribute(startupchecksEClass, STARTUPCHECKS__ARMINGSTATUS);
		createEAttribute(startupchecksEClass, STARTUPCHECKS__SYSTEMSTATUS);
		createEAttribute(startupchecksEClass, STARTUPCHECKS__MODE);
		createEAttribute(startupchecksEClass, STARTUPCHECKS__NUM_SATELLITES);
		createEAttribute(startupchecksEClass, STARTUPCHECKS__ARMABLE);

		llaCoordinateEClass = createEClass(LLA_COORDINATE);
		createEAttribute(llaCoordinateEClass, LLA_COORDINATE__Y);
		createEAttribute(llaCoordinateEClass, LLA_COORDINATE__Z);
		createEAttribute(llaCoordinateEClass, LLA_COORDINATE__X);

		stringToStringMapEClass = createEClass(STRING_TO_STRING_MAP);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__KEY);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__VALUE);

		// Create enums
		flightPlanStatusEEnum = createEEnum(FLIGHT_PLAN_STATUS);
		systemStatusEEnum = createEEnum(SYSTEM_STATUS);
		flightModeEEnum = createEEnum(FLIGHT_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		droneEClass.getESuperTypes().add(this.getIdableElement());
		systemhealthEClass.getESuperTypes().add(this.getIdableElement());
		dronestateEClass.getESuperTypes().add(this.getIdableElement());
		operationmodeEClass.getESuperTypes().add(this.getIdableElement());
		flightControllerDataEClass.getESuperTypes().add(this.getIdableElement());
		dronecommandEClass.getESuperTypes().add(this.getIdableElement());
		flightPlanEClass.getESuperTypes().add(this.getIdableElement());
		startupchecksEClass.getESuperTypes().add(this.getIdableElement());
		llaCoordinateEClass.getESuperTypes().add(this.getIdableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(droneSystemEClass, DroneSystem.class, "DroneSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDroneSystem_Drones(), this.getDrone(), null, "drones", null, 0, -1, DroneSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(droneEClass, Drone.class, "Drone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrone_Dronestate(), this.getDronestate(), null, "dronestate", null, 0, 1, Drone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_Dronecommand(), this.getDronecommand(), null, "dronecommand", null, 0, 1, Drone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_Homelocation(), this.getLLACoordinate(), null, "homelocation", null, 0, 1, Drone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_Startupchecks(), this.getStartupchecks(), null, "startupchecks", null, 0, 1,
				Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_GeofenceDistance(), ecorePackage.getEDoubleObject(), "geofenceDistance", "0.0", 0, 1,
				Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);
		initEReference(getDrone_Operationmode(), this.getOperationmode(), null, "operationmode", null, 0, 1,
				Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_Flightplan(), this.getFlightPlan(), null, "flightplan", null, 0, 1, Drone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_Systemhealth(), this.getSystemhealth(), null, "systemhealth", null, 0, 1, Drone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_Flightcontrollerdata(), this.getFlightControllerData(), null, "flightcontrollerdata",
				null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryStatusEClass, BatteryStatus.class, "BatteryStatus", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatteryStatus_Level(), ecorePackage.getEDoubleObject(), "level", null, 0, 1,
				BatteryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryStatus_Voltage(), ecorePackage.getEDoubleObject(), "voltage", null, 0, 1,
				BatteryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryStatus_Current(), ecorePackage.getEDoubleObject(), "current", null, 0, 1,
				BatteryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(systemhealthEClass, Systemhealth.class, "Systemhealth", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemhealth_Status(), theXMLTypePackage.getString(), "status", null, 0, 1,
				Systemhealth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dronestateEClass, Dronestate.class, "Dronestate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDronestate_Location(), this.getLLACoordinate(), null, "location", null, 1, 1,
				Dronestate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDronestate_Batterystatus(), this.getBatteryStatus(), null, "batterystatus", null, 1, 1,
				Dronestate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDronestate_Armed(), ecorePackage.getEBoolean(), "armed", null, 0, 1, Dronestate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDronestate_Groundspeed(), ecorePackage.getEDouble(), "groundspeed", null, 0, 1,
				Dronestate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDronestate_Mode(), this.getFlightMode(), "mode", null, 0, 1, Dronestate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDronestate_Armable(), ecorePackage.getEBooleanObject(), "armable", "false", 0, 1,
				Dronestate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDronestate_Status(), ecorePackage.getEString(), "status", null, 0, 1, Dronestate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idableElementEClass, IdableElement.class, "IdableElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdableElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, IdableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationmodeEClass, Operationmode.class, "Operationmode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationmode_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, Operationmode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmode_IsInMission(), ecorePackage.getEBoolean(), "isInMission", null, 0, 1,
				Operationmode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmode_MissionName(), ecorePackage.getEString(), "missionName", null, 0, 1,
				Operationmode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(flightControllerDataEClass, FlightControllerData.class, "FlightControllerData", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlightControllerData_Num_satellites(), theXMLTypePackage.getDouble(), "num_satellites", null,
				0, 1, FlightControllerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightControllerData_Eph(), theXMLTypePackage.getDouble(), "eph", null, 0, 1,
				FlightControllerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightControllerData_Epv(), theXMLTypePackage.getDouble(), "epv", null, 0, 1,
				FlightControllerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightControllerData_Roll(), theXMLTypePackage.getDouble(), "roll", null, 0, 1,
				FlightControllerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightControllerData_Pitch(), theXMLTypePackage.getDouble(), "pitch", null, 0, 1,
				FlightControllerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightControllerData_Yaw(), theXMLTypePackage.getDouble(), "yaw", null, 0, 1,
				FlightControllerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightControllerData_Fix_type(), theXMLTypePackage.getInt(), "fix_type", null, 0, 1,
				FlightControllerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dronecommandEClass, Dronecommand.class, "Dronecommand", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDronecommand_Commandid(), ecorePackage.getEString(), "commandid", null, 0, 1,
				Dronecommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDronecommand_Timestamp(), theXMLTypePackage.getLongObject(), "timestamp", null, 0, 1,
				Dronecommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDronecommand_Command(), ecorePackage.getEString(), "command", null, 0, 1, Dronecommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDronecommand_X(), theXMLTypePackage.getDouble(), "x", null, 0, 1, Dronecommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDronecommand_Y(), theXMLTypePackage.getDouble(), "y", null, 0, 1, Dronecommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDronecommand_Z(), theXMLTypePackage.getDouble(), "z", null, 0, 1, Dronecommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flightPlanEClass, FlightPlan.class, "FlightPlan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlightPlan_StartTime(), theXMLTypePackage.getLong(), "startTime", null, 0, 1,
				FlightPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPlan_EndTime(), theXMLTypePackage.getLong(), "endTime", null, 0, 1, FlightPlan.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPlan_FlightID(), ecorePackage.getEString(), "flightID", null, 0, 1, FlightPlan.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlightPlan_StartLocation(), this.getLLACoordinate(), null, "startLocation", null, 0, 1,
				FlightPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlightPlan_EndLocation(), this.getLLACoordinate(), null, "endLocation", null, 0, 1,
				FlightPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPlan_Status(), this.getFlightPlanStatus(), "status", null, 0, 1, FlightPlan.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startupchecksEClass, Startupchecks.class, "Startupchecks", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartupchecks_Armingstatus(), ecorePackage.getEBooleanObject(), "armingstatus", "false", 0, 1,
				Startupchecks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartupchecks_Systemstatus(), this.getSystemStatus(), "systemstatus", null, 0, 1,
				Startupchecks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartupchecks_Mode(), this.getFlightMode(), "mode", null, 0, 1, Startupchecks.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartupchecks_Num_satellites(), ecorePackage.getEIntegerObject(), "num_satellites", null, 0,
				1, Startupchecks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartupchecks_Armable(), ecorePackage.getEBooleanObject(), "armable", "false", 0, 1,
				Startupchecks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(llaCoordinateEClass, LLACoordinate.class, "LLACoordinate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLLACoordinate_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, LLACoordinate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLLACoordinate_Z(), ecorePackage.getEDoubleObject(), "z", null, 0, 1, LLACoordinate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLLACoordinate_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, LLACoordinate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToStringMapEClass, Map.Entry.class, "StringToStringMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMap_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMap_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(flightPlanStatusEEnum, FlightPlanStatus.class, "FlightPlanStatus");
		addEEnumLiteral(flightPlanStatusEEnum, FlightPlanStatus.PLANNED);
		addEEnumLiteral(flightPlanStatusEEnum, FlightPlanStatus.FLYING);
		addEEnumLiteral(flightPlanStatusEEnum, FlightPlanStatus.COMPLETED);
		addEEnumLiteral(flightPlanStatusEEnum, FlightPlanStatus.ON_HOLD);

		initEEnum(systemStatusEEnum, SystemStatus.class, "SystemStatus");
		addEEnumLiteral(systemStatusEEnum, SystemStatus.STANDBY);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.UNINIT);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.BOOT);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.CALIBRATING);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.ACTIVE);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.CRITICAL);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.EMERGENCY);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.POWEROFF);

		initEEnum(flightModeEEnum, FlightMode.class, "FlightMode");
		addEEnumLiteral(flightModeEEnum, FlightMode.GUIDED);
		addEEnumLiteral(flightModeEEnum, FlightMode.STABILIZE);
		addEEnumLiteral(flightModeEEnum, FlightMode.AUTO);

		// Create resource
		createResource(eNS_URI);
	}

} //DronologyPackageImpl
