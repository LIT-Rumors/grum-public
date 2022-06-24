/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.Sensor;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorImpl#getPartsPerMillion <em>Parts Per Million</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends MinimalEObjectImpl.Container implements Sensor {
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
	 * The default value of the '{@link #getPartsPerMillion() <em>Parts Per Million</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartsPerMillion()
	 * @generated
	 * @ordered
	 */
	protected static final double PARTS_PER_MILLION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPartsPerMillion() <em>Parts Per Million</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartsPerMillion()
	 * @generated
	 * @ordered
	 */
	protected double partsPerMillion = PARTS_PER_MILLION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotPackage.Literals.SENSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.SENSOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPartsPerMillion() {
		return partsPerMillion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartsPerMillion(double newPartsPerMillion) {
		double oldPartsPerMillion = partsPerMillion;
		partsPerMillion = newPartsPerMillion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.SENSOR__PARTS_PER_MILLION,
					oldPartsPerMillion, partsPerMillion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TurtlebotPackage.SENSOR__ID:
			return getId();
		case TurtlebotPackage.SENSOR__PARTS_PER_MILLION:
			return getPartsPerMillion();
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
		case TurtlebotPackage.SENSOR__ID:
			setId((String) newValue);
			return;
		case TurtlebotPackage.SENSOR__PARTS_PER_MILLION:
			setPartsPerMillion((Double) newValue);
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
		case TurtlebotPackage.SENSOR__ID:
			setId(ID_EDEFAULT);
			return;
		case TurtlebotPackage.SENSOR__PARTS_PER_MILLION:
			setPartsPerMillion(PARTS_PER_MILLION_EDEFAULT);
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
		case TurtlebotPackage.SENSOR__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TurtlebotPackage.SENSOR__PARTS_PER_MILLION:
			return partsPerMillion != PARTS_PER_MILLION_EDEFAULT;
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
		result.append(", partsPerMillion: ");
		result.append(partsPerMillion);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
