/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lauta
 */
    public class Personas {
    
    private String  nombre;
    private int dni;
    private int edad;
    
    public Personas( String nombre, int dni, int edad){
        this.nombre= nombre;
        this.dni = dni;
        this.edad = edad;
    }
    public Personas(){
        this.nombre = "";
        this.dni = 0;
        this.edad= 0;
    }

    public String getNombre(){ return nombre;}
    public void setNombre(String nombre){ this.nombre = nombre;}
    public int getDni(){ return dni;}
    public void setDni(int dni){ this.dni = dni;}
    public int getEdad(){ return edad;}
    public void setEdad(int edad){ this.edad = edad;}
    
    
   public void mostrarInfoPersonas(){
        System.out.println("________Información de la Persona _______");
        System.out.println("Nombre:  " + nombre);
        System.out.println("D.N.I: " + dni);
        System.out.println("Edad: " + edad);
    }

}

    
    
    
    
    
    
