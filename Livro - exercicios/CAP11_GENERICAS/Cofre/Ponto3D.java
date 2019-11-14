
/**
 * Write a description of class Ponto3D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
	public class Ponto3D extends Ponto2D {

		//		
		public Ponto3D(int x, int y, int z) {
		  super(x, y) ; this.z = z ;
		}
		public Ponto3D() { super(); z = 0; } // ou this(0, 0, 0)

		// variáveis de instância
		private int z ;

		// métodos de instância

		public int getZ() { return z; }

		public void desloca(int dx, int dy, int dz) {
			super.desloca(dx, dy); z += dz;
		}


		public void somaPonto(Ponto3D p) {
			super.somaPonto(p); z += p.getZ();
		}

		public Ponto3D somaPonto(int dx, int dy, int dz) {
			return new Ponto3D(this.getX() + dx, 
							   this.getY() + dy,
							   z += dz);
		}

		public String toString() {
		  StringBuffer s = new StringBuffer();
		  s.append(super.toString());
		  s.append(", "); s.append(z);
		  return s.toString();
	  }
	  
	  public Ponto3D clone() {
	      return new Ponto3D(this.getX(), this.getY(), z);
	  }
	  
	  public Ponto2D testeCasting() 
	        {return  ((Ponto2D) this); }
  }

