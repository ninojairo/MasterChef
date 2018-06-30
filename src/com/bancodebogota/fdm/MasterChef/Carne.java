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
public class Carne extends IngredienteContable{
    
    
    
    private int tipo; //Pollo, Carne, Res
    private String Parte;

    public Carne(String nombre) {
        super(nombre);
    }

    public int getTipo() {
        return tipo;
    }

    public String getParte() {
        return Parte;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setParte(String Parte) {
        this.Parte = Parte;
    }
    
    
    
}
