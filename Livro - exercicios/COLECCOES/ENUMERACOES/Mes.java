
/**
 * Enumeration class Mes - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Mes {
    // enumeracao
	Janeiro(31),
	Fevereiro(29),
	Marco(31),
	Abril(30),
	Maio(31),
	Junho(30),
	Julho(31),
	Agosto(31),
	Setembro(30),
	Outubro(31),
	Novembro(30),
	Dezembro(31);
	// construtor privado da classe
	private Mes(int dias) { this.dias = dias; }
	// variável de estado associada a cada constante
    private final int dias;
    // método para consulta do estado de cada constante
    public final int getDias() { return dias; }
}
