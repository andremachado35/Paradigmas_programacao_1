    import java.io.*;
    import java.util.*;
    import static java.lang.System.out;
    
    public class TstLer2 {
    // 
    public static final int MAXPRODS = 100000;
    
    public static void main(String args[]) {
           
        HashSet<String> comps = new  HashSet<String>(); 
        HashSet<String> compsAux = new  HashSet<String>(); 
        HashMap<Integer, Produto> stockNovo = 
              new HashMap<Integer, Produto>();
        Produto prod = null;
    
    // GregorianCalendar c2 = new GregorianCalendar();
    // long difMils = c2.getTimeInMillis()-c1.getTimeInMillis();
    // long difSegs = (difMils/1000)%60;   
    // long difMins = difSegs/60;

   
       GregorianCalendar c1 = new GregorianCalendar();
 
      try {
             String lixo = "";
             String nom = ""; String cod = "";
             int qt, numc;
        DataInputStream din = 
            new DataInputStream( new FileInputStream("fich551.txt"));
        for(int f=1; f<=MAXPRODS; f++) {
          lixo = din.readUTF();
          cod = din.readUTF();
          nom = din.readUTF();
          qt = din.readInt();
          numc = din.readInt();
          for(int nc = 0; nc < numc; nc++) 
               comps.add(din.readUTF());          
          prod = new Produto(cod, nom, qt, comps); 
          stockNovo.put(Integer.valueOf(cod), prod);
          comps.clear(); prod = null;
        }
        din.close();
    }
    catch(IOException e) { System.out.println(e.getMessage()); }

        GregorianCalendar c2 = new GregorianCalendar();
        long difMils = c2.getTimeInMillis()-c1.getTimeInMillis();
        long difSegs = (difMils/1000)%60;   
        out.printf("%7d produtos lidos em %5d ms%n", 
                    stockNovo.size(), difMils);
    }
  }
