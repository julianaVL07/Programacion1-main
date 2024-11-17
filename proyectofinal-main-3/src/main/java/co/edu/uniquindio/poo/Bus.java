package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Bus extends VehiculoEsencial {
    private int numeroEjes;
    private int numeroSalidasEmergencia;
    private double capacidadMaletero;
    
    public Bus(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velocidadMaxima,
            double cilindraje, Transmision transmision, Combustible combustible, int numeroPasajeros, int numeroPuertas,
            int numeroBolsasAire, boolean aireAcondicionado, boolean abs, boolean camaraReversa, int numeroEjes,
            int numeroSalidasEmergencia, double capacidadMaletero) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible,
                numeroPasajeros, numeroPuertas, numeroBolsasAire, aireAcondicionado, abs, camaraReversa);
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        this.capacidadMaletero = capacidadMaletero;
        assert numeroPasajeros>=0;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Bus:"+super.toString()+", numeroEjes=" + numeroEjes + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia
                + ", capacidadMaletero=" + capacidadMaletero;
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }

    
}
