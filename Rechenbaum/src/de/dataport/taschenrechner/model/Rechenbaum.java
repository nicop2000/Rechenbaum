package de.dataport.taschenrechner.model;

public class Rechenbaum implements BaumKnoten{
	
	private BaumKnoten wurzel;
	
//	private OperatorKnoten letzterOperatorKnoten;
	
	public Rechenbaum() {
		this(new WertKnoten(0.0));		
	}

	public Rechenbaum(BaumKnoten wurzel) {
		this.wurzel = wurzel;
	}
	
	@Override
	public double getWert() {
		return wurzel.getWert();
	}
	
	public String toString() {
		return wurzel.toString();
				
	}
	
	public void fuegeZifferHinzu(Ziffer ziffer) {
		/*
		 *  @todo
		 *  Der Rechenbaum sucht den WertKnoten, der die Ziffer entgegennehmen kann, oder 
		 *  legt einen neuen WertKnoten in den Baum ein.
		 */
	}
	
	public void erstelleOperatorKnoten(BinaererOperator operator) {
		/*
		 * OperatorKnoten erstellen und an der richtifen Stelle einfügen. Eventuell andere
		 * Knoten umhängen.
		 */
	}
	
	public void ersetzeOperatorKnoten(BinaererOperator operator) {

	}

}
