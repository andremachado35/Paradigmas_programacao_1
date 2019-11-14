
import java.util.*;
public abstract class Serviços
{
    private double preço;
    private GregorianCalendar datain;

    public Serviços()
    {
        this.preço=0.0;
        this.datain= new GregorianCalendar();
    }
    
    public Serviços(double preço)
    {
        this.preço=preço;
        this.datain= new GregorianCalendar();
    }
    
    public double getPreço()
    {return this.preço;}
    
    public GregorianCalendar getDatain()
    {return this.datain;}
    
    public void setPreço(double preço)
    {this.preço=preço;}   
}
