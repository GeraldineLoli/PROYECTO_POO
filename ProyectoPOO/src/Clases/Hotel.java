
package Clases;

public class Hotel {
    private String nombre;
    private String direccion;
    private Habitacion[] listaHabitaciones;

    public Hotel(String nombre, String direccion, Habitacion[] listaHabitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaHabitaciones = listaHabitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Habitacion[] getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(Habitacion[] listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }
    
    public Habitacion buscarHabitacionDisponible() {
        for (Habitacion habitacion : listaHabitaciones){
            if(habitacion.EstaDisponible()){
                return habitacion;
            }
        }
        return null;
    }
}
