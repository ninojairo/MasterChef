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
    
    private Ingrediente ingrediente [];
    private Ingrediente ingredientes [] = new Ingrediente[50];
    private int i=0;
    private int contadorIngredientes =0;
    
    
    public Inventario() {
        
    }
    
    
    public Inventario(Ingrediente[] ingredientes) {
        this.ingrediente = ingrediente;
    }
    
    public String AgregarIngrediente(String nombre, int cantidad, String unidades ){
        
        ingredientes[i++] = new Ingrediente(nombre,cantidad, unidades);
        contadorIngredientes ++;
        return "Ingredient added";
    }
    
    public String ObtenerCantidadTotalIngredientes(){
        
        String respuesta;
        System.out.println("indice: " +ingredientes.length);
        System.out.println("contador: " +contadorIngredientes);
        
        
        if (contadorIngredientes !=0){
            for(int i=0; i<=contadorIngredientes;i++){
                System.out.println("listado: " +i);
                System.out.println("Ingrediente adicionado" + ingredientes[i].toString());
            }
        }
        
        else{
            
            System.out.println("No hay ingredientes");
        }
            
            
        
        
        
        return "listado devuelto";
    
    }
    
    public int obtenerCantidadIngrediente(){
        int cantidadIngrediente =0;
        
        
        return cantidadIngrediente;
        
    }
    
    
    
}
