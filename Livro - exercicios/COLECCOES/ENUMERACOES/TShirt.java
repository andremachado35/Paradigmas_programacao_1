
/**
 * Enumeration class TShirt - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum TShirt {
	S(15.0),
	M(17.5),
	L(20.0),
	XL(22.0),
	XXL(25.0);
	private TShirt(double preco)
	  { this.preco = preco; }
	private double preco;
	public double getPreco() { return preco; };
}
