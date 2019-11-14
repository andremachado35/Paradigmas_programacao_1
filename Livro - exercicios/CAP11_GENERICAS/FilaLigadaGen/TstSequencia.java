
/**
 * Write a description of class TstFilaLigada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.out;
public class TstSequencia {

	public static void main(String[] args) {
	    Sequencia<String> s = new Sequencia<String>();
	    s.add("Rita"); s.add("Pedro"); s.add("Luisa");
        //
	    Iterator<String> its = s.iterator();
	    while(its.hasNext()) { out.println(its.next()); }
	    //
	    Iterator<String> is = s.it();
	    while(is.hasNext()) { out.println(is.next()); } 
	    //
	    try {
	       out.println(s.get(0));
	   }
	   catch(Sequencia.SeqVaziaException e) {}
	   catch(Sequencia.IndiceInexistenteException e) {}
	   
   }
}