
/**
 * Programa de exemplificação de operações com tipos simples.
 * 
 * @author F. Mário Martins
 * @version (a version number or a date)
 */
import static java.lang.System.out;
public class ProgTiposSimples {

   public static void main(String[] args) {
   
    int dim1 = 20, lado, delta = 30;
    int x = 5, y = 10; 
    int a = x + y;
    char um = '1'; 
    char ch1 = 'A'; /* usando formato UNICODE, caracteres são ASCII compatíveis */
    char newline = '\n';
    /* char nl1 = '\u000a'; */
    char tab = '\u0009';
    byte b1 = 0x49 ;    /* hexadecimal, cf. 0x, de inicialização */
    long diametro;
    double raio = -1.7E+5; 
    double d;
    double j = .000000123;
    double pi = 3.14159273269;
    double aa = 1e6;
    double aa1 = -1.000456E-22;
    // casting
    int letra = 65;
    char c = (char) letra;
    out.println(c);

    int dim = 100;
    float area = 100*100;
    double vol = area*100;

    char c1, c2, c3 = '6', c4, c5, c6;
    int cx = 62, cy = 12;

    c1 = (char) (cx + cy) ;
    c2 = (char) ((int) c3 + 43);
    c3 = (char) ((int) c2 + 21);
    c4 = c2;
    c5 = (char) 53;
    c6 = (char) ((int) c5 - 20); 
    // System.out.printf("%c%c%c%c%c%c",c1, c2, c3, c4, c5, c6);
    int z=100, q;
    q = z<<1;
    int r = z>>2;
    System.out.printf("\n%5d%5d%5d\n",z, q, r);
    
    int soma = 0;
    for(int i=1; i < 11; i += 2) soma = soma + i;

    out.println(soma);


     int idade1 = 20; int idade2 = 22;
     String frase1 = "O Pedro tem " + idade1 + " anos";
     String frase2 = "A Rita tem " + idade2 + " anos";
     String decisao = idade2>idade1 ? "velha" : "nova";
     String frase3 = "Rita é mais " + decisao + " que Pedro"; 
   
     out.println(frase3);

    // testes de printf

    float f1 = 123.45f;
    double d2 = 234.678; double d3 = 12.45E-11;
    out.printf("R1 %5.2f R2 %3$-17.16f Exp1 %2$8.4e%n",f1, d2, d3);

    String[] lista = new String[20]; lista[3] = "abc";
    out.printf("%d%n Nova Linha !",lista.length);
   }
}
