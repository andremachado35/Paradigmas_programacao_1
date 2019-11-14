/**
 * PaisesMap: mapa de informa��es sobre paises implementado
 * como um HashMap de NOME para INFOPAIS.
 * 
 * @author F. M�rio Martins
 * @version 1.0/2005
 */
	import java.util.*;
	import java.io.Serializable;
	public class PaisesMap implements Serializable {
		// Vari�veis de inst�ncia
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

		// M�todos de Inst�ncia
		// Total de Pa�ses
		public int numPaises() { return paises.size(); }
		// Devolve a informa��o de um pa�s de nome dado
		public InfoPais daInfop(String pais) {
         return paises.get(pais).clone();
    }

		// Insere um novo Pa�s e seus dados
		public void inserePais(InfoPais infop) {     
        paises.put(infop.getPais(), infop.clone());
    }

		// Verifica se o nome de um pa�s existe como chave
		public boolean existePais(String pais) {
      return paises.containsKey(pais);
		}

		// Remove um pa�s e sua informa��o
		public void removeInfop(String nomeP) {
        paises.remove(nomeP);
		}

		// Altera a popula��o de um pa�s de nome dado
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

		// Devolve uma c�pia do hashmap
		public Map<String, InfoPais> copia() {
			HashMap<String, InfoPais> mapAux = 
                   new HashMap<String, InfoPais>();
			for(InfoPais infop : paises.values()) 
			   mapAux.put(infop.getPais(), infop.clone());
			return mapAux;
		}

		// Conjunto de pa�se de dado continente
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
