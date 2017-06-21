
package encriptacion;


import Modelos.AlgoritmoDiferencia;
import Modelos.AlgoritmoMulti;
import Modelos.AlgoritmoXOR;
import Modelos.Encriptador;
import java.util.Scanner;

/**
 *
 * @author sauld
 */
public class Encriptacion {

    /**
     * @param args the command line arguments
     */
    public static Scanner Leer = new Scanner(System.in);
    public static Encriptador encri = new Encriptador();
    
    public static void main(String[] args) {
        
       
    }
    //Encriptacion por el metodo XOR
    public  static void EncriptacionXOR(){
        System.out.println("~~~~~~Metodo de Encriptacion XOR~~~~~~~\nIngrese el numero a encriptar: ");
        int x = Leer.nextInt();
        AlgoritmoXOR algo = new AlgoritmoXOR();
        int encriptado= encri.Encriptar(algo, x);
        System.out.println("Numero "+x+" encriptado en XOR es: " + encriptado); 
        System.out.println("Numero "+encriptado+" desinciptado en XOR es: " + encri.Desencriptar(algo,encriptado));
    }
    //Encriptacion por el metodo Multiplicacion
     public  static void EncriptacionMulti(){
        System.out.println("~~~~~~Metodo de Multiplicacion~~~~~~~\nIngrese el numero a encriptar: ");
        int x = Leer.nextInt();
         AlgoritmoMulti algo = new AlgoritmoMulti();
        int encriptado= encri.Encriptar(algo, x);
        System.out.println("Numero "+x+" encriptado en Multiplicacion es: " + encriptado); 
        System.out.println("Numero "+encriptado+" desinciptado en Multiplicacion es: " + encri.Desencriptar(algo,encriptado));
    }
     //Encriptacion por el metodo de diferencia
      public  static void EncriptacionDiferencia(){
        System.out.println("~~~~~~Metodo de Diferencia~~~~~~~\nIngrese el numero a encriptar: ");
        int x = Leer.nextInt();
          AlgoritmoDiferencia algo = new  AlgoritmoDiferencia();
        int encriptado= encri.Encriptar(algo, x);
        System.out.println("Numero "+x+" encriptado en diferencia es: " + encriptado); 
        System.out.println("Numero "+encriptado+" desinciptado en diferencia es: " + encri.Desencriptar(algo,encriptado));
    }
}
