/**
 * Classe CofrePonto.
 * 
 * @author F. Mario Martins 
 * @version 1/2006
 */
public class CofrePonto<E extends Ponto2D> {
		private Cofre<E> cfPt;
		public CofrePonto() { cfPt = new Cofre<E>(); }
		public CofrePonto(E elem) { cfPt = new Cofre<E>(); cfPt.guarda(elem); }
		public void guarda(E elem) { cfPt.guarda(elem); }
		public E consulta() { return cfPt.consulta(); }
		public void retira() { cfPt.retira(); }
		public int cx() { return cfPt.consulta().getX(); }
		public int cy() { return cfPt.consulta().getY(); }
		public void movePonto(int dx, int dy) {
			cfPt.consulta().desloca(dx, dy);	
		}
		public boolean vazio() { return cfPt.vazio(); }
	}
