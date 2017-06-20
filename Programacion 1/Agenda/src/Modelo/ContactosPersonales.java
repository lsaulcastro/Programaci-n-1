/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static Controlador.AgendaA.a;
import static Controlador.AgendaA.fechaContro;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sauld
 */
public class ContactosPersonales extends Contactos{
    private String _telefonoCasa;
    public static Date _fechaCumple;
    public static SimpleDateFormat F;

    public ContactosPersonales() {}
  
    public ContactosPersonales(String _n, String _d, String _codP, String _telefono, String _correo, String _url,String _telefonoCasa, String fech) {
        super(_n, _d, _codP, _telefono, _correo, _url);
        this._telefonoCasa = _telefonoCasa;
        fechaUSer(fech);
     //   System.out.println(getFechaCumple());
        fechaContro[a] = getFechaCumple();
        
       // this._fechaCumple = _fechaCumple;
    }

    public String getTelefonoCasa() { return _telefonoCasa;}
    public void setTelefonoCasa(String _telefonoCasa) {this._telefonoCasa = _telefonoCasa; }
    public static Date getFechaCumple() {return _fechaCumple; }
    public void setFechaCumple(Date _fechaCumple) {

        ContactosPersonales._fechaCumple = _fechaCumple;}
    //Este metodo es para que devuelva la fecha actual para luego comparar con la fecha ingresada

   
    
    public static String fechaActual(){
        Date Fecha = null;
        if ( Fecha == null) {
            Fecha = new Date();
            F = new SimpleDateFormat("dd-MM-yyyy");
            
        }
        return F.format(Fecha);
    }
    //Este metodo es para que el usuario me ingrese la fehca en formato dd-MM-yy
    public static String fechaUSer(String f) { 
        try {
            F = new SimpleDateFormat("dd-MM-yyyy");
            _fechaCumple = F.parse(f);
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }
    return f ;
    }

    @Override
    public void MostradContac() {
        super.MostradContac(); //To change body of generated methods, choose Tools | Templates.
        F = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Facebook: " + getUrl() + "\nTelefono casa: "  + this._telefonoCasa +"\nFecha de HBD: " + F.format(getFechaCumple())
            +  "\n___________________________");
    }
          
}
