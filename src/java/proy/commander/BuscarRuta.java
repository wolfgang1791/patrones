/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.commander;

import java.util.List;
import proy.entidad.Paradero;

/**
 *
 * @author Jonathan
 */
public class BuscarRuta implements IBuscarRuta{
    
    public Receptor r;
    
    @Override
    public List<Paradero> buscar(String paradero) {
        return r.obtener_(paradero);
    }
    
}
