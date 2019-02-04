/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel.impl;

import fr.unice.polytech.robotproject.model.RobotProjectModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotProjectModelFactoryImpl extends EFactoryImpl implements RobotProjectModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotProjectModelFactory init() {
		try {
			RobotProjectModelFactory theRobotProjectModelFactory = (RobotProjectModelFactory)EPackage.Registry.INSTANCE.getEFactory(RobotProjectModelPackage.eNS_URI);
			if (theRobotProjectModelFactory != null) {
				return theRobotProjectModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotProjectModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotProjectModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RobotProjectModelPackage.MOVE_STRAIGHT: return createMoveStraight();
			case RobotProjectModelPackage.ROBOT: return createRobot();
			case RobotProjectModelPackage.TURN: return createTurn();
			case RobotProjectModelPackage.AMOUNT: return createAmount();
			case RobotProjectModelPackage.DURATION: return createDuration();
			case RobotProjectModelPackage.INTEGER_VALUE: return createIntegerValue();
			case RobotProjectModelPackage.NAMED_BLOCK: return createNamedBlock();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveStraight createMoveStraight() {
		MoveStraightImpl moveStraight = new MoveStraightImpl();
		return moveStraight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turn createTurn() {
		TurnImpl turn = new TurnImpl();
		return turn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amount createAmount() {
		AmountImpl amount = new AmountImpl();
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedBlock createNamedBlock() {
		NamedBlockImpl namedBlock = new NamedBlockImpl();
		return namedBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotProjectModelPackage getRobotProjectModelPackage() {
		return (RobotProjectModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotProjectModelPackage getPackage() {
		return RobotProjectModelPackage.eINSTANCE;
	}

} //RobotProjectModelFactoryImpl
