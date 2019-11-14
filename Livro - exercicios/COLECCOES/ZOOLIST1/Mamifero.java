
/**
 * Abstract class Mamifero 
 * 
 * @author PPIV
 * @version 1.0 (Maio 2005)
 */
public abstract class Mamifero {
	
	/**
	 * Construtor por omiss�o
	 */
	public Mamifero() {
	    nome = ""; especie = ""; peso = 0;
	}
	
	/**
	 * Construtor completo
	 */
	public Mamifero(String nom, String espec, int pesa) {
	    nome = nom; especie = espec; peso = pesa;
	}
	
	// Vari�veis de Inst�ncia
	
	private String nome;
	private String especie;
	private int peso;
	
	 // M�todos de Inst�ncia

	/**
	 * Devolve o nome
	 */
	public String daNome() { return nome; }
	
	/**
	 * Devolve a esp�cie
	 */
	public String daEspecie() { return especie; }
	
	/**
	 * Devolve o peso
	 */
	public int daPeso() { return peso; }
	
	/**
	 * Muda o peso
	 */
	public void mudaPeso(int nvPeso) { peso = nvPeso; }
	
	/**
	 * Devolve a descri��o como String
	 */
	public String toString() {
	     StringBuilder s = new StringBuilder();
	     s.append("\n-------- DESCRI��O DO MAM�FERO ------------\n");
	     s.append("NOME : "); s.append(nome); s.append("\n");
	     s.append("ESP�CIE : "); s.append(especie); s.append("\n");
	     s.append("PESO : "); s.append(peso); s.append("\n");
	     return s.toString();
    }
	
  	// M�todos Abstractos
  	
	/**
	 * For�a a Redefini��o de clone()
	 */
	public abstract Mamifero clone();		
}
