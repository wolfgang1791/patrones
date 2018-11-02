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
public class IndependienteFactory extends AbstractFactory{

    @Override
    public Consorcio getConsorcio(String consorcio) {
        return null;
    }

    @Override
    public Independiente getIndependiente(String independiente) {
        if(independiente.equals(""))
           return null;
       
       if(independiente.equals("independiente"))
           return new Independiente();
       
       return null;
    }
    
}
