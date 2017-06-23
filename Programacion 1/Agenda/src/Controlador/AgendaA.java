
package Controlador;



import Modelo.Contactos;
import Modelo.ContactosLaborales;
import Modelo.ContactosPersonales;
import static Modelo.ContactosPersonales.F;
import static Modelo.ContactosPersonales.fechaActual;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
//import static Modelo.ContactosPersonales.fechaActual;


import java.util.Scanner;
public class AgendaA {

//    Contactos [][] ct;
//    public AgendaA( int y) {
//        ct = new Contactos[2][y];
//    }
    
    /**
     *
     */
    
   
    
    //boolean de = false;
    public Contactos contactos[][];
    BufferedReader Leer = new BufferedReader(new InputStreamReader(System.in));
    String [] A ;
    public int b,c,d= 0;
    public static int a = 0;
    public  int controlador;
    public static Date[] fechaContro;
    public static String [] feli;
    public Scanner leer = new Scanner(System.in);
    
   
    
    public AgendaA(int a,int b)  {
        this.contactos = new Contactos[2][a];
        AgendaA.fechaContro = new Date[a];
       AgendaA.feli =  new String [a];
        A =  new String[a];
     this.controlador = b;
     
    }
    //Metodos agregar
    public void AgregarContactos(String nom, String dire,String cod,String te,
            String correo, String URL, String TeCasa, String fecha  ){
            if (contactos[controlador].length >=0) {
               contactos[controlador][a] =(ContactosPersonales) new ContactosPersonales(nom, dire, cod, te, correo, URL, TeCasa,fecha);
              ///  System.out.println(ct[controlador][a].getNombre());
                ++a;
            }
    }
    //Sobre carga del metodo agregar 
    public void AgregarContactos(String nom, String dire,String cod,String te,
            String correo, String URL, String teOfi, String nombreC,String exTenOfi  ){
            if (contactos[controlador].length >=0) {
              contactos[controlador][c] =  new ContactosLaborales(nom, dire, cod, te, correo, URL, teOfi, nombreC, exTenOfi);
             //   System.out.println(ct[controlador][c].getNombre());
               ++ c;       
            }
    
    }

    public void ListarContactos() {
       
            try {    
        for (int i = 0; i <=contactos[controlador].length ;i++) {
            if (contactos[controlador][i].getNombre() != null) {
                //Esta condicion es para mostrar las felicitaciones si es un contacto personal y si contiene algo la felicitacion
            contactos[controlador][i].MostradContac();
                if (controlador == 0 && A[i] != null) {
                     System.out.println(A[i]);
                }               
      //         RecoEnvia(contactos[controlador][i].getNombre());
            }
        }
        } catch (Exception e) {
        }
       
    }
    
    public void BuscarNombre(String a){
        // de = false;
        try {
            for (int i = 0; i <= contactos[controlador].length; i++) {
           if (contactos[controlador][i].getNombre().equals(a) && contactos[controlador][i].getNombre() != null) {
               System.out.println("Contacto encontrado!"); 
            contactos[controlador][i].MostradContac();
             //Esta condicion es para mostrar las felicitaciones si es un contacto personal y si contiene algo la felicitacion
            contactos[controlador][i].MostradContac();
                if (controlador == 0 && A[i] != null) {
                     System.out.println(A[i]);
                }
          //     System.out.println( RecoEnvia(contactos[controlador][i].getNombre()));  
            //de = true;
                     }
        }
        } catch (Exception e) {
        }
    }
    
    public void BuscarNumero(String a){
      //de = false;
        try {
            for (int i = 0; i <= contactos[controlador].length; i++) {
           if (contactos[controlador][i].getTelefono().equals(a)) {
            System.out.println("Contacto encontrado!"); 
            contactos[controlador][i].MostradContac();
      //   System.out.println( RecoEnvia(contactos[controlador][i].getNombre()));  

           } 
            }
           
        } catch (Exception e) {
        }
    
    }
    
    public void ModificarTele(String a){
        try {
            for (int i = 0; i <= contactos[controlador].length; i++) {
           if (contactos[controlador][i].getNombre().equals(a)) {
               System.out.println("Contacto encontrado!"); 
               System.out.println("Por Favor inglese el nuevo numero a modificar: ");
               String L;
               L = leer.nextLine();
               contactos[controlador][i].setTelefono(L);
               System.out.println("Contacto Modificado!");   
        } 
        }
        } catch (Exception e) {
        }
    
    }
    
    public void BorrarTele(){
        try {
             System.out.println("Por Favor ingrese el nombre del contacto que desea borrar: ");
             String nom = leer.next();
             //Guardamos la longitud del arreglo
             int cantidad = contactos[controlador].length;
            for (int i = 0; i <= cantidad; i++) {
               
                if (contactos[controlador][i].getNombre().equals(nom)) {
                     //Una vez encontrada la posicion del arreglo en donde esta el nombre a borrar, procedemos con la siguiente linea de codigo...
                    for (int j = i; j < cantidad - 1; j++) {
                        //Asignamos a la posicion que queremos borrar la siguiente asi sucesivamente
                        contactos[controlador][j] = contactos[controlador][j + 1];
                        //Restamos nuestra cantidad para que no queden espacios vacios o nulos
                        cantidad--;
                    }
                }
               
            }
        } catch (Exception e) {
        }
        
        if (controlador == 1) {
            --c;
        }else{
        --a;
        }
        System.out.println("c " + c +"a " + a);
    }
     
    public void Invitacion(String invitacion){
     ListarContactos();
            
              
               System.out.println("Escribe el nombre de uno de tus contactos para enviar invitacion: : ");
            String nombre = leer.next();
        try {
                              
                for (int i = 0; i <= contactos[controlador].length; i++) {
           if (contactos[controlador][i].getNombre().equals(nombre) && contactos[controlador][i].getNombre() != null) {
               System.out.println("Contacto encontrado! ");
               
                   contactos[controlador][i].setInvi(invitacion);
             
           // de = true;
           }
            }
          
            
        } catch (Exception e) {
            
        }
    }
    
    public void RecoEnvia(String nomas){
     
       
        try {
            for ( int i = 0; i <=contactos[controlador].length; i++) {
                if (contactos[controlador][i].getNombre().equals(nomas) && contactos[controlador][i].getNombre() != null) {
                    if (A[i] == null) {
                         System.out.println("Ingrese el mensaje personalizado de felicitacion: ");
                        
                    A[i] = "Felicitaciones enviadas: Mensaje:  '"+ Leer.readLine()+"'";
                 //   A[i] = detalles;
                
                    d = i;
                    }
                       // A[i] =  new String(); 
                        
                  
            //de = true;
                    
                     }
            }
        } catch (IOException e) {
        }
 
                                System.out.println(A[d]);

       // return A[a];}
    }
    
    public  void ReordatorioHBD(){
       
       F =  new SimpleDateFormat("dd-MM-yyyy");
       int x = fechaContro.length;
       try {
              for (int i = 0; i <= x; i++) {
           if (fechaActual().equals(F.format(fechaContro[i]))) {
               System.out.println("~~~~~~~~Le recordamos que su contacto:'"+ contactos[controlador][i].getNombre()+"'~~~~~~~~~\nEsta de cumpleaños hoy FELICITALE! "
                       + F.format(fechaContro[i]) + "\nTelefono celular: " + contactos[controlador][i].getTelefono());
                        RecoEnvia(contactos[controlador][i].getNombre());
               //     System.out.println( RecoEnvia(contactos[controlador][i].getNombre())); 
              /// contactos[controlador][i].MostradContac();   
           }
       }
              
       } catch (Exception e) {
       }
        try {
            System.out.println("********CONTACTOS QUE ESTAN DE CUMPLEAÑOS ESTE MES********");
              for (int i = 0; i <= x; i++) {
           if (fechaActual().substring(3, 5).equals(F.format(fechaContro[i]).substring(3, 5))) {
               System.out.println("~~~~~~~~~~~~~~~~~~~~~~~\nLe recordamos que su contacto:'"+ contactos[controlador][i].getNombre()+
                       "'\nEsta de cumpleaños este mes " + F.format(fechaContro[i])
                     + "\nTelefono celular: " + contactos[controlador][i].getTelefono());
                
                  //System.out.println(fechaActual().substring(3, 5)+" " + F.format(fechaContro[i]).substring(3, 5));
           }
       }
        } catch (Exception e) {
        }
        
   }
    
}
