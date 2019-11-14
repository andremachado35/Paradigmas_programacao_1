
/**
 * Write a description of class ContaPrazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.GregorianCalendar;
import java.io.*;


public class ContaPrazo
{
    // instance variables - replace the example below with your own
    private int nc;
    private String titular;
    private double saldo;
    private GregorianCalendar data;
    private int prazo;
    private double taxa;
    private static int num=0;
    
    /**
     * Constructor for objects of class ContaPrazo
     */
    public ContaPrazo(String t, int nc, double saldo, int p, double d )
    {
       this.nc = ++ContaPrazo.num;
       this.titular = t;
       this.saldo = saldo;
       this.data = data;
       this.prazo = p; this.taxa = d; 
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
  public String getTitular()
   { return this.titular;}
    
   public double getSaldo()
   { return this.saldo;}
   
   public int getNC()
   { return this.nc;}
   
   public double getTaxa()
   {return this.d;}
   
   public GregorianCalendar getData()
   {return this.data;}
   
   public void setTitutar (int t)
   {
     
    }
   
   public void setTaxa(double d)
   {
       
    }
  
   public boolean equals(ContaPrazo c)
   {
       if (c!= null)
        if(c.getNC() == this.nc)
            return true;
        else
            return false;
       else
            return false;
        }       
        
  public int numdias(GregorianCalendar g)
  {
      long totalmilis = g.getTimeInMillis() - this.data.getTimeInMillis();
      long milis = totalmilis%1000;
      long totalseg = totalmilis/1000; long seg = totalseg%60;
      int totalmin = (int) totalseg/60; int min = totalmin%60;
      int totalhoras = totalmin/60; int horas = totalhoras%60;
      int totaldias = totalhoras/24;
      return totaldias;
    }
    
  public boolean verificajuros()
  {
      GregorianCalendar today = new GregorianCalendar();
      if(this.numdias(today) >= this.prazo)
      {
      double ju = this.saldo * this.taxa;
      this.saldo += ju;
      this.data = today;
      return true;
    }
   else
        return false;

  }
  public int diaspassados()
{ return this.numdias(new GregorianCalendar());
  }
}