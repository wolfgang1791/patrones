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
    
    private Double tarifageneral = 2.00;
    private Double universitario;
    private Double escolar;
    
    
    public Consorcio(){
        super();
    }

    @Override
    public void calcularTarifa() {
        universitario = tarifageneral/2;
        escolar = universitario/2;
    }

    public Double getTarifageneral() {
        return tarifageneral;
    }

    public void setTarifageneral(Double tarifageneral) {
        this.tarifageneral = tarifageneral;
    }

    public Double getUniversitario() {
        return universitario;
    }

    public void setUniversitario(Double universitario) {
        this.universitario = universitario;
    }

    public Double getEscolar() {
        return escolar;
    }

    public void setEscolar(Double escolar) {
        this.escolar = escolar;
    }
    
    
}
