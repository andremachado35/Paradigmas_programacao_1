
/**
 * Write a description of class Pagina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Pagina {
	private ArrayList<String> page;
	public Pagina(ArrayList<String> pg) { page = copiaPag(pg); }
	private ArrayList<String> copiaPag(ArrayList<String> pg) {
	     ArrayList<String> p = new ArrayList<String>();
	     for(String s : pg) p.add(s);
	     return p;
	}
	public Pagina daPagina() { return new Pagina(copiaPag(page)); }
	public String toString() {
	    StringBuilder s = new StringBuilder();
	    for(String line : page) s.append(line + "\n");
	    return s.toString();
	}
	public Pagina clone() { return new Pagina(copiaPag(page)); 	}
}