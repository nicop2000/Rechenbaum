package de.dataport.taschenrechner.model;

public enum BinaererOperator {
	
	PLUS {
		public String toString() {
			return "+";
			
		}
	},
	MINUS{
		public String toString() {
			return "-";
			
		}
	},
	MULT{
		public String toString() {
			return "*";
			
		}
	},
	DIV{
		public String toString() {
			return "/";
			
		}
	};

}
