
/**
 * Classe de teste de ArvBin<E>
 * 
 * @author F: Mário Martins
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.out;
public class TstArvBin {
	public static ArvBin<String> main(String[] args) {
	    ArvBin<String> ab = new ArvBin<String>();
	    ab.add("jba"); ab.add("fsm"); ab.add("anr");
	    ab.add("ob"); ab.add("fmm"); ab.add("jfc");
	    ab.add("prh"); ab.add("jbb"); ab.add("jja");
	    int comp = ab.size();
	    out.println(comp);
	    int d = ab.dimDireita();
	    int e = ab.dimEsquerda();
	    out.println("Dir: " + d + " Raiz: " + ab.getRaiz() + " Esq: " + e);
	    out.println("Maior: " + ab.maior());
	    out.println("Menor: " + ab.menor());
	    
	    //
	    //Iterator<String> its = ab.iterator();
	    //while(its.hasNext()) out.println(its.next());
	    for(String s : ab) out.println(s);
	    //for(String s : ab)  out.println(s);
	    //List<String> l = ab.arvParaLista();
	    //for(String s : l) out.println(s);
	    List<String> lad = new ArrayList<String>();
	    lad.add("mmm"); lad.add("hen"); lad.add("zxx"); 
	    ab.addAll(lad);
	    out.println("--- apos ADDALL ---");
	    for(String s : ab) out.println(s);
	    out.println(ab.toString());
	    Class[] inters = ab.getClass().getInterfaces();
	    for(Class c : inters) out.println(c);
	    return ab;


	}
}
