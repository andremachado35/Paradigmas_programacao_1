
/**
 * Write a description of class TstEmpresa here.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
import static java.lang.System.out;
public class TstEmpresa {
 public static void main(String[] args) {
        Empregado[] empresa = new Empregado[10];
        for(int i=0; i<10;i++) empresa[i]=null;
        Motorista[] motos = new Motorista[3];
        motos[0] = new Motorista("Ze", 20, 1.2, 210);
        motos[1] = new Motorista("Rui", 22, 1.1, 180);
        motos[2] = new Motorista("Joca", 20, 1.2, 220);
       
        int numEmp;
        //
        
	    empresa[0] = new Empregado("Joao", 20);
		empresa[1] = new Gestor("Rui", 20, 2.2); 
		empresa[2] = new Motorista("Ze", 20, 1.2, 200);
		System.arraycopy(motos,0,empresa,3,3);
		numEmp = 6; 
        double totVenc = 0.0;  
        for(int i=0; i < numEmp ; i++) {
            out.println(empresa[i].getNome());
	     totVenc += empresa[i].salario();
	     }
	     out.println("Total de Vencimentos = " + totVenc);

    }
}
