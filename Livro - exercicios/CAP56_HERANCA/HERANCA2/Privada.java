
/**
 * Privada: classe quase completamente privada.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
public class Privada {
	private String nome;
	private int ano;
	
	public Privada() { nome = ""; ano = 0;}
	public Privada(String nom, int ano) { 
	    this.nome = nome; this.ano = ano; 
	}
	
	public String getNome() {return nome; }
	public int getAno() {return ano;}
	private void mudaNome(String nomeNovo) { nome = nomeNovo;}
}
