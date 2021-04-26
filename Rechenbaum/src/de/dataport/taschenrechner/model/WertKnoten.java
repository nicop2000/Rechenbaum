package de.dataport.taschenrechner.model;

public class WertKnoten extends AbstrakterBaumKnoten {

	private double wert;

	private int kommastelle = 0;
	
	public WertKnoten() {
		this(0.0);
	}

	public WertKnoten(double wert) {
		this.wert = wert;
	}
	
	public WertKnoten(Ziffer ziffer) {
		this(ziffer.getWert());
	}

	public double getWert() {
		return wert;
	}

	public void fuegeZifferHinzu(Ziffer ziffer) {
		// 1 --> 2 --> 12
		if (kommastelle == 0) {

			wert = wert * 10 + ziffer.getWert();
		} else {
			// 123 --> , --> 4 ---> 123,4
			wert = wert + ziffer.getWert() / Math.pow(10, kommastelle);
			kommastelle++;
		}
	}

	public void setzeKomma() {
		kommastelle = 1;
	}

	public String toString() {
//		return Double.toString(wert);
//		return String.valueOf(wert);
		return wert + "";
	}

}
