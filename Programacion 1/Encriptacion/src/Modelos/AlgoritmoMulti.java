
package Modelos;

/**
 *
 * @author sauld
 */
public class AlgoritmoMulti extends Algoritmo{

    public AlgoritmoMulti() {
        codigoSecreto =10;
    }
   
    
    @Override
    public int Encriptar(int numero) {
       return codigoSecreto * numero;
    }

    @Override
    public int Desencriptar(int numeroEncriptado) {
       return numeroEncriptado / codigoSecreto;
    }
    
}
