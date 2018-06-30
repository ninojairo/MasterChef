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
public class Inventario {
    
    private Ingrediente ingredientes [];
    private Ingrediente ingrediente;
    //private Ingrediente ingredientes [] = new Ingrediente[50];
    //private int i=0;
    //private int contadorIngredientes =0;
    
    public Inventario() {
        
    }
    
    
    public Inventario(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public Ingrediente [] getInventario(){
        return ingredientes;
    
    }
    
    
    
    public boolean [] validarExistenciaIngredientesReceta(Ingrediente [] ingredientesReceta, Ingrediente [] ingredientes){
        boolean [] hayIngredientes = new boolean[3];
        
        for (int i=0; i<ingredientesReceta.length;i++){
            //System.out.println("RNombre: " +ingredientesReceta[i].getNombre()+ "RCantidad: " +ingredientesReceta[i].getCantidad());
            
            for(int j=0; j<ingredientes.length;j++){
            
                if(ingredientes[j].getNombre().toLowerCase().equals(ingredientesReceta[i].getNombre().toLowerCase())){
                    //System.out.println(" INombre: "+ingredientes[j].getNombre() + " ICantidad: "+ingredientes[j].getCantidad());
                    
                    if(ingredientesReceta[i].getCantidad()<=ingredientes[j].getCantidad() ){
                        System.out.println("Si hay ingrediente: " +ingredientes[j].getNombre() + "\tReceta: "+ingredientesReceta[i].getCantidad() + "\tInventario: "+ingredientes[j].getCantidad());
                        hayIngredientes[i]=true;
                    }
                    else{
                        System.out.println("No hay ingrediente: " +ingredientes[j].getNombre() + "\tReceta: "+ingredientesReceta[i].getCantidad() + " \tInventario: "+ingredientes[j].getCantidad());
                        hayIngredientes[i]=false;
                    }
                    
                    j+=ingredientes.length;
                    
                }
                else{
                    //System.out.println("No hay");
                }
            
            }
            
        }
        
        for(int k=0; k<hayIngredientes.length;k++){
            //System.out.println("Estados: "+ hayIngredientes[k]);
        }
        
        return hayIngredientes;
        
        
    
        
    }
    
    @Override
    public String toString(){
        return ("Ingrediente 1: "+ ingredientes[1]);
    
    }
 
    
       
    
    
}
