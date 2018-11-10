/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.mediator;

/**
 *
 * @author Jonathan
 */
public class Usuario implements IUsuario{
    private String name;
    private String pass;
    
    private UsuarioMediator um;
    
    public Usuario(UsuarioMediator um){
        this.um = um;
    }
    
    @Override
    public boolean recibe(String de, String msg) {
        
        if(name.equals(de) && pass.equals(msg))
        {    
            System.out.println(name+" "+de+" "+" "+msg+" "+pass);
            return true;
        } 
        else{
            return false;
        }
    }

    @Override
    public boolean envia(String a, String msg) {
        return um.envia(name, a, msg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsuarioMediator getUm() {
        return um;
    }

    public void setUm(UsuarioMediator um) {
        this.um = um;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}
