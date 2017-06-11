package garagejava;

import javax.swing.JOptionPane;


public class Garaje {
    //Atributos
    public Coche coche;
    public String nombre_Averia;
    public int numeroDe_coches = 0,a = 1 ;
   // boolean atendien = true;
    //Metodo AceptarCoche
    public boolean aceptarCoche(Coche c, String Averia){
       ++numeroDe_coches;//Guardara los coches atendidos al dia
        
        if (a == 1) {  
            ++a;// Para confirmar que el garage este vacio
            JOptionPane.showMessageDialog(null,"Se ingreso el vehiculo correctamente \n*Su vehiculo esta siendo reparado");
            this.nombre_Averia = Averia;
            this.coche = c;
          return true;
        }else{
            JOptionPane.showMessageDialog(null,"El garaje esta lleno\n *Un vehiculo sera despachado\npronto");
          
        }      
        return false;
    }
    //Metodo DevolverCoche
    public void devolverCoche(){
       
        if (a > 1) {
            --a;      
            JOptionPane.showMessageDialog(null,"Vehiculo despachado\n*El garaje esta disponible.");
        }
    }
    
}
