
/**
 * Classe Cao
 * 
 * @author FMM
 * @version 1.0 (Abril 2005)
 */

public class Cao extends Mamifero {

    /**
     * Construtor por omissão
     */
    public Cao() {
		super("", "", 0);
	}
	
	/**
	 * Construtor completo
	 */
	public Cao(String nom, String espec, int peso) {
		super(nom, espec, peso);
	}
	
	// Métodos de Instância não herdados
    
    
	public String toString() {
	    StringBuilder s = new StringBuilder();
	    s.append(super.toString());
	    s.append("Tipo: " + this.getClass().getSimpleName());
	    return s.toString();
	}
	
	
	/**
	 * Clone()
	 */
	public Cao clone() { 
	    return new Cao(this.daNome(), this.daEspecie(),
	                   this.daPeso()); 
    }	
}
