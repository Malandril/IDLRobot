/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detected Object Is</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedObjectIs#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getDetectedObjectIs()
 * @model
 * @generated
 */
public interface DetectedObjectIs extends Condition {
	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' attribute.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType
	 * @see #setRightOperand(DetectedType)
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getDetectedObjectIs_RightOperand()
	 * @model required="true"
	 * @generated
	 */
	DetectedType getRightOperand();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedObjectIs#getRightOperand <em>Right Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' attribute.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(DetectedType value);

} // DetectedObjectIs
