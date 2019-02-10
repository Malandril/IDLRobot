/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.TimedInstruction#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getTimedInstruction()
 * @model abstract="true"
 * @generated
 */
public interface TimedInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Duration)
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getTimedInstruction_Duration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.TimedInstruction#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

} // TimedInstruction
