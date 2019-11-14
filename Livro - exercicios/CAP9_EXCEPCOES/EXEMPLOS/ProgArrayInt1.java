import static java.lang.System.out;
import java.util.*;
public class ProgArrayInt1 {

 public static int leInt(Scanner input) {
     String lixo = "";
     boolean ok = false; 
     int i = 0; 
     while(!ok) {
         try {
             i = input.nextInt();
             ok = true;
         }
         catch(IndexOutOfBoundsException e) 
             { out.println("Inteiro Invalido"); 
               lixo = input.nextLine();
               out.print("Novo Valor: "); }
     }
     return i;
  }
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     ArrayList<Integer> lista = new ArrayList<Integer>(64);
     for(int i = 1; i<=64; i++) lista.add(null);
     boolean fim = false; int num = 0; 
     int index = 0;
     while(!fim) {
         out.print("Inteiro (9999 = fim): ");
         num = leInt(input);
         if(num != 9999) {
            out.print("Indice: ");
            index = leInt(input);
            lista.set(index, num);
         }
         else
           fim = true;
     }
     for(Integer nm : lista) out.println(nm);
  } 
}
