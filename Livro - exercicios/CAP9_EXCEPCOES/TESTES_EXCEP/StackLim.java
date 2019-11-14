
/**
 * StackLim: uma stack com capacidade limitada.
 * 
 * @author FMM
 * @version (a version number or a date)
 */
import java.util.*;
 public class StackLim {
 // implementa uma Stack(X) limitada, ou seja, com uma dimensão
 // maxima definida no momento da criacao de cada uma das instancias

 // constante de classe = dimensao por omissao
 private static final int dimStack = 50;

 // variaveis de instancia
 private ArrayList<Object> stack;
 private int dim;          // numero maximo de elementos
 private int numElem;     // numero actual de elementos

 // Construtores

 public StackLim() {
        stack = new ArrayList<Object>();
        dim = dimStack;
        numElem = 0;
 }

 public StackLim(int dim) {
        stack = new ArrayList<Object>();
        this.dim = dim;
        numElem = 0;
 }

 // Metodos de instancia

 public int dim() { return dim; }
 public int size() { return numElem; }

 public boolean empty() { return (numElem == 0) ; }

 public void push(Object elem) throws StackCheiaException {
   if (numElem == dim)
      throw new StackCheiaException("Stack Cheia !!");
   else
      { stack.add(elem); numElem++; }
 }

 public void pop() throws StackVaziaException {
   if (numElem == 0)
      throw new StackVaziaException("Stack Vazia !!");
   else  
      numElem--;
 }

 public Object top() throws StackVaziaException {
   if (numElem == 0)
      throw new StackVaziaException("Stack Vazia !!");
   else
      return stack.get(numElem-1);
 }

 public String toString() {
   StringBuilder s = new StringBuilder();
   for(int i = numElem-1; i >= 0; i--)
     s.append(stack.get(i).toString());
   return s.toString();
 }
}
