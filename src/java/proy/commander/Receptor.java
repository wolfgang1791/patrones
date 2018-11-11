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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import proy.conexion.Conexion;
import proy.entidad.Empresa;
import proy.entidad.Empresa_;
import proy.entidad.Paradero;
import proy.entidad.Ruta;
import proy.mediator.Usuario;

/**
 *
 * @author Jonathan
 */
public class Receptor {
    public static Receptor receptor = null;
    Connection _conn = null;
    
    private Receptor(){
     _conn = Conexion.initialize();
    }
    
    public static Receptor getInstance(){
        if(receptor == null){
            receptor = new Receptor(); 
        }
        return receptor;
    }
    
    public List<Empresa> obtener(String paradero){
       List<Empresa> list = new ArrayList<>();
        String sql = "select e.id_empresa,e.nombre,e.imagen,r.id_ruta,r.codigo_ruta,e.tipo from empresa e, ruta r, empresa_ruta er,ruta_paradero rp, paradero p where p.descripcion like '%"+paradero+"%' and p.id_paradero = rp.id_paradero and rp.id_ruta = r.id_ruta and r.id_ruta = er.id_ruta and e.id_empresa = er.id_empresa;";
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
        List<Paradero> list = new ArrayList<>();
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
        }catch (SQLException e) {
        System.out.println("Error crear la sentencia "+ e.getMessage());
        }
        return rs;
    }
    
    public List<Usuario> obtener_user(){
        List<Usuario> list = new ArrayList<>();
        String sql = "select * from usuario";
        PreparedStatement ps = null;
        try {
            ps = _conn.prepareStatement(sql);
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                   Usuario u = new Usuario(null);
                   u.setName(rs.getString(2));
                   u.setPass(rs.getString(3));
                   list.add(u);
                }
        }catch (SQLException e) {
        System.out.println("Error crear la sentencia "+ e.getMessage());
        }
        return list;
    }
    
    public List<Ruta> obtener_rutas(){
        List<Ruta> list = new ArrayList<>();
        String sql = "select * from ruta";
        PreparedStatement ps = null;
        try {
            ps = _conn.prepareStatement(sql);
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                   Ruta r = new Ruta();
                   r.setId(rs.getInt(1));
                   r.setDescripcion(rs.getString(2));
                   list.add(r);
                }
        }catch (SQLException e) {
        System.out.println("Error crear la sentencia "+ e.getMessage());
        }
        return list;
    }
    
    public void reg_empresa(Empresa_ e_){
        
        PreparedStatement ps=null;
        try {
            System.out.println("INSERT INTO empresa VALUES("+e_.getId()+",'"+e_.getNombre()+"','"+e_.getImagen()+"','"+e_.getTipo()+"');");
            System.out.println("INSERT INTO empresa_ruta VALUES("+e_.getId()+","+e_.getRuta()+");");
            
            ps =  _conn.prepareStatement("INSERT INTO empresa VALUES("+e_.getId()+",'"+e_.getNombre()+"','"+e_.getImagen()+"','"+e_.getTipo()+"');"); 
            ps.executeUpdate();
            
            ps =  _conn.prepareStatement("INSERT INTO empresa_ruta VALUES("+e_.getId()+","+e_.getRuta()+");"); 
            ps.executeUpdate();
            
            
            //_conn.close();
        }
        catch (SQLException e) {
            System.out.println("Error crear la sentencia "+ e.getMessage());
        } 
    }
        
}