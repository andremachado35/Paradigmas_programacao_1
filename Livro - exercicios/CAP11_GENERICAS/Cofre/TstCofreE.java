
/**
 * Write a description of class TstCofre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TstCofreE {
  public static void main(String[] args) {
	Cofre<Integer> intgCofre = new Cofre<Integer>();
	intgCofre.guarda(new Integer(12));
	Cofre<Integer> intCofre = new Cofre<Integer>(12); // autoboxing
	Cofre<String> strCofre = new Cofre<String>("abc");

	// ERROS DE COMPILAÇÃO - TIPOS
	// strCofre.guarda(new StringBuilder("abc"));
	// intgCofre.guarda("abc");
	
	// Acesso aos cofres
	// int val = (Integer) strCofre.consulta(); // ERRO COMPILAÇÃO

	
	
	ArrayList<Integer> lint = new ArrayList<Integer>();
	lint.add(123); lint.add(999);
	// Raw type Cofre (usa Object) - Guarda qualquer coisa
	//Cofre rawCofre = new Cofre(); 
	//rawCofre.guarda(12); rawCofre.guarda("abc");
	//rawCofre.guarda(lint);
	//
	Cofre<Object> cobj = new Cofre<Object>();
	cobj.guarda(12); cobj.guarda("abc");
	cobj.guarda(lint);
	
	ArrayList<String> lstr = new ArrayList<String>();
	lstr.add("ana"); lstr.add("rui");

	Cofre<List<String>> listCofre = new Cofre<List<String>>();
	listCofre.guarda(lstr);

	// Acesso aos cofres
	Integer nm = intgCofre.consulta();
	String pal = strCofre.consulta();
	// int val = (Integer) stringCofre.retira();

    }
}
