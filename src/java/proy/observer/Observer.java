/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.observer;

import java.util.List;
import proy.commander.Receptor;
import proy.entidad.Ruta;

/**
 *
 * @author Jonathan
 */
public class Observer implements IListarRuta{
    
    private Receptor r = Receptor.getInstance();
    
    @Override
    public List<Ruta> listar() {
       return r.obtener_rutas();
    }
    
}
