
/**
 * Write a description of class CD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CD extends ItemMulti {
		//
		private int minutos;
		private double ocupacao;
		private int gravacoes;
		// construtores
		public CD(String titulo, String data, String obs,
					    int min, double ocup, int gravc) {
			super(titulo, data, obs); // super ??
			minutos = min; ocupacao = ocup; gravacoes = gravc;
        }
		//
		public int getMin() { return minutos; }
		public double getOcup() { return ocupacao; }
		public int getGrava() { return gravacoes; }
		public double duracao() {
		    return minutos*(ocupacao/100);
	    }
	    public String toString() { return this.getTitulo(); }
	    
	    public CD clone() {
	        return new CD(this.getTitulo(), this.getData(), this.getObs(),
	                       minutos, ocupacao, gravacoes);
	    }
	    
	    public void mudaOcupa(double ocup) { ocupacao = ocup; }
	    public void mudaGrava(int maisGravs) { gravacoes += maisGravs; }
}

	

