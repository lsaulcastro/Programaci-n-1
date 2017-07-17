package Controlador;

public abstract class LLamada {

    private String numOrigen;
    private String numDestino;
    private double duracion;
    private String tipo = "";
    private static LLamada llamada;
   

    public LLamada(String numOrigen, String numDestino, double duracion, String tipO) {
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.duracion = duracion;
        this.tipo = tipO;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumOrigen() {
        return numOrigen;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public double getDuracion() {
        return duracion;
    }

    public abstract double CalcularPrecio();
    
    public static LLamada getinstance(){
        if (true) {
            
        }
    return llamada;
    }
}
