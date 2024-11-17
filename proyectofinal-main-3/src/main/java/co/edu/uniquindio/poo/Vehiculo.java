package co.edu.uniquindio.poo;

public class Vehiculo {
    public String codigo;
    public String marca;
    public String modelo;
    public boolean nuevo;
    public int cambios;
    public double velocidadMaxima;
    public double cilindraje;
    public Transmision transmision;
    public Combustible combustible;

    public Vehiculo(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velocidadMaxima,
            double cilindraje, Transmision transmision, Combustible combustible) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.nuevo = nuevo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.transmision = transmision;
        this.combustible = combustible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Vehiculo: codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", nuevo=" + nuevo
                + ", cambios=" + cambios + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje
                + ", transmision=" + transmision + ", combustible=" + combustible;
    }

    
    

}
