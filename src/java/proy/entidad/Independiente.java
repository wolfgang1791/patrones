/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.entidad;

import java.util.List;
import proy.interfac.IEmpresa;

/**
 *
 * @author Jonathan
 */
public class Independiente extends Empresa implements IEmpresa{
    
    private float tarifageneral = 0;
    
    public Independiente(){
        super();
    }

    @Override
    public void calcularTarifa(int n) {
        for(int i=0;i<n;i++){
            tarifageneral += 0.07;
        }
    }

    public float getTarifageneral() {
        return tarifageneral;
    }

    public void setTarifageneral(float tarifageneral) {
        this.tarifageneral = tarifageneral;
    }

    @Override
    public String toString() {
        return "Independiente{" + "tarifageneral=" + tarifageneral + '}';
    }
    
    
}
