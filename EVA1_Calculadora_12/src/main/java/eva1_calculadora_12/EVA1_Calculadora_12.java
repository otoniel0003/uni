/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva1_calculadora_12;

/**
 *
 * @author Salid
 */
public class EVA1_Calculadora_12 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(suma(1,2));
        System.out.println(restar(10,5));
        System.out.println(multiplicacion(5,5));
        System.out.println(dividir(10,2));
        System.out.println(potencia(2,2));
    }
    
    
    public static int suma(int n1, int n2){
        int resu;
        resu = n1 + n2;
        return resu;
    }
    public static int restar(int n1, int n2){
        int resu;
        resu = n1 - n2;
        return resu;
    }
    public static int multiplicacion(int n1, int n2){
        int resu;
        resu = n1 * n2;
        return resu;
    }
    public static int dividir(int n1, int n2){
        int resu;
        resu = n1 / n2;
        return resu;
    }
   public static int potencia(int n1, int n2) {
    int resu = 1;
    for (int i = 0; i < n2; i++) {
        resu *= n1;
    }
    return resu;
}
   
}
