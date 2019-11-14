import java.util.*;
/**
 * Write a description of class Tarefa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarefa
{


    private String descricao; // descrição da tarefa
    private float prioridade;
    // prioridade e um valor entre 0..1, sendo 1 a prioridade maxima
    private ArrayList<String> participantes;
    //lista dos nomes dos envolvidos na tarefa
    private GregorianCalendar inicio;
    //data e hora do incio da tarefa
    private GregorianCalendar fim;
    //data e hora do termino previsto da tarefa
    private boolean terminada; //tarefa concluda?
    
    public Tarefa(String a, float p, GregorianCalendar i, GregorianCalendar f)
    {
        this.descricao = a;
        this.prioridade = p;
        this.participantes = new ArrayList<String>();
        this.inicio = (GregorianCalendar)i.clone();
        this.fim = (GregorianCalendar)f.clone();
        this.terminada = false;
    }
    
    public float getPrioridade()
    { return this.prioridade;}
    public GregorianCalendar getFim()
    { return (GregorianCalendar)this.fim.clone();  }
    
    public void setTerm()
    { this.terminada = true;}
    
    public void addParti(String a)
    { this.participantes.add(a); }
    
    public boolean activa()
    {
        GregorianCalendar today = new GregorianCalendar();
        return !this.terminada && this.inicio.getTimeInMillis() < today.getTimeInMillis() && today.getTimeInMillis() < fim.getTimeInMillis();
    }

    public Tarefa clone()
    { return new Tarefa(this.descricao, this.prioridade, this.inicio, this.fim); }
}
