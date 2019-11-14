
/**
 * Write a description of class StackLimComEspera here.
 * 
 * @author FMM
 * @version (a version number or a date)
 */
import java.util.*;
public class StackLimComEspera1 extends StackLim {
   //
   private Queue<Object> fila; // fila de supranumerários
   
   public StackLimComEspera1() {
       super();
       fila = new LinkedList<Object>();
   }
   
    public StackLimComEspera1(int dim) {
       super(dim);
       fila = new LinkedList<Object>();
   }
   
   // Métodos de Instância
   
    public void insereFila(Object elem) throws FilaEsperaException {
       if(fila.size() > dim()/4)
		 throw new FilaEsperaException("Fila Cheia!");
	   fila.offer(elem);
   }
   
   public void push(Object elem) throws StackCheiaException {
		try {
			super.push(elem);
		}
		catch(StackCheiaException e) {
		    try {
                this.insereFila(elem);
            }
            catch(FilaEsperaException e1) 
               { throw new StackCheiaException(e1.getMessage()); }
			throw e; 
			// ou new StackCheiaException(("Cheia! Fila de Espera!")
		}		
	}
}

