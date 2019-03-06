package Modelos;

public class Clases {
    private String nombreClase, horario, seccion, carrera, codigoClase;

    public Clases(String nombreClase, String horario,String seccion,String carrera, String codigoClase){
        this.nombreClase = nombreClase;
        this.horario = horario;
        this.seccion = seccion;
        this.carrera = carrera;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(String codigoClase) {
        this.codigoClase = codigoClase;
    }
}
