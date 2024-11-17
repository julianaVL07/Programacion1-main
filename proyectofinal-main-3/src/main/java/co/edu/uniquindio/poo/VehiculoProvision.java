package co.edu.uniquindio.poo;

public class VehiculoProvision extends VehiculoEsencial{
    public boolean sensorColision;
    public boolean sensorTrafico;
    public boolean asistentePermanenciaCarril;
    public boolean velocidadCrucero;
    public double capacidadCarga;

    public VehiculoProvision(String codigo, String marca, String modelo, boolean nuevo, int cambios,
            double velocidadMaxima, double cilindraje, Transmision transmision, Combustible combustible,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, boolean aireAcondicionado, boolean abs,
            boolean camaraReversa, boolean sensorColision, boolean sensorTrafico, boolean asistentePermanenciaCarril,
            boolean velocidadCrucero, double capacidadCarga) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible,
                numeroPasajeros, numeroPuertas, numeroBolsasAire, aireAcondicionado, abs, camaraReversa);
        this.sensorColision = sensorColision;
        this.sensorTrafico = sensorTrafico;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
        this.velocidadCrucero = velocidadCrucero;
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isSensorColision() {
        return sensorColision;
    }

    public void setSensorColision(boolean sensorColision) {
        this.sensorColision = sensorColision;
    }

    public boolean isSensorTrafico() {
        return sensorTrafico;
    }

    public void setSensorTrafico(boolean sensorTrafico) {
        this.sensorTrafico = sensorTrafico;
    }

    public boolean isAsistentePermanenciaCarril() {
        return asistentePermanenciaCarril;
    }

    public void setAsistentePermanenciaCarril(boolean asistentePermanenciaCarril) {
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "VehiculoProvision:"+super.toString()+", sensorColision=" + sensorColision + ", sensorTrafico=" + sensorTrafico
                + ", asistentePermanenciaCarril=" + asistentePermanenciaCarril + ", velocidadCrucero="
                + velocidadCrucero + ", capacidadCarga=" + capacidadCarga;
    }

    
    
}
