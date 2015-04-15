/**
 */
package org.xtext.onec.oneC.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.onec.oneC.OneCPackage;
import org.xtext.onec.oneC.Try;

import ru.awk.spb.xonec.XOneC.XBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.onec.oneC.impl.TryImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.impl.TryImpl#getAlterblock <em>Alterblock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TryImpl extends OperatorImpl implements Try
{
  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected EList<XBlock> block;

  /**
   * The cached value of the '{@link #getAlterblock() <em>Alterblock</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlterblock()
   * @generated
   * @ordered
   */
  protected EList<XBlock> alterblock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OneCPackage.Literals.TRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XBlock> getBlock()
  {
    if (block == null)
    {
      block = new EObjectContainmentEList<XBlock>(XBlock.class, this, OneCPackage.TRY__BLOCK);
    }
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XBlock> getAlterblock()
  {
    if (alterblock == null)
    {
      alterblock = new EObjectContainmentEList<XBlock>(XBlock.class, this, OneCPackage.TRY__ALTERBLOCK);
    }
    return alterblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OneCPackage.TRY__BLOCK:
        return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
      case OneCPackage.TRY__ALTERBLOCK:
        return ((InternalEList<?>)getAlterblock()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OneCPackage.TRY__BLOCK:
        return getBlock();
      case OneCPackage.TRY__ALTERBLOCK:
        return getAlterblock();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OneCPackage.TRY__BLOCK:
        getBlock().clear();
        getBlock().addAll((Collection<? extends XBlock>)newValue);
        return;
      case OneCPackage.TRY__ALTERBLOCK:
        getAlterblock().clear();
        getAlterblock().addAll((Collection<? extends XBlock>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OneCPackage.TRY__BLOCK:
        getBlock().clear();
        return;
      case OneCPackage.TRY__ALTERBLOCK:
        getAlterblock().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OneCPackage.TRY__BLOCK:
        return block != null && !block.isEmpty();
      case OneCPackage.TRY__ALTERBLOCK:
        return alterblock != null && !alterblock.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TryImpl
