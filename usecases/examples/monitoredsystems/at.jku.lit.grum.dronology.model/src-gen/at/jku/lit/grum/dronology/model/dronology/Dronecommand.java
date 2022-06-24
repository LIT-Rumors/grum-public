/**
 */
package at.jku.lit.grum.dronology.model.dronology;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dronecommand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getCommandid <em>Commandid</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getCommand <em>Command</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getX <em>X</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getY <em>Y</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronecommand()
 * @model
 * @generated
 */
public interface Dronecommand extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Commandid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commandid</em>' attribute.
	 * @see #setCommandid(String)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronecommand_Commandid()
	 * @model
	 * @generated
	 */
	String getCommandid();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getCommandid <em>Commandid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commandid</em>' attribute.
	 * @see #getCommandid()
	 * @generated
	 */
	void setCommandid(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Long)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronecommand_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.LongObject"
	 * @generated
	 */
	Long getTimestamp();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Long value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronecommand_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronecommand_X()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronecommand_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronecommand_Z()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

} // Dronecommand
