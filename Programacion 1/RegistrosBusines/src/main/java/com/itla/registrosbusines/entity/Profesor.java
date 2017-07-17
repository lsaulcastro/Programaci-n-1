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
public class Profesor extends Persona {
//Atributos del profesor

    private Long _codigo;

    public Long getCodigo() {
        return _codigo;
    }

    public void setCodigo(Long _codigo) {
        this._codigo = _codigo;
    }

}
