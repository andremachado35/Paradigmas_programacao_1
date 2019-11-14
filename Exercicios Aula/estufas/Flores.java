import java.util.*;
/**
 * Write a description of class Flores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flores extends Estufa
{
    // instance variables - replace the example below with your own
    private String nome;
    private ArrayList<String> cores;

    // vars e métodos de classe
    private static int valor = 120;
    public static int getValor()
    { return valor;}
    public static void setValor(int v)
    { valor = v;}
    
    /**
     * Constructor for objects of class Flores
     */
    public Flores(int c, int a, int mi, int ma, String n)
    {
        // initialise instance variables
        super(c,a,mi,ma);
        this.nome = n;
        this.cores = new ArrayList<String>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public void addCor(String a)
    { this.cores.add(a);}
    
    public  double valorTotal()
    {
        // put your code here
        return (super.getArea() * Flores.getValor()); 
    }
    
    public Flores clone()
    { Flores t = new Flores(super.getCodigo(), super.getArea(), super.getMin(), super.getMax(),this.nome);
      for(String a:this.cores)
          t.addCor(a);
      return t;
    }
}
