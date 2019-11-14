public class Quadrado extends Forma {
  // variáveis de instância
  private double larg;
  private int numLados;

  // construtores
  public Quadrado() {  larg=0.0; numLados=4;}
  public Quadrado(double c, double l) { larg=c; larg=l; }

  // métodos de instância
  public double area() { return larg*larg; }
  public double perimetro() { return 2*(larg+larg); }
  public int numLados() {return numLados;}
  // métodos particulares
  public double largura() { return larg;}
 }

 