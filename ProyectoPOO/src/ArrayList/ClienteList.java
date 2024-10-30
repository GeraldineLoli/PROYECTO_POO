package ArrayList;

import Clases.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteList {
    List <Cliente> listaCliente = new ArrayList<>();
    
    public void agregar(Cliente C){
        listaCliente.add(C);
    }
    
     public void quitar(Cliente C){
        listaCliente.remove(C);
    }
     
      public Cliente obtener(int pos){
        return listaCliente.get(pos);
    }
      
      public List<Cliente> listar(){
          return this.listaCliente;
      }

    public int tamaño() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
