
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
		super("", "", 0);
	}
	
	public String toString() {
	    StringBuilder s = new StringBuilder();
	    s.append(super.toString());
	    s.append("Tipo: " + this.getClass().getSimpleName());
	    return s.toString();
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
