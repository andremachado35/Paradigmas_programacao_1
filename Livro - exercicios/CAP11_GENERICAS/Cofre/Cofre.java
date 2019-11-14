/**
 * Classe Cofre.
 * 
 * @author F. Mario Martins 
 * @version 1/2006
 */
   public class Cofre<E> {
		private E elem;
		public Cofre() { elem = null; }
		public Cofre(E objp) { elem = objp; }
		public void guarda(E objp) { elem = objp; }
		public E consulta() { return elem; }
		public void retira() { elem = null; }
		public boolean vazio() { return elem == null; }
		public void copiaCofre(Cofre<E> c) { elem = c.consulta(); }
	}

