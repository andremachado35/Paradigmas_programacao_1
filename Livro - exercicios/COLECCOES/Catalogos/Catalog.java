	
	import java.util.*;
	import java.io.Serializable;
	public class Catalog extends TreeMap<String, Catalog> implements Serializable {		
		//
		//
		public Catalog() {
			super();
		}
		public Catalog(TreeMap<String, Catalog> c) {
		    super();
			for(String s : c.keySet())
			   this.put(s, c.get(s).clone());
		}
		//
		public TreeSet<String> getChaves() {
		    TreeSet<String> cc = new TreeSet<String>();
		    for(String s : this.keySet()) cc.add(s);
		    return cc;
		}
		
		public void insereChaves(Collection<String> chs) {
		    for(String ch : chs) this.put(ch, null);
		}
		
		public void insereEntrada(String chave, Catalog c) {
		    if(c == null) 
		      this.put(chave, new Catalog());
		    else
		      this.put(chave, c.clone());
		}
		
		public Catalog getValor(String chave) {
			return this.get(chave).clone();
		}
		
		
		public void insereSubCatalogo(String chave1, String chave2,
		                              Catalog c) {
		    this.get(chave1).insereEntrada(chave2, c);
		}
		
		    
	    public boolean existeChave(String ch) {
	        return this.containsKey(ch);
	    }
				
		public Catalog clone() {
		    TreeMap<String, Catalog> catAux = 
		                 new TreeMap<String, Catalog>();
		    if(this == null) return null;
		    for(String s : this.keySet()) 
		      catAux.put(s, this.get(s).clone());
		    return new Catalog(catAux);
		}  
    }
    
