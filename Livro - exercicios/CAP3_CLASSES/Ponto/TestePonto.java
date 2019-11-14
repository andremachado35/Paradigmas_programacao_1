    public class TestePonto {
    
    /* Classe de teste da Classe Ponto
       m�todo �nico com todo o c�digo de teste */

      public static void main(String args[]) {

        // Cria��o de Inst�ncias

        Ponto pt1, pt2, pt3;
        pt1 = new Ponto();
        pt2 = new Ponto(2, -1);
        pt3 = new Ponto(0, 12);

        // Utiliza��o das Inst�ncias

        int cx1, cx2, cx3;  // vari�veis auxiliares
        int cy1, cy2, cy3;  // vari�veis auxiliares
        cx1 = pt1.getx();
        cx2 = pt2.getx();

        // sa�da de resultados para verifica��o

        System.out.println("cx1 = " + cx1);
        System.out.println("cx2 = " + cx2);

        // altera��es �s inst�ncias e novos resultados

        pt1.incCoord(4,4); pt2.incCoord(12, -3);
        cx1 = pt1.getx(); cx2 = pt2.getx();
        cx3 = cx1 + cx2; 
        System.out.println("cx1 + cx2 = " + cx3);

        pt3.decCoord(10, 20); pt2.decCoord(5, -10);
        cy1 = pt2.gety(); cy2 = pt3.gety();
        cy3 = cy1 + cy2; 
        System.out.println("cy1 + cy2 = " + cy3);
      }
    }
