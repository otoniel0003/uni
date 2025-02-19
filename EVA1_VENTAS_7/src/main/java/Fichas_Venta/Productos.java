/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichas_Venta;

/**
 *
 * @author Salid
 */
public class Productos {
  private String nombre;
    private String marca;
    private double precio;
    private int clave;
    private int inventario;
    
    public String getNom(){
        return nombre;
    }
    public void setNom(String valor){
        nombre = valor;
    }
    public String getMarc(){
        return marca;
    }
    public void setMarc(String valor){
        marca = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
    public int getClave(){
        return clave;
    }
    public void setClave(int valor){
        clave = valor;
    }
    public int getInv(){
        return inventario;
    }
    public void setInv(int valor){
        inventario = valor;
    }
    
    public void Mostrar_almacen(){
        System.out.println("Aqui estan los datos del producto.");
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: "+marca);
        System.out.println("Precio: "+precio);
        System.out.println("Clave: "+clave);
        System.out.println("Inventario: "+inventario);
    }    
}
