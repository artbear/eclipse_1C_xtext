/**
 */
package org.xtext.onec.oneC;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.onec.oneC.OneCPackage
 * @generated
 */
public interface OneCFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OneCFactory eINSTANCE = org.xtext.onec.oneC.impl.OneCFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Let</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Let</em>'.
   * @generated
   */
  Let createLet();

  /**
   * Returns a new object of class '<em>Formal Params</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Params</em>'.
   * @generated
   */
  FormalParams createFormalParams();

  /**
   * Returns a new object of class '<em>For</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For</em>'.
   * @generated
   */
  For createFor();

  /**
   * Returns a new object of class '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression</em>'.
   * @generated
   */
  XExpression createXExpression();

  /**
   * Returns a new object of class '<em>If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If</em>'.
   * @generated
   */
  If createIf();

  /**
   * Returns a new object of class '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator</em>'.
   * @generated
   */
  Operator createOperator();

  /**
   * Returns a new object of class '<em>XModule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XModule</em>'.
   * @generated
   */
  XModule createXModule();

  /**
   * Returns a new object of class '<em>Parametr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parametr</em>'.
   * @generated
   */
  Parametr createParametr();

  /**
   * Returns a new object of class '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return</em>'.
   * @generated
   */
  Return createReturn();

  /**
   * Returns a new object of class '<em>Raise</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Raise</em>'.
   * @generated
   */
  Raise createRaise();

  /**
   * Returns a new object of class '<em>Continuie</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continuie</em>'.
   * @generated
   */
  Continuie createContinuie();

  /**
   * Returns a new object of class '<em>Break</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Break</em>'.
   * @generated
   */
  Break createBreak();

  /**
   * Returns a new object of class '<em>Go To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Go To</em>'.
   * @generated
   */
  GoTo createGoTo();

  /**
   * Returns a new object of class '<em>Date Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Literal</em>'.
   * @generated
   */
  DateLiteral createDateLiteral();

  /**
   * Returns a new object of class '<em>Other Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Expr</em>'.
   * @generated
   */
  OtherExpr createOtherExpr();

  /**
   * Returns a new object of class '<em>XConstructor Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XConstructor Call</em>'.
   * @generated
   */
  XConstructorCall createXConstructorCall();

  /**
   * Returns a new object of class '<em>XBoolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XBoolean Literal</em>'.
   * @generated
   */
  XBooleanLiteral createXBooleanLiteral();

  /**
   * Returns a new object of class '<em>Try</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Try</em>'.
   * @generated
   */
  Try createTry();

  /**
   * Returns a new object of class '<em>Undefined Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Undefined Literal</em>'.
   * @generated
   */
  UndefinedLiteral createUndefinedLiteral();

  /**
   * Returns a new object of class '<em>XNull Literal Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XNull Literal Literal</em>'.
   * @generated
   */
  XNullLiteralLiteral createXNullLiteralLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OneCPackage getOneCPackage();

} //OneCFactory
