/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.proxy;

import java.util.Random;
import proy.commander.Receptor;
import proy.entidad.Empresa_;

/**
 *
 * @author Jonathan
 */
public class ObjetoRemoto implements IGuardar{
    
    @Override
    public void save(Empresa_ e) {
       Receptor r = Receptor.getInstance();
       r.reg_empresa(e); 
    }
    
}
