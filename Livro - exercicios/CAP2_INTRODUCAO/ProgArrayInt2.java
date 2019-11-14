
/**
 * Programa que usa Scanner para ler um inteiro v�lido e
 * inseri-lo num array de inteiros. Inteiros inv�lidos n�o
 * geram erro mas s�o desprezados. O programa l� igualmente
 * o �ndice onde o inteiro lido vai ser inserido. O array de
 * inteiros � esparso n�o gerando erros de IndexOutOfBounds. 
 * 
 * @author F. M�rio Martins
 * @version 1.0/2005
 */

import static java.lang.System.out;
import java.util.*;
public class ProgArrayInt2 {


 public static int leInt(Scanner input) {
     boolean ok = false; 
     int i = 0; 
     while(!ok) {
         try {
             i = input.nextInt();
             ok = true;
         }
         catch(IndexOutOfBoundsException e) 
             { out.println("Inteiro Invalido"); 
               out.print("Novo valor: ");
               input.nextLine(); 
             }
     }
     return i;
  } 


  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     ArrayList<Integer> lista = new ArrayList<Integer>(64);
     int conta = 0;
     // array � inicializado a null para permitir inser��o
     // em qualquer indice desde 0 a 63
     for(int i = 1; i<= 64; i++) lista.add(null); 
     boolean fim = false; int num = 0; 
     int index = 0;
     while(!fim) {
         out.print("Inteiro (9999 = fim): ");
         num = leInt(input);
         if(num != 9999) {
            out.print("Indice: ");
            index = leInt(input);
            try { lista.set(index, num); }
            catch(IndexOutOfBoundsException e)
              { out.println("Indice fora dos limites !");
              }
         }
         else
           fim = true;
     }   
     for(Integer nm : lista) {
         conta++;
         if (nm != null) out.println(conta + ": " + nm);
     }
  } 
}
