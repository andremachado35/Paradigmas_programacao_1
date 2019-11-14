
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo extends Forma {
  // variáveis de instância
  private double comp, larg;

  // construtores
  public Rectangulo() { comp=0.0; larg=0.0; }
  public Rectangulo(double c, double l) { comp=c; larg=l; }

  // métodos de instância
  public double area() { return comp*larg; }
  public double perimetro() { return 2*(comp+larg); }
  public double largura() { return larg; }
  public double comp() { return comp; }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Rectangulo = " + comp + " largura " + larg);
    return sb.toString();
  }
  public Rectangulo clone() {
      return new Rectangulo(comp, larg);
  }
}

 