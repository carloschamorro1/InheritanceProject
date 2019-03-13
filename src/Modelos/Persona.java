package Modelos;

public abstract class Persona {
    private String nombre,apellido, identidad;

    public Persona(String nombre, String apellido, String identidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.identidad = identidad;
    }
    public Persona(){
        
    }
//    public void verificarMaestro(){
//        if(this instanceof Maestro){
//            System.out.println("Ya existe maestro");
//        }
//
//    }
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
}
