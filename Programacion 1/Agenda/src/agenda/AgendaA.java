
package agenda;

import javax.swing.JOptionPane;

import java.util.Scanner;
public class AgendaA {
    
    public Contactos ct[];
    public int b;
    Scanner leer = new Scanner(System.in);
    public AgendaA(int a){
    ct = new Contactos [a];
    this.b = a;
    }
    
    //Metodos agregar
    public void AgregarContactos(String nom, String dire,String cod,String te){
    
        for (int i = 0; i <= b; i++) {
            ct[b].setNombre(nom);
             ct[b].setDireccion(dire);
              ct[b].setCodipostal(cod);
               ct[b].setTelefono(te);    
        }
        JOptionPane.showMessageDialog(null, "Contacto, Agregado correctamente");
    
    }
    public void ListarContactos(){
        for (int i = 1; i <= b; i++) {
            ct[b].MostradContac();
        }
    }
    public void BuscarNombre(String a){
    for (int i = 1; i <= b; i++) {
           if (ct[b].getNombre().equals(a)) {
            ct[b].MostradContac();
        } else {
               JOptionPane.showMessageDialog(null, "Contacto no encontrado");
        }
        }
    
    }
    public void BuscarNumero(String a){
    for (int i = 1; i <= b; i++) {
           if (ct[b].getTelefono().equals(a)) {
            ct[b].MostradContac();
        } else {
               JOptionPane.showMessageDialog(null, "Contacto no encontrado");
        }
        }
    
    }
    
    public void ModificarTele(String a){
    for (int i = 1; i <= b; i++) {
           if (ct[b].getNombre().equals(a)) {
               System.out.println("Por Favor inglese el nuevo numero: ");
               String L;
               L = leer.nextLine();
               ct[b].setTelefono(L);
               
           JOptionPane.showMessageDialog(null, "Telefono, Modificado exitosamente");
        } else {
               JOptionPane.showMessageDialog(null, "Contacto no encontrado");
        }
        }
    }
    
    public void BorrarTele(String a){
     for (int i = 1; i <= b; i++) {
           if (ct[b].getNombre().equals(a)) {
            ct[b].setTelefono("VACIO");
        } else {
               JOptionPane.showMessageDialog(null, "Contacto no encontrado");
        }
        }
    }
}
