package Modelos;

public class Oyentes extends Persona{
    private String nombre,apellido, numeroIdentidad;

    public Oyentes(String nombre, String apellido, String numeroIdentidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentidad = numeroIdentidad;
    }
    @Override
    public void describirPersona() {
        System.out.println("Un oyente");
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

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }
}
