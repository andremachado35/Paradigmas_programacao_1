
/**
 * Write a description of class Hi9 here.
 * 
 * @author FMM
 * @version (a version number or a date)
 */
public class Hi9 extends Hi8 {
   public Hi9(String titulo, String data, String obs,
					    int min, double ocup, int gravc) {
			super(titulo, data, obs, min, ocup, gravc); 			
   }
   
   public Hi9 clone() {
	        return new Hi9(this.getTitulo(), this.getData(), this.getObs(),
	                       this.getMin(), this.getOcup(), this.getGrava());
   }

}
