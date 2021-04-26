package de.dataport.taschenrechner.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.dataport.taschenrechner.model.*;

class RechenbaumTest {

	@Test
	void test() {
		
		BinaererOperatorKnoten op = new BinaererOperatorKnoten(BinaererOperator.PLUS);
		WertKnoten wk1 = new WertKnoten(1);
		WertKnoten wk2 = new WertKnoten(2);
		op.setLinkerAst(wk1);
		op.setRechterAst(wk2);
		Rechenbaum rb = new Rechenbaum(op);
		assertEquals(3.0, rb.getWert());
		assertEquals("(1.0 + 2.0)", op.toString());
	}

}
