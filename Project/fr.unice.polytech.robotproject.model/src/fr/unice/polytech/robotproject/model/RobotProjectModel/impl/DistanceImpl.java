/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel.impl;

import fr.unice.polytech.robotproject.model.RobotProjectModel.Distance;
import fr.unice.polytech.robotproject.model.RobotProjectModel.DistanceUnit;
import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DistanceImpl#getDistanceUnit <em>Distance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceImpl extends AmountImpl implements Distance {
	/**
	 * The default value of the '{@link #getDistanceUnit() <em>Distance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceUnit()
	 * @generated
	 * @ordered
	 */
	protected static final DistanceUnit DISTANCE_UNIT_EDEFAULT = DistanceUnit.CENTIMETERS;

	/**
	 * The cached value of the '{@link #getDistanceUnit() <em>Distance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceUnit()
	 * @generated
	 * @ordered
	 */
	protected DistanceUnit distanceUnit = DISTANCE_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotProjectModelPackage.Literals.DISTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceUnit getDistanceUnit() {
		return distanceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceUnit(DistanceUnit newDistanceUnit) {
		DistanceUnit oldDistanceUnit = distanceUnit;
		distanceUnit = newDistanceUnit == null ? DISTANCE_UNIT_EDEFAULT : newDistanceUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotProjectModelPackage.DISTANCE__DISTANCE_UNIT, oldDistanceUnit, distanceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotProjectModelPackage.DISTANCE__DISTANCE_UNIT:
				return getDistanceUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RobotProjectModelPackage.DISTANCE__DISTANCE_UNIT:
				setDistanceUnit((DistanceUnit)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RobotProjectModelPackage.DISTANCE__DISTANCE_UNIT:
				setDistanceUnit(DISTANCE_UNIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RobotProjectModelPackage.DISTANCE__DISTANCE_UNIT:
				return distanceUnit != DISTANCE_UNIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (distanceUnit: ");
		result.append(distanceUnit);
		result.append(')');
		return result.toString();
	}

} //DistanceImpl
