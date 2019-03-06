package Modelos;

public class Asistentes extends Persona{
    private String nombre,apellido,codigoAsistente, numerodeAsistente;


    public Asistentes(String nombre, String apellido, String codigoAsistente, String numerodeAsistente ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAsistente = codigoAsistente;
        this.numerodeAsistente = numerodeAsistente;
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

    public String getCodigoAsistente() {
        return codigoAsistente;
    }

    public void setCodigoAsistente(String codigoAsistente) {
        this.codigoAsistente = codigoAsistente;
    }

    public String getNumerodeAsistente() {
        return numerodeAsistente;
    }

    public void setNumerodeAsistente(String numerodeAsistente) {
        this.numerodeAsistente = numerodeAsistente;
    }
}
