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
public class JefeCocina extends Persona{
    
    Cocina cocina;

    public JefeCocina(String nombres, String apellidos) {
        super(nombres, apellidos);
    }
    
    @Override
    public String toString(){
        return("Boss: " + this.getApellidos() + " " + this.getNombres());
    }
    
    
    
    
}
