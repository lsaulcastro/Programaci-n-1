
package Modelo;


public class LLamadaLocal extends  LLamada{
    private final double precio = 15;

    public LLamadaLocal(String numOrigen, String numDestino, double duracion) {
        super(numOrigen, numDestino, duracion);
    }

    @Override
    public double CalcularPrecio() {
        return this.precio * super.getDuracion();
    }
    @Override
     public String toString() {
        String MostrarDatos= "";
        return MostrarDatos;
    }
}
