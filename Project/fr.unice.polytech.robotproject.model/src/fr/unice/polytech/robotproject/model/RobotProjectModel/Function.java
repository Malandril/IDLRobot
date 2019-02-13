/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Function#getName <em>Name</em>}</li>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Function#getInstructionBlock <em>Instruction Block</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Instruction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getFunction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instruction Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Block</em>' containment reference.
	 * @see #setInstructionBlock(InstructionBlock)
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getFunction_InstructionBlock()
	 * @model containment="true"
	 * @generated
	 */
	InstructionBlock getInstructionBlock();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Function#getInstructionBlock <em>Instruction Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Block</em>' containment reference.
	 * @see #getInstructionBlock()
	 * @generated
	 */
	void setInstructionBlock(InstructionBlock value);

} // Function
