import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class ProgMainAuxs {

  public static final int DIM = 100;
  public static Scanner input = new Scanner(System.in);
 
  public static int[] leArray(int num) {
      int[] nums = new int[num];
      int n = 0;
      for(int i = 0; i< num; i++) nums[i] = input.nextInt();
      return nums;
  }
  
  public static int max(int[] nums, int total) {
      int max = Integer.MIN_VALUE;
      for(int i = 0; i<total; i++) 
         if (nums[i] > max) max = nums[i];
      return max;
  }

  public static void main(String[] args) {
     int[] arrayNum = new int[DIM];
     //Scanner input = new Scanner(System.in);
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
