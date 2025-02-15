/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;

/**
 *
 * @author Salid
 */
public class Practica1 {

    public static void main(String[] args) {

        Persona perso1;
 
        perso1 = new Persona();
    
        perso1.edad = 18;
        perso1.genero = "H";
        perso1.nombre = "otoniel";
        perso1.imprimirDatos();
        System.out.println(perso1);
       
    }
}

class Persona {
   
    String nombre;
    int edad;
    String genero;
  
    void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }
}   

