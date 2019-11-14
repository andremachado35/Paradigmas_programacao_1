
/**
 * ProgListas1: testes com ArrayList de Strings
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
import static java.lang.System.out;
import java.util.*;
public class ProgListas1 {
  public static void main(String[] args) {
    ArrayList<String> amigos = new ArrayList<String>();
    ArrayList<String> amigas = new ArrayList<String>(50);
    ArrayList<String> musicos = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    // amigos.add(new Integer(127)); ERRO COMP
    amigos.add("Jorge"); amigos.add("Ivo");
    amigos.add("Rino"); amigos.add("Armando"); amigos.add("Pedro");
    amigas.add("Vera"); amigas.add("Rute"); amigas.add("Rita");
    amigas.add("Zeta");
    musicos.add("Rino"); musicos.add("Zeta");
    //
    // out.println("Tamanho actual: " + amigos.size());
    out.println("--- AMIGOS ---");
    for(String nome : amigos) out.printf(" %s", nome);
    out.println("\n--- AMIGAS ---");
    for(String nome : amigas) out.printf(" %s", nome);
    out.println("\n--- MÚSICOS ---");
    for(String nome : musicos) out.printf(" %s", nome);
    out.println("\n--------------------");
 
/* 
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
 */
/*
  String nome = "";
  out.print("Nome a procurar (ou FIM): ");
  nome = input.next();
  while(!nome.toUpperCase().equals("FIM")) {
  // iterador, while e pesquisa
     boolean vi = false;
     Iterator<String> it = amigos.iterator(); 
     while(it.hasNext() && !vi) {
       if(nome.equals(it.next())) vi = true;
     }
     out.println(nome + (vi ? " Existe." : " Nao existe."));
     out.print("Nome a procurar (ou FIM): ");
     nome = input.next();
  }
*/
  
  Collections.sort(amigos);
  out.println("--- AMIGOS ---");
  for(String n : amigos)  out.printf(" %s", n); 
  
  // Amigos musicos
  ArrayList<String> temp = new ArrayList<String>(amigos);
  temp.retainAll(musicos);
  out.println("\n--- AMIGOS MÚSICOS ---");
  for(String name : temp) out.printf(" %s", name);
  out.println("\n--------------------");
  
  temp = new ArrayList<String>(amigas); temp.retainAll(musicos);
  out.println("\n--- AMIGAS MÚSICAS ---");
  for(String n : temp) out.printf(" %s", n);
  
  // remover amigos e amigas musicos
  amigas.removeAll(musicos); amigos.removeAll(musicos);
  out.println("\n--- AMIGOS ---");
  for(String n : amigos) out.printf(" %s", n);
  out.println("\n--- AMIGAS ---");
  for(String n : amigas) out.printf(" %s", n);


/*  
 ArrayList<String> todos = new ArrayList<String>(amigos);
 todos.addAll(amigas);
 for(String nam : todos) out.printf("Todos : %s%n", nam);
 for(String nam : amigos) { 
     nam = nam + "--"; out.printf("Nome : %s%n", nam); 
 }
 for(String nam : amigos) out.printf("Novos : %s%n", nam);

 
*/
  }
}