
/**
 * Write a description of class FichaJogador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class FichaJogador {

    private int numero;
    private String nomeCampo;
    private String nome;
    private int idade;
    private double altura;
    private String posicao;
    
	public int getNumero() { return numero; }
	
	public FichaJogador() {
	   numero = 0; nomeCampo = "";
       nome = ""; idade = 0; altura = 0.0;
       posicao = "";
	}
	
	public FichaJogador(int num, String nomeJogo, String nom,
	                    int anos, double altura, String pos) {
	   numero = num; nomeCampo = nomeJogo;
       nome = nom; idade = anos; this.altura = altura;
       posicao = pos;
	}
	
	public FichaJogador clone() {
	    return 
	      new FichaJogador(numero, nomeCampo, nome, idade, altura, posicao);
    }
    
    public String toString() {
      StringBuilder s = new StringBuilder();
      s.append("Numero: " + numero + "\n");
      s.append("Nome: " + nomeCampo + "\n");
      s.append("N. Completo: " + nome + "\n");
      s.append("Idade: " + idade + "\n");
      s.append("Altura: " + altura + "\n");
      s.append("Posicao: " + posicao + "\n");
      s.append("----------------------------\n");
      return s.toString();
    }
}
