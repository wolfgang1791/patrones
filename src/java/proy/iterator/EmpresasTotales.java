/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.iterator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import proy.entidad.Empresa_;

/**
 *
 * @author Jonathan
 */
public class EmpresasTotales {
    private List<Empresa_> empresas = new ArrayList<>();
    /*
    public EmpresasTotales(String tipo){
        this.tipo = tipo;
    }
    */
    public void add(ResultSet rs) throws SQLException{
        while (rs.next()) {
            Empresa_ e_ = new Empresa_();
            e_.setId(rs.getInt(1));
            e_.setNombre(rs.getString(2));
            e_.setImagen(rs.getString(3));
            e_.setTipo(rs.getString(4));
            empresas.add(e_);
        }
        
    }
    
    public EmpresasTotalesIterator iterator(){
        return new EmpresasTotalesIterator(empresas);   
    }
}
