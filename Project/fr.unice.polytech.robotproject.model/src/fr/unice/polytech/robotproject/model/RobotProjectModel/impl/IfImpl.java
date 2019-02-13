/**
 */
package fr.unice.polytech.robotproject.model.RobotProjectModel.impl;

import fr.unice.polytech.robotproject.model.RobotProjectModel.Condition;
import fr.unice.polytech.robotproject.model.RobotProjectModel.If;
import fr.unice.polytech.robotproject.model.RobotProjectModel.InstructionBlock;
import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IfImpl#getFalseBlock <em>False Block</em>}</li>
 *   <li>{@link fr.unice.polytech.robotproject.model.RobotProjectModel.impl.IfImpl#getTrueBlock <em>True Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends MinimalEObjectImpl.Container implements If {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getFalseBlock() <em>False Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseBlock()
	 * @generated
	 * @ordered
	 */
	protected InstructionBlock falseBlock;

	/**
	 * The cached value of the '{@link #getTrueBlock() <em>True Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueBlock()
	 * @generated
	 * @ordered
	 */
	protected InstructionBlock trueBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotProjectModelPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotProjectModelPackage.IF__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotProjectModelPackage.IF__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotProjectModelPackage.IF__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotProjectModelPackage.IF__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionBlock getFalseBlock() {
		return falseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFalseBlock(InstructionBlock newFalseBlock, NotificationChain msgs) {
		InstructionBlock oldFalseBlock = falseBlock;
		falseBlock = newFalseBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotProjectModelPackage.IF__FALSE_BLOCK, oldFalseBlock, newFalseBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseBlock(InstructionBlock newFalseBlock) {
		if (newFalseBlock != falseBlock) {
			NotificationChain msgs = null;
			if (falseBlock != null)
				msgs = ((InternalEObject)falseBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotProjectModelPackage.IF__FALSE_BLOCK, null, msgs);
			if (newFalseBlock != null)
				msgs = ((InternalEObject)newFalseBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotProjectModelPackage.IF__FALSE_BLOCK, null, msgs);
			msgs = basicSetFalseBlock(newFalseBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotProjectModelPackage.IF__FALSE_BLOCK, newFalseBlock, newFalseBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionBlock getTrueBlock() {
		return trueBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrueBlock(InstructionBlock newTrueBlock, NotificationChain msgs) {
		InstructionBlock oldTrueBlock = trueBlock;
		trueBlock = newTrueBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotProjectModelPackage.IF__TRUE_BLOCK, oldTrueBlock, newTrueBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueBlock(InstructionBlock newTrueBlock) {
		if (newTrueBlock != trueBlock) {
			NotificationChain msgs = null;
			if (trueBlock != null)
				msgs = ((InternalEObject)trueBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotProjectModelPackage.IF__TRUE_BLOCK, null, msgs);
			if (newTrueBlock != null)
				msgs = ((InternalEObject)newTrueBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotProjectModelPackage.IF__TRUE_BLOCK, null, msgs);
			msgs = basicSetTrueBlock(newTrueBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotProjectModelPackage.IF__TRUE_BLOCK, newTrueBlock, newTrueBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotProjectModelPackage.IF__CONDITION:
				return basicSetCondition(null, msgs);
			case RobotProjectModelPackage.IF__FALSE_BLOCK:
				return basicSetFalseBlock(null, msgs);
			case RobotProjectModelPackage.IF__TRUE_BLOCK:
				return basicSetTrueBlock(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotProjectModelPackage.IF__CONDITION:
				return getCondition();
			case RobotProjectModelPackage.IF__FALSE_BLOCK:
				return getFalseBlock();
			case RobotProjectModelPackage.IF__TRUE_BLOCK:
				return getTrueBlock();
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
			case RobotProjectModelPackage.IF__CONDITION:
				setCondition((Condition)newValue);
				return;
			case RobotProjectModelPackage.IF__FALSE_BLOCK:
				setFalseBlock((InstructionBlock)newValue);
				return;
			case RobotProjectModelPackage.IF__TRUE_BLOCK:
				setTrueBlock((InstructionBlock)newValue);
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
			case RobotProjectModelPackage.IF__CONDITION:
				setCondition((Condition)null);
				return;
			case RobotProjectModelPackage.IF__FALSE_BLOCK:
				setFalseBlock((InstructionBlock)null);
				return;
			case RobotProjectModelPackage.IF__TRUE_BLOCK:
				setTrueBlock((InstructionBlock)null);
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
			case RobotProjectModelPackage.IF__CONDITION:
				return condition != null;
			case RobotProjectModelPackage.IF__FALSE_BLOCK:
				return falseBlock != null;
			case RobotProjectModelPackage.IF__TRUE_BLOCK:
				return trueBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
