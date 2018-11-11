/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.mediator;

import java.util.HashMap;

/**
 *
 * @author Jonathan
 */
public class UsuarioMediator implements IUsuarioMediator {
    private HashMap<String,Usuario> login = new HashMap<String,Usuario>();
    
    @Override
    public void registra(Usuario u) {
       login.put(u.getName(), u);
    }

    @Override
    public boolean envia(String de, String a, String msj) {
        if(login.containsKey(a)){
            Usuario u = login.get(a);      
            return u.recibe(de, msj);
        }
        else{
            System.out.println("ya veremos");
            return false;
        }
    }
    
}
