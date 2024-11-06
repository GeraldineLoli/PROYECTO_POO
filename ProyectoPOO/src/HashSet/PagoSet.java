package HashSet;

import Clases.Pago;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PagoSet {
    Set<Pago> Pagos = new HashSet<>();
    
    public void agregar (Pago a) {
        Pagos.add(a);
    }
    
    public void eliminar (Pago p) {
        Pagos.remove(p);
    }
    
    public HashSet<Pago> obtener() {
        return new HashSet<>(Pagos);
    }
    
    public Set<Pago> listar(){
        return this.Pagos;
    }
    
    public Pago obtener(int indice) {
        Iterator<Pago> iterador = Pagos.iterator();
        int contador = 0;
        while (iterador.hasNext()) {
            Pago p = iterador.next();
            if (contador == indice) {
                return p;
            }
            contador++;
        }
        return null;
    }
}
