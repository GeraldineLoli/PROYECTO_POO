
package Clases;

import HashSet.AcompañanteSet;

public class Reserva {
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    private AcompañanteSet listaAcompañantes = new AcompañanteSet();

    public Reserva(String fechaInicio, String fechaFin, String estado) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public AcompañanteSet getListaAcompañantes() {
        return listaAcompañantes;
    }

    public void setListaAcompañantes(AcompañanteSet listaAcompañantes) {
        this.listaAcompañantes = listaAcompañantes;
    }

    
}
