package edu.brook.sugarscape;

/**
 * G A S_ Base Java Implementation.
 * Incomplete model!
 * Generated by metaabm system: Sep 16, 2009 7:25:01 PM PDT in project: org.eclipse.amp.amf.examples.ascape  */

public class GAS_Base extends org.ascape.model.Scape {

	/**
	 * The topology parameter for sugar peaks
	 */

	private double sugarMoundness = 0.0;
	/**
	 * The minimum vision that an agent may be given on initialization.Model parameter.
	 */

	private int minVision = 1;
	/**
	 * The maximum vision that an agent may be given on initialization.Model parameter.
	 */

	private int maxVision = 6;
	/**
	 * The minimum sugar metabolism that an agent may be given on initialization.Model parameter.
	 */

	private int minSugarMetabolism = 1;
	/**
	 * The maximum sugar metabolism that an agent may be given on initialization.Model parameter.
	 */

	private int maxSugarMetabolism = 4;
	/**
	 * The minimum age that an agent may be given on initialization.Model parameter.
	 */

	private int minDeathAge = 0;
	/**
	 * The minimum sugar that an agent may be given on initialization.Model parameter.
	 */

	private int minInitialSugar = 0;
	/**
	 * The maximum sugar that an agent may be given on initialization.Model parameter.
	 */

	private int maxInitialSugar = 0;
	/**
	 * The number of g a s_ base agents to create.
	 */

	private int gAS_BaseAgentCount = 60;
	/**
	 * The minimum age that an agent may be given on initialization.Model parameter.
	 */

	private int maxDeathAge = 0;
	/**
	 * The size of each dimension.
	 */

	private int[] sugarspaceDimensions = new int[2];
	/**
	 * 
	 */

	private org.ascape.model.Scape sugarspace = null;
	/**
	 * Constructs a new G A S_ Base.
	 */

	public GAS_Base() {
		createUniqueID();
		setSugarspaceWidth(50);
		setSugarspaceHeight(50);
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
			GAS_Base clone = (GAS_Base) super.clone();
			clone.createUniqueID();
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	/**
	 *  A basic sugarscape citizen. Provides basic funtionality for sugarscape agents as well as all desired functionality that could be included in base class without compromising good design or supporting unnecessary member variables. Despite the relativly large size of this class it is actually quite simple; much of the code is simply getters and setters for various initialization paramaters. author Miles T. Parker version 1.0
	 */

	private org.ascape.model.Scape sugarAgentList = null;
	/**
	 *  history 19990624 AAL changed variables from private to protected so SpiceCell could inherit seperated peak creation from initialize() history 19990629 AAL removed a variety of "sugar"related methods and          attributes, and put them in new class CommoditySource
	 */

	private org.ascape.model.Scape sugarCellList = null;

	/**
	 * Gets the Sugar Agent property for G A S_ Base.
	 * @return  A basic sugarscape citizen. Provides basic funtionality for sugarscape agents as well as all desired functionality that could be included in base class without compromising good design or supporting unnecessary member variables. Despite the relativly large size of this class it is actually quite simple; much of the code is simply getters and setters for various initialization paramaters. author Miles T. Parker version 1.0
	 */

	public org.ascape.model.Scape getSugarAgent() {
		return sugarAgentList;
	}

	/**
	 * Sets the Sugar Agent property for G A S_ Base.
	 *  A basic sugarscape citizen. Provides basic funtionality for sugarscape agents as well as all desired functionality that could be included in base class without compromising good design or supporting unnecessary member variables. Despite the relativly large size of this class it is actually quite simple; much of the code is simply getters and setters for various initialization paramaters. author Miles T. Parker version 1.0
	 * @param _sugarAgent the new Sugar Agent value
	 */

	public void setSugarAgent(org.ascape.model.Scape _sugarAgent) {
		sugarAgentList = _sugarAgent;
	}
	/**
	 * Gets the Sugar Cell property for G A S_ Base.
	 * @return  history 19990624 AAL changed variables from private to protected so SpiceCell could inherit seperated peak creation from initialize() history 19990629 AAL removed a variety of "sugar"related methods and          attributes, and put them in new class CommoditySource
	 */

	public org.ascape.model.Scape getSugarCell() {
		return sugarCellList;
	}

	/**
	 * Sets the Sugar Cell property for G A S_ Base.
	 *  history 19990624 AAL changed variables from private to protected so SpiceCell could inherit seperated peak creation from initialize() history 19990629 AAL removed a variety of "sugar"related methods and          attributes, and put them in new class CommoditySource
	 * @param _sugarCell the new Sugar Cell value
	 */

	public void setSugarCell(org.ascape.model.Scape _sugarCell) {
		sugarCellList = _sugarCell;
	}

	/**
	 * Creates the members of G A S_ Base. 
	 */
	public void createScape() {
		super.createScape();
		setName(toString());

		SugarAgent sugarAgentProto = new SugarAgent();
		sugarAgentList = new org.ascape.model.Scape();
		sugarAgentList.setName("Sugar Agent");
		sugarAgentList.setPrototypeAgent(sugarAgentProto);
		sugarAgentList.setExecutionOrder(org.ascape.model.Scape.RULE_ORDER);

		sugarspace = new org.ascape.model.Scape(
				new org.ascape.model.space.Array2DEuclidian());
		sugarspace.setPrototypeAgent(new SugarCell());
		sugarspace.setExtent(new org.ascape.model.space.Coordinate2DDiscrete(
				getSugarspaceDimensions()));
		sugarspace.setName("Build Sugarspace");
		((org.ascape.model.space.CollectionSpace) sugarspace.getSpace())
				.setPeriodic(true);
		add(sugarspace);
		org.ascape.model.Scape sugarCellList = sugarspace;

		add(sugarAgentList);

		sugarAgentProto.setHostScape(sugarspace);

		sugarAgentList
				.addStatCollector(new org.ascape.util.data.StatCollectorCSA(
						"Sugar Agent Population") {
					private static final long serialVersionUID = 684614444640209893L;

					@SuppressWarnings("unused")
					public final boolean meetsCondition(Object object) {
						return true;
					}
				});

		sugarAgentList.addRule(new org.ascape.model.rule.Rule("Harvest") {
			private static final long serialVersionUID = 6846144446402098981L;
			public void execute(org.ascape.model.Agent a) {
				((edu.brook.sugarscape.SugarAgent) a).harvest();
			}
		});
		sugarAgentList.addRule(new org.ascape.model.rule.Rule("Movement") {
			private static final long serialVersionUID = 6846144446402098981L;
			public void execute(org.ascape.model.Agent a) {
				((edu.brook.sugarscape.SugarAgent) a).movement();
			}
		});
		sugarAgentList.addRule(new org.ascape.model.rule.Rule("Metabolism") {
			private static final long serialVersionUID = 6846144446402098981L;
			public void execute(org.ascape.model.Agent a) {
				((edu.brook.sugarscape.SugarAgent) a).metabolism();
			}
		});

		sugarAgentList.addInitialRule(new org.ascape.model.rule.Rule(
				"Initialize") {
			private static final long serialVersionUID = 6846144446402098982L;
			public void execute(org.ascape.model.Agent a) {
				((edu.brook.sugarscape.SugarAgent) a).intializeNonFramework();
			}
		});
		sugarAgentList.addRule(new org.ascape.model.rule.Rule(
				"Death Starvation") {
			private static final long serialVersionUID = 6846144446402098981L;
			public void execute(org.ascape.model.Agent a) {
				((edu.brook.sugarscape.SugarAgent) a).deathStarvation();
			}
		});
		sugarAgentList.addRule(new org.ascape.model.rule.Rule("Death Old Age") {
			private static final long serialVersionUID = 6846144446402098981L;
			public void execute(org.ascape.model.Agent a) {
				((edu.brook.sugarscape.SugarAgent) a).deathOldAge();
			}
		});
		sugarCellList
				.addRule(new org.ascape.model.rule.Rule("Sugar Grow Back1") {
					private static final long serialVersionUID = 6846144446402098981L;
					public void execute(org.ascape.model.Agent a) {
						((edu.brook.sugarscape.SugarCell) a).sugarGrowBack1();
					}
				});
		sugarCellList.addRule(new org.ascape.model.rule.Rule(
				"Sugar Grow Back Epsilon") {
			private static final long serialVersionUID = 6846144446402098981L;
			public void execute(org.ascape.model.Agent a) {
				((edu.brook.sugarscape.SugarCell) a).sugarGrowBackEpsilon();
			}
		});

		sugarCellList.addInitialRule(new org.ascape.model.rule.Rule(
				"Initialize") {
			private static final long serialVersionUID = 6846144446402098982L;
			public void execute(org.ascape.model.Agent a) {
				((edu.brook.sugarscape.SugarCell) a).intializeNonFramework();
			}
		});

	}

	/**
	 * Creates UI views for G A S_ Base.
	 */
	public void createGraphicViews() {
		super.createGraphicViews();
		{
			org.ascape.view.vis.Overhead2DView sugarspaceView = new org.ascape.view.vis.Overhead2DView();
			sugarspaceView.setAgentSize(8);
			sugarspace.addView(sugarspaceView);
			sugarspaceView.getDrawSelection().setSelected(
					sugarspaceView.agents_oval_cells_draw_feature, false);
			sugarspaceView.getDrawSelection().setSelected(
					sugarspaceView.cells_fill_draw_feature, true);
			sugarspaceView.getDrawSelection().moveToFront(
					sugarspaceView.cells_fill_draw_feature);
		}
		{
			org.ascape.view.vis.ChartView chart = new org.ascape.view.vis.ChartView();
			addView(chart);
			//if (getRunner().getEnvironment() instanceof org.ascape.runtime.applet.AppletEnvironment) {
			//    chart.getChart().getLegend().setAnchor(com.jrefinery.chart.Legend.SOUTH);
			//}
			java.awt.Graphics dummyGraphics = new java.awt.image.BufferedImage(
					10, 10, java.awt.image.BufferedImage.TYPE_INT_RGB)
					.getGraphics();

			org.ascape.model.Scape sugarAgentScape = new GAS_Base();
			sugarAgentScape
					.setRunner(new org.ascape.runtime.NonGraphicRunner());
			SugarAgent sugarAgent = new SugarAgent() {
				public void requestUpdate() {
				}
			};
			sugarAgentScape.add(sugarAgent);

			org.ascape.model.HostCell sugarAgentHost = new org.ascape.model.HostCell() {
				public void requestUpdate() {
				}
			};
			sugarAgentHost
					.setOccupant((org.ascape.model.CellOccupant) sugarAgent);

			org.ascape.model.Scape sugarCellScape = new GAS_Base();
			sugarCellScape.setRunner(new org.ascape.runtime.NonGraphicRunner());
			SugarCell sugarCell = new SugarCell() {
				public void requestUpdate() {
				}
			};
			sugarCellScape.add(sugarCell);

		}
	}

	public void scapeSetup(org.ascape.model.event.ScapeEvent scapeEvent) {
		//Set the size of the scape populations, e.g. for mutable scapes that need to have their size reset

		sugarAgentList.setSize(gAS_BaseAgentCount);
	}

	public static void main(String[] args) {
		(new org.ascape.runtime.swing.SwingRunner()).open(
				"edu.brook.sugarscape.GAS_Base", args);
	}

	public java.awt.Color getColor() {
		return java.awt.Color.LIGHT_GRAY;
	}
	/**
	 * .
	 */

	public void intializeNonFramework() {

	}
	/**
	 * Gets the Sugar Moundness property for G A S_ Base.
	 * @return The topology parameter for sugar peaks
	 */

	public double getSugarMoundness() {
		return sugarMoundness;
	}

	/**
	 * Sets the Sugar Moundness property for G A S_ Base.
	 * The topology parameter for sugar peaks
	 * @param _sugarMoundness the new Sugar Moundness value
	 */

	public void setSugarMoundness(double _sugarMoundness) {
		sugarMoundness = _sugarMoundness;
	}
	/**
	 * Gets the Min Vision property for G A S_ Base.
	 * @return The minimum vision that an agent may be given on initialization.Model parameter.
	 */

	public int getMinVision() {
		return minVision;
	}

	/**
	 * Sets the Min Vision property for G A S_ Base.
	 * The minimum vision that an agent may be given on initialization.Model parameter.
	 * @param _minVision the new Min Vision value
	 */

	public void setMinVision(int _minVision) {
		minVision = _minVision;
	}
	/**
	 * Gets the Max Vision property for G A S_ Base.
	 * @return The maximum vision that an agent may be given on initialization.Model parameter.
	 */

	public int getMaxVision() {
		return maxVision;
	}

	/**
	 * Sets the Max Vision property for G A S_ Base.
	 * The maximum vision that an agent may be given on initialization.Model parameter.
	 * @param _maxVision the new Max Vision value
	 */

	public void setMaxVision(int _maxVision) {
		maxVision = _maxVision;
	}
	/**
	 * Gets the Min Sugar Metabolism property for G A S_ Base.
	 * @return The minimum sugar metabolism that an agent may be given on initialization.Model parameter.
	 */

	public int getMinSugarMetabolism() {
		return minSugarMetabolism;
	}

	/**
	 * Sets the Min Sugar Metabolism property for G A S_ Base.
	 * The minimum sugar metabolism that an agent may be given on initialization.Model parameter.
	 * @param _minSugarMetabolism the new Min Sugar Metabolism value
	 */

	public void setMinSugarMetabolism(int _minSugarMetabolism) {
		minSugarMetabolism = _minSugarMetabolism;
	}
	/**
	 * Gets the Max Sugar Metabolism property for G A S_ Base.
	 * @return The maximum sugar metabolism that an agent may be given on initialization.Model parameter.
	 */

	public int getMaxSugarMetabolism() {
		return maxSugarMetabolism;
	}

	/**
	 * Sets the Max Sugar Metabolism property for G A S_ Base.
	 * The maximum sugar metabolism that an agent may be given on initialization.Model parameter.
	 * @param _maxSugarMetabolism the new Max Sugar Metabolism value
	 */

	public void setMaxSugarMetabolism(int _maxSugarMetabolism) {
		maxSugarMetabolism = _maxSugarMetabolism;
	}
	/**
	 * Gets the Min Death Age property for G A S_ Base.
	 * @return The minimum age that an agent may be given on initialization.Model parameter.
	 */

	public int getMinDeathAge() {
		return minDeathAge;
	}

	/**
	 * Sets the Min Death Age property for G A S_ Base.
	 * The minimum age that an agent may be given on initialization.Model parameter.
	 * @param _minDeathAge the new Min Death Age value
	 */

	public void setMinDeathAge(int _minDeathAge) {
		minDeathAge = _minDeathAge;
	}
	/**
	 * Gets the Min Initial Sugar property for G A S_ Base.
	 * @return The minimum sugar that an agent may be given on initialization.Model parameter.
	 */

	public int getMinInitialSugar() {
		return minInitialSugar;
	}

	/**
	 * Sets the Min Initial Sugar property for G A S_ Base.
	 * The minimum sugar that an agent may be given on initialization.Model parameter.
	 * @param _minInitialSugar the new Min Initial Sugar value
	 */

	public void setMinInitialSugar(int _minInitialSugar) {
		minInitialSugar = _minInitialSugar;
	}
	/**
	 * Gets the Max Initial Sugar property for G A S_ Base.
	 * @return The maximum sugar that an agent may be given on initialization.Model parameter.
	 */

	public int getMaxInitialSugar() {
		return maxInitialSugar;
	}

	/**
	 * Sets the Max Initial Sugar property for G A S_ Base.
	 * The maximum sugar that an agent may be given on initialization.Model parameter.
	 * @param _maxInitialSugar the new Max Initial Sugar value
	 */

	public void setMaxInitialSugar(int _maxInitialSugar) {
		maxInitialSugar = _maxInitialSugar;
	}
	/**
	 * Gets the G A S_ Base Agent Count property for G A S_ Base.
	 * @return The number of g a s_ base agents to create.
	 */

	public int getGAS_BaseAgentCount() {
		return gAS_BaseAgentCount;
	}

	/**
	 * Sets the G A S_ Base Agent Count property for G A S_ Base.
	 * The number of g a s_ base agents to create.
	 * @param _gAS_BaseAgentCount the new G A S_ Base Agent Count value
	 */

	public void setGAS_BaseAgentCount(int _gAS_BaseAgentCount) {
		gAS_BaseAgentCount = _gAS_BaseAgentCount;
	}
	/**
	 * Gets the Max Death Age property for G A S_ Base.
	 * @return The minimum age that an agent may be given on initialization.Model parameter.
	 */

	public int getMaxDeathAge() {
		return maxDeathAge;
	}

	/**
	 * Sets the Max Death Age property for G A S_ Base.
	 * The minimum age that an agent may be given on initialization.Model parameter.
	 * @param _maxDeathAge the new Max Death Age value
	 */

	public void setMaxDeathAge(int _maxDeathAge) {
		maxDeathAge = _maxDeathAge;
	}
	/**
	 * Gets the Dimensions property for Sugarspace.
	 * @return The size of each dimension.
	 */

	public int[] getSugarspaceDimensions() {
		return sugarspaceDimensions;
	}

	/**
	 * Sets the Dimensions property for Sugarspace.
	 * The size of each dimension.
	 * @param _sugarspaceDimensions the new Dimensions value
	 */

	public void setSugarspaceDimensions(int[] _sugarspaceDimensions) {
		sugarspaceDimensions = _sugarspaceDimensions;
	}
	/**
	 * Gets the Width property for Sugarspace.
	 * @return The horizontal extent of the space.
	 */

	public int getSugarspaceWidth() {
		return sugarspaceDimensions[0];
	}

	/**
	 * Sets the Width property for Sugarspace.
	 * The horizontal extent of the space.
	 * @param _sugarspaceWidth the new Width value
	 */

	public void setSugarspaceWidth(int _sugarspaceWidth) {
		sugarspaceDimensions[0] = _sugarspaceWidth;
	}
	/**
	 * Gets the Height property for Sugarspace.
	 * @return The vertical extent of the space.
	 */

	public int getSugarspaceHeight() {
		return sugarspaceDimensions[1];
	}

	/**
	 * Sets the Height property for Sugarspace.
	 * The vertical extent of the space.
	 * @param _sugarspaceHeight the new Height value
	 */

	public void setSugarspaceHeight(int _sugarspaceHeight) {
		sugarspaceDimensions[1] = _sugarspaceHeight;
	}
	/**
	 * Gets the Sugarspace property for G A S_ Base.
	 * @return 
	 */

	public org.ascape.model.Scape getSugarspace() {
		return sugarspace;
	}

	/**
	 * Sets the Sugarspace property for G A S_ Base.
	 * 
	 * @param _sugarspace the new Sugarspace value
	 */

	public void setSugarspace(org.ascape.model.Scape _sugarspace) {
		sugarspace = _sugarspace;
	}

	public String getName() {
		if (name == null) {
			return "G A S_ Base " + uniqueID;
		} else {
			return name;
		}
	}
}