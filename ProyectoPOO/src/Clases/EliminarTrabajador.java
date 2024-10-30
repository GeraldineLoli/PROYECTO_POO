
package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EliminarTrabajador {
    private static final String ARCHIVO_TRABAJADORES = "trabajadores.txt";
    
    public static void eliminarTrabajador(JTable tabla){
        int filaSeleccionada = tabla.getSelectedRow();
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(null,
                    "Por favor, seleccione un trabajador para eliminar",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String documento = tabla.getValueAt(filaSeleccionada, 0).toString();
        
        int confirmacion = JOptionPane.showConfirmDialog(null,
                "¿Está usted seguro de eliminar a este trabajador?",
                "Confirmar eliminacion",
                JOptionPane.YES_NO_OPTION);
        if(confirmacion == JOptionPane.YES_OPTION){
            if(eliminarDelArchivo(documento)){
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.removeRow(filaSeleccionada);
                
                JOptionPane.showMessageDialog(null,
                        "Trabajador eliminado exitosamente",
                        "Exito",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el trabajador",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static boolean eliminarDelArchivo(String documento){
        ArrayList<String> lineas = new ArrayList<>();
        boolean encontrado = false;
        
        try(BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_TRABAJADORES))){
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                if(!datos[0].equals(documento)){
                    lineas.add(linea);
                } else {
                    encontrado = true;
                }
            }
        } catch (IOException e){
            return false;
        }
        
        if(!encontrado){
            return false;
        }
        
        try(PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO_TRABAJADORES))){
            for(String linea: lineas){
                pw.println(linea);
            }
            return true;
        } catch (IOException e){
            return false;
        }
    }
}
