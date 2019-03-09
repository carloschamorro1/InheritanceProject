package Modelos;

public class Clases extends Persona {
    private String nombreClase, horario, seccion, uv, codigoClase;

    public Clases(String nombreClase, String horario,String seccion,String uv, String codigoClase){
        this.nombreClase = nombreClase;
        this.horario = horario;
        this.seccion = seccion;
        this.uv = uv;
        this.codigoClase = codigoClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }


    public String getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(String codigoClase) {
        this.codigoClase = codigoClase;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    @Override
    public void describirPersona() {

    }
}
