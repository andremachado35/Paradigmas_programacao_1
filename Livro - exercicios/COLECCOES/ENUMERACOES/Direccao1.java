
/**
 * Write a description of class Direccao1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
	public class Direccao1 {
		//
		private String nomeDir; // guarda a string
		//
		private Direccao1(String dir) { nomeDir = dir; }
		//
		public String mostraDir() { return nomeDir; }
		//
		public static final Direccao1 Norte = new Direccao1("Norte");
		public static final Direccao1 Sul = new Direccao1("Sul");
		public static final Direccao1 Este = new Direccao1("Este");
		public static final Direccao1 Oeste = new Direccao1("Oeste");
	}



