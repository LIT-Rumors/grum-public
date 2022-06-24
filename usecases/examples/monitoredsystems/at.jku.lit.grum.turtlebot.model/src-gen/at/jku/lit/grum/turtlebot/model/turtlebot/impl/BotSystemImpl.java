/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.BotSystem;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bot System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.BotSystemImpl#getTurtlebots <em>Turtlebots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BotSystemImpl extends MinimalEObjectImpl.Container implements BotSystem {
	/**
	 * The cached value of the '{@link #getTurtlebots() <em>Turtlebots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurtlebots()
	 * @generated
	 * @ordered
	 */
	protected EList<TurtleBot> turtlebots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BotSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotPackage.Literals.BOT_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TurtleBot> getTurtlebots() {
		if (turtlebots == null) {
			turtlebots = new EObjectContainmentEList<TurtleBot>(TurtleBot.class, this,
					TurtlebotPackage.BOT_SYSTEM__TURTLEBOTS);
		}
		return turtlebots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TurtlebotPackage.BOT_SYSTEM__TURTLEBOTS:
			return ((InternalEList<?>) getTurtlebots()).basicRemove(otherEnd, msgs);
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
		case TurtlebotPackage.BOT_SYSTEM__TURTLEBOTS:
			return getTurtlebots();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TurtlebotPackage.BOT_SYSTEM__TURTLEBOTS:
			getTurtlebots().clear();
			getTurtlebots().addAll((Collection<? extends TurtleBot>) newValue);
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
		case TurtlebotPackage.BOT_SYSTEM__TURTLEBOTS:
			getTurtlebots().clear();
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
		case TurtlebotPackage.BOT_SYSTEM__TURTLEBOTS:
			return turtlebots != null && !turtlebots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BotSystemImpl
