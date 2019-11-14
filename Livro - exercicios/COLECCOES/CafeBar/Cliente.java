
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static java.lang.Math.random;
public class Cliente {
	
	private String nome;
	private int frio;
	private int quente;

	/**
	 * Constructor for objects of class Cliente
	 */
	public Cliente(String nome, int frio, int quente) {
		this.nome = nome;
		this.frio = frio;
		this.quente = quente;
	}

	public int getFrio() { return frio; }
	public int getQuente() { return quente; }
	public int toma(Cafe cafe) throws CafeQuenteException,
	                                      CafeFrioException,
	                                      CafeException {
	   int decisao = 1 + (int) (random()*100);
	   if(decisao < 10) throw new CafeException("Saiu " + decisao);
	   int temp = cafe.getTemp();                                    
	   if(temp > quente) 
	     throw new CafeQuenteException("QUENTE + " + (temp - quente));
	   if(temp < frio)
	       throw new CafeQuenteException("FRIO - " + (frio - temp));
	   return decisao;
	 }
}
