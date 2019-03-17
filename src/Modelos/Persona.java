package Modelos;

public abstract class Persona {
    private String tipoPersona,nombre,apellido, identidad;

    public Persona(String tipoPersona, String nombre, String apellido, String identidad){
        this.tipoPersona = tipoPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identidad = identidad;
    }
    public Persona(){

    }


    public abstract void describirPersona();

    public abstract void describirPersona2();


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

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

}
