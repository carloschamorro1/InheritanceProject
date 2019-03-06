package Modelos;

public class Alumnos extends Persona{
    private String nombre, apellido, numeroCuentaAlumno;

    public Alumnos(String nombre, String apellido, String numeroCuentaAlumno){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuentaAlumno = numeroCuentaAlumno;
    }

    @Override
    public void describirPersona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroCuentaAlumno() {
        return numeroCuentaAlumno;
    }

    public void setNumeroCuentaAlumno(String numeroCuentaAlumno) {
        this.numeroCuentaAlumno = numeroCuentaAlumno;
    }
}
