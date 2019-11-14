/**
 * Write a description of class TstFormas here.
 * 
 * @author FMM
 * @version 1.0/2005
 */
import static java.lang.System.out;
import java.util.*;
public class TstZoo2 {
	public static void main(String[] args) {
	    ZooMam mamifs = new ZooMam();
	    ArrayList<Cao> caes = new ArrayList<Cao>();
	    ArrayList<Gato> gatos = new ArrayList<Gato>();
	    ArrayList<Coelho> coelhos = new ArrayList<Coelho>();
	    ArrayList<Mamifero> mamifs1 = new ArrayList<Mamifero>();
	    // podemos inserir em Array<Mamifero> um qualquer subtipo !!
	    mamifs1.add(new Cao("AXE", "BOXER", 12));
	    mamifs1.add(new Gato("KIKA", "SIAM", 4));
	    mamifs1.add(new Coelho("X", "CHI", 2));
	    // em ZooMam podemos inserir com juntaMamif um subtipo
	    // de Mamifero
	    mamifs.juntaMamif(new Cao("TIL", "BOXER", 8));
	    mamifs.juntaMamif(new Gato("KUKA", "PER", 3));
	    mamifs.juntaMamif(new Coelho("ZAP", "CHI", 1));
	    
	    // 
	    caes.add(new Cao("BIS", "BASS", 10));
	    caes.add(new Cao("LUKA", "RAF", 7));
	    caes.add(new Cao("GET", "CAN", 5));
	    //
	    gatos.add(new Gato("PUF", "CHI", 2));
	    gatos.add(new Gato("UDI", "PER", 3));
	    gatos.add(new Gato("BIS", "BAN", 1));
	    //
	    coelhos.add(new Coelho("LEV", "IND", 2));
	    
	    // ARRAYLIST<? extends FORMA> É SUPER DE ARRAYLIST<CIRCULO>
	    // addAll() funciona
	    mamifs1.addAll(caes); 
	    mamifs1.addAll(gatos); 
	    mamifs1.addAll(coelhos);
	    
	    // ARRAYLIST<Mamifero> é superclasse de ArrayList<Cao>
	    //mamifs.juntaMamifs(caes);
	    //mamifs.juntaMamifs(gatos);
	    //mamifs.juntaMamifs(coelhos);

    }
 }
 