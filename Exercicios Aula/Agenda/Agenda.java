import java.util.*;
public class Agenda
{
      private String titular; // nome do dono da agenda
      private ArrayList<Tarefa> tarefas; //lista das tarefas agendadas
      
      Agenda(String t)
      { this.titular = t; this.tarefas = new ArrayList<Tarefa>();}
      
      public void AddTarefa(Tarefa t)
      {
          this.tarefas.add(t.clone());
      }
      
      public Iterator<Tarefa> tarefasActivas(Comparator<Tarefa> ct)
      {
          TreeSet<Tarefa> lista = new TreeSet<Tarefa>(ct);
          for(Tarefa t:this.tarefas)
            if(t.activa())
                lista.add(t.clone());
                
          return lista.iterator();
      }
      
      public  Set<Tarefa> tarefasEntreDatas(GregorianCalendar  di, GregorianCalendar df)
      {
          TreeSet<Tarefa> ta = new TreeSet<Tarefa>();
          for(Tarefa t:this.tarefas)
            if(t.getFim().getTimeInMillis() > di.getTimeInMillis() && df.getTimeInMillis() > t.getFim().getTimeInMillis())
                ta.add(t.clone());
                
          return ta;
      }

}
