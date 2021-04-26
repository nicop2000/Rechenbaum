package de.dataport.taschenrechner.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.dataport.taschenrechner.model.*;


class OperatorKnotenTest {

	@Test
	void testGetWert() {

		BinaererOperatorKnoten op = new BinaererOperatorKnoten(BinaererOperator.PLUS);
		WertKnoten wk1 = new WertKnoten(1);
		WertKnoten wk2 = new WertKnoten(2);
		op.setLinkerAst(wk1);
		op.setRechterAst(wk2);
		assertEquals("(1.0 + 2.0)", op.toString());
		assertEquals(3, op.getWert());
		
		BinaererOperatorKnoten op2 = new BinaererOperatorKnoten(BinaererOperator.MULT);
		op2.setLinkerAst(op);
		op2.setRechterAst(new WertKnoten(3.0));
		assertEquals("((1.0 + 2.0) * 3.0)", op2.toString());
		
	}

}
