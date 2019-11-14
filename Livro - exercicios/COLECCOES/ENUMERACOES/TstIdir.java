
/**
 * Write a description of class TstIDir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    import static java.lang.System.out;
    public class TstIdir {
        //
        public static void mostraDireccao(int paraOndeVamos) {
            out.println("Vamos para " + paraOndeVamos);
        }
        
        public static void mostraDireccao1(int paraOndeVamos) {
            switch(paraOndeVamos) {
                case 1 :
                case 2 :
                case 3 : 
                case 4 : out.println("Vamos para " + paraOndeVamos); break;
                default : out.println("Direccao Errada !");
            }
        }
        
        public static void mostraDireccao2(int paraOndeVamos) {
			switch(paraOndeVamos) {
				case 1 : out.println("Vamos para Norte."); break;
				case 2 : out.println("Vamos para Sul."); break;
				case 3: out.println("Vamos para Este"); break;
				case 4 : out.println("Vamos para Oeste"); break;
				default : out.println("Direccao Errada !");
			}
		}

        

        public static void main(String[] args) {
            //
            int vamosPara = IDireccao.Norte;
            int nordeste = 6;
            mostraDireccao(vamosPara);
            mostraDireccao(nordeste);
            mostraDireccao1(vamosPara);
            mostraDireccao1(nordeste);
            mostraDireccao2(vamosPara);
            mostraDireccao2(nordeste);
        }
    }

