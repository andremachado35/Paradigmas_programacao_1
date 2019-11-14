   import java.io.*;
    import java.util.*;
    import static java.lang.System.out;
    
    public class TstLeObj {
    // 
    public static final int MAXPRODS = 100000;
    
    public static void main(String args[]) {
           
        HashSet<String> comps = new  HashSet<String>(); 
        HashSet<String> compsAux = new  HashSet<String>(); 
        HashMap<Integer, Produto> stockNovo = 
              new HashMap<Integer, Produto>();
        Produto prod = null;
 
       GregorianCalendar c1 = new GregorianCalendar();
 
  		try {
       ObjectInputStream oin =
         new ObjectInputStream(new FileInputStream("Stock.dat"));
			stockNovo = (HashMap<Integer, Produto>) oin.readObject();
			// warning inevitavel Object -> HashMap<>
       oin.close();
      }
     catch(IOException e)
       { System.out.println(e.getMessage()); }
     catch(ClassNotFoundException e)
       { System.out.println(e.getMessage()); }


        GregorianCalendar c2 = new GregorianCalendar();
        long difMils = c2.getTimeInMillis()-c1.getTimeInMillis();
        long difSegs = (difMils/1000)%60;   
        out.printf("%7d produtos lidos em %5d ms%n", 
                    stockNovo.size(), difMils);
    }
  }
