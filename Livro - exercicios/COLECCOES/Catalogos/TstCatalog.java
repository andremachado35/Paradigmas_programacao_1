
/**
 * Write a description of class TstCatalogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.out;
public class TstCatalog {
  public static Catalog main(String[] args) {
      HashSet<String> chaves1 = new HashSet<String>();
      chaves1.add("Volvo"); chaves1.add("VW"); 
      HashSet<String> chaves11 = new HashSet<String>();
      chaves11.add("S40"); chaves11.add("S60"); 
      HashSet<String> chaves111 = new HashSet<String>();
      chaves111.add("1.6"); chaves111.add("1.9TDI"); chaves111.add("2.4");
      Catalog cat = new Catalog();
      cat.insereChaves(chaves1);
      
      Catalog cat3 = new Catalog();
      cat3.insereChaves(chaves111);
      cat3.insereEntrada("1.6", new Catalog());
      cat3.insereEntrada("1.9TDI", new Catalog());
      cat3.insereEntrada("2.4", null);
      
      Catalog cat2 = new Catalog();
      cat2.insereChaves(chaves11);
      cat2.insereEntrada("S40", cat3);
      cat2.insereEntrada("S60", cat3);
      
      Catalog cat4 = new Catalog();
      cat4.insereEntrada("3.0", null);
      
      cat.insereEntrada("Volvo", cat2);
      cat.insereEntrada("VW", null);
      cat.insereSubCatalogo("Volvo", "C70", cat4);
      
	    for(String s : cat.keySet()) {
	       out.println(s + ":\n");
	       Set<String> subc = cat.get(s).keySet();
	       for(String ss : subc) { 
	          out.print(ss + ": ");
	          Set<String> subsubc = cat.get(s).get(ss).keySet();
	          for(String sss : subsubc) 
	             out.print(sss + "/ ");
	       }
	    }
	    
	    return cat;
	          
      
   }
}
