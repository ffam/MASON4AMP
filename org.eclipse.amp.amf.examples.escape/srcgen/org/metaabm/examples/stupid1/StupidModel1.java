package org.metaabm.examples.stupid1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.amp.agf.IGraphicsAdapted;
import org.eclipse.amp.agf.IGraphicsAdapter;

import org.eclipse.swt.graphics.Color;
import org.eclipse.jface.viewers.IColorProvider;

import org.ascape.model.Agent;
import org.ascape.model.Cell;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.LocatedAgent;
import org.ascape.model.Scape;
import org.ascape.model.event.ScapeEvent;
import org.ascape.model.rule.Rule;
import org.ascape.model.rule.ExecuteThenUpdate;
import org.ascape.model.space.CollectionSpace;
import org.ascape.model.space.Coordinate;
import org.ascape.model.space.Coordinate2DDiscrete;
import org.ascape.model.space.Graph;
import org.ascape.model.space.Location;
import org.ascape.model.space.Singleton;
import org.ascape.runtime.NonGraphicRunner;
import org.ascape.util.Conditional;
import org.ascape.util.data.DataPoint;
import org.ascape.util.data.DataPointConcrete;
import org.ascape.util.vis.ColorFeature;
import org.ascape.util.vis.ColorFeatureConcrete;
import org.ascape.view.vis.ChartView;
import org.ascape.view.vis.GEFView;
import org.ascape.view.vis.GraphView;

import org.eclipse.amp.escape.runtime.extension.IAgentChild;

/**
 * <!-- begin-user-doc -->
 * StupidModel1 Java Implementation.
 * 
 * Generated by AMF for model: StupidModel1.metaabm in project: org.eclipse.amp.amf.examples.escape 
 * <!-- end-user-doc -->
 * @generated
 */
public class StupidModel1 extends Scape implements IGraphicsAdapted {

	/**
	 * <!-- begin-user-doc -->
	 * The number of bugs to create.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int bugCount = 100;
	/**
	 * <!-- begin-user-doc -->
	 * The number of habitats to create.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int habitatCount = 0;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int bugVision = 4;
	/**
	 * <!-- begin-user-doc -->
	 * The size of each dimension.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int[] grid2DDimensions = new int[2];
	/**
	 * <!-- begin-user-doc -->
	 * The horizontal extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int grid2DWidth = 100;
	/**
	 * <!-- begin-user-doc -->
	 * The vertical extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int grid2DHeight = 100;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Scape grid2D = null;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private List<IAgentChild> children;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IAgentChild> getChildren() {
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Constructs a new StupidModel1.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StupidModel1() {

		children = new ArrayList<IAgentChild>();

	}

	//todo, make this a useful value for evaluating compatibility of different versions of generated classes

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 89989998L;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static long nextUniqueID;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private long uniqueID;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUID() {
		if (uniqueID == 0) {
			uniqueID = nextUniqueID++;
		}
		return uniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Clones the agent, ensuring that a unique id is assigned.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object clone() {
		try {
			StupidModel1 clone = (StupidModel1) super.clone();
			clone.uniqueID = 0;
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	org.ascape.model.Scape bugScape;

	/**
	 * <!-- begin-user-doc -->
	 * Create an instance of Bug that will be used to populate the bugScape.
	 * Overide to customize the prototype, for example to change the views created for a member scape.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bug createBugPrototype() {
		Bug bug = new Bug();
		bug.setCoordinate(new Coordinate2DDiscrete(0, 0));
		return bug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	static int next_vm_id;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int vm_unique_id;

	/**
	 * <!-- begin-user-doc -->
	 * Creates the members of StupidModel1.
	 * <!-- end-user-doc --> 
	 * @generated
	 */
	public void createScape() {
		super.createScape();

		setName("StupidModel1");
		Bug bugProto = createBugPrototype();
		bugScape = new Scape();
		bugScape.setName("Bugs");
		bugScape.setPrototypeAgent(bugProto);
		bugScape.setExecutionOrder(Scape.RULE_ORDER);

		for (IAgentChild tmp : bugProto.getChildren()) {
			tmp.addDataCollectors(this);
		}

		bugScape.setSize(getBugCount());
		grid2D = new Scape(new org.ascape.model.space.Array2DMoore());
		grid2D.setExecutionOrder(Scape.RULE_ORDER);
		Habitat protoHabitat = new Habitat();
		grid2D.setPrototypeAgent(protoHabitat);
		grid2D.setExtent(new org.ascape.model.space.Coordinate2DDiscrete(
				getGrid2DWidth(), getGrid2DHeight()));

		grid2D.setName("Grid 2Ds");
		((CollectionSpace) grid2D.getSpace()).setPeriodic(true);
		add(grid2D);
		org.ascape.model.Scape habitatScape = grid2D;
		for (IAgentChild tmp : protoHabitat.getChildren()) {
			tmp.addDataCollectors(this);
		}

		add(bugScape);

		for (IAgentChild tmp : bugProto.getChildren()) {
			tmp.addDataCollectors(this);
		}

		bugProto.setHostScape(grid2D);
		grid2D.getRules().clear();

		bugScape.addStatCollector(new org.ascape.util.data.StatCollectorCond(
				bugScape.getName() + " Population") {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			private static final long serialVersionUID = 684614444640209893L;

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@SuppressWarnings("unused")
			public final boolean meetsCondition(Object object) {
				return true;
			}
		});

		for (IAgentChild tmp : bugProto.getChildren()) {
			tmp.addDataCollectors(this);
		}

		bugScape.addInitialRule(new Rule("Initialize") {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			private static final long serialVersionUID = 6846144446402098982L;

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void execute(Agent a) {
				((org.metaabm.examples.stupid1.Bug) a).intializeNonFramework();
			}
		});
		bugScape.addRule(new Rule("Bug Rule") {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			private static final long serialVersionUID = 6846144446402098981L;

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void execute(Agent a) {
				((org.metaabm.examples.stupid1.Bug) a).bugRule();
			}
		});

		for (IAgentChild tmp : getChildren()) {
			tmp.addDataCollectors(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates UI views for StupidModel1.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createGraphicViews() {
		super.createGraphicViews();
		createChartViews();
		create2DViews();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void scapeSetup(ScapeEvent scapeEvent) {
		//Set the size of the scape populations, e.g. for mutable scapes that need to have their size reset

		bugScape.setSize(getBugCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the Scape containing Bugs.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ascape.model.Scape getBugScape() {
		return bugScape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createChartViews() {
		ChartView chart = new ChartView();

		final StupidModel1 bugScape = new StupidModel1();
		bugScape.setRunner(new NonGraphicRunner());
		Bug bug = new Bug() {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void requestUpdate() {
			}

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public StupidModel1 getStupidModel1() {
				return bugScape;
			}
		};
		bugScape.add(bug);
		HostCell bugHost = new HostCell() {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void requestUpdate() {
			}
		};
		bugHost.setOccupant((CellOccupant) bug);

		IColorProvider bugStyle2DColorProvider = new BugStyle2DColorProvider();

		final StupidModel1 habitatScape = new StupidModel1();
		habitatScape.setRunner(new NonGraphicRunner());
		Habitat habitat = new Habitat() {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void requestUpdate() {
			}

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public StupidModel1 getStupidModel1() {
				return habitatScape;
			}
		};
		habitatScape.add(habitat);

		IColorProvider habitatStyle2DColorProvider = new HabitatStyle2DColorProvider();
		addView(chart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create2DViews() {
		addView(new GEFView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGraphViews() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGraphicsAdapter getGraphicsAdapter() {
		return StupidModel1GraphicsAdapter.getDefault();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Color getInferredChartColor(Object agent,
			IColorProvider colorProvider) {
		Color color = colorProvider.getForeground(agent);
		if (color == ColorFeature.BLACK) {
			color = ColorFeatureConcrete.createHSB(
					(float) java.lang.Math.random() * 360f, 1.0f, 0.8f);
		}
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		(new NonGraphicRunner())
				.openInstance("org.metaabm.examples.stupid1.StupidModel1");
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void executeOnMembers() {
		int timeStep = getRunner().getPeriod();
		startSimulationAgentChild(timeStep);

		//A normal movable agent
		((Bug) bugScape.getPrototypeAgent())
				.startSimulationAgentChild(timeStep);

		//this is an agent that represent a cell and cannot move.

		((Habitat) grid2D.getPrototypeAgent())
				.startSimulationAgentChild(timeStep);

		super.executeOnMembers();
		calculateTimeStep(timeStep);

		//A normal movable agent
		((Bug) bugScape.getPrototypeAgent()).calculateTimeStep(timeStep);

		//this is an agent that represent a cell and cannot move.

		((Habitat) grid2D.getPrototypeAgent()).calculateTimeStep(timeStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void startSimulationAgentChild(int timeStep) {
		if (timeStep == getRoot().getRunner().getEarliestPeriod()) {
			for (IAgentChild tmp : children) {
				tmp.startSimulation(timeStep);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void calculateTimeStep(int timeStep) {
		for (IAgentChild tmp : children) {
			tmp.calculate(timeStep);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Bug Count property for StupidModel1.
	 * @return The number of bugs to create.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBugCount() {
		return bugCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Bug Count property for StupidModel1.
	 * The number of bugs to create.
	 * @param _bugCount the new Bug Count value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBugCount(int _bugCount) {
		bugCount = _bugCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Habitat Count property for StupidModel1.
	 * @return The number of habitats to create.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHabitatCount() {
		return habitatCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Habitat Count property for StupidModel1.
	 * The number of habitats to create.
	 * @param _habitatCount the new Habitat Count value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHabitatCount(int _habitatCount) {
		habitatCount = _habitatCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Bug Vision property for StupidModel1.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBugVision() {
		return bugVision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Bug Vision property for StupidModel1.
	 * 
	 * @param _bugVision the new Bug Vision value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBugVision(int _bugVision) {
		bugVision = _bugVision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Dimensions property for Grid 2D.
	 * @return The size of each dimension.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] getGrid2DDimensions() {
		return grid2DDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Dimensions property for Grid 2D.
	 * The size of each dimension.
	 * @param _grid2DDimensions the new Dimensions value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid2DDimensions(int[] _grid2DDimensions) {
		grid2DDimensions = _grid2DDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Width property for Grid 2D.
	 * @return The horizontal extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGrid2DWidth() {
		return grid2DWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Width property for Grid 2D.
	 * The horizontal extent of the space.
	 * @param _grid2DWidth the new Width value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid2DWidth(int _grid2DWidth) {
		grid2DWidth = _grid2DWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Height property for Grid 2D.
	 * @return The vertical extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGrid2DHeight() {
		return grid2DHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Height property for Grid 2D.
	 * The vertical extent of the space.
	 * @param _grid2DHeight the new Height value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid2DHeight(int _grid2DHeight) {
		grid2DHeight = _grid2DHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Grid 2D property for StupidModel1.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scape getGrid2D() {
		return grid2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Grid 2D property for StupidModel1.
	 * 
	 * @param _grid2D the new Grid 2D value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid2D(Scape _grid2D) {
		grid2D = _grid2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		if (name == null) {
			return "StupidModel1 " + getUID();
		} else {
			return name;
		}
	}
}
