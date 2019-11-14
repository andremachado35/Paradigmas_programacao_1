	import java.util.*;
	import java.io.Serializable;
	public class AutoCatalogo implements Serializable {		
		//
		private TreeMap<String, AbsCatalogo> cat;
		//
		public AutoCatalogo() {
			cat = new TreeMap<String, AbsCatalogo>();
		}
		public AutoCatalogo(TreeMap<String, ? extends AbsCatalogo> c) {
			cat = new TreeMap<String, AbsCatalogo>();
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
		
		public AbsCatalogo getValor(String chave) {
			return cat.get(chave).clone();
		}
		
		public void insereEntrada(String chave, AbsCatalogo c) {
		    cat.put(chave, c.clone());
		}
	
		    
	    public boolean existeChave(String ch) {
	        return cat.containsKey(ch);
	    }
		
	   
		public boolean isCatalogo(String chave) {
		    return cat.get(chave) instanceof Catalogo;		   
		}
	
	    
		public boolean isFinal(String chave) {
		    return cat.get(chave) instanceof CatalogoFinal;
		}
		
		public AutoCatalogo clone() {
		    TreeMap<String, AbsCatalogo> catAux = 
		                 new TreeMap<String, AbsCatalogo>();
		    for(String s : cat.keySet())
		       catAux.put(s, cat.get(s).clone());
		    return new AutoCatalogo(catAux);
		}
   }