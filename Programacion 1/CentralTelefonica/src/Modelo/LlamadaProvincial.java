package Modelo;

public class LlamadaProvincial extends LLamada {

    private final double precio1 = 20;
    private final double precio2 = 25;
    private final double precio3 = 30;
    private int franja;

    public LlamadaProvincial(int franja, String numOrigen, String numDestino, double duracion) {
        super(numOrigen, numDestino, duracion);
        this.franja = franja;
    }

    @Override
    public double CalcularPrecio() {
        if (this.franja == 1) {
            return this.precio1 * super.getDuracion();

        }
        if (this.franja == 2) {
            return this.precio2 * super.getDuracion();
        }
        if (this.franja == 3) {
            return this.precio3 * super.getDuracion();
        }
        return 0;
    }
    
    @Override
    public String toString() {
        String MostrarDatos= "";
        return MostrarDatos;
    }
}
