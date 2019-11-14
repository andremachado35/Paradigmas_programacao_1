	import java.util.Scanner;
	public class Prog3 {
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

