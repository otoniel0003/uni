/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_modificadores_3;

/**
 *
 * @author Salid
 */
public class Eva1_Modificadores_3 {

    public static void main(String[] args) {
    Persona perso = new Persona();
        perso.setNombre("otoniel");
        perso.setApellidos("salido loera");
        perso.setEdad(19);
        perso.setGenero("Masculino");
        perso.setCurp("sasa22sasa22");
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellidos: " + perso.getApellidos());
        System.out.println("Edad: " + perso.getEdad());
        System.out.println("Genero: " + perso.getGenero());
        System.out.println("CURP: " + perso.getCurp());    
    }
}
