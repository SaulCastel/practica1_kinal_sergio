public class LlamadaLocal extends Llamada{
    private Double Precio = 0.25;
    
    public LlamadaLocal (String numeroOrigen, String numeroDestino, Double duracion) {
        super(numeroOrigen, numeroDestino, duracion);
    }

    public Double calcularPrecio () {
        return this.Precio * this.getDuracion();
    }
}
