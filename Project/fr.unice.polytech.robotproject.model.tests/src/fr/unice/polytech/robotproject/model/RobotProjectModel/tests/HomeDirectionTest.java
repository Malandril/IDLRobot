/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel.tests;

import fr.unice.polytech.robotproject.model.RobotProjectModel.HomeDirection;
import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Home Direction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HomeDirectionTest extends AngleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HomeDirectionTest.class);
	}

	/**
	 * Constructs a new Home Direction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeDirectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Home Direction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HomeDirection getFixture() {
		return (HomeDirection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotProjectModelFactory.eINSTANCE.createHomeDirection());
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

} //HomeDirectionTest
