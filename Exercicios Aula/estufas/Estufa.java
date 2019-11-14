
/**
 * Abstract class Estufa - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Estufa 
{
    // instance variables - replace the example below with your own
    private int codigo;
    private int area;
    private int min, max;
    

    Estufa(int c, int a, int mi, int ma)
    { this.codigo =c; this.area = a; this.min = mi; this.max = ma;}
    
    public boolean risco(int temp)
    { return( temp > this.max || temp < this.min); }
    
    public int getCodigo()
    {return this.codigo;}
    public int getArea()
    {return this.area;}
    public int getMin()
    {return this.min;}
    public int getMax()
    {return this.max;}
    
    public abstract double valorTotal();
    

    public abstract Estufa clone();
    
    
    
}
