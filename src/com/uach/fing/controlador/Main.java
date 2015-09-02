/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uach.fing.controlador;

import com.uach.fing.tienda.Producto;
import com.uach.fing.tienda.dao.ProductoDao;
import java.util.List;

/**
 *
 * @author armando
 */
public class Main {

    public static void main(String[] args) {
        List<Producto> productos = new ProductoDao().lista();

        //Numero de productos con existencia mayor a 20 
        Long a = productos.stream().filter(p -> {
            return p.getcantidad() > 20;
        }).count();
        System.out.println("Cantidad de productos existencia mayor a 20 = " + a);

        //Numero de productos con existencia menor a 15
        Long b = productos.stream().filter(p -> {
            return p.getcantidad() < 15;
        }).count();
        System.out.println("Cantidad de productos existencia menor a 15 = " + b);

        //Productos con precio mayor a 15.5
        Long c = productos.stream().filter(p -> {
            return p.getPrecio() > 15.5;
        }).count();
        System.out.println("Productos con precio mayor a 15.50 = " + c);

        //Productos con precio mayor a 20.30 y menor a 45
        Long d = productos.stream().filter(p -> {
            return p.getPrecio() > 20.30 && p.getPrecio() < 45;
        }).count();
        System.out.println("Productos con precio mayor a 20.30 y menor a 45 = " + c);

        //Clasificación 1
        Long e = productos.stream().filter(p -> {
            return p.getClasificacion() == 1;
        }).count();
        System.out.println("Productos clasificacion 1 = " + e);

        //Clasificación 2
        Long f = productos.stream().filter(p -> {
            return p.getClasificacion() == 2;
        }).count();
        System.out.println("Productos clasificación 2 = " + f);

    }
}
