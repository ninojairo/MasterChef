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
public class Inventario {
    
    private Ingrediente ingredientes [];
    //private Ingrediente ingredientes [] = new Ingrediente[50];
    //private int i=0;
    //private int contadorIngredientes =0;
    
    public Inventario() {
        
    }
    
    
    public Inventario(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    @Override
    public String toString(){
        return ("Ingrediente 1: "+ ingredientes);
    
    }
 
    
    /*public void setInventario(String nombre, int cantidad, String unidades){
        
        ingredientes[contadorIngredientes] = new Ingrediente(nombre,cantidad, unidades);
        System.out.println("Ingredient Added: " + ingredientes[contadorIngredientes].toString());
        contadorIngredientes++;
        
    }*/
    
    /*public String getInventario(){
        
        if (contadorIngredientes >0){
            for(int j=0; j<contadorIngredientes;j++){
                System.out.println("Ingredients in stock: " + ingredientes[j].toString());
            }
        }
        
        else{
            System.out.println("No hay ingredientes");
        }
        return "listado devuelto";
    
    }*/
    
    /*public int obtenerCantidadIngrediente(){
        int cantidadIngrediente =0;
        
        
        return cantidadIngrediente;
        
    }*/
    
       
    
    
}
