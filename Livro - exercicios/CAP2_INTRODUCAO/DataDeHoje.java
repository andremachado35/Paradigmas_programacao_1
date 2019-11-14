
/**
 * Programa que imprime em v�rios formatos a hora e data
 * actual dada por uma inst�ncia de Calendar.
 * 
 * @author F. M�rio Martins
 * @version 1.0/2005
 */
import static java.lang.System.out;
import java.util.Calendar;
public class DataDeHoje {
  public static void main(String[] args) {
      Calendar hoje = Calendar.getInstance();
      out.printf("%tT%n", hoje);
      out.printf("%1$tY-%1$tm-%1$td%n", hoje);
      out.printf("%1$tH-%1$<tM-%1$<tS%n", hoje);
  }
}
