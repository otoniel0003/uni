/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1__apa_6;

import FICHAS_APA.Libro_apa;
import FICHAS_APA.Sitio_web;
import java.util.Scanner;
/**
 *
 * @author Salid
 */
public class EVA1__APA_6 {

    public static void main(String[] args) {
       // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("Formato APA:");
            System.out.println("1. Libro 1");
            System.out.println("2. Sitio Web 2");
            System.out.println("3. Salir");
            System.out.print("Selecciona tu formato: ");

            opcion = cap.nextInt();
            cap.nextLine();

            switch (opcion) {
                case 1:
                    Libro_apa libro = new Libro_apa();
                    System.out.println("Rellene lo siguiente.");
                    System.out.println("Autor: ");
                    String cade = cap.nextLine();
                    libro.setAutor(cade);
                    System.out.println("Titulo: ");
                    cade = cap.nextLine();
                    libro.setTitulo(cade);
                    System.out.println("Año: ");
                    cade = cap.nextLine();
                    int year = Integer.parseInt(cade);
                    libro.setYear(year);
                    System.out.println("Ciudad: ");
                    cade = cap.nextLine();
                    libro.setCiudad(cade);
                    System.out.println("Editorial: ");
                    cade = cap.nextLine();
                    libro.setEdito(cade);
                    libro.Mostrar_APA();
                    break;
                case 2:
                    Sitio_web web = new Sitio_web();
                    System.out.println("Rellene lo siguiente.");
                    System.out.println("Autor: ");
                    String cad = cap.nextLine();
                    web.setAutor(cad);
                    System.out.println("Sitio web: ");
                    cad = cap.nextLine();
                    web.setWeb(cad);
                    System.out.println("Año: ");
                    cad = cap.nextLine();
                    int year_L = Integer.parseInt(cad);
                    web.setYear(year_L);
                    System.out.println("Mes: ");
                    cad = cap.nextLine();
                    int mes = Integer.parseInt(cad);
                    web.setMes(mes);
                    System.out.println("Dia: ");
                    cad = cap.nextLine();
                    int dia = Integer.parseInt(cad);
                    web.setDia(dia);
                    System.out.println("URL: ");
                    cad = cap.nextLine();
                    web.setUrl(cad);
                    web.Ver_Apa();
                    break;
                case 3:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Eso no se puede hacer o no esta en las opciones");
            }
            System.out.println();
        }

        cap.close();
    }
        
    }

    

