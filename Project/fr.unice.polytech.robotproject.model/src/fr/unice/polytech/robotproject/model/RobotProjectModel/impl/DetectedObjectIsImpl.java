/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel.impl;

import fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedObjectIs;
import fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType;
import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detected Object Is</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.DetectedObjectIsImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetectedObjectIsImpl extends ConditionImpl implements DetectedObjectIs {
	/**
	 * The default value of the '{@link #getRightOperand() <em>Right Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected static final DetectedType RIGHT_OPERAND_EDEFAULT = DetectedType.NULL;

	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected DetectedType rightOperand = RIGHT_OPERAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetectedObjectIsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotProjectModelPackage.Literals.DETECTED_OBJECT_IS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedType getRightOperand() {
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightOperand(DetectedType newRightOperand) {
		DetectedType oldRightOperand = rightOperand;
		rightOperand = newRightOperand == null ? RIGHT_OPERAND_EDEFAULT : newRightOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotProjectModelPackage.DETECTED_OBJECT_IS__RIGHT_OPERAND, oldRightOperand, rightOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotProjectModelPackage.DETECTED_OBJECT_IS__RIGHT_OPERAND:
				return getRightOperand();
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
			case RobotProjectModelPackage.DETECTED_OBJECT_IS__RIGHT_OPERAND:
				setRightOperand((DetectedType)newValue);
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
			case RobotProjectModelPackage.DETECTED_OBJECT_IS__RIGHT_OPERAND:
				setRightOperand(RIGHT_OPERAND_EDEFAULT);
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
			case RobotProjectModelPackage.DETECTED_OBJECT_IS__RIGHT_OPERAND:
				return rightOperand != RIGHT_OPERAND_EDEFAULT;
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
		result.append(" (rightOperand: ");
		result.append(rightOperand);
		result.append(')');
		return result.toString();
	}

} //DetectedObjectIsImpl
