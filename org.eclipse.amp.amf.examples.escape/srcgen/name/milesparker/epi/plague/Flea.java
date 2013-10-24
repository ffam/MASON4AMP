package name.milesparker.epi.plague;

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
 * Flea Java Implementation.
 * 
 * Generated by AMF for model: EpidemicPlague.metaabm in project: org.eclipse.amp.amf.examples.escape 
 * <!-- end-user-doc -->
 * @generated
 */
public class Flea extends CellOccupant {

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
	 * Constructs a new Flea.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flea() {

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
			Flea clone = (Flea) super.clone();
			clone.uniqueID = 0;
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epidemic getEpidemic() {
		return (Epidemic) getScape().getScape();
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
	 * Initialize Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void intializeNonFramework() {
		Object flea = (Object) ((org.ascape.model.space.Discrete) getEpidemic()
				.getCity().getSpace()).findRandomAvailable();
		if (flea != null) {
			if (getHostScape() != ((Agent) flea).getScape()) {
				die();
				getEpidemic().getFleaScape().add(this);
			}
			moveTo(((HostCell) flea));
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Flea Movement Rule. Executed every period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fleaMovement() {
		Conditional nearestRatCondition = new Conditional() {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			private static final long serialVersionUID = 6846144446402098985L;

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public boolean meetsCondition(Object nearestRatCell) {
				nearestRatCell = ((org.ascape.model.HostCell) nearestRatCell)
						.getOccupant();
				if (nearestRatCell instanceof Rat) {
					return true;
				} else {
					return false;
				}
			}
		};
		Location nearestRatLocation = ((org.ascape.model.space.Discrete) getEpidemic()
				.getCity().getSpace()).findNearest(
				((org.ascape.model.CellOccupant) this).getHostCell(),
				nearestRatCondition, false, getEpidemic().getFleaRange());
		if (nearestRatLocation != null) {
			Rat nearestRat = (Rat) ((org.ascape.model.HostCell) nearestRatLocation)
					.getOccupant();
			if (nearestRat != null) {
				moveToward(((org.ascape.model.CellOccupant) nearestRat)
						.getHostCell());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		if (name == null) {
			return "Flea " + getUID();
		} else {
			return name;
		}
	}
}