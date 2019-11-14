
/**
 * ZooDeMamiferos é uma lista descritiva dos vários
 * mamíferos de um jardim zoológico, cujas classes
 * são SUBCLASSES de MAMÍFERO !!
 * 
 * 
 * @author FMM 
 * @version 1.0 (Abril 2005)
 */
import java.util.*;
public class ZooMamGen {

	// variável de instância 
	private ArrayList<Mamifero> zooList; 
	
    /**
     * Construtor por omissão
     */
	public ZooMamGen() { zooList = new ArrayList<Mamifero>(); }
	/**
	 * Construtor a partir de arraylist
	 */
	public ZooMamGen(ArrayList<? extends Mamifero> animais) {
	    zooList = new ArrayList<Mamifero>();
	    for(Mamifero mam : animais) zooList.add(mam.clone());
	}
				
	// Métodos de Instância
    /**
     * Total de animais do zoo
     */
	public int totalAnimais() { return zooList.size(); }
	
	 /**
	  * Adiciona um mamifero à lista
	  */
     public void juntaMamif(Mamifero mam) { 
        zooList.add(mam.clone()); 
     }
  
     /**
      * Junta todos os maiferos do arraylist parametro
      */
     public void juntaMamifs(ArrayList<? extends Mamifero> mamifs) {
          for(Mamifero mam : mamifs) zooList.add(mam.clone());
     }
		
	/**
	 * Devolve um ArrayList de Mamiferos do zoo com peso 
	 * superior ao peso dado
	 */
	public ArrayList<Mamifero> pesoSupA(int peso) {
	   ArrayList<Mamifero> mamRes = new ArrayList<Mamifero>();
	   for(Mamifero mamif : zooList) {
	       if(mamif.daPeso() > peso) mamRes.add(mamif.clone());
	    }
	    return mamRes;
	}
	
	/**
	 * Devolve uma Collection de Mamiferos do zoo com nome 
	 * iniciado pela letra dada como parâmetro
	 */
	public ArrayList<Mamifero> nomeIniciadoPor(char letra) {
	   ArrayList<Mamifero> mamRes = new ArrayList<Mamifero>();
	   for(Mamifero mamif: zooList) {
	       if(mamif.daNome().charAt(0) == letra) mamRes.add(mamif.clone());
	    }
	    return mamRes;
	}
	   
	/**
	 * Lista com os nomes dos animais
	 */
	public ArrayList<String> nomes() {
	    ArrayList<String> nomes = new ArrayList<String>();
	    for(Mamifero mamif : zooList) {
	        nomes.add(mamif.daNome());
	    }
	    return nomes;
	}
	
	/**
	 * Lista dos animais de dado TIPO
	 */
	public ArrayList<Mamifero> lstMamifTipo(String tipo) {
	    ArrayList<Mamifero> anims = new ArrayList<Mamifero>();
	    for(Mamifero mamif : zooList) {
	        if(mamif.getClass().getSimpleName().equals(tipo))
	           anims.add(mamif.clone());
	    }
	    return anims;
	}
	
	  /**
     * Número de animais de dado tipo (CLASSE).
     */
    public int animaisPorTipo(String tipo) {
        int conta = 0;
        for(Mamifero mamif : zooList) {
            if( (mamif.getClass().getSimpleName()).equals(tipo) ) 
               conta++;
        }
        return conta;
   }

	
	/**
	 * Verifica se nome do animal indicado existe
	 */
	public boolean existeNome(String nome) {
	    return (this.nomes().contains(nome));
    }
    
    /**
     * Dá o primeiro Mamifero cujo nome é dado como 
     *  parâmetro. Trata-se de um exemplo de pesquisa.
     */
    public Mamifero animalDeNome(String nome) {
        Iterator<Mamifero> it = zooList.iterator();
        Mamifero mamif = null;
        boolean enc = false;
        while(it.hasNext() && !enc) {
            mamif = it.next();
	        if( mamif.daNome().equals(nome) ) enc = true;
	    }
	    return mamif;
	 }
	 
	 /**
     * Remove o primeiro mamifero de nome e tipo dados
     * Exº: "LUKA", "Cao"
     */
    public void remMamifero(String nome, String tipo) {
        Iterator<Mamifero> it = zooList.iterator();
        Mamifero mamif = null;
        boolean enc = false;
        while(it.hasNext() && !enc) {
            mamif = it.next();
	        if( mamif.daNome().equals(nome) &&
	            mamif.getClass().getSimpleName().equals(tipo) ) {
	           enc = true; it.remove();
	       }
	    }
	 }
	 
	 /**
	  * Lista de todos
	  */
	 public ArrayList<Mamifero> getLista() { 
		ArrayList<Mamifero> lstMam = new ArrayList<Mamifero>();
		for(Mamifero mam : zooList) lstMam.add(mam.clone());
		return lstMam;
	}
	
	/**
	 * toString()
	 */
	public String toString() {
	    StringBuilder s = new StringBuilder();
	    s.append("--------  JARDIM ZOOLÓGICO DE JAVA5 ----------\n");
	    for(Mamifero mam : zooList) {
	        s.append(mam.toString());
	    }
	    return s.toString();
    }  
}
	
