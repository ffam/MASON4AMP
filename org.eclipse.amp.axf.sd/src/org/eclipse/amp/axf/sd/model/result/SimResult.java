package org.eclipse.amp.axf.sd.model.result;

import java.util.HashMap;

/**
 * Enth�lt das Resultat der Simulation
 * @author fei
 */
public class SimResult {
	/**Enth�lt zu jedem Zeitschrit der Berechnetet wert*/
	private HashMap<Integer, Double> values;
	
	public SimResult(){
		values = new HashMap<Integer, Double>();
	}
	/**
	 * F�gt ein Element zu den Berechneten Werten hinzu. Ist das Element mit dem definierten Zeitschrit
	 * bereits vorhanden so wird dieses ersetzt
	 * @param time
	 * @param value
	 */
	public void put(int time, double value){
		values.put(time, value);
	}
	/**
	 * Gibt das Element zum Zeitpunkt time zur�ck. Ist es nicht vorhanden --> null
	 * @param time
	 * @return
	 */
	public Double getValue(int time){
		return values.get(time);
	}
}
