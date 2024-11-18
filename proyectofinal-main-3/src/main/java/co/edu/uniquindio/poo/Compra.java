package co.edu.uniquindio.poo;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Compra extends Transaccion{
    private double precioCompra;

    public Compra(Cliente cliente,Vehiculo vehiculo, Empleado empleado,String fecha, double precioCompra) {
        super(fecha, empleado, cliente, vehiculo);
        this.precioCompra=precioCompra;
        assert !fecha.isBlank();
        assert precioCompra>0;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    @Override
    public String toString() {
        return "Compra: "+super.toString()+"\nprecioCompra: "+precioCompra;
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }


    
   

    

}