
package Clases;

public class Contrato {
    private String numeroContrato;
    private String fechaInicio;
    private String fechaFin;

    public Contrato() {
    }

    public Contrato(String numeroContrato, String fechaInicio, String fechaFin) {
        this.numeroContrato = numeroContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
