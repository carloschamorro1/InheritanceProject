package Menu;

import Utilidades.LectorTeclado;

import java.util.ArrayList;
import Modelos.Persona;

public class MenuImpresion {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();
    MenuAgregar menu = new MenuAgregar();
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
                for (int i = 0; i < menu.personas.size(); i++) {
                    menu.personas.get(i).describirPersona();
                }
                break;
            case 2:
                break;
            case 3:
                System.out.println("Gracias por utilizar el programa");
                break;
        }
    }
}
