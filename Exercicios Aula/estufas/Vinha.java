
/**
 * Write a description of class Videiras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vinha extends Fruta
{

    // vars e métodos de classe
    private static int valor = 10;
    
    public static int getValor()
    { return valor;}
    public static void setValor(int v)
    { valor = v;}
    
    // instance variables - replace the example below with your own
    private int pes;  // num de pés de vinha

    /**
     * Constructor for objects of class Videiras
     */
    public Vinha(int c, int a, int mi, int ma, int n)
    {
        // initialise instance variables
        super(c,a,mi,ma);
        this.pes = n;
    }

    public int getPes()
    { return this.pes;}

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double valorTotal()
    {
        // put your code here
        return this.pes * Vinha.getValor();
    }
    
    public Vinha clone()
    { Vinha t = new Vinha(super.getCodigo(), super.getArea(), super.getMin(), super.getMax(), this.pes);
      return t;
    }
}
