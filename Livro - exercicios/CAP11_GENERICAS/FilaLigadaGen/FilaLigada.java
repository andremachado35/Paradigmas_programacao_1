
/**
 * FilaLigada gen�rica que implementa Iterable<E>.
 * 
 * @author F. M�rio Martins
 * @version (a version number or a date)
 */

import java.util.*;
public class FilaLigada<E> implements Iterable<E> {
  public static class FilaVaziaException extends Exception { };
  // Interface est�tica que define os m�todos standard
  // para percorrer os elementos que est�o ligados entre si.
  public static interface Ligavel<E> {
     public E daValor();			    // d� valor do nodo
     public Ligavel<E> daSeg();		    // devolve seguinte
     public void defSeg(Ligavel<E> celula);   // define seguinte
  }
  // Classe membro para Iteracao
  private class FilaIterator implements Iterator<E> {
	private Ligavel<E> actual = null;
	private Ligavel<E> ultimo = null;
		//
	public FilaIterator() { actual = frente; }
	public boolean hasNext() { 
		return !(actual == null);
    }
	public E next() { 
		Ligavel<E> n = actual; ultimo = actual; actual = actual.daSeg();
		return n.daValor();
	}

	public void remove() {
	  Ligavel<E> aux = frente;
	  if (!(ultimo == null)) 
		if (ultimo == frente) frente.defSeg(frente.daSeg());
		else {// tem que procurar o anterior
			while(!(aux.daSeg() == ultimo)) { aux = aux.daSeg(); }
			aux.defSeg(actual);
             }
    }

  }

  // Vari�veis de Inst�ncia
  private Ligavel<E> frente = null; // in�cio da fila (para remo��o)
  private Ligavel<E> cauda = null;  // fim da fila (para inser��o)
  private int dim;		            // comprimento actual

  // construtor da classe principal. frente e cauda s�o do
  // tipo Ligavel<E>, ou seja, s�o inst�ncias de uma qualquer
  // classe que implemente a interface Ligavel.
  public FilaLigada() {
     frente = new NodoLigavel<E>(); cauda  = new NodoLigavel<E>(); dim = 0;
  }

  // M�todos de Inst�ncia de FilaLigada
  public boolean vazia() { return frente == null; }

  public void remove() throws FilaVaziaException {
      if (this.vazia()) throw new FilaVaziaException();
      else { frente = frente.daSeg(); dim--; }
  }

  public E daPrimeiro() { // d� conte�do do primeiro nodo
     return frente.daValor();
  }
  
   public E daUltimo() { // d� conte�do do primeiro nodo
     return cauda.daValor();
  }
  
  public void insere(E e) { // insere no in�cio
      Ligavel<E> n = new NodoLigavel<E>(e);
      if (dim == 0) { frente = n; cauda = n;}
      else
          {n.defSeg(frente); frente = n;};
      dim++;
  }
  public int size1() {  	// serve de teste de percurso da
    int t = 0;			// lista; usar antes size().
    Ligavel<E> c = frente;
    while(!(c == null)) { t++; c = c.daSeg(); }
    return t;
  }

  public int size() { return dim; }

  public List<E> lista() { 		// para itera��o externa
    List<E> fila = new ArrayList<E>();
    Ligavel<E> c = frente;
    while(!(c == null)) { fila.add(c.daValor()); c = c.daSeg(); }
    return fila;
  }
  
  public Iterator<E> iterator() { return new FilaIterator(); }
  
} // fim da defini��o de FilaLigada

// Classe interna que implementa a interface Ligavel<E>.
// Esta classe implementa nodos de tipo NodoLigavel<E> que
// cont�m um E e a refer�ncia para o seguinte.

class NodoLigavel<E> implements FilaLigada.Ligavel<E> {
   // Vari�veis de Inst�ncia
   private E val;
   private FilaLigada.Ligavel<E> seg;
   // Construtores
   public NodoLigavel() { seg = null; val = null; }
   public NodoLigavel(E e) { val = e; seg = null; }
   // M�todos de Inst�ncia   
   public FilaLigada.Ligavel<E> daSeg() { return seg; }
   public void defSeg(FilaLigada.Ligavel<E> ref) { seg = ref; }
   public E daValor() { return val; }
}

