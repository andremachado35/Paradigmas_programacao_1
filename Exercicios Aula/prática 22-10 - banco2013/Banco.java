import java.util.*;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * Versão da classe Banco ainda incompleta!!!!!!!!!!!!!
 */
public class Banco
{
    
    // instance variables - replace the example below with your own
    private ArrayList<ContaPrazo> contas;
    private String nome;

    /**
     * Constructor for objects of class Banco
     */
    public Banco(String nome)
    {
        // initialise instance variables
        this.nome = nome;
        this.contas = new ArrayList<ContaPrazo>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void criaconta(String nome, int tipo, double capita, int p, double taxa)
    {
       switch(tipo)
       {
           case 1: { this.contas.add(new ContaPrazo(nome,capital,p,taxa)}; break;}
           case 2: { this.contas.add(new ContaCapital(nome,capital,p,taxa)}; break;}
    
           public void cria conta (ContaPrazo c)
           {
               if (c != null)
               
            }
    
    public double saldobanco() 
    {
        double saldototal = 0.0;
        for(ContaPrazo x:this.contas)
            saldototal += x.getSaldo();
            
        return saldototal;
        
    }
    
    public double jurosbanco()
    {
        double total = 0.0;
        for(ContaPrazo x:this.contas)
            total += x.juros();
            
       reurn total;
    }
    
    public void despesas(double d)
    {
        for(ContaPrazo x:this.contas)
            x.debito("despesas de manutenção de conta",d};
    }
    
}
