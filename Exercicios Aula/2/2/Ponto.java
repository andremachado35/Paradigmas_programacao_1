

//André Machado
//Um segmento de recta é representável por dois pontos de coordenadas reais: o ínicio de o fim do segmento. Escreva uma classe segmento que implemente os métodos seguintes:
// - Calcular o compimento do segmento
// - Determinar o declive do segmento cf.(y2-y1)/(x2-x1);
// - Determinar se o semento sobe ou desce a partir do seu inicio (devolver uma string);
// - Deslocar o segmento dx em XX e dy no eixo dos YY
// - Se o segmento for o diâmetro de uma circunferência, deterinar qual o perímetro desta:


    public class Ponto
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;

    /**
     * Constructor for objects of class ponto
     */
    public Ponto()
    {
        // initialise instance variables
        this.x = 0.0; this.y = 0.0;
    }
    public Ponto (double x, double y){
        this.x=x; this.y=y;
        Ponto p1 = new Ponto (x,y);
        Ponto p0 = new Ponto (0,0);
    }}
   
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
  
