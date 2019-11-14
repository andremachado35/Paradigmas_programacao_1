
/**
 * Write a description of class TstEnumMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.EnumMap;
import static java.lang.System.out;

public class TstEnumMap {
  public static void main(String[] args) {
    EnumMap<TShirt, Double> tprecos = 
          new EnumMap<TShirt, Double>(TShirt.class);
    tprecos.put(TShirt.S, 6.0);
    tprecos.put(TShirt.M, 7.5);
    tprecos.put(TShirt.L, 8.0);
    tprecos.put(TShirt.XL, 8.5);
    tprecos.put(TShirt.XXL, 10.0);
       
    EnumMap<TShirt, Integer> encom = 
           new EnumMap<TShirt, Integer>(TShirt.class);
    encom.put(TShirt.S, 150);
    encom.put(TShirt.M, 200);
    encom.put(TShirt.L, 150);
    encom.put(TShirt.XL, 25);
    encom.put(TShirt.XXL, 25);
    
    // Valot total da Encomenda
    double total = 0.0;
    for(TShirt t : encom.keySet())
       total += encom.get(t)*tprecos.get(t);
    out.println("Total encomenda: " + total);
      
    
    EnumMap<Cafe, Double> precos = new EnumMap<Cafe, Double>(Cafe.class);
    precos.put(Cafe.Vazio, 0.0);
    precos.put(Cafe.Curto, 0.4);
    precos.put(Cafe.Normal, 0.5);
    precos.put(Cafe.Cheio, 0.55);
    precos.put(Cafe.XCheio, 0.55);
    
    EnumMap<Cafe, Integer> servidos = new EnumMap<Cafe, Integer>(Cafe.class);
    for(Cafe c : Cafe.values()) servidos.put(c, 0);
    //
    
    
  }
}