
/**
 * Write a description of class TstDireccao2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    import static java.lang.System.out;
    public class TstDireccao2 {
        //
        public static void main(String[] args) {
            Direccao vamosPara = Direccao.Norte;
            out.println("Ordem = " + vamosPara.ordinal());
            String str = "Virar para " + vamosPara.name();
            out.println(str);
            out.println("Sul: " + Direccao.valueOf("Sul").ordinal());
            //
            out.println("Direccao = " + vamosPara);
            // Todas as direc��es (como strings !)
            for(Direccao dir : Direccao.values())
              out.println("Podemos ir para : " + dir);
            //
           Direccao[] dirs = Direccao.values();
          
           for(int dir = Direccao.Norte.ordinal();
               dir<=Direccao.Oeste.ordinal(); dir++)
                 out.println("Dir: " + dirs[dir]);
                 
          for(Direccao dir : dirs)
            out.printf("%s %d letras%n",dir.name(), dir.name().length());
       }
    }

