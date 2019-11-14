
/**
 * Write a description of class SubA here.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
    public class SubA extends Super {
	   private int x = 20; // “shadow”
	   String nome;   // “shadow”
	//
	   public int getX() { return x; }
	   public String classe() { return "SubA"; }
	   public String supClasse() { return super.classe(); }
	   public int soma() { return x + super.x; }
	}
