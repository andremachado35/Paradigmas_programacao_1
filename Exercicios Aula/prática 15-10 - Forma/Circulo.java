
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static java.lang.Math.PI;
public class Circulo extends Forma {
  //
  private double raio;

  // construtores
  public Circulo() { raio = 1.0 ; }
  public Circulo(double r) { raio = (r <= 0.0 ? 1.0 : r); }

  // métodos de instância
  public double area() { return PI*raio*raio; }
  public double perimetro() { return 2*PI*raio; }
  // método particular
  public double raio() { return raio; }
 }


    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
