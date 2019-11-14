
/**
 * Programa que usa inicializa um array de inteiros ordenado por
 * ordem crescente, determina qual o menor elemento do array e seu índice.
 * 
 * @author F. Mário Martins
 * @version 1.0/2005
 */
    public class ProgPesquisaBin {

    // ALGORITMO DE PESQUISA BINARIA (arrays não vazios)

      public static void main(String[] args) {
          
        // declara e inicializa os elementos de um array 
        int[] a = {0, 4, 8, 9, 21, 34, 45, 51, 57, 61, 70, 90, 93};
        
        int chave = 70; // valor que normalmente seria lido 
        int menor, meio, maior;
        boolean existe = false;
   
        menor = 0; maior = a.length-1; 
        
        // procurar sempre o índice médio destes indices
        do {
            meio = (menor + maior) / 2;
            if ( chave > a[meio] )
                 menor = meio + 1;
            else 
                 maior = meio - 1;
                  System.out.println(meio);
        }
        while( (a[meio] != chave) && (menor <= maior) );
        
        // encontrado ou não ??
        existe = (a[meio] == chave);
        if (!existe ) 
           System.out.println("N. " + chave + " nao existe !");
        else 
           System.out.println("N. " + chave + " no indice " + meio);
    }
 }
