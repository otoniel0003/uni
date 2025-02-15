/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_autos_4;
import java.util.Scanner;
/**
 *
 * @author Salid
 */
public class EVA1_AUTOS_4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        Vehiculo auto = new Vehiculo();
        System.out.println("Marca del vehiculo: ");
        String cade = captu.nextLine();
        auto.setMarca(cade);
        System.out.println("Modelo del vehiculo: ");
        cade = captu.nextLine();
        auto.setModelo(cade);
        System.out.println("Precio: ");
        cade = captu.nextLine();
        double precio = Double.parseDouble(cade);
        auto.setPrecio(precio);
        System.out.println("Año del vehiculo: ");
        cade = captu.nextLine();
        int year = Integer.parseInt(cade);
        auto.setYear(year);
        System.out.println("Color del vehiculo: ");
        cade = captu.nextLine();
        auto.setColor(cade);
        auto.imprimirDatos();
        //System.out.println("Nombre: " + auto.getMarca());
    }
    
}
