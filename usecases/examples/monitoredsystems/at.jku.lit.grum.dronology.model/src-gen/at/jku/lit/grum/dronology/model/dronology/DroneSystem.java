/**
 */
package at.jku.lit.grum.dronology.model.dronology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.DroneSystem#getDrones <em>Drones</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDroneSystem()
 * @model
 * @generated
 */
public interface DroneSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Drones</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.lit.grum.dronology.model.dronology.Drone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drones</em>' containment reference list.
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDroneSystem_Drones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Drone> getDrones();

} // DroneSystem
