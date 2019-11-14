
/**
 * Write a description of class TstDireccao1 here.
 * 
 * @author F. Mario Martins
 * @version 1.0
 */
	import static java.lang.System.out;
	public class TstDireccao1 {
		//
		public static void mostraDireccao(Direccao1 paraOndeVamos) {
			out.println("Vamos para " + paraOndeVamos.mostraDir());
		}
		//
		public static void main(String[] args) {
			Direccao1 vamosPara = Direccao1.Norte;
			// Direccao1 nordeste = "Oriente";
			// Direccao1 nordeste = new Direccao1("Oriente");
			mostraDireccao(vamosPara);
			vamosPara = Direccao1.Sul;
		    out.println("e agora para .. " + vamosPara.mostraDir());			
		}
	}

