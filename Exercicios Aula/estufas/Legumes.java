
/**
 * Write a description of class Legumes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Legumes extends Estufa
{
    // instance variables - replace the example below with your own
    private String nome;
    private int altura;

    // vars e métodos de classe
    private static int valor = 170;
    public static int getValor()
    { return valor;}
    public static void setValor(int v)
    { valor = v;}
    
    /**
     * Constructor for objects of class Legumes
     */
    public Legumes(int c, int a , int mi, int ma, String n, int al)
    {
        // initialise instance variables
        super(c,a,mi,ma);
        this.nome = n;
        this.altura = al;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double  valorTotal()
    {
        // put your code here
        return ( super.getArea() * Legumes.getValor());
    }
    
    public Legumes clone()
    {  
        return new Legumes(super.getCodigo(), super.getArea(), super.getMin(), super.getMax(),this.nome, this.altura);
    }
}
