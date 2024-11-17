package co.edu.uniquindio.poo;

public class PickUp extends VehiculoEsencial {
    private boolean cuatroxcuatro;
    private double capacidadCarga;

    public PickUp(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velocidadMaxima,
            double cilindraje, Transmision transmision, Combustible combustible, int numeroPasajeros, int numeroPuertas,
            int numeroBolsasAire, boolean aireAcondicionado, boolean abs, boolean camaraReversa, boolean cuatroxcuatro,
            double capacidadCarga) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible,
                numeroPasajeros, numeroPuertas, numeroBolsasAire, aireAcondicionado, abs, camaraReversa);
        this.cuatroxcuatro = cuatroxcuatro;
        this.capacidadCarga = capacidadCarga;
        assert velocidadMaxima<200.0;
    }

    public boolean isCuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "\npickUp{ "+super.toString()+"-cuatroxcuatro:" + cuatroxcuatro + "-capacidadCarga:" + capacidadCarga+"}";
    }

    
    
}
