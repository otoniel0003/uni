/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva1_metodos_estaticos11;

/**
 *
 * @author Salid
 */
public class EVA1_METODOS_ESTATICOS11 {

   public static void main(String[] args) {
        // TODO code application logic here
        //Math es una clase que proporciona funciones matematicas
        //Math.
        double valorAleatorio = Math.random();
        int valor = (int)(valorAleatorio * 1000);
        System.out.println(valorAleatorio);
        System.out.println(valor);
        //
        //Math math = new Math();
        Persona perso = new Persona();
        perso.mostrarMensaje();
        //USAR FORMULAS DE TEMPERSTURA
        //Temperaturas tempe = new Temperaturas();
        //System.out.println(tempe.convertirFaC(100));
        System.out.println(Temperaturas.convertirFaC(100));
        System.out.println(Temperaturas.convertirCaF(100));
        System.out.println(Temperaturas.convertirCaK(100));
        System.out.println(Temperaturas.convertirKaC(100));
        System.out.println(Temperaturas.convertirFaK(100));
        System.out.println(Temperaturas.convertirKaF(100));
    }
    
}
