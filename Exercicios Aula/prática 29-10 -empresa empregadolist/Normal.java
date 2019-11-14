
/**
 * Write a description of class Normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normal extends Empregados
{
 public int codigo, dias;
 public String nome;
 public double SalDia;

    
 public double getSalDia() { return SalDia;}
 
 public Normal (double SalDia)
 {this.SalDia = SalDia;}
 
    // instance variables - replace the  example below with your own
 public int codigo(){ return codigo;}
 public String nome() {return nome;}
 public int dias() {return dias;}
}
