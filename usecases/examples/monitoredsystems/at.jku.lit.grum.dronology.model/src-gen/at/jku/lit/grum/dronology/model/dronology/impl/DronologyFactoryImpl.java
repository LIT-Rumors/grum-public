/**
 */
package at.jku.lit.grum.dronology.model.dronology.impl;

import at.jku.lit.grum.dronology.model.dronology.*;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DronologyFactoryImpl extends EFactoryImpl implements DronologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DronologyFactory init() {
		try {
			DronologyFactory theDronologyFactory = (DronologyFactory) EPackage.Registry.INSTANCE
					.getEFactory(DronologyPackage.eNS_URI);
			if (theDronologyFactory != null) {
				return theDronologyFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DronologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronologyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DronologyPackage.DRONE_SYSTEM:
			return createDroneSystem();
		case DronologyPackage.DRONE:
			return createDrone();
		case DronologyPackage.BATTERY_STATUS:
			return createBatteryStatus();
		case DronologyPackage.SYSTEMHEALTH:
			return createSystemhealth();
		case DronologyPackage.DRONESTATE:
			return createDronestate();
		case DronologyPackage.OPERATIONMODE:
			return createOperationmode();
		case DronologyPackage.FLIGHT_CONTROLLER_DATA:
			return createFlightControllerData();
		case DronologyPackage.DRONECOMMAND:
			return createDronecommand();
		case DronologyPackage.FLIGHT_PLAN:
			return createFlightPlan();
		case DronologyPackage.STARTUPCHECKS:
			return createStartupchecks();
		case DronologyPackage.LLA_COORDINATE:
			return createLLACoordinate();
		case DronologyPackage.STRING_TO_STRING_MAP:
			return (EObject) createStringToStringMap();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DronologyPackage.FLIGHT_PLAN_STATUS:
			return createFlightPlanStatusFromString(eDataType, initialValue);
		case DronologyPackage.SYSTEM_STATUS:
			return createSystemStatusFromString(eDataType, initialValue);
		case DronologyPackage.FLIGHT_MODE:
			return createFlightModeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DronologyPackage.FLIGHT_PLAN_STATUS:
			return convertFlightPlanStatusToString(eDataType, instanceValue);
		case DronologyPackage.SYSTEM_STATUS:
			return convertSystemStatusToString(eDataType, instanceValue);
		case DronologyPackage.FLIGHT_MODE:
			return convertFlightModeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneSystem createDroneSystem() {
		DroneSystemImpl droneSystem = new DroneSystemImpl();
		return droneSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drone createDrone() {
		DroneImpl drone = new DroneImpl();
		return drone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryStatus createBatteryStatus() {
		BatteryStatusImpl batteryStatus = new BatteryStatusImpl();
		return batteryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Systemhealth createSystemhealth() {
		SystemhealthImpl systemhealth = new SystemhealthImpl();
		return systemhealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dronestate createDronestate() {
		DronestateImpl dronestate = new DronestateImpl();
		return dronestate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operationmode createOperationmode() {
		OperationmodeImpl operationmode = new OperationmodeImpl();
		return operationmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightControllerData createFlightControllerData() {
		FlightControllerDataImpl flightControllerData = new FlightControllerDataImpl();
		return flightControllerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dronecommand createDronecommand() {
		DronecommandImpl dronecommand = new DronecommandImpl();
		return dronecommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightPlan createFlightPlan() {
		FlightPlanImpl flightPlan = new FlightPlanImpl();
		return flightPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Startupchecks createStartupchecks() {
		StartupchecksImpl startupchecks = new StartupchecksImpl();
		return startupchecks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLACoordinate createLLACoordinate() {
		LLACoordinateImpl llaCoordinate = new LLACoordinateImpl();
		return llaCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, BigDecimal> createStringToStringMap() {
		StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
		return stringToStringMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightPlanStatus createFlightPlanStatusFromString(EDataType eDataType, String initialValue) {
		FlightPlanStatus result = FlightPlanStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlightPlanStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStatus createSystemStatusFromString(EDataType eDataType, String initialValue) {
		SystemStatus result = SystemStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightMode createFlightModeFromString(EDataType eDataType, String initialValue) {
		FlightMode result = FlightMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlightModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronologyPackage getDronologyPackage() {
		return (DronologyPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DronologyPackage getPackage() {
		return DronologyPackage.eINSTANCE;
	}

} //DronologyFactoryImpl
