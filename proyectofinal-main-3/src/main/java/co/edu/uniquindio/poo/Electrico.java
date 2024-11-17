package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Electrico extends Vehiculo {
    private double autonomia;
    private double tiempoCarga;
    
    public Electrico(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velocidadMaxima,
            double cilindraje, Transmision transmision, Combustible combustible, double autonomia, double tiempoCarga) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible);
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
        assert !codigo.isBlank();
        assert !marca.isBlank();
        assert !modelo.isBlank();

    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(double tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    @Override
    public String toString() {
        return "\nEléctrico{ "+super.toString()+"-su autonomía es: " + autonomia + "-su tiempo de Carga es" + tiempoCarga+"}";
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }

    
}
