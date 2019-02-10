/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel.tests;

import fr.unice.polytech.robotproject.model.RobotProjectModel.MoveStraight;
import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Move Straight</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoveStraightTest extends TimedInstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MoveStraightTest.class);
	}

	/**
	 * Constructs a new Move Straight test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveStraightTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Move Straight test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MoveStraight getFixture() {
		return (MoveStraight)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotProjectModelFactory.eINSTANCE.createMoveStraight());
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

} //MoveStraightTest
