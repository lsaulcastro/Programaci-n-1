package garagejava;

import java.util.Random;




public class Coche {
    //Atributos
    private Motor motor = new Motor(0);
    public String _marca, modelo;
    public double averias;
    //Constructor
    public Coche(String marc, String mode){this._marca = marc;this.modelo=mode;}
    //Getter para cada atributo
    public Motor getmotor(){return this.motor;}
    public String getmarca(){return this._marca;}
    public String getmodelo(){return this.modelo;}
    public double getaveria(){return this.averias;}
    //Metodo que incrementa el importe gastado en averias
    public void acumularAveria(){
     //  Random R = new Random();
       averias = Math.random()*3000;
        
    }
}
