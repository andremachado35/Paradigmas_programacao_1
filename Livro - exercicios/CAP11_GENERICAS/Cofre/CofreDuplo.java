
/**
 * Write a description of class CofreDuplo here.
 * 
 * @author F. Mario Martins 
 * @version 1/2006
 */
public class CofreDuplo<E> extends Cofre<E> {
    private E elem;
    public CofreDuplo() { elem = null; }
    public CofreDuplo(E prim, E seg) { super(prim); elem = seg; }
    public void guarda(E prim, E seg) { super.guarda(prim); elem = seg; }
    public E primeiro() { return super.consulta(); }
    public E segundo() { return elem; }
    public void retira() { super.retira(); elem = null; }
	public boolean vazio() { 
	  return super.vazio() && (elem == null); 
	}
	public void copiaCofre(CofreDuplo<E> c) {
        super.copiaCofre(c);
        elem = c.segundo(); 
    }
}
