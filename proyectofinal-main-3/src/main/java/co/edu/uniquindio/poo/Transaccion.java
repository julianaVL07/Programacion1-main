package co.edu.uniquindio.poo;


import java.util.LinkedList;
import java.util.List;

public class Transaccion{
    public static List<Transaccion> transacciones = new LinkedList<>();
    public String fecha;
    private Empleado empleado;
    private Cliente cliente;  
    private Vehiculo vehiculo;
    
    public Transaccion(String fecha, Empleado empleado,Cliente cliente, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // Static methods
    public void registrarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
        System.out.println("Transacción registrada: " + transaccion);
    }

    public static List<Transaccion> filtrarTransacciones(String criterio, String valor, List<Transaccion> listaTransacciones) {
        List<Transaccion> resultados = new LinkedList<>();
        for (Transaccion transaccion : listaTransacciones) {
            switch (criterio.toLowerCase()) {
                case "cliente":
                    if (transaccion.getCliente().toString().equalsIgnoreCase(valor)) {
                        resultados.add(transaccion);
                    }
                    break;
                case "empleado":
                    if (transaccion.getEmpleado().toString().equalsIgnoreCase(valor)) {
                        resultados.add(transaccion);
                    }
                    break;
                case "fecha":
                    if (transaccion.getFecha().toString().equals(valor)) {
                        resultados.add(transaccion);
                    }
                    break;
            }
        }
        return resultados;
    }

    @Override
    public String toString() {
        return "Transaccion, vehiculo:" + vehiculo +"\nfecha:" + fecha+ "\ncliente:" + cliente
                + "\nempleado: " + empleado ;
    }

    public static List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public static void setTransacciones(List<Transaccion> transacciones) {
        Transaccion.transacciones = transacciones;
    }

    

    

    
}