
/**
 * Programa que usa Scanner para ler um inteiro mas
 * realizando a sua valida��o. Qualquer erro implica
 * o envio de uma mensagem de erro e a limpeza do
 * "buffer" de leitura de Scanner.
 * Este c�digo poder� posteriormente ser transformado
 * num m�todo de leitura e valida��o de inteiros.
 * 
 * @author F. M�rio Martins
 * @version 1.0/2005
 */

import static java.lang.System.out;
import java.util.*;
public class ProgLerInt {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String lixo = "";
     boolean ok = false; int i = 0; 
     while(!ok) {
         out.print("Inteiro: ");
         try {
             i = input.nextInt();
             ok = true;
         }
         catch(InputMismatchException e) 
             { out.println("Inteiro Inv�lido!"); 
               lixo = input.nextLine(); // limpa buffer
            }
     }
     out.println("Lido = " + i);
     //out.println("Lixo = " + lixo);
  }
}
