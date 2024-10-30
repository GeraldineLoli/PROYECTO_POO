
package ArrayList;

import Clases.Habitacion;
import java.util.ArrayList;
import java.util.List;


public class HabitacionList {
    List<Habitacion> listaHabitaciones = new ArrayList<>();
    
    public void agregar(Habitacion h){
        listaHabitaciones.add(h);
    }
    
    public void quitar(Habitacion h){
        listaHabitaciones.remove(h);
    }
    
    public Habitacion obtener(int pos){
        return listaHabitaciones.get(pos);
    }
    
    public List<Habitacion> listar(){
        return this.listaHabitaciones;
    }
    
    public int tamaño(){
        return listaHabitaciones.size();
    }
}
