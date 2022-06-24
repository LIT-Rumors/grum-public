/**
 */
package at.jku.lit.grum.picar.model.picar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.Status#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.Status#getOperationmode <em>Operationmode</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getStatus()
 * @model
 * @generated
 */
public interface Status extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getStatus_Initialized()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.picar.model.picar.Status#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

	/**
	 * Returns the value of the '<em><b>Operationmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationmode</em>' attribute.
	 * @see #setOperationmode(String)
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getStatus_Operationmode()
	 * @model
	 * @generated
	 */
	String getOperationmode();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.picar.model.picar.Status#getOperationmode <em>Operationmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operationmode</em>' attribute.
	 * @see #getOperationmode()
	 * @generated
	 */
	void setOperationmode(String value);

} // Status
