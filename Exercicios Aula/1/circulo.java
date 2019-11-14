
/**
 * Write a description of class circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class circulo
{
    // instance variables - replace the example below with your own
    private Ponto centro;
    private double raio;

    /**
     * Constructor for objects of class circulo
     */
    public circulo()
    {
        // initialise instance variables
        this.raio = 1.0;
        this.centro = new Ponto();
    }
    
     public circulo(Ponto p, double r)
    {
        // initialise instance variables
        this.raio = r;
        this.centro = p.clone();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getX()
    {
        // put your code here
        return this.centro.getX();
    }
    public double getY()
    {
        // put your code here
        return this.centro.getY();
    }
    public double getRaio()
    { return this.raio; }
    
    /*queremos fornecer(...)*/
    public Ponto getCentro()
    { return this.centro.clone();}
    
    public double area ()
    { return Math.PI * Math.pow(this.raio,2);}
    
    public double distancia(circulo c)
    { return Math.sqrt (Math.pow(c.getX() - this.getX(),2 ) + Math.pow(c.getY(),2)); }
}
