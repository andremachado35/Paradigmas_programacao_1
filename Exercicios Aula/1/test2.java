
/**
 * Write a description of class test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
   public static void main (String a[])
   {
        ponto p1 = new ponto();
        Ponto p2 = new Ponto(1.2, 1.4);
        Ponto p3 = new Ponto(-1.9, 2.4);
        
        System.out.println ("p1: "+p1.getx ());
        System.out.println ("p2: "+p2.toString ());
        
        Segmento s1= new segmento ();
        Segmento s2= new segmento (p1,p2);
        Segmento s3= new segmento (p1,p3);
        
        System.out.println ("s1: "+s1.sentido()};
        System.out.println ("s2: "+s2.sentido()};
        
    }
}
