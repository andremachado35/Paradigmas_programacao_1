/**
 * CollectionTester: Classe que testa operações de inserção,
 * enumeração e remoção usando diferentes Collections de JAVA.
 * 
 * @author F. Mário Martins 
 * @version 1.0/11/04/04
 */
import java.util.*;
import static java.lang.System.out;
import java.io.*;
  public class CollectionTester2 {
      
    public static String tmpv, tmpal, tmphs, tmpts, tmplkl, tmphm, tmptm;   
    public static final int DIM = 1200000; 
    public static final int CHAVE = DIM/2;  
    public static final int BLUFF = DIM/2+1;  
    
   
     //--------------------------------------------------------------
     
     public static String[] testVector() {
        Vector<Integer> v = new Vector<Integer>();
        Cronometro crono = new Cronometro();
        int i; boolean found;
        String[] tmpal = new String[6];
        
        // inserção       
        crono.on();
        for(int k = 0; k < DIM; k++) {
            v.add(new Integer(2*k));
        }
        crono.off(); 
        tmpal[0] = crono.textSeeMilis();
        
        // inserção       
        crono.on();
        for(int k = 0; k < DIM; k++) {
            v.add(2*k);
        }
        crono.off(); 
        tmpal[1] = crono.textSeeMilis();
       
       //        
        i = 0; found = false;
        crono.on();
        while(i< v.size() && (!found)) {
              if( v.get(i).equals(new Integer(BLUFF)) )
                  found = true;
              else i++;
        } 
        crono.off(); 
        tmpal[2] = crono.textSeeMilis();
       
       //
        
        i = 0; found = false;
        crono.on();
        while(i< v.size() && (!found)) {
              if( v.get(i).equals(new Integer(CHAVE)) )
                  found = true;
              else i++;
        } 
        crono.off(); 
        tmpal[3] = crono.textSeeMilis();
       
       //
        
        crono.on();
        v.contains(new Integer(BLUFF));
        crono.off(); 
        tmpal[4] = crono.textSeeMilis();
       
       //
       
        crono.on();
        for(Enumeration<Integer> e = v.elements(); e.hasMoreElements();) {
              e.nextElement();
        }
        crono.off(); 
        tmpal[5] = crono.textSeeMilis();
        
        return tmpal;
       
     }  
        
     //--------------------------------------------------------------
     
      public static String[] testArrayList() {
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        Cronometro crono = new Cronometro();
        int i; boolean found;
        String[] tempal = new String[6];
        
        // inserção       
        crono.on();
        for(int k = 0; k < DIM; k++) {
            al.add(new Integer(2*k));
        }
        crono.off(); 
        tempal[0] = crono.textSeeMilis();
        
         // inserção       
        crono.on();
        for(int k = 0; k < DIM; k++) {
            al.add(2*k);
        }
        crono.off(); 
        tempal[1] = crono.textSeeMilis();
        
       //        
        i = 0; found = false;
        crono.on();
        while(i< al.size() && (!found)) {
              if( al.get(i).equals(new Integer(BLUFF)) )
                  found = true;
              else i++;
        } 
        crono.off(); 
        tempal[2] = crono.textSeeMilis();
       
       //
        
        i = 0; found = false;
        crono.on();
        while(i< al.size() && (!found)) {
              if( al.get(i).equals(new Integer(CHAVE)) )
                  found = true;
              else i++;
        } 
        crono.off(); 
        tempal[3] = crono.textSeeMilis();
       
       //
        
        crono.on();
        al.contains(new Integer(BLUFF));
        crono.off(); 
        tempal[4] = crono.textSeeMilis();
       
       //
       
        crono.on();
        for(Integer s : al)  { i += s; }
        crono.off(); 
        tempal[5] = crono.textSeeMilis();
        
        return tempal;
       
     } 
     
     
      public static String[] testHashSet() {
        HashSet<Integer> hs = new HashSet<Integer>();
        Cronometro crono = new Cronometro();
        int i; boolean found;
        String[] tmpal = new String[6];
        
        // inserção       
        crono.on();
        for(int k = 0; k < DIM; k++) {
            hs.add(new Integer(2*k));
        }
        crono.off(); 
        tmpal[0] = crono.textSeeMilis();
        
        // inserção       
        crono.on();
        for(int k = 0; k < DIM; k++) {
            hs.add(2*k);
        }
        crono.off(); 
        tmpal[1] = crono.textSeeMilis();
       
       //        
        i = 0; found = false;
        crono.on();
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext() && !found) {
              if( it.next().equals(new Integer(BLUFF)) )
                  found = true;
              else i++;
        } 
        crono.off(); 
        tmpal[2] = crono.textSeeMilis();
       
       //
        
        i = 0; found = false;
        crono.on();
        Iterator<Integer> it1 = hs.iterator();
        while(it1.hasNext() && !found) {
              if( it1.next().equals(new Integer(CHAVE)) )
                  found = true;
              else i++;
        } 
        crono.off(); 
        tmpal[3] = crono.textSeeMilis();
       
       //
        
        crono.on();
        boolean valor = hs.contains(new Integer(BLUFF));
        GregorianCalendar c1 = new GregorianCalendar();
        crono.off(); 
        tmpal[4] = crono.textSeeMilis();
        /*
        
        GregorianCalendar c2 = new GregorianCalendar();
        long time = c2.getTimeInMillis()-c1.getTimeInMillis();
        out.println(valor);
         out.println(time);
        try {
            int c = System.in.read(); }
        catch(IOException e) {}
        */
       
       //
       
        crono.on();
        for(Integer s : hs)  { i += s; }
        crono.off(); 
        tmpal[5] = crono.textSeeMilis();
        
        return tmpal;
       
     } 
     
     //--------------------------------------------------------
     
       public static String[] testTreeSet() {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        Cronometro crono = new Cronometro();
        int i; boolean found;
        String[] tmpal = new String[6];
        
        // inserção       
        crono.on();
        for(int k = 0; k < DIM; k++) {
            ts.add(new Integer(2*k));
        }
        crono.off(); 
        tmpal[0] = crono.textSeeMilis();
        
        // inserção       
        crono.on();
        for(int k = 0; k < DIM; k++) {
            ts.add(2*k);
        }
        crono.off(); 
        tmpal[1] = crono.textSeeMilis();
            
         //        
        i = 0; found = false;
        crono.on();
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext() && !found) {
              if( it.next().equals(new Integer(BLUFF)) )
                  found = true;
              else i++;
        } 
        crono.off(); 
        tmpal[2] = crono.textSeeMilis();
       
       //
        
        i = 0; found = false;
        crono.on();
        Iterator<Integer> it1 = ts.iterator();
        while(it1.hasNext() && !found) {
              if( it1.next().equals(new Integer(CHAVE)) )
                  found = true;
              else i++;
        } 
        crono.off(); 
        tmpal[3] = crono.textSeeMilis();
       
       //
        
        crono.on();
        ts.contains(new Integer(BLUFF));
        crono.off(); 
        tmpal[4] = crono.textSeeMilis();
       
       //
       
        crono.on();
        for(Integer s : ts)  { i += s; }
        crono.off(); 
        tmpal[5] = crono.textSeeMilis();
        
        return tmpal;
       
     } 
     
     //-------------------------------------------------------- 
     
     public static String[] testHashMap() {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Cronometro crono = new Cronometro();
        int i; boolean found;
        String[] tmphm = new String[6];
        
        // 
        crono.on();
        for(int k = 0; k < DIM; k++) {
            hm.put(new Integer(2*k), new Integer(2*k));
        }
        crono.off(); 
        tmphm[0] = crono.textSeeMilis();
        
        crono.on();
        for(int k = 0; k < DIM; k++) {
            hm.put(2*k, 2*k);
        }
        crono.off(); 
        tmphm[1] = crono.textSeeMilis();
        
        // teste com HashMap
         
        found = false;
        Iterator<Integer> valores = hm.values().iterator();
        crono.on();
        while( valores.hasNext() && (!found) ) {
            found = valores.next().equals(new Integer(BLUFF));
        }
        crono.off(); 
        tmphm[2] = crono.textSeeMilis();
        
        //
        found = false;
        valores = hm.values().iterator();
        crono.on();
        while( valores.hasNext() && (!found) ) {
            found = valores.next().equals(new Integer(CHAVE));
        }
        crono.off(); 
        tmphm[3] = crono.textSeeMilis();
        
        // teste com HashMap
       
        crono.on();
        hm.containsValue(new Integer(BLUFF));
        crono.off(); 
        tmphm[4] = crono.textSeeMilis();
        
         // teste com HashMap
         i = 0;
        crono.on();
        for(Integer s : hm.values())  { i += s; }
        crono.off(); 
        tmphm[5] = crono.textSeeMilis();
        
        return tmphm;
    }
    
    //------------------------------------------------------------
    
      public static String[] testTreeMap() {
        TreeMap<Integer, Integer> hm = new TreeMap<Integer, Integer>();
        Cronometro crono = new Cronometro();
        int i; boolean found;
        String[] tmphm = new String[6];
        
        // teste com 
        crono.on();
        for(int k = 0; k < DIM; k++) {
            hm.put(new Integer(2*k), new Integer(2*k));
        }
        crono.off(); 
        tmphm[0] = crono.textSeeMilis();
        
        crono.on();
        for(int k = 0; k < DIM; k++) {
            hm.put(2*k, 2*k);
        }
        crono.off(); 
        tmphm[1] = crono.textSeeMilis();
        // teste com 
         
        found = false;
        Iterator<Integer> valores = hm.values().iterator();
        crono.on();
        while( valores.hasNext() && (!found) ) {
            found = valores.next().equals(new Integer(BLUFF));
        }
        crono.off(); 
        tmphm[2] = crono.textSeeMilis();
        
        //
        found = false;
       valores = hm.values().iterator();
        crono.on();
        while( valores.hasNext() && (!found) ) {
            found = valores.next().equals(new Integer(CHAVE));
        }
        crono.off(); 
        tmphm[3] = crono.textSeeMilis();
        
        // teste com HashMap
       
        crono.on();
        hm.containsValue(new Integer(BLUFF));
        crono.off(); 
        tmphm[4] = crono.textSeeMilis();
        
         // teste com HashMap
         i = 0;
        crono.on();
        for(Integer s : hm.values())  { i += s; }
        crono.off(); 
        tmphm[5] = crono.textSeeMilis();
        
        return tmphm;
    }
       
     public static void main () {
         String[] tempos = new String[6];
         //
         tempos = testVector(); 
         out.println("---   Tempos de VECTOR para " + DIM + " elementos ---");
         out.println("-----------------------INSERÇÃO: " + tempos[0]);
         out.println("-------------INSERÇÃO + BOXING : " + tempos[1]);
         out.println("PROCURA ALGORITMICA SEM SUCESSO: " + tempos[2]);
         out.println("PROCURA ALGORITMICA COM SUCESSO: " + tempos[3]);
         out.println("USO de contains()/containsValue: " + tempos[4]);
         out.println("-----------------------ITERAÇÃO: " + tempos[5]);       
         
         tempos = testArrayList(); 
         out.println("---   Tempos de ARRAYLIST para " + DIM + " elementos ---");
         out.println("-----------------------INSERÇÃO: " + tempos[0]);
         out.println("-------------INSERÇÃO + BOXING : " + tempos[1]);
         out.println("PROCURA ALGORITMICA SEM SUCESSO: " + tempos[2]);
         out.println("PROCURA ALGORITMICA COM SUCESSO: " + tempos[3]);
         out.println("USO de contains()/containsValue: " + tempos[4]);
         out.println("-----------------------ITERAÇÃO: " + tempos[5]); 
         
         tempos = testHashSet(); 
         out.println("---   Tempos de HASHSET para " + DIM + " elementos ---");
         out.println("-----------------------INSERÇÃO: " + tempos[0]);
         out.println("-------------INSERÇÃO + BOXING : " + tempos[1]);
         out.println("PROCURA ALGORITMICA SEM SUCESSO: " + tempos[2]);
         out.println("PROCURA ALGORITMICA COM SUCESSO: " + tempos[3]);
         out.println("USO de contains()/containsValue: " + tempos[4]);
         out.println("-----------------------ITERAÇÃO: " + tempos[5]); 
         
         tempos = testTreeSet(); 
         out.println("---   Tempos de TREESET para " + DIM + " elementos ---");
         out.println("-----------------------INSERÇÃO: " + tempos[0]);
         out.println("-------------INSERÇÃO + BOXING : " + tempos[1]);
         out.println("PROCURA ALGORITMICA SEM SUCESSO: " + tempos[2]);
         out.println("PROCURA ALGORITMICA COM SUCESSO: " + tempos[3]);
         out.println("USO de contains()/containsValue: " + tempos[4]);
         out.println("-----------------------ITERAÇÃO: " + tempos[5]); 
         
         tempos = testHashMap(); 
         out.println("---   Tempos de HASHMAP para " + DIM + " elementos ---");
         out.println("-----------------------INSERÇÃO: " + tempos[0]);
         out.println("-------------INSERÇÃO + BOXING : " + tempos[1]);
         out.println("PROCURA ALGORITMICA SEM SUCESSO: " + tempos[2]);
         out.println("PROCURA ALGORITMICA COM SUCESSO: " + tempos[3]);
         out.println("USO de contains()/containsValue: " + tempos[4]);
         out.println("-----------------------ITERAÇÃO: " + tempos[5]); 
         
         tempos = testTreeMap(); 
         out.println("---   Tempos de TREEMAP para " + DIM + " elementos ---");
         out.println("-----------------------INSERÇÃO: " + tempos[0]);
         out.println("-------------INSERÇÃO + BOXING : " + tempos[1]);
         out.println("PROCURA ALGORITMICA SEM SUCESSO: " + tempos[2]);
         out.println("PROCURA ALGORITMICA COM SUCESSO: " + tempos[3]);
         out.println("USO de contains()/containsValue: " + tempos[4]);
         out.println("-----------------------ITERAÇÃO: " + tempos[5]); 
         
         
     }      
  }
