/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel.tests;

import fr.unice.polytech.robotproject.model.RobotProjectModel.Print;
import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrintTest extends TestCase {

	/**
	 * The fixture for this Print test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Print fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrintTest.class);
	}

	/**
	 * Constructs a new Print test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Print test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Print fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Print test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Print getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotProjectModelFactory.eINSTANCE.createPrint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PrintTest
