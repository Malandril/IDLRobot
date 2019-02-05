/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Distance#getDistanceUnit <em>Distance Unit</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getDistance()
 * @model
 * @generated
 */
public interface Distance extends Amount {
	/**
	 * Returns the value of the '<em><b>Distance Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Unit</em>' attribute.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit
	 * @see #setDistanceUnit(DistanceUnit)
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getDistance_DistanceUnit()
	 * @model
	 * @generated
	 */
	DistanceUnit getDistanceUnit();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Distance#getDistanceUnit <em>Distance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Unit</em>' attribute.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit
	 * @see #getDistanceUnit()
	 * @generated
	 */
	void setDistanceUnit(DistanceUnit value);



} // Distance
