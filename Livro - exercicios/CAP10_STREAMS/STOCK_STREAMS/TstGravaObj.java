 

  import java.io.*;
  import java.util.*;
  import static java.lang.System.out;
  import static java.lang.Math.random;
    //
  public class TstGravaObj {

    private static final int MAXPRODS = 100000;
        
    public static HashMap<Integer,Produto> criaFichas() {
         HashMap<Integer, Produto> stk = new HashMap<Integer, Produto>();
         HashSet<String> comps = new HashSet<String>();
         int c = 0;
         Produto p = null;
         for(int i = 1; i <= MAXPRODS; i++) {
           c = 0 + (int) (random()*5); //nº de componentes 0 .. c
           if (c > 0) 
             for(int n = 1; n <= c; n++) {               
                comps.add("CMP" + i%99 + n); }           
           p = new Produto("" + i, "PROD" + i%99 , 1 + (int)(random()*1000),
                        comps); 
          stk.put(i, p.clone());
          comps.clear();
        }
        return stk;
     }
         
    public static void main(String args[]) {         
      HashSet<String> comps = new  HashSet<String>();   
      HashMap<Integer, Produto> stock = 
          new HashMap<Integer, Produto>();
      stock = criaFichas(); // cria as MAXPRODS fichas      
      GregorianCalendar c1 = new GregorianCalendar();     
      GregorianCalendar c2 = new GregorianCalendar();
      long difMils = c2.getTimeInMillis()-c1.getTimeInMillis();
      long difSegs = (difMils/1000)%60;   
      long difMins = difSegs/60;
      out.println("MAXPRODS = " + MAXPRODS);
      out.println("HASH SIZE = " + stock.size());
      out.println("CRIAÇÃO: " + difSegs + "s e " + difMils%1000);    
      out.println("VOU GRAVAR !!"); 
      GregorianCalendar cal1 = new GregorianCalendar();
      Date d1 = cal1.getTime(); out.println(d1);
      		// Grava Stock num ObjectStream
	try {
       ObjectOutputStream oout =
        new ObjectOutputStream(new FileOutputStream("Stock.dat"));
          oout.writeObject(stock);
       oout.flush(); oout.close();
		}
		catch(IOException e) 
		{ System.out.println(e.getMessage()); }
      
       GregorianCalendar cal2 = new GregorianCalendar();
       difMils = cal2.getTimeInMillis()-cal1.getTimeInMillis();
       difSegs = (difMils/1000)%60;   
       difMins = difSegs/60;
       out.println(stock.size() + " fichas em " + difMils + " ms");
       out.println("-----------------------------");
    }
  }
