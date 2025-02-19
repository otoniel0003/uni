/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_ventas_7;
import java.util.Scanner;
import Fichas_Venta.Cliente;
import Fichas_Venta.Productos;
/**
 *
 * @author Salid
 */
public class EVA1_VENTAS_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        Productos produ = new Productos();
        Cliente client = new Cliente();
        System.out.println("Datos del invetario");
        produ.setNom("Mango");
        produ.setMarc("Jumex");
        produ.setPrecio(35.48);
        produ.setClave(1245455550);
        produ.setInv(350);
        produ.Mostrar_almacen();
        client.setNom("Juan");
        client.setApe("Perez");
        client.setRFC("DS665DS555");
        client.setPersonaFisica(true);
        client.setEdad(28);
        client.setTel(614000111);
        client.Datos_Cliente();
        }
    }