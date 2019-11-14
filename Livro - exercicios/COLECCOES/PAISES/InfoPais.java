/**
 * INFOPAIS: dados sobre um pais.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */

	import java.util.*;
	import java.io.Serializable;
	public class InfoPais implements Serializable, Cloneable {
		// Variáveis de instância 
		private String pais; 
		private String capital;
		private String continente;
		private double popula; // população em milhões
		private TreeMap<String, ArrayList<Pagina>> infoTemas;
		// Construtores
		public InfoPais(String pais, String cap, 
					   String cont, double pop,
					   TreeMap<String, ArrayList<Pagina>> temas) {
			this.pais = pais; capital = cap; 
			continente = cont; popula = pop;
			infoTemas = this.copiaTemas(temas);  // método auxiliar
		}
    // Métodos de Instância
	private TreeMap<String, ArrayList<Pagina>> 
       copiaTemas(TreeMap<String, ArrayList<Pagina>> temas) {
			TreeMap<String, ArrayList<Pagina>> temasAux = 
			  new TreeMap<String, ArrayList<Pagina>>();
			 ArrayList<Pagina> pagsAux = null;
			for(String tema : temas.keySet()) {// para cada tema
			  pagsAux = new ArrayList<Pagina>(); 
			  for(Pagina pag : temas.get(tema))
				 pagsAux.add(pag.clone());
			  temasAux.put(tema, pagsAux); 
			}
			return temasAux;
		}
		public String getPais() { return pais; }
		public String getCapital() { return capital; }
		public String getCont() { return continente; }
		public double getPop() { return popula; }
		public TreeMap<String, ArrayList<Pagina>> getTemas() {
		     return this.copiaTemas(infoTemas); 
		}
		public void mudaPop(double nvPop) { popula = nvPop; }
		public String toString() { return ""; }
		public InfoPais clone() {
      return new InfoPais(pais, capital, continente, 
						  popula, this.copiaTemas(infoTemas));
		}
	}
