    public class TestePonto {
    
    /* Classe de teste da Classe Ponto
       método único com todo o código de teste */

      public static void main(String args[]) {

        // Criação de Instâncias

        Ponto pt1, pt2, pt3;
        pt1 = new Ponto();
        pt2 = new Ponto(2, -1);
        pt3 = new Ponto(0, 12);

        // Utilização das Instâncias

        int cx1, cx2, cx3;  // variáveis auxiliares
        int cy1, cy2, cy3;  // variáveis auxiliares
        cx1 = pt1.getx();
        cx2 = pt2.getx();

        // saída de resultados para verificação

        System.out.println("cx1 = " + cx1);
        System.out.println("cx2 = " + cx2);

        // alterações às instâncias e novos resultados

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
