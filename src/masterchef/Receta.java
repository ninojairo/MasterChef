/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterchef;

/**
 *
 * @author jaironino
 */
public class Receta {
    private String nombre;
    private Ingrediente ingrediedientes [] = new Ingrediente[3];
    private String i1,i2,i3,unidades;
    private int cantidad;
    

    public Receta(String nombre, Ingrediente[] ingrediedientes) {
        this.nombre = nombre;
        this.ingrediedientes = ingrediedientes;
    }
    
    public Receta(String nombre, String i1, String i2, String i3) {
        this.nombre = nombre;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }
    
    public Receta(String nombre) {
        this.nombre = nombre;
        
    }

    public void setReceta(String nombre, String i1, String i2, String i3) {
        this.nombre = nombre;
    }
    
    public void setIngredienteReceta(String nombre, int cantidad, String unidades) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidades = unidades;
    }
    
    
    
    
    
    
    
    
    
    
}
