package Modelos;

public class Asistentes extends Persona{
    private String nombre,apellido,codigoAsistente;
    private int numerodeAsistente;


    public Asistentes(String nombre, String apellido, String codigoAsistente, int numerodeAsistente ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAsistente = codigoAsistente;
        this.numerodeAsistente = numerodeAsistente;
    }

    @Override
    public void describirPersona() {
        System.out.println("Un asistente");
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

    public String getCodigoAsistente() {
        return codigoAsistente;
    }

    public void setCodigoAsistente(String codigoAsistente) {
        this.codigoAsistente = codigoAsistente;
    }

    public int getNumerodeAsistente() {
        return numerodeAsistente;
    }

    public void setNumerodeAsistente(int numerodeAsistente) {
        this.numerodeAsistente = numerodeAsistente;
    }
}
