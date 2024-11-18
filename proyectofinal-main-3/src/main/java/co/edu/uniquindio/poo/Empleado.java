package co.edu.uniquindio.poo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Empleado extends Persona{
    private String usuario;
    private String contraseña;
    private String recuperacionCuenta;
    private LinkedList<Cliente> clientes;
    private LinkedList<Vehiculo> vehiculos;
    private Administrador administrador;
    private boolean cuentaBloqueada;  // Atributo que indica si la cuenta está bloqueada


    public Empleado(String nombres, String apellidos, String cedula, String correo, String usuario, String contraseña,
            String recuperacionCuenta, Administrador administrador) {
        super(nombres, apellidos, cedula, correo);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.recuperacionCuenta = recuperacionCuenta;
        this.administrador=administrador;
        this.cuentaBloqueada = false;  // Inicialmente, la cuenta no está bloqueada
        clientes=new LinkedList<>();
        vehiculos=new LinkedList<>();
        assert !nombres.isBlank();
        assert !apellidos.isBlank();
        assert !cedula.isBlank();
        assert !correo.isBlank();
        assert !usuario.isBlank();
        assert !contraseña.isBlank();
        assert !recuperacionCuenta.isBlank();
    }

    // Método para bloquear la cuenta
    public void bloquearCuenta() {
        this.cuentaBloqueada = true;
    }

    // Método para desbloquear la cuenta
    public void desbloquearCuenta() {
        this.cuentaBloqueada = false;
    }

    public boolean getCuentaBloqueada() {
        return cuentaBloqueada;
    }  
      
    public void setCuentaBloqueada(boolean cuentaBloqueada) {
        this.cuentaBloqueada = cuentaBloqueada;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRecuperacionCuenta() {
        return recuperacionCuenta;
    }

    public void setRecuperacionCuenta(String recuperacionCuenta) {
        this.recuperacionCuenta = recuperacionCuenta;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {

        return "Empleado: Sus nombres son: " + nombres + ", sus apellidos: " + apellidos + ", su cédula es: " + cedula + ",su correo es: " + correo+ ", su usuario es: " + usuario + ", su contraseña es: " + contraseña + ", pregunta de recuperacion de cuenta: "+recuperacionCuenta+",su administrador es: " +administrador.getNombres();/* "\n Sus clientes son: " + clientes + "\nSus vehiculos son: " + vehiculos*/
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }

}
