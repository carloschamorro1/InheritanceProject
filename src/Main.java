import Modelos.Alumnos;
import Modelos.Maestro;
import Modelos.Persona;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(new Alumnos("Carlos","Chamorro",2017110190));
        personas.add(new Alumnos("Carlos","Chamorro",2017110190));
        personas.add(new Maestro("Juan","rtyui","Dr",2017120565));
        personas.add(new Maestro("Juan","rtyui","Dr",2017120565));
        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).describirPersona();
        }

    }
}
