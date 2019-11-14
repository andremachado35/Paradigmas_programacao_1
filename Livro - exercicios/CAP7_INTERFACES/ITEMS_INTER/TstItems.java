
/**
 * Write a description of class TstItems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static java.lang.System.out;
public class TstItems {
	public static void main(String[] args) {
	    Hi8 filme1 = new Hi8("A1", "2005", "obs1", 180, 40.0, 3);
	    Apagavel h1 = new Hi8("A2", "2004", "obs2", 140, 20.0, 2);
	    out.println("Ocup 1: " + filme1.getOcup());
	    out.println("Grava 1: " + filme1.getGrava());
	    //
	    Apagavel ap = filme1;
	    ap.apaga();
	    out.println("Ocup 1: " + filme1.getOcup());
	    out.println("Grava h1: " + filme1.getGrava());
	    //
	   h1.apaga();
	   //h1.getOcup();
	   // out.println("Grava h1: " + h1.getGrava());
	    Hi8 filme2 = new Hi8("A2", "2005", "obs2", 160, 50.0, 4);
	    filme2.apaga();
	    out.println("Ocup 2: " + filme2.getOcup());
	    
	    Apagavel apg3 = new Hi8("A2", "2005", "obs2", 160, 50.0, 4);
	    apg3.apaga();
   }
}
