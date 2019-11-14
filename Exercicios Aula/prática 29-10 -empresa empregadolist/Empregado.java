public abstract class Empregado
{
    // instance variables - replace the example below with your own
    private int codigo;
    private String nome;
    private int dias;
    public static double saldia;
    
    
    public Empregado(String nome, int dias, int codigo, double saldia)
    {
        // initialise instance variables
        this.codigo = codigo;
        this.nome = nome;
        this.dias = dias;
        this.saldia = saldia;
    }
    
    public int getCodigo()
    { return this.codigo; }
    
    public String getNome()
    { return this.nome; }
    
    public int getDias()
    { return this.dias;}
    
    public double getSaldia()
    { return this.saldia; }
    
    

    }
