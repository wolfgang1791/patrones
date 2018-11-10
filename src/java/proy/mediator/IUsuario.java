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
public interface IUsuario {
    public boolean recibe(String de, String msg);
    public boolean envia(String a,String msg);
}
