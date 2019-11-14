import java.util.*;

public class FigGeo
{
    ArrayList<Forma>lista; 
    



public void insere(Forma f)
{ this.lista.add(f.clone());}

public Forma maior()
{
    Forma maior = this.lista.get(0);
    for(Forma f:this.lista)
        if(f.area()>maior.area())
            maior = f;
            
    return maior.clone();
}

}