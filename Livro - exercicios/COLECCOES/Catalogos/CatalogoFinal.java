
	
	import java.util.*;
	import java.io.Serializable;
	public class CatalogoFinal extends AbsCatalogo implements Serializable {		
		//
		private TreeMap<String, Pagina> cat;
		//
		public CatalogoFinal() {
			cat = new TreeMap<String, Pagina>();
		}
		public CatalogoFinal(TreeMap<String, Pagina> c) {
			cat = new TreeMap<String, Pagina>();
			for(String s : c.keySet())
			   cat.put(s, c.get(s).clone());
		}
		//
		public TreeSet<String> getChaves() {
		    TreeSet<String> cc = new TreeSet<String>();
		    for(String s : cat.keySet()) cc.add(s);
		    return cc;
		}
		
		public void insereChaves(Collection<String> chs) {
		    for(String ch : chs) cat.put(ch, null);
		}
		
		public void insereEntrada(String chave, Object p) {
		    cat.put(chave, ((Pagina)p));
		}
		
		public Pagina getValor(String chave) {
			return cat.get(chave).clone();
		}
				    
	    public boolean existeChave(String ch) {
	        return cat.containsKey(ch);
	    }
				
		public CatalogoFinal clone() {
		    TreeMap<String, Pagina> catAux = 
		                 new TreeMap<String, Pagina>();
		    for(String s : cat.keySet())
		       catAux.put(s, cat.get(s).clone());
		    return new CatalogoFinal(catAux);
		}
   }