/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel.tests;

import fr.unice.polytech.robotproject.model.RobotProjectModel.Amount;
import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Amount</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmountTest extends IntValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AmountTest.class);
	}

	/**
	 * Constructs a new Amount test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Amount test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Amount getFixture() {
		return (Amount)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotProjectModelFactory.eINSTANCE.createAmount());
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

} //AmountTest
