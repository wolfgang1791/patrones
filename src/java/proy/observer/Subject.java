/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.observer;

/**
 *
 * @author Jonathan
 */
public interface Subject {
    public void attach(IListarRuta obs);
    public void dettach(IListarRuta obs);
    public void notifyobserver();
}
