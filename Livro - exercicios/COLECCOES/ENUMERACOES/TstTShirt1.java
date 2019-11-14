
/**
 * Write a description of class TstTShirt1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static java.lang.System.out;
public class TstTShirt1 {
	public static void main(String[] args) {
	for(TShirt t : TShirt.values())
			out.printf("Tamanho %s Preço %4.1f%n",t, t.getPreco());
}
    }
