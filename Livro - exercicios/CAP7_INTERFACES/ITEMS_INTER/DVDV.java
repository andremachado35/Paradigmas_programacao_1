
/**
 * Write a description of class DVDV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DVDV extends DVD implements Regravavel {
     public DVDV(String titulo, String data, String obs,
					    int min, double ocup, int gravc) {
			super(titulo, data, obs, min, ocup, gravc); 
			
     }
     
     public DVDV clone() {
	        return new DVDV(this.getTitulo(), this.getData(), this.getObs(),
	                       this.getMin(), this.getOcup(), this.getGrava());
	 }
	 
	  public String toString() { return this.getTitulo(); }

     // implements Gravavel
     public void apaga() { this.mudaOcupa(0.0); this.mudaGrava(0); }
        
}
