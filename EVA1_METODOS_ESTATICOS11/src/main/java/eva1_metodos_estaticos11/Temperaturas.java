/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_metodos_estaticos11;

/**
 *
 * @author Salid
 */
public class Temperaturas {
  private Temperaturas(){}

    public static double convertirFaC(double fa){
        double resu;
        resu = (fa - 35)*(5.0/9.0);
        return resu;
    }
    public static double convertirCaF(double ce){
        double resu;
        resu = (ce * (9.0/5.0)) + 32;
        return resu;
    }
    public static double convertirCaK(double ce){
        double resu;
        resu = ce + 273.15;
        return resu;
    }
    public static double convertirKaC(double ke){
        double resu;
        resu = ke - 273.15;
        return resu;
    }
    public static double convertirFaK(double fe){
        double resu;
        resu = ((5.0/9.0)*(fe-32))+273.15;
        return resu;
    }
    public static double convertirKaF(double ke){
        double resu;
        resu = ((1.8)*(ke - 273.15)) + 32;
        return resu;
    } 
}   

