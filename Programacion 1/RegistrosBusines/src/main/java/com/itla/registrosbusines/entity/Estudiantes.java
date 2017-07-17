/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrosbusines.entity;

/**
 *
 * @author sauld
 */
public class Estudiantes extends Persona {
//Atributos de Estudiantes

    private String _matricula;

    public String getMatricula() {
        return _matricula;
    }

    public void setMatricula(String _matricula) {
        this._matricula = _matricula;
    }

    @Override
    public String toString() {
        return "[" +_nombre +" "+ _apellido +" " + _matricula +"]"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
