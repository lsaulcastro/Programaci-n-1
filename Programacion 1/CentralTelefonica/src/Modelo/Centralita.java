package Modelo;

public class Centralita {

    private int contador = 0;
    private double acum;

    public int getTotalLLamadas() {
        return contador;
    }

    public double getTotalFacturado() {

        return 0;
    }

    public void registrarLLamada(LLamada a) {
        contador++;
    }
}
