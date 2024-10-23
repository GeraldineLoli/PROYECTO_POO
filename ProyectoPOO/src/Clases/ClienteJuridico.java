
package Clases;

public class ClienteJuridico extends Cliente{
    private String razonSocial;
    private String RUC;

    public ClienteJuridico(String razonSocial, String RUC, String codigoCliente, String documentoIdentificacion, String nombre, String telefono, String direccion, String email) {
        super(codigoCliente, documentoIdentificacion, nombre, telefono, direccion, email);
        this.razonSocial = razonSocial;
        this.RUC = RUC;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    
    
}
