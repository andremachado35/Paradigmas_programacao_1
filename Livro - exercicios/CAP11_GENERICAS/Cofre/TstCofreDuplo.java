
/**
 * Write a description of class TstCofreDuplo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static java.lang.System.out;
public class TstCofreDuplo {
  public static void main(String[] args) {
	CofreDuplo<String> cofreDstr1 = new CofreDuplo<String>();
	cofreDstr1.guarda("Cartao ", "Codigo ");

	CofreDuplo<String> cofreDstr2 = 
				new CofreDuplo<String>("CVisa","9190");
	//
	String f1 = cofreDstr1.primeiro() + cofreDstr2.primeiro();
	String f2 = cofreDstr1.segundo() + cofreDstr2.segundo();
	out.println(f1 + " " + f2);

    // OK !
    Cofre<String> cfStr = new CofreDuplo<String>("abc", "def");
    out.println(cfStr.consulta());
    // KO !!
	// Cofre<String> cfStr1 = new CofreDuplo<Integer>(10, 20);
	
	cofreDstr2.copiaCofre(new CofreDuplo<String>("abc", "def"));
	
    Cofre<String> cStr = new Cofre<String>("bom dia.");
	CofreDuplo<String> cDStr = new CofreDuplo<String>("re", "mi");
	out.println(cStr.getClass().getSimpleName());
	out.println(cDStr.getClass().getSimpleName());
	
	Cofre<Integer> cInt = new Cofre<Integer>(999);
	out.println(cInt.getClass().getSimpleName());
	// out.println(cInt instanceof Cofre<Integer>);

    Cofre<?> cQq = new Cofre<Integer>(234);
    out.println(cQq.consulta());
	
	
	
	
 } 	
}
