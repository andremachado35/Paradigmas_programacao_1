
/**
 * Classe que implementa uma Arvore Binaria generica, de elementos E
 * que implementam Comparable<E> e que é Serializable. 
 * 
 * @author F. Mario Martins
 * @version 1/2006
 */
import java.io.Serializable;
import java.util.*;
public class ArvBin<E extends Comparable<E> & Serializable> 
                      implements Serializable, Iterable<E> {
   // ArvBin<E> Variáveis de Instância
   private Nodo<E> raiz = null;
   private int dim = 0;
   // Construtores
   public ArvBin() { raiz = null; }
   public ArvBin(E topo) { raiz = new Nodo<E>(topo); dim = 1;}
   private ArvBin(Nodo<E> n, int nodos) { raiz = n; dim = nodos; }
   // Métodos da API
   public E getRaiz() { return raiz.getElem(); }
   public void add(E elem) { raiz = procInsNodo(raiz, elem); dim++; }
   public void addAll(Collection<? extends E> c) {
       for(E e : c) add(e);
    }
   public void remove(E elem) { }
   public ArvBin<E> getsubArvDir() { 
      return new ArvBin<E>(raiz.getDir(), dim - (dimEsquerda(raiz)+1)); }
   public ArvBin<E> getsubArvEsq() { 
      return new ArvBin<E>(raiz.getEsq(), dim -(dimDireita(raiz)+1)); }
   public int size() { return dim; }
   public boolean contains(E elem) {
      return !(this.procuraNodo(elem) == null);
   } 
   public E menor() {
       Nodo<E> ant = raiz; Nodo<E> act = ant;
       while( act != null) { ant = act; act = act.getEsq(); }
       return ant.getElem();
   }
   public E maior() {
       Nodo<E> ant = raiz; Nodo<E> act = ant;
       while( act != null) { ant = act; act = act.getDir(); }
       return ant.getElem();
   }

   public int dimDireita() { return arvParaLista(raiz.getDir()).size(); }
   public int dimEsquerda() { return arvParaLista(raiz.getEsq()).size(); }
    
   public Iterator<E> iterator() { return new Iterator<E>() {
      List<E> list = null;
      { list = arvParaLista(raiz); } // é cópia da árvore
      int num = 0; 
      public boolean hasNext(){ return list.size() > 0 && num < list.size();}
      public E next() {
         if (list.size() > 0 && num >= 0 && num < list.size()) 
             return list.get(num++);
         else return null;
      }
      public void remove() { } // sem interesse; removeria na cópia
      };
   } 
     
   // Métodos Internos de gestão da ArvBin<E>
   private Nodo<E> getsubArvDir(Nodo<E> n) { return n.getDir() ; }
   private Nodo<E> getsubArvEsq(Nodo<E> n) { return n.getEsq() ; }                    
   private Nodo<E> procuraNodo(E elem) {
      Nodo<E> aux = raiz; boolean enc = false;
      while(aux != null && !enc) {
        int valComp = elem.compareTo(aux.getElem());
        if ( valComp < 0 ) aux = aux.getEsq();
        else
           if ( valComp >  0 ) aux = aux.getDir();
           else enc = true;;
      }
      if (enc) return aux; else return null;
   }  
   //
   public List<E> arvParaLista() { // copia para lista
      Nodo<E> inicio = raiz;
      return arvParaLista(inicio);
   }
   
   //
   public String toString() {
     StringBuilder sb = new StringBuilder();
     if (raiz == null) return "";
     String nmE = raiz.getElem().getClass().getSimpleName();
     sb.append("-- Árvore Binária de " + nmE + " --\n");
     List<E> le = this.arvParaLista();
     for(E e : le) sb.append(e + "\n");
     sb.append("-------------------"); 
     return sb.toString();
   }

       
   private List<E> arvParaLista(Nodo<E> inicio) { // travessia Esq-Dado-Dir recursiva
      List<E> laux = new ArrayList<E>();
      this.arvParaListaAux(inicio, laux);
      return laux;     
   }
   
   private void arvParaListaAux(Nodo<E> n, List<E> laux) {   
      if (n != null) {
           arvParaListaAux(n.getEsq(), laux); 
           laux.add(n.getElem());
           arvParaListaAux(n.getDir(), laux);
      }
   }
 
   private int dimDireita(Nodo<E> n) { return arvParaLista(n.getDir()).size(); }
   private int dimEsquerda(Nodo<E> n) { return arvParaLista(n.getEsq()).size(); } 
   
   private Nodo<E> procInsNodo(Nodo<E> n, E elem) { // versão recursiva 
      if( n == null ) return new Nodo<E>(elem, null, null);
      int valComp = elem.compareTo(n.getElem());  
      if ( valComp > 0 )
            { n.setDir(procInsNodo(n.getDir(), elem)); return n; }
      else
            { n.setEsq(procInsNodo(n.getEsq(), elem)); return n; }
   }   
   // CLASSE MEMBRO 
   protected class Nodo<E extends Comparable<E> & Serializable> 
                        implements Comparable<Nodo<E>>, Serializable {
      E elem;
      Nodo<E> dir; Nodo<E> esq;  // nodos direito e esquerdo
      //
      Nodo(E elem) { this.elem = elem; dir = null; esq = null;}
      Nodo(E val, Nodo<E> d, Nodo<E> e)  { elem = val; dir = d; esq = e; }
      //
      E getElem() { return elem; }
      Nodo<E> getDir() { return dir; }
      Nodo<E> getEsq() { return esq; }
      void setDir(Nodo<E> n) { dir = n; }
      void setEsq(Nodo<E> n) { esq = n; }
      //      
      public int compareTo(Nodo<E> n) {
           return elem.compareTo(n.getElem());
      } 
      
       /*
      public Nodo<E> clone() { 
        if (this == null) return null;
        else return new Nodo<E>(this.getElem(),this.getDir(), this.getEsq());
      }  
      */
   } // fim de classe Nodo<E>      
} // fim da classe ArvBin<E>
