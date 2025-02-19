/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichas_Venta;

/**
 *
 * @author Salid
 */
public class Cliente {
 private String nombre;
    private String apellido;
    private String rfc;
    private boolean persona;
    private int edad;
    private int telefono;
    
    public String getNom(){
        return nombre;
    }
    public void setNom(String valor){
        nombre = valor;
    }
    public String getApe(){
        return apellido;
    }
    public void setApe(String valor){
        apellido = valor;
    }
    public boolean getPersonaFisica(){
        return persona;
    }
    public void setPersonaFisica(boolean valor){
        persona = valor;
    }
    public String getRFC(){
        return rfc;
    }
    public void setRFC(String valor){
        rfc = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public int getTel(){
        return telefono;
    }
    public void setTel(int valor){
        telefono = valor;
    }
    
    public void Datos_Cliente(){
        System.out.println("Datos del cliente.");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("RFC: "+rfc);
        if(persona){
            System.out.println("Es persona fisica");
        } else {
            System.out.println("Es persona moral");
        }
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+telefono);
    }    
}
