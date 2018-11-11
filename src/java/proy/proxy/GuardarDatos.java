/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.proxy;

import proy.entidad.Empresa_;

/**
 *
 * @author Jonathan
 */
public class GuardarDatos implements IGuardar{

    @Override
    public void save(Empresa_ e) {
        if(ConnectionManager.hayConexion()){
            new ObjetoRemoto().save(e);
        }
        else{
            new Ejecucion().save(e);
        }
    }
    
}
