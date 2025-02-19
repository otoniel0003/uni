/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1.pkgthis.pkg10;

/**
 *
 * @author Salid
 */
public class Laptop {
 private String procesador;
    private double memoria;
    private double disco_duro;
    private double pantalla;
    private String marca;
    private String modelo;
    
    public Laptop(){
        procesador = "NO HAY DATO";
        memoria = 0;
        disco_duro = 0;
        pantalla = 0;
        marca = "NO HAY DATO";
        modelo = "NO HAY DATO";
    }
    public Laptop(String procesador, double memoria, double disco_duro, double pantalla, String marca, String modelo){
        this.procesador = procesador;
        this.memoria = memoria;
        this.disco_duro = disco_duro;
        this.pantalla = pantalla;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    public String getProcesador(){
        return this.procesador;
    }
    public void setMemoria(double memoria){
        this.memoria = memoria;
    }
    public double getMemoria(){
        return this.memoria;
    }
    public void setDisco_Duro(double disco_duro){
        this.disco_duro = disco_duro;
    }
    public double getDisco_Duro(){
        return this.disco_duro;
    }
    public void setPantalla(double pantalla){
        this.pantalla = pantalla;
    }
    public double getPantalla(){
        return this.pantalla;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public void Mostrar_Lap(){
        System.out.println("Procesador: "+procesador);
        System.out.println("Memoria: "+memoria+" Gb");
        System.out.println("Disco duro: "+disco_duro+" Gb");
        System.out.println("Pantalla: "+pantalla+" Inch");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }
    
    
}