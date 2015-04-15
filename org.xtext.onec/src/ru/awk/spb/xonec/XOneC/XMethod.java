/**
 */
package ru.awk.spb.xonec.XOneC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XMethod#isRetVal <em>Ret Val</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XMethod#getVariables <em>Variables</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XMethod#getParams <em>Params</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XMethod#getContext <em>Context</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XMethod#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXMethod()
 * @model
 * @generated
 */
public interface XMethod extends XVariable {
	/**
	 * Returns the value of the '<em><b>Ret Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ret Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ret Val</em>' attribute.
	 * @see #setRetVal(boolean)
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXMethod_RetVal()
	 * @model
	 * @generated
	 */
	boolean isRetVal();

	/**
	 * Sets the value of the '{@link ru.awk.spb.xonec.XOneC.XMethod#isRetVal <em>Ret Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ret Val</em>' attribute.
	 * @see #isRetVal()
	 * @generated
	 */
	void setRetVal(boolean value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ru.awk.spb.xonec.XOneC.XVariables}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXMethod_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<XVariables> getVariables();

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(XParams)
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXMethod_Params()
	 * @model containment="true"
	 * @generated
	 */
	XParams getParams();

	/**
	 * Sets the value of the '{@link ru.awk.spb.xonec.XOneC.XMethod#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(XParams value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXMethod_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link ru.awk.spb.xonec.XOneC.XMethod#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(XBlock)
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXMethod_Block()
	 * @model containment="true"
	 * @generated
	 */
	XBlock getBlock();

	/**
	 * Sets the value of the '{@link ru.awk.spb.xonec.XOneC.XMethod#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(XBlock value);

} // XMethod
