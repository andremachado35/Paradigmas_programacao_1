import java.util.*;
/**
 * Write a description of class GereEstufas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GereEstufas
{
    // instance variables - replace the example below with your own
    private String nome;
    private ArrayList<Estufa> lista;

    /**
     * Constructor for objects of class GereEstufas
     */
    public GereEstufas(String n)
    {
        // initialise instance variables
        this.nome = n;
        this.lista = new ArrayList<Estufa>();
    }

    /**
     * métodos para responder aos requisitos do problema
     */
    public void insere(Estufa e)
    {
        if(e != null)
            this.lista.add(e.clone());
    }
    
    public int area_total()
    {
        int sum = 0;
        for(Iterator<Estufa> i = this.lista.iterator(); i.hasNext();)
            sum += i.next().getArea();
            
        return(sum);
    }
    
    public ArrayList<Integer> emRisco(int temp)
    {
        ArrayList<Integer> t = new ArrayList<Integer>();
        
        for(Iterator<Estufa> i = this.lista.iterator(); i.hasNext();)
        {
            Estufa x = i.next();
            if(x.risco(temp))
                t.add(x.getCodigo());
        }
        
        return(t);
    }
    
    // perdas mas só para as estufas especificadas pelo nome
    public double perdas(int temp, String nome)
    {
        double acc = 0.0;
        for(Iterator<Estufa> i = this.lista.iterator(); i.hasNext();)
        {
            Estufa x = i.next();
            if(x.risco(temp) && nome.equals(x.getClass().getName()))
                acc += x.valorTotal();
        }
        
        return(acc);
        
    }
    
    public int videiras()
    {
        int acc = 0;
        for(Iterator<Estufa> i = this.lista.iterator(); i.hasNext();)
        {
            Estufa x = i.next();
            if(x instanceof Vinha)
                acc += ((Vinha)x).getPes();
        }
        
        return(acc);
        
    }
    
    
            
}
