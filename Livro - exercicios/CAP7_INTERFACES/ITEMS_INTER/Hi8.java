
/**
 * Write a description of class Hi8 here.
 * 
 * @author FMM
 * @version 1.2
 */
	public class Hi8 extends ItemMulti implements Apagavel {
		//
		private int minutos;
		private double ocupacao;
		private int gravacoes;
		// construtores
		public Hi8(String titulo, String data, String obs,
					    int min, double ocup, int gravc) {
			super(titulo, data, obs); // super ??
			minutos = min; ocupacao = ocup; gravacoes = gravc;
        }
		//
		public int getMin() { return minutos; }
		public double getOcup() { return ocupacao; }
		public int getGrava() { return gravacoes; }
		
		public void mudaOcupa(double ocup) { ocupacao = ocup; }
	    public void mudaGrava(int maisGravs) { gravacoes += maisGravs; }
	    
		public double duracao() {
		    return minutos*(ocupacao/100);
	    }
	    
	    public String toString() { return this.getTitulo(); }
	    
	    public Hi8 clone() {
	        return new Hi8(this.getTitulo(), this.getData(), this.getObs(),
	                       minutos, ocupacao, gravacoes);
	    }
	    
	    // implementacao de Apagavel
	    public void apaga() { ocupacao = 0.0; gravacoes = 0; }
	}
