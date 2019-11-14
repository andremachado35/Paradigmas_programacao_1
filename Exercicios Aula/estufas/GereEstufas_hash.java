import java.util.*;
/**
 * Write a description of class GereEstufas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GereEstufas_hash
{
    // instance variables - replace the example below with your own
    private String nome;
    private HashMap<Integer,Estufa> lista;

    /**
     * Constructor for objects of class GereEstufas
     */
    public GereEstufas_hash(String n)
    {
        // initialise instance variables
        this.nome = n;
        this.lista = new HashMap<Integer,Estufa>();
    }

    /**
     * métodos para responder aos requisitos do problema
     */
    public void insere(Estufa e)
    {
        if(e != null)
            this.lista.put(e.getCodigo(),e.clone());
    }
    
    public Estufa procura(int chave)
    {
        Estufa temp = this.lista.get(chave);
        if(temp != null)
            return(temp.clone());
        else
            return(null);
    }
    
    public int area_total()
    {
        int sum = 0;
        for(Iterator<Estufa> i = this.lista.values().iterator(); i.hasNext();)
            sum += i.next().getArea();
            
        return(sum);
    }
    
    public ArrayList<Integer> emRisco(int temp)
    {
        ArrayList<Integer> t = new ArrayList<Integer>();
        
        for(Iterator<Estufa> i = this.lista.values().iterator(); i.hasNext();)
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
        for(Iterator<Estufa> i = this.lista.values().iterator(); i.hasNext();)
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
        for(Iterator<Estufa> i = this.lista.values().iterator(); i.hasNext();)
        {
            Estufa x = i.next();
            if(x instanceof Vinha)
                acc += ((Vinha)x).getPes();
        }
        
        return(acc);
        
    }
    
    
            
}
