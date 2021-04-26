package de.dataport.taschenrechner.model;

public class BinaererOperatorKnoten extends AbstrakterBaumKnoten {

	private BinaererOperator operator;
	
	private BaumKnoten linkerAst;

	private BaumKnoten rechterAst;
	
	public BinaererOperatorKnoten(BinaererOperator operator) {
		this.operator = operator;
	}

	public BaumKnoten getLinkerAst() {
		return linkerAst;
	}

	public void setLinkerAst(BaumKnoten linkerAst) {
		this.linkerAst = linkerAst;
	}

	public BaumKnoten getRechterAst() {
		return rechterAst;
	}

	public void setRechterAst(BaumKnoten rechterAst) {
		this.rechterAst = rechterAst;
	}

	public double getWert() {
		switch (operator) {
		case PLUS:
			return linkerAst.getWert() + rechterAst.getWert();
		case MINUS:
			return linkerAst.getWert() - rechterAst.getWert();
		case MULT:
			return linkerAst.getWert() * rechterAst.getWert();
		case DIV:
			return linkerAst.getWert() / rechterAst.getWert();
		}
		throw new IllegalArgumentException("Unbekannter Operator");
	}
	
	public String toString() {
		return "(" + linkerAst.toString() + " " + operator.toString() + " " + rechterAst.toString() + ")";
	}

}
