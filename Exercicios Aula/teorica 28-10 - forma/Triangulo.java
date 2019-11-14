/**
 * Classe Triangulo - que representa triângulos definidos pela sua base e
 * pela sua altura.
 * 
 * @author F. Mário Martins
 * @version (version number or date here)
 */

 import static java.lang.Math.*;
 public class Triangulo extends Forma {
   // variáveis de instância
   private double base, altura;
   private int numLados;
   // construtores
   public Triangulo() { base=0.0; altura=0.0; numLados=3; }
   public Triangulo(double b, double a) { 
       base =b; altura = a; 
   }
   // métodos de instância
   public double area() { return base*altura/2; }
   public double perimetro() { 
      return base+altura+this.hipotenusa(); }
   public int numLados(){ return numLados; }
   // métodos particulares
   public double base() { return base; }
   public double altura() { return altura; }
   public double hipotenusa() {
     return sqrt(pow(base, 2.0) + pow(altura, 2.0)) ; 
   }
 }
