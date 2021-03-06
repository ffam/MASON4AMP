package org.metaabm.gen.test;

/**
 * Complex Movement Agent Java Implementation. Generated by metaabm system: Apr
 * 13, 2008 3:03:48 PM EDT in project: org.metaabm.gen.repast.test (testing)
 */
public interface IComplexMovementAgent {

    /**
     * .
     */
    public void testDieAll();

    /**
     * .
     */
    public void testNegateSpatialThenIdentity();

    /**
     * .
     */
    public void testNegateSpatialWithIdentity();

    /**
     * .
     */
    public void testHostHere();

    /**
     * .
     */
    public void testConnectRandomOther();

    /**
     * .
     */
    public void testSetRandomOther();

    /**
     * .
     */
    public void testSetRandomOtherIf();

    /**
     * .
     */
    public void testSetRandomPostQuery();

    /**
     * .
     */
    public void testParallelSpatial();

    /**
     * .
     */
    public void testParallelRoot();

    /**
     * .
     */
    public void testParallelWithNetwork();

    /**
     * .
     */
    public void testNestedStatements();

    /**
     * Gets the Some Boolean property for Complex Movement Agent.
     * 
     * @return
     */
    public boolean isSomeBoolean();

    /**
     * Sets the Some Boolean property for Complex Movement Agent.
     * 
     * @param _someBoolean the new Some Boolean value
     */
    public void setSomeBoolean(boolean _someBoolean);

    /**
     * Gets the Within Space property for Complex Movement Agent.
     * 
     * @return
     */
    public double[] getWithinSpace();

    /**
     * Sets the Within Space property for Complex Movement Agent.
     * 
     * @param _withinSpace the new Within Space value
     */
    public void setWithinSpace(double[] _withinSpace);

    /**
     * Gets the Result property for Complex Movement Agent.
     * 
     * @return
     */
    public int getResult();

    /**
     * Sets the Result property for Complex Movement Agent.
     * 
     * @param _result the new Result value
     */
    public void setResult(int _result);

    /**
     * Gets the Spatial State property for Complex Movement Agent.
     * 
     * @return
     */
    public SpatialStateEnum getSpatialState();

    /**
     * Sets the Spatial State property for Complex Movement Agent.
     * 
     * @param _spatialState the new Spatial State value
     */
    public void setSpatialState(SpatialStateEnum _spatialState);

    /**
     * Gets the Vision property for Complex Movement Agent.
     * 
     * @return
     */
    public int getVision();

    /**
     * Sets the Vision property for Complex Movement Agent.
     * 
     * @param _vision the new Vision value
     */
    public void setVision(int _vision);
}
