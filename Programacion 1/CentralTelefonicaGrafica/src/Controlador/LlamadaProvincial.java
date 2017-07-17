package Controlador;

import java.text.DecimalFormat;

public class LlamadaProvincial extends LLamada {

    protected final double precio1 = 0.20d;
    protected final double precio2 = 0.25d;
    protected final double precio3 = 0.30d;
    public int franja;

    public LlamadaProvincial(String numOrigen, String numDestino, double duracion, String tipO) {
        super(numOrigen, numDestino, duracion, tipO);
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }
    
    @Override
    public double CalcularPrecio() {
        DecimalFormat formateador = new DecimalFormat("####.##");
        if (this.franja == 1) {
            return Double.parseDouble(formateador.format(this.precio1 * super.getDuracion()));

        }
        if (this.franja == 2) {
            return Double.parseDouble(formateador.format(this.precio2 * super.getDuracion()));
        }
        if (this.franja == 3) {
            return Double.parseDouble(formateador.format(this.precio3 * super.getDuracion()));
        }
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat formateador = new DecimalFormat("####.##");
        String MostrarDatos
                = "\n###############Factura de llamada################\n"
                + " Numero de Origen:" + super.getNumOrigen() + "\n"
                + " Numero Destino:" + super.getNumDestino() + "\n"
                + " Duracion:" + super.getDuracion() + "\n"
                + " Precio de LLamada:" + formateador.format(CalcularPrecio()) + "\n"
                + " Franja numero:" + this.franja + "\n"
                + "#################################################\n\n";
        return MostrarDatos;
    }

    public int getFranja() {
        return franja;
    }
}
