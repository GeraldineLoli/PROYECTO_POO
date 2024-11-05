
package HashSet;

import Clases.Acompañante;
import java.util.HashSet;
import java.util.Set;


public class AcompañanteSet {
    Set<Acompañante> acompañantes = new HashSet<>();
    
    public void agregar (Acompañante acompañante) {
        acompañantes.add(acompañante);
    }
    
    public void eliminar (Acompañante acompañante) {
        acompañantes.remove(acompañante);
    }
    
    public HashSet<Acompañante> obtener() {
        return new HashSet<>(acompañantes);
    }
    
    public Set<Acompañante> listar(){
        return this.acompañantes;
    }
    
}
