
package ArrayList;

import Clases.Trabajador;
import java.util.ArrayList;

public class TrabajadorList {
    private ArrayList<Trabajador> listaTrabajadores;

    public TrabajadorList(){
        listaTrabajadores = new ArrayList<>();
    }
    
    public void agregarTrabajador(Trabajador trabajador) {
        listaTrabajadores.add(trabajador);
    }
    
    public boolean eliminarTrabajador(String codigoTrabajador) {
        for (Trabajador t: listaTrabajadores){
            if(t.getCodigoTrabajador().equals(codigoTrabajador)) {
                listaTrabajadores.remove(t);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Trabajador> getListaTrabajadores(){
        return listaTrabajadores;
    }
    
}
