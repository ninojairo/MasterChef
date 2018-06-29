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
public class Pedido {
    private Plato platos[];

    public Pedido(Plato[] platos) {
        this.platos = platos;
    }
    
    public int getPrecio(Receta receta){
        
        int precio=0;
        
        for(int i=0;i<platos.length;i++){
            precio += platos[i].getPrecio();
        }
        
        
        return precio;
    
    }
    
    public void setPedido(){
    
    }
    
}
