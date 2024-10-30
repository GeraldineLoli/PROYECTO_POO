
package ArrayList;

import Clases.Habitacion;
import java.util.ArrayList;
import java.util.List;


public class HabitacionList {
    List<Habitacion> listaHabitaciones = new ArrayList<>();
    
    public void agregarHabitacion(Habitacion h){
        listaHabitaciones.add(h);
    }
    
    public void quitarHabitacion(Habitacion h){
        listaHabitaciones.remove(h);
    }
    
    public Habitacion obtenerHabitacion(int pos){
        return listaHabitaciones.get(pos);
    }
    
    public List<Habitacion> listar(){
        return this.listaHabitaciones;
    }
    
    public Habitacion buscarHabitacion(int num) {
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNumHabitacion() == num) {
                return habitacion;
            }
        }
        return null;
    }
    
    public boolean ocuparHabitacion(int num) {
        Habitacion habitacion = buscarHabitacion(num);
        if (habitacion != null && !habitacion.estaDisponible()) {
            habitacion.setDisponibilidad(true);
            return true;
        }
        return false;
    }
    
     public boolean desocuparHabitacion(int num) {
        Habitacion habitacion = buscarHabitacion(num);
        if (habitacion != null && habitacion.estaDisponible()) {
            habitacion.setDisponibilidad(true);
            return true;
        }
        return false;
    }
     
}
