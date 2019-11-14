
/**
 * Programa que usa Scanner para ler um nome e uma idade.
 * 
 * @author F. Mário Martins
 * @version 1.0/2005
 */
import java.util.Scanner;
public class ProgNomeIdade {
	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		String nome = ""; 
		int idade; 
		System.out.print("Nome: ");
		nome = input.next();
		System.out.print("Idade: ");
		idade = input.nextInt();
		System.out.println(nome + " tem " + idade + " anos.\n");
	}
}

