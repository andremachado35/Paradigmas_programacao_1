
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
   public double base() { return base; }
   public double altura() { return altura; }
   public double hipotenusa() {
     return sqrt(pow(base, 2.0) + pow(altura, 2.0)) ;
   } 
   public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Triangulo = " + base + " altura " + altura);
       return sb.toString();
   }
   public Triangulo clone() {
       return new Triangulo(base, altura);
   }
 }

