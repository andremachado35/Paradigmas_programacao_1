
/**
 * Concatenação e Arrays de String
 * 
 * @author F. Mário Martins 
 * @version (a version number or a date)
 */
public class TstArraysStrings {
  public static void main(String[] args) {
		String[][] nomes = { {"Rita", null, "Eva"}, {"Ana", "Lia", "Sa"},
				{"Pedro"}, {}, {"Rui"}, {"Fu", "Chi", "Li"} };
		String sfinal = "";
		System.out.println(nomes.length);
		
		// concatenação 1
		for(int l = 0; l < nomes.length; l++) {
		    for(int c = 0; c < nomes[l].length; c++)
			      sfinal += nomes[l][c];
        }  
        System.out.println(sfinal);
        sfinal = "";
        
        // concatenação 2
        for(String[] lnomes : nomes) {
          for(String nome : lnomes)  sfinal += nome;
        }
         System.out.println("2 " + sfinal);
        
    }		
}

