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
public class RecetaArepaQueso implements Receta{
    private static final int PRECIO_PORCION_COMPLETA = 2500;
    private static final double PRECIO_PORCION_MEDIA = 0.8*PRECIO_PORCION_COMPLETA;
    
    
    private String nombre;
    private Ingrediente ingrediedientes [] = new Ingrediente[3];
    private int precio;

    public RecetaArepaQueso(String nombre) {
        this.nombre = nombre;
        
    }
    
    public void setIngredienteReceta(String nombre, int cantidad, String unidades){}
    
    
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public int getPrecioPorcionCompleta(){
        return PRECIO_PORCION_COMPLETA;
    }
    
    @Override
    public int getPrecioPorcionMedia(){
        return (int)PRECIO_PORCION_MEDIA;
    }
    

    
}
