/**
 */
package at.jku.lit.grum.picar.model.picar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.PicarSystem#getPicars <em>Picars</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getPicarSystem()
 * @model
 * @generated
 */
public interface PicarSystem extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Picars</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.lit.grum.picar.model.picar.Picar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picars</em>' containment reference list.
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getPicarSystem_Picars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Picar> getPicars();

} // PicarSystem
