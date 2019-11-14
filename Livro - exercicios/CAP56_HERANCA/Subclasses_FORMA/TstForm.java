
/**
 * Testes diversos com a classe abstracta Forma e suas subclasses. 
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
 public class TstForm {

  public static void main(String args[]) {
   Forma[] formas = new Forma[20];
   
   formas[1] = new Triangulo(2.0, 6.0);
   formas[2] = new Rectangulo(2.0, 13.0);
   formas[3] = new Circulo(3.0);

   System.out.println(formas[1].getClass().getSimpleName());
   System.out.println(formas[2].getClass().getSimpleName());
   System.out.println(formas[3].getClass());

    System.out.println("---------- TRIANGULO ----------");
    System.out.println(formas[1].area());
    System.out.println(formas[1].perimetro());

    System.out.println("---------- RECTANGULO ----------");
    System.out.println(formas[2].area());
    System.out.println(formas[2].perimetro());

    System.out.println("---------- CIRCULO ----------");
    System.out.println(formas[3].area());
    System.out.println(formas[3].perimetro());
}
}

