
/**
 * Classe que representa a informa��o sobre uma dada
 * conta banc�ria.
 * @author F. M�rio Martins
 * @version 1.0/2005
 */

import java.util.GregorianCalendar;
import java.io.*;
public class Conta implements Serializable {

    // vari�veis de inst�ncia
    private String numConta;
    private String titular;
    private double saldo;
    private GregorianCalendar dataInicio;
    private GregorianCalendar dataUltMov;
    // Construtores
    public Conta(String num, String tit, double saldo,
                     GregorianCalendar dataInic,
                     GregorianCalendar dataUMov) {
       numConta = num; titular = tit; this.saldo = saldo;
       dataInicio = (GregorianCalendar) dataInic.clone();
       dataUltMov = (GregorianCalendar) dataUMov.clone(); 
    }
    // M�todos de Inst�ncia
    public String getNumConta() { return numConta; }
    public double getSaldo() { return saldo; } 
    public String getTitular() { return titular; }
    public GregorianCalendar getInicio() { return dataInicio; }
    public GregorianCalendar getUltMov() { return dataUltMov; }
    public void levantamento(double valor) { saldo -= valor; }
    public void deposito(double valor) { saldo += valor; }
    public void mudaUltMov(GregorianCalendar dataMov) { 
                        dataUltMov = dataMov; }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("------------------------------------------------------\n");
        s.append("Conta N�: " + numConta + "\t\t\t");
        s.append("Titular: " + titular + "\n");
        s.append("Saldo: " + saldo + "\n");
        int ano = dataInicio.get(GregorianCalendar.YEAR);
        int mes = dataInicio.get(GregorianCalendar.MONTH);
        int dia = dataInicio.get(GregorianCalendar.DAY_OF_MONTH);
        s.append("Inicio: " + dia  + "/" + mes +  "/" + ano + "\t\t");
        ano = dataUltMov.get(GregorianCalendar.YEAR);
        mes = dataUltMov.get(GregorianCalendar.MONTH);
        dia = dataUltMov.get(GregorianCalendar.DAY_OF_MONTH);
        s.append("�lt. Mov: " + dia + "/" + mes + "/" + ano + "\n");
        return s.toString();
    }
  
  public Conta clone() {
       return new Conta(numConta, titular, saldo, 
                        dataInicio, dataUltMov); 
  }
}