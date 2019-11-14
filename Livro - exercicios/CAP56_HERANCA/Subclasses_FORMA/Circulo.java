/**
 * 
 * Classe que representa c�rculos sem posi��o definida, e apenas
 * representados pelo seu raio.
 * 
 * @author F. M�rio Martins
 * @version (version number or date here)
 */

import static java.lang.Math.PI;
public class Circulo extends Forma {
  //
  private double raio;

  // construtores
  public Circulo() { raio = 1.0 ; }
  public Circulo(double r) { raio = (r <= 0.0 ? 1.0 : r); }

  // m�todos de inst�ncia
  public double area() { return PI*raio*raio; }
  public double perimetro() { return 2*PI*raio; }
  // m�todo particular
  public double raio() { return raio; }
 }
