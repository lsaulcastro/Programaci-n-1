package centraltelefonica;

import Modelo.Centralita;
import Modelo.FicheroCSV;
import Modelo.LLamada;
import Modelo.LLamadaLocal;
import Modelo.LlamadaProvincial;
import java.util.*;
/**
 *
 * @author sauld
 */
public class CentralTelefonica {

    public static Scanner Read = new Scanner(System.in);
    public static FicheroCSV fiche = new FicheroCSV();
    public static void main(String[] args) {

        EjecutarPrograma();
    }

    public static void MenuLLamadaPrincipal() {

        System.out.println("#################################\n#     Opciones de llamadas"
                + "      #\n#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n#1. LLamada Local"
                + "               #\n#2. LLamada Provincial          #\n#3. Registro de LLamadas        #\n#0. Salir                       #\n#################################\n~Opcion: ");
    }

    public static void MenuLLamada(int menu) {
        if (menu == 2) {
            System.out.println("#################################\n#     Opciones de Provincial    #\n#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n#1. Realizar LLamada"
                    + "            #\n#################################\n~Opcion:");
        }
        if (menu == 1) {
            System.out.println("#################################\n#     Opciones de Local         #\n#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n#1. Realizar LLamada"
                    + "            #\n#################################\n~Opcion:");
        }

    }

    public static void EjecutarPrograma() {
        int opcion = 0;
        Centralita central = new Centralita();
        LLamada[] llamada = new LLamada[2];
        String numOrigen = "";
        String numDestino = "";
        double duracion = 0;
        do {
            MenuLLamadaPrincipal();

            try {

                opcion = Read.nextInt();

            } catch (InputMismatchException e) {

                System.out.println(e.getMessage() + "Error! Por Favor ingrese un numero entero!");

            }

            switch (opcion) {
                case 1:
                    System.out.println("\n\n");
                    MenuLLamada(opcion);
                    int opcion2;
                    opcion2 = Read.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingrese los siguientes datos de la llamada: ");
                            System.out.println("###########Ingrese los datos#################");
                            System.out.println("Numero de Origen: ");
                            numOrigen = Read.next();
                            System.out.println("Numero de Destino: ");
                            numDestino = Read.next();
                            System.out.println("Duracion: ");
                            duracion = 0;
                            try {
                                duracion = Read.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println(e.getMessage() + "Error! Por Favor ingrese un numero entero!");
                            }
                            System.out.println("########################################");
                            
                            llamada[0] = new LLamadaLocal(numOrigen, numDestino, duracion);
                            central.registrarLLamada(llamada[0]);
                            System.out.print(llamada[0].toString());
                            
                            fiche.RegistrarLocales(numOrigen, numDestino, duracion, central.getTotalFacturado());
                           
                            
                            // System.out.print(central.getTotalLLamadas() + "\n\n");
                            System.out.print(central.getTotalFacturado() + "\n\n");
                            break;
                        case 2:

                            break;
                        default:
                            System.out.println("Opcion Errada! intende de nuevo!\n\n");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n\n");
                    MenuLLamada(opcion);
                    opcion2 = 0;
                    opcion2 = Read.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingrese los siguientes datos de la llamada: ");
                            System.out.println("###########Ingrese los datos#############");
                            System.out.println("Numero de Origen: ");
                            numOrigen = Read.next();
                            System.out.println("Numero de Destino: ");
                            numDestino = Read.next();
                            System.out.println("Duracion: ");
                            duracion = 0;

                            try {
                                duracion = Read.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println(e.getMessage() + "Error! Por Favor ingrese un numero entero!");
                            }
                            System.out.println("########################################");
                            // DecimalFormat formateador =  new DecimalFormat("#");
                            //   int numero = (int) (Math.random() * 3) + 1;
                            //   System.out.println("\n\n" + numero);
                            //   System.out.println((int) (Math.random() * 3) + 1);
                            llamada[1] = new LlamadaProvincial((int) (Math.random() * 3) + 1, numOrigen, numDestino, duracion);
                            //System.out.println(llamada[1].CalcularPrecio());
                            System.out.print(llamada[1].toString());
                            central.registrarLLamada(llamada[1]);
                            System.out.print(central.getTotalFacturado() + "\n\n");
                            break;
                        default:
                            System.out.println("Opcion Errada! intende de nuevo!\n\n");
                            break;
                    }
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Saliendo del programa!");
                    break;
                default:
                    System.out.println("Opcion Errada! intende de nuevo!\n\n");
                    break;
            }

        } while (opcion != 0);
    }
}
