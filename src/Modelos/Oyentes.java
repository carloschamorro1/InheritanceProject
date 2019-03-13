package Modelos;

public class Oyentes extends Persona{

    public Oyentes(String nombre, String apellido, String numeroIdentidad){
        super(nombre,apellido,numeroIdentidad);
    }
    @Override
    public void describirPersona() {
        System.out.println("Un oyente");
    }


}
