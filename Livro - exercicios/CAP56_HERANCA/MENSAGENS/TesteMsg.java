
/**
 * Write a description of class TesteOla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TesteMsg {
	public static void main(String args[]) {
	    Msg mens, mens1, mens2; 
	    mens = new Msg();
	    mens1 = new MsgRita(); mens2 = new MsgPedro();
	    System.out.println(Msg.inicio() + mens.msg());
	    System.out.println(mens1.inicio() + mens1.msg());
	    System.out.println(Msg.inicio() + mens2.msg());
  }
}