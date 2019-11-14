
/**
 * TstFilaLigada
 * 
 * @author F. Mário Martins
 * @version 1.0/2006
 */
import java.util.*;
import static java.lang.System.out;
public class TstFilaLigada {

    	public static ParIntInterface  criaParInt() { 
		         return new ParIntInterface() {
				      int p; int s;
				      { p = 0; s = 0; }
				      public int getT() { return p; }
				      public int getV() { return s; }
				      public void setT(int p1) { p = p1; }
				      public void setV(int s1) { s = s1; }
				    };
		}
		
		public static InterPar<String, Integer>  criaPar() { 
		         return new InterPar<String, Integer>() {
				      String p = null; Integer s = null;
				      { p = "JAVA"; s = 5; }
				      public String getT() { return p; }
				      public Integer getV() { return s; }
				      public void setT(String p1) { p = p1; }
				      public void setV(Integer s1) { s = s1; }
				    };
		}

	public static void main(String[] args) {
	    FilaLigada<String> ls = new FilaLigada<String>();
	    ls.insere("Rita"); ls.insere("Pedro"); ls.insere("Luisa");
	    ls.insere("Mario"); ls.insere("Kika");
	    List<String> lsr = ls.lista();
	    for(String s : lsr) out.println(s);
	    out.println("Ult: " + ls.daUltimo());
	    out.println("Prim: " + ls.daPrimeiro());
	    //
	    FilaLigada<Integer> li = new FilaLigada<Integer>();
	    li.insere(12); li.insere(23); li.insere(44);
	    List<Integer> lsi = li.lista();
	    for(Integer i : lsi) out.println(i);
	    Iterator<Integer> its = li.iterator();
	    while(its.hasNext()) { out.println(its.next()); }
        //
        out.println("---- for ---");        
	    for(Integer i : lsi) out.println(i);
	    //
	    ParIntInterface p = criaParInt();
	    InterPar<String, Integer> ps = criaPar();
	    out.println(p.getT());
	    out.println(ps.getT());
   }
}