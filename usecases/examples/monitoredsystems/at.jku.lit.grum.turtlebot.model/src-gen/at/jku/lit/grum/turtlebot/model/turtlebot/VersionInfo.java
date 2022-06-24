/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getHardware <em>Hardware</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getFirmware <em>Firmware</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getSoftware <em>Software</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getVersionInfo()
 * @model
 * @generated
 */
public interface VersionInfo extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' attribute.
	 * @see #setHardware(String)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getVersionInfo_Hardware()
	 * @model
	 * @generated
	 */
	String getHardware();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getHardware <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' attribute.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(String value);

	/**
	 * Returns the value of the '<em><b>Firmware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware</em>' attribute.
	 * @see #setFirmware(String)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getVersionInfo_Firmware()
	 * @model
	 * @generated
	 */
	String getFirmware();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getFirmware <em>Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware</em>' attribute.
	 * @see #getFirmware()
	 * @generated
	 */
	void setFirmware(String value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' attribute.
	 * @see #setSoftware(String)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getVersionInfo_Software()
	 * @model
	 * @generated
	 */
	String getSoftware();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getSoftware <em>Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' attribute.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(String value);

} // VersionInfo
