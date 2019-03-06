package Modelos;

public class Maestro extends Persona {
    private String nombre,apellido,titulo;
    private int numeroCuentaMaestro;

    public Maestro(String nombre, String apellido, String titulo, int numeroCuentaMaestro){
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.numeroCuentaMaestro = numeroCuentaMaestro;
    }

    public Maestro(){

    }

    @Override
    public void describirPersona() {
        System.out.println("Un maestro");
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroCuentaMaestro() {
        return numeroCuentaMaestro;
    }

    public void setNumeroCuentaMaestro(int numeroCuentaMaestro) {
        this.numeroCuentaMaestro = numeroCuentaMaestro;
    }


}
