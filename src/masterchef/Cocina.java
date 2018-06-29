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
public class Cocina {
    private String nombre;
    private String especialidad;
    private String direccion;
    private String telefono;
    private JefeCocina JefeCocina; 
    private Inventario inventario;

    public Cocina(){}
    
    public Cocina(String nombre, String especialidad, String direccion, String telefono, JefeCocina JefeCocina, Inventario inventario) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.JefeCocina = JefeCocina;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public JefeCocina getJefeCocina() {
        return JefeCocina;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setJefeCocina(JefeCocina JefeCocina) {
        this.JefeCocina = JefeCocina;
    }
    
    
    
    @Override
    public String toString(){
        return ("\n Name: " + getNombre() + "\n Specialty: " + getEspecialidad() + "\n Boss: " + getJefeCocina());
    }
    
    
    
    
    
}
