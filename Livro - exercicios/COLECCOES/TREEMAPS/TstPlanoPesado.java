
/**
 * Write a description of class TstPlanoPesado here.
 * 
 * @author FMM
 * @version 1/2006
 */
import static java.lang.System.out;
public class TstPlanoPesado {
	public static void main(String[] args) {
	    PlanoPesado plano = new PlanoPesado();
	    plano.juntaPonto(new Ponto(-7,5), 3);
	    plano.juntaPonto(new Ponto(7,15), -2);
	    plano.juntaPonto(new Ponto(-1,6), 4);
	    plano.juntaPonto(new Ponto(-2,0), 2);
	    plano.juntaPonto(new Ponto(0,0), 3);
	    plano.juntaPonto(new Ponto(-1,2), -1);
	    plano.juntaPonto(new Ponto(7,0), 2);
	    out.println("------- HASHSET ------------");
	     for(Ponto p : plano.chaves())
	      out.println(p);
	    out.println("------- TREESET ------------");
	    for(Ponto p : plano.dom())
	      out.println(p);
	    
    }
}