		public class Prog2 {

		// ALGORITMO DE PESQUISA BINARIA (arrays n�o vazios)

		public static void main(String[] args) {
			// declara e inicializa os elementos de um array 

			int[] a = {0, 4, 8, 9, 21, 34, 45, 57, 51, 61, 70, 90, 93};
			int chave = 70; // valor normalmente lido 
			int menor, meio, maior;
			boolean existe = false;
   
			menor = 0; maior = a.length-1; 
			// procurar sempre o �ndice m�dio destes indices

			do {
				meio = (menor + maior) / 2;
				if ( chave > a[meio] )
				  menor = meio + 1;
				else 
				  maior = meio - 1;
				  System.out.println(meio);
			}
			while( (a[meio] != chave) && (menor <= maior) );
			// encontrado ou n�o ??
			existe = (a[meio] == chave);
			if (!existe ) 
			  System.out.println("N. " + chave + " nao existe !");
			else 
			System.out.println("N. " + chave + " no indice " + meio);
		}
}
