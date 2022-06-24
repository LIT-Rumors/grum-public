/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bot System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.BotSystem#getTurtlebots <em>Turtlebots</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getBotSystem()
 * @model
 * @generated
 */
public interface BotSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Turtlebots</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turtlebots</em>' containment reference list.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getBotSystem_Turtlebots()
	 * @model containment="true"
	 * @generated
	 */
	EList<TurtleBot> getTurtlebots();

} // BotSystem
