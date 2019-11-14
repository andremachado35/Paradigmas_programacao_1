
import java.util.*;

public class VideoDemand extends CaboTV
{
    TreeMap<String,String> filmes;
    private double velocidade;
    private double preço;
    
    public VideoDemand()
    {
        this.filmes=new TreeMap<String,String>();  
        this.velocidade=0.0;
    }
    
    public VideoDemand(double velocidade)
    {
        this.filmes=new TreeMap<String,String>();
        this.velocidade=velocidade;
        
        filmes.put("The Raven","2,50");
        filmes.put("The Hobbit","3,50");
        filmes.put("Rush","3,50");
        filmes.put("Limitless","3,00");
        filmes.put("Hunger Games","3,50");
    }
    
    
}

