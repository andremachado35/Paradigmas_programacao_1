
/**
 * Write a description of class TstEnumSet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.EnumSet;
import static java.lang.System.out;
// Java, C, Cmm, Csh, Mod2, Lisp, Haskel, Pascal, Perl, Python, Ada, Vb
public class TstEnumSet2 {
  public static void main(String[] args) {
    String str = "";
    EnumSet<LP> todas1 = EnumSet.allOf(LP.class);
    EnumSet<LP> todas2 = EnumSet.copyOf(todas1);
    //
    EnumSet<LP> lfunc = EnumSet.of(LP.Haskel,LP.Lisp);
    str = "Funcional ";
    for(LP lp : lfunc) out.printf("%s %s %n", str, lp);
    EnumSet<LP> limp = EnumSet.of(LP.C,LP.Mod2,LP.Pascal,LP.Ada,LP.Vb);
    str = "Imperativa ";
    for(LP lp : limp) out.printf("%s %s %n", str, lp);
    EnumSet<LP> lpoo = EnumSet.of(LP.Java,LP.Cmm,LP.Csh,LP.Python);
    EnumSet<LP> lscrp = EnumSet.of(LP.Perl);
    // A - B diferença
    // Linguagens nao funcionais
    EnumSet<LP> temp = todas2.complementOf(lfunc);
    str = "Nao funcional ";
    for(LP lp : temp) out.printf("%s %s %n", str, lp);
    // A U B
    // Reuniao funcionais + imperativas
    temp.clear(); temp.addAll(lfunc); temp.addAll(limp); 
    str = "Func + Imp ";
     for(LP lp : temp) out.printf("%s %s %n", str, lp);
    // A && B
    // 
    temp.retainAll(limp); 
    str = "Inter c/ Imp ";
     for(LP lp : temp) out.printf("%s %s %n", str, lp); 
	
  }
}