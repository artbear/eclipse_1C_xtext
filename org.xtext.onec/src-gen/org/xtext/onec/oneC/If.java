/**
 */
package org.xtext.onec.oneC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

import ru.awk.spb.xonec.XOneC.XBlock;
import ru.awk.spb.xonec.XOneC.XOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.onec.oneC.If#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.If#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.If#getAlterblock <em>Alterblock</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.onec.oneC.OneCPackage#getIf()
 * @model
 * @generated
 */
public interface If extends XOperator
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference list.
   * @see org.xtext.onec.oneC.OneCPackage#getIf_Condition()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getCondition();

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference list.
   * The list contents are of type {@link ru.awk.spb.xonec.XOneC.XBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference list.
   * @see org.xtext.onec.oneC.OneCPackage#getIf_Block()
   * @model containment="true"
   * @generated
   */
  EList<XBlock> getBlock();

  /**
   * Returns the value of the '<em><b>Alterblock</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alterblock</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alterblock</em>' containment reference.
   * @see #setAlterblock(XBlock)
   * @see org.xtext.onec.oneC.OneCPackage#getIf_Alterblock()
   * @model containment="true"
   * @generated
   */
  XBlock getAlterblock();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.If#getAlterblock <em>Alterblock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alterblock</em>' containment reference.
   * @see #getAlterblock()
   * @generated
   */
  void setAlterblock(XBlock value);

} // If
