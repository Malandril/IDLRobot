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
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.TimedInstructionImpl <em>Timed Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.TimedInstructionImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getTimedInstruction()
	 * @generated
	 */
	int TIMED_INSTRUCTION = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTRUCTION__DURATION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

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
	int MOVE_STRAIGHT__DURATION = TIMED_INSTRUCTION__DURATION;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT__DISTANCE = TIMED_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Straight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT_FEATURE_COUNT = TIMED_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move Straight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT_OPERATION_COUNT = TIMED_INSTRUCTION_OPERATION_COUNT + 0;

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
	int TURN__DURATION = TIMED_INSTRUCTION__DURATION;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ANGLE = TIMED_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = TIMED_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = TIMED_INSTRUCTION_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.FunctionImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instruction Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INSTRUCTION_BLOCK = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.CallImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 8;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__DESTINATION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DistanceImpl <em>Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DistanceImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 9;

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
	int ANGLE = 10;

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
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.ConditionImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 11;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.SensorActivationImpl <em>Sensor Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.SensorActivationImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getSensorActivation()
	 * @generated
	 */
	int SENSOR_ACTIVATION = 12;

	/**
	 * The number of structural features of the '<em>Sensor Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTIVATION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTIVATION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.GrabImpl <em>Grab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.GrabImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getGrab()
	 * @generated
	 */
	int GRAB = 13;

	/**
	 * The number of structural features of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.ReleaseImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 14;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.WaitImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 15;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DURATION = TIMED_INSTRUCTION__DURATION;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = TIMED_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = TIMED_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IfImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getIf()
	 * @generated
	 */
	int IF = 16;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>False Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__FALSE_BLOCK = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>True Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__TRUE_BLOCK = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.InstructionBlockImpl <em>Instruction Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.InstructionBlockImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getInstructionBlock()
	 * @generated
	 */
	int INSTRUCTION_BLOCK = 17;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instruction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DetectedObjectIsImpl <em>Detected Object Is</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DetectedObjectIsImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDetectedObjectIs()
	 * @generated
	 */
	int DETECTED_OBJECT_IS = 18;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTED_OBJECT_IS__RIGHT_OPERAND = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Detected Object Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTED_OBJECT_IS_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Detected Object Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTED_OBJECT_IS_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.HomeDirectionImpl <em>Home Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.HomeDirectionImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getHomeDirection()
	 * @generated
	 */
	int HOME_DIRECTION = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_DIRECTION__VALUE = ANGLE__VALUE;

	/**
	 * The feature id for the '<em><b>Angle Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_DIRECTION__ANGLE_UNIT = ANGLE__ANGLE_UNIT;

	/**
	 * The number of structural features of the '<em>Home Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_DIRECTION_FEATURE_COUNT = ANGLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Home Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_DIRECTION_OPERATION_COUNT = ANGLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.PrintImpl
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 20;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__STRING = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit <em>Distance Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDistanceUnit()
	 * @generated
	 */
	int DISTANCE_UNIT = 21;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit <em>Angle Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getAngleUnit()
	 * @generated
	 */
	int ANGLE_UNIT = 22;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 23;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType <em>Detected Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDetectedType()
	 * @generated
	 */
	int DETECTED_TYPE = 24;


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
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.TimedInstruction <em>Timed Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Instruction</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.TimedInstruction
	 * @generated
	 */
	EClass getTimedInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.TimedInstruction#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.TimedInstruction#getDuration()
	 * @see #getTimedInstruction()
	 * @generated
	 */
	EReference getTimedInstruction_Duration();

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
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Function#getInstructionBlock <em>Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instruction Block</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Function#getInstructionBlock()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_InstructionBlock();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Call#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Call#getDestination()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Destination();

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
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.SensorActivation <em>Sensor Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Activation</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.SensorActivation
	 * @generated
	 */
	EClass getSensorActivation();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Grab <em>Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grab</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Grab
	 * @generated
	 */
	EClass getGrab();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.If#getFalseBlock <em>False Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>False Block</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.If#getFalseBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_FalseBlock();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.If#getTrueBlock <em>True Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>True Block</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.If#getTrueBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_TrueBlock();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.InstructionBlock <em>Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Block</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.InstructionBlock
	 * @generated
	 */
	EClass getInstructionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.InstructionBlock#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.InstructionBlock#getInstructions()
	 * @see #getInstructionBlock()
	 * @generated
	 */
	EReference getInstructionBlock_Instructions();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedObjectIs <em>Detected Object Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detected Object Is</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedObjectIs
	 * @generated
	 */
	EClass getDetectedObjectIs();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedObjectIs#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Operand</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedObjectIs#getRightOperand()
	 * @see #getDetectedObjectIs()
	 * @generated
	 */
	EAttribute getDetectedObjectIs_RightOperand();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.HomeDirection <em>Home Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Direction</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.HomeDirection
	 * @generated
	 */
	EClass getHomeDirection();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Print#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.Print#getString()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_String();

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
	 * Returns the meta object for enum '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType <em>Detected Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Type</em>'.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType
	 * @generated
	 */
	EEnum getDetectedType();

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
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.TimedInstructionImpl <em>Timed Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.TimedInstructionImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getTimedInstruction()
		 * @generated
		 */
		EClass TIMED_INSTRUCTION = eINSTANCE.getTimedInstruction();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_INSTRUCTION__DURATION = eINSTANCE.getTimedInstruction_Duration();

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
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.FunctionImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Instruction Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INSTRUCTION_BLOCK = eINSTANCE.getFunction_InstructionBlock();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.CallImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__DESTINATION = eINSTANCE.getCall_Destination();

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
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.ConditionImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.SensorActivationImpl <em>Sensor Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.SensorActivationImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getSensorActivation()
		 * @generated
		 */
		EClass SENSOR_ACTIVATION = eINSTANCE.getSensorActivation();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.GrabImpl <em>Grab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.GrabImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getGrab()
		 * @generated
		 */
		EClass GRAB = eINSTANCE.getGrab();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.ReleaseImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.WaitImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IfImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>False Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__FALSE_BLOCK = eINSTANCE.getIf_FalseBlock();

		/**
		 * The meta object literal for the '<em><b>True Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__TRUE_BLOCK = eINSTANCE.getIf_TrueBlock();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.InstructionBlockImpl <em>Instruction Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.InstructionBlockImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getInstructionBlock()
		 * @generated
		 */
		EClass INSTRUCTION_BLOCK = eINSTANCE.getInstructionBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_BLOCK__INSTRUCTIONS = eINSTANCE.getInstructionBlock_Instructions();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DetectedObjectIsImpl <em>Detected Object Is</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DetectedObjectIsImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDetectedObjectIs()
		 * @generated
		 */
		EClass DETECTED_OBJECT_IS = eINSTANCE.getDetectedObjectIs();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTED_OBJECT_IS__RIGHT_OPERAND = eINSTANCE.getDetectedObjectIs_RightOperand();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.HomeDirectionImpl <em>Home Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.HomeDirectionImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getHomeDirection()
		 * @generated
		 */
		EClass HOME_DIRECTION = eINSTANCE.getHomeDirection();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.PrintImpl
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__STRING = eINSTANCE.getPrint_String();

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

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType <em>Detected Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType
		 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.impl.RobotProjectModelPackageImpl#getDetectedType()
		 * @generated
		 */
		EEnum DETECTED_TYPE = eINSTANCE.getDetectedType();

	}

} //RobotProjectModelPackage
