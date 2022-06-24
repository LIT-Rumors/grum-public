/**
 */
package Monitoring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MO Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.MOConfig#getName <em>Name</em>}</li>
 *   <li>{@link Monitoring.MOConfig#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link Monitoring.MOConfig#getServers <em>Servers</em>}</li>
 *   <li>{@link Monitoring.MOConfig#getDefaultServer <em>Default Server</em>}</li>
 *   <li>{@link Monitoring.MOConfig#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link Monitoring.MOConfig#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link Monitoring.MOConfig#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see Monitoring.MonitoringPackage#getMOConfig()
 * @model
 * @generated
 */
public interface MOConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Monitoring.MonitoringPackage#getMOConfig_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Monitoring.MOConfig#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see Monitoring.MonitoringPackage#getMOConfig_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link Monitoring.MOConfig#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link Monitoring.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see Monitoring.MonitoringPackage#getMOConfig_Servers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getServers();

	/**
	 * Returns the value of the '<em><b>Default Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Server</em>' reference.
	 * @see #setDefaultServer(Server)
	 * @see Monitoring.MonitoringPackage#getMOConfig_DefaultServer()
	 * @model required="true"
	 * @generated
	 */
	Server getDefaultServer();

	/**
	 * Sets the value of the '{@link Monitoring.MOConfig#getDefaultServer <em>Default Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Server</em>' reference.
	 * @see #getDefaultServer()
	 * @generated
	 */
	void setDefaultServer(Server value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see Monitoring.MonitoringPackage#getMOConfig_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link Monitoring.MOConfig#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' reference.
	 * @see #setEPackage(EPackage)
	 * @see Monitoring.MonitoringPackage#getMOConfig_EPackage()
	 * @model required="true"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Sets the value of the '{@link Monitoring.MOConfig#getEPackage <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' reference.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(MoSystem)
	 * @see Monitoring.MonitoringPackage#getMOConfig_System()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MoSystem getSystem();

	/**
	 * Sets the value of the '{@link Monitoring.MOConfig#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(MoSystem value);

} // MOConfig
