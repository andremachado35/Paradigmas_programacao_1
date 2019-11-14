
/**
 * Write a description of class Equipa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Equipa {
	// instance variables - replace the example below with your own
	private HashMap<Integer, FichaJogador> equipa;
	private String nomeEquipa;
	
	public Equipa(String nomeTeam) {
	    nomeEquipa = nomeTeam;
	    equipa = new HashMap<Integer, FichaJogador>();
	}
	
	public Equipa(String nome,
	              Collection<? extends FichaJogador> team) {
	    nomeEquipa = nome;
	    equipa = new HashMap<Integer, FichaJogador>();
	    for(FichaJogador ficha : team)
	        equipa.put(ficha.getNumero(), ficha.clone());
    }
    
    public String getNomeEquipa() { return nomeEquipa; }
    
    public void insereJogador(FichaJogador ficha) throws JogJaExisteException {
        if(equipa.containsKey(ficha.getNumero()))
           throw new JogJaExisteException("O N� " + ficha.getNumero() + " ja existe !");
        else
           equipa.put(ficha.getNumero(), ficha.clone());
    }
    
     public FichaJogador consultaJogador(int num) throws JogNaoExisteException {
        if(!equipa.containsKey(num))
           throw new JogNaoExisteException("O N� " + num + " nao existe !"); 
       return equipa.get(num).clone();
    }
    
    public int inscritos() { return equipa.size(); }
    
    public Set<Integer> listaNumeros() {
        Set<Integer> nums = new HashSet<Integer>();
        for(int num : equipa.keySet()) // filtra null
           nums.add(num);
        return nums;
    }
           
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(" EQUIPA " + nomeEquipa + "\n");
        for(FichaJogador ficha : equipa.values())
          s.append(ficha.toString());
        return s.toString();
    }
}
