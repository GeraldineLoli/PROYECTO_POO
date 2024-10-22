
package Clases;

public class Cliente extends Persona {
    private String codigoCliente;

    public Cliente(String codigoCliente, String documentoIdentificacion, String nombre, String telefono, String direccion, String email) {
        super(documentoIdentificacion, nombre, telefono, direccion, email);
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
}
