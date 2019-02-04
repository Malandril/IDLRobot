/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel.impl;

import fr.unice.polytech.robotproject.model.RobotProjectModel.Amount;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Duration;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction;
import fr.unice.polytech.robotproject.model.RobotProjectModel.IntValue;
import fr.unice.polytech.robotproject.model.RobotProjectModel.IntegerValue;
import fr.unice.polytech.robotproject.model.RobotProjectModel.MoveStraight;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Movement;
import fr.unice.polytech.robotproject.model.RobotProjectModel.NamedBlock;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Robot;
import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelFactory;
import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Turn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotProjectModelPackageImpl extends EPackageImpl implements RobotProjectModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveStraightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedBlockEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RobotProjectModelPackageImpl() {
		super(eNS_URI, RobotProjectModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RobotProjectModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RobotProjectModelPackage init() {
		if (isInited) return (RobotProjectModelPackage)EPackage.Registry.INSTANCE.getEPackage(RobotProjectModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRobotProjectModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RobotProjectModelPackageImpl theRobotProjectModelPackage = registeredRobotProjectModelPackage instanceof RobotProjectModelPackageImpl ? (RobotProjectModelPackageImpl)registeredRobotProjectModelPackage : new RobotProjectModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRobotProjectModelPackage.createPackageContents();

		// Initialize created meta-data
		theRobotProjectModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRobotProjectModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RobotProjectModelPackage.eNS_URI, theRobotProjectModelPackage);
		return theRobotProjectModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveStraight() {
		return moveStraightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Instructions() {
		return (EReference)robotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMovement() {
		return movementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovement_Amount() {
		return (EReference)movementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovement_Duration() {
		return (EReference)movementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurn() {
		return turnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmount() {
		return amountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntValue() {
		return intValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntValue_Value() {
		return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Value() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedBlock() {
		return namedBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotProjectModelFactory getRobotProjectModelFactory() {
		return (RobotProjectModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		instructionEClass = createEClass(INSTRUCTION);

		moveStraightEClass = createEClass(MOVE_STRAIGHT);

		robotEClass = createEClass(ROBOT);
		createEReference(robotEClass, ROBOT__INSTRUCTIONS);

		movementEClass = createEClass(MOVEMENT);
		createEReference(movementEClass, MOVEMENT__AMOUNT);
		createEReference(movementEClass, MOVEMENT__DURATION);

		turnEClass = createEClass(TURN);

		amountEClass = createEClass(AMOUNT);

		intValueEClass = createEClass(INT_VALUE);
		createEAttribute(intValueEClass, INT_VALUE__VALUE);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);

		namedBlockEClass = createEClass(NAMED_BLOCK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moveStraightEClass.getESuperTypes().add(this.getMovement());
		movementEClass.getESuperTypes().add(this.getInstruction());
		turnEClass.getESuperTypes().add(this.getMovement());
		amountEClass.getESuperTypes().add(this.getIntValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveStraightEClass, MoveStraight.class, "MoveStraight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobot_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(movementEClass, Movement.class, "Movement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMovement_Amount(), this.getAmount(), null, "amount", null, 1, 1, Movement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMovement_Duration(), this.getDuration(), null, "duration", null, 0, 1, Movement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnEClass, Turn.class, "Turn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(amountEClass, Amount.class, "Amount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intValueEClass, IntValue.class, "IntValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuration_Value(), ecorePackage.getEInt(), "value", null, 1, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedBlockEClass, NamedBlock.class, "NamedBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

} //RobotProjectModelPackageImpl
