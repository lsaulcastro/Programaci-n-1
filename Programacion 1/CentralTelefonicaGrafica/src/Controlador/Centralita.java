package Controlador;

import java.text.DecimalFormat;

public class Centralita {

    private int contador = 0;
    private double acum;
    private DB_Eventos db = null;

    public int getTotalLLamadas() {
        db = DB_Eventos.getinstance();
        return db.ReturnLLamadasRealizadasTotal();
    }

    public double getTotalFacturado() {
        DecimalFormat formateador = new DecimalFormat("####.##");
        db = DB_Eventos.getinstance();
        //db.PrecioTotal();
        return Double.parseDouble(formateador.format(db.ReturnPrecioTotal()));
    }

    public void registrarLLamada(LLamada a) {
        contador++;
        db = DB_Eventos.getinstance();
        db.saveInDB(a);
        db.saveFactura(a.CalcularPrecio());
    }
}
