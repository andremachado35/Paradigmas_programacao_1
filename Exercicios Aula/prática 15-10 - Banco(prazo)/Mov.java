
/**
 * Write a description of class Mov here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mov
{
    // instance variables - replace the example below with your own
    private GregorianCalendar data;
    private String desc;
    private double valor;

    /**
     * Constructor for objects of class Mov
     */
    public Mov(String d, double v, int dia, int mes, int ano)
    {
        // initialise instance variables
        this.data = new GregorianCalendar(ano,mes,dia);
        this.desc = d;
        this.valor = v;
    }

    public double getValor()
    {return this.valor;}
    
    public String
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
