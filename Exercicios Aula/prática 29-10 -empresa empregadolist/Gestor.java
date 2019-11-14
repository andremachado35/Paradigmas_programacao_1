
/**
 * Write a description of class Gestor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gestor extends Empregado
{
    // instance variables - replace the example below with your own
 public int codigo, dias, taxa;
 public String nome;
    // instance variables - replace the  example below with your own
 public int codigo(){ return codigo;}
 public String nome() {return nome;}
 public int dias() {return dias;}
 
 public Gestor()
 {
     this.taxa=taxa;
   }
 
public double salario()
    {return salario*taxa;}
    
}

