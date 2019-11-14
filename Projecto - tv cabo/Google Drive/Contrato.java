
import java.util.*;
public class Contrato
{
   //Variaveis de instancia
   private int numcontrato;
   private ArrayList<Serviços>Services;
   
   //Construtores
   public Contrato()
   {
       this.numcontrato=0;
       this.Services= new ArrayList<Serviços>();
   }

   public Contrato(int numcontrato)
   {
       this.numcontrato=numcontrato;
       this.Services= new ArrayList<Serviços>();
   }
   
   //Metodo de Consulta
   public int getNumcontrato()
   {return numcontrato;}
   
   public int getNumserviços()
   {return this.Services.size();}
   
   //Metodo que devolve um array com os serviços de um contrato
   public ArrayList<Serviços> getServiçoscont() 
    {
        ArrayList<Serviços> temp=new ArrayList<Serviços>();
        
        for(int i=0;i<Services.size();i++)
            temp.add(i,Services.get(i));
            
        return temp;
    }
   
   //Metodo que adiciona Serviço sendo impossivel o mesmo Contrato ter 2x o mesmo serviço
   public boolean addServiço(Serviços s)
   {
       for (int i=0; i<=Services.size(); i++)
         {if(s.getClass().getName()==Services.get(i).getClass().getName())
            return false;
        }
       this.Services.add(s);
       return true;
   }
   
   //Clone
   public Contrato clone()
   {return new Contrato(this.numcontrato);}
}
