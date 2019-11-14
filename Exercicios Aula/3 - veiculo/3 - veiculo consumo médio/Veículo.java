
/**
 * Write a description of class Veículo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Veículo
{
    // instance variables - replace the example below with your own
    private String matricula;
    private double km, v;
    private double deposito;
    private double consumo,euros;
    private double kmposs;
    private double aux;
    private double k = 0;
    private double custo;
    private double a;
    private double cdeposito;
    /**
     * Constructor for objects of class Veículo
     */
   
    
    public Veículo(String matricula, double km, double deposito, double consumo, double cdeposito)
    {
        // initialise instance variables
          this.matricula = matricula;
          this.km = km;
          this.deposito = deposito;
          this.consumo = consumo;
          this.cdeposito = cdeposito;
}
        
    public String getmatricula()
{ return this.matricula;}
    
    public double getkm()
    { return this.km;}
    
    public double getdeposito()
    { return this.deposito;}
    
    public double getconsumo()
    { return this.consumo;}

    public double distancia()
{
    aux = consumo * 100;
    kmposs=aux/deposito;
    return kmposs;
}
    
    public double actkm(double k)
{
    this.k = k;
    this.km = km + k;
    v = (consumo*k)/100;
    this.deposito = deposito - v;
    return km;
}
    

    public double euros (double custo) 
    {
       euros=custo*deposito;
       return euros;
 }  

 public boolean reserva(double deposito) 
   {
       if(this.v<=10)
        return true;
       else
        return false;
    }
    
public boolean atestar (double a)
   {    
    this.a = a;
    this.deposito = deposito + a;
     
       if (this.deposito > cdeposito)
          return false;
       else
          return true;
   
}
}
