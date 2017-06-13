
package agenda;

import javax.swing.JOptionPane;

import java.util.Scanner;
public class AgendaA {
    
    /**
     *
     */
    boolean de = false;
    public Contactos ct[];
    public int b,a = 0;
    Scanner leer = new Scanner(System.in);
    
    public AgendaA(int a){
        this.ct = new Contactos[a];
    
    }
    //Metodos agregar
    public void AgregarContactos(String nom, String dire,String cod,String te){
            if (ct.length >=0) {
               ct[a] = new Contactos(nom, dire, cod, te);
                System.out.println(ct[a].getNombre());
                a++;
            }
    
    }
    
    public void ListarContactos(){
        try {    
        for (int i = 0; i <=ct.length ;i++) {
            if (ct[i].getNombre() != null) {
                
            ct[i].MostradContac();
            }
        }
        } catch (Exception e) {
        }
    }
    
    public void BuscarNombre(String a){
        // de = false;
        try {
            for (int i = 0; i <= ct.length; i++) {
           if (ct[i].getNombre().equals(a) && ct[i].getNombre() != null) {
               System.out.println("Contacto encontrado!"); 
            ct[i].MostradContac();
            de = true;
                     }
        }
        } catch (Exception e) {
        }
    }
    
    public void BuscarNumero(String a){
      //de = false;
        try {
            for (int i = 0; i <= ct.length; i++) {
           if (ct[i].getTelefono().equals(a)) {
            System.out.println("Contacto encontrado!"); 
            ct[i].MostradContac();
          
           } 
            }
           
        } catch (Exception e) {
        }
    
    }
    
    public void ModificarTele(String a){
        try {
            for (int i = 0; i <= ct.length; i++) {
           if (ct[i].getNombre().equals(a)) {
               System.out.println("Contacto encontrado!"); 
               System.out.println("Por Favor inglese el nuevo numero a modificar: ");
               String L;
               L = leer.nextLine();
               ct[i].setTelefono(L);
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
             int cantidad = ct.length;
            for (int i = 0; i <= cantidad; i++) {
               
                if (ct[i].getNombre().equals(nom)) {
                     //Una vez encontrada la posicion del arreglo en donde esta el nombre a borrar, procedemos con la siguiente linea de codigo...
                    for (int j = i; j < cantidad - 1; j++) {
                        //Asignamos a la posicion que queremos borrar la siguiente asi sucesivamente
                        ct[j] = ct[j + 1];
                        //Restamos nuestra cantidad para que no queden espacios vacios o nulos
                        cantidad--;
                    }
                }
               
            }
        } catch (Exception e) {
        }
    }
}
