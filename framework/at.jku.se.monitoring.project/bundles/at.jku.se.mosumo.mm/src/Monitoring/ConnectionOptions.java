/**
 */
package Monitoring;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.ConnectionOptions#isAutomaticReconnect <em>Automatic Reconnect</em>}</li>
 *   <li>{@link Monitoring.ConnectionOptions#isCleanSession <em>Clean Session</em>}</li>
 *   <li>{@link Monitoring.ConnectionOptions#getConnectionTimeOut <em>Connection Time Out</em>}</li>
 *   <li>{@link Monitoring.ConnectionOptions#getSetMaxInflight <em>Set Max Inflight</em>}</li>
 * </ul>
 *
 * @see Monitoring.MonitoringPackage#getConnectionOptions()
 * @model
 * @generated
 */
public interface ConnectionOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Automatic Reconnect</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Reconnect</em>' attribute.
	 * @see #setAutomaticReconnect(boolean)
	 * @see Monitoring.MonitoringPackage#getConnectionOptions_AutomaticReconnect()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutomaticReconnect();

	/**
	 * Sets the value of the '{@link Monitoring.ConnectionOptions#isAutomaticReconnect <em>Automatic Reconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Reconnect</em>' attribute.
	 * @see #isAutomaticReconnect()
	 * @generated
	 */
	void setAutomaticReconnect(boolean value);

	/**
	 * Returns the value of the '<em><b>Clean Session</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clean Session</em>' attribute.
	 * @see #setCleanSession(boolean)
	 * @see Monitoring.MonitoringPackage#getConnectionOptions_CleanSession()
	 * @model default="true"
	 * @generated
	 */
	boolean isCleanSession();

	/**
	 * Sets the value of the '{@link Monitoring.ConnectionOptions#isCleanSession <em>Clean Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clean Session</em>' attribute.
	 * @see #isCleanSession()
	 * @generated
	 */
	void setCleanSession(boolean value);

	/**
	 * Returns the value of the '<em><b>Connection Time Out</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Time Out</em>' attribute.
	 * @see #setConnectionTimeOut(Integer)
	 * @see Monitoring.MonitoringPackage#getConnectionOptions_ConnectionTimeOut()
	 * @model default="10"
	 * @generated
	 */
	Integer getConnectionTimeOut();

	/**
	 * Sets the value of the '{@link Monitoring.ConnectionOptions#getConnectionTimeOut <em>Connection Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Time Out</em>' attribute.
	 * @see #getConnectionTimeOut()
	 * @generated
	 */
	void setConnectionTimeOut(Integer value);

	/**
	 * Returns the value of the '<em><b>Set Max Inflight</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Max Inflight</em>' attribute.
	 * @see #setSetMaxInflight(Integer)
	 * @see Monitoring.MonitoringPackage#getConnectionOptions_SetMaxInflight()
	 * @model default="50"
	 * @generated
	 */
	Integer getSetMaxInflight();

	/**
	 * Sets the value of the '{@link Monitoring.ConnectionOptions#getSetMaxInflight <em>Set Max Inflight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Max Inflight</em>' attribute.
	 * @see #getSetMaxInflight()
	 * @generated
	 */
	void setSetMaxInflight(Integer value);

} // ConnectionOptions
