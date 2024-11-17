package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Camioneta extends VehiculoProvision {
    private boolean cuatroxcuatro;

    public Camioneta(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velocidadMaxima,
            double cilindraje, Transmision transmision, Combustible combustible, int numeroPasajeros, int numeroPuertas,
            int numeroBolsasAire, boolean aireAcondicionado, boolean abs, boolean camaraReversa, boolean sensorColision,
            boolean sensorTrafico, boolean asistentePermanenciaCarril, boolean velocidadCrucero, double capacidadMaletero,
            boolean cuatroxcuatro) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible,
                numeroPasajeros, numeroPuertas, numeroBolsasAire, aireAcondicionado, abs, camaraReversa, sensorColision,
                sensorTrafico, asistentePermanenciaCarril, velocidadCrucero, capacidadMaletero);
        this.cuatroxcuatro = cuatroxcuatro;
        assert !codigo.isBlank();
        assert !marca.isBlank();
        assert !modelo.isBlank();
        assert numeroPuertas>=4;
    }

    public boolean isCuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    @Override
    public String toString() {
        return "\nCamioneta{ "+super.toString()+"-tiene 4x4:" + cuatroxcuatro+"}";
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
