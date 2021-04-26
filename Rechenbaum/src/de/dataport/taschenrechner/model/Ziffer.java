package de.dataport.taschenrechner.model;

public enum Ziffer {

	NULL,
	EINS,
	ZWEI,
	DREI,
	VIER,
	FUENF,
	SECHS,
	SIEBEN,
	ACHT,
	NEUN;
	
	public int getWert() {
		return this.ordinal();
	}
}
