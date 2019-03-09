package Menu;

import Utilidades.LectorTeclado;

public class MenuAgregar {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();

    public void presentarOpciones() {
        System.out.println("\t \t \t \t Bienvenido (a)");
        System.out.println("\n \t \t Carwash Fuera JOH \n");
        System.out.println("1.............. Agregar Maestro");
        System.out.println("2.............. Agregar Alumnos");
        System.out.println("3.............. Agregar Clase");
        System.out.println("4.............. Agregar Asistentes");
        System.out.println("5.............. Agregar Oyentes");
        System.out.println("6.............. Salir");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.out.println("Gracias por utilizar el programa");
                break;
        }
    }
}
