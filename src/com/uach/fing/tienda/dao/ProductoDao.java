/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uach.fing.tienda.dao;

import com.uach.fing.tienda.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author armando
 */
public class ProductoDao implements Crud {
    

    public List<Producto> lista() {
        List <Producto> productos = new ArrayList<>();
        
        try {
            Statement st = Conexion.getInstance().getConexion().createStatement();
            ResultSet rs = st.executeQuery(
                String.format("SELECT %S FROM %S", 
                        Producto.CONSULTA, Producto.TABLA));
            while (rs.next()) {
                String id = rs.getString(Producto.FIELDS[0]);
                String descripcion = rs.getString(Producto.FIELDS[1]);
                Double precio = rs.getDouble(Producto.FIELDS[2]);
                Integer clasificacion = rs.getInt(Producto.FIELDS[3]);
                Integer cantidad = rs.getInt(Producto.FIELDS[4]);
                Integer existenciaMax = rs.getInt(Producto.FIELDS[5]);
                Integer existenciaMin = rs.getInt(Producto.FIELDS[6]);
                
                Producto usr = new Producto(id, descripcion, precio, clasificacion, cantidad, existenciaMax, existenciaMin);
                productos.add(usr);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
    
    }
    
}
