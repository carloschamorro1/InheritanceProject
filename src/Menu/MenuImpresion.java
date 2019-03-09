package Menu;

import Utilidades.LectorTeclado;

public class MenuImpresion {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();

    public void presentarOpciones() {
        System.out.println("\t \t \t \t Bienvenido (a)");
        System.out.println("1.............. Imprimir Resumen");
        System.out.println("2.............. Imprimir Completo");
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
