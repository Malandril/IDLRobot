/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel.tests;

import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelFactory;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Turn;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurnTest extends MovementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TurnTest.class);
	}

	/**
	 * Constructs a new Turn test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Turn test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Turn getFixture() {
		return (Turn)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotProjectModelFactory.eINSTANCE.createTurn());
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

} //TurnTest
