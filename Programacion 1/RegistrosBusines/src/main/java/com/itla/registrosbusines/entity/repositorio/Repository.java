/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrosbusines.entity.repositorio;

import java.util.List;

/**
 *
 * @author sauld
 */
public interface Repository<T, ID> {

    void save(T entity);

    void update(T entity);

    T finByid(ID id);

    List<T> finAll();
}
