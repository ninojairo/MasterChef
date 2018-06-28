/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterchef;

import java.util.Scanner;

/**
 *
 * @author jaironino
 */
public class MasterChef {
    
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    
    public void main(){
    
    }
    
    public void crearCliente(){
        Cliente customer = new Cliente("Cristiano","Ronaldo");
    }
    
    public void crearIngredientes(){
        Ingrediente harina = new IngredienteContable("Harina", 5, "Kilos");
        Ingrediente huevo = new IngredienteContable("Huevo", 12, "Unidades");
        Ingrediente queso = new IngredienteContable("Huevo", 6, "Kilos");
        Ingrediente aceite = new IngredienteContable("Carrots", 15, "Litros");
        Ingrediente camarones = new IngredienteContable("Camarones", 10, "Kilos");
        Ingrediente carne = new IngredienteContable("Carne", 10, "Kilos");
    }
    
    public void crearInventario(){
        Inventario inventario = new Inventario();
        
    }
    
    public void crearReceta(){
         Receta recetaAH = new Receta("Arepa Huevo");
         Receta recetaAC = new Receta("Arepa Carne");
         Receta recetaAQ = new Receta("Arepa Queso");
         
         
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MasterChef masterChef = new MasterChef();
        masterChef.crearCliente();
        masterChef.crearIngredientes();
        masterChef.crearInventario();
        
        
                
        
                
        
        
        
        
        
        //Carga Recetas
        //Receta receta1 = new Receta("Arroz con Camarones", Ingrediente[new Ingrediente("Arroz", 1, "libra"),new Ingrediente("Arroz", 1, "libra")]);
        
        /*Receta receta1 = new Receta("Arroz con Camarones");
        receta1.setIngredienteReceta("Arroz", 1, "kilo");
        receta1.setIngredienteReceta("Camarones", 1, "kilo");
        receta1.setIngredienteReceta("Cebolla", 1, "unidad");
        
        Receta receta2 = new Receta("Arepa Huevo");
        receta1.setIngredienteReceta("Harina", 1, "kilo");
        receta1.setIngredienteReceta("Huevos", 2, "unidades");
        receta1.setIngredienteReceta("Aceite", 1, "litro");
        
        Receta receta3 = new Receta("Arepa Queso");
        receta1.setIngredienteReceta("Harina", 1, "kilo");
        receta1.setIngredienteReceta("Queso", 1, "kilo");
        receta1.setIngredienteReceta("Manteca", 1, "bloque");*/
        
        
        
        
        //inventario.AgregarIngrediente("Onions",200, "Unidades");
                   
        
        
        
        Ingrediente ingredients[] = {fish,meat,rice,carrots,beer,kola}; */
        
        //Inventario inventario = new Inventario(ingredients);
        
        JefeCocina jefeCocina = new JefeCocina("Pibe", "Valderrama");
        
        Cocina cocina = new Cocina("Black Pinguin", "Fish", "33 Avenue", "3155678",jefeCocina,inventario);
        /*System.out.println("Descripcion Cocina: " +cocina.toString());
        System.out.println("**** Inventario ****");
        System.out.println(+inventario.ObtenerCantidadTotalIngredientes());*/
        
        
        int opcion =-1;
        while (opcion!=0){
            System.out.println("***** WELCOME TO YOUR KITCHENS *****\n");
            
            System.out.println("Select your choice: \n");
            System.out.println("1: Inquiry the kitchen");
            System.out.println("2: Inquiry the kitchen's stock");
            System.out.println("3: Add Ingredient");
            
            System.out.println("0: Exit: \n");
            
            opcion = Integer.parseInt(scanner.nextLine());
            int anykey; 
            
            switch (opcion){
                
                case 1: {
                    System.out.println("**** Kitchen Features **** \n");
                    System.out.println("Kitchen: " +cocina.toString());
                    System.out.println("Press any key");
                    scanner.nextLine();
                    break;
                }
                case 2:{
                    System.out.println("**** Kitchen Stock **** \n");
                    inventario.getInventario();
                    System.out.println("Press any key");
                    scanner.nextLine();
                    break;
                }
                case 3:{
                    System.out.println("**** Add Ingredient **** \n");
                    inventario.setInventario("Onions",200, "Unidades");
                    System.out.println("Press any key");
                    scanner.nextLine();
                    break;
                }
                case 0:{
                    System.out.println("**** Good bye!!!  **** \n");
                    
                    break;
                }
            } 
            
        
        }
        
        
        
    }
    
}
