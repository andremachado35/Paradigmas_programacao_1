import static java.lang.System.out;
public class TstCafeBar {
	public static void main(String[] args) {
	   Cliente cliente1 = new Cliente("Rui", 60, 75);
	   Cliente cliente2 = new Cliente("Ana", 65, 77);
	   Cliente cliente3 = new Cliente("Joao", 66, 80);
	   Cafe cafe1 = new Cafe(80);
	   Cafe cafe2 = new Cafe(64);
	   Cafe cafe3 = new Cafe(78);
	   try {
	       cliente1.toma(cafe1);
	       cliente2.toma(cafe2);
	       cliente3.toma(cafe3);
	   }
	   catch(CafeQuenteException ec2) {out.println(ec2.getMessage()); }
	   catch(CafeFrioException ec3) {out.println(ec3.getMessage());}
	   catch(CafeException ec1) {out.println(ec1.getMessage());}
    }
}
