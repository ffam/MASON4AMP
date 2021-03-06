/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.abase.aBase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.abase.aBase.BooleanValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.abase.aBase.ABasePackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.amp.amf.abase.aBase.BOOLEAN}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.eclipse.amp.amf.abase.aBase.BOOLEAN
   * @see #setValue(BOOLEAN)
   * @see org.eclipse.amp.amf.abase.aBase.ABasePackage#getBooleanValue_Value()
   * @model
   * @generated
   */
  BOOLEAN getValue();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.abase.aBase.BooleanValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.eclipse.amp.amf.abase.aBase.BOOLEAN
   * @see #getValue()
   * @generated
   */
  void setValue(BOOLEAN value);

} // BooleanValue
