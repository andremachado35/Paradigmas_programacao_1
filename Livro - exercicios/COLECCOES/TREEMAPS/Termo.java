 

import java.util.*;
import java.io.*;

/**
 * Class Termo 
 * 
 * Estrutura um termo de um polinómio, e define operações básicas
 * sobre o mesmo
 * 
 * @author PPIV
 * @version 06-2004
 */
public class Termo implements Serializable, Cloneable, Standard {

	// Variáveis de Instancia
	private int grau;
	private int coef; //   exº -2x3   x4   2x2

	/**
	 * Construtor de Termos
	 */
	public Termo(int g, int c) {
		grau = g; coef = c;
	}

	/**
	 * Selectores
	 */
	public int grau() { return grau;}
	public int coef() { return coef;}
	public Termo clone() {return new Termo(grau, coef);}
	public boolean equals(Object termo) {
	    if(! ((termo != null) && (termo instanceof Termo)))
	      return false;
	    Termo t = (Termo) termo;
	      return grau == t.grau() && coef == t.coef();
	}
	
	public String toString() {
	    StringBuffer t = new StringBuffer();
	    t.append(coef+"x"+grau); return t.toString();
	}	    
}
