/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.abstractfactory;

import proy.abstractfactory.factory.ConsorcioFactory;
import proy.abstractfactory.factory.IndependienteFactory;

/**
 *
 * @author Jonathan
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        
        if(choice.equalsIgnoreCase("consorcio")){
          return new ConsorcioFactory();  
        }
        else if(choice.equalsIgnoreCase("independiente")){
          return new IndependienteFactory();
        }
        return null;
    }
}
