package org.metaabm.gen.test;

import org.apache.commons.lang.RandomStringUtils;

import repast.context.Context;
import repast.context.DefaultContext;
import repast.context.space.graph.NetworkFactoryFinder;
import repast.context.space.grid.GridFactoryFinder;

import repast.dataLoader.ContextBuilder;

import repast.engine.schedule.ScheduledMethod;

import repast.parameter.Parameter;

import repast.space.graph.Network;
import repast.space.grid.Grid;
import repast.space.grid.GridAdder;
import repast.space.grid.GridBuilderParameters;
import repast.space.grid.GridDimensions;
import repast.space.grid.SimpleGridAdder;
import repast.space.grid.StrictBorders;

import repast.util.ContextUtils;

/**
 * Act Model Java Implementation.
 * Most recent version.
 *
 * Generated by metaabm system: Nov 1, 2007 5:24:24 PM PDT
 */
public class ActModel extends DefaultContext implements ContextBuilder {

    /**
     * The number of areas to create.
     */
    private int areaCount;

    /**
     * The number of act person networks to create.
     */
    private int actPersonNetworkCount;

    /**
     * The number of generate act people to create.
     */
    private int actPerson1Count;

    /**
     * The number of act complex space persons to create.
     */
    private int actComplexSpacePersonCount;

    /**
     * The size of each dimension.
     */
    private int[] territoryDimensions = new int[2];

    /**
     *
     */
    private Grid territory;

    /**
     *
     */
    private Network testNetwork;
    private String uniqueID;

    /**
     * Constructs a new Act Model.
     */
    public ActModel() {
        createUniqueID();
        setTerritoryWidth(100);
        setTerritoryHeight(50);
    }

    /**
     * Builds and returns a context based on MetaABM generation for Repast. Building a context consists of filling it with
     * agents, adding projects and so forth. When this is called for the master context
     * the system will pass in a created context based on information given in the
     * model.score file. When called for subcontexts, each subcontext that was added
     * when the master context was built will be passed in.
     *
     * @param context
     * @return the built context.
     */
    public Context build(Context context) {

        //Agents are never actually added automatically
        GridAdder territoryAdder = new SimpleGridAdder();
        GridBuilderParameters params =
            new GridBuilderParameters(new StrictBorders(), territoryAdder,
                true, territoryDimensions);
        territory = GridFactoryFinder.createGridFactory(null)
                                     .createGrid("Territory", context, params);

        testNetwork = NetworkFactoryFinder.createNetworkFactory(null)
                                          .createNetwork("Test Network",
                context, false);

        ActPersonNetwork.setActModel(this);
        for (int i = 0; i < actPersonNetworkCount; i++) {
            ActPersonNetwork actPersonNetwork = new ActPersonNetwork();
            context.add(actPersonNetwork);
        }

        ActPerson1.setActModel(this);
        for (int i = 0; i < actPerson1Count; i++) {
            ActPerson1 actPerson1 = new ActPerson1();
            context.add(actPerson1);
        }

        ActComplexSpacePerson.setActModel(this);
        for (int i = 0; i < actComplexSpacePersonCount; i++) {
            ActComplexSpacePerson actComplexSpacePerson =
                new ActComplexSpacePerson();
            context.add(actComplexSpacePerson);
        }

        GridDimensions dims = territory.getDimensions();

        for (int d0 = 0; d0 < dims.getDimension(0); d0++) {
            for (int d1 = 0; d1 < dims.getDimension(1); d1++) {
                int[] nextLoc = { d0, d1 };
                Area area = new Area();
                context.add(area);
                territory.moveTo(area, nextLoc);

            }
        }

        return context;
    }

    /**
     * .
     */
    @ScheduledMethod(start = 1, interval = 1, priority = 4)
    public void testFake() {
        final Context context = ContextUtils.getContext(this);

        assertFake();

    }

    /**
     * .
     */
    public void assertFake() {
    }

    /**
     * Gets the Area Count property for Act Model.
     * @return The number of areas to create.
     */
    @Parameter(displayName = "Area Count", usageName = "areaCount", defaultValue = "")
    public int getAreaCount() {
        return areaCount;
    }

    /**
     * Sets the Area Count property for Act Model.
     * The number of areas to create.
     * @param _areaCount the new Area Count value
     */
    public void setAreaCount(int _areaCount) {
        areaCount = _areaCount;

    }

    /**
     * Gets the Act Person Network Count property for Act Model.
     * @return The number of act person networks to create.
     */
    @Parameter(displayName = "Act Person Network Count", usageName = "actPersonNetworkCount", defaultValue = "")
    public int getActPersonNetworkCount() {
        return actPersonNetworkCount;
    }

    /**
     * Sets the Act Person Network Count property for Act Model.
     * The number of act person networks to create.
     * @param _actPersonNetworkCount the new Act Person Network Count value
     */
    public void setActPersonNetworkCount(int _actPersonNetworkCount) {
        actPersonNetworkCount = _actPersonNetworkCount;

    }

    /**
     * Gets the Act Person 1 Count property for Act Model.
     * @return The number of generate act people to create.
     */
    @Parameter(displayName = "Act Person 1 Count", usageName = "actPerson1Count", defaultValue = "")
    public int getActPerson1Count() {
        return actPerson1Count;
    }

    /**
     * Sets the Act Person 1 Count property for Act Model.
     * The number of generate act people to create.
     * @param _actPerson1Count the new Act Person 1 Count value
     */
    public void setActPerson1Count(int _actPerson1Count) {
        actPerson1Count = _actPerson1Count;

    }

    /**
     * Gets the Act Complex Space Person Count property for Act Model.
     * @return The number of act complex space persons to create.
     */
    @Parameter(displayName = "Act Complex Space Person Count", usageName = "actComplexSpacePersonCount", defaultValue = "")
    public int getActComplexSpacePersonCount() {
        return actComplexSpacePersonCount;
    }

    /**
     * Sets the Act Complex Space Person Count property for Act Model.
     * The number of act complex space persons to create.
     * @param _actComplexSpacePersonCount the new Act Complex Space Person Count value
     */
    public void setActComplexSpacePersonCount(int _actComplexSpacePersonCount) {
        actComplexSpacePersonCount = _actComplexSpacePersonCount;

    }

    /**
     * Gets the Width property for Territory.
     * @return The horizontal extent of the space.
     */
    @Parameter(displayName = "Territory Width", usageName = "territoryWidth", defaultValue = "100")
    public int getTerritoryWidth() {
        return territoryDimensions[0];
    }

    /**
     * Sets the Width property for Territory.
     * The horizontal extent of the space.
     * @param _territoryWidth the new Width value
     */
    public void setTerritoryWidth(int _territoryWidth) {
        territoryDimensions[0] = _territoryWidth;

    }

    /**
     * Gets the Height property for Territory.
     * @return The vertical extent of the space.
     */
    @Parameter(displayName = "Territory Height", usageName = "territoryHeight", defaultValue = "50")
    public int getTerritoryHeight() {
        return territoryDimensions[1];
    }

    /**
     * Sets the Height property for Territory.
     * The vertical extent of the space.
     * @param _territoryHeight the new Height value
     */
    public void setTerritoryHeight(int _territoryHeight) {
        territoryDimensions[1] = _territoryHeight;

    }

    /**
     * Gets the Territory property for Projection.
     * @return
     */
    public Grid getTerritory() {
        return territory;
    }

    /**
     * Sets the Territory property for Projection.
     *
     * @param _territory the new Territory value
     */
    public void setTerritory(Grid _territory) {
        territory = _territory;

    }

    /**
     * Gets the Test Network property for Projection.
     * @return
     */
    public Network getTestNetwork() {
        return testNetwork;
    }

    /**
     * Sets the Test Network property for Projection.
     *
     * @param _testNetwork the new Test Network value
     */
    public void setTestNetwork(Network _testNetwork) {
        testNetwork = _testNetwork;

    }

    public String getUID() {
        return uniqueID;
    }

    public String toString() {
        return "Act Model " + uniqueID;
    }

    public void createUniqueID() {
        uniqueID = RandomStringUtils.randomAlphanumeric(5);
    }

    /**
     * Clones the agent, ensuring that a unique id is assigned.
     */
    public Object clone() {
        try {
            ActModel clone = (ActModel) super.clone();
            clone.createUniqueID();
            return clone;
        } catch (Exception e) {
            throw new RuntimeException("Unexpected cloning exception: " + e);
        }
    }
}
