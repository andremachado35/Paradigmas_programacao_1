
/**
 * Write a description of class TesteEnum1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static java.lang.System.out;

public class TesteEnum1 {
   public static void main(String[] args) {
       
       Direccao move, joyStick = null;
       String dir = "";
       // iterar todos os valores de Direccao
       for(Direccao d : Direccao.values()) {
           out.println(d);
        }
       dir = Direccao.Sul.toString();
       int ordem = Direccao.Sul.ordinal() + 1;
       out.println("Sul = " + dir + " Nº: " + ordem);
       out.println(joyStick.valueOf("Sul").toString());
       out.println(Enum.valueOf(Direccao.class,"Este").ordinal()+1);
       // e se for a variavel ?? getClass() nao funciona !!
       
       // Passagem para EnumSet
       // "parsing" de String -> Identificador 
       dir = "Oeste"; move = null;
       try { move = Enum.valueOf(Direccao.class, dir);
        }
       catch(IllegalArgumentException e) { out.println(e); }
       //out.println(EnumSet.allOf(Direccao).contains(valueOf("Oeste")));
      out.println("Movimento : " + move);

       
       
     
    }
}
