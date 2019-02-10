/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Duration#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getDuration()
 * @model
 * @generated
 */
public interface Duration extends Amount {
	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit
	 * @see #setTimeUnit(TimeUnit)
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage#getDuration_TimeUnit()
	 * @model required="true"
	 * @generated
	 */
	TimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.robotproject.model.RobotProjectModel.Duration#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see fr.unice.polytech.robotproject.model.RobotProjectModel.TimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnit value);

} // Duration
