/**
 * Sequencia genérica que implementa Iterable<E>.
 * 
 * @author F. Mário Martins
 * @version 1.0/2006
 */

    import java.util.*;
    public class Sequencia<E> implements Iterable<E> {
        public static class IndiceInexistenteException extends Exception { }
        public static class SeqVaziaException extends Exception { }
        private ArrayList<E> seq = null;
        //private int index;
        public Sequencia() { seq = new ArrayList<E>(); }
        public void add(E e) { seq.add(e); }
        public E get(int index) throws SeqVaziaException, 
                                       IndiceInexistenteException {
            if (seq.size() == 0) throw new SeqVaziaException();
            if (index > seq.size() || index < 0)
                    throw new IndiceInexistenteException();
            return seq.get(index);
        }
            
        public void remove(int index) throws SeqVaziaException, 
                                             IndiceInexistenteException { 
                if (seq.size() == 0) throw new SeqVaziaException();
                if ( !(index > 0 && index <= seq.size()) )
                   throw new IndiceInexistenteException();
                seq.remove(index); 
        }
        
        public Iterator<E> iterator() { return new ItSeq(); }
        public Iterator<E> it() { return new Iterator<E>() {
            private int idx = 0; 
            public boolean hasNext() {
                 return (seq.size() > 0) && (idx < seq.size());
            }
            public E next() {
                if ( seq.size() > 0 && idx >= 0 && idx < seq.size() ) 
                    return seq.get(idx++);
                else   
                    return null;
            }
            public void remove() { } // nop
        };
    }
        
        // classe membro
        
        private class ItSeq implements Iterator<E> {
            private int idx = 0; 
            
            public boolean hasNext() {
                 return (seq.size() > 0) && (idx < seq.size());
            }
            public E next() {
                if ( seq.size() > 0 && idx >= 0 && idx < seq.size() ) 
                    return seq.get(idx++);
                else   
                    return null;
            }
            public void remove() { } // nop
        }
        
    }
        