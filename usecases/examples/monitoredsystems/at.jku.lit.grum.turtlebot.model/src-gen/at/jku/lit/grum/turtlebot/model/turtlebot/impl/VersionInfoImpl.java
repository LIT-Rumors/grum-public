/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;
import at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.VersionInfoImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.VersionInfoImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.VersionInfoImpl#getFirmware <em>Firmware</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.VersionInfoImpl#getSoftware <em>Software</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionInfoImpl extends MinimalEObjectImpl.Container implements VersionInfo {
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
	 * The default value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected String hardware = HARDWARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirmware() <em>Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmware()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRMWARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirmware() <em>Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmware()
	 * @generated
	 * @ordered
	 */
	protected String firmware = FIRMWARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftware() <em>Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected String software = SOFTWARE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotPackage.Literals.VERSION_INFO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.VERSION_INFO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardware(String newHardware) {
		String oldHardware = hardware;
		hardware = newHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.VERSION_INFO__HARDWARE, oldHardware,
					hardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirmware() {
		return firmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirmware(String newFirmware) {
		String oldFirmware = firmware;
		firmware = newFirmware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.VERSION_INFO__FIRMWARE, oldFirmware,
					firmware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(String newSoftware) {
		String oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.VERSION_INFO__SOFTWARE, oldSoftware,
					software));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TurtlebotPackage.VERSION_INFO__ID:
			return getId();
		case TurtlebotPackage.VERSION_INFO__HARDWARE:
			return getHardware();
		case TurtlebotPackage.VERSION_INFO__FIRMWARE:
			return getFirmware();
		case TurtlebotPackage.VERSION_INFO__SOFTWARE:
			return getSoftware();
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
		case TurtlebotPackage.VERSION_INFO__ID:
			setId((String) newValue);
			return;
		case TurtlebotPackage.VERSION_INFO__HARDWARE:
			setHardware((String) newValue);
			return;
		case TurtlebotPackage.VERSION_INFO__FIRMWARE:
			setFirmware((String) newValue);
			return;
		case TurtlebotPackage.VERSION_INFO__SOFTWARE:
			setSoftware((String) newValue);
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
		case TurtlebotPackage.VERSION_INFO__ID:
			setId(ID_EDEFAULT);
			return;
		case TurtlebotPackage.VERSION_INFO__HARDWARE:
			setHardware(HARDWARE_EDEFAULT);
			return;
		case TurtlebotPackage.VERSION_INFO__FIRMWARE:
			setFirmware(FIRMWARE_EDEFAULT);
			return;
		case TurtlebotPackage.VERSION_INFO__SOFTWARE:
			setSoftware(SOFTWARE_EDEFAULT);
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
		case TurtlebotPackage.VERSION_INFO__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TurtlebotPackage.VERSION_INFO__HARDWARE:
			return HARDWARE_EDEFAULT == null ? hardware != null : !HARDWARE_EDEFAULT.equals(hardware);
		case TurtlebotPackage.VERSION_INFO__FIRMWARE:
			return FIRMWARE_EDEFAULT == null ? firmware != null : !FIRMWARE_EDEFAULT.equals(firmware);
		case TurtlebotPackage.VERSION_INFO__SOFTWARE:
			return SOFTWARE_EDEFAULT == null ? software != null : !SOFTWARE_EDEFAULT.equals(software);
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
		result.append(", hardware: ");
		result.append(hardware);
		result.append(", firmware: ");
		result.append(firmware);
		result.append(", software: ");
		result.append(software);
		result.append(')');
		return result.toString();
	}

} //VersionInfoImpl
