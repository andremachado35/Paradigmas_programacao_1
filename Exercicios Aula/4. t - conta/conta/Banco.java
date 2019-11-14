
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
   static final int NC = 100;
    // instance variables - replace the example below with your own
   private Conta contas[];
   private String nome;
    /**
     * Constructor for objects of class Banco
     */
    public Banco(String nome)
    {
        // initialise instance variables
        this.nome = nome;
        this.contas = new Conta[NC];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double saldobanco()
    {
        double saldototal = 0.0;
        for(Conta x:this.contas)
           saldototal += x.getSaldo();
        return saldototal;
    }
    
    //despesa
    public void despesas (double d)
    {
         for(Conta x:this.contas)
            x.debito(d);
    }    
}

