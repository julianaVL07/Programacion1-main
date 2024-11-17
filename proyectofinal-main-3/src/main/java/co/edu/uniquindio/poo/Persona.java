package co.edu.uniquindio.poo;

public class Persona {
    public String nombres;
    public String apellidos;
    public String cedula;
    public String correo;

    public Persona(String nombres, String apellidos, String cedula, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona: nombres=" + nombres + ", apellidos=" + apellidos + ", cedula=" + cedula + ", correo=" + correo;
    }

    
    
}
