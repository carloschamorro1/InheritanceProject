package Modelos;

public class Oyentes extends Persona{

    public Oyentes(String tipoPersona,String nombre, String apellido, String numeroIdentidad){
        super(tipoPersona,nombre,apellido,numeroIdentidad);
    }
    public Oyentes(){

    }
    @Override
    public void describirPersona() {
        System.out.println("Un oyente");
    }


}
