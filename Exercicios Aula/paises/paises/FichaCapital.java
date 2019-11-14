
/**
 * Write a description of class FichaCapital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FichaCapital
{
    // instance variables - replace the example below with your own
    private String nome;
    private long pop;
    private long veiculos;
    private double salario;
    private double custo;

    /**
     * Constructor for objects of class FichaCapital
     */
    public FichaCapital(String n, long p, long v, double s, double c)
    {
        this.nome = n; this.pop = p; this.veiculos = v; this.salario =s;
        this.custo = c;
       
    }

    public FichaCapital(FichaCapital f)
    {
        this(f.getNome(),f.getPop(),f.getVeiculos(),f.getSalario(),f.getCusto());
    }
    
    public String getNome()
    { return this.nome;}
    public long getPop()
    { return this.pop;}
    public void setPop(long p)
    { this.pop = p;}
    public long getVeiculos()
    { return this.veiculos;}
    public double getSalario()
    { return this.salario;}
    public double getCusto()
    { return this.custo;}
    
    
    public FichaCapital clone()
    { return new FichaCapital(this); }
    
}
