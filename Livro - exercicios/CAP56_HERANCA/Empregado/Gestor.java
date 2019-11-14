
/**
 * Gestor: um empregado com atributo "bonus" específico.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
public class Gestor extends Empregado {
	
	private double bonus;
	public Gestor(String nm, int dias, double bon) {
	    super(nm, dias); bonus = bon; }
    public double getBonus() { return bonus; }
    public double salario() { return this.getSalDia()*this.getDias()*bonus; }
    
}
