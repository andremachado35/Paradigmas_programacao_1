	public class CofrePonto1<E extends Ponto2D> extends Cofre<E> {
		public CofrePonto1() { super(); }
		public CofrePonto1(E elem) { super(); super.guarda(elem); }
		public void guarda(E elem) { super.guarda(elem); }
		public E consulta() { return super.consulta(); }
		public void retira() { super.retira(); }
		public int cx() { return super.consulta().getX(); }
		public int cy() { return super.consulta().getY(); }
		public void movePonto(int dx, int dy) {
			super.consulta().desloca(dx, dy);	
		}
		public boolean vazio() { return super.vazio(); }
	}
