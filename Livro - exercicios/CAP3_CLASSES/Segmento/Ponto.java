
/**
 * Classe que implementa pontos do plano cartesiano com
 * coordenadas inteiras e as principais opera��es sobre
 * estes.
 * 
 * @author F. M�rio Martins
 * @version 2005
 * 
 **/
 public class Ponto {

    // construtores
    public Ponto() {
        x = 0; y = 0;
    }

    public Ponto(int cx, int cy) {
        x = cx; y = cy;
    }

    // vari�veis de inst�ncia
    private int x;
    private int y;

    // m�todos de inst�ncia

    // interrogador � devolve X
    public int getx() { return x;   }

    // interrogador � devolve Y
    public int gety() { return y;   }

    // modificador � incremento das Coordenadas
    public void incCoord(int deltaX, int deltaY) { 
        x = x + deltaX; y = x + deltaY ;
    }

    // modificador � decremento das Coordenadas
    public void decCoord(int deltaX, int deltaY) { 
         x -= deltaX; y -= deltaY;
     }

    /* determina se um ponto tem ambas as
        coordenadas positivas */
    public boolean coordPos() {
       return x > 0 && y > 0 ;
    }

    /* determina se um ponto � sim�trico, ou seja
       se dista igualmente do eixo dos X e dos Y */
    public boolean simetrico() {
       return Math.abs(x) == Math.abs(y) ;
    }
    
    // testa igualdade de pontos
    public boolean igual(Ponto p) {
        return ( p==null ) ? false : x==p.getx() && y==p.gety();
    }
    
    // Representa��o do receptor sob a forma de uma String
    public String paraString() {
        return new String("Pt(" + x + ", " + y + ") ");
    }
    
    // Cria um ponto que � uma c�pia do receptor
    public Ponto copia() {
       return new Ponto(x, y);
    }
 }
