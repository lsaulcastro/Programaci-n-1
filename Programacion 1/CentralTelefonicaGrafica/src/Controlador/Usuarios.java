/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author sauld
 */
public class Usuarios {
    private String nombre;
    private String apellido;
    private String userName;
    private String clave;

    public Usuarios(String nombre, String apellido, String userName, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
        this.clave = clave;
    }

    

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    
}

