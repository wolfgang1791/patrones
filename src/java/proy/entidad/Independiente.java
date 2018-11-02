/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.entidad;

import proy.interfac.IEmpresa;

/**
 *
 * @author Jonathan
 */
public class Independiente extends Empresa implements IEmpresa{
    
    private Double tarifageneral = 0.0;
    
    public Independiente(){
        super();
    }

    @Override
    public void calcularTarifa() {
  
    }
}
