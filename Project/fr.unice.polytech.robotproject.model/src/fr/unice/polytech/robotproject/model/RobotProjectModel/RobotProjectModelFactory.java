/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage
 * @generated
 */
public interface RobotProjectModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotProjectModelFactory eINSTANCE = fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Move Straight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Straight</em>'.
	 * @generated
	 */
	MoveStraight createMoveStraight();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn</em>'.
	 * @generated
	 */
	Turn createTurn();

	/**
	 * Returns a new object of class '<em>Amount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount</em>'.
	 * @generated
	 */
	Amount createAmount();

	/**
	 * Returns a new object of class '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration</em>'.
	 * @generated
	 */
	Duration createDuration();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>Named Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Block</em>'.
	 * @generated
	 */
	NamedBlock createNamedBlock();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RobotProjectModelPackage getRobotProjectModelPackage();

} //RobotProjectModelFactory
