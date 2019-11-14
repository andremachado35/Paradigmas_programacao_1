
/**
 * Write a description of class TstItemsArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static java.lang.System.out;
public class TstItemsArray {
   public static void main(String[] args) {
       ItemMulti[] filmes = new ItemMulti[200];
       //
       filmes[0] = new Hi8("H1", "2004", "obs", 180, 20.0, 2);
       filmes[1] = new Hi8("A1", "2005", "obs1", 180, 40.0, 3);
       filmes[2] = new CD("A1", "2005", "obs1", 180, 40.0, 3);
       filmes[3] = new CDRW("A1", "2005", "obs1", 180, 40.0, 3);
       filmes[4] = new DVD("A1", "2005", "obs1", 180, 40.0, 3);
       filmes[4] = new DVDRW("A1", "2005", "obs1", 180, 40.0, 3);
       filmes[6] = new DVDV("A1", "2005", "obs1", 180, 40.0, 3);
       filmes[7] = new DVDRW("A1", "2005", "obs1", 180, 40.0, 3);
       filmes[8] = new Hi8("A1", "2005", "obs1", 180, 40.0, 3);
       filmes[9] = new DVDRW("A1", "2005", "obs1", 180, 40.0, 3);
       //
       int contaReg = 0;
       int totalDuracao = 0;
       for(ItemMulti filme : filmes) 
          if(filme instanceof Regravavel) {
               contaReg++;
          }        
       out.printf("Existem %d items regravaveis.", contaReg);
    }
}
