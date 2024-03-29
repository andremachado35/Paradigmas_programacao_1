import java.util.*;

/**
 * TstZooDeMamiferosList � uma classe de teste da classe
 * ZooDeMamiferosList.
 * 
 * V�rios testes s�o realizados relativamente ao uso de
 * tipos parametrizados e sua compatibilidade. Para que
 * tais testes tenham sentido devem ser analisadas as 
 * duas classes em simult�neo.
 * 
 * @author F. M�rio Martins
 * @version 2.0/2005
 */
public class TstZooDeMamiferosList {

    public static Collection<Mamifero> criaGatos() {
        Collection<Mamifero> gatos = new ArrayList<Mamifero>();
        gatos.add( new Gato("Kiko", "felino", 5));
        gatos.add( new Gato("Kika", "felino", 4));
        gatos.add( new Gato("Sacha", "felino", 3));
        gatos.add( new Gato("Drago", "felino", 6));
        return gatos;
    }
    
    public static Collection<Mamifero> criaCaes() {
        Collection<Mamifero> caes = new ArrayList<Mamifero>();
        caes.add( new Cao("Luka", "canideo", 8));
        caes.add( new Cao("Xiko", "canideo", 4));
        caes.add( new Cao("Boby", "canideo", 7));
        caes.add( new Cao("Javi", "canideo", 12));
        return caes;
    }
    
    public static Collection<Mamifero> criaCoelhos() {
        Collection<Mamifero> coelhos = new ArrayList<Mamifero>();
        coelhos.add( new Coelho("C1", "roedor", 1));
        coelhos.add( new Coelho("C2", "roedor", 2));
        coelhos.add( new Coelho("C3", "roedor", 3));
        return coelhos;
    }

    
	public static ZooDeMamiferosList main() {
	    
	    Collection<? extends Mamifero> caes = TstZooDeMamiferosList.criaCaes();
	    // Uma Collection<? extends Mamifero> aceita uma Collection<Mamifero>
	    // ou seja Collection<? extends Mamifero> c = Collection<Mamifero> c1
	    // � uma atribui��o v�lida.
	    
	    Collection<Mamifero> gatos = TstZooDeMamiferosList.criaGatos();
	    ZooDeMamiferosList zoo = new ZooDeMamiferosList();
	    
	    zoo.insereAnimais(caes); // insere uma Collection<? extends Mamifero>
	    
	    // Teste: Ser� uma Collection<Mamifero> cf. "gatos",
	    // compat�vel com uma Collection<? extends Mamifero> 
	    // que � o tipo par�metro do m�todo ??
	    	    
	    zoo.insereAnimais(gatos); // OK. � compat�vel. � subtipo !!
	    
	    // Teste: Ser� uma Collection<? extends Mamifero> compat�vel 
	    // com uma Collection<Mamifero> ???
	    
	    // zoo.insereMamiferos(caes);  N�O !! ERRO DE COMPILA��O !!
	    // o m�todo apenas aceita Collection<Mamifero> !!??
	     
	    zoo.insereAnimais(TstZooDeMamiferosList.criaCoelhos());
	    
	    // Teste de outras opera��es
	    
	    zoo.insereGato(new Gato("joy", "felino", 6)); // ok !!
	    
	    zoo.insereMamifero(new Coelho());
	    
	    zoo.insereMamifero(new Gato("joy", "felino", 6));
	    
	    
	    // Juntar mais alguns de uma lista de <Mamifero>
	    
	    ArrayList<Mamifero> maisAlguns = new ArrayList<Mamifero>();
	    
	    maisAlguns.add(new Gato("Hey", "felino", 1));
	    maisAlguns.add(new Coelho("C5", "roedor", 2));
	    maisAlguns.add(new Cao("Jonas", "canideo", 4));
	      
	    zoo.insereAnimais(maisAlguns); // OK !!
	    
	    return zoo;
	}
	    
}
