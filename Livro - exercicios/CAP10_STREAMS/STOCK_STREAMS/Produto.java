
/**
 * Classe que implementa a informa��o sobre cada produto em Stock.
 * 
 * @author FMM 
 * @version 1.0/2005
 */
import java.util.*;
import java.io.Serializable;

public class Produto implements Serializable {
	
	private String codigo;
	private String nome;
	private int quant;
	private Set<String> comps; // c�digos componentes

    public Produto(String cod, String nom, int qt, HashSet<String> cps) {
        codigo = cod; nome = nom; quant = qt;
        comps = new HashSet<String>();
        for(String cp : cps) comps.add(cp);
    }
    
    public String daCod() { return codigo; }
    public String daNome() { return nome; }
    public int daQuant() { return quant; }
    public HashSet<String> daComps() {
        HashSet<String> cps = new HashSet<String>();
        for(String comp : comps) cps.add(comp);
        return cps;
    }
    public Produto clone() {
      return new Produto(codigo, nome, quant, this.daComps());
    }
    
    public String toString() {
       StringBuilder s = new StringBuilder();
       s.append("-------------------\n");
       s.append("Codigo: "); s.append("\t"); s.append(codigo + "\n"); 
       s.append("Nome: " ); s.append("\t"); s.append(nome + "\n");
       s.append("Quant: "); s.append("\t"); s.append(quant + "\n"); 
       int num = comps.size();
       s.append("Componentes: "); s.append(num + "\n");
       for(String c : comps) s.append(c + "\n");
       return s.toString();
    }
      
      public String asString() {
       String s = "-------------------\n";
       s = s + "Codigo: " + "\t" + codigo +"\n"; 
       s = s + "Nome: " + "\t" + nome + "\n";
       s = s + "Quant: " + "\t" + quant + "\n";      
       int num = comps.size();
       s = s + "Componentes: " + num + "\n";
       for(String c : comps) s = s + c + "\n";
       return s.toString();
    }
}
