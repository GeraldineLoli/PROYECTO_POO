
package Clases;

public class Trabajador extends Persona{
    private String codigoTrabajador;
    private String puesto;

    public Trabajador(String codigoTrabajador, String puesto, String documentoIdentificacion, String nombre, String telefono, String direccion, String email) {
        super(documentoIdentificacion, nombre, telefono, direccion, email);
        this.codigoTrabajador = codigoTrabajador;
        this.puesto = puesto;
    }

    public String getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(String codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
}
