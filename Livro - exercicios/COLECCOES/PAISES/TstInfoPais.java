
/**
 * Write a description of class TstInfoPais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.out;
public class TstInfoPais {
	public static InfoPais main(String[] args) {
	    ArrayList<String> p1 = new ArrayList<String>();
	    p1.add("Linha11");
	    p1.add("Linha12");
	    ArrayList<String> p2 = new ArrayList<String>();
	    p2.add("Linha21");
	    p2.add("Linha22");
	    
	    Pagina pag1 = new Pagina(p1);
	    Pagina pag2 = new Pagina(p2);

	    ArrayList<Pagina> pags = new ArrayList<Pagina>();
	    pags.add(pag1); pags.add(pag2);
	    // for(Pagina pag : pags) out.println(pag);
	    
	    TreeMap<String, ArrayList<Pagina>> temas = 
	      new TreeMap<String, ArrayList<Pagina>>();
	    temas.put("Desporto", pags);
	    temas.put("Economia", pags);
	    temas.put("Turismo", pags);
	    // for(Pagina p : temas.get("Desporto")) out.println(p);
	    
	    InfoPais info1 = new InfoPais("Port", "Lisboa", "Europa", 10.0,
	                                  temas);
	    for(Pagina p : info1.getTemas().get("Desporto")) 
	       System.out.println(p);
	    return info1;
   }    
}
