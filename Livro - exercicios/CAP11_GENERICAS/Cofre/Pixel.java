
/**
 * Write a description of class Pixel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pixel extends Ponto2D {
	// 
	private int cor;

	
	public Pixel() { super(0,0); cor = 0; }
	public Pixel(int cor) { super(0, 0); this.cor = cor%100; }
	public Pixel(int x, int y, int cor)
	  { super(x, y); this.cor = cor%100; }

	
	public int getCor(){ return cor; }
	public void mudaCor(int nvCor) { cor = nvCor%100; }
	
	public void somaPixel(Pixel pix) {
	     super.desloca(pix.getX(),pix.getY());
	     cor = (cor + pix.getCor())%100;
	}
			
	public String toString() {
		    StringBuffer s = new StringBuffer();
		    s.append(super.toString());
		    s.append(", ("); s.append(cor); s.append(" )");
		    return s.toString();
	}
	
    public Pixel clone() {
        return new Pixel(this.getX(), this.getY(), cor);
    }

}
