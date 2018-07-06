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
public class Pedido {
    private Plato platos[];

    public Pedido(Plato[] platos) {
        this.platos = platos;
    }
    
    public void getPrecio(Receta receta){
        
        int precio=0;
        
        for(int i=0;i<platos.length;i++){
            precio += platos[i].getPrecio();
            System.out.println("Precio Plato: " +i + "\tReceta: " +receta.getNombre() + "\tPorcion: "+platos[i].getPorcion()  + "\tPrecio: " +platos[i].getPrecio());
        }
        System.out.println("Precio total:\t" +precio);
        
        
    }
    
    public void setPedido(){
    
    }
    
    public String toString(){
        return ("Pedido: " +platos.toString());
    }
    
}
