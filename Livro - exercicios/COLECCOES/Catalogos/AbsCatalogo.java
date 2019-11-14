	
	import java.util.*;
	import java.io.Serializable;
	public abstract class AbsCatalogo implements Serializable {
		public abstract AbsCatalogo clone();
		public abstract void insereEntrada(String c, Object ac);
   }