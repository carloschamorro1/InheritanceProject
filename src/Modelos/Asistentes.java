package Modelos;

public class Asistentes extends Persona{
    private String codigoAsistente;
    private int numerodeAsistente;


    public Asistentes(String nombre, String apellido, String numeroIdentidad, String codigoAsistente, int numerodeAsistente ){
        super(nombre,apellido,numeroIdentidad);
        this.codigoAsistente = codigoAsistente;
        this.numerodeAsistente = numerodeAsistente;
    }

    @Override
    public void describirPersona() {
        System.out.println("Un asistente");
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
