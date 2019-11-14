
/**
 * Abstract class ItemMulti - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
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
		public String getTitulo() { return titulo; }
		public String getData() { return data; }
		public String getObs() { return obs; }
		public void mudaData(String nData) {data = nData; }
		public void mudaObs(String nObs) {obs = nObs; }
		public abstract String toString();
		public abstract double duracao();
		public abstract ItemMulti clone();
		
	}


