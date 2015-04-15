/**
 */
package org.xtext.onec.oneC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

import ru.awk.spb.xonec.XOneC.XOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.onec.oneC.Let#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.Let#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.Let#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.Let#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.Let#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.Let#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.onec.oneC.OneCPackage#getLet()
 * @model
 * @generated
 */
public interface Let extends XOperator
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.onec.oneC.OneCPackage#getLet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.Let#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(XExpression)
   * @see org.xtext.onec.oneC.OneCPackage#getLet_Value()
   * @model containment="true"
   * @generated
   */
  XExpression getValue();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.Let#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(XExpression value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Let)
   * @see org.xtext.onec.oneC.OneCPackage#getLet_Left()
   * @model containment="true"
   * @generated
   */
  Let getLeft();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.Let#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Let value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Let)
   * @see org.xtext.onec.oneC.OneCPackage#getLet_Right()
   * @model containment="true"
   * @generated
   */
  Let getRight();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.Let#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Let value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(FormalParams)
   * @see org.xtext.onec.oneC.OneCPackage#getLet_Params()
   * @model containment="true"
   * @generated
   */
  FormalParams getParams();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.Let#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(FormalParams value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference list.
   * @see org.xtext.onec.oneC.OneCPackage#getLet_Index()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getIndex();

} // Let
