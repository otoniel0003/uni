/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1.tv.pkg9;

/**
 *
 * @author Salid
 */
public class Tv_Clase {
    private boolean encendido;
    private int volumen;
    private int canal;

public Tv_Clase(){
        //inicializar atributos:
        encendido = true;
        volumen = 10;
        canal = 3;
}
public Tv_Clase(boolean prender, int vol, int chanel){
    encendido = prender;
    volumen = vol;
    canal = chanel;
}
    
    public void encenderApagar(){
        if (encendido == true)//TV encendida
            encendido = false;
        else
            encendido = true;
    }
    
    public void imprimirDatos(){
        if(encendido == true)
            System.out.println("TV Encendida");
        else
            System.out.println("Tv Apagada");
        
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
    }
    //VOLUMEN REQUIERE DOS MËTODOS: SUBIR Y BAJAR VOLUMEN
    public void subirVolumen(){
        if (volumen < 100)
            
        if(encendido == true)
            System.out.println("TV Encendida");
        else
            System.out.println("Tv Apagada");
        
        System.out.println("Volumen: " + volumen);
            volumen += 1;//acumulador --> volumen = volumen +1;
    }
    public void bajarVolumen(){
        if (volumen > 0)
            volumen -= 1;
        
        if(encendido == true)
            System.out.println("TV Encendida");
        else
            System.out.println("Tv Apagada");
        
        System.out.println("Volumen: " + volumen);
    }
    //REQUIERE TRES METODOS: SUBIR, BAJAR Y ASIGNAR CANAL
    public void masCanal() {
        if (encendido == true) {
            if(canal == 10){
                canal = 0;
}else 
                canal += 1;
            }
        }
    
    public void menCanal() {
        if (encendido == true) {
            if(canal == 0){
                canal = 10;
}else
                canal -= 1;
            }
        } 
        
    public void setCanal(int valor){
        canal = valor;
    }
    
    
}