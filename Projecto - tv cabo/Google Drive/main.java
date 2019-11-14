import java.util.*;
public class main
{   
    
    public static void main(String []args)
   {
        Teo corp=new Teo();
        String opçao="";
        Scanner input = new Scanner(System.in);
        
        
       while(opçao!="S"||opçao!="s")
       {   
         System.out.println("TEO\n");
         System.out.println("Escolha uma das seguintes opções:\n");
         System.out.println("1 - Adicionar cliente");
         System.out.println("2 - Adicionar contrato a um cliente");
         System.out.println("3 - Adicionar serviço a um contrato de um cliente");
         System.out.println("4 - Lista dos serviços de um contrato");
         System.out.println("5 - Lista de todos os serviços de um cliente");
         System.out.println("6 - Lista de todas as informaçoes dos clientes");
         System.out.println("7 - Lista de todos os contratos de um cliente");
         System.out.println("8 - Emitir uma factura de um cliente");
         System.out.println("9 - Alterar os preços de serviços na tabela de preços");
         System.out.println("A - Adicionar um aluguer de um filme no serviço ");
         System.out.println("B - Adicionar um novo canal pago ao serviço de cabo");
         System.out.println("C - Identificar o cliente que mais gastou com o serviço \"Video on Demand\"");
         System.out.println("D - Lista de contratos com serviços downloadable");
         System.out.println("E - Lista de clientes com contrato de telefone fixo");
         System.out.println("S - Sair");
            
         opçao=input.next();
         System.out.println("");
    
       
         switch(opçao)
          {
              case "1":
              case "2":
              case "3":
              case "4":getSercont(corp);break;
              case "5":getSercli(corp);break;
              case "6":getClientes(corp); break;
              case "7":
              case "8":
              case "9":
              case "A":
              case "a": 
              case "B":
              case "b":
              case "C":
              case "c":
              case "D":
              case "d":
              case "E":
              case "e":
              case "s":System.exit(0);
              case "S":System.exit(0); 
            }
            
         System.exit(0);
       }
    }

    public static void getClientes(Teo corp)
    {
        for(int i=0;i<corp.listaClientes().size();i++)
            System.out.println(corp.listaClientes().get(i)); 
    }
    
    public static void getSercont(Teo corp)
    {
        for (int i=0;i<corp.listaServicos().size();i++)
            System.out.println(corp.listaServicos.size().get(i));
    }
    
    public static void getSercli(Teo corp)
    {
        for (int i=0;i<corp.listaCliServicos().size();i++)
            System.out.println(copr.listaCliServicos.size().get(i));
    }
    
    


  }
