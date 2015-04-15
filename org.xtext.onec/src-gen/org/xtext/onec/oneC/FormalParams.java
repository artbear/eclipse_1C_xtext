/**
 */
package org.xtext.onec.oneC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.onec.oneC.FormalParams#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.onec.oneC.OneCPackage#getFormalParams()
 * @model
 * @generated
 */
public interface FormalParams extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.onec.oneC.OneCPackage#getFormalParams_Params()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getParams();

} // FormalParams
