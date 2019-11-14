
/**
 * TstCofre.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
import java.util.*;
public class TstCofre {
	public static void main(String[] args) {
	    Cofre integerCofre = new Cofre(new Integer(12));
		Cofre intCofre = new Cofre(12);
		Cofre stringCofre = new Cofre("abc");
		ArrayList<Integer> lint = new ArrayList<Integer>();
		lint.add(123); lint.add(999);
		Cofre listCofre = new Cofre(lint);      
        Cofre cofreCofre = new Cofre();
		cofreCofre.guarda(listCofre);
		
		// Integer nm = (Integer) integerCofre.retira(); ERROS !!
		// String pal = (String) stringCofre.retira();
		// int val = (Integer) stringCofre.retira();
    }
}
