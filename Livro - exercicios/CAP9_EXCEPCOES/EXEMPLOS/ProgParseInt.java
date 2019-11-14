import static java.lang.System.out;
public class ProgParseInt {
  public static int factorial(int n) {
   if(n==1) return 1;
   else return n*factorial(n-1);
  } 
  public static void main(String[] args) {
   int i = Integer.parseInt(args[0]);
   out.println(i+"!=" + factorial(i));
  }
}
