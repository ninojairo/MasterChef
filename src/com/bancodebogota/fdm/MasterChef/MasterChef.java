/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.MasterChef;

import java.util.Scanner;

/**
 *
 * @author jaironino
 */
public class MasterChef {
    
    //private static final Scanner scanner = new Scanner(System.in);
    private static final int NUMERO_INGREDIENTES_INVENTARIO =10;
    private static final int NUMERO_INGREDIENTES_RECETA =3;
    
    private Inventario inventario;
    private JefeCocina jefeCocina;
    private Ingrediente ingrediente;
    private Ingrediente [] ingredientes;
    private Ingrediente [] ingredientesRecetaAH;
    
    private Ingrediente harina;
    private Ingrediente huevo;
    private Ingrediente queso;
    private Ingrediente aceite;
    private Ingrediente camarones;
    private Ingrediente carne;
    private Ingrediente sal;
    private Ingrediente arroz; 
    private Ingrediente leche;
    private Ingrediente limon;
    
    private Cocina cocina;
    
    private Receta recetaAH;
    private Receta recetaAC;
    private Receta recetaAQ;
    
    private Plato plato;
    private Pedido pedido;
        
    
    public void crearCliente(){
        Cliente cliente = new Cliente("Cristiano","Ronaldo");
    }
    
    public void crearIngredientes(){
        harina = new Ingrediente("Harina", 5, "Kilos");
        huevo = new Ingrediente("Huevo", 12, "Unidades");
        queso = new Ingrediente("Queso", 6, "Kilos");
        aceite = new Ingrediente("Aceite", 0, "Litros");
        camarones = new Ingrediente("Camarones", 10, "Kilos");
        carne = new Ingrediente("Carne", 10, "Kilos");
        sal = new Ingrediente("Sal", 1, "Kilos");
        arroz = new Ingrediente("Arroz", 10, "Kilos");
        leche = new Ingrediente("Carne", 10, "Litros");
        limon = new Ingrediente("Limon", 10, "Unidades");
        
        
        
    }
    
    public void crearInventario(){
        
        ingredientes = new Ingrediente[NUMERO_INGREDIENTES_INVENTARIO];
        ingredientes[0] = harina;
        ingredientes[1] = huevo;
        ingredientes[2] = queso;
        ingredientes[3] = aceite;
        ingredientes[4] = camarones;
        ingredientes[5] = carne;
        ingredientes[6] = sal;
        ingredientes[7] = arroz;
        ingredientes[8] = leche;
        ingredientes[9] = limon;
        inventario = new Inventario(ingredientes);
        
    }
    
    public void crearRecetas(){
        recetaAH = new RecetaArepaHuevo("Arepa Huevo");
        recetaAC = new RecetaArepaCarne("Arepa Carne");
        recetaAQ = new RecetaArepaQueso("Arepa Queso");
    }
    
    public void crearRecetaAH(){
        
        ingredientesRecetaAH = new Ingrediente[NUMERO_INGREDIENTES_RECETA];
        Ingrediente harina = new Ingrediente("Harina", 1, "Kilos");
        Ingrediente huevo = new Ingrediente("Huevo", 3, "Unidad");
        Ingrediente aceite = new Ingrediente("Aceite", 1, "Litro");
        ingredientesRecetaAH[0] = harina;
        ingredientesRecetaAH[1] = huevo;
        ingredientesRecetaAH[2] = aceite;
    }
    
    public void crearJefeCocina(){
        jefeCocina = new JefeCocina("Pibe", "Valderrama");
    
    }
    
    public void crearCocina(){
        
        cocina = new Cocina("Arepalandia", "Arepas", "33 Avenue", "3155678",jefeCocina,inventario);
        System.out.println("***** BIENVENIDO A LA COCINA ***** \n");
        
        System.out.println("Cocina: " +cocina.toString());
       
        /*for(int i=0;i<ingredientes.length;i++){
            System.out.println("Inventario: " +inventario.getInventario()[i] );
        }*/
        
   }
    
    public void hacerPedido(){
        Plato[] platos = {new Plato(recetaAH,"Medio"),new Plato(recetaAH,"Completo") };
        pedido = new Pedido(platos);
        System.out.println("\n***** Precio *****: \n");
        pedido.getPrecio(recetaAH);
    }
    
    
    public void validarInventario(){
        boolean [] hayIngredientes = new boolean[NUMERO_INGREDIENTES_RECETA];
        System.out.println("***** Validar Inventario *****: \n");
        System.out.println("Receta: " +recetaAH.getNombre());
        hayIngredientes = inventario.validarExistenciaIngredientesReceta(ingredientesRecetaAH, ingredientes);
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MasterChef masterChef = new MasterChef();
        masterChef.crearCliente();
        masterChef.crearIngredientes();
        masterChef.crearInventario();
        masterChef.crearJefeCocina();
        masterChef.crearRecetas();
        masterChef.crearCocina();
        masterChef.crearRecetaAH();
        masterChef.validarInventario();
        masterChef.hacerPedido();
        
        
        
        /*int opcion =-1;
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
            
        
        }*/
        
        
        
    }
    
}
