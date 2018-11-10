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
    
    public static Connection _connection = null; 
    
    private Conexion(){
        try {
            DriverManager.registerDriver(new Driver());
            _connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_patrones","root","");
            System.out.println("Conecto p");
        } 
        catch (SQLException e)
        {
            System.out.println("Error al registrar el controlador "+ e.getMessage());
        }
    }
    
    public static Connection initialize(){
        if (_connection == null){
            new Conexion();
        }
        else{
            System.out.println("No se puede crear el objeto porque ya existe un objeto de la clase");
        }
        
        return _connection;
    }
}
