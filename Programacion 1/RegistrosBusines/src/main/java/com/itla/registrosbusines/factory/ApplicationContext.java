/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrosbusines.factory;

import com.itla.registrosbusines.entity.repositorio.Repository;
import com.itla.registrosbusines.entity.repositorio.imp.EstudiantesRepositoryImpl;
import com.itla.registrosbusines.entity.repositorio.imp.ProfesorRepositoryImple;
import com.itla.registrosbusines.enums.RepositoryEnum;

/**
 *
 * @author sauld
 */
public class ApplicationContext {
    public static Repository getRepository(RepositoryEnum repositoruEnum){
    switch(repositoruEnum){
        case  ESTUDIANTE_REPOSITORY:
            return new EstudiantesRepositoryImpl();
            
        case PROFESOR_REPOSITORY:
            return new ProfesorRepositoryImple();
        default:
            return null;
          
    
    }
   
    }
}
