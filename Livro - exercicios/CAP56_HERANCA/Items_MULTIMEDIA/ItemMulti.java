
/**
 * Abstract class ItemMulti - superclasse de Items Multimedia
 * 
 * @author F. Mário Martins
 * @version 1.0/2005
 */


	public abstract class ItemMulti {
		//
		private String titulo;
		private String data;
		private String obs;
		// construtores
		public ItemMulti() {
		  titulo = ""; data = ""; obs = "";
		}
		public ItemMulti(String tit, String dat, String com) {
		  titulo = tit; data = dat; obs = com;
		}
		//
		public abstract double duracao();
	}


