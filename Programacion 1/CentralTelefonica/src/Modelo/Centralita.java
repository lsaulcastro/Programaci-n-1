package Modelo;

import java.text.DecimalFormat;
/**
 *
 * @author sauld
 */
public class Centralita {

    private int contador = 0;
    private double acum;

    public int getTotalLLamadas() {
        return contador;
    }

    public double getTotalFacturado() {
        DecimalFormat formateador =  new DecimalFormat  ("####.##");
        return Double.parseDouble(formateador.format(acum));
    }

    public void registrarLLamada(LLamada a) {
        contador++;
            acum = acum + a.CalcularPrecio();
    }
}
