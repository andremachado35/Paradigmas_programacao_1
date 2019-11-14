/**
 * Classe Triangulo - que representa tri�ngulos definidos pela sua base e
 * pela sua altura.
 * 
 * @author F. M�rio Martins
 * @version (version number or date here)
 */

 import static java.lang.Math.*;
 public class Triangulo extends Forma {
   // vari�veis de inst�ncia
   private double base, altura;
   // construtores
   public Triangulo() { base=0.0; altura=0.0; }
   public Triangulo(double b, double a) { 
       base =b; altura = a; 
   }
   // m�todos de inst�ncia
   public double area() { return base*altura/2; }
   public double perimetro() { 
      return base+altura+this.hipotenusa(); }
   // m�todos particulares
   public double base() { return base; }
   public double altura() { return altura; }
   public double hipotenusa() {
     return sqrt(pow(base, 2.0) + pow(altura, 2.0)) ; 
   }
 }
