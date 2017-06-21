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
public class AlgoritmoDiferencia extends  Algoritmo{

    public AlgoritmoDiferencia() {
        codigoSecreto = 10;
    }

    @Override
    public int Encriptar(int numero) {
        return numero - codigoSecreto;
    }

    @Override
    public int Desencriptar(int numero) {
      return codigoSecreto + numero;
    }
    
}
