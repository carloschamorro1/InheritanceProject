package Modelos;

public class Alumnos extends Persona{
    private String nombre, apellido;
    private int numeroCuentaAlumno;

    public Alumnos(String nombre, String apellido, int numeroCuentaAlumno){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuentaAlumno = numeroCuentaAlumno;
    }

    @Override
    public void describirPersona() {
        System.out.println("Un alumno");
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

    public int getNumeroCuentaAlumno() {
        return numeroCuentaAlumno;
    }

    public void setNumeroCuentaAlumno(int numeroCuentaAlumno) {
        this.numeroCuentaAlumno = numeroCuentaAlumno;
    }
}
