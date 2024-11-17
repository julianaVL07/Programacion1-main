package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Moto extends Vehiculo {
    
    public Moto(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velocidadMaxima,
            double cilindraje, Transmision transmision, Combustible combustible) {
                super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible);  
        assert !codigo.isBlank();
        assert !marca.isBlank();
        assert !modelo.isBlank();
    }

    @Override
    public String toString() {
        return "Moto: "+super.toString();
    }
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }
}