/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.MasterChef;

/**
 *
 * @author jaironino
 */
public class Ingrediente {
    private String nombre;
    private int cantidad;
    private String unidad;
    
    public Ingrediente(String nombre) {
        this.nombre = nombre;
    }
    
    public Ingrediente(String nombre, int cantidad, String unidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getCantidad() {
        return cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    @Override
    public String toString(){
        return ("Ingrediente: " +getNombre() + " Cantidad: " +getCantidad() + " " + getUnidad());
                
    }
    
    
}
