/**
 * PaisesMap: mapa de informações sobre paises implementado
 * como um HashMap de NOME para INFOPAIS.
 * 
 * @author F. Mário Martins
 * @version 1.0/2005
 */
	import java.util.*;
	import java.io.Serializable;
	public class PaisesMap implements Serializable {
		// Variáveis de instância
		private HashMap<String, InfoPais> paises; 
		// Construtores
    public PaisesMap() {
        paises = new HashMap<String, InfoPais>();
    }
    public PaisesMap(HashMap<String, ? extends InfoPais> infos) {
        paises =  new HashMap<String, InfoPais>();
        for(InfoPais info : infos.values()) 
            paises.put(info.getPais(), info.clone());
    }

		// Métodos de Instância
		// Total de Países
		public int numPaises() { return paises.size(); }
		// Devolve a informação de um país de nome dado
		public InfoPais daInfop(String pais) {
         return paises.get(pais).clone();
    }

		// Insere um novo País e seus dados
		public void inserePais(InfoPais infop) {     
        paises.put(infop.getPais(), infop.clone());
    }

		// Verifica se o nome de um país existe como chave
		public boolean existePais(String pais) {
      return paises.containsKey(pais);
		}

		// Remove um país e sua informação
		public void removeInfop(String nomeP) {
        paises.remove(nomeP);
		}

		// Altera a população de um país de nome dado
		public void altPopPais(String pais, double nvPop) {
        InfoPais infop = paises.get(pais);
        infop.mudaPop(nvPop);
		}
		
	public List<String> listaNomes() {        
      ArrayList<String> noms = new ArrayList<String>();     
      for(String nome : paises.keySet()) noms.add(nome);
      return noms;
	}

    public HashSet<String> paisesPopMaiorQue(double valor) { 
       HashSet<String> noms = new HashSet<String>();
       for(InfoPais infop : paises.values()) {
         if( infop.getPop() > valor ) noms.add(infop.getPais()) ;
       }   
       return noms;
    }

		// Devolve uma cópia do hashmap
		public Map<String, InfoPais> copia() {
			HashMap<String, InfoPais> mapAux = 
                   new HashMap<String, InfoPais>();
			for(InfoPais infop : paises.values()) 
			   mapAux.put(infop.getPais(), infop.clone());
			return mapAux;
		}

		// Conjunto de paíse de dado continente
		public Set<String> paisesCont(String cont) {
			HashSet<String> noms = new HashSet<String>();  
			for(InfoPais infop : paises.values()) {
			   if( infop.getCont().equals(cont)) 
			       noms.add(infop.getPais()) ;
			}   
			return noms;
		}

		public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\n---------- PAISES --------------------\n");
        for(InfoPais infop : paises.values()) {
           s.append(infop.toString());
       }
       return s.toString();
		}     
	}
