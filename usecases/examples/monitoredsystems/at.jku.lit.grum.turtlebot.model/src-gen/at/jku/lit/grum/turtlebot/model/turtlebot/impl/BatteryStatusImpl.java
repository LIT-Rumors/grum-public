/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;

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
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.BatteryStatusImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.BatteryStatusImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.BatteryStatusImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.BatteryStatusImpl#getPowerSupplyTemperature <em>Power Supply Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryStatusImpl extends MinimalEObjectImpl.Container implements BatteryStatus {
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
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final Float VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected Float voltage = VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final Float PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected Float percentage = PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerSupplyTemperature() <em>Power Supply Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSupplyTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final Byte POWER_SUPPLY_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerSupplyTemperature() <em>Power Supply Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSupplyTemperature()
	 * @generated
	 * @ordered
	 */
	protected Byte powerSupplyTemperature = POWER_SUPPLY_TEMPERATURE_EDEFAULT;

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
		return TurtlebotPackage.Literals.BATTERY_STATUS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.BATTERY_STATUS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(Float newVoltage) {
		Float oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.BATTERY_STATUS__VOLTAGE, oldVoltage,
					voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(Float newPercentage) {
		Float oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.BATTERY_STATUS__PERCENTAGE,
					oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte getPowerSupplyTemperature() {
		return powerSupplyTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerSupplyTemperature(Byte newPowerSupplyTemperature) {
		Byte oldPowerSupplyTemperature = powerSupplyTemperature;
		powerSupplyTemperature = newPowerSupplyTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.BATTERY_STATUS__POWER_SUPPLY_TEMPERATURE, oldPowerSupplyTemperature,
					powerSupplyTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TurtlebotPackage.BATTERY_STATUS__ID:
			return getId();
		case TurtlebotPackage.BATTERY_STATUS__VOLTAGE:
			return getVoltage();
		case TurtlebotPackage.BATTERY_STATUS__PERCENTAGE:
			return getPercentage();
		case TurtlebotPackage.BATTERY_STATUS__POWER_SUPPLY_TEMPERATURE:
			return getPowerSupplyTemperature();
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
		case TurtlebotPackage.BATTERY_STATUS__ID:
			setId((String) newValue);
			return;
		case TurtlebotPackage.BATTERY_STATUS__VOLTAGE:
			setVoltage((Float) newValue);
			return;
		case TurtlebotPackage.BATTERY_STATUS__PERCENTAGE:
			setPercentage((Float) newValue);
			return;
		case TurtlebotPackage.BATTERY_STATUS__POWER_SUPPLY_TEMPERATURE:
			setPowerSupplyTemperature((Byte) newValue);
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
		case TurtlebotPackage.BATTERY_STATUS__ID:
			setId(ID_EDEFAULT);
			return;
		case TurtlebotPackage.BATTERY_STATUS__VOLTAGE:
			setVoltage(VOLTAGE_EDEFAULT);
			return;
		case TurtlebotPackage.BATTERY_STATUS__PERCENTAGE:
			setPercentage(PERCENTAGE_EDEFAULT);
			return;
		case TurtlebotPackage.BATTERY_STATUS__POWER_SUPPLY_TEMPERATURE:
			setPowerSupplyTemperature(POWER_SUPPLY_TEMPERATURE_EDEFAULT);
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
		case TurtlebotPackage.BATTERY_STATUS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TurtlebotPackage.BATTERY_STATUS__VOLTAGE:
			return VOLTAGE_EDEFAULT == null ? voltage != null : !VOLTAGE_EDEFAULT.equals(voltage);
		case TurtlebotPackage.BATTERY_STATUS__PERCENTAGE:
			return PERCENTAGE_EDEFAULT == null ? percentage != null : !PERCENTAGE_EDEFAULT.equals(percentage);
		case TurtlebotPackage.BATTERY_STATUS__POWER_SUPPLY_TEMPERATURE:
			return POWER_SUPPLY_TEMPERATURE_EDEFAULT == null ? powerSupplyTemperature != null
					: !POWER_SUPPLY_TEMPERATURE_EDEFAULT.equals(powerSupplyTemperature);
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
		result.append(", voltage: ");
		result.append(voltage);
		result.append(", percentage: ");
		result.append(percentage);
		result.append(", powerSupplyTemperature: ");
		result.append(powerSupplyTemperature);
		result.append(')');
		return result.toString();
	}

} //BatteryStatusImpl
