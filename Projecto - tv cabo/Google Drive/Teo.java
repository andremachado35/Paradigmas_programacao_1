
import java.util.*;

public class Teo
{
    
    private ArrayList<Cliente> clientes;
    
    public Teo()
    {
        clientes=new ArrayList<Cliente>();
        
        Cliente cliente1=new Cliente(20,"Joao","Joao@hotmail.com","Rua X");
        Contrato c1=new Contrato();
        c1.addServiço(new Telefone(12,2000));
        c1.addServiço(new Internet(15,24,500));
        c1.addServiço(new CaboTV(20,"100C"));
        //c1.addServiço(new VideoDemand(x));
        cliente1.addContrato(c1.clone());
        
        for(int j=0;j<listaServicos(c1.clone()).size();j++)
            System.out.println(listaServicos(c1.clone()).get(j));
        
        
        
        Cliente cliente2=new Cliente(21,"Machado","Machado@hotmail.com","Rua Y");
        Contrato c2=new Contrato();
        c2.addServiço(new Telefone(15,2500));
        c2.addServiço(new Internet(20,30,750));
        c2.addServiço(new CaboTV(25,"120C"));
        //c2.addServiço(new VideoDemand(x));
        cliente2.addContrato(c2.clone());
        
        
        Cliente cliente3=new Cliente(22,"Martins","Martins@gmail.com","Rua Z");
        Contrato c3=new Contrato();
        c3.addServiço(new Telefone(13,2300));
        c3.addServiço(new Internet(17,26,600));
        c3.addServiço(new CaboTV(30,"150C"));
        //c3.addServiço(new VideoDemand(x));
        cliente3.addContrato(c3.clone());
        
        
      
        clientes.add(cliente1.clone());
        clientes.add(cliente2.clone());
        clientes.add(cliente3.clone());     
    }
    
    public boolean addCliente(String nome, String morada, String mail, int cod)  // Não pode ser adicionado um cliente com o email ou morada iguais aos de um já existente
    {
        for(int i=0;i<this.clientes.size();i++)
        {
            if(this.clientes.get(i).getEmail()==mail||(this.clientes.get(i).getNome()==nome)) 
                return false;
        }
        
        this.clientes.add(new Cliente(cod,nome,mail,morada));
        return true;
    }
    
    public List listaClientes()
    {
        List<String> l=new ArrayList<String>();
        
        for(int i=0;i<this.clientes.size();i++)
            l.add("\nNome: "+this.clientes.get(i).getNome()+ "\nMorada: "+this.clientes.get(i).getMorada()+"\nEmail: "+this.clientes.get(i).getEmail()+"\nNúmero de cliente: "+this.clientes.get(i).getCodcliente());
        
        return l;
    }
    
    public List listaServicos(Contrato c)
    {
        List<String> l=new ArrayList<String>();
        
        for(int i=0;i<c.getServiçoscont().size();i++)
            l.add(c.getServiçoscont().get(i).getClass().getName());
            
        return l;
    }
    
    public List listaCliServicos(Cliente c)
    {
        List<String> l=new ArrayList<String>();
        
        //for(int i=0;i<c.
        return l;
    }
}
