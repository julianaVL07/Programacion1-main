package co.edu.uniquindio.poo;


public class Venta extends Transaccion{
    private double precioVenta;

    public Venta( Cliente cliente, Vehiculo vehiculo,Empleado empleado,String fecha, double precioVenta) {
        super(fecha, empleado, cliente, vehiculo);
        this.precioVenta=precioVenta;
        
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    @Override
    public String toString() {
        return "Venta: "+super.toString();
    }

}