
package ficherosdetexto;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class FicherosDetexto {

  
    public static void main(String[] args) {
        
        
        LeerArchivo();
    }
    
    public static void CrearArchivo(){
    //Creamos dos variables una tipo File, para crear el archivo
        // y otra tipo Printwire para escribir dentro del archivo
        File _archivo;
        PrintWriter _escribir;
        //Crear una variable FileReader, Para leer en archivos. 
        //Creamos el nombre del archivo y el tipo de archivos
        _archivo = new File("contactos.txt");
        if (!_archivo.exists()) {
            
            try {
               
                _archivo.createNewFile();
                 JOptionPane.showMessageDialog(null,"Archivo creado exitoxamente " + _archivo);
            } catch (IOException ex) {
                System.out.println(ex.getMessage() + " No se pudo crear el archivo");
            }
        } else {
            try {
                _escribir = new PrintWriter(_archivo,"utf-8");
                _escribir.print("Hola mundo ok!");
                JOptionPane.showMessageDialog(null,"Datos almacenados extiosamente! ");
                _escribir.close();
            } catch (Exception ex) {
               System.out.println(ex.getMessage());
            }
        }
    }
    
    public static void LeerArchivo() {
    
       File _miArchivo;
       FileReader _leer;
       String cadena;
       _miArchivo = new File("contactos.txt");
        try {
            _leer = new FileReader(_miArchivo);
            BufferedReader almacenamiento = new BufferedReader(_leer);
            cadena = "";
            while (cadena != null) {                
                try {
                 cadena = almacenamiento.readLine();
                    if (cadena != null) {
                        System.out.println(cadena);
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
           almacenamiento.close();
           _leer.close();
    
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
     }
}
