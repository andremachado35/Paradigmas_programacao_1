import java.util.*;
public class CaboTV extends Serviços
{
    //Variaveis de instancia
    private String nomepac;
    private ArrayList<String>pacote;
    
    //Construtores
    public CaboTV()
    {
        super(0);
        this.nomepac="";
        this.pacote=new ArrayList<String>();
    }
    
    public CaboTV(double preço, String nomepac)
    {
        super(preço);
        this.nomepac=nomepac;
        this.pacote=new ArrayList<String>();
    }
    
    //Metodos de consulta
    public String getNomepac()
    {return nomepac;}
    
    //Metodo que retorna os canais presentes no pacote
    public List getCanais()
    {
        List<String> lista=new ArrayList<String>();
        
        for(int i=0;i<=this.pacote.size();i++)
            lista.add(this.pacote.get(i));
            
        return lista;
    }
    
    //Metodos de alteraçao
    public void setNomepac(String nome)
    {this.nomepac=nome;}
    
    //Metodo que adiciona um canal ao pacote
    public void addCanal(String c)
    {this.pacote.add(c);}
    
    //Clone
    public CaboTV clone()
    {return new CaboTV(this.getPreço(),this.nomepac);}

}
    
    
    

    

