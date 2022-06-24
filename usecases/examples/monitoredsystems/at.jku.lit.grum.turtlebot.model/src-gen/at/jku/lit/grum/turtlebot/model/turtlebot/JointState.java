/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.JointState#getEffortLeftJoint <em>Effort Left Joint</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.JointState#getEffortRightJoint <em>Effort Right Joint</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getJointState()
 * @model
 * @generated
 */
public interface JointState extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Effort Left Joint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effort Left Joint</em>' attribute.
	 * @see #setEffortLeftJoint(Float)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getJointState_EffortLeftJoint()
	 * @model
	 * @generated
	 */
	Float getEffortLeftJoint();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.JointState#getEffortLeftJoint <em>Effort Left Joint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort Left Joint</em>' attribute.
	 * @see #getEffortLeftJoint()
	 * @generated
	 */
	void setEffortLeftJoint(Float value);

	/**
	 * Returns the value of the '<em><b>Effort Right Joint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effort Right Joint</em>' attribute.
	 * @see #setEffortRightJoint(Float)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getJointState_EffortRightJoint()
	 * @model
	 * @generated
	 */
	Float getEffortRightJoint();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.JointState#getEffortRightJoint <em>Effort Right Joint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort Right Joint</em>' attribute.
	 * @see #getEffortRightJoint()
	 * @generated
	 */
	void setEffortRightJoint(Float value);

} // JointState
