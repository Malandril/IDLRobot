/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Angle#getAngleUnit <em>Angle Unit</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getAngle()
 * @model
 * @generated
 */
public interface Angle extends Amount {
	/**
	 * Returns the value of the '<em><b>Angle Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Unit</em>' attribute.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit
	 * @see #setAngleUnit(AngleUnit)
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getAngle_AngleUnit()
	 * @model
	 * @generated
	 */
	AngleUnit getAngleUnit();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Angle#getAngleUnit <em>Angle Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Unit</em>' attribute.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.AngleUnit
	 * @see #getAngleUnit()
	 * @generated
	 */
	void setAngleUnit(AngleUnit value);

} // Angle
