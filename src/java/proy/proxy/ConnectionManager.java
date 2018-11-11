/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.proxy;

import proy.conexion.Conexion;

/**
 *
 * @author Jonathan
 */
public class ConnectionManager {
    private static boolean conexion;
    
    public ConnectionManager(){
        conexion = false;
    }
    
    public static void conectarse(){
        if(Conexion.initialize()!=null)
            conexion = true;
    }
    
    public static void desconectarse(){
        if(Conexion.initialize()==null)
            conexion = false;
    }
    
    public static boolean hayConexion(){
        return conexion;
    }
}
