/**
 */
package org.xtext.onec.oneC;

import org.eclipse.xtext.xbase.XExpression;

import ru.awk.spb.xonec.XOneC.XParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.onec.oneC.Parametr#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.onec.oneC.OneCPackage#getParametr()
 * @model
 * @generated
 */
public interface Parametr extends XParam
{
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
   * @see org.xtext.onec.oneC.OneCPackage#getParametr_Value()
   * @model containment="true"
   * @generated
   */
  XExpression getValue();

  /**
   * Sets the value of the '{@link org.xtext.onec.oneC.Parametr#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(XExpression value);

} // Parametr
