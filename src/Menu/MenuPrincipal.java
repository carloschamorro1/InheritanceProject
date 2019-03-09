package Menu;

import Utilidades.LectorTeclado;

public class MenuPrincipal {
    public int opcion;

    LectorTeclado lt = new LectorTeclado();
    public void presentarOpciones() {
        System.out.println("\t \t \t \t Bienvenido (a)");
        System.out.println("\n \t \t Carwash Fuera JOH \n");
        System.out.println("1.............. Gestionar Clientes");
        System.out.println("2.............. Servicios");
        System.out.println("3.............. Salir");
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
                System.out.println("Gracias por utilizar el programa");
                break;
        }
    }
}
