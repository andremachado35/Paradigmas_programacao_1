import java.util.*;
/**
 * Write a description of class Paises here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paises
{
    // instance variables - replace the example below with your own
    private HashMap<String,FichaCapital> tabela;

    /**
     * Constructor for objects of class Paises
     */
    public Paises()
    {
        // initialise instance variables
        this.tabela = new HashMap<String,FichaCapital>();
    }

    /**
    */
    public void insere(String pais, FichaCapital nova)
    {
        // put your code here
        this.tabela.put(pais,nova.clone());
    }
    
    public int num_paises()
    { return this.tabela.size(); }
    
    public List<String> alta_pop(long lim)
    {
        ArrayList<String> nova = new ArrayList<String>();
        for(String p : this.tabela.keySet())
        {
                FichaCapital temp = this.tabela.get(p);
                if(temp.getPop() > lim)
                    nova.add(p);
        }
        return(nova);
    }
    
    public FichaCapital get(String pais)
    {   if(this.tabela.containsKey(pais))
            return this.tabela.get(pais).clone();
        else
            return(null);
    }
    
    public void update(String pais, long pop)
    {
        if(this.tabela.containsKey(pais))
            this.tabela.get(pais).setPop(pop);
    }
    
    public List<String> tabela_capitais()
    {
        ArrayList<String> nova = new ArrayList<String>();
        for(FichaCapital f : this.tabela.values())
            nova.add(f.getNome());
        return(nova);
    }
    
    public long populacao()
    {
        long acc = 0;
        for(FichaCapital f : this.tabela.values())
            acc += f.getPop();
        return(acc);
    }
    
    public void remove(Set<String> paises)
    {
        for(String p:paises)
            this.tabela.remove(p);
    }
    
    public void actualiza_all(Map<String,FichaCapital> nova)
    {
        for(String p: nova.keySet())
            this.tabela.put(p,nova.get(p).clone());
    }
}
