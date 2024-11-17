package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Sedan extends VehiculoProvision {
    
    public Sedan(String codigo, String marca, String modelo, boolean nuevo, int cambios,
            double velocidadMaxima, double cilindraje, Transmision transmision, Combustible combustible,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, boolean aireAcondicionado, boolean abs,
            boolean camaraReversa, boolean sensorColision, boolean sensorTrafico, boolean asistentePermanenciaCarril,
            boolean velocidadCrucero, double capacidadCarga) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible,
                numeroPasajeros, numeroPuertas, numeroBolsasAire, aireAcondicionado, abs, camaraReversa,sensorColision,
                sensorTrafico, asistentePermanenciaCarril, velocidadCrucero, capacidadCarga);
            assert !codigo.isBlank();
            assert !marca.isBlank();
            assert !modelo.isBlank();
            assert numeroBolsasAire>=3;
            

    }

    @Override
    public String toString() {
        return "Sedan: "+super.toString();
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }

    


}
