/**
 */
package Monitoring;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitorable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.MonitorableElement#getTopic <em>Topic</em>}</li>
 *   <li>{@link Monitoring.MonitorableElement#isSync <em>Sync</em>}</li>
 * </ul>
 *
 * @see Monitoring.MonitoringPackage#getMonitorableElement()
 * @model abstract="true"
 * @generated
 */
public interface MonitorableElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see Monitoring.MonitoringPackage#getMonitorableElement_Topic()
	 * @model
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link Monitoring.MonitorableElement#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

	/**
	 * Returns the value of the '<em><b>Sync</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync</em>' attribute.
	 * @see #setSync(boolean)
	 * @see Monitoring.MonitoringPackage#getMonitorableElement_Sync()
	 * @model default="true"
	 * @generated
	 */
	boolean isSync();

	/**
	 * Sets the value of the '{@link Monitoring.MonitorableElement#isSync <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync</em>' attribute.
	 * @see #isSync()
	 * @generated
	 */
	void setSync(boolean value);

} // MonitorableElement
