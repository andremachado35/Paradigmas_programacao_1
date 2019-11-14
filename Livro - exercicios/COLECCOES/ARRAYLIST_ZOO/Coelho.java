
/**
 * Coelho � subclasse de Mamifero.
 * 
 * @author FMM - PPIV
 * @version 1.1 (Abril 2005)
 */
public class Coelho extends Mamifero {
	
	/**
     * Construtor por omiss�o
     */
    public Coelho() {
		super("", "roedor", 0);
	}

	/**
	 * Construtor completo
	 */
	public Coelho(String nom, String espec, int pesa) {
		super(nom, espec, pesa);
	}
	
	// M�todos de Inst�ncia n�o herdados
	
	/**
	 * Clone()
	 */
	public Coelho clone() { 
	    return new Coelho(this.daNome(), this.daEspecie(),
	                   this.daPeso()); 
    }	
}
