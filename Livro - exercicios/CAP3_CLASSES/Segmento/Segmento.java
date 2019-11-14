
/**
 * Classe que implementa Segmentos de recta, usando
 * 2 pontos de coordenadas inteirras que representam os seus limites.
 * Os m�todos de inst�ncia permitem calcular o comprimento e o declive
 * do segmento de recta.
 * 
 * @author F. M�rio Martins
 * @version 2005
 * 
 **/

  public class Segmento {
    // construtores
    public Segmento() {
       p1 = new Ponto();
       p2 = new Ponto();
    }

    public Segmento(Ponto pa, Ponto pb) {
       p1 = pa; p2 = pb;
    }

    // vari�veis de inst�ncia
    private Ponto p1;
    private Ponto p2;
    
    // m�todos de inst�ncia
    
     public Ponto daInicio() { return p1.copia(); }
     public Ponto daFim() { return p2.copia(); }
    
     public double compSeg() {
        int dx = p1.getx() - p2.getx();
        int dy = p1.gety() - p2.gety();
        dx = dx*dx; dy = dy * dy;
        return Math.sqrt(dx+dy);
     }
   
     public double declive() {
        double dx = (double)(p1.getx() - p2.getx());
        double dy = (double)(p1.gety() - p2.gety());
        return dy/dx;
     }
     
     public String paraString() {
         return new String("(" + p1.paraString() + ", " + p2.paraString() + ")");
     }   
  }
