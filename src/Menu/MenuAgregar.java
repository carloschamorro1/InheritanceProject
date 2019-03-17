package Menu;

import Modelos.*;
import Utilidades.LectorTeclado;

public class MenuAgregar {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();
    public int cm,ca,cc,cas,co;
    personManager pm;
    public void presentarOpciones() {
        System.out.println("\t \t \t \t Bienvenido (a)");
        System.out.println("1.............. Agregar Maestro");
        System.out.println("2.............. Agregar Alumnos");
        System.out.println("3.............. Agregar Asistentes");
        System.out.println("4.............. Agregar Oyentes");
        System.out.println("5.............. Regresar");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }


    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                if(cm == 0){
                  pm.personas.add(new Maestro("Maestro",lt.leerString("Por favor ingrese el nombre"),lt.leerString("Por favor ingrese el apellido"),
                          lt.leerString("Por favor ingrese su identidad"),lt.leerString("Por favor ingrese el titulo" ),lt.leerEntero("Por favor ingrese el numero de cuenta","numero no valido")));
                  cm++;
                }
                else
                    System.out.println("Ya existe un maestro");
                break;
            case 2:
                pm.personas.add(new Alumnos("Alumno",lt.leerString("Por favor ingrese el nombre"),
                        lt.leerString("Por favor ingrese el apellido"),lt.leerString("Por favor ingrese su identidad"),lt.leerEntero("Por favor ingrese el numero de cuenta","Numero no valido")));
                ca++;
                break;
            case 3:
                if(cas < 2){
                    pm.personas.add(new Asistentes("Asistente",lt.leerString("Por favor ingrese el nombre"), lt.leerString("Por favor ingrese el apellido"),
                            lt.leerString("Por favor ingrese su identidad"),lt.leerString("Por favor ingrese el codigo del asistente"),cc+1));
                    cas++;
                }
                else
                    System.out.println("Ya no se pueden agregar mas asistentes");
                break;
            case 4:
                if(co < 3) {
                    pm.personas.add(new Oyentes("Oyente",lt.leerString("Por favor ingrese el nombre"), lt.leerString("Por favor ingrese el apellido"),
                            lt.leerString("Por favor ingrese el numero de identidad")));
                    co++;
                }
                else
                    System.out.println("Ya no se pueden agregar mas oyentes");
                break;
            case 6:
                System.out.println("Has regresado al menu principal");
                break;
        }
    }

    public MenuAgregar(personManager pm){
        this.pm = pm;
    }
}
