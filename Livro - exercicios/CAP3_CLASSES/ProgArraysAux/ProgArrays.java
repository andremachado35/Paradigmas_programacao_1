/**
 * 
 * ProgArrays
 * 
 * Programa que lê para um array um número dado de valores inteiros,
 * usando um método auxiliar, e que calcula o maior elemento do array.
 * Usando um método da classe auxiliar Arrays, o programa ordena por
 * ordem crescente o array original.
 * 
 * @author F. Mário Martins 
 * @version 1.0/2006
 */

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class ProgArrays {

  public static final int DIM = 100;
  public static Scanner input = new Scanner(System.in);
 
  // Lê valores inteiros para um array e devolve-o como resultado
  // num é o total de valores a ler. 
  public static int[] leArray(int num) {
      int[] nums = new int[num];
      int n = 0;
      for(int i = 0; i< num; i++) nums[i] = input.nextInt();
      return nums;
  }
  
  // Calcula o maior elemento de um array que tem "total" elementos.
  public static int max(int[] nums, int total) {
      int max = Integer.MIN_VALUE;
      for(int i = 0; i<total; i++) 
         if (nums[i] > max) max = nums[i];
      return max;
  }

  // Programa Principal: Lê, calcula máximo, ordena e imprime.
  public static void main(String[] args) {
     int[] arrayNum = new int[DIM];
     out.print("Total de números a ler: ");
     int dim = input.nextInt();
     arrayNum = leArray(dim);
     int maximo = max(arrayNum, dim);
     out.println("Máximo = " + maximo);
     Arrays.sort(arrayNum);
     out.println("Array Ordenado --");
     for(int i = 0; i<dim; i++) out.println(arrayNum[i]);
     int soma = 0;
     for(int n : arrayNum) soma += n;
     out.println("Somatório = " + soma);
  } 
}
