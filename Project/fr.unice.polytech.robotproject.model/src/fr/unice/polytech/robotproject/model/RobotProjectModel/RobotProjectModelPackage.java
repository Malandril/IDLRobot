/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface RobotProjectModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RobotProjectModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/RobotProjectModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RobotProjectModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotProjectModelPackage eINSTANCE = fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 0;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.MovementImpl <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.MovementImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__DURATION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.MoveStraightImpl <em>Move Straight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.MoveStraightImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getMoveStraight()
	 * @generated
	 */
	int MOVE_STRAIGHT = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT__DURATION = MOVEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT__DISTANCE = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Straight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move Straight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 2;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.TurnImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__DURATION = MOVEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ANGLE = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.AmountImpl <em>Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.AmountImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getAmount()
	 * @generated
	 */
	int AMOUNT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DurationImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = AMOUNT__VALUE;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__TIME_UNIT = AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = AMOUNT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IntegerValueImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 7;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.NamedBlockImpl <em>Named Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.NamedBlockImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getNamedBlock()
	 * @generated
	 */
	int NAMED_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__NAME = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.GoToImpl <em>Go To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.GoToImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getGoTo()
	 * @generated
	 */
	int GO_TO = 9;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__DESTINATION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DistanceImpl <em>Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DistanceImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__VALUE = AMOUNT__VALUE;

	/**
	 * The feature id for the '<em><b>Distance Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__DISTANCE_UNIT = AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_FEATURE_COUNT = AMOUNT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION_COUNT = AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.AngleImpl <em>Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.AngleImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getAngle()
	 * @generated
	 */
	int ANGLE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__VALUE = AMOUNT__VALUE;

	/**
	 * The feature id for the '<em><b>Angle Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__ANGLE_UNIT = AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_FEATURE_COUNT = AMOUNT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_COUNT = AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit <em>Distance Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDistanceUnit()
	 * @generated
	 */
	int DISTANCE_UNIT = 12;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit <em>Angle Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getAngleUnit()
	 * @generated
	 */
	int ANGLE_UNIT = 13;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 14;


	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.MoveStraight <em>Move Straight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Straight</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.MoveStraight
	 * @generated
	 */
	EClass getMoveStraight();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.MoveStraight#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.MoveStraight#getDistance()
	 * @see #getMoveStraight()
	 * @generated
	 */
	EReference getMoveStraight_Distance();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Robot#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Robot#getInstructions()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Instructions();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Movement
	 * @generated
	 */
	EClass getMovement();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Movement#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Movement#getDuration()
	 * @see #getMovement()
	 * @generated
	 */
	EReference getMovement_Duration();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Turn#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Turn#getAngle()
	 * @see #getTurn()
	 * @generated
	 */
	EReference getTurn_Angle();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Amount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Amount
	 * @generated
	 */
	EClass getAmount();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Amount#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Amount#getValue()
	 * @see #getAmount()
	 * @generated
	 */
	EAttribute getAmount_Value();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Duration#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Duration#getTimeUnit()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_TimeUnit();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.NamedBlock <em>Named Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Block</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.NamedBlock
	 * @generated
	 */
	EClass getNamedBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.NamedBlock#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.NamedBlock#getInstructions()
	 * @see #getNamedBlock()
	 * @generated
	 */
	EReference getNamedBlock_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.NamedBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.NamedBlock#getName()
	 * @see #getNamedBlock()
	 * @generated
	 */
	EAttribute getNamedBlock_Name();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.GoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.GoTo
	 * @generated
	 */
	EClass getGoTo();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.GoTo#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.GoTo#getDestination()
	 * @see #getGoTo()
	 * @generated
	 */
	EReference getGoTo_Destination();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Distance
	 * @generated
	 */
	EClass getDistance();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Distance#getDistanceUnit <em>Distance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Unit</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Distance#getDistanceUnit()
	 * @see #getDistance()
	 * @generated
	 */
	EAttribute getDistance_DistanceUnit();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Angle
	 * @generated
	 */
	EClass getAngle();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Angle#getAngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle Unit</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Angle#getAngleUnit()
	 * @see #getAngle()
	 * @generated
	 */
	EAttribute getAngle_AngleUnit();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit <em>Distance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distance Unit</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit
	 * @generated
	 */
	EEnum getDistanceUnit();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Angle Unit</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit
	 * @generated
	 */
	EEnum getAngleUnit();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotProjectModelFactory getRobotProjectModelFactory();

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
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.MoveStraightImpl <em>Move Straight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.MoveStraightImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getMoveStraight()
		 * @generated
		 */
		EClass MOVE_STRAIGHT = eINSTANCE.getMoveStraight();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_STRAIGHT__DISTANCE = eINSTANCE.getMoveStraight_Distance();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__INSTRUCTIONS = eINSTANCE.getRobot_Instructions();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.MovementImpl <em>Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.MovementImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getMovement()
		 * @generated
		 */
		EClass MOVEMENT = eINSTANCE.getMovement();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVEMENT__DURATION = eINSTANCE.getMovement_Duration();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.TurnImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURN__ANGLE = eINSTANCE.getTurn_Angle();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.AmountImpl <em>Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.AmountImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getAmount()
		 * @generated
		 */
		EClass AMOUNT = eINSTANCE.getAmount();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT__VALUE = eINSTANCE.getAmount_Value();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DurationImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__TIME_UNIT = eINSTANCE.getDuration_TimeUnit();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IntegerValueImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.NamedBlockImpl <em>Named Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.NamedBlockImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getNamedBlock()
		 * @generated
		 */
		EClass NAMED_BLOCK = eINSTANCE.getNamedBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_BLOCK__INSTRUCTIONS = eINSTANCE.getNamedBlock_Instructions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_BLOCK__NAME = eINSTANCE.getNamedBlock_Name();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.GoToImpl <em>Go To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.GoToImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getGoTo()
		 * @generated
		 */
		EClass GO_TO = eINSTANCE.getGoTo();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_TO__DESTINATION = eINSTANCE.getGoTo_Destination();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DistanceImpl <em>Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DistanceImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDistance()
		 * @generated
		 */
		EClass DISTANCE = eINSTANCE.getDistance();

		/**
		 * The meta object literal for the '<em><b>Distance Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE__DISTANCE_UNIT = eINSTANCE.getDistance_DistanceUnit();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.AngleImpl <em>Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.AngleImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getAngle()
		 * @generated
		 */
		EClass ANGLE = eINSTANCE.getAngle();

		/**
		 * The meta object literal for the '<em><b>Angle Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE__ANGLE_UNIT = eINSTANCE.getAngle_AngleUnit();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit <em>Distance Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDistanceUnit()
		 * @generated
		 */
		EEnum DISTANCE_UNIT = eINSTANCE.getDistanceUnit();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit <em>Angle Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getAngleUnit()
		 * @generated
		 */
		EEnum ANGLE_UNIT = eINSTANCE.getAngleUnit();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

	}

} //RobotProjectModelPackage
