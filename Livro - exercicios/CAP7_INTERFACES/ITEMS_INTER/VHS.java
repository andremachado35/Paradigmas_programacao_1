
/**
 * Write a description of class VHS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VHS extends ItemMulti {
			//
		private int minutos;
		private double ocupacao;
		private int gravacoes;
		// construtores
		public VHS(String titulo, String data, String obs,
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
	    public void mudaOcupa(double ocup) { ocupacao = ocup; }
	    public void mudaGrava(int maisGravs) { gravacoes += maisGravs; }
	    public String toString() { return this.getTitulo(); }
	    
	    public VHS clone() {
	        return new VHS(this.getTitulo(), this.getData(), this.getObs(),
	                       minutos, ocupacao, gravacoes);
	    }

}
