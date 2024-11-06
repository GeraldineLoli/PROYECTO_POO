
package Clases;

public class Habitacion {
    private int numHabitacion;
    private String tipoHabitacion;
    private String disponibilidad;
    private String numeroTelefonoHabitacion;

    public Habitacion() {
    }

    public Habitacion(int numHabitacion, String tipoHabitacion, String disponibilidad, String numeroTelefonoHabitacion) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.disponibilidad = disponibilidad;
        this.numeroTelefonoHabitacion = numeroTelefonoHabitacion;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String isDisponibilidad() {
        return disponibilidad;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getNumeroTelefonoHabitacion() {
        return numeroTelefonoHabitacion;
    }

    public void setNumeroTelefonoHabitacion(String numeroTelefonoHabitacion) {
        this.numeroTelefonoHabitacion = numeroTelefonoHabitacion;
    }

}
