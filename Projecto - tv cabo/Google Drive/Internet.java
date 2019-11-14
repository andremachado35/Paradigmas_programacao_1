
import java.util.*;
public class Internet extends Serviços
{
    private double velocidade;
    private double trafego;
    
    public Internet()
    {
        super(0);
        this.velocidade=0.0;
        this.trafego=0.0;
    }
    
    public Internet(double preço, double velocidade,double trafego)
    {
        super(preço);
        this.velocidade=velocidade;
        this.trafego=trafego;
    }
    
    public double getVelocidade()
    {return velocidade;}
    
    public double getTrafego()
    {return trafego;}
    
    public void setVelocidade(double velocidade)
    {this.velocidade=velocidade;}
    
    public void setTrafego(double trafego)
    {this.trafego=trafego;}
    
    public Internet clone()
    {return new Internet(this.getPreço(),this.velocidade,this.trafego);}
    
}
