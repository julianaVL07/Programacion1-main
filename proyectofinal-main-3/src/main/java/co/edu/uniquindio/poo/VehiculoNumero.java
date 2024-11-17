package co.edu.uniquindio.poo;

public class VehiculoNumero extends Vehiculo {
    public int numeroPasajeros;
    public int numeroPuertas;
    public int numeroBolsasAire;

    public VehiculoNumero(String codigo, String marca, String modelo, boolean nuevo, int cambios,
            double velocidadMaxima, double cilindraje, Transmision transmision, Combustible combustible,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasAire) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    @Override
    public String toString() {
        return super.toString()+"-numero de pasajeros: " + numeroPasajeros + "-numero de puertas:" + numeroPuertas
                + "-numero de bolsas de aire" + numeroBolsasAire;
    }

    
    
}
