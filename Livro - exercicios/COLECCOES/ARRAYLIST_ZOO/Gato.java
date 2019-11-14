
/**
 * Gato subclasse de Mamífero
 * 
 * @author FMM - PPIV
 * @version 1.0 / 2005
 */

public class Gato extends Mamifero {

	/**
     * Construtor por omissão
     */
    public Gato() {
		super("", "felino", 0);
	}

	/**
	 * Construtor completo
	 */
	public Gato(String nom, String espec, int pesa) {
		super(nom, espec, pesa);
	}
	
	// Métodos de Instância não herdados
	
	/**
	 * Clone()
	 */
	public Gato clone() { 
	    return new Gato(this.daNome(), this.daEspecie(),
	                   this.daPeso()); 
    }	
}
