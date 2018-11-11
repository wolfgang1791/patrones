/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.observer;

import java.util.List;
import proy.entidad.Ruta;

/**
 *
 * @author Jonathan
 */
public class EstadoListar {
    
    public List<Ruta> devolverruta(String listar){
        if(listar.equals("listar")){
            Observer o = new Observer();
            return o.listar();
        }
        else{
            return null;
        }
    }
}
