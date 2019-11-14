
/**
 * Write a description of class ponto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ponto
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ponto
     */
    public ponto()
    {
        // initialise instance variables
        this.x = 0.0; this.y = 0.0;
    }
    public ponto (double x, double y){
        this.x=x; this.y=y;}
       

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getx()
    { return this.X;}
    public double gety()
    {return this.y;}
    public void setX(double x)
    {this.x = x;}
    public void setY(double y)
    {this.y = y;}
    public ponto clone()
    { return new Ponto (this.x, this.y);}

    public string toString()
    { return " " +this.x+";"+this.y+";";}
    
    public boolean equals (Ponto a)
    { if(a!=null)
         return (a.getX() == this.x && a.getY() == this.y);
      else
         return false;
        }}