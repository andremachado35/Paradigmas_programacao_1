
/**
 * Write a description of class TstListas1 here.
 * 
 * @author F. Mario Martins
 * @version 1.0
 */
import static java.lang.System.out;
import java.util.*;
public class TstListas1 {
  public static void main(String[] args) {
    ArrayList<String> amigos = new ArrayList<String>();
	ArrayList<String> amigas = new ArrayList<String>(50);
	ArrayList<String> devedores = new ArrayList<String>();
	// amigos.add(new Integer(127)); ERRO COMP
	amigos.add("Jorge"); amigos.add("Ivo");
	amigos.add("Rui"); amigos.add("Armando"); amigos.add("Pedro");
	amigas.add("Vera"); amigas.add("Rute");
	//
	amigos.set(2, "Lopes");
	out.println("Tamanho actual: " + amigos.size());
	for(String nome : amigos) out.printf("Amigo ..%s%n", nome);
	boolean b = amigos.contains(new Integer(127)); // ??
	out.println("Existe " + b);
	int index = amigos.indexOf("Ivo"); 
	out.println("Indice = " + index);
   // usando os �ndices
   for(int i = 0; i< amigos.size(); i++) {
	 out.println("AmigoIx : " + amigos.get(i));
   }

 
  // usando Iterator<Object> e for
 String nm = "";
 for(Iterator it = amigos.iterator(); it.hasNext();) {
    nm = (String) it.next();
	out.println("AmigoSS : " + nm);
 }
 
  // usando Iterator<Object>, for e toString() dinamico
 for(Iterator it = amigos.iterator(); it.hasNext();) {
	out.println("AmigoSS : " + it.next());
 }
 
  // usando Iterator e for
 for(Iterator<String> it = amigos.iterator(); it.hasNext();) {
	out.println("AmigoIt : " + it.next());
 }
 
  // iterador, while e pesquisa
  boolean encontrado = false;
  String nome = "";
  Iterator<String> it = amigos.iterator(); 
  while(it.hasNext() && !encontrado) {
	nome = it.next();
	if (nome.length() > 5) encontrado = true;
  }
  out.println("Nome > 5 : " + nome);
  
  // iterador, for e pesquisa 8-((
  // usando Iterator e for
  encontrado = false;
  nome = "";
  for(Iterator<String> it1 = amigos.iterator(); it1.hasNext() && !encontrado;) {
	nome = it1.next();
	if (nome.length() > 5) encontrado = true;
 }
  out.println("Nome > 5 : " + nome);
 
 ArrayList<String> todos = new ArrayList<String>(amigos);
 todos.addAll(amigas);
 for(String nam : todos) out.printf("Todos : %s%n", nam);
 for(String nam : amigos) { 
     nam = nam + "--"; out.printf("Nome : %s%n", nam); 
 }
 for(String nam : amigos) out.printf("Novos : %s%n", nam);
 


  }
}