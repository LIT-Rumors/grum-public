/**
 */
package at.jku.lit.grum.dronology.model.dronology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage
 * @generated
 */
public interface DronologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DronologyFactory eINSTANCE = at.jku.lit.grum.dronology.model.dronology.impl.DronologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Drone System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drone System</em>'.
	 * @generated
	 */
	DroneSystem createDroneSystem();

	/**
	 * Returns a new object of class '<em>Drone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drone</em>'.
	 * @generated
	 */
	Drone createDrone();

	/**
	 * Returns a new object of class '<em>Battery Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Status</em>'.
	 * @generated
	 */
	BatteryStatus createBatteryStatus();

	/**
	 * Returns a new object of class '<em>Systemhealth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Systemhealth</em>'.
	 * @generated
	 */
	Systemhealth createSystemhealth();

	/**
	 * Returns a new object of class '<em>Dronestate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dronestate</em>'.
	 * @generated
	 */
	Dronestate createDronestate();

	/**
	 * Returns a new object of class '<em>Operationmode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operationmode</em>'.
	 * @generated
	 */
	Operationmode createOperationmode();

	/**
	 * Returns a new object of class '<em>Flight Controller Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flight Controller Data</em>'.
	 * @generated
	 */
	FlightControllerData createFlightControllerData();

	/**
	 * Returns a new object of class '<em>Dronecommand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dronecommand</em>'.
	 * @generated
	 */
	Dronecommand createDronecommand();

	/**
	 * Returns a new object of class '<em>Flight Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flight Plan</em>'.
	 * @generated
	 */
	FlightPlan createFlightPlan();

	/**
	 * Returns a new object of class '<em>Startupchecks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Startupchecks</em>'.
	 * @generated
	 */
	Startupchecks createStartupchecks();

	/**
	 * Returns a new object of class '<em>LLA Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LLA Coordinate</em>'.
	 * @generated
	 */
	LLACoordinate createLLACoordinate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DronologyPackage getDronologyPackage();

} //DronologyFactory
