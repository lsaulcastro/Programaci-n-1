/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrosbusines.entity.repositorio.imp;

import com.itla.registrosbusines.entity.Estudiantes;
import com.itla.registrosbusines.entity.repositorio.EstudianteRepository;
import java.util.List;


/**
 *
 * @author sauld
 */
public class EstudiantesRepositoryImpl implements EstudianteRepository{

    @Override
    public void save(Estudiantes entity) {
        System.out.println(entity.toString());
    }

    @Override
    public void update(Estudiantes entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estudiantes finByid(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estudiantes> finAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
