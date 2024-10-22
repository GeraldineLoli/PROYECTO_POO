
package Clases;

public class Habitacion {
    private String numHabitacion;
    private String tipoHabitacion;
    private boolean disponibilidad;
    private String numeroTelefonoHabitacion;

    public Habitacion() {
    }

    public Habitacion(String numHabitacion, String tipoHabitacion, boolean disponibilidad, String numeroTelefonoHabitacion) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.disponibilidad = disponibilidad;
        this.numeroTelefonoHabitacion = numeroTelefonoHabitacion;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getNumeroTelefonoHabitacion() {
        return numeroTelefonoHabitacion;
    }

    public void setNumeroTelefonoHabitacion(String numeroTelefonoHabitacion) {
        this.numeroTelefonoHabitacion = numeroTelefonoHabitacion;
    }
    
    public boolean EstaDisponible() {
        return disponibilidad;
    }
    
    public void reservarHabitacion() {
        this.disponibilidad = false;
    }
    
    public void desocuparHabitacion() {
        this.disponibilidad = true;
    }

}
