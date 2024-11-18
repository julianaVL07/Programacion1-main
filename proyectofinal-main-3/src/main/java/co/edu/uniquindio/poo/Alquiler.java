package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Alquiler extends Transaccion implements ICostoTransaccion{
    private int diasAlquiler ;
    private double precioAlquiler;
    
    
    public Alquiler( Cliente cliente,Vehiculo vehiculo, Empleado empleado, String fecha, int diasAlquiler, double precioAlquiler) {
        super(fecha, empleado, cliente, vehiculo);
        this.diasAlquiler=diasAlquiler;
        this.precioAlquiler=precioAlquiler;
        assert diasAlquiler>0;

    }


    public int getDiasAlquiler() {
        return diasAlquiler;
    }



    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }



    public double getPrecioAlquiler() {
        return precioAlquiler;
    }



    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }



    @Override
    public String toString() {
        return "Alquiler: "+super.toString()+ "\ndiasAlquiler: " + diasAlquiler+"\nprecioAquiler: "+precioAlquiler+ "\nPrecio total: "+ calcularCosto();
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public double calcularCosto(){
        return diasAlquiler*precioAlquiler;
    }
    

}