import java.util.*;
public class Capital extends Prazo
{
 private ArrayList<Movimento>movs;
    
 public Capital(String t, double s, int p, double ta)
 {
        super(t,s,p,ta);
        this.movs = new ArrayList<Mov>();
 }
    
 public boolean debito(double valor, String d, int ano, int mes, int dia)
 {
   if (this.getSaldo - valor >0)
     {
       Mov m = new Mov(d,-valor,ano,mes,dia);
       this.movs.add(m);
       this.setSaldo(this.getSaldo()-valor);
       return true;
      }
   else 
       return false;
 }
    
 public void debito (double valor, String d, int ano, int mes, int dia)
 {
   Mov m = new Mov(d,valor,ano,mes,dia);
   this.move.add(m);
   this.setSaldo(this.getSaldo()+valor);
 }
}