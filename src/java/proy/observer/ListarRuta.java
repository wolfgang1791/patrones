/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class ListarRuta implements Subject{
    private static List<IListarRuta> observadores = new ArrayList<IListarRuta>();
    @Override
    public void attach(IListarRuta obs) {
        observadores.add(obs);
    }

    @Override
    public void dettach(IListarRuta obs) {
        observadores.remove(obs);
    }

    @Override
    public void notifyobserver() {
        for (int i = 0; i < observadores.size(); i++) {
            observadores.get(i).listar();
        }
    }
    
}
