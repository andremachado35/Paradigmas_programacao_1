
import java.util.*;
public class Cliente
{
    //Variaveis de instancia
    private int codcliente;
    private String nome;
    private String email;
    private String morada;
    private ArrayList <Contrato> contratos;
    
    //Construtores
    public Cliente()
    {
        this.nome="";
        this.email="";
        this.morada="";
        this.codcliente=0;
        this.contratos= new ArrayList<Contrato>();
    }
    
    public Cliente(int cod,String nome,String email,String morada)
    {
        this.nome=nome;
        this.email=email;
        this.morada=morada;
        this.codcliente=cod;
        this.contratos= new ArrayList<Contrato>();
    }
    
    //Metodos de consulta
    public int getCodcliente()
    {return codcliente;}
    
    public String getNome()
    {return nome;}
    
    public String getMorada()
    {return morada;}
    
    public String getEmail()
    {return email;}
    
    //Metodos de Verificaçao
    public void setMorada()
    {this.morada=morada;}
    
    public void setEmail()
    {this.email=email;}
    
    //Metdodo equals para verificar codigo do cliente
    public boolean equalscod(int c)
    {
        if(c==this.codcliente)
            return true;
        else   
            return false;
    }
    
    //Adicionar contrato ao cliente
    public void addContrato(Contrato x)
    {this.contratos.add(x);}
    
    //Metodo que devolve todos os contratos de um dado cliente
    public ArrayList<Contrato> getContratos() 
    {
        ArrayList<Contrato> lista=new ArrayList<Contrato>();
        
        for(int i=0;i<this.contratos.size();i++)
            lista.add(i,this.contratos.get(i));
          
        return lista;
    }
    
    //Clone
    public Cliente clone()
    {return new Cliente(this.codcliente,this.nome,this.morada,this.email);}
        
}
