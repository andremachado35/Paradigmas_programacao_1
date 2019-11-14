
/**
 * Programa que imprime em vários formatos a hora e data
 * actual dada por uma instância de Calendar.
 * 
 * @author F. Mário Martins
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
