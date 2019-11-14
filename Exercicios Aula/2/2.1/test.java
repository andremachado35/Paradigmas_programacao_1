
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
        Ponto p3 = new Ponto (1.9, 2.4);
        
        System.out.println ("p1: "+p1.getx () );
        System.out.println ("p1: "+p2.toString () );
        
        System.out.println ("p3: "+p3.toString() );
        Ponto p4 = p3.clone();
        Ponto p5 = p3;
        System.out.println("p4: "+p4.toString() );
        System.out.println("p5: "+p5.toString() );
        p3.setX (12.2);
        System.out.println("p4: "+p4.toString() );
        System.out.println("p5: "+p5.toString() );
        
        System.out.println("p3 == p4 ? "+ p3.equals(p4) );
        System.out.println("p3 == p5 ? "+ p3.equals (p5) );
        
        Circulo c1 = new Circulo(p3,10);
        Circulo c2 = new Circulo(p4,10);
        
        System.out.println("area p3="+p3.area() );
                
}}
