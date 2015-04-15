/**
 */
package ru.awk.spb.xonec.XOneC.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ru.awk.spb.xonec.XOneC.XBlock;
import ru.awk.spb.xonec.XOneC.XMethod;
import ru.awk.spb.xonec.XOneC.XModule;
import ru.awk.spb.xonec.XOneC.XOneCPackage;
import ru.awk.spb.xonec.XOneC.XVariables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XModule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.awk.spb.xonec.XOneC.impl.XModuleImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.impl.XModuleImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.impl.XModuleImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XModuleImpl extends MinimalEObjectImpl.Container implements XModule {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<XMethod> methods;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected XBlock block;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<XVariables> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XOneCPackage.Literals.XMODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<XMethod>(XMethod.class, this, XOneCPackage.XMODULE__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBlock getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(XBlock newBlock, NotificationChain msgs) {
		XBlock oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XOneCPackage.XMODULE__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(XBlock newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XOneCPackage.XMODULE__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XOneCPackage.XMODULE__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOneCPackage.XMODULE__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XVariables> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<XVariables>(XVariables.class, this, XOneCPackage.XMODULE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XOneCPackage.XMODULE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case XOneCPackage.XMODULE__BLOCK:
				return basicSetBlock(null, msgs);
			case XOneCPackage.XMODULE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case XOneCPackage.XMODULE__METHODS:
				return getMethods();
			case XOneCPackage.XMODULE__BLOCK:
				return getBlock();
			case XOneCPackage.XMODULE__VARIABLES:
				return getVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XOneCPackage.XMODULE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends XMethod>)newValue);
				return;
			case XOneCPackage.XMODULE__BLOCK:
				setBlock((XBlock)newValue);
				return;
			case XOneCPackage.XMODULE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends XVariables>)newValue);
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
			case XOneCPackage.XMODULE__METHODS:
				getMethods().clear();
				return;
			case XOneCPackage.XMODULE__BLOCK:
				setBlock((XBlock)null);
				return;
			case XOneCPackage.XMODULE__VARIABLES:
				getVariables().clear();
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
			case XOneCPackage.XMODULE__METHODS:
				return methods != null && !methods.isEmpty();
			case XOneCPackage.XMODULE__BLOCK:
				return block != null;
			case XOneCPackage.XMODULE__VARIABLES:
				return variables != null && !variables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XModuleImpl
