/**
 */
package Monitoring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.Server#getConnectionURL <em>Connection URL</em>}</li>
 *   <li>{@link Monitoring.Server#getConnectionOptions <em>Connection Options</em>}</li>
 * </ul>
 *
 * @see Monitoring.MonitoringPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Connection URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection URL</em>' attribute.
	 * @see #setConnectionURL(String)
	 * @see Monitoring.MonitoringPackage#getServer_ConnectionURL()
	 * @model
	 * @generated
	 */
	String getConnectionURL();

	/**
	 * Sets the value of the '{@link Monitoring.Server#getConnectionURL <em>Connection URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection URL</em>' attribute.
	 * @see #getConnectionURL()
	 * @generated
	 */
	void setConnectionURL(String value);

	/**
	 * Returns the value of the '<em><b>Connection Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Options</em>' containment reference.
	 * @see #setConnectionOptions(ConnectionOptions)
	 * @see Monitoring.MonitoringPackage#getServer_ConnectionOptions()
	 * @model containment="true"
	 * @generated
	 */
	ConnectionOptions getConnectionOptions();

	/**
	 * Sets the value of the '{@link Monitoring.Server#getConnectionOptions <em>Connection Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Options</em>' containment reference.
	 * @see #getConnectionOptions()
	 * @generated
	 */
	void setConnectionOptions(ConnectionOptions value);

} // Server
