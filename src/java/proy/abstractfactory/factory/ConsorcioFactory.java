/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.abstractfactory.factory;

import proy.abstractfactory.AbstractFactory;
import proy.entidad.Consorcio;
import proy.entidad.Independiente;

/**
 *
 * @author Jonathan
 */
public class ConsorcioFactory extends AbstractFactory {

    @Override
    public Consorcio getConsorcio(String consorcio) {
        if(consorcio.equals(""))
           return null;
       
       if(consorcio.equals("consorcio"))
           return new Consorcio();
       
       return null;
    }

    @Override
    public Independiente getIndependiente(String independiente) {
        return null;
    }
    
}
