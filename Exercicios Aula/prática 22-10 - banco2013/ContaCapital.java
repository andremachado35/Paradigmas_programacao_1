import java.util.*;
/**
 * Write a description of class ContaCapital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContaCapital extends ContaPrazo
{
    // instance variables - replace the example below with your own
    private ArrayList<Mov> movs;

    /**
     * Constructor for objects of class ContaCapital
     */
    public ContaCapital(String t, double s, double ta)
    {
        // initialise instance variables
        super(t,s,365,ta);
        this.movs = new ArrayList<Mov>();
        this.movs.add(new Mov("saldo inicial",s));
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean debito(double valor, String d, int ano, int mes, int dia)
    {
        // put your code here
        if(this.getSaldo() - valor > 0)
        {
            Mov m = new Mov(d,-valor,ano,mes,dia);
            this.movs.add(m);
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }
        else
            return false;
    }
    
    public void credito(double valor, String d, int ano, int mes, int dia)
    {
        Mov m = new Mov(d,valor,ano,mes,dia);
        this.movs.add(m);
        this.setSaldo(this.getSaldo()+valor);
    }
    
    public int numdias(GregorianCalendar g1, GregorianCalendar g2)
    {
        long totalmilis = g1.getTimeInMillis() - g2.getTimeInMillis();
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
        if(this.numdias(today) >= this.getPrazo() )
        {
            // calcula saldo médio
            double total = 0.0;
            double tempsaldo = 0.0;
            GregorianCalendar ant = null; // movimento anterior na lista.
            
            for(Mov m:this.movs) // para todos movs
            {
                GregorianCalendar temp = m.getData();
                if(ant != null) // se não for o 1º movimento
                {
                    int dias = this.numdias(temp,ant);
                    total += tempsaldo * dias;
                    tempsaldo += m.getValor();
                }
                else
                    tempsaldo = m.getValor();
                
                ant = temp;
            }
            // último passo (nº dias entre último movimento e hoje!).
            if(ant != null)
            {
                total += tempsaldo * this.numdias(today,ant);
            }
            
            // calcula juros e credita na conta.
            double juros = (total / 365.0) * this.getTaxa();
            this.credito(juros,"juros sobre saldo médio",today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH));
            
            
            return true;
        }
        else
            return false;
    }
    public doujuros()
    {
        GregorianCalendar today = new GregorianCalendar();
        if(this.numdias(today) >= this.getPrazo() )
        {
            // calcula saldo médio
            double total = 0.0;
            double tempsaldo = 0.0;
            GregorianCalendar ant = null; // movimento anterior na lista.
            
            for(Mov m:this.movs) // para todos movs
            {
                GregorianCalendar temp = m.getData();
                if(ant != null) // se não for o 1º movimento
                {
                    int dias = this.numdias(temp,ant);
                    total += tempsaldo * dias;
                    tempsaldo += m.getValor();
                }
                else
                    tempsaldo = m.getValor();
                
                ant = temp;
            }
            // último passo (nº dias entre último movimento e hoje!).
            if(ant != null)
            {
                total += tempsaldo * this.numdias(today,ant);
            }
            
            // calcula juros e credita na conta.
            double juros = (total / 365.0) * this.getTaxa();
            this.debito(juros,"juros sobre saldo médio",today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH));
            
            
            return true;
        }
        else
            return false;
    }
    
    public ContaCapital clone ()
}
