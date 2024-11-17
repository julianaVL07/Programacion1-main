package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Hibrido extends Vehiculo {
    private boolean enchufable;
    private boolean ligero;
    
    public Hibrido(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velocidadMaxima,
            double cilindraje, Transmision transmision, Combustible combustible, boolean enchufable, boolean ligero) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible);
        this.enchufable = enchufable;
        this.ligero = ligero;
        assert !codigo.isBlank();
        assert !marca.isBlank();
        assert !modelo.isBlank();
    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    public boolean isLigero() {
        return ligero;
    }

    public void setLigero(boolean ligero) {
        this.ligero = ligero;
    }

    @Override
    public String toString() {
        return "\nHibrido{ "+super.toString()+"-enchufable:" + enchufable + "-ligero:" + ligero+"}";
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }

    


}
