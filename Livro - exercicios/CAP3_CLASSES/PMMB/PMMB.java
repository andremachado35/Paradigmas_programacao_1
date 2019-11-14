
/**
 * CLASSE QUE DEFINE A ESTRUTURA E COMPORTAMENTO DE
 * UM PORTA MOEDAS MULTIBANCO.
 * 
 * @author F. MÁRIO MARTINS
 * @version 1.0/2005
 */

   import java.io.*;

   public class PMMB {

    // variáveis de classe

    /** número total de PMMB instanciados */
    public static int numPMMB = 0; // inicialização 
    
    /** saldo total de todos os PMMB */
    public static double saldoTotal = 0.0; // inicialização


    // métodos de classe

    /** devolve o número total de PMMB emitidos */
    public static int getNumPMMB() {
        return numPMMB;
    }
    
    /** devolve o saldo total de todos os PMMB */
    public static double getSaldoTotal() {
        return saldoTotal;
    }
    
    /** incrementa o número de PMMB */
    public static void incNumPMMB() {
        numPMMB++;
    }
    
    /** actualiza o saldo total dos PMMB */
    public static void actSaldoTotal(double valor) {
        saldoTotal += valor;
    }


    // construtores

    /** construtor por omissão */
    public PMMB() {
      codigo = ""; titular = "";
      saldo = 0.0; numMovs = 0;
      this.actSaldoTotal(0);
      this.incNumPMMB();
    }
    
    /** construtor completo */
    public PMMB(String codigo, String titular,
             double saldo, int numMovs) {
      this.codigo = codigo;
      this.titular = titular;
      this.saldo = saldo;
      this.numMovs = numMovs;
      this.actSaldoTotal(saldo);
      this.incNumPMMB();

    }
    // variáveis de instância

    private String codigo;
    private String titular;
    private double saldo;
    private int numMovs;  // total de movimentos

    // métodos de instância

    /** devolve o código do PMMB */
    public String getCodigo() { return codigo; }
    
    /** devolve o nome do titular do PMMB */
    public String getTitular() { return titular; }
    
    /** devolve o saldo actual do PMMB */
    public double getSaldo() { return saldo; }
    
    /** devolve o número de movimentos realizados */
    public int getNumMovs() { return numMovs; }

    /** altera o nome do titular */
    public void mudaTitular(String novoTit) {
        titular = novoTit;
    }
    
    /** realiza um carregamento do PMBB */
    public void carregaPM(double valor) {
      saldo = saldo + valor;
      numMovs++; actSaldoTotal(valor);
    }

    /** verifica se existe saldo suficiente para 
     * realizar um pagamento X = valor parametro 
     */
    public boolean prePaga(double valor) {
        return saldo >= valor ;
    }

    /** realiza um pagamento = valor */
    public void pagamento(double valor) {
        saldo = saldo - valor;
        numMovs++; actSaldoTotal(-valor);
    }

    /** converte os dados do PMMB para String */
    public String paraString() {
      StringBuilder s = new StringBuilder();
      s.append("------- PMMB Nº: ");
      s.append(codigo);
      s.append("\nTitular: "); s.append(titular);
      s.append("\nSaldo Actual: "); s.append(saldo);
      s.append("\nMovimentos; "); s.append(numMovs);
      s.append("\n--------------------------------");
      return s.toString();
    }

    /** verifica se dois PMMB são iguais */
    public boolean igual(PMMB pm) {
       return codigo.equals(pm.getCodigo());
    }
    
    /** faz uma cópia completa de um PMMB */
    public PMMB copia() {
       return new PMMB(codigo, titular, saldo, numMovs);
    }
   }
