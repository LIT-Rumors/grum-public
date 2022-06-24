/**
 */
package at.jku.lit.grum.picar.model.picar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.jku.lit.grum.picar.model.picar.PicarFactory
 * @model kind="package"
 * @generated
 */
public interface PicarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "picar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lit.jku.at/grum/picar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "picar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PicarPackage eINSTANCE = at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.picar.model.picar.IdableElement <em>Idable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.picar.model.picar.IdableElement
	 * @see at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl#getIdableElement()
	 * @generated
	 */
	int IDABLE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDABLE_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Idable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Idable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.picar.model.picar.impl.PicarSystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.picar.model.picar.impl.PicarSystemImpl
	 * @see at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl#getPicarSystem()
	 * @generated
	 */
	int PICAR_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR_SYSTEM__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Picars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR_SYSTEM__PICARS = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR_SYSTEM_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR_SYSTEM_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.picar.model.picar.impl.PicarImpl <em>Picar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.picar.model.picar.impl.PicarImpl
	 * @see at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl#getPicar()
	 * @generated
	 */
	int PICAR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR__LOCATION = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR__IDENTIFIER = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR__STATUS = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Startlocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR__STARTLOCATION = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Geofence range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR__GEOFENCE_RANGE = IDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Picar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Picar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICAR_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.picar.model.picar.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.picar.model.picar.impl.LocationImpl
	 * @see at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LAT = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LON = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ALT = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.picar.model.picar.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.picar.model.picar.impl.StatusImpl
	 * @see at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__INITIALIZED = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operationmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__OPERATIONMODE = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.picar.model.picar.PicarSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.PicarSystem
	 * @generated
	 */
	EClass getPicarSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.lit.grum.picar.model.picar.PicarSystem#getPicars <em>Picars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Picars</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.PicarSystem#getPicars()
	 * @see #getPicarSystem()
	 * @generated
	 */
	EReference getPicarSystem_Picars();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.picar.model.picar.Picar <em>Picar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picar</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Picar
	 * @generated
	 */
	EClass getPicar();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.picar.model.picar.Picar#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Picar#getLocation()
	 * @see #getPicar()
	 * @generated
	 */
	EReference getPicar_Location();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.picar.model.picar.Picar#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Picar#getIdentifier()
	 * @see #getPicar()
	 * @generated
	 */
	EAttribute getPicar_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.picar.model.picar.Picar#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Picar#getStatus()
	 * @see #getPicar()
	 * @generated
	 */
	EReference getPicar_Status();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.picar.model.picar.Picar#getStartlocation <em>Startlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Startlocation</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Picar#getStartlocation()
	 * @see #getPicar()
	 * @generated
	 */
	EReference getPicar_Startlocation();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.picar.model.picar.Picar#getGeofence_range <em>Geofence range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geofence range</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Picar#getGeofence_range()
	 * @see #getPicar()
	 * @generated
	 */
	EAttribute getPicar_Geofence_range();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.picar.model.picar.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.picar.model.picar.Location#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Location#getLat()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.picar.model.picar.Location#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Location#getLon()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lon();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.picar.model.picar.Location#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Location#getAlt()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Alt();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.picar.model.picar.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.picar.model.picar.Status#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Status#isInitialized()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Initialized();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.picar.model.picar.Status#getOperationmode <em>Operationmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operationmode</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.Status#getOperationmode()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Operationmode();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.picar.model.picar.IdableElement <em>Idable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idable Element</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.IdableElement
	 * @generated
	 */
	EClass getIdableElement();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.picar.model.picar.IdableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.jku.lit.grum.picar.model.picar.IdableElement#getId()
	 * @see #getIdableElement()
	 * @generated
	 */
	EAttribute getIdableElement_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PicarFactory getPicarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.picar.model.picar.impl.PicarSystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.picar.model.picar.impl.PicarSystemImpl
		 * @see at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl#getPicarSystem()
		 * @generated
		 */
		EClass PICAR_SYSTEM = eINSTANCE.getPicarSystem();

		/**
		 * The meta object literal for the '<em><b>Picars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICAR_SYSTEM__PICARS = eINSTANCE.getPicarSystem_Picars();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.picar.model.picar.impl.PicarImpl <em>Picar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.picar.model.picar.impl.PicarImpl
		 * @see at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl#getPicar()
		 * @generated
		 */
		EClass PICAR = eINSTANCE.getPicar();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICAR__LOCATION = eINSTANCE.getPicar_Location();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICAR__IDENTIFIER = eINSTANCE.getPicar_Identifier();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICAR__STATUS = eINSTANCE.getPicar_Status();

		/**
		 * The meta object literal for the '<em><b>Startlocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICAR__STARTLOCATION = eINSTANCE.getPicar_Startlocation();

		/**
		 * The meta object literal for the '<em><b>Geofence range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICAR__GEOFENCE_RANGE = eINSTANCE.getPicar_Geofence_range();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.picar.model.picar.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.picar.model.picar.impl.LocationImpl
		 * @see at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LAT = eINSTANCE.getLocation_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LON = eINSTANCE.getLocation_Lon();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ALT = eINSTANCE.getLocation_Alt();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.picar.model.picar.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.picar.model.picar.impl.StatusImpl
		 * @see at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__INITIALIZED = eINSTANCE.getStatus_Initialized();

		/**
		 * The meta object literal for the '<em><b>Operationmode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__OPERATIONMODE = eINSTANCE.getStatus_Operationmode();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.picar.model.picar.IdableElement <em>Idable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.picar.model.picar.IdableElement
		 * @see at.jku.lit.grum.picar.model.picar.impl.PicarPackageImpl#getIdableElement()
		 * @generated
		 */
		EClass IDABLE_ELEMENT = eINSTANCE.getIdableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDABLE_ELEMENT__ID = eINSTANCE.getIdableElement_Id();

	}

} //PicarPackage
