/**
 * Write a description of class Movimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Movimento
{
 private GregorianCalendar data;
 private String desc;
 private double valor;
    
 /**
 * Constructor for objects of class Movimento
 */
 public Movimento(String d, double v, int dia, int mes, int ano)
 {
   this.data =  new GregorianCalendar (ano,mes,dia);
   this.desc = d;
   this.valor = v;
 }
    
 public Movimento(String d, double v, int dia)
 {
    this.data =  new GregorianCalendar (ano,mes,dia);
    this.desc = d;
    this.valor = v;
 }
    
 public double getValor()
 {return this.valor;}
    
 public String getDesc()
 {return this.desc;}
    
 public GregorianCalendar getData()
 {
     
 }   
}