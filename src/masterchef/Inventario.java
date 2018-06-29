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
    
    public Ingrediente getIngrediente(String nombre){
    
        for (int i=0; i<ingredientes.length;i++){
            if(ingredientes[i].getNombre()==nombre){
                System.out.println("Ingredientes Name: "+ingredientes[i].getNombre() + "Ingredientes Cantidad: "+ingredientes[i].getCantidad());
                i+=ingredientes.length;
            }
            else{
                System.out.println("No hay");
            }
            
        }
        
        return ingrediente;
    }
    
    @Override
    public String toString(){
        return ("Ingrediente 1: "+ ingredientes[1]);
    
    }
 
    
       
    
    
}
