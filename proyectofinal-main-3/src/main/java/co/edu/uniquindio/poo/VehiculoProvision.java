package co.edu.uniquindio.poo;

public class VehiculoProvision extends VehiculoEsencial{
    public boolean sensorColision;
    public boolean sensorTrafico;
    public boolean asistentePermanenciaCarril;
    public boolean velocidadCrucero;
    public double capacidadMaletero;

    public VehiculoProvision(String codigo, String marca, String modelo, boolean nuevo, int cambios,
            double velocidadMaxima, double cilindraje, Transmision transmision, Combustible combustible,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, boolean aireAcondicionado, boolean abs,
            boolean camaraReversa, boolean sensorColision, boolean sensorTrafico, boolean asistentePermanenciaCarril,
            boolean velocidadCrucero, double capacidadMaletero) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible,
                numeroPasajeros, numeroPuertas, numeroBolsasAire, aireAcondicionado, abs, camaraReversa);
        this.sensorColision = sensorColision;
        this.sensorTrafico = sensorTrafico;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
        this.velocidadCrucero = velocidadCrucero;
        this.capacidadMaletero = capacidadMaletero;
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
        return capacidadMaletero;
    }

    public void setCapacidadCarga(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return super.toString()+"-sensorColision=" + sensorColision + "-sensor de Trafico: " + sensorTrafico
                + "-asistente de permanencia del Carril: " + asistentePermanenciaCarril + "-velocidad Crucero: "
                + velocidadCrucero + "-capacidad de Carga:" + capacidadMaletero;
    }

    
    
}
