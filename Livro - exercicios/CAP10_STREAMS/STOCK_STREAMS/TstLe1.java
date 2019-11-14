

    import java.io.*;
    import java.util.*;
    import static java.lang.System.out;
    import static java.lang.Math.random;
    public class TstLe1 {
    // 
         
    public static void main(String args[]) {
    

    GregorianCalendar cal1 = new GregorianCalendar();
    Date d1 = cal1.getTime(); out.println(d1);
    // contar total de linhas
		String linha = ""; int contaL = 0;
		try {
				BufferedReader bin = 
				  new BufferedReader(new FileReader("fich551.txt"));
				while ( (linha = bin.readLine()) != null ) {
					contaL++;
				}
				bin.close();
		}
		catch(IOException e){ out.println(e.getMessage()); }
		out.println("Total de linhas: " + contaL);

    GregorianCalendar cal2 = new GregorianCalendar();
    long difMils = cal2.getTimeInMillis()-cal1.getTimeInMillis();
    long difSegs = (difMils/1000)%60;   
    out.println(contaL + " linhas em " + difMils + " ms");
    out.println("-----------------------------");
   }
 }
