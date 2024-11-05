
package Clases;

public class Acompañante extends Persona {
    private Reserva reserva;

    public Acompañante() {
    }

    public Acompañante(Reserva reserva, String documentoIdentificacion, String nombre, String telefono, String direccion, String email) {
        super(documentoIdentificacion, nombre, telefono, direccion, email);
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
}
