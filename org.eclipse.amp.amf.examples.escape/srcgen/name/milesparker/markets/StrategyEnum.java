package name.milesparker.markets;

/**
 * <!-- begin-user-doc -->
 * Strategy Java Implementation.
 * 
 * Generated by AMF for model: Markets.metaabm in project: org.eclipse.amp.amf.examples.escape 
 * <!-- end-user-doc -->
 * @generated
 */
public enum StrategyEnum {
	value("Value"), momentum("Momentum"), random("Random");

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StrategyEnum(String name) {
		this.name = name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return name;
	}
}
