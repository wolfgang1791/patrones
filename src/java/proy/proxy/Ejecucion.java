/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.proxy;

import java.util.ArrayList;
import java.util.List;
import proy.entidad.Empresa_;

/**
 *
 * @author Jonathan
 */
public class Ejecucion implements IGuardar{
    
    private static List<Empresa_> ejecucion_ = new ArrayList<Empresa_>();
    
    @Override
    public void save(Empresa_ e) {
       ejecucion_.add(e);
    }
    
}
