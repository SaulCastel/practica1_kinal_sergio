public class LlamadaInterior extends Llamada{
    private Double PrecioUno = 0.20;
    private Double PrecioDos = 0.35;
    private Double PrecioTres = 0.85;
    private int franja;
    
    public LlamadaInterior (String numeroOrigen, String numeroDestino, Double duracion, int franja) {
        super(numeroOrigen, numeroDestino, duracion);
        this.setFranja(franja);
    }

    public Double calcularPrecio () {
        switch (this.getFranja()) {
            case 1:
                return this.PrecioUno * this.getDuracion();
            case 2:
                return this.PrecioDos * this.getDuracion();
            case 3:
                return this.PrecioTres * this.getDuracion();
            default:
                return -1.0;
        }
    }

    public void setFranja (int franja) {
        this.franja = franja;
    }
    
    public int getFranja () {
        return this.franja;
    }
}
