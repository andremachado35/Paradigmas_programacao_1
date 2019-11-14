
/**
 * Write a description of class SubAA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubAA extends SubA {
   private int x = 30; // “shadow”
   String nome;   // “shadow”
//
   public int getX() { return x; }
   public String classe() { return "SubAA"; }
}
