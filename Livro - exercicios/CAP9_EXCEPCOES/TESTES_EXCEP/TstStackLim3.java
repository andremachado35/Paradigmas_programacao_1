 

import java.util.*;
import static java.lang.System.out;
public class TstStackLim3 {
  //
  public static void main(String args[]) {
  //
  Scanner input = new Scanner(System.in);
  int dimensao;
  //
  out.print("Dimensao Maxima da Stack: ");
  dimensao = input.nextInt(); 
  StackLim stack1 = new StackLim(dimensao);
  out.println("Dimensao Max. da Stack1 = " + stack1.dim());
  StackLim stack2 = new StackLim();
  //
  out.println(stack1.empty());
  out.println(stack2.empty());
  try
    { stack1.push("anos");
      stack1.push(new Integer(20));
      stack1.push("tem");
      stack1.push("Maria");
      stack1.push("A");
      System.out.println(stack1.toString());
      System.out.println(stack1.top());
      stack1.pop(); stack1.pop(); stack1.pop(); stack1.pop();
      stack1.pop();
      System.out.println(stack1.empty());
      stack1.top();
   }
  catch(StackVaziaException e)
    { System.out.println("STACK VAZIA !!"); }
  catch(StackCheiaException e)
    { System.out.println("STACK CHEIA !!"); }
  }
}
