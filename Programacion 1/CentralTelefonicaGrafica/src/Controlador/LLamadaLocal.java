package Controlador;

import Modelo.ModeloDatos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class LLamadaLocal extends LLamada {

    private final double precio = 0.15d;

    public LLamadaLocal(String numOrigen, String numDestino, double duracion, String tipO) {
        super(numOrigen, numDestino, duracion, tipO);
    }
   
    @Override
    public double CalcularPrecio() {
        DecimalFormat formateador = new DecimalFormat("####.##");
        return Double.parseDouble(formateador.format(this.precio * super.getDuracion()));
    }

    @Override
    public String toString() {
        DecimalFormat formateador = new DecimalFormat("####.##");
        String MostrarDatos
                = "\n###############Factura de llamada################\n"
                + " Numero de Origen:" + super.getNumOrigen() + "        \n"
                + " Numero Destino:" + super.getNumDestino() + "        \n"
                + " Duracion:" + super.getDuracion() + "                \n"
                + " Precio de LLamada:" + formateador.format(CalcularPrecio()) + "            \n"
                + "#################################################";
        return MostrarDatos;
    }

    //*******************Metodo para guardar en mi base de datos*************************************
   
}
