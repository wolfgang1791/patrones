/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.iterator;

import java.sql.ResultSet;
import proy.commander.Receptor;

/**
 *
 * @author Jonathan
 */
public class Data {
    private static Receptor _r = new Receptor();
    public static ResultSet loadData(){
       return _r.obtener_todos();
    }
}
