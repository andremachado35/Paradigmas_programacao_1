
/**
 * Write a description of class StackLimComEspera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class StackLimComEspera2 extends StackLim {
   //
   private Queue<Object> fila; // fila de supranumerários
   
   public StackLimComEspera2() {
       super();
       fila = new LinkedList<Object>();
   }
   
    public StackLimComEspera2(int dim) {
       super(dim);
       fila = new LinkedList<Object>();
   }
   
   // Métodos de Instância
   public void push(Object elem) throws StackCheiaException {
                                        
		try {
			super.push(elem);
		}
		catch(StackCheiaException e) {
			fila.offer(elem);
			throw e; 
			// ou new StackCheiaException(("Cheia! Fila de Espera!")
		}
	}
}

