
/**
 * ZooDeMamiferos � uma lista descritiva dos v�rios
 * mam�feros de um jardim zool�gico, cujas classes
 * s�o SUBCLASSES de MAM�FERO !!
 * 
 * 
 * @author FMM - PPIV
 * @version 1.0 (Abril 2005)
 */

import java.util.*;
import java.io.*;

public class ZooDeMamiferosList {

	
	// Vari�vel de Inst�ncia 
	
	private ArrayList<Mamifero> zooList; 
	      
	/**
	 * Construtor b�sico
	 */	
	public ZooDeMamiferosList() { zooList = new ArrayList<Mamifero>(); }

    /**
     * Construtor que cria um ArrayList<? extends Mamifero> a
     * partir de uma Collection gen�rica do mesmo tipo.
     * Este construtor permite inserir no ArrayList<Mamifero>
     * uma qualquer inst�ncia de uma subclasse de Mamifero.
     */
	public ZooDeMamiferosList(Collection<? extends Mamifero> animais) {
	    zooList = new ArrayList<Mamifero>(animais);
	}
	
	/**
     * Construtor que cria um ArrayList<? extends Mamifero> a
     * partir de uma Collection gen�rica do mesmo tipo.
     * Este construtor permite inserir no ArrayList<Mamifero>
     * uma qualquer inst�ncia de uma subclasse de Mamifero.
     */
	public ZooDeMamiferosList(ArrayList<? extends Mamifero> animais) {
	    zooList = new ArrayList<Mamifero>(animais);
	}
		
	// M�todos de Inst�ncia

	/**
	 * N�mero de animais
	 */
	public int totalAnimais() { return zooList.size(); }
	
	/**
     * Inserir um Gato no zoo. � um m�todo muito
     * espec�fico. Serve apenas para teste. De facto,
     * num desenho polim�rfico, o que se pretende � 
     * usar o supertipo, ou seja, fazer abstrac��o 
     * do tipo especifico. Polimorfismo � tamb�m abstrac��o.
     * Inserir uma inst�ncia de Gato no Zoo tem algum
     * sentido mas "abstrair" do tipo de Mamifero que
     * existe e inserir um Mamifero ser� sempre, do 
     * ponto de vista conceptual, o ideal.
     */
     public void insereGato(Gato mam) { 
         zooList.add(mam); 
     }

     /**
     * Inserir um C�o no zoo. � um m�todo muito
     * espec�fico. Serve apenas para teste, tal 
     * como se disse no m�todo anterior.
     */
     public void insereCao(Cao mam) { 
         zooList.add(mam); 
     }
     
     /**
     * Gen�rico: Inserir um qualquer tipo de mam�fero que 
     * seja de uma SUBCLASSE reconhec�vel pelo compilador 
     * da classe MAM�FERO.
     * Este m�todo faz com que os dois anteriores possam ser 
     * dispensados (e todos os outros N tipos poss�veis).
     */
     public void insereMamifero(Mamifero mam) { 
        zooList.add(mam); 
     }
     
     /**
     * Inserir uma colec��o de animais mam�feros a partir
     * de uma Collection de "unknown" types que "extends"
     * Mamifero. 
     */   
     public void insereAnimais(Collection<? extends Mamifero> mam) { 
         zooList.addAll(mam); 
     }
    
	/**
	 * Insere uma colec��o de animais Mamiferos ou seja uma
	 * Collection de inst�ncias de subclasses de Mamifero.
	 * Qual a diferen�a para o m�todo anterior? Qual usar a
	 * cada momento e porqu� ?? S�O EQUIVALENTES.
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
	 * iniciado pela letra dada como par�metro
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
     * D� o 1� Mamifero cujo nome come�a pela letra
     * dada como par�metro. Trata-se de um exemplo de
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
	    s.append("--------  JARDIM ZOOL�GICO DE BRAGA ----------\n");
	    for(Mamifero mam : zooList) {
	        s.append(mam.toString());
	    }
	    return s.toString();
    }
    
    /**
     * N�mero de animais de dado tipo (CLASSE).
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
    * animais do Jardim Zool�gico.
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
	
	
