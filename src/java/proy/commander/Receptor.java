/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.commander;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import proy.conexion.Conexion;
import proy.entidad.Empresa;

/**
 *
 * @author Jonathan
 */
public class Receptor {
    
    Connection _conn = null;
    
    public Receptor(){
     _conn = Conexion.initialize();
    }
    
    public List<Empresa> obtener(String paradero){
       List<Empresa> list = new ArrayList<Empresa>();
        String sql = "select e.id_empresa,e.nombre,e.imagen,r.id_ruta,r.codigo_ruta,p.id_paradero,p.descripcion,p.latitud,p.longitud from empresa e, ruta r, empresa_ruta er,ruta_paradero rp, paradero where p.descripcion = ? and p.id_paradero = rp.id_paradero and rp.id_ruta = r.id_ruta and r.id_ruta = er.id_ruta and e.id_empresa = er.id_empresa;";
        PreparedStatement ps = null;
        try {
            ps = _conn.prepareStatement(sql);
            ps.setString(1,paradero);
            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Empresa e = new Empresa();
                    e.setId_empresa(rs.getInt(1));
                    e.setNombre(rs.getString(2));
                    e.setImagen(rs.getString(3));
                    e.setId_ruta(rs.getInt(4));
                    e.setCodigo_ruta(rs.getString(5));
                    e.setId_paradero(rs.getInt(6));
                    e.setDescripcion(rs.getString(7));
                    e.setLatitud(rs.getDouble(8));
                    e.setLongitud(rs.getDouble(9));
                    list.add(e);
                }
        }catch (SQLException e) {
        System.out.println("Error crear la sentencia "
        + e.getMessage());
        }
        return list;
    }
        
}
