
/**
 * ComplexoP: complexos na forma polar
 * 
 * @author F. Mário Martins
 * @version 1.0/2006
 */   
    
    import static java.lang.Math.*;
	public class ComplexoP extends ComplexoR {
		//
		public ComplexoP() { super();}
		public ComplexoP(double raio, double teta) { 
			super(raio*cos(teta), raio*sin(teta));
		}
		// 
		public double getRaio() { 
		  double temp = pow(super.getR(),2) + pow(super.getI(),2);
          return sqrt(temp);
		}

		public double getTeta() { 
		    return atan(super.getI()/super.getR()); 
		}
		
	    public ComplexoR converte(ComplexoP cp) {
	        return new ComplexoR(cp.getRaio()*cos(cp.getTeta()),
	                      cp.getRaio()*sin(cp.getTeta()));		
       }
       
       public ComplexoP soma(ComplexoP cp) {
           double ac = this.getRaio()*cos(this.getTeta()) + 
                       cp.getRaio()*cos(cp.getTeta());
           double bd = this.getRaio()*sin(this.getTeta()) +
                       cp.getRaio()*sin(cp.getTeta());
           return new ComplexoP(sqrt(pow(ac,2) + pow(bd,2)), atan(bd/ac));
       }
       
       public ComplexoP multiplica(ComplexoP cp) {
           double nvRaio = this.getRaio() * cp.getRaio();
           double nvTeta = this.getTeta() + cp.getTeta();
           return new ComplexoP(nvRaio, nvTeta);
        }
        
       public ComplexoP divide(ComplexoP cp) {
           double nvRaio = this.getRaio() / cp.getRaio();
           double nvTeta = this.getTeta() - cp.getTeta();
           return new ComplexoP(nvRaio, nvTeta);
       }
     
    }
