/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.ClienteNatural;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ClienteNaturalList {
    List <ClienteNatural> listaClienteNatural = new ArrayList<>();
    
    public void agregar(ClienteNatural cn){
        listaClienteNatural.add(cn);
    }
    
     public void quitar(ClienteNatural cn){
        listaClienteNatural.remove(cn);
    }
     
    public List<ClienteNatural> listar(){
          return this.listaClienteNatural;
    }
}
