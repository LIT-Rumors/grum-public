/**
 */
package at.jku.lit.grum.dronology.model.dronology.util;

import at.jku.lit.grum.dronology.model.dronology.*;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage
 * @generated
 */
public class DronologyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DronologyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronologyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DronologyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DronologySwitch<Adapter> modelSwitch = new DronologySwitch<Adapter>() {
		@Override
		public Adapter caseDroneSystem(DroneSystem object) {
			return createDroneSystemAdapter();
		}

		@Override
		public Adapter caseDrone(Drone object) {
			return createDroneAdapter();
		}

		@Override
		public Adapter caseBatteryStatus(BatteryStatus object) {
			return createBatteryStatusAdapter();
		}

		@Override
		public Adapter caseSystemhealth(Systemhealth object) {
			return createSystemhealthAdapter();
		}

		@Override
		public Adapter caseDronestate(Dronestate object) {
			return createDronestateAdapter();
		}

		@Override
		public Adapter caseIdableElement(IdableElement object) {
			return createIdableElementAdapter();
		}

		@Override
		public Adapter caseOperationmode(Operationmode object) {
			return createOperationmodeAdapter();
		}

		@Override
		public Adapter caseFlightControllerData(FlightControllerData object) {
			return createFlightControllerDataAdapter();
		}

		@Override
		public Adapter caseDronecommand(Dronecommand object) {
			return createDronecommandAdapter();
		}

		@Override
		public Adapter caseFlightPlan(FlightPlan object) {
			return createFlightPlanAdapter();
		}

		@Override
		public Adapter caseStartupchecks(Startupchecks object) {
			return createStartupchecksAdapter();
		}

		@Override
		public Adapter caseLLACoordinate(LLACoordinate object) {
			return createLLACoordinateAdapter();
		}

		@Override
		public Adapter caseStringToStringMap(Map.Entry<String, BigDecimal> object) {
			return createStringToStringMapAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.DroneSystem <em>Drone System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.DroneSystem
	 * @generated
	 */
	public Adapter createDroneSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone
	 * @generated
	 */
	public Adapter createDroneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus <em>Battery Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.BatteryStatus
	 * @generated
	 */
	public Adapter createBatteryStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.Systemhealth <em>Systemhealth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.Systemhealth
	 * @generated
	 */
	public Adapter createSystemhealthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate <em>Dronestate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronestate
	 * @generated
	 */
	public Adapter createDronestateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.IdableElement <em>Idable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.IdableElement
	 * @generated
	 */
	public Adapter createIdableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.Operationmode <em>Operationmode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.Operationmode
	 * @generated
	 */
	public Adapter createOperationmodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData <em>Flight Controller Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightControllerData
	 * @generated
	 */
	public Adapter createFlightControllerDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand <em>Dronecommand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronecommand
	 * @generated
	 */
	public Adapter createDronecommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan <em>Flight Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlan
	 * @generated
	 */
	public Adapter createFlightPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks <em>Startupchecks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.Startupchecks
	 * @generated
	 */
	public Adapter createStartupchecksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.dronology.model.dronology.LLACoordinate <em>LLA Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.dronology.model.dronology.LLACoordinate
	 * @generated
	 */
	public Adapter createLLACoordinateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToStringMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DronologyAdapterFactory
