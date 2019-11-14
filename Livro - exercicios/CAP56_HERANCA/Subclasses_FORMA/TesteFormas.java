/**
 * Testes diversos com a classe abstracta Forma e suas subclasses. 
 * Exemplos de polimorfismo e de dynamic method lookup.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */

	import static java.lang.System.out;;
	public class TesteFormas {

		public static void main(String[] args) {
            int numFormas = 0;
			Forma[] formas = new Forma[100];
			//. . .
			formas[0] = new Rectangulo(10.0, 6.0);
		    formas[1] = new Circulo(2.5);
			formas[2] = new Rectangulo(5.0, 8.0);
			formas[3] = new Triangulo(10.0, 4.0);
			formas[4] = new Rectangulo(10.2, 6.8);
			formas[5] = new Circulo(8.0);
			numFormas = 6;

			/* calcula o somatório das áreas e dos perímetros
			   das várias formas inseridas no array.
			*/
			double areaTotal = 0.0;  
			double perimTotal = 0.0;
			for(int i=0; i < numFormas ; i++) {
				  areaTotal += formas[i].area();
				  perimTotal += formas[i].perimetro();
			}
			out.printf("Cm2 das Formas = %5.2f\n", areaTotal);
			out.printf("Perim. das Formas = %5.2f\n", perimTotal);
       }
    }



