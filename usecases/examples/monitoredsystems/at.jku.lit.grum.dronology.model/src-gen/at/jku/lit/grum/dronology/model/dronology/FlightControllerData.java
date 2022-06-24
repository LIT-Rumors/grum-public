/**
 */
package at.jku.lit.grum.dronology.model.dronology;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Controller Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getNum_satellites <em>Num satellites</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getEph <em>Eph</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getEpv <em>Epv</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getRoll <em>Roll</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getPitch <em>Pitch</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getYaw <em>Yaw</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getFix_type <em>Fix type</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightControllerData()
 * @model
 * @generated
 */
public interface FlightControllerData extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Num satellites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num satellites</em>' attribute.
	 * @see #setNum_satellites(double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightControllerData_Num_satellites()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getNum_satellites();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getNum_satellites <em>Num satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num satellites</em>' attribute.
	 * @see #getNum_satellites()
	 * @generated
	 */
	void setNum_satellites(double value);

	/**
	 * Returns the value of the '<em><b>Eph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eph</em>' attribute.
	 * @see #setEph(double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightControllerData_Eph()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getEph();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getEph <em>Eph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eph</em>' attribute.
	 * @see #getEph()
	 * @generated
	 */
	void setEph(double value);

	/**
	 * Returns the value of the '<em><b>Epv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epv</em>' attribute.
	 * @see #setEpv(double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightControllerData_Epv()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getEpv();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getEpv <em>Epv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epv</em>' attribute.
	 * @see #getEpv()
	 * @generated
	 */
	void setEpv(double value);

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #setRoll(double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightControllerData_Roll()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getRoll();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(double value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' attribute.
	 * @see #setPitch(double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightControllerData_Pitch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getPitch();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(double value);

	/**
	 * Returns the value of the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yaw</em>' attribute.
	 * @see #setYaw(double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightControllerData_Yaw()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getYaw();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getYaw <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yaw</em>' attribute.
	 * @see #getYaw()
	 * @generated
	 */
	void setYaw(double value);

	/**
	 * Returns the value of the '<em><b>Fix type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fix type</em>' attribute.
	 * @see #setFix_type(int)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightControllerData_Fix_type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getFix_type();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getFix_type <em>Fix type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fix type</em>' attribute.
	 * @see #getFix_type()
	 * @generated
	 */
	void setFix_type(int value);

} // FlightControllerData
