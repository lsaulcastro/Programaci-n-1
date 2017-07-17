
package Modelo;

import java.text.DecimalFormat;


public class LLamadaLocal extends  LLamada{
    private final double precio = 0.15d;

    public LLamadaLocal(String numOrigen, String numDestino, double duracion) {
        super(numOrigen, numDestino, duracion);
    }

    

    @Override
    public double CalcularPrecio() {
        DecimalFormat formateador = new DecimalFormat("####.##");
        return Double.parseDouble(formateador.format(this.precio * super.getDuracion()));
    }
    @Override
     public String toString() {
         DecimalFormat formateador = new DecimalFormat("####.##");
        String MostrarDatos = 
                    "\n###############Factura de llamada################\n"
                +   " Numero de Origen:" +super.getNumOrigen()+"        \n"
                +   " Numero Destino:" +super.getNumDestino()+"        \n"
                +   " Duracion:" +super.getDuracion()+"                \n"
                +   " Precio de LLamada:" +formateador.format(CalcularPrecio())+"            \n"
                +   "#################################################" ;     
        return MostrarDatos;
    }
}
