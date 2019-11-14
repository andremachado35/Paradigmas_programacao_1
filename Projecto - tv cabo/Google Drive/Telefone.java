
import java.util.*;
public class Telefone extends Serviços
{
    private double limite;

    public Telefone()
    {
        super(0);
        this.limite=0;
    }
    
    public Telefone(double limite,double preço)
    {
        super(preço);
        this.limite=limite;
    }
    
    public double getLimite()
    {return limite;}
    
    public void setLimite(double limite)
    {this.limite=limite;}
    
    public Telefone clone()
    {return new Telefone(this.getPreço(),this.limite);}
}
    
    
    
