package de.dataport.taschenrechner.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.dataport.taschenrechner.model.*;


class WertKnotenTest {

	@Test
	void testFuegeZifferHinzu() {
		
		WertKnoten wk1 = new WertKnoten(0.0);
		wk1.fuegeZifferHinzu(Ziffer.EINS);
		assertEquals(1.0, wk1.getWert());
		
		wk1.fuegeZifferHinzu(Ziffer.ZWEI);
		assertEquals(12.0, wk1.getWert());
		
		wk1.fuegeZifferHinzu(Ziffer.DREI);
		wk1.fuegeZifferHinzu(Ziffer.VIER);
		assertEquals(1234.0, wk1.getWert());
		
		wk1.setzeKomma();
		wk1.fuegeZifferHinzu(Ziffer.FUENF);
		assertEquals(1234.5, wk1.getWert());
		wk1.fuegeZifferHinzu(Ziffer.SECHS);
		assertEquals(1234.56, wk1.getWert());
		
	}

}
