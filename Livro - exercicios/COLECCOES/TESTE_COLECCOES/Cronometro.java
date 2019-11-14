 

import java.util.*;
/**
 * Uma pequena classe que implementa o funcionamento de um cron�metro. 
 * Inicia uma contagem de tempo com ON, termina-a com OFF, permite 
 * saber qual foi usando see() (em milisegundos) ou textSee(), cf. 
 * o formato H:M:S:Ms.
 * 
 * Permite paragens intermedias na contagem usando pares de mensagens
 * freeze() e resume(), que n�o interferem no tempo total final, pois
 * s�o consideradas interrup��es na contagem de tempo. Por�m, para 
 * que a contaegm funcione, a um freeze() deve seguir-se um resume().
 * Se tal n�o acontecer nada � garantido.
 * 
 * Ap�s a introdu��o do mecanismo de excep��es de Java, uma classe com
 * a funcionalidade de Cronometro poder� ser constru�da de forma mais
 * robusta, onde, por exemplo, m�s utiliza��es de freeze() e resume()
 * poderiam ser controladas.
 * 
 * Nesta implementa��o de Cronometro m�s utiliza��es conduzem apenas,
 * sem aviso, a maus resultados.
 * 
 * @author F. M�rio Martins
 * @version 1.0/04-2004
 */
public class Cronometro {

    private GregorianCalendar inicio; 
    private long[] freezes = new long[10];    // paragens intermedias
    private int numfreezes;                 // n� de paragens intermedias
    private GregorianCalendar fim;
    
    /**
     * Construtor de Cronometros
     */
    public Cronometro() {
        inicio = null; fim = null; numfreezes = 0;
    }

    
    /**
     * M�todo On: coloca o cron�metro a funcionar     
     */
    public void on() {
       inicio = new GregorianCalendar();
    }
    
    /**
     * M�todo Freeze: para temporariamente a contagem.
     * Contagem dever� reiniciar-se com resume() !!
     */
    public void freeze() {
       Calendar crono = new GregorianCalendar();
       numfreezes = numfreezes + 1 ;
       freezes[numfreezes-1] = crono.getTimeInMillis();
    }
    
    /**
     * M�todo Resume: reinicia a contagem onde esta parou
     * temporariamente ao fazer freeze(), e guarda tempo passado na paragem
     */
    public void resume() {
       Calendar crono = new GregorianCalendar();  
       freezes[numfreezes-1] = crono.getTimeInMillis() - freezes[numfreezes - 1];
    }
      

    /**
     * M�todo off: desliga o cron�metro 
     */
    public void off() {
       fim = new GregorianCalendar();
    }

    /**
     * M�todo reset: coloca cronometro a zero.
     */
    public void reset() {
       inicio = null; fim = null; numfreezes = 0;
     }
       
    /**  M�todo see: d� a contagem de tempo efectivamente realizada,
     * ou seja, (inicio-fim)-SOMATORIO(freezes)
     */
    public long see() {
       long parado = 0L;
       for(int i = 0; i < numfreezes; i++) { parado+= freezes[i];}
       return (fim.getTimeInMillis() - inicio.getTimeInMillis()) - parado;
    }
    
     /**  M�todo see: coloca o cron�metro a funcionar e marca hora
     * in�cio    
     */
    public String textSee() {
         long totalmilis = this.see();
         long totalseg = totalmilis/1000;
         long milis = totalmilis%1000;
         long seg = totalseg%60;
         int totalmin = (int)totalseg/60;
         int min = totalmin%60;
         int hora = totalmin/60;
       return new String(hora+":"+min+":"+seg+"."+milis);
    }
    
   public String textSeeMilis() {
         long totalmilis = this.see();
       return new String(totalmilis + " ms");
    }


}
