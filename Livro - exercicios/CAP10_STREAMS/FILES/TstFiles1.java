
/**
 * Write a description of class TstFiles1 here.
 * 
 * @author F. M�rio Martins
 * @version (a version number or a date)
 */
import java.io.*;
import static java.lang.System.out;
public class TstFiles1 {
   public static void main(String[] args) {
       
 	 File f1 = new File("c:\\Temp\\file1.txt");
	 // f1 � o nome l�gico do ficheiro f�sico indicado.
	String nome = f1.getName();
	out.println(nome);
	String path = f1.getPath();
	out.println(path);
	boolean teste1 = f1.isFile(); 
	boolean teste2 =  f1.isDirectory();
	out.println(teste1); 
	out.println(teste2);
	long comp = f1.length();
	out.println(comp);
	f1.delete();

    // Caso a vari�vel f1 tivesse (cf. resultado do interrogador isDirectory()) sido associada a um direct�rio, ent�o as seguintes mensagens passariam igualmente a ter significado,
	//String[] files = new String[200];
	//files = f1.list(); // lista ficheiros do direct�rio
	// boolean res = f1.renameTo(new File("c:\jdk\Testes")); 
      }	
}
