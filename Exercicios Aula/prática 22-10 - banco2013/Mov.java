import java.util.*;
/**
 * Write a description of class Mov here.
 * 
 * Classe que representa o movimentos nas contas bancárias.
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
    public Mov(String d, double v, int ano, int mes, int dia)
    {
        // initialise instance variables
        this.data = new GregorianCalendar(ano,mes,dia);
        this.desc = d;
        this.valor = v;
    }

    public Mov(String d, double v)
    {
        // initialise instance variables
        this.data = new GregorianCalendar();
        this.desc = d;
        this.valor = v;
    }
    public double getValor()
    { return this.valor;}
    
    public String getDesc()
    { return this.desc;}

    public GregorianCalendar getData()
    { return (GregorianCalendar)this.data.clone();}
}
