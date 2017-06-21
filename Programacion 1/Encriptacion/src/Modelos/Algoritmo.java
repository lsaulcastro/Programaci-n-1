
package Modelos;

/**
 *
 * @author sauld
 */
public abstract class Algoritmo {
    protected  int codigoSecreto;
    public abstract int Encriptar(int numero);
    public abstract int Desencriptar(int numero);
}

