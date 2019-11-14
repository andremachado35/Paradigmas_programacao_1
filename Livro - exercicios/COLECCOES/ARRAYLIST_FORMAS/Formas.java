
/**
 * Write a description of class Formas here.
 * 
 * @author F. M�rio Martins
 * @version 1.0/2005
 */
import static java.lang.System.out;
import java.util.*;
public class Formas {
	// vari�veis de inst�ncia
	ArrayList<Forma> formas; 
	
	// construtores
	public Formas() { formas = new ArrayList<Forma>(); }
	public Formas(ArrayList<Forma> pformas) {
	    formas = new ArrayList<Forma>();
	    for(Forma f : pformas) formas.add(f.clone());
	}
	public Formas(Forma f) {
	    formas = new ArrayList<Forma>();
	    formas.add(f.clone());
	}
	
	// m�todos de inst�ncia
	public ArrayList<Forma> getFormas() { return formas; }
	public int size() { return formas.size(); }
	public void addForma(Forma f) { formas.add(f.clone()); }
	public void addFormas(ArrayList<Forma> lstFormas) {
	    for(Forma f : lstFormas) this.addForma(f);
	}
	public double somaAreas() {
	   double areaTot = 0.0;
	   for(Forma f : formas) {
	     areaTot += f.area();
	  }
	return areaTot; 
    } 
    
	public ArrayList<Forma> lstFormAreaMaior(double area) {
	  ArrayList<Forma> res = new ArrayList<Forma>();
	  for(Forma f : formas) {
	      if(f.area() > area) res.add(f);
	  }
	  return res;
    }
    
    public ArrayList<Forma> lstCirculos() {
      ArrayList<Forma> res = new ArrayList<Forma>();
	  for(Forma f : formas) {
	      if(f.getClass().getSimpleName().equals("Circulo")) 
	          res.add(f.clone());
	  }
	  return res;
    }
  	      
	public void removeFormAreaMenor(double area) {
	    for(Iterator<Forma> it = formas.iterator(); it.hasNext();) {
	        Forma f = it.next();
	        if(it.next().area() < area) formas.remove(f);
	    }
	}
	
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    for(Forma f : formas)
	       sb.append(f.toString());
	    return sb.toString();
	}    
}
