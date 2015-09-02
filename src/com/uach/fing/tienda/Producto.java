/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uach.fing.tienda;

/**
 *
 * @author armando
 */
public class Producto {
   
    public static final String TABLA = "productos";
    public static final String[] FIELDS = 
        {"id", "descripcion", "precio", "clasificacion",
            "cantidad", "existenciaMax", "existenciaMin"};
    public static final String CONSULTA = 
            "id, descripcion, precio, clasificacion, "
            + "cantidad, existenciaMax, existenciaMin";
    
    private String id;
    private String descripcion;
    private Double precio;
    private Integer clasificacion;
    private Integer cantidad;
    private Integer existenciaMax;
    private Integer existenciaMin;

    public Producto(String id, String descripcion, Double precio, Integer clasificacion, Integer cantidad, Integer existenciaMax, Integer existenciaMin) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.clasificacion = clasificacion;
        this.cantidad = cantidad;
        this.existenciaMax = existenciaMax;
        this.existenciaMin = existenciaMin;
    }

    /**
     * @return the id
     */
    public String getId() {
        
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the clasificacion
     */
    public Integer getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(Integer clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the cantidad
     */
    public Integer getcantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setcantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the existenciaMax
     */
    public Integer getExistenciaMax() {
        return existenciaMax;
    }

    /**
     * @param existenciaMax the existenciaMax to set
     */
    public void setExistenciaMax(Integer existenciaMax) {
        this.existenciaMax = existenciaMax;
    }

    /**
     * @return the existenciaMin
     */
    public Integer getExistenciaMin() {
        return existenciaMin;
    }

    /**
     * @param existenciaMin the existenciaMin to set
     */
    public void setExistenciaMin(Integer existenciaMin) {
        this.existenciaMin = existenciaMin;
    }
    
    
    
    
}
