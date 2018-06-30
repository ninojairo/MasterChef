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
public abstract interface Receta {
    
    public String getNombre();
    public void setIngredienteReceta(String nombre, int cantidad, String unidades);
    public int getPrecioPorcionCompleta();
    public int getPrecioPorcionMedia();
    
}
