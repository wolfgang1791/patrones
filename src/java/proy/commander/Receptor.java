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
import proy.entidad.Empresa_;
import proy.entidad.Paradero;

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
        String sql = "select e.id_empresa,e.nombre,e.imagen,r.id_ruta,r.codigo_ruta,e.tipo from empresa e, ruta r, empresa_ruta er,ruta_paradero rp, paradero p where p.descripcion like '%"+paradero+"%' and p.id_paradero = rp.id_paradero and rp.id_ruta = r.id_ruta and r.id_ruta = er.id_ruta and e.id_empresa = er.id_empresa group by id_empresa;";
        PreparedStatement ps = null;
        try {
            ps = _conn.prepareStatement(sql);//
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Empresa e = new Empresa();
                    e.setId_empresa(rs.getInt(1));
                    e.setNombre(rs.getString(2));
                    e.setImagen(rs.getString(3));
                    e.setId_ruta(rs.getInt(4));
                    e.setCodigo_ruta(rs.getString(5));
                    e.setTipo(rs.getString(6));
                    list.add(e);
                }
        }catch (SQLException e) {
            System.out.println("Error crear la sentencia "+ e.getMessage());
        }
        return list;
    }
    
    public List<Paradero> obtener_(String paradero){
        List<Paradero> list = new ArrayList<Paradero>();
        String sql = "select p.id_paradero,p.descripcion,p.latitud,p.longitud from ruta_paradero rp, paradero p where  rp.id_ruta = (select rp.id_ruta from ruta_paradero rp, paradero p where p.descripcion like '%"+paradero+"%'  and rp.id_paradero = p.id_paradero limit 1) and p.id_paradero <= (select p.id_paradero from ruta_paradero rp, paradero p where p.descripcion like '%"+paradero+"%' and rp.id_paradero = p.id_paradero) and rp.id_paradero = p.id_paradero;";
        PreparedStatement ps = null;
        try {
            ps = _conn.prepareStatement(sql);
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                   Paradero p = new Paradero();
                   p.setId_paradero(rs.getInt(1));
                   p.setDescripcion(rs.getString(2));
                   p.setLatitud(rs.getDouble(3));
                   p.setLongitud(rs.getDouble(4));
                   list.add(p);
                }
        }catch (SQLException e) {
        System.out.println("Error crear la sentencia "+ e.getMessage());
        }
        return list;
    }
    
    public ResultSet obtener_todos(){
        ResultSet rs = null;
        String sql = "select * from empresa";
        PreparedStatement ps = null;
        try {
            ps = _conn.prepareStatement(sql);
            System.out.println(sql);
            rs = ps.executeQuery();
                /*while (rs.next()) {
                   Empresa_ e_ = new Empresa_();
                   e_.setId(rs.getInt(1));
                   e_.setNombre(rs.getString(2));
                   e_.setImagen(rs.getString(3));
                   e_.setTipo(rs.getString(4));
                   list.add(e_);
                }*/
        }catch (SQLException e) {
        System.out.println("Error crear la sentencia "+ e.getMessage());
        }
        return rs;
    }
        
}