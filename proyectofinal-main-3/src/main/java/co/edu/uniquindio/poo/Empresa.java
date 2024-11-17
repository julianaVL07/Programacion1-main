package co.edu.uniquindio.poo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Empresa {
    private String nombre;
    private LinkedList<Vehiculo> vehiculos;
    private LinkedList<Persona> personas;
    private LinkedList<Transaccion> transacciones;

    public Empresa(String nombre){
        this.nombre=nombre;
        vehiculos = new LinkedList<>();
        personas = new LinkedList<>();
        transacciones=new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public LinkedList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(LinkedList<Persona> personas) {
        this.personas = personas;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Empresa: nombre=" + nombre + "\nvehiculos=" + vehiculos + "\npersonas=" + personas+ "\nTransacciones="+transacciones;
    }

    public void agregarPersona(Persona persona){
        personas.add(persona);
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void agregarTransaccion(Transaccion transaccion){
        transacciones.add(transaccion);
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }


}





