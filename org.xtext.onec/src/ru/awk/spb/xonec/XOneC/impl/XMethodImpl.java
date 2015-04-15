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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ru.awk.spb.xonec.XOneC.XBlock;
import ru.awk.spb.xonec.XOneC.XMethod;
import ru.awk.spb.xonec.XOneC.XOneCPackage;
import ru.awk.spb.xonec.XOneC.XParams;
import ru.awk.spb.xonec.XOneC.XVariables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.awk.spb.xonec.XOneC.impl.XMethodImpl#isRetVal <em>Ret Val</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.impl.XMethodImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.impl.XMethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.impl.XMethodImpl#getContext <em>Context</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.impl.XMethodImpl#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMethodImpl extends XVariableImpl implements XMethod {
	/**
	 * The default value of the '{@link #isRetVal() <em>Ret Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetVal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RET_VAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetVal() <em>Ret Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetVal()
	 * @generated
	 * @ordered
	 */
	protected boolean retVal = RET_VAL_EDEFAULT;

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
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected XParams params;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XOneCPackage.Literals.XMETHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRetVal() {
		return retVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetVal(boolean newRetVal) {
		boolean oldRetVal = retVal;
		retVal = newRetVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOneCPackage.XMETHOD__RET_VAL, oldRetVal, retVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XVariables> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<XVariables>(XVariables.class, this, XOneCPackage.XMETHOD__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XParams getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(XParams newParams, NotificationChain msgs) {
		XParams oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XOneCPackage.XMETHOD__PARAMS, oldParams, newParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(XParams newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XOneCPackage.XMETHOD__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XOneCPackage.XMETHOD__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOneCPackage.XMETHOD__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOneCPackage.XMETHOD__CONTEXT, oldContext, context));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XOneCPackage.XMETHOD__BLOCK, oldBlock, newBlock);
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
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XOneCPackage.XMETHOD__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XOneCPackage.XMETHOD__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOneCPackage.XMETHOD__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XOneCPackage.XMETHOD__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case XOneCPackage.XMETHOD__PARAMS:
				return basicSetParams(null, msgs);
			case XOneCPackage.XMETHOD__BLOCK:
				return basicSetBlock(null, msgs);
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
			case XOneCPackage.XMETHOD__RET_VAL:
				return isRetVal();
			case XOneCPackage.XMETHOD__VARIABLES:
				return getVariables();
			case XOneCPackage.XMETHOD__PARAMS:
				return getParams();
			case XOneCPackage.XMETHOD__CONTEXT:
				return getContext();
			case XOneCPackage.XMETHOD__BLOCK:
				return getBlock();
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
			case XOneCPackage.XMETHOD__RET_VAL:
				setRetVal((Boolean)newValue);
				return;
			case XOneCPackage.XMETHOD__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends XVariables>)newValue);
				return;
			case XOneCPackage.XMETHOD__PARAMS:
				setParams((XParams)newValue);
				return;
			case XOneCPackage.XMETHOD__CONTEXT:
				setContext((String)newValue);
				return;
			case XOneCPackage.XMETHOD__BLOCK:
				setBlock((XBlock)newValue);
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
			case XOneCPackage.XMETHOD__RET_VAL:
				setRetVal(RET_VAL_EDEFAULT);
				return;
			case XOneCPackage.XMETHOD__VARIABLES:
				getVariables().clear();
				return;
			case XOneCPackage.XMETHOD__PARAMS:
				setParams((XParams)null);
				return;
			case XOneCPackage.XMETHOD__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case XOneCPackage.XMETHOD__BLOCK:
				setBlock((XBlock)null);
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
			case XOneCPackage.XMETHOD__RET_VAL:
				return retVal != RET_VAL_EDEFAULT;
			case XOneCPackage.XMETHOD__VARIABLES:
				return variables != null && !variables.isEmpty();
			case XOneCPackage.XMETHOD__PARAMS:
				return params != null;
			case XOneCPackage.XMETHOD__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case XOneCPackage.XMETHOD__BLOCK:
				return block != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (retVal: ");
		result.append(retVal);
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //XMethodImpl
