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

    public String getNombre() {
        return nombre;
    }
    
    public Receta(String nombre) {
        this.nombre = nombre;
        
    }

    public void setIngredienteReceta(String nombre, int cantidad, String unidades) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidades = unidades;
    }
    
}
