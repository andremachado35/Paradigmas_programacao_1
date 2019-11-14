 

import java.util.*;
/**
 * Uma pequena classe que implementa o funcionamento de um cronómetro. 
 * Inicia uma contagem de tempo com ON, termina-a com OFF, permite 
 * saber qual foi usando see() (em milisegundos) ou textSee(), cf. 
 * o formato H:M:S:Ms.
 * 
 * Permite paragens intermedias na contagem usando pares de mensagens
 * freeze() e resume(), que não interferem no tempo total final, pois
 * são consideradas interrupções na contagem de tempo. Porém, para 
 * que a contaegm funcione, a um freeze() deve seguir-se um resume().
 * Se tal não acontecer nada é garantido.
 * 
 * Após a introdução do mecanismo de excepções de Java, uma classe com
 * a funcionalidade de Cronometro poderá ser construída de forma mais
 * robusta, onde, por exemplo, más utilizações de freeze() e resume()
 * poderiam ser controladas.
 * 
 * Nesta implementação de Cronometro más utilizações conduzem apenas,
 * sem aviso, a maus resultados.
 * 
 * @author F. Mário Martins
 * @version 1.0/04-2004
 */
public class Cronometro {

    private GregorianCalendar inicio; 
    private long[] freezes = new long[10];    // paragens intermedias
    private int numfreezes;                 // nº de paragens intermedias
    private GregorianCalendar fim;
    
    /**
     * Construtor de Cronometros
     */
    public Cronometro() {
        inicio = null; fim = null; numfreezes = 0;
    }

    
    /**
     * Método On: coloca o cronómetro a funcionar     
     */
    public void on() {
       inicio = new GregorianCalendar();
    }
    
    /**
     * Método Freeze: para temporariamente a contagem.
     * Contagem deverá reiniciar-se com resume() !!
     */
    public void freeze() {
       Calendar crono = new GregorianCalendar();
       numfreezes = numfreezes + 1 ;
       freezes[numfreezes-1] = crono.getTimeInMillis();
    }
    
    /**
     * Método Resume: reinicia a contagem onde esta parou
     * temporariamente ao fazer freeze(), e guarda tempo passado na paragem
     */
    public void resume() {
       Calendar crono = new GregorianCalendar();  
       freezes[numfreezes-1] = crono.getTimeInMillis() - freezes[numfreezes - 1];
    }
      

    /**
     * Método off: desliga o cronómetro 
     */
    public void off() {
       fim = new GregorianCalendar();
    }

    /**
     * Método reset: coloca cronometro a zero.
     */
    public void reset() {
       inicio = null; fim = null; numfreezes = 0;
     }
       
    /**  Método see: dá a contagem de tempo efectivamente realizada,
     * ou seja, (inicio-fim)-SOMATORIO(freezes)
     */
    public long see() {
       long parado = 0L;
       for(int i = 0; i < numfreezes; i++) { parado+= freezes[i];}
       return (fim.getTimeInMillis() - inicio.getTimeInMillis()) - parado;
    }
    
     /**  Método see: coloca o cronómetro a funcionar e marca hora
     * início    
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
