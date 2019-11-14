import java.util.*;
import java.io.*;

/**
 * ZooDeMamiferos é uma lista descritiva dos vários
 * mamíferos de um jardim zoológico, cujas classes
 * são SUBCLASSES de MAMÍFERO !!
 * 
 * 
 * @author FMM - PPIV
 * @version 1.0 (Abril 2005)
 */

public class Zoo {
	
	// Variável de Instância 
	
	private ArrayList<Mamifero> zooList; 
	      
	/**
	 * Construtor básico
	 */	
	public Zoo() { zooList = new ArrayList<Mamifero>(); }

    /**
     * Construtor que cria um ArrayList<? extends Mamifero> a
     * partir de uma Collection genérica do mesmo tipo.
     * Este construtor permite inserir no ArrayList<Mamifero>
     * uma qualquer instância de uma subclasse de Mamifero.
     */
	public Zoo(Collection<? extends Mamifero> animais) {
	    zooList = new ArrayList<Mamifero>(animais);
	}
	
	/**
     * Construtor que cria um ArrayList<? extends Mamifero> a
     * partir de uma Collection genérica do mesmo tipo.
     * Este construtor permite inserir no ArrayList<Mamifero>
     * uma qualquer instância de uma subclasse de Mamifero.
     */
	public Zoo(ArrayList<? extends Mamifero> animais) {
	    zooList = new ArrayList<Mamifero>(animais);
	}

			
	// Métodos de Instância

	/**
	 * Número de animais
	 */
	public int totalAnimais() { return zooList.size(); }
	

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
     * Inserir um qualquer outro mamífero que seja de uma
     * SUBCLASSE reconhecível pelo compilador da classe
     * MAMÍFERO.
     * SENDO TYPE_SAFE O COMPILADOR  NÃO CONFIA NO TIPO 
     * PARÂMETRO E, PELOS VISTOS, NÃO O CONSEGUE VERIFICAR.
     * ASSIM, O CÓDIGO SEGUINTE DÁ ERRO NO TIPO DO
     * PARÂMETRO !! 
     * Pessoalmente acho que ter por parâmetro <? extends Mamifero>
     * em vez de Mamifero traria muito mais clareza em termos de
     * TIPOS, mas tal não foi considerado. No entanto, repare-se no
     * método que a seguir se apresenta onde, por se tratar de
     * uma Collection<> já tudo se torna, estrahamente, natural !!
     */
     /* public void insereMamifero1(<? extends Mamifero> mam) { 
         zooList.add(mam); 
     }
     */
      
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
    public int animaisPorTipo(String pack_tipo) {
        int conta = 0;
        for(Mamifero mamif : zooList) {
            if( (mamif.getClass().getName()).equals(pack_tipo) ) 
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
	
	
