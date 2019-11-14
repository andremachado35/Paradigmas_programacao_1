
/**
 * Write a description of class PlanoPesado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Comparator;
public class PlanoPesado {
	private TreeMap<Ponto, Integer> plano;
	
	public PlanoPesado() {	    
	    plano = new TreeMap<Ponto, Integer>(new PontoComparator());
	}
	
	public PlanoPesado(Comparator<Ponto> cp) {
	    plano = new TreeMap<Ponto, Integer>(cp);
	}
	public void juntaPonto(Ponto p, int peso) {
	    plano.put(p, peso);
	}
	
	public void remPonto(Ponto p) {
	    plano.remove(p);
	}
	
	public boolean existePonto(Ponto p) {
	    return plano.containsKey(p);
	}
	
	public TreeSet<Ponto> dom() {
	    TreeSet<Ponto> paux = new TreeSet<Ponto>(new PontoComparator());
	    for(Ponto p : plano.keySet()) paux.add(p.clone());
	    return paux;
	}
	
	public HashSet<Ponto> chaves() {
	    HashSet<Ponto> paux = new HashSet<Ponto>();
	    for(Ponto p : plano.keySet()) paux.add(p.clone());
	    return paux;
	}
}
