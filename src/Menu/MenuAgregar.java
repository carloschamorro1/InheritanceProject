package Menu;

import Modelos.*;
import Utilidades.LectorTeclado;

import java.util.ArrayList;

public class MenuAgregar {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();
    public int cm,ca,cc,cas,co;
    ArrayList<Persona> personas = new ArrayList<Persona>();
    Maestro maestro = new Maestro();
    public void presentarOpciones() {
        System.out.println("\t \t \t \t Bienvenido (a)");
        System.out.println("\n \t \t Carwash Fuera JOH \n");
        System.out.println("1.............. Agregar Maestro");
        System.out.println("2.............. Agregar Alumnos");
        System.out.println("3.............. Agregar Clase");
        System.out.println("4.............. Agregar Asistentes");
        System.out.println("5.............. Agregar Oyentes");
        System.out.println("6.............. Regresar");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                if(cm == 0){
                  personas.add(new Maestro(lt.leerString("Por favor ingrese el nombre"),lt.leerString("Por favor ingrese el apellido"),
                          lt.leerString("Por favor ingrese el titulo" ),lt.leerEntero("Por favor ingrese el numero de cuenta","numero no valido")));
                  cm++;
                }
                else
                    System.out.println("Ya existe un maestro");
                break;
            case 2:
                personas.add(new Alumnos(lt.leerString("Por favor ingrese el nombre"),
                        lt.leerString("Por favor ingrese el apellido"),lt.leerEntero("Por favor ingrese el numero de cuenta","Numero no valido")));
                ca++;
                break;
            case 3:
                if(cc == 0){
                    personas.add(new Clases(lt.leerString("Por favor ingrese el nombre de la clase"), lt.leerString("Por favor ingrese el horario de la clase"),
                            lt.leerString("Por favor ingrese la seccion"),lt.leerString("Por favor ingrese el numero de unidades valorativas"),
                            lt.leerString("Por favor ingrese el codigo de la clase")));
                    cc++;
                }
                else
                    System.out.println("Ya existe una clase");
                break;
            case 4:
                if(cas < 2){
                    personas.add(new Asistentes(lt.leerString("Por favor ingrese el nombre"), lt.leerString("Por favor ingrese el apellido"),
                            lt.leerString("Por favor ingrese el codigo del asistente"),cc+1));
                    cas++;
                }
                else
                    System.out.println("Ya no se pueden agregar mas asistentes");
                break;
            case 5:
                if(co < 3) {
                    personas.add(new Oyentes(lt.leerString("Por favor ingrese el nombre"), lt.leerString("Por favor ingrese el apellido"),
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
}
