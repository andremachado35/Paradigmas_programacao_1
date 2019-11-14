/**
 * Write a description of class TstFormas here.
 * 
 * @author FMM
 * @version 1.0/2005
 */
import java.util.*;
public class TstZooMam {
    //
    public static ArrayList<Cao> criaCaes() {
        ArrayList<Cao> caes = new ArrayList<Cao>();
        // 
        caes.add(new Cao("BIS", "BASS", 10));
        caes.add(new Cao("LUKA", "RAF", 7));
        caes.add(new Cao("GET", "CAN", 5));
        return caes;
    }
    
    public static ArrayList<Gato> criaGatos() {
        ArrayList<Gato> gatos = new ArrayList<Gato>();
        gatos.add(new Gato("PUF", "CHI", 2));
        gatos.add(new Gato("UDI", "PER", 3));
        gatos.add(new Gato("BIS", "BAN", 1));
        return gatos;
    }
    
    public static ArrayList<Coelho> criaCoelhos() {
        ArrayList<Coelho> coelhos = new ArrayList<Coelho>();
        //
        coelhos.add(new Coelho("LEV", "IND", 2));
        return coelhos;
    }   
  		public static ZooMam main(String[] args) {
		// Variável do tipo ZooMam
			ZooMam zoo = new ZooMam();
		// Array auxiliar
			ArrayList<Mamifero> mamifs = new ArrayList<Mamifero>();
			// junta ArrayList<Cao>, <Gato>, <Coelho>
			mamifs.addAll(criaCaes()); // junta ArrayList<Cao>
			mamifs.addAll(criaGatos()); // junta ArrayList<Gato>
			mamifs.addAll(criaCoelhos()); // junta ArrayList<Coelhos>
			// junta 1 a 1
			zoo.juntaMamif(new Cao("TIL", "BOXER", 8));
			zoo.juntaMamif(new Gato("KUKA", "PER", 3));
			zoo.juntaMamif(new Coelho("ZAP", "CHI", 1));
			// junta ArrayList<Mamifero>
			zoo.juntaMamifs(mamifs); //
			// 
        return zoo; // objecto devolvido (BlueJ)
		}
	}

 