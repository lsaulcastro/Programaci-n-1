/*
 
 */
package agenda;
import java.util.Scanner;
/**
 *
 * @author sauld
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Contactos[] ob = new Contactos[9];
//        ob[0] = new Contactos();
//        ob[0].setNombre("hola");System.out.println(ob[0].getNombre());
//        ob[1].setNombre("la");System.out.println(ob[1].getNombre());
        
        int a = 0;
        String nom = "" ,dire="" ,cod="",te="";
        AgendaA A;
        Scanner Leer = new Scanner(System.in);
       
        System.out.println("Por favor, Ingrese cuantos contactos tendra la agenda.");
        
            try {
             a = Leer.nextInt();
        } catch (Exception e) {
            System.out.println("Error ingrese un numero entero. " + e);
        }
               A = new AgendaA(a);
               // Se crea un do while para volver al menu principal
         do { 
            try {
                    System.out.println("-------Opciones------\n1.Agregar Contacto \n2.Buscar Contacto por nombre \n3.Buscar contacto por numero \n4.Borrar el telefono \n5.Lista de contactos \n6.Modificar Telefono \0.Salir \n---------------------");
                     a = Leer.nextInt();  
            } catch (Exception e) {
                     System.out.println("Error ingrese un numero entero. " + e);
                    
            }
            switch(a){
                    
                case 1:
                  
                    System.out.println("Ingrese los siguientes datos: \nNombre: ");nom = Leer.next();
                    System.out.println("Direccion: "); dire = Leer.next();
                    System.out.println("Codigo Postal: " );cod = Leer.next();
                    System.out.println("Telefono: ");te = Leer.next();
                       A.AgregarContactos(nom, dire, cod, te);
                        break;
                case 2:
                    System.out.println("Ingrese el nombre a buscar en la agenda: ");
                    String g = Leer.next();
                    A.BuscarNombre(g);
                    break;
                case 3:
                    System.out.println("Ingrese el Numero a buscar: ");
                     g = Leer.next();
                    A.BuscarNumero(g);
                    break;
                case 4:
                    A.BorrarTele();
                    break;
                case 5:
                    A.ListarContactos();
                    break;
                case 6:
                    System.out.println("Ingrese el nombre del contacto a quien quiere modificar el numero: ");
                     g = Leer.next();
                   A.ModificarTele(g);
                    break;
                case 0:
                    System.exit(0);
                    break;
                   
            }
           
        } while (a > 0);
      
    }
  
    
}
