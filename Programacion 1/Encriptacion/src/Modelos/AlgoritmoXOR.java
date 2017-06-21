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
public class AlgoritmoXOR extends Algoritmo{

    public AlgoritmoXOR() {
        codigoSecreto = 2;
    }
    

    @Override
    public int Encriptar(int numero) {
      return codigoSecreto ^ numero;
    }

    @Override
    public int Desencriptar(int numeroEncriptado) {
       return numeroEncriptado ^ codigoSecreto;
    }
    
}
