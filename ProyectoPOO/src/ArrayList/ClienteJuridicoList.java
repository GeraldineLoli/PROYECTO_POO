/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.ClienteJuridico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ClienteJuridicoList {
    List <ClienteJuridico> listaClienteJuridico = new ArrayList<>();
    
    public void agregar(ClienteJuridico cj){
        listaClienteJuridico.add(cj);
    }
    
     public void quitar(ClienteJuridico cj){
        listaClienteJuridico.remove(cj);
    }
     
    public List<ClienteJuridico> listar(){
          return this.listaClienteJuridico;
    }
}
