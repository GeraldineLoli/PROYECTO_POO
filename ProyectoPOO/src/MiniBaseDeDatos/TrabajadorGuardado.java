
package MiniBaseDeDatos;

import Clases.Trabajador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TrabajadorGuardado {
    private static final String ARCHIVO_TRABAJADORES = "trabajadores.txt";
    
    public static void guardarTrabajador(Trabajador trabajador) {
        try (FileWriter fw = new FileWriter(ARCHIVO_TRABAJADORES, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)){
            String linea = String.format("%s,%s,%s,%s,%s,%s,%s",
                trabajador.getDocumentoIdentificacion(),
                trabajador.getNombre(),
                trabajador.getTelefono(),
                trabajador.getDireccion(),
                trabajador.getEmail(),
                trabajador.getCodigoTrabajador(),
                trabajador.getPuesto());
            out.println(linea);
        } catch (IOException e){
            System.err.println("error al guardar el trabajador: " + e.getMessage());
        }
    }
    
    public static ArrayList<Trabajador> cargarTrabajadores(){
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_TRABAJADORES))) {
            String linea;
            while ((linea=br.readLine())!= null) {
                String[] datos = linea.split(",");
                if(datos.length == 7){
                    Trabajador trabajador = new Trabajador(
                    datos[5],
                    datos[6],
                    datos[0],
                    datos[1],
                    datos[2],
                    datos[3],
                    datos[4]
                    );
                    trabajadores.add(trabajador);
                }
            }
        } catch (IOException e){
            System.err.println("Error al cargar los trabajadores: " + e.getMessage());
        }
        return trabajadores;
    }
    
    public static Trabajador buscarPorDocumento(String documento){
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_TRABAJADORES))){
            String linea;
            while((linea=br.readLine()) != null){
                String[] datos = linea.split(",");
                if(datos[0].equals(documento)){
                    return new Trabajador(
                    datos[5],
                    datos[6],
                    datos[0],
                    datos[1],
                    datos[2],
                    datos[3],
                    datos[4]
                    );
                }
            }
        } catch (IOException e){
            System.err.println("Error al cargar los trabajadores: " + e.getMessage());
        }
        return null;
    }
}
