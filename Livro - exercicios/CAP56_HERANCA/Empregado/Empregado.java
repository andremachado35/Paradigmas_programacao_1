
/**
 * Classe com atributos comuns aos Empregados de uma empresa.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
public class Empregado {
	
	public static double salDia = 50.00;
	public static double getSalDia() { return salDia; }
    private String nome;
    private int dias;
    
	public Empregado(String nm, int days)
	  { dias = days; nome = nm; }
	public int getDias() { return dias; }
	public double salario() { return dias * getSalDia(); }
	public String getNome() { return nome; }
}
