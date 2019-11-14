
/**
 * Rectangulos definidos pelo seu comprimento e largura.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
public class Rectangulo extends Forma {
  // variáveis de instância
  private double comp, larg;
  private int numLados;

  // construtores
  public Rectangulo() { comp=0.0; larg=0.0; numLados=4;}
  public Rectangulo(double c, double l) { comp=c; larg=l; }

  // métodos de instância
  public double area() { return comp*larg; }
  public double perimetro() { return 2*(comp+larg); }
  public int numLados() {return numLados;}
  // métodos particulares
  public double largura() { return larg; }
  public double comp() { return comp; }
 }

 