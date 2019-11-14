 

import java.util.*;
import java.io.*;

/**
 * Classe Polinomio 
 * 
 * Representação de um polinómio P(x) de coeficiente inteiros,
 * usando um TreeMap que associa a cada Grau o respectivo Coeficiente.
 * 
 * Grau e Coeficiente são do tipo Integer (cf. Integer -> Integer).
 * 
 * @author FMM
 * @version 06-2006
 */
public class Polinomio implements Serializable, Standard {
    // Variáveis de Instancia

    private TreeMap<Integer, Integer> poli; 
    
     /** Construtor de base
     */
    public Polinomio() {
        poli = new TreeMap<Integer, Integer>();
    }
    
    public Polinomio(Map<Integer, Integer> poliAux) {
       poli = new TreeMap<Integer, Integer>();
       poli.putAll(poliAux);
    }
    

    public Set<Integer> graus() { return poli.keySet();}

    /**
     * Insere um novo Termo
     */
    public void insereTermo(Termo t) throws GrauJaExisteExc {
        if(poli.containsKey(t.grau()))
           throw new GrauJaExisteExc();
        else 
           poli.put(t.grau(), t.coef());
    }

    /**
     * Grau do Termo de maior grau
     * 
     */
    public int maiorGrau() {
        return poli.lastKey();
    }
    
    public Termo termoMaiorGrau() {
        return new Termo(poli.lastKey(), poli.get(poli.lastKey()));
    }
    
    /**
     * Termo de maior Coeficiente
     */
    public Termo maiorCoef() {
        Termo t = null;
        int grauMaxCoef = Integer.MIN_VALUE;
        for(int grau : poli.keySet()) {
            if( poli.get(grau)  > grauMaxCoef ) grauMaxCoef = grau; // clone() no fim 
        }
        return new Termo(grauMaxCoef, poli.get(grauMaxCoef));
    }
    
    /**
     * Número total de Termos
     */
    public int numTermos() {
        return poli.size();
    }
    
    /**
     * Junta Termo ao polinómio. Se grau existe, soma coeficientes.
     * Se não existe junta o novo Termo.
     */
    public void juntaTermo(Termo t) {
        int grau = t.grau(); int coef = t.coef();
        if( poli.containsKey(grau)) {
            int coeft = poli.get(grau);
            poli.remove(grau);
            poli.put(grau, coeft + coef);
      }
      else 
          poli.put(grau, coef);
    }
    
    /**
     * Elimina Termo de dado grau, caso exista.
     */
    public void eliminaTermo(int grau) throws GrauInexistenteExc {
        if( !poli.containsKey(grau) )
            throw new GrauInexistenteExc();
      else 
          poli.remove(grau);
    }
    
    /**
     * Deep clone() do polinómio
     */
    public Polinomio clone() {
       TreeMap<Integer, Integer> poli1 = new TreeMap<Integer, Integer>();
       for(int grau : poli.keySet()) 
          poli1.put(grau, poli.get(grau));
        return new Polinomio(poli1);
    }

    /**
     * toString() do polinómio
     */
    public String toString() {
        StringBuffer ptxt = new StringBuffer();
        ptxt.append("P(x)= ");
        for(int grau : poli.keySet()) {
            ptxt.append( poli.get(grau) + "x" + grau + "\n");
        }
        return ptxt.toString();
    }
    
    /**
     * Igualdade de 2 polinómios => terem os mesmos termos
     */
    public boolean equals(Object polipar) {
        if( !(polipar instanceof Polinomio) ) 
           return false;
        return polipar.equals(poli);             
    }
}