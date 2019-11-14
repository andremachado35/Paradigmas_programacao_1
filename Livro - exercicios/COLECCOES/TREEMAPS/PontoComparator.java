
/**
 * Write a description of class PontoComparator here.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
import java.util.Comparator;
import java.io.Serializable;
public class PontoComparator implements Comparator<Ponto>, Serializable {
  public int compare(Ponto p1, Ponto p2) {
      if( p1.getX() < p2.getX() ) return -1; 
      if( p1.getX() > p2.getX()) return 1;
      if( p1.getY() < p2.getY() ) return -1; 
        else if(p1.getY() > p2.getY()) return 1; else return 0; 
  }    	
}
