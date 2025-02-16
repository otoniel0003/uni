/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHAS_APA;

/**
 *
 * @author Salid
 */
public class Sitio_web {
   private String autor;
    private String N_Web;
    private int year_L;
    private int mes;
    private int dia;
    private String url;
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String valor){
        autor = valor;
    }
    public String getWeb(){
        return N_Web;
    }
    public void setWeb(String valor){
        N_Web = valor;
    }
    public int getYear(){
        return year_L;
    }
    public void setYear(int valor){
        year_L = valor;
    }
    public int getMes(){
        return mes;
    }
    public void setMes(int valor){
        mes = valor;
    }
    public int getDia(){
        return dia;
    }
    public void setDia(int valor){
        dia = valor;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(String valor){
        url = valor;
    }
    
    public void Ver_Apa(){
        System.out.println("Bibliografia ");
        System.out.println("" + autor+", "+N_Web+". "+year_L+". "+mes+". "+dia+". "+url);
    }
}
    

