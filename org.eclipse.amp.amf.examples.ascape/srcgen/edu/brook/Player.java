package edu.brook;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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
import org.ascape.model.space.Singleton;
import org.ascape.model.space.Location;
import org.ascape.util.Conditional;

import org.eclipse.amp.escape.runtime.extension.IAgentChild;

/**
 * <!-- begin-user-doc -->
 * Player Java Implementation.
 * 
 * Generated by AMF for model: DemographicPrisoner_sDilemma.metaabm in project: org.eclipse.amp.amf.examples.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public class Player extends CellOccupant {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean cooperate = false;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int age = 0;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int wealth = 0;

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
	 * Constructs a new Player.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player() {

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
			Player clone = (Player) super.clone();
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
	public DemographicPrisonersDilemma getDemographicPrisoner_sDilemma() {
		return (DemographicPrisonersDilemma) getScape().getScape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return Color.LIGHT_GRAY;
	}
	/**
	 * <!-- begin-user-doc -->
	 * Initialize Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void intializeNonFramework() {
		setWealth(getDemographicPrisoner_sDilemma().getInitialWealth());
		int randomToMaxAge = randomToLimit(getDemographicPrisoner_sDilemma()
				.getMaximumAge());

		boolean randomStrategy = getRandom().nextBoolean();

		setAge(randomToMaxAge);
		setCooperate(randomStrategy);
	}
	/**
	 * <!-- begin-user-doc -->
	 * Move To Random Location Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void moveToRandomLocation() {
		PlayCell randomCell2 = (PlayCell) ((org.ascape.model.space.Discrete) getDemographicPrisoner_sDilemma()
				.getGameSpace().getSpace()).findRandomAvailable();
		if (randomCell2 != null) {
			if (getHostScape() != ((Agent) randomCell2).getScape()) {
				die();
				getDemographicPrisoner_sDilemma().getPlayerScape().add(this);
			}
			moveTo(randomCell2);
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Random Walk Rule. Executed every period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void randomWalk() {
		PlayCell randomNeighbor = (PlayCell) ((org.ascape.model.space.Discrete) getDemographicPrisoner_sDilemma()
				.getGameSpace().getSpace())
				.findRandomAvailableNeighbor(((org.ascape.model.CellOccupant) this)
						.getHostCell());
		if (randomNeighbor != null) {
			if (getHostScape() != ((Agent) randomNeighbor).getScape()) {
				die();
				getDemographicPrisoner_sDilemma().getPlayerScape().add(this);
			}
			moveTo(randomNeighbor);
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Play Neighbor Rule. Executed every period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void playNeighbor() {
		Conditional otherPlayerCondition = new Conditional() {

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
			public boolean meetsCondition(Object otherPlayerCell) {
				if (otherPlayerCell instanceof Player) {
					return true;
				} else {
					return false;
				}
			}
		};
		Player otherPlayer = (Player) ((org.ascape.model.space.Discrete) getDemographicPrisoner_sDilemma()
				.getGameSpace().getSpace()).findRandomNeighbor(this,
				otherPlayerCondition);
		if (otherPlayer != null) {
			if ((otherPlayer.isCooperate() && isCooperate())) {
				int valueWealthAddPayoffCooperateCooperate = getWealth()
						+ getDemographicPrisoner_sDilemma().getPayoffCC();

				int valueWealthAddPayoffCooperateCooperateCopy = otherPlayer
						.getWealth()
						+ otherPlayer.getDemographicPrisoner_sDilemma()
								.getPayoffCC();

				setWealth(valueWealthAddPayoffCooperateCooperate);
				otherPlayer
						.setWealth(valueWealthAddPayoffCooperateCooperateCopy);
			}
			if ((otherPlayer.isCooperate() && !isCooperate())) {
				int valueWealthAddPayoffDefectCooperate = getWealth()
						+ getDemographicPrisoner_sDilemma().getPayoffDC();

				int valueWealthAddPayoffCooperateDefectCopy = otherPlayer
						.getWealth()
						+ otherPlayer.getDemographicPrisoner_sDilemma()
								.getPayoffCD();

				setWealth(valueWealthAddPayoffDefectCooperate);
				otherPlayer.setWealth(valueWealthAddPayoffCooperateDefectCopy);
			}
			if ((!otherPlayer.isCooperate() && isCooperate())) {
				int valueWealthAddPayoffCooperateDefect = getWealth()
						+ getDemographicPrisoner_sDilemma().getPayoffCD();

				int valueWealthAddPayoffDefectCooperateCopy = otherPlayer
						.getWealth()
						+ otherPlayer.getDemographicPrisoner_sDilemma()
								.getPayoffDC();

				setWealth(valueWealthAddPayoffCooperateDefect);
				otherPlayer.setWealth(valueWealthAddPayoffDefectCooperateCopy);
			}
			if ((!isCooperate() && !otherPlayer.isCooperate())) {
				int valueWealthAddPayoffDefectDefect = getWealth()
						+ getDemographicPrisoner_sDilemma().getPayoffDD();

				int valueWealthAddPayoffDefectDefectCopy = otherPlayer
						.getWealth()
						+ otherPlayer.getDemographicPrisoner_sDilemma()
								.getPayoffDD();

				setWealth(valueWealthAddPayoffDefectDefect);
				otherPlayer.setWealth(valueWealthAddPayoffDefectDefectCopy);
			}
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Update Age Rule. Executed every period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateAge() {
		int incrementAge = getAge() + 1;

		setAge(incrementAge);
	}
	/**
	 * <!-- begin-user-doc -->
	 * Fission Rule Rule. Executed every period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fissionRule() {
		if (getWealth() >= getDemographicPrisoner_sDilemma().getFissionWealth()) {
			PlayCell birthLocation = (PlayCell) ((org.ascape.model.space.Discrete) getDemographicPrisoner_sDilemma()
					.getGameSpace().getSpace())
					.findRandomAvailableNeighbor(((org.ascape.model.CellOccupant) this)
							.getHostCell());
			if (birthLocation != null) {

				Player createAgents = (Player) getDemographicPrisoner_sDilemma()
						.getPlayerScape().getSpace().newLocation(false);
				if (createAgents.getHostScape() != ((Agent) birthLocation)
						.getScape()) {
					die();
					getDemographicPrisoner_sDilemma().getPlayerScape().add(
							createAgents);
				}
				createAgents.moveTo(birthLocation);
				createAgents.setWealth(getDemographicPrisoner_sDilemma()
						.getInheiritedWealth());
				double valueRandomUnit = getRandom().nextDouble();

				int wealthChildWealth = getWealth()
						- createAgents.getDemographicPrisoner_sDilemma()
								.getInheiritedWealth();

				if (valueRandomUnit < createAgents
						.getDemographicPrisoner_sDilemma().getMutationRate()) {
					boolean valueRandomBoolean = getRandom().nextBoolean();

					createAgents.setCooperate(valueRandomBoolean);
				}
				if (!(valueRandomUnit < createAgents
						.getDemographicPrisoner_sDilemma().getMutationRate())) {
					createAgents.setCooperate(isCooperate());
				}
				setWealth(wealthChildWealth);
			}
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Die At Age Rule. Executed every period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dieAtAge() {
		if (getAge() > getDemographicPrisoner_sDilemma().getDeathAge()) {
			die();
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Die At Wealth 0 Rule. Executed every period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dieAtWealth0() {
		if (getWealth() < 0) {
			die();
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Gets the Cooperate property for Player.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCooperate() {
		return cooperate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Cooperate property for Player.
	 * 
	 * @param _cooperate the new Cooperate value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooperate(boolean _cooperate) {
		cooperate = _cooperate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Age property for Player.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Age property for Player.
	 * 
	 * @param _age the new Age value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int _age) {
		age = _age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Wealth property for Player.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWealth() {
		return wealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Wealth property for Player.
	 * 
	 * @param _wealth the new Wealth value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWealth(int _wealth) {
		wealth = _wealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		if (name == null) {
			return "Player " + getUID();
		} else {
			return name;
		}
	}
}
