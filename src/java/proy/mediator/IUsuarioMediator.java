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
public interface IUsuarioMediator {
    public void registra(Usuario u);
    public boolean envia(String de,String a,String msj);
}
