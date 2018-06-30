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
public class Plato {
     
    
    private int precio;
    private Receta receta;
    private RecetaArepaCarne recetaArepaCarne;
    private RecetaArepaQueso recetaArepaQueso;
    private RecetaArepaHuevo recetaArepaHuevo;
    
    private String porcion;

    public Plato(Receta receta, String porcion) {
        this.receta = receta;
        this.porcion = porcion;
        recetaArepaHuevo = new RecetaArepaHuevo(receta.getNombre());
        recetaArepaQueso = new RecetaArepaQueso(receta.getNombre());
        recetaArepaCarne = new RecetaArepaCarne(receta.getNombre());
        
                
    }

    public Receta getReceta() {
        return receta;
    }
    

    public String getPorcion() {
        return porcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPorcion(String porcion) {
        this.porcion = porcion;
    }
    
    public int getPrecio() {
        
        
        switch (receta.getNombre().toLowerCase()){
            case "arepa huevo":{
                //recetaArepaHuevo = new RecetaArepaHuevo(receta.getNombre());
                precio = recetaArepaHuevo.getPrecioPorcionCompleta();
                if(this.porcion.equals("Medio")){
                    precio = recetaArepaHuevo.getPrecioPorcionMedia();
                }
                
                break;
                
            }
                
            case "Arepa Carne":{
                precio = recetaArepaCarne.getPrecioPorcionCompleta();
                if(this.porcion.equals("Medio")){
                    precio = recetaArepaCarne.getPrecioPorcionMedia();
                }
                break;
                
                
            }
            case "Arepa Queso":{
                precio = recetaArepaQueso.getPrecioPorcionCompleta();
                if(this.porcion.equals("Medio")){
                    precio = recetaArepaQueso.getPrecioPorcionMedia();
                }
                break;
                
                
            }
        
        }
        
        return precio;
    }
    
    
    
}
