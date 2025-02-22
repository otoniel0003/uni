/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_sobrecarha_metodos13;

/**
 *
 * @author ririo
 */
public class EVA1_sobrecarga_metodos13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo!!");
        System.out.println(100);
        System.out.println(100.10);
        System.out.println(3>5);
        System.out.println('c');
        System.out.println(new EVA1sobrecarga_metodos13());
        System.out.println(sumar(5,3));
        System.out.println(sumar("Hola","Mundo"));
        sumar();
    }
    
    
//---------------HEADER (CABECERA)------------------//
//              |------FIRMA-------|
public static int sumar(int val1, int val2){
    //IMPLEMENTACIon
     return val1 + val2;
}
public static String sumar(String val1, String val2){
    return val1 + val2;
}
public static void sumar(){
    System.out.println("ESTE METODO NO HACE NADA!!!");
}

}