package org.metaabm.gen.test;

/**
 * State Agent Java Implementation.
 * 
 * Generated by metaabm system: May 12, 2009 7:32:34 PM PDT in project: org.metaabm.gen.test  (testing) */

import static org.junit.Assert.*;

public class StateAgent {

	/**
	 * 
	 */

	private PrimaryColorEnum primaryColor = PrimaryColorEnum.red;
	/**
	 * Constructs a new State Agent.
	 */

	public StateAgent() {
		createUniqueID();
	}
	//todo, make this a useful value for evaluating compatibility of different versions of generated classes
	private static final long serialVersionUID = 89989998L;

	private String uniqueID;

	public String getUID() {
		return uniqueID;
	}

	public void createUniqueID() {
		uniqueID = org.apache.commons.lang.RandomStringUtils
				.randomAlphanumeric(5);
	}

	/**
	 * Clones the agent, ensuring that a unique id is assigned.
	 */
	public Object clone() {
		try {
			StateAgent clone = (StateAgent) super.clone();
			clone.createUniqueID();
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	@org.junit.Test
	public void dummy() {
		assertTrue(true);
	}
	/**
	 * .
	 */

	@org.junit.Test
	public void testSetStateToYellow() {

		/*PROTECTED REGION ID(StateAgent_testSetStateToYellow_Pre) ENABLED START*/
		//Pre-Conditions Here
		/*PROTECTED REGION END*/

		setPrimaryColor(PrimaryColorEnum.yellow);

		/*PROTECTED REGION ID(StateAgent_testSetStateToYellow_Post) ENABLED START*/
		//Post-Conditions Here
		/*PROTECTED REGION END*/

	}
	/**
	 * Gets the Primary Color property for State Agent.
	 * @return 
	 */

	public PrimaryColorEnum getPrimaryColor() {
		return primaryColor;
	}

	/**
	 * Sets the Primary Color property for State Agent.
	 * 
	 * @param _primaryColor the new Primary Color value
	 */

	public void setPrimaryColor(PrimaryColorEnum _primaryColor) {
		primaryColor = _primaryColor;
	}
}