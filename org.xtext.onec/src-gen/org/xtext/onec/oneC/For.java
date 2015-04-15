/**
 */
package org.xtext.onec.oneC;

import org.eclipse.xtext.xbase.XExpression;

import ru.awk.spb.xonec.XOneC.XBlock;
import ru.awk.spb.xonec.XOneC.XOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.onec.oneC.For#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.For#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.For#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.For#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.onec.oneC.OneCPackage#getFor()
 * @model
 * @generated
 */
public interface For extends XOperator
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
   * @see org.xtext.onec.oneC.OneCPackage#getFor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.For#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.onec.oneC.OneCPackage#getFor_Value()
   * @model containment="true"
   * @generated
   */
  XExpression getValue();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.For#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(XExpression value);

  /**
   * Returns the value of the '<em><b>Boundary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boundary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boundary</em>' containment reference.
   * @see #setBoundary(XExpression)
   * @see org.xtext.onec.oneC.OneCPackage#getFor_Boundary()
   * @model containment="true"
   * @generated
   */
  XExpression getBoundary();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.For#getBoundary <em>Boundary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boundary</em>' containment reference.
   * @see #getBoundary()
   * @generated
   */
  void setBoundary(XExpression value);

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
   * @see org.xtext.onec.oneC.OneCPackage#getFor_Block()
   * @model containment="true"
   * @generated
   */
  XBlock getBlock();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.For#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(XBlock value);

} // For
