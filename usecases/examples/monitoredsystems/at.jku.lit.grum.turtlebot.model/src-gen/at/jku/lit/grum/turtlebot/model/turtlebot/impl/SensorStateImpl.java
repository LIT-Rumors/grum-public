/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.SensorState;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorStateImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorStateImpl#getIllumination <em>Illumination</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorStateImpl#getCliff <em>Cliff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorStateImpl extends MinimalEObjectImpl.Container implements SensorState {
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
	 * The default value of the '{@link #getIllumination() <em>Illumination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIllumination()
	 * @generated
	 * @ordered
	 */
	protected static final Float ILLUMINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIllumination() <em>Illumination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIllumination()
	 * @generated
	 * @ordered
	 */
	protected Float illumination = ILLUMINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCliff() <em>Cliff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliff()
	 * @generated
	 * @ordered
	 */
	protected static final Float CLIFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCliff() <em>Cliff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliff()
	 * @generated
	 * @ordered
	 */
	protected Float cliff = CLIFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotPackage.Literals.SENSOR_STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.SENSOR_STATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getIllumination() {
		return illumination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIllumination(Float newIllumination) {
		Float oldIllumination = illumination;
		illumination = newIllumination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.SENSOR_STATE__ILLUMINATION,
					oldIllumination, illumination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getCliff() {
		return cliff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCliff(Float newCliff) {
		Float oldCliff = cliff;
		cliff = newCliff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.SENSOR_STATE__CLIFF, oldCliff,
					cliff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TurtlebotPackage.SENSOR_STATE__ID:
			return getId();
		case TurtlebotPackage.SENSOR_STATE__ILLUMINATION:
			return getIllumination();
		case TurtlebotPackage.SENSOR_STATE__CLIFF:
			return getCliff();
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
		case TurtlebotPackage.SENSOR_STATE__ID:
			setId((String) newValue);
			return;
		case TurtlebotPackage.SENSOR_STATE__ILLUMINATION:
			setIllumination((Float) newValue);
			return;
		case TurtlebotPackage.SENSOR_STATE__CLIFF:
			setCliff((Float) newValue);
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
		case TurtlebotPackage.SENSOR_STATE__ID:
			setId(ID_EDEFAULT);
			return;
		case TurtlebotPackage.SENSOR_STATE__ILLUMINATION:
			setIllumination(ILLUMINATION_EDEFAULT);
			return;
		case TurtlebotPackage.SENSOR_STATE__CLIFF:
			setCliff(CLIFF_EDEFAULT);
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
		case TurtlebotPackage.SENSOR_STATE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TurtlebotPackage.SENSOR_STATE__ILLUMINATION:
			return ILLUMINATION_EDEFAULT == null ? illumination != null : !ILLUMINATION_EDEFAULT.equals(illumination);
		case TurtlebotPackage.SENSOR_STATE__CLIFF:
			return CLIFF_EDEFAULT == null ? cliff != null : !CLIFF_EDEFAULT.equals(cliff);
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
		result.append(", illumination: ");
		result.append(illumination);
		result.append(", cliff: ");
		result.append(cliff);
		result.append(')');
		return result.toString();
	}

} //SensorStateImpl
