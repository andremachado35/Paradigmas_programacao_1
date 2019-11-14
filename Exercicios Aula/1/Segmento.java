
/**
 * Write a description of class Segmento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segmento
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Segmento
     */
    public Segmento()
    {
        // initialise instance variables
        this.p1 = new Ponto(0,0);
        this.p2 = new Ponto(1,1);
        
    }
    
    public Segmento(Ponto x, Ponto y)
    { this.p1 = x.clone();
      this.p2 = y.clone();  
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Ponto getP1()
    { return this.p1.clone();}
    
    public Ponto getP2()
    { return this.p2.clone();}
    
    public double comprimento()
    {
        // put your code here
        return Math.sqrt(Math.pow(this.p1,getX()-this.p2.getX(),2)+Math.pow(this.p1.getY()-this.p2.getY(),2));
    }
    public double declive() 
    {return (this.p1.getY()-this.p2.getY())/(this.p1.getX()-this.p2.getX());}
    
    public string sentido()
    {if(this.declive()> 0.0)
        return "SOBE";
      else
        return "DESCE";
    }
    
        public Segmento clone() 
        {return new Segmento(this.p1,this.p2);}
        
       public String toString()
       { return this.p1.toString() + this.p2.toString();}
       
       public boolan equals (Segmento s)
       { if(s1= null)
           {
           if(s.getP1().equals(this.p1) && s.getP2().equals(this.p2))
            return true;
           else
            return false;
        }
           else 
           return false;
        
        }}
