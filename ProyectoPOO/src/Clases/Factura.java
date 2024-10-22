
package Clases;

public class Factura {
    private Cliente cliente;
    private Reserva reserva;
    private double montoTotal;
    private String fechaEmision;

    public Factura() {
    }
    
    public Factura(Cliente cliente, Reserva reserva, double montoTotal, String fechaEmision) {
        this.cliente = cliente;
        this.reserva = reserva;
        this.montoTotal = montoTotal;
        this.fechaEmision = fechaEmision;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
}
