/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrosgui;

import com.itla.registrosbusines.entity.Estudiantes;
import com.itla.registrosbusines.entity.repositorio.EstudianteRepository;
import com.itla.registrosbusines.enums.RepositoryEnum;
import com.itla.registrosbusines.factory.ApplicationContext;

/**
 *
 * @author sauld
 */
public class Main {

    public static void main(String[] args) {

        Estudiantes estudiantes = new Estudiantes();
        estudiantes.setNombre("Saul");
        estudiantes.setApellido("Castro");
        estudiantes.setMatricula("2017-001");

        EstudianteRepository estudianterepository = (EstudianteRepository) ApplicationContext.getRepository(RepositoryEnum.ESTUDIANTE_REPOSITORY);
        estudianterepository.save(estudiantes);
    }
}
