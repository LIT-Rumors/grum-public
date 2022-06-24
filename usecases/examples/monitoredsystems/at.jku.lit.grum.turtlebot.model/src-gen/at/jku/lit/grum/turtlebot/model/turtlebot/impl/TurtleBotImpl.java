/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus;
import at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics;
import at.jku.lit.grum.turtlebot.model.turtlebot.JointState;
import at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan;
import at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField;
import at.jku.lit.grum.turtlebot.model.turtlebot.Odometry;
import at.jku.lit.grum.turtlebot.model.turtlebot.Sensor;
import at.jku.lit.grum.turtlebot.model.turtlebot.SensorState;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;
import at.jku.lit.grum.turtlebot.model.turtlebot.Velocity;
import at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turtle Bot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getBatterystatus <em>Batterystatus</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getJointstate <em>Jointstate</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getMagneticfield <em>Magneticfield</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getSensorstate <em>Sensorstate</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getVersioninfo <em>Versioninfo</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getOdometry <em>Odometry</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl#getLaserscan <em>Laserscan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurtleBotImpl extends MinimalEObjectImpl.Container implements TurtleBot {
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
	 * The cached value of the '{@link #getBatterystatus() <em>Batterystatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatterystatus()
	 * @generated
	 * @ordered
	 */
	protected BatteryStatus batterystatus;

	/**
	 * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected Velocity velocity;

	/**
	 * The cached value of the '{@link #getDiagnostics() <em>Diagnostics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected Diagnostics diagnostics;

	/**
	 * The cached value of the '{@link #getJointstate() <em>Jointstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJointstate()
	 * @generated
	 * @ordered
	 */
	protected JointState jointstate;

	/**
	 * The cached value of the '{@link #getMagneticfield() <em>Magneticfield</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagneticfield()
	 * @generated
	 * @ordered
	 */
	protected MagneticField magneticfield;

	/**
	 * The cached value of the '{@link #getSensorstate() <em>Sensorstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorstate()
	 * @generated
	 * @ordered
	 */
	protected SensorState sensorstate;

	/**
	 * The cached value of the '{@link #getVersioninfo() <em>Versioninfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioninfo()
	 * @generated
	 * @ordered
	 */
	protected VersionInfo versioninfo;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * The cached value of the '{@link #getOdometry() <em>Odometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdometry()
	 * @generated
	 * @ordered
	 */
	protected Odometry odometry;

	/**
	 * The cached value of the '{@link #getLaserscan() <em>Laserscan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaserscan()
	 * @generated
	 * @ordered
	 */
	protected LaserScan laserscan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurtleBotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotPackage.Literals.TURTLE_BOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryStatus getBatterystatus() {
		return batterystatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBatterystatus(BatteryStatus newBatterystatus, NotificationChain msgs) {
		BatteryStatus oldBatterystatus = batterystatus;
		batterystatus = newBatterystatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.TURTLE_BOT__BATTERYSTATUS, oldBatterystatus, newBatterystatus);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatterystatus(BatteryStatus newBatterystatus) {
		if (newBatterystatus != batterystatus) {
			NotificationChain msgs = null;
			if (batterystatus != null)
				msgs = ((InternalEObject) batterystatus).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__BATTERYSTATUS, null, msgs);
			if (newBatterystatus != null)
				msgs = ((InternalEObject) newBatterystatus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__BATTERYSTATUS, null, msgs);
			msgs = basicSetBatterystatus(newBatterystatus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__BATTERYSTATUS,
					newBatterystatus, newBatterystatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Velocity getVelocity() {
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVelocity(Velocity newVelocity, NotificationChain msgs) {
		Velocity oldVelocity = velocity;
		velocity = newVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.TURTLE_BOT__VELOCITY, oldVelocity, newVelocity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(Velocity newVelocity) {
		if (newVelocity != velocity) {
			NotificationChain msgs = null;
			if (velocity != null)
				msgs = ((InternalEObject) velocity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__VELOCITY, null, msgs);
			if (newVelocity != null)
				msgs = ((InternalEObject) newVelocity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__VELOCITY, null, msgs);
			msgs = basicSetVelocity(newVelocity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__VELOCITY, newVelocity,
					newVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagnostics getDiagnostics() {
		return diagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnostics(Diagnostics newDiagnostics, NotificationChain msgs) {
		Diagnostics oldDiagnostics = diagnostics;
		diagnostics = newDiagnostics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.TURTLE_BOT__DIAGNOSTICS, oldDiagnostics, newDiagnostics);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnostics(Diagnostics newDiagnostics) {
		if (newDiagnostics != diagnostics) {
			NotificationChain msgs = null;
			if (diagnostics != null)
				msgs = ((InternalEObject) diagnostics).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__DIAGNOSTICS, null, msgs);
			if (newDiagnostics != null)
				msgs = ((InternalEObject) newDiagnostics).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__DIAGNOSTICS, null, msgs);
			msgs = basicSetDiagnostics(newDiagnostics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__DIAGNOSTICS,
					newDiagnostics, newDiagnostics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointState getJointstate() {
		return jointstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJointstate(JointState newJointstate, NotificationChain msgs) {
		JointState oldJointstate = jointstate;
		jointstate = newJointstate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.TURTLE_BOT__JOINTSTATE, oldJointstate, newJointstate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJointstate(JointState newJointstate) {
		if (newJointstate != jointstate) {
			NotificationChain msgs = null;
			if (jointstate != null)
				msgs = ((InternalEObject) jointstate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__JOINTSTATE, null, msgs);
			if (newJointstate != null)
				msgs = ((InternalEObject) newJointstate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__JOINTSTATE, null, msgs);
			msgs = basicSetJointstate(newJointstate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__JOINTSTATE,
					newJointstate, newJointstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagneticField getMagneticfield() {
		return magneticfield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMagneticfield(MagneticField newMagneticfield, NotificationChain msgs) {
		MagneticField oldMagneticfield = magneticfield;
		magneticfield = newMagneticfield;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.TURTLE_BOT__MAGNETICFIELD, oldMagneticfield, newMagneticfield);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagneticfield(MagneticField newMagneticfield) {
		if (newMagneticfield != magneticfield) {
			NotificationChain msgs = null;
			if (magneticfield != null)
				msgs = ((InternalEObject) magneticfield).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__MAGNETICFIELD, null, msgs);
			if (newMagneticfield != null)
				msgs = ((InternalEObject) newMagneticfield).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__MAGNETICFIELD, null, msgs);
			msgs = basicSetMagneticfield(newMagneticfield, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__MAGNETICFIELD,
					newMagneticfield, newMagneticfield));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorState getSensorstate() {
		return sensorstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorstate(SensorState newSensorstate, NotificationChain msgs) {
		SensorState oldSensorstate = sensorstate;
		sensorstate = newSensorstate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.TURTLE_BOT__SENSORSTATE, oldSensorstate, newSensorstate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorstate(SensorState newSensorstate) {
		if (newSensorstate != sensorstate) {
			NotificationChain msgs = null;
			if (sensorstate != null)
				msgs = ((InternalEObject) sensorstate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__SENSORSTATE, null, msgs);
			if (newSensorstate != null)
				msgs = ((InternalEObject) newSensorstate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__SENSORSTATE, null, msgs);
			msgs = basicSetSensorstate(newSensorstate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__SENSORSTATE,
					newSensorstate, newSensorstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInfo getVersioninfo() {
		return versioninfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersioninfo(VersionInfo newVersioninfo, NotificationChain msgs) {
		VersionInfo oldVersioninfo = versioninfo;
		versioninfo = newVersioninfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.TURTLE_BOT__VERSIONINFO, oldVersioninfo, newVersioninfo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioninfo(VersionInfo newVersioninfo) {
		if (newVersioninfo != versioninfo) {
			NotificationChain msgs = null;
			if (versioninfo != null)
				msgs = ((InternalEObject) versioninfo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__VERSIONINFO, null, msgs);
			if (newVersioninfo != null)
				msgs = ((InternalEObject) newVersioninfo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__VERSIONINFO, null, msgs);
			msgs = basicSetVersioninfo(newVersioninfo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__VERSIONINFO,
					newVersioninfo, newVersioninfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensor(Sensor newSensor, NotificationChain msgs) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.TURTLE_BOT__SENSOR, oldSensor, newSensor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(Sensor newSensor) {
		if (newSensor != sensor) {
			NotificationChain msgs = null;
			if (sensor != null)
				msgs = ((InternalEObject) sensor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__SENSOR, null, msgs);
			if (newSensor != null)
				msgs = ((InternalEObject) newSensor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__SENSOR, null, msgs);
			msgs = basicSetSensor(newSensor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__SENSOR, newSensor,
					newSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Odometry getOdometry() {
		return odometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOdometry(Odometry newOdometry, NotificationChain msgs) {
		Odometry oldOdometry = odometry;
		odometry = newOdometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.TURTLE_BOT__ODOMETRY, oldOdometry, newOdometry);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOdometry(Odometry newOdometry) {
		if (newOdometry != odometry) {
			NotificationChain msgs = null;
			if (odometry != null)
				msgs = ((InternalEObject) odometry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__ODOMETRY, null, msgs);
			if (newOdometry != null)
				msgs = ((InternalEObject) newOdometry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__ODOMETRY, null, msgs);
			msgs = basicSetOdometry(newOdometry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__ODOMETRY, newOdometry,
					newOdometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaserScan getLaserscan() {
		return laserscan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaserscan(LaserScan newLaserscan, NotificationChain msgs) {
		LaserScan oldLaserscan = laserscan;
		laserscan = newLaserscan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.TURTLE_BOT__LASERSCAN, oldLaserscan, newLaserscan);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaserscan(LaserScan newLaserscan) {
		if (newLaserscan != laserscan) {
			NotificationChain msgs = null;
			if (laserscan != null)
				msgs = ((InternalEObject) laserscan).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__LASERSCAN, null, msgs);
			if (newLaserscan != null)
				msgs = ((InternalEObject) newLaserscan).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TurtlebotPackage.TURTLE_BOT__LASERSCAN, null, msgs);
			msgs = basicSetLaserscan(newLaserscan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLE_BOT__LASERSCAN, newLaserscan,
					newLaserscan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TurtlebotPackage.TURTLE_BOT__BATTERYSTATUS:
			return basicSetBatterystatus(null, msgs);
		case TurtlebotPackage.TURTLE_BOT__VELOCITY:
			return basicSetVelocity(null, msgs);
		case TurtlebotPackage.TURTLE_BOT__DIAGNOSTICS:
			return basicSetDiagnostics(null, msgs);
		case TurtlebotPackage.TURTLE_BOT__JOINTSTATE:
			return basicSetJointstate(null, msgs);
		case TurtlebotPackage.TURTLE_BOT__MAGNETICFIELD:
			return basicSetMagneticfield(null, msgs);
		case TurtlebotPackage.TURTLE_BOT__SENSORSTATE:
			return basicSetSensorstate(null, msgs);
		case TurtlebotPackage.TURTLE_BOT__VERSIONINFO:
			return basicSetVersioninfo(null, msgs);
		case TurtlebotPackage.TURTLE_BOT__SENSOR:
			return basicSetSensor(null, msgs);
		case TurtlebotPackage.TURTLE_BOT__ODOMETRY:
			return basicSetOdometry(null, msgs);
		case TurtlebotPackage.TURTLE_BOT__LASERSCAN:
			return basicSetLaserscan(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TurtlebotPackage.TURTLE_BOT__ID:
			return getId();
		case TurtlebotPackage.TURTLE_BOT__BATTERYSTATUS:
			return getBatterystatus();
		case TurtlebotPackage.TURTLE_BOT__VELOCITY:
			return getVelocity();
		case TurtlebotPackage.TURTLE_BOT__DIAGNOSTICS:
			return getDiagnostics();
		case TurtlebotPackage.TURTLE_BOT__JOINTSTATE:
			return getJointstate();
		case TurtlebotPackage.TURTLE_BOT__MAGNETICFIELD:
			return getMagneticfield();
		case TurtlebotPackage.TURTLE_BOT__SENSORSTATE:
			return getSensorstate();
		case TurtlebotPackage.TURTLE_BOT__VERSIONINFO:
			return getVersioninfo();
		case TurtlebotPackage.TURTLE_BOT__SENSOR:
			return getSensor();
		case TurtlebotPackage.TURTLE_BOT__ODOMETRY:
			return getOdometry();
		case TurtlebotPackage.TURTLE_BOT__LASERSCAN:
			return getLaserscan();
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
		case TurtlebotPackage.TURTLE_BOT__ID:
			setId((String) newValue);
			return;
		case TurtlebotPackage.TURTLE_BOT__BATTERYSTATUS:
			setBatterystatus((BatteryStatus) newValue);
			return;
		case TurtlebotPackage.TURTLE_BOT__VELOCITY:
			setVelocity((Velocity) newValue);
			return;
		case TurtlebotPackage.TURTLE_BOT__DIAGNOSTICS:
			setDiagnostics((Diagnostics) newValue);
			return;
		case TurtlebotPackage.TURTLE_BOT__JOINTSTATE:
			setJointstate((JointState) newValue);
			return;
		case TurtlebotPackage.TURTLE_BOT__MAGNETICFIELD:
			setMagneticfield((MagneticField) newValue);
			return;
		case TurtlebotPackage.TURTLE_BOT__SENSORSTATE:
			setSensorstate((SensorState) newValue);
			return;
		case TurtlebotPackage.TURTLE_BOT__VERSIONINFO:
			setVersioninfo((VersionInfo) newValue);
			return;
		case TurtlebotPackage.TURTLE_BOT__SENSOR:
			setSensor((Sensor) newValue);
			return;
		case TurtlebotPackage.TURTLE_BOT__ODOMETRY:
			setOdometry((Odometry) newValue);
			return;
		case TurtlebotPackage.TURTLE_BOT__LASERSCAN:
			setLaserscan((LaserScan) newValue);
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
		case TurtlebotPackage.TURTLE_BOT__ID:
			setId(ID_EDEFAULT);
			return;
		case TurtlebotPackage.TURTLE_BOT__BATTERYSTATUS:
			setBatterystatus((BatteryStatus) null);
			return;
		case TurtlebotPackage.TURTLE_BOT__VELOCITY:
			setVelocity((Velocity) null);
			return;
		case TurtlebotPackage.TURTLE_BOT__DIAGNOSTICS:
			setDiagnostics((Diagnostics) null);
			return;
		case TurtlebotPackage.TURTLE_BOT__JOINTSTATE:
			setJointstate((JointState) null);
			return;
		case TurtlebotPackage.TURTLE_BOT__MAGNETICFIELD:
			setMagneticfield((MagneticField) null);
			return;
		case TurtlebotPackage.TURTLE_BOT__SENSORSTATE:
			setSensorstate((SensorState) null);
			return;
		case TurtlebotPackage.TURTLE_BOT__VERSIONINFO:
			setVersioninfo((VersionInfo) null);
			return;
		case TurtlebotPackage.TURTLE_BOT__SENSOR:
			setSensor((Sensor) null);
			return;
		case TurtlebotPackage.TURTLE_BOT__ODOMETRY:
			setOdometry((Odometry) null);
			return;
		case TurtlebotPackage.TURTLE_BOT__LASERSCAN:
			setLaserscan((LaserScan) null);
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
		case TurtlebotPackage.TURTLE_BOT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TurtlebotPackage.TURTLE_BOT__BATTERYSTATUS:
			return batterystatus != null;
		case TurtlebotPackage.TURTLE_BOT__VELOCITY:
			return velocity != null;
		case TurtlebotPackage.TURTLE_BOT__DIAGNOSTICS:
			return diagnostics != null;
		case TurtlebotPackage.TURTLE_BOT__JOINTSTATE:
			return jointstate != null;
		case TurtlebotPackage.TURTLE_BOT__MAGNETICFIELD:
			return magneticfield != null;
		case TurtlebotPackage.TURTLE_BOT__SENSORSTATE:
			return sensorstate != null;
		case TurtlebotPackage.TURTLE_BOT__VERSIONINFO:
			return versioninfo != null;
		case TurtlebotPackage.TURTLE_BOT__SENSOR:
			return sensor != null;
		case TurtlebotPackage.TURTLE_BOT__ODOMETRY:
			return odometry != null;
		case TurtlebotPackage.TURTLE_BOT__LASERSCAN:
			return laserscan != null;
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
		result.append(')');
		return result.toString();
	}

} //TurtleBotImpl
