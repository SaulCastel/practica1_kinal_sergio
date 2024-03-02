public abstract class Llamada {
    private String NumeroOrigen;
    private String NumeroDestino;
    private Double Duracion;

    public Llamada (String NumeroOrigen, String NumeroDestino, Double Duracion) {
        this.setNumeroDestino(NumeroDestino);
        this.setNumeroOrigen(NumeroOrigen);
        this.setDuracion(Duracion);
    }

    public abstract Double calcularPrecio();

    public void setNumeroOrigen (String NumeroOrigen) {
        this.NumeroOrigen = NumeroOrigen;
    }
    public void setNumeroDestino (String NumeroDestino) {
        this.NumeroDestino = NumeroDestino;
    }
    public void setDuracion (Double Duracion) {
        this.Duracion = Duracion;
    }

    public String getNumeroOrigen() {
        return this.NumeroOrigen;
    }
    public String getNumeroDestino() {
        return this.NumeroDestino;
    }
    public Double getDuracion() {
        return this.Duracion;
    }
}
