
/**
 * Write a description of class Prog1 here.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LerStrInt {
  public static void main(String[] args) {
      System.out.print("Frase: ");
      Scanner input = new Scanner(System.in);
      String txt = input.next();
      System.out.println(txt);
      System.out.print("Int: ");
      int i = input.nextInt();
      System.out.println(i);
	}
}
