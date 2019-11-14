/**
 * Motorista: subclasse de Empregado com atributos adicionais.
 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
public class Motorista extends Empregado {
	public static double valKm = 0.98;
	public static double mudaValKm(double nvKm) { return valKm = nvKm; }
	
	private double bonus;
	private int km;
	public Motorista(String nm, int dias, double bon, int km) {
	    super(nm, dias); bonus = bon; this.km = km; }
    public double getBonus() { return bonus; }
    public double salario() { 
        return this.getSalDia()*this.getDias()*bonus + (valKm*km); }
    
}
