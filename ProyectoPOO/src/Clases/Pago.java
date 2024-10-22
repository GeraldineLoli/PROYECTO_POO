
package Clases;

public class Pago {
    private double monto;
    private String metodoPago;
    private boolean terminado;

    public Pago(double monto, String metodoPago, boolean terminado) {
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.terminado = terminado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
    
    public void procesarPago() {
        this.terminado = true;
    }
    
}
