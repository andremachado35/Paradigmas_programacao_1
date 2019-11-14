
/**
 * Write a description of class TstBanco here.
 * 
 * @author F. M�rio Martins
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
import static java.lang.System.out;
public class TstBanco {
	public static void main(String[] args) {
	    GregorianCalendar c = new GregorianCalendar();
	    Conta[] contas = new Conta[20];
	    Scanner input = new Scanner(System.in);
	    for(int i=0; i<=19;i++) {
	       c.set(2000+i%6, i%11, i%5);
	       contas[i] = new Conta("Ct"+i, "Java5-"+i%15, (i+1)*2100%1210, c, c);
	    }
	    
	    /*
	    for(int i=0; i<=19;i++)
	      out.println(contas[i].toString()); 
	    */
	      
	   // Insere as contas no Banco
	   
	   Banco meuBanco = new Banco("FMM");
	   for(int i=0; i<=19; i++) 
	      meuBanco.criaConta(contas[i]);
	      
	   out.println("N� de contas: " + meuBanco.numContas());
	   
	   ArrayList<String> codigos = new ArrayList<String>();
	   codigos = meuBanco.listaNumeros();
	  
	   out.println("------- Contas --------");
	   for(String num : codigos) 
	     out.println(meuBanco.daConta(num));
	  
	   /*
	   // Contas com mais de X euros de saldo
	   HashSet<String> cts = new HashSet<String>();
	   out.print("Contas com saldo > que: ");
	   int valor = input.nextInt(); 
	   cts = meuBanco.codCtSldMaiorQue(valor);
	   out.printf("------- Contas Saldo > %d --------%n", valor);
	   for(String numc : cts) 
	      out.println(meuBanco.daConta(numc).toString());
	   out.print("<c> para continuar");
	   String txt = input.next();
	   // Contas paradas ha mais de um ano
	   cts.clear();
	   cts = meuBanco.contasParadas();
	   out.println("------- Contas Paradas --------");
	   for(String num : cts)
	      out.println(meuBanco.daConta(num).toString());
	   
	   // Consulta conta
	   out.print("Conta N.: ");
	   String numc = input.next(); 
	   out.println(meuBanco.daConta(numc).toString());  */
	   
	   meuBanco.levantamento("Ct3", 140.00);
	   out.println(meuBanco.daConta("Ct3").toString());
	   out.println();out.println();out.println();
	   // 
	   out.println("----- SALDOS POR TITULAR ----------\n");
	   HashMap<String, Double> tt = new HashMap<String, Double>();
	   tt = meuBanco.totalTitular();
	   for(String nm : tt.keySet()) {
	     out.print("Titular: " + nm + "\tSaldo Total = ");
	     out.printf("%10.2f%n", tt.get(nm)); }
	   
	   TreeMap<String, Double> tcts = new TreeMap<String, Double>(tt);
	   for(String ntit : tcts.keySet()) out.println(ntit);
    }
}