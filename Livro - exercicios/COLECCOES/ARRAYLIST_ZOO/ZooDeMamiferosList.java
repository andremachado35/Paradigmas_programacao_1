
/**
 * ZooDeMamiferos é uma lista descritiva dos vários
 * mamíferos de um jardim zoológico, cujas classes
 * são SUBCLASSES de MAMÍFERO !!
 * 
 * 
 * @author FMM - PPIV
 * @version 1.0 (Abril 2005)
 */

import java.util.*;
import java.io.*;

public class ZooDeMamiferosList {

	
	// Variável de Instância 
	
	private ArrayList<Mamifero> zooList; 
	      
	/**
	 * Construtor básico
	 */	
	public ZooDeMamiferosList() { zooList = new ArrayList<Mamifero>(); }

    /**
     * Construtor que cria um ArrayList<? extends Mamifero> a
     * partir de uma Collection genérica do mesmo tipo.
     * Este construtor permite inserir no ArrayList<Mamifero>
     * uma qualquer instância de uma subclasse de Mamifero.
     */
	public ZooDeMamiferosList(Collection<? extends Mamifero> animais) {
	    zooList = new ArrayList<Mamifero>(animais);
	}
	
	/**
     * Construtor que cria um ArrayList<? extends Mamifero> a
     * partir de uma Collection genérica do mesmo tipo.
     * Este construtor permite inserir no ArrayList<Mamifero>
     * uma qualquer instância de uma subclasse de Mamifero.
     */
	public ZooDeMamiferosList(ArrayList<? extends Mamifero> animais) {
	    zooList = new ArrayList<Mamifero>(animais);
	}
		
	// Métodos de Instância

	/**
	 * Número de animais
	 */
	public int totalAnimais() { return zooList.size(); }
	
	/**
     * Inserir um Gato no zoo. É um método muito
     * específico. Serve apenas para teste. De facto,
     * num desenho polimórfico, o que se pretende é 
     * usar o supertipo, ou seja, fazer abstracção 
     * do tipo especifico. Polimorfismo é também abstracção.
     * Inserir uma instância de Gato no Zoo tem algum
     * sentido mas "abstrair" do tipo de Mamifero que
     * existe e inserir um Mamifero será sempre, do 
     * ponto de vista conceptual, o ideal.
     */
     public void insereGato(Gato mam) { 
         zooList.add(mam); 
     }

     /**
     * Inserir um Cão no zoo. É um método muito
     * específico. Serve apenas para teste, tal 
     * como se disse no método anterior.
     */
     public void insereCao(Cao mam) { 
         zooList.add(mam); 
     }
     
     /**
     * Genérico: Inserir um qualquer tipo de mamífero que 
     * seja de uma SUBCLASSE reconhecível pelo compilador 
     * da classe MAMÍFERO.
     * Este método faz com que os dois anteriores possam ser 
     * dispensados (e todos os outros N tipos possíveis).
     */
     public void insereMamifero(Mamifero mam) { 
        zooList.add(mam); 
     }
     
     /**
     * Inserir uma colecção de animais mamíferos a partir
     * de uma Collection de "unknown" types que "extends"
     * Mamifero. 
     */   
     public void insereAnimais(Collection<? extends Mamifero> mam) { 
         zooList.addAll(mam); 
     }
    
	/**
	 * Insere uma colecção de animais Mamiferos ou seja uma
	 * Collection de instâncias de subclasses de Mamifero.
	 * Qual a diferença para o método anterior? Qual usar a
	 * cada momento e porquê ?? SÂO EQUIVALENTES.
	 */
	 public void insereMamiferos(Collection<Mamifero> col) {
	    zooList.addAll(col); 
	}
	
	
	/**
	 * Devolve uma Collection de Mamiferos do zoo com peso 
	 * superior ao peso dado
	 */
	public Collection<Mamifero> pesoSupA(int peso) {
	   ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();
	   for(Mamifero mamif: zooList) {
	       if(mamif.daPeso() > peso) mamiferos.add(mamif);
	    }
	    return mamiferos;
	}
	
	/**
	 * Devolve uma Collection de Mamiferos do zoo com nome 
	 * iniciado pela letra dada como parâmetro
	 */
	public Collection<Mamifero> nomeIniciadoPor(char letra) {
	   ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();
	   for(Mamifero mamif: zooList) {
	       if(mamif.daNome().charAt(0) == letra) mamiferos.add(mamif);
	    }
	    return mamiferos;
	}

	   
	/**
	 * Lista com os nomes dos animais
	 */
	public ArrayList<String> nomes() {
	    ArrayList<String> nomes = new ArrayList<String>();
	    for(Mamifero mamif: zooList) {
	        nomes.add(mamif.daNome());
	    }
	    return nomes;
	}
	
	/**
	 * Verifica se nome do animal indicado existe
	 */
	public boolean existeNome(String nome) {
	    return (this.nomes().contains(nome));
    }
    
    /**
     * Dá o 1º Mamifero cujo nome começa pela letra
     * dada como parâmetro. Trata-se de um exemplo de
     * pesquisa.
     */
    public Mamifero animalDeNomeIniciadoPor(char letra) {
        Iterator it = zooList.iterator();
        Mamifero mamif = null;
        boolean encontrado = false;
        while(it.hasNext() && !encontrado) {
            mamif = (Mamifero) it.next();
	        if( mamif.daNome().charAt(0) == letra ) encontrado = true;
	    }
	    return mamif;
	 }
	
	/**
	 * toString()
	 */
	public String toString() {
	    StringBuffer s = new StringBuffer();
	    s.append("--------  JARDIM ZOOLÓGICO DE BRAGA ----------\n");
	    for(Mamifero mam : zooList) {
	        s.append(mam.toString());
	    }
	    return s.toString();
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
    * Escreve num ficheiro de texto as fichas de todos os 
    * animais do Jardim Zoológico.
    */
   public void gravaEmFichTxt(String fich) {
       try {
           FileWriter f = new FileWriter(fich);
           f.write(this.toString());
           f.flush(); f. close();
       }
       catch(IOException e) {};
    }
   
}
	
	
