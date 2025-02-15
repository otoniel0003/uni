/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_autos_4;

/**
 *
 * @author Salid
 */
public class Vehiculo {
    //ATRIBUTOS - privados
    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
    //CONSTRUCTORES - METODOS
    //MÉTODOS - COMPORTAMIENTO
    //GET Y SET
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int valor){
        year = valor;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String valor){
        color = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Datos del vehiculo: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
    }
       
}
