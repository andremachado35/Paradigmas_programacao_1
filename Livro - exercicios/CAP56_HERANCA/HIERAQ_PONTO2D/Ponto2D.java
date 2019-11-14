
/**
 * Classe que implementa pontos a duas
 * dimensoes num plano cartesiano de inteiros.
 * Ponto2D 
 * 
 * @author F. Mário Martins
 * @version 1/2005
 */

public class Ponto2D {

// variaveis de classe
static int numPontos = 0;

// metodos de classe
private static void maisUmPonto() {
  numPontos++;
}

static int daNumPontos() {
  return numPontos ;
}

// construtores
public Ponto2D() {
  x = 0; y = 0;
  this.maisUmPonto();
}

public Ponto2D(int x, int y) {
  this.x = x; this.y = y;
  this.maisUmPonto();
}

// variaveis de instancia
private int x ;
private int y ;

// metodos de instancia
public int cx() { return x; }
public int cy() { return y; }
public void incx() { x++; }
public void incx(int dx) { x += dx; }
public void incy(int dy) { y += dy; }
public String paraString() {
   return new String("Ponto = " + x + "," + y);
}
public int quantosPontos() { return this.numPontos; }

public void somaponto(Ponto2D p) {
   this.x = this.x + p.cx() ;
   this.y = this.y + p.cy() ;
}

public Ponto2D copia() { return new Ponto2D(x, y); }

}

  
   



