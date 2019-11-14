
/**
 * Write a description of class TstCatalogoo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.out;
public class TstCatalogo {
  public static Catalogo main(String[] args) {
      HashSet<String> chaves1 = new HashSet<String>();
      chaves1.add("Volvo"); chaves1.add("VW"); 
      HashSet<String> chaves11 = new HashSet<String>();
      chaves11.add("S40"); chaves11.add("S60"); 
      HashSet<String> chaves111 = new HashSet<String>();
      chaves111.add("1.6"); chaves111.add("1.9TDI"); chaves111.add("2.4");
      Catalogo cat = new Catalogo();
      cat.insereChaves(chaves1);
      
      Catalogo cat3 = new Catalogo();
      cat3.insereChaves(chaves111);
      cat3.insereEntrada("1.6", new Catalogo());
      cat3.insereEntrada("1.9TDI", new Catalogo());
      cat3.insereEntrada("2.4", null);
      
      Catalogo cat2 = new Catalogo();
      cat2.insereChaves(chaves11);
      cat2.insereEntrada("S40", cat3);
      cat2.insereEntrada("S60", cat3);
      
      Catalogo cat4 = new Catalogo();
      cat4.insereEntrada("3.0", null);
      
      cat.insereEntrada("Volvo", cat2);
      cat.insereEntrada("VW", null);
      cat.insereSubCatalogo("Volvo", "C70", cat4);
      
	    for(String s : cat.getChaves()) {
	       out.println(s + ":\n");
	       TreeSet<String> subc = cat.getValor(s).getChaves();
	       for(String ss : subc) { 
	          out.print(ss + ": ");
	          Set<String> subsubc = cat.getValor(s).getValor(ss).getChaves();
	          for(String sss : subsubc) 
	             out.print(sss + "/ ");
	       }
	    }	    
	    return cat;
	          
      
   }
}
