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
public abstract interface Receta {
    //private static final int PRECIO_RECETA_AH = 500;
    
    
    /*private String nombre;
    private Ingrediente ingrediedientes [] = new Ingrediente[3];
    private String i1,i2,i3,unidades;
    private int cantidad;
    private int precio;*/

    public String getNombre();
    public void setIngredienteReceta(String nombre, int cantidad, String unidades);
    public int getPrecioPorcionCompleta();
    public int getPrecioPorcionMedia();
    
    /*public Receta(String nombre) {
        this.nombre = nombre;
        
    }*/
    
    

    /*public void setIngredienteReceta(String nombre, int cantidad, String unidades) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidades = unidades;
    }*/
    
}
