package org.metaabm.gen.test;

/**
 * Spatial Model Java Implementation. Generated by metaabm system: Apr 13, 2008
 * 3:03:48 PM EDT in project: org.metaabm.gen.repast.test (testing)
 */
public interface ISpatialModel {

    /**
     * Gets the Complex Movement Agent Count property for Spatial Model.
     * 
     * @return The number of complex movement agents to create.
     */
    public int getComplexMovementAgentCount();

    /**
     * Sets the Complex Movement Agent Count property for Spatial Model. The
     * number of complex movement agents to create.
     * 
     * @param _complexMovementAgentCount the new Complex Movement Agent Count
     *            value
     */
    public void setComplexMovementAgentCount(int _complexMovementAgentCount);

    /**
     * Gets the Complex Location Count property for Spatial Model.
     * 
     * @return The number of complex locations to create.
     */
    public int getComplexLocationCount();

    /**
     * Sets the Complex Location Count property for Spatial Model. The number of
     * complex locations to create.
     * 
     * @param _complexLocationCount the new Complex Location Count value
     */
    public void setComplexLocationCount(int _complexLocationCount);

    /**
     * Gets the Spatial Model Agent Count property for Spatial Model.
     * 
     * @return The number of spatial model agents to create.
     */
    public int getSpatialModelAgentCount();

    /**
     * Sets the Spatial Model Agent Count property for Spatial Model. The number
     * of spatial model agents to create.
     * 
     * @param _spatialModelAgentCount the new Spatial Model Agent Count value
     */
    public void setSpatialModelAgentCount(int _spatialModelAgentCount);

    /**
     * Gets the Good Boundary property for Spatial Model.
     * 
     * @return
     */
    public double[] getGoodBoundary();

    /**
     * Sets the Good Boundary property for Spatial Model.
     * 
     * @param _goodBoundary the new Good Boundary value
     */
    public void setGoodBoundary(double[] _goodBoundary);
}
