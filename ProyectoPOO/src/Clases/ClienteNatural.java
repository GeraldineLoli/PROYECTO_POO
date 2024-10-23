
package Clases;

public class ClienteNatural extends Cliente{
    private String fechaNacimiento;

    public ClienteNatural(String fechaNacimiento, String codigoCliente, String documentoIdentificacion, String nombre, String telefono, String direccion, String email) {
        super(codigoCliente, documentoIdentificacion, nombre, telefono, direccion, email);
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
