package org.metaabm.examples.stupid3;

/**
 * Habitat Java Implementation.
 * 
 * Generated by metaabm system: Nov 2, 2009 8:54:40 PM PST in project: org.eclipse.amp.amf.examples.repast  */

public class Habitat {

	/**
	 * 
	 */

	private double foodAvailability = 0.0;
	/**
	 * 
	 */

	private double maximumFoodProductionRate = 0.01;
	/**
	 * Constructs a new Habitat.
	 */

	public Habitat() {
		createUniqueID();
	}

	//todo, make this a useful value for evaluating compatibility of different versions of generated classes
	private static final long serialVersionUID = 89989998L;

	private String uniqueID;

	public String getUID() {
		return uniqueID;
	}

	public void createUniqueID() {
		//uniqueID = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(5);
	}

	/**
	 * Clones the agent, ensuring that a unique id is assigned.
	 */
	public Object clone() {
		try {
			Habitat clone = (Habitat) super.clone();
			clone.createUniqueID();
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	/**
	 * 
	 */

	private StupidModel3 stupidModel3List = null;

	/**
	 * Gets the Stupid Model 3 property for .
	 * @return 
	 */

	public StupidModel3 getStupidModel3() {
		return stupidModel3List;
	}

	/**
	 * Sets the Stupid Model 3 property for .
	 * 
	 * @param _stupidModel3 the new Stupid Model 3 value
	 */

	public void setStupidModel3(StupidModel3 _stupidModel3) {
		stupidModel3List = _stupidModel3;
	}

	public double randomInRange(double minValue, double maxValue) {
		return repast.simphony.random.RandomHelper.nextDoubleFromTo(minValue,
				maxValue);
	}

	public double randomToLimit(double maxValue) {
		return repast.simphony.random.RandomHelper.nextDoubleFromTo(0.0,
				maxValue);
	}

	public int randomToLimit(int maxValue) {
		return repast.simphony.random.RandomHelper.nextIntFromTo(0, maxValue);
	}
	/**
	 * .
	 */

	@repast.simphony.engine.schedule.ScheduledMethod(start = 1, interval = 1, priority = -0)
	public void determindFoodProduction() {

		double calculateFoodProductionRate = repast.simphony.random.RandomHelper
				.nextDoubleFromTo(0, getMaximumFoodProductionRate());

		double newFoodProductionValue = getFoodAvailability()
				+ calculateFoodProductionRate;

		setFoodAvailability(newFoodProductionValue);

	}

	/**
	 * Gets the FoodAvailability property for Habitat.
	 * @return 
	 */

	@repast.simphony.parameter.Parameter(displayName = "FoodAvailability", usageName = "foodAvailability", defaultValue = "0.0")
	public double getFoodAvailability() {
		return foodAvailability;
	}

	/**
	 * Sets the FoodAvailability property for Habitat.
	 * 
	 * @param _foodAvailability the new FoodAvailability value
	 */

	public void setFoodAvailability(double _foodAvailability) {
		foodAvailability = _foodAvailability;
	}

	/**
	 * Gets the MaximumFoodProductionRate property for Habitat.
	 * @return 
	 */

	@repast.simphony.parameter.Parameter(displayName = "MaximumFoodProductionRate", usageName = "maximumFoodProductionRate", defaultValue = "0.01")
	public double getMaximumFoodProductionRate() {
		return maximumFoodProductionRate;
	}

	/**
	 * Sets the MaximumFoodProductionRate property for Habitat.
	 * 
	 * @param _maximumFoodProductionRate the new MaximumFoodProductionRate value
	 */

	public void setMaximumFoodProductionRate(double _maximumFoodProductionRate) {
		maximumFoodProductionRate = _maximumFoodProductionRate;
	}

}