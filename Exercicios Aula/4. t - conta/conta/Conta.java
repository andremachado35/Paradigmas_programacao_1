
/**
 * Write a description of class Conta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conta
{
   private static final int MAXPOS = 100;
   private static int num = 0;
   public static int getnum()
   { return num;}
   
   
    // instance variables - replace the example below with your own
    private String titular;
    private int nc;
    private double saldo;
    private double movs[];
    private int index;
    /**
     * Constructor for objects of class Conta
     */
    public Conta(String t, double saldoinit)
    {
     this.titular = t;
     this.nc = ++Conta.num;
     this.saldo = saldoinit;
     this.movs = new double [MAXPOS];
     this.index=0;
    }

   public String getTitular()
    { return this.titular;}
    
   public double getSaldo()
   { return this.saldo;}
   
   public int getNC()
   { return this.nc;}
   
   public void credito(double v)
   {
       this.saldo += v;
       this.movs[index++] = v;
    }
    
   public boolean debito(double v) 
   {
       if(this.saldo - v >= 0)
            {
                this.saldo -= v;
                this.movs[index++] = -v;
                return true;
            }
            else 
                return false;
                
    }
   
    public double[] getMovs ()
    {
        double temp[] = new double [this.movs.length];
        for(int i=0; i<this.movs.length;i++)
            temp[i] = this.movs[i];
            return temp;

        }
    }
    