	
	import java.util.*;
	import java.io.Serializable;
	public class Catalogo implements Serializable {		
		//
		private TreeMap<String, Catalogo> cat;
		//
		public Catalogo() {
			cat = new TreeMap<String, Catalogo>();
		}
		public Catalogo(TreeMap<String, Catalogo> c) {
		    cat = new TreeMap<String, Catalogo>();
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
		
		public void insereEntrada(String chave, Catalogo c) {
		    if(c == null) 
		      cat.put(chave, new Catalogo());
		    else
		      cat.put(chave, c.clone());
		}
		
		public Catalogo getValor(String chave) {
			return cat.get(chave).clone();
		}
		       
			
		public void insereSubCatalogo(String chave1, String chave2,
		                              Catalogo c) {
		    cat.get(chave1).insereEntrada(chave2, c);
		}
		
		    
	    public boolean existeChave(String ch) {
	        return cat.containsKey(ch);
	    }
				
		public Catalogo clone() {
		    TreeMap<String, Catalogo> catAux = 
		                 new TreeMap<String, Catalogo>();
		    if(cat == null) return new Catalogo();
		    for(String s : cat.keySet()) 
		      catAux.put(s, cat.get(s).clone());
		    return new Catalogo(catAux);
		}  
    }
    
