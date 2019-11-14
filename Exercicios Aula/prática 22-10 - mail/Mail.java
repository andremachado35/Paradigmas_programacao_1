
/**
 * Write a description of class Mail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.GregorianCalendar;
import java.util.*;
public class Mail
{
    // instance variables - replace the example below with your own
    
    private String endereco;
    private GregorianCalendar dataev;
    private GregorianCalendar datare;
    private String assunto;
    private String texto;

    /**
     * Constructor for objects of class Mail
     */
    public Mail(String endereco, GregorianCalendar dataev, GregorianCalendar datare, String assunto, String texto)
    {
        // initialise instance variables
        this.endereco = endereco;
        this.dataev = new GregorianCalendar();
        this.datare = new GregorianCalendar();
        this.assunto = assunto;
        this.texto = texto;
   
    }

    public String getEndereco()
    {return this.endereco;}
    
    public GregorianCalendar getDataev() 
    {return this.dataev;}
    
    public GregorianCalendar getDatare() 
    {return this.datare;}
    
    public String getAssunto()
    {return this.assunto;}
    
    public String getTexto()
    {return this.texto;}
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public int totalmails(){
    
        int tam = Mail.size();
    }
    
    
  
}
