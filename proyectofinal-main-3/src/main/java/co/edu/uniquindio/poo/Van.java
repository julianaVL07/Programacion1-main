package co.edu.uniquindio.poo;

public class Van extends VehiculoEsencial {
    private double capacidadMaletero;

    public Van(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velocidadMaxima,
            double cilindraje, Transmision transmision, Combustible combustible, int numeroPasajeros, int numeroPuertas,
            int numeroBolsasAire, boolean aireAcondicionado, boolean abs, boolean camaraReversa,
            double capacidadMaletero) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible,
                numeroPasajeros, numeroPuertas, numeroBolsasAire, aireAcondicionado, abs, camaraReversa);
        this.capacidadMaletero = capacidadMaletero;
        assert !codigo.isBlank();
        assert !marca.isBlank();
        assert !modelo.isBlank();
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return "\nVan{ "+super.toString()+"-capacidadMaletero:" + capacidadMaletero+"kg }";
    }
    
    
}
