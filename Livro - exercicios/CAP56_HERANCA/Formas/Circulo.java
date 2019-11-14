/**
 * Circulo com raio e centro.
 * 
 * @author F. Mário Martins
 * @version 2005
 */
 public class Circulo {
		private double raio;
		private Ponto2D centro;
		// Construtor completo
		public Circulo(double r, Ponto2D p) {
			raio = r; centro = p.clone();
		}
		public Circulo(Circulo c) {
		    raio = c.getRaio();
		    centro = c.getCentro().clone();
		}
		public double getRaio() { return raio; }
		public Ponto2D getCentro() { return centro.clone(); }
		public void mudaRaio(double r) { raio = r; }
		public void mudaCentro(Ponto2D p) { centro = p.clone(); }		
		public Circulo clone() {
		    return new Circulo(this);
		}
	}
