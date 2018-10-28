/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.dao;

import java.sql.Connection;
import proy.conexion.Conexion;

/**
 *
 * @author Jonathan
 */
public class Test {
    public static void main(String[] args){
        Connection c = Conexion.initialize();
        System.out.println(c);
    }
}
