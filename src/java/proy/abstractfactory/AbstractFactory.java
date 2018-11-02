/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.abstractfactory;

import proy.entidad.Consorcio;
import proy.entidad.Independiente;

/**
 *
 * @author Jonathan
 */
public abstract class AbstractFactory {
    public abstract Consorcio getConsorcio(String consorcio);
    public abstract Independiente getIndependiente(String independiente);
}
