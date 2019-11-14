
/**
 * TstEmp: programa de teste de polimorfismo.
 * 
 * @author F. Mário Martins 
 * @version (a version number or a date)
 */
import static java.lang.System.out;
	public class TesteEmp {
	public static void main(String args[]) {

	    Empregado emp1, emp2, emp3; 
        emp1 = new Empregado("Joao", 20);
	    emp2 = new Gestor("Rui", 20, 2.2); 
        emp3 = new Motorista("Ze", 20, 1.2, 200);
	    out.println(emp1.getClass().getSimpleName() + " " + emp1.getNome() + " : " + emp1.salario());
	    out.println(emp2.getClass().getSimpleName() + " " + emp2.getNome() + " : " + emp2.salario());
	    out.println(emp3.getClass().getSimpleName() + " " + emp3.getNome() + " : " + emp3.salario());
        out.println("Bonus: " + ((Gestor)emp2).getBonus());
		out.println("Bonus: " + ((Motorista)emp3).getBonus());
   
  }
}
