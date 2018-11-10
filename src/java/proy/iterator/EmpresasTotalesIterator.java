/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.iterator;

import java.util.Iterator;
import java.util.List;
import proy.entidad.Empresa_;

/**
 *
 * @author Jonathan
 */
public class EmpresasTotalesIterator implements Iterator<Empresa_>{
    
    private List<Empresa_> map = null;
    private int inx = 0;
    
    public EmpresasTotalesIterator(List<Empresa_> map){
        this.map=map;
    }
    
    @Override
    public boolean hasNext() {
         if( inx < map.size() && map.get(inx) != null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Empresa_ next() {
        return map.get(inx++);
    }
    
}
