
/**
 * ComplexoR: complexos na forma normal.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */

	public class ComplexoR {
		//
		private double a; //  z = a + bi 
		private double b;
		//
		public ComplexoR() { a = 0.0; b = 0.0; }
		public ComplexoR(double r, double i) { a = r; b = i; }
		// 
		public double getR() { return a; } // parte real
		public double getI() { return b; } // p. imaginária

		// z + w = (a + bi) + (c + di) = (a+c) + (b+d)i
		public ComplexoR soma(ComplexoR cr) {
		 return new ComplexoR(a + cr.getR(), b + cr.getI());
		}

		// z*w = (a + bi) * (c + di) = (ac – bd) + (bc + ad) i
		public ComplexoR produto(ComplexoR cr) {
		  double a1 = a*cr.getR() - b*cr.getI();
		  double b1 = b*cr.getR() + a*getI();
		  return new ComplexoR(a1, b1);
		}

		// zc = a – bi (conjugado de z)
		public ComplexoR cojugado() {
			return new ComplexoR(a, -b); 
		}
		
		public String toString() {
		   StringBuilder s = new StringBuilder();
		   s.append("Cplx = "); s.append(a);
		    s.append( b>=0 ? "+" : "");
		   s.append(b +"i"); 
		   return s.toString();
	   }   
		   

     }