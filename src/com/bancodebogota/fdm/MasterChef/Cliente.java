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
public class Cliente extends Persona{
    
    private Pedido pedido [];
    private int edad;
    private String nombres;
    private String apellidos;
    
    

    public Cliente(String nombres, String apellidos) {
        super(nombres, apellidos);
    }

    public int getEdad() {
        return edad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    @Override
    public String toString(){
        return ("Cliente: " + getNombres() + " " + getApellidos());
    }    
    
    
}
