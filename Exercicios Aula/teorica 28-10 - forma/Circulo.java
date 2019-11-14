import static java.lang.Math.PI;
public class Circulo extends Forma {
   
    private double raio;
    private int numLados;

  // construtores
  public Circulo() 
  { raio = 1.0 ; }
  public Circulo(double r) 
  { raio = (r <= 0.0 ? 1.0 : r);}
      // métodos de instância
  public double area() 
  { return PI*raio*raio;}
  public double perimetro() { return 2*PI*raio; }
  public int numLados() { return numLados; }
  // método particular
  public double raio() { return raio; }
 
  
    }
