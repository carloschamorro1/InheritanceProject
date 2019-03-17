package Modelos;

public class Alumnos extends Persona{
    private int numeroCuentaAlumno;

    public Alumnos(String tipoPersona,String nombre, String apellido, String numeroidentidad, int numeroCuentaAlumno){
        super(tipoPersona,nombre,apellido,numeroidentidad);
        this.numeroCuentaAlumno = numeroCuentaAlumno;
    }

    public Alumnos(){

    }
    @Override
    public void describirPersona() {
        System.out.println("Un alumno");
    }

    @Override
    public void describirPersona2() {
        System.out.println("Numero de cuenta: "+ getNumeroCuentaAlumno());
    }


    public int getNumeroCuentaAlumno() {
        return numeroCuentaAlumno;
    }

    public void setNumeroCuentaAlumno(int numeroCuentaAlumno) {
        this.numeroCuentaAlumno = numeroCuentaAlumno;
    }


}
