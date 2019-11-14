/**
 * Elipse = Circulo + 1 ponto
 * 
 * @author F. Mário Martins
 * @version 2005
 */
 public class Elipse extends Circulo {
		private Ponto2D ponto2;
		public Elipse(Elipse e) {
			super(e.getAlt(), e.extremo1().clone());
			ponto2 = e.extremo2().clone();
		}
		public Elipse (Elipse e, boolean b) {
		    super(((Circulo) e).clone());
		    ponto2 = e.extremo2().clone();
		}
		public Elipse(double alt, Ponto2D p1, Ponto2D p2) {
			super(alt, p1.clone()); ponto2 = p2.clone();
		}
		public double getAlt() { return super.getRaio(); }
		public void mudaAlt(double alt) { super.mudaRaio(alt); }
		public void mudaPonto1(Ponto2D p) { super.mudaCentro(p.clone()); }
		public void mudaPonto2(Ponto2D p) { ponto2 = p.clone(); }
		public Ponto2D extremo1() { return super.getCentro(); }
		public Ponto2D extremo2() { return ponto2; }
		public Elipse clone() { return new Elipse(this); }
	}
