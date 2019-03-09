package Menu;

import Utilidades.LectorTeclado;

public class MenuPrincipal {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();
    MenuAgregar menuAgregar = new MenuAgregar();
    MenuImpresion menuImpresion = new MenuImpresion();
    public void presentarOpciones() {
        System.out.println("\t \t \t \t Bienvenido (a)");
        System.out.println("\n \t \t Universidad Jose Cecilio del Valle \n");
        System.out.println("1.............. Agregar");
        System.out.println("2.............. Imprimir");
        System.out.println("3.............. Salir");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                menuAgregar.presentarOpciones();
                menuAgregar.procesarOpcion(menuAgregar.leerOpciones());
                break;
            case 2:

                break;
            case 3:
                System.out.println("Gracias por utilizar el programa");
                break;
        }
    }
}
