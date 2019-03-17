package Modelos;

public class Maestro extends Persona{
    private String titulo;
    private int numeroCuentaMaestro;

    public Maestro(String tipoPersona,String nombre, String apellido, String numeroidentidad, String titulo, int numeroCuentaMaestro){
        super(tipoPersona,nombre,apellido,numeroidentidad);
        this.titulo = titulo;
        this.numeroCuentaMaestro = numeroCuentaMaestro;
    }

    public Maestro(){

    }

    @Override
    public void describirPersona() {
        System.out.println("Un maestro");
    }

    @Override
    public void describirPersona2() {
        System.out.println("Titulo: "+getTitulo() +"\t" + "Numero de cuenta: "+ getNumeroCuentaMaestro());
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroCuentaMaestro() {
        return numeroCuentaMaestro;
    }

    public void setNumeroCuentaMaestro(int numeroCuentaMaestro) {
        this.numeroCuentaMaestro = numeroCuentaMaestro;
    }


}
