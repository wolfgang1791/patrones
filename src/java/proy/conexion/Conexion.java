/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.conexion;

import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Jonathan
 */

public class Conexion {
    
    public static Connection _connection; 
    public static Conexion conexion; 
    
    private Conexion(){}
    
    public static Conexion initialize(){
        if (conexion == null){
            conexion = new Conexion();
        }
        else{
            System.out.println("No se puede crear el objeto porque ya existe un objeto de la clase");
        }
        
        return conexion;

    }
    
    public Connection conectar(){
        try {
            DriverManager.registerDriver(new Driver());
            _connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_patrones","root","");
            System.out.println("Conecto p");
            return _connection;
        } 
        catch (SQLException e)
        {
            System.out.println("Error al registrar el controlador "+ e.getMessage());
            return null;
        }
    }
    /*
    public Vector listCustomer(String pais, String ciudad){
       // initialize();
        Vector<String> customer = new Vector<String>();
        String sql = "SELECT c.first_name, c.last_name, a.address, " +
        "c.email FROM customer c JOIN address a ON " +
        " c.address_id = c.address_id JOIN city y ON " +
        " a.city_id = y.city_id JOIN country o ON " +
        " y.country_id = o.country_id " +
        " WHERE o.country= ? and y.city = ? ";
        PreparedStatement pstm = null;
        try {
        pstm = _connection.prepareStatement(sql);
        pstm.setString(1, pais);
        pstm.setString(2, ciudad);

        ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
            String nombre = resultSet.getString(1);
            String apellido = resultSet.getString(2);
            String direccion = resultSet.getString(3);
            String correo = resultSet.getString(4);
            String cadena = nombre + "\n" + apellido + "\n" +
            direccion + "\n" + correo;
            customer.add(cadena);
        }
        }catch (SQLException e) {
        System.out.println("Error crear la sentencia "
        + e.getMessage());
        }
        return customer;
    }
    */
}
