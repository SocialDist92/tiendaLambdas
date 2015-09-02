
package com.uach.fing.tienda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User1
 */
public class Conexion {
    
    //Se aplica el patron singleton para que no se instancie más de una conexion
    
    private static Conexion conexion;
    private Connection connection;
    
    private Conexion(){
        
    }
    
    public static Conexion getInstance(){
        if(conexion ==null){
            conexion = new Conexion();
        }
        return conexion;     
        
    }
    
    public Connection getConexion(){
        if (connection == null) {
            String driver = "org.postgresql.Driver";
            String cadenaConexion ="jdbc:postgresql://localhost:5432/usuarios";
            String user = "armando";
            String password = "";
            
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(cadenaConexion, user, password);
            } catch (ClassNotFoundException | SQLException e) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
                //TODO atender recuperación a fallos
            }
        }
        return this.connection;
    }
}
