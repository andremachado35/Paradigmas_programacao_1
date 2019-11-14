
/**
 * Write a description of class TstEnumSet1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.EnumSet;
import static java.lang.System.out;
// Cafe = { Vazio, Curto, Normal, Cheio, XCheio )
public class TstEnumSet1 {
  public static void main(String[] args) {
    EnumSet<Cafe> todos = EnumSet.range(Cafe.Vazio, Cafe.XCheio);
	EnumSet<Cafe> meuCafe = EnumSet.range(Cafe.Curto, Cafe.Cheio);
	EnumSet<Cafe> teuCafe = EnumSet.range(Cafe.Vazio, Cafe.Normal);
	EnumSet<Cafe> dif = todos.complementOf(meuCafe);
	out.println("---- EU SIRVO ----");
	for(Cafe c : meuCafe) out.printf("Café %s ", c); 
	out.println("\n---- MAS NAO SIRVO ----");
	for(Cafe c : dif) out.printf("Café %s ", c);
	out.println("\n------------------");
	out.printf("Tu serves %s ? %s%n", Cafe.Curto.name(), 
	    teuCafe.contains(Cafe.Curto) ? "SIM!":"NÃO!");
	out.printf("Serves %s ? %s%n", Cafe.XCheio.name(), 
	    teuCafe.contains(Cafe.XCheio) ? "SIM!":"NÃO!");
	out.println("Então serves : "); 
	for(Cafe c : teuCafe) out.printf(" %s ", c);
	dif.clear(); // limpa conjunto
	// meus - teus
	dif = EnumSet.copyOf(meuCafe); dif.removeAll(teuCafe);
	out.println("\n---- EU SIRVO ----");
	for(Cafe c : dif) out.printf("%s ", c);
	out.println("\n---- E TU NÃO !! ----\n");
	// TESTE PROGRAMA 2	   	    
	// Reunião
	EnumSet<Cafe> temp = EnumSet.noneOf(Cafe.class); // [ ]
	temp.addAll(meuCafe); temp.addAll(teuCafe);
	out.println("-- JUNTOS ---");
	for(Cafe c : temp) out.printf("Café %s%n", c);
	// Intersecção
	temp.clear(); temp= EnumSet.copyOf(meuCafe); temp.retainAll(teuCafe);
	out.println("-- IGUAIS ---");
	for(Cafe c : temp) out.printf("Café %s%n", c);	
}
}