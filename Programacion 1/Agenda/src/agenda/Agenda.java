/*
 
 */
package agenda;

import Controlador.AgendaA;

import java.util.Scanner;
/**
 *
 * @author sauld
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
//        Contactos[] ob = new Contactos[9];
//        ob[0] = new Contactos();
//        ob[0].setNombre("hola");System.out.println(ob[0].getNombre());
//        ob[1].setNombre("la");System.out.println(ob[1].getNombre());
//        SimpleDateFormat F = new SimpleDateFormat("dd-MM-yyyy");
//            Modelo.ContactosPersonales c = new ContactosPersonales ();
//            System.out.println(c.fechaActual());
//              System.out.println(c.fechaUSer("02-07-2017"));
//              System.out.println(F.format(c.getFechaCumple()));
//             System.out.println(c.fechaActual());        
//             Modelo.Contactos a[][] =  new Contactos[2][10];
//             a[0][1] = new ContactosLaborales();
//             a[0][1].setNombre("saul");
//             a[1][1] = new ContactosPersonales();
//             a[1][1].setNombre("jose");
//             int x = a[0].length;
//             int p = a[1].length;
//             System.out.println(a[0][1].getNombre() + a[1][1].getNombre() + p+x);
             
          // System.out.println(a[0][1].getNombre() +  " " +  a[1][1].getNombre());
             //a[0][1].getNombre();
            // a[1][1].getNombre();
            
//            Contactos[][] c = new Contactos[2][10];
//            c[0][0] =  new ContactosPersonales();
//            c[0][0].setNombre("Saul");
//            c[1][0] = new ContactosLaborales();
//            c[1][0].setNombre("as");
//            System.out.println(c[1][0].getNombre() + " " + c[0][0].getNombre());
//            String fecha = "02-05-2017";
//            String fecha2 = "02-05-2017";
//        System.out.println(fecha.substring(3,5));
//                if (fecha.substring(3, 5).equals(fecha2.substring(3, 5))) {
//                    System.out.println("Funciona");
//        }
                   


        int a = 0;
        int x = 0;
        int v= 0;
        boolean veri2 = false; 
        boolean veri = false; 
        boolean back_Ex = false;
        String detalles = null;
        //con la variable contador me asegurare de que buscque en el objeto agenda si un contacto 
        //es personal o laboral
        int controlador = 0;
        String nom ,dire ,cod,te,correo,url,t_Casa,teOfi,nomcom,exteOf,fechaHBD;
        AgendaA A[] = new AgendaA[2];
        Scanner Leer = new Scanner(System.in);
       
        System.out.println("Por favor, Ingrese cuantos contactos tendra la agenda.");
        
            try {
             a = Leer.nextInt();
        } catch (Exception e) {
            System.out.println("Error ingrese un numero entero. " + e);
        }
            do {            
            System.out.println("-------Opciones------\n1.Contactos Personales \n2.Contacos Laborales\n--------------------");
            controlador = Leer.nextInt();
            if ( controlador == 1) {
                    controlador = 0;
                   
        } 
                if (controlador == 2) {
                    controlador = 1;
                    
                }
                if (controlador < 0 && controlador > 2 ) {
                    System.out.println("Ingrese una opcion valida! ");
                }
                System.out.println(controlador);
                //Con esta condiccion me aseguro que el objeto solo se me instancie una sola vez
                if (veri == false && controlador == 0) {
                    A[controlador] = new AgendaA(a, controlador);
                    veri = true;
                }if (veri2 == false && controlador == 1) {
                    A[controlador] = new AgendaA(a, controlador);
                    veri2 = true;
                }
                
              //  Se crea un do while para volver al menu principal
         do { 
            try {
                    System.out.println("-------Opciones------\n1.Agregar Contacto \n2.Buscar Contacto por nombre \n3.Buscar contacto por numero \n4.Borrar el telefono \n5.Lista de contactos \n6.Modificar Telefono \n7.Atras");
                 
                    
                    if (controlador == 0) {
                       System.out.println("8.Armar Fiesta \n9.Recordatorios de cumpleaños! \n0.Salir \n---------------------");
                }else{
                   System.out.println("8.Organizar Reunion \n0.Salir \n---------------------");
                   }
                    v = Leer.nextInt();  
            } catch (Exception e) {
                     System.out.println("Error ingrese un numero entero. " + e);
                    
            }
            switch(v){
                    
                case 1:
                  
                    System.out.println("Ingrese los siguientes datos: ");
                         System.out.println("Nombre: " );nom = Leer.next();
                        System.out.println("Direccion: "); dire = Leer.next();
                        System.out.println("Codigo Postal: " );cod = Leer.next();
                        System.out.println("Telefono: ");te = Leer.next();
                        System.out.println("Correo: ");correo = Leer.next();
                    if (controlador ==0 ) {
                        System.out.println("Facebook: ");url = Leer.next();
                        System.out.println("Telefono Casa: ");t_Casa = Leer.next();
                        System.out.println("Por favor ingrese la fecha de cunpleños\nCon el siguiente formato Dias-Mes-año ");
                        fechaHBD = Leer.next();
                        A[controlador].AgregarContactos(nom, dire, cod, te, correo, url, t_Casa, fechaHBD);
                      
                    
                    } else {
                        System.out.println("Linkedin: ");url = Leer.next();
                        System.out.println("Telefono Oficina: "); teOfi = Leer.next();
                        System.out.println("Nombre compañia: ");nomcom = Leer.next();
                        System.out.println("Extencion de oficina: ");exteOf = Leer.next();
                        A[controlador].AgregarContactos(nom, dire, cod, te, correo, url, teOfi, nomcom, exteOf);
                        
                    }
                    
                   // 2   A.AgregarContactos(nom, dire, cod, te);
                        break;
                case 2:
                    System.out.println("Ingrese el nombre a buscar en la agenda: ");
                    String g = Leer.next();
                    A[controlador].BuscarNombre(g);
                    break;
                case 3:
                    System.out.println("Ingrese el Numero a buscar: ");
                     g = Leer.next();
                    A[controlador].BuscarNumero(g);
                    break;
                case 4:
                    A[controlador].BorrarTele();
                    break;
                case 5:
                    A[controlador].ListarContactos();
                    break;
                case 6:
                    System.out.println("Ingrese el nombre del contacto a quien quiere modificar el numero: ");
                     g = Leer.next();
                   A[controlador].ModificarTele(g);
                    break;
                case 7:
                    v = 0;
                    break;
                case 8:
                    System.out.println("Ingrese los detalles de la invitacion sin olvidar, Dia , Lugar y hora: ");
                    try {
                         detalles = leer.readLine();
                    } catch (IOException e) {
                    }
                    System.out.println(detalles);
                    do {                        
                        A[controlador].Invitacion(detalles);
                        System.out.println("Si desea invitar otro contacto ingrese 1 \nde lo contrario pulse cualquier numero");
                         x = Leer.nextInt();
                    } while (x > 1);
                   
                    break;
                case 9:
                    A[controlador].ReordatorioHBD();
                    break;
                case 0:
                    System.exit(0);
                    break;
                    default:
                        System.out.println("Asegurese de haber seleccionado una opcion valida");
                        break;               
            }
           
        } while (v >= 1);
    }while (back_Ex == false);
    }

    
}
