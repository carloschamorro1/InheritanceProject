package Modelos;

public abstract class Persona {
    private String tipoPersona,nombre,apellido, identidad;
    Maestro maestro;
    Asistentes asistentes;
    Alumnos alumnos;
    Oyentes oyentes;

    public Persona(String tipoPersona, String nombre, String apellido, String identidad){
        this.tipoPersona = tipoPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identidad = identidad;
    }
    public Persona(){

    }

    public void verificar(){
        if(this instanceof Maestro){
            System.out.println(maestro.getNombre() + maestro.getApellido());
        }
        else if(this instanceof Alumnos){
            System.out.println(alumnos.getNombre() + alumnos.getApellido());
        }

    }
    public abstract void describirPersona();


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
