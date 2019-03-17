package Modelos;

public class Asistentes extends Persona{
    private String codigoAsistente;
    private int numerodeAsistente;


    public Asistentes(String tipoPersona, String nombre, String apellido, String numeroIdentidad, String codigoAsistente, int numerodeAsistente ){
        super(tipoPersona,nombre,apellido,numeroIdentidad);
        this.codigoAsistente = codigoAsistente;
        this.numerodeAsistente = numerodeAsistente;
    }

    public Asistentes(){

    }
    @Override
    public void describirPersona() {
        System.out.println("Un asistente");
    }

    @Override
    public void describirPersona2(){
        System.out.println("Codigo de asistente: "+ codigoAsistente + "\t Numero de asistente " + numerodeAsistente);
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
