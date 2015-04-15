/**
 */
package org.xtext.onec.oneC;

import org.eclipse.emf.common.util.EList;

import ru.awk.spb.xonec.XOneC.XBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.onec.oneC.Try#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.Try#getAlterblock <em>Alterblock</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.onec.oneC.OneCPackage#getTry()
 * @model
 * @generated
 */
public interface Try extends Operator
{
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
   * @see org.xtext.onec.oneC.OneCPackage#getTry_Block()
   * @model containment="true"
   * @generated
   */
  EList<XBlock> getBlock();

  /**
   * Returns the value of the '<em><b>Alterblock</b></em>' containment reference list.
   * The list contents are of type {@link ru.awk.spb.xonec.XOneC.XBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alterblock</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alterblock</em>' containment reference list.
   * @see org.xtext.onec.oneC.OneCPackage#getTry_Alterblock()
   * @model containment="true"
   * @generated
   */
  EList<XBlock> getAlterblock();

} // Try
