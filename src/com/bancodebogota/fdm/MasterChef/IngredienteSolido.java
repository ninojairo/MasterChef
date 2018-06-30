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
public class IngredienteSolido extends Ingrediente{
    
    public IngredienteSolido(String nombre) {
        super(nombre);
    }
    
    public IngredienteSolido(String nombre, int cantidad, String unidad) {
        super(nombre,cantidad, unidad);
    }
    
}
