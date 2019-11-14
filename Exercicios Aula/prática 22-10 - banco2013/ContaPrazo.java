import java.util.*;
/**
 * Write a description of class Conta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContaPrazo
{
    
    private static int num = 0;
    public static int getnum()
    { return num;}
    
    
    private String titular;
    private int nc;
    private double saldo;
    private GregorianCalendar data; // data de inicio do prazo.
    private int prazo;  // nº de dias do prazo
    private double taxa; // taxa do depósito.
    
    
    /**
     * Constructor for objects of class Conta
     */
    public ContaPrazo(String t, double saldoinit, int p, double d)
    {
        // initialise instance variables
        this.titular = t;
        this.nc = ++ContaPrazo.num;
        this.saldo = saldoinit;
        this.data = new GregorianCalendar();
        this.prazo = p; this.taxa = d;
    }

    
    public String getTitular() 
    { return this.titular;}
    
    public void setTitutal(String t)
    { this.titular = t;}
    
    public double getSaldo()
    { return this.saldo;}
    
    public void setSaldo(double v)
    { this.saldo = v;}
    
    public int getNC()
    { return this.nc;}
    
    public int getPrazo()
    { return this.prazo; }
    
    public double getTaxa()
    { return this.taxa;}
    public void setTaxa(double d)
    { this.taxa = d;}
    
    
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
    
    public int diaspassados()
    { return this.numdias(new GregorianCalendar()); }
    
    
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
    
    public boolean equals(ContaPrazo c)
    { if(c != null)
        if(c.getNC() == this.nc)
            return true;
        else
            return false;
      else
        return false;
    }
}
