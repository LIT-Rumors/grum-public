/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Laser Scan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.LaserScanImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.LaserScanImpl#getSmallestRange <em>Smallest Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaserScanImpl extends MinimalEObjectImpl.Container implements LaserScan {
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
	 * The default value of the '{@link #getSmallestRange() <em>Smallest Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallestRange()
	 * @generated
	 * @ordered
	 */
	protected static final Float SMALLEST_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmallestRange() <em>Smallest Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallestRange()
	 * @generated
	 * @ordered
	 */
	protected Float smallestRange = SMALLEST_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaserScanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotPackage.Literals.LASER_SCAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.LASER_SCAN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getSmallestRange() {
		return smallestRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallestRange(Float newSmallestRange) {
		Float oldSmallestRange = smallestRange;
		smallestRange = newSmallestRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.LASER_SCAN__SMALLEST_RANGE,
					oldSmallestRange, smallestRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TurtlebotPackage.LASER_SCAN__ID:
			return getId();
		case TurtlebotPackage.LASER_SCAN__SMALLEST_RANGE:
			return getSmallestRange();
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
		case TurtlebotPackage.LASER_SCAN__ID:
			setId((String) newValue);
			return;
		case TurtlebotPackage.LASER_SCAN__SMALLEST_RANGE:
			setSmallestRange((Float) newValue);
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
		case TurtlebotPackage.LASER_SCAN__ID:
			setId(ID_EDEFAULT);
			return;
		case TurtlebotPackage.LASER_SCAN__SMALLEST_RANGE:
			setSmallestRange(SMALLEST_RANGE_EDEFAULT);
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
		case TurtlebotPackage.LASER_SCAN__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TurtlebotPackage.LASER_SCAN__SMALLEST_RANGE:
			return SMALLEST_RANGE_EDEFAULT == null ? smallestRange != null
					: !SMALLEST_RANGE_EDEFAULT.equals(smallestRange);
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
		result.append(", smallestRange: ");
		result.append(smallestRange);
		result.append(')');
		return result.toString();
	}

} //LaserScanImpl
