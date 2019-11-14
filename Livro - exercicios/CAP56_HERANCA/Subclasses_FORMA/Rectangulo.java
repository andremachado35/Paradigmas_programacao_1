
/**
 * Rectangulos definidos pelo seu comprimento e largura.
 * 
 * @author F. M�rio Martins
 * @version (a version number or a date)
 */
public class Rectangulo extends Forma {
  // vari�veis de inst�ncia
  private double comp, larg;

  // construtores
  public Rectangulo() { comp=0.0; larg=0.0; }
  public Rectangulo(double c, double l) { comp=c; larg=l; }

  // m�todos de inst�ncia
  public double area() { return comp*larg; }
  public double perimetro() { return 2*(comp+larg); }
  // m�todos particulares
  public double largura() { return larg; }
  public double comp() { return comp; }
 }

 