
/**
 * Write a description of class Ponto2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
	public class Ponto {
		//
		public Ponto(int cx, int cy) { x = cx; y = cy; }
		public Ponto(){ this(0, 0); }
		//
		private int x, y;
		//
		public int getX() { return x; }
		public int getY() { return y; }
		public void desloca(int dx, int dy) {
			x += dx; y += dy;
		}
		public void somaPonto(Ponto p) {
			x += p.getX(); y += p.getY();
		}
		public Ponto somaPonto(int dx, int dy) {
			return new Ponto(x += dx, y+= dy);
		}
		
		public Ponto clone() {
		    return new Ponto(x, y);
		}
		
		public String toString() { 
		     return "Ponto(" + x + ", " + y + ")";
		}       
	}


