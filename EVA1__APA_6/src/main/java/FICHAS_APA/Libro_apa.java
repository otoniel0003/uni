/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHAS_APA;

/**
 *
 * @author Salid
 */
public class Libro_apa {
    private String Autor;
    private String titulo;
    private int year;
    public String ciudad;
    private String editorial;
    
    public String getAutor(){
        return Autor;
    }
    public void setAutor(String valor){
        Autor = valor;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String valor){
        titulo = valor;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int valor){
        year = valor;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String valor){
        ciudad = valor;
    }
    public String getEdito(){
        return editorial;
    }
    public void setEdito(String valor){
        editorial = valor;
    }
    
    
    public void Mostrar_APA(){
        System.out.println("Bibliografia");
        System.out.println("" + Autor +", "+ titulo +"("+ year +"). "+ ciudad +", "+ editorial);
    }
}
    

