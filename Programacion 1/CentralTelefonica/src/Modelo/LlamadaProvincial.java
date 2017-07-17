package Modelo;

import java.text.DecimalFormat;

public class LlamadaProvincial extends LLamada {

    private final double precio1 = 0.20d;
    private final double precio2 = 0.25d;
    private final double precio3 = 0.30d;
    private int franja;

    public LlamadaProvincial(int franja, String numOrigen, String numDestino, double duracion) {
        super(numOrigen, numDestino, duracion);
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
        String MostrarDatos = 
                    "\n###############Factura de llamada################\n"
                +   " Numero de Origen:" +super.getNumOrigen()+"\n"
                +   " Numero Destino:" +super.getNumDestino()+"\n"
                +   " Duracion:" +super.getDuracion()+"\n"
                +   " Precio de LLamada:" +formateador.format(CalcularPrecio())+"\n"
                +   " Franja numero:"+ this.franja +"\n"
                +   "#################################################\n\n" ;
        return MostrarDatos;
    }
}
