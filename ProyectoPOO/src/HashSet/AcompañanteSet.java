
package HashSet;

import Clases.Acompañante;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class AcompañanteSet {
    Set<Acompañante> acompañantes = new HashSet<>();
    
    public void agregar (Acompañante a) {
        acompañantes.add(a);
    }
    
    public void eliminar (Acompañante a) {
        acompañantes.remove(a);
    }
    
    public HashSet<Acompañante> obtener() {
        return new HashSet<>(acompañantes);
    }
    
    public Set<Acompañante> listar(){
        return this.acompañantes;
    }
    
    public Acompañante obtener(int indice) {
        Iterator<Acompañante> iterador = acompañantes.iterator();
        int contador = 0;
        while (iterador.hasNext()) {
            Acompañante a = iterador.next();
            if (contador == indice) {
                return a;
            }
            contador++;
        }
        return null;
    }
}
