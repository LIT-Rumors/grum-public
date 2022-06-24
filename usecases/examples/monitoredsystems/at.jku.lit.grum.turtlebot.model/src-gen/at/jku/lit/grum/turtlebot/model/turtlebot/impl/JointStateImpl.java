/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.JointState;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.JointStateImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.JointStateImpl#getEffortLeftJoint <em>Effort Left Joint</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.JointStateImpl#getEffortRightJoint <em>Effort Right Joint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointStateImpl extends MinimalEObjectImpl.Container implements JointState {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffortLeftJoint() <em>Effort Left Joint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffortLeftJoint()
	 * @generated
	 * @ordered
	 */
	protected static final Float EFFORT_LEFT_JOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffortLeftJoint() <em>Effort Left Joint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffortLeftJoint()
	 * @generated
	 * @ordered
	 */
	protected Float effortLeftJoint = EFFORT_LEFT_JOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffortRightJoint() <em>Effort Right Joint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffortRightJoint()
	 * @generated
	 * @ordered
	 */
	protected static final Float EFFORT_RIGHT_JOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffortRightJoint() <em>Effort Right Joint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffortRightJoint()
	 * @generated
	 * @ordered
	 */
	protected Float effortRightJoint = EFFORT_RIGHT_JOINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotPackage.Literals.JOINT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.JOINT_STATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getEffortLeftJoint() {
		return effortLeftJoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffortLeftJoint(Float newEffortLeftJoint) {
		Float oldEffortLeftJoint = effortLeftJoint;
		effortLeftJoint = newEffortLeftJoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.JOINT_STATE__EFFORT_LEFT_JOINT,
					oldEffortLeftJoint, effortLeftJoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getEffortRightJoint() {
		return effortRightJoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffortRightJoint(Float newEffortRightJoint) {
		Float oldEffortRightJoint = effortRightJoint;
		effortRightJoint = newEffortRightJoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.JOINT_STATE__EFFORT_RIGHT_JOINT,
					oldEffortRightJoint, effortRightJoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TurtlebotPackage.JOINT_STATE__ID:
			return getId();
		case TurtlebotPackage.JOINT_STATE__EFFORT_LEFT_JOINT:
			return getEffortLeftJoint();
		case TurtlebotPackage.JOINT_STATE__EFFORT_RIGHT_JOINT:
			return getEffortRightJoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TurtlebotPackage.JOINT_STATE__ID:
			setId((String) newValue);
			return;
		case TurtlebotPackage.JOINT_STATE__EFFORT_LEFT_JOINT:
			setEffortLeftJoint((Float) newValue);
			return;
		case TurtlebotPackage.JOINT_STATE__EFFORT_RIGHT_JOINT:
			setEffortRightJoint((Float) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TurtlebotPackage.JOINT_STATE__ID:
			setId(ID_EDEFAULT);
			return;
		case TurtlebotPackage.JOINT_STATE__EFFORT_LEFT_JOINT:
			setEffortLeftJoint(EFFORT_LEFT_JOINT_EDEFAULT);
			return;
		case TurtlebotPackage.JOINT_STATE__EFFORT_RIGHT_JOINT:
			setEffortRightJoint(EFFORT_RIGHT_JOINT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TurtlebotPackage.JOINT_STATE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TurtlebotPackage.JOINT_STATE__EFFORT_LEFT_JOINT:
			return EFFORT_LEFT_JOINT_EDEFAULT == null ? effortLeftJoint != null
					: !EFFORT_LEFT_JOINT_EDEFAULT.equals(effortLeftJoint);
		case TurtlebotPackage.JOINT_STATE__EFFORT_RIGHT_JOINT:
			return EFFORT_RIGHT_JOINT_EDEFAULT == null ? effortRightJoint != null
					: !EFFORT_RIGHT_JOINT_EDEFAULT.equals(effortRightJoint);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", effortLeftJoint: ");
		result.append(effortLeftJoint);
		result.append(", effortRightJoint: ");
		result.append(effortRightJoint);
		result.append(')');
		return result.toString();
	}

} //JointStateImpl
