/**
 */
package org.xtext.onec.oneC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XConstructor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.onec.oneC.XConstructorCall#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.XConstructorCall#isExplicitConstructorCall <em>Explicit Constructor Call</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.XConstructorCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.onec.oneC.OneCPackage#getXConstructorCall()
 * @model
 * @generated
 */
public interface XConstructorCall extends XExpression
{
  /**
   * Returns the value of the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructor</em>' attribute.
   * @see #setConstructor(String)
   * @see org.xtext.onec.oneC.OneCPackage#getXConstructorCall_Constructor()
   * @model
   * @generated
   */
  String getConstructor();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.XConstructorCall#getConstructor <em>Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constructor</em>' attribute.
   * @see #getConstructor()
   * @generated
   */
  void setConstructor(String value);

  /**
   * Returns the value of the '<em><b>Explicit Constructor Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explicit Constructor Call</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explicit Constructor Call</em>' attribute.
   * @see #setExplicitConstructorCall(boolean)
   * @see org.xtext.onec.oneC.OneCPackage#getXConstructorCall_ExplicitConstructorCall()
   * @model
   * @generated
   */
  boolean isExplicitConstructorCall();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.XConstructorCall#isExplicitConstructorCall <em>Explicit Constructor Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Constructor Call</em>' attribute.
   * @see #isExplicitConstructorCall()
   * @generated
   */
  void setExplicitConstructorCall(boolean value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.xtext.onec.oneC.OneCPackage#getXConstructorCall_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<org.eclipse.xtext.xbase.XExpression> getArguments();

} // XConstructorCall
