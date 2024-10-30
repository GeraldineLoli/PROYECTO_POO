
package Clases;

import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ValidacionesTrabajador {
    
    private static final Pattern SOLO_NUMEROS = Pattern.compile("^[0-9]+$");
    private static final Pattern SOLO_LETRAS = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    
    public static boolean validarDocumento(String documento){
        if(!SOLO_NUMEROS.matcher(documento).matches() || documento.length()!=7){
            JOptionPane.showMessageDialog(null,
                    "El documento debe contener exactamente 7 dígitos numeros",
                    "Error de validacion",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean validarNombre(String nombre) {
        if (!SOLO_LETRAS.matcher(nombre).matches()) {
            JOptionPane.showMessageDialog(null,
                "El nombre solo debe contener letras y espacios",
                "Error de validación",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean validarTelefono(String telefono){
        if (!SOLO_NUMEROS.matcher(telefono).matches() || telefono.length() != 9) {
            JOptionPane.showMessageDialog(null,
                "El teléfono debe contener exactamente 9 dígitos numéricos",
                "Error de validación",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean validarEmail(String email) {
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            JOptionPane.showMessageDialog(null,
                "Por favor, ingrese un email válido",
                "Error de validación",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean validarCodigoTrabajador(String codigo) {
        if (!SOLO_NUMEROS.matcher(codigo).matches() || codigo.length() != 5) {
            JOptionPane.showMessageDialog(null,
                "El código debe contener exactamente 5 dígitos numéricos",
                "Error de validación",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean validarPuestoSeleccionado(JComboBox<String> cmbPuesto) {
        if (cmbPuesto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,
                "Por favor, seleccione un puesto válido",
                "Error de validación",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean validarCamposVacios(String... campos) {
        for (String campo : campos) {
            if (campo.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Todos los campos son obligatorios",
                    "Error de validación",
                    JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public static boolean validarTodosCampos(
            String documento,
            String nombre,
            String telefono,
            String direccion,
            String email,
            String codigo,
            JComboBox<String> cmbPuesto) {
        
        if (!validarCamposVacios(documento, nombre, telefono, direccion, email, codigo)) {
            return false;
        }
        return validarDocumento(documento) &&
               validarNombre(nombre) &&
               validarTelefono(telefono) &&
               validarEmail(email) &&
               validarCodigoTrabajador(codigo) &&
               validarPuestoSeleccionado(cmbPuesto);
    }
}
