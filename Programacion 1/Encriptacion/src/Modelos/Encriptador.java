/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author sauld
 */
public class Encriptador {
    
    public int Encriptar(Algoritmo algo,int numero){
    return algo.Encriptar(numero);
    }
    public int Desencriptar(Algoritmo algo,int numero){
    return algo.Desencriptar(numero);
    }
  
}
