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
public class Consorcio extends Empresa implements IEmpresa{
    
    public Consorcio(){
        super();
    }

    @Override
    public void calcularTarifa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
