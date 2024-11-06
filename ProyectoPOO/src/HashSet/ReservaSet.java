
package HashSet;

import Clases.Reserva;
import java.util.HashSet;
import java.util.Iterator;

public class ReservaSet {
     private HashSet<Reserva> reservas;
    
    public ReservaSet() {
        reservas = new HashSet<>();
    }

    public boolean agregarReserva(Reserva reserva) {
        return reservas.add(reserva);
    }

    public boolean eliminarReserva(Reserva reserva) {
        return reservas.remove(reserva);
    }

    public boolean existeReserva(Reserva reserva) {
        return reservas.contains(reserva);
    }

    public int cantidadReservas() {
        return reservas.size();
    }

    public boolean estaVacio() {
        return reservas.isEmpty();
    }

    public void limpiarReservas() {
        reservas.clear();
    }

    public Iterator<Reserva> getIterator() {
        return reservas.iterator();
    }
    
    public Reserva buscarReservaPorFechas(String fechaInicio, String fechaFin) {
        for (Reserva reserva : reservas) {
            if (reserva.getFechaInicio().equals(fechaInicio) && 
                reserva.getFechaFin().equals(fechaFin)) {
                return reserva;
            }
        }
        return null;
    }

    public ReservaSet buscarReservasPorEstado(String estado) {
        ReservaSet resultado = new ReservaSet();
        for (Reserva reserva : reservas) {
            if (reserva.getEstado().equals(estado)) {
                resultado.agregarReserva(reserva);
            }
        }
        return resultado;
    }
    
    public HashSet<Reserva> getReservas() {
        return new HashSet<>(reservas);
    }
}
