
package garagejava;

public class PracticaPOO {

   
    public static void main(String[] args) {
        // TODO code application logic here
       Garaje G = new Garaje();
       //Crear dos coches y uno para probar el Metodo G.devolverCoche
       Coche c1 = new Coche("Lexus ", "LC-500 ");
       c1.getmotor().setPotencia(15);c1.getmotor().setLitrosAceite(23);
       Coche c = new Coche("Honda ", "Civic ");
       c.getmotor().setPotencia(5);c.getmotor().setLitrosAceite(12);

        //Entrada del vehiculo en el garaje, Confirmacion de vehiculos ingresados, Entrar en el garage
       G.aceptarCoche(c, "Aceite");
         //Salida del vehiculo
       G.devolverCoche();
          //Aqui generamos el importe por la averia
       c.acumularAveria();
          //En la condicion siguiente, Si la averia es aceite se le aumentara el aceite del vehiculo en 10
        if (G.nombre_Averia == "Aceite" ||G.nombre_Averia == "aceite") {
           c.getmotor().setLitrosAceite(c.getmotor().getLitrosAceite() + 10);
           c1.getmotor().setLitrosAceite(c1.getmotor().getLitrosAceite() + 10);
        }
        //Mostrar en consola los datos del vehiculo despachado
       System.out.println("          Vehiculo \nMarca: " + c.getmarca() + "\nModelo: " + c.getmodelo() + "\nCon averia de: " + G.nombre_Averia + "\nImporte por la averia: " + String.format("%.2f", c.getaveria()) + "\nAceite:  " + c.getmotor().getLitrosAceite() + "\n-------------------------------" );   
       //Prueba de que el metodo devolverCoche funciona correctamente
       //Ingresar un nuevo vehiculo para la prueba, sin despachar
        G.aceptarCoche(c1, "Aceite");
        //Ingresamos el mismo vehiculo pero esta vez con el garaje disponible
        G.aceptarCoche(c1, "Aceite");c1.acumularAveria();
        G.devolverCoche();
        System.out.println("          Vehiculo \nMarca: " + c1.getmarca() + "\nModelo: " + c1.getmodelo() + "\nCon averia de: " + G.nombre_Averia + "\nImporte por la averia: " + String.format("%.2f", c1.getaveria()) + "\nAceite:  " + c1.getmotor().getLitrosAceite() + "\n-------------------------------" );   
    }
    
}
