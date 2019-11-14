
/**
 * Programa que usa Scanner para ler um inteiro mas
 * realizando a sua validação. Qualquer erro implica
 * o envio de uma mensagem de erro e a limpeza do
 * "buffer" de leitura de Scanner.
 * Este código poderá posteriormente ser transformado
 * num método de leitura e validação de inteiros.
 * 
 * @author F. Mário Martins
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
             { out.println("Inteiro Inválido!"); 
               lixo = input.nextLine(); // limpa buffer
            }
     }
     out.println("Lido = " + i);
     //out.println("Lixo = " + lixo);
  }
}
