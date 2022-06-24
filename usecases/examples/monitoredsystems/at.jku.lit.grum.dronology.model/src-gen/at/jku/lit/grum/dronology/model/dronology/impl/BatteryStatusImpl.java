/**
 */
package at.jku.lit.grum.dronology.model.dronology.impl;

import at.jku.lit.grum.dronology.model.dronology.BatteryStatus;
import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.BatteryStatusImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.BatteryStatusImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.BatteryStatusImpl#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryStatusImpl extends MinimalEObjectImpl.Container implements BatteryStatus {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Double LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Double level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final Double VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected Double voltage = VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final Double CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected Double current = CURRENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronologyPackage.Literals.BATTERY_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Double newLevel) {
		Double oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.BATTERY_STATUS__LEVEL, oldLevel,
					level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(Double newVoltage) {
		Double oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.BATTERY_STATUS__VOLTAGE, oldVoltage,
					voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(Double newCurrent) {
		Double oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.BATTERY_STATUS__CURRENT, oldCurrent,
					current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DronologyPackage.BATTERY_STATUS__LEVEL:
			return getLevel();
		case DronologyPackage.BATTERY_STATUS__VOLTAGE:
			return getVoltage();
		case DronologyPackage.BATTERY_STATUS__CURRENT:
			return getCurrent();
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
		case DronologyPackage.BATTERY_STATUS__LEVEL:
			setLevel((Double) newValue);
			return;
		case DronologyPackage.BATTERY_STATUS__VOLTAGE:
			setVoltage((Double) newValue);
			return;
		case DronologyPackage.BATTERY_STATUS__CURRENT:
			setCurrent((Double) newValue);
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
		case DronologyPackage.BATTERY_STATUS__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case DronologyPackage.BATTERY_STATUS__VOLTAGE:
			setVoltage(VOLTAGE_EDEFAULT);
			return;
		case DronologyPackage.BATTERY_STATUS__CURRENT:
			setCurrent(CURRENT_EDEFAULT);
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
		case DronologyPackage.BATTERY_STATUS__LEVEL:
			return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
		case DronologyPackage.BATTERY_STATUS__VOLTAGE:
			return VOLTAGE_EDEFAULT == null ? voltage != null : !VOLTAGE_EDEFAULT.equals(voltage);
		case DronologyPackage.BATTERY_STATUS__CURRENT:
			return CURRENT_EDEFAULT == null ? current != null : !CURRENT_EDEFAULT.equals(current);
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
		result.append(" (level: ");
		result.append(level);
		result.append(", voltage: ");
		result.append(voltage);
		result.append(", current: ");
		result.append(current);
		result.append(')');
		return result.toString();
	}

} //BatteryStatusImpl
