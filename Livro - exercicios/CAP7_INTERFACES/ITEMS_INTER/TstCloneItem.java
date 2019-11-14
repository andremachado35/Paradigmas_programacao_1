
/**
 * Write a description of class TstItemsArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static java.lang.System.out;
public class TstCloneItem {
   public static void main(String[] args) {
       ItemMulti[] filmes = new ItemMulti[200];
       ItemMulti[] filmes1 = new ItemMulti[200];
       //
       filmes[0] = new Hi8("H1", "2004", "obs", 180, 20.0, 2);
       filmes[1] = new Hi8("A1", "2005", "obs11", 180, 40.0, 3);
       filmes[2] = new CD("A2", "2003", "obs13", 180, 50.0, 3);
       filmes[3] = new CDRW("A3", "2000", "obs31", 180, 77.0, 5);
       filmes[4] = new DVD("A4", "2005", "obs16", 180, 30.0, 3);
       filmes[5] = new DVDRW("A5", "2002", "obs21", 180, 35.0, 3);
       filmes[6] = new DVDV("A6", "2000", "obs17", 60, 60.0, 3);
       filmes[7] = new DVDRW("A7", "2001", "obs61", 140, 80.0, 3);
       filmes[8] = new Hi8("A8", "2005", "obs19", 120, 30.0, 3);
       filmes[9] = new DVDRW("A9", "2004", "obs12", 180, 45.0, 3);
       filmes[10]= new Hi9("A9", "2004", "obs12", 180, 45.0, 3);
       //
       int contaReg = 0;
       int total = 0;
       for(ItemMulti filme : filmes) {
          total++;
          if(filme instanceof Regravavel) contaReg++;
       }
       out.printf("Existem %d items regravaveis em %d.%n", contaReg, total);
       for(int i=0; i<=9;i++) {
         out.println(filmes[i].toString());
         filmes1[i] = filmes[i].clone(); // clones OK 
       }
       for(int i=0; i<=9;i++) filmes1[i].mudaData("9999");
       out.printf("%s-",filmes1[0].toString());
       out.printf("%s-",filmes1[0].getData());
       out.printf("%s-%n",filmes1[0].getObs());
       for(int i=0; i<=9;i++) out.println(filmes[i].getData()); 
       out.println(filmes[10] instanceof Regravavel);       
    }
}
