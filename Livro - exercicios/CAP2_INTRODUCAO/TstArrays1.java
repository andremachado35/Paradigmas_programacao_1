
/**
 * Programa que inicializa um array de inteiros e determina
 * o menor elemento e respectiva posicao.
 * 
 * @author F. Mário Martins
 * @version 1.0/2005
 */
import static java.lang.System.out;
public class TstArrays1 {

  public static void main(String[] args) {
     // declara e inicializa o array de trabalho
     int[] lista = { 128, -2, 245, 616, 77, 213 };
     
     // determinação do menor em array não vazio !
     int min = lista[0]; // menor inicial
     int pos = 0; // posicão do menor actual
     
     for(int i = 1; i < lista.length; i++)
      if (lista[i] < min) { min = lista[i]; pos = i; }
      
     // resultados
     out.println("Menor = " + min);
     out.println("Indice = " + pos);
  } 
}
