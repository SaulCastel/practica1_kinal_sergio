public class CentralTelefonica {
    private int Contador;
    private Double acumulador;

    public CentralTelefonica () {
        this.Contador = 0;
        this.acumulador = 0.0;
    }

    public void RegistrarLlamada (Llamada registro) {
        this.Contador++;
        this.acumulador += registro.calcularPrecio();
    }

    public int GetTotalLLamadas () {
        return this.Contador;
    }

    public Double GetTotalFacturas () {
        return this.acumulador;
    }
} 