package co.edu.uniquindio.poo;


import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Administrador extends Persona {
    private String usuario;
    private String contraseña;
    private String recuperacionCuenta;
    private LinkedList<Empleado> empleados;

    public Administrador(String nombres, String apellidos, String cedula, String correo, String usuario,
            String contraseña, String recuperacionCuenta) {
        super(nombres, apellidos, cedula, correo);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.recuperacionCuenta = recuperacionCuenta;
        empleados=new LinkedList<>();
        assert !nombres.isBlank();
        assert !apellidos.isBlank();
        assert !cedula.isBlank();
        assert !correo.isBlank();
        assert !usuario.isBlank();
        assert !contraseña.isBlank();
        assert !recuperacionCuenta.isBlank();
        assert correo.contains("@");
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

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Administrador: Sus nombres son: " + nombres + ", sus apellidos: " + apellidos + ", su cédula es: " + cedula + ",su correo es:" + correo+ ", su usuario es:" + usuario + ", su contraseña es:" + contraseña + ",pregunta de recuperacion de cuenta: "+ recuperacionCuenta + "\nSus Empleados son: " + empleados;
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }
    

   

}
