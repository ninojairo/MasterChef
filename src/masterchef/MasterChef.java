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
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*Cliente prueba = new Persona("", ""); 
        Persona prueba2 = new Cliente("", "");*/
        
        
        //Carga Inicial
        Cliente customer = new Cliente("Cristiano","Ronaldo");
        
        //Creacion inventario inicial
        Inventario inventario = new Inventario();
        System.out.println("Inventario creado");
        
        
        //inventario.AgregarIngrediente("Onions",200, "Unidades");
                   
        
        /*Ingrediente fish = new IngredienteContable("Fish", 4500, "kilos");
        Ingrediente meat = new IngredienteContable("Meat", 6500, "kilos");
        Ingrediente rice = new IngredienteContable("Rice", 1000, "Kilos");
        Ingrediente carrots = new IngredienteContable("Carrots", 456, "Kilos");
        Ingrediente beer = new IngredienteLiquido("beer", 100, "Litros");
        Ingrediente kola = new IngredienteLiquido("kola", 5100, "Litros");
        
        
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
